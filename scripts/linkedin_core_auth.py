import oauth2 as oauth
import httplib2
import time, os, simplejson
import urlparse
import BaseHTTPServer 
from xml.etree import ElementTree as ET

consumer_key    =   'nfm8uw34piu1'
consumer_secret =   'VQ8qfOcMdyUMNwvK'

request_token_url = 'https://api.linkedin.com/uas/oauth/requestToken?scope=r_basicprofile+r_fullprofile+r_network+rw_groups+r_emailaddress'
access_token_url =  'https://api.linkedin.com/uas/oauth/accessToken'
authorize_url =     'https://api.linkedin.com/uas/oauth/authorize'

config_file   = '.service.dat'

http_status_print = BaseHTTPServer.BaseHTTPRequestHandler.responses
 

def get_auth():
	consumer = oauth.Consumer(consumer_key, consumer_secret)
	client = oauth.Client(consumer)

	try:
		filehandle = open(config_file)

	except IOError as e:
		filehandle = open(config_file,"w")
		print("We don't have a service.dat file, so we need to get access tokens!");
		content = make_request(client,request_token_url,{},"Failed to fetch request token","POST")

		request_token = dict(urlparse.parse_qsl(content))
		print "Go to the following link in your browser:"
		print "%s?oauth_token=%s" % (authorize_url, request_token['oauth_token'])

		oauth_verifier = raw_input('What is the PIN? ')

		token = oauth.Token(request_token['oauth_token'],
		request_token['oauth_token_secret'])
		token.set_verifier(oauth_verifier)
		client = oauth.Client(consumer, token)

		content = make_request(client,access_token_url,{},"Failed to fetch access token","POST")

		access_token = dict(urlparse.parse_qsl(content))

		token = oauth.Token(
			key=access_token['oauth_token'],
			secret=access_token['oauth_token_secret'])

		client = oauth.Client(consumer, token)
		simplejson.dump(access_token,filehandle)

	else:
		config = simplejson.load(filehandle)
		if ("oauth_token" in config and "oauth_token_secret" in config):
			token = 	oauth.Token(config['oauth_token'],
	    				config['oauth_token_secret'])
			client = oauth.Client(consumer, token)
		else:
			print("We had a .service.dat file, but it didn't contain a token/secret?")
			exit()
	return client

# Simple oauth request wrapper to handle responses and exceptions
def make_request(client,url,request_headers={},error_string="Failed Request",method="GET",body=None):
	if body:
		resp,content = client.request(url, method, headers=request_headers, body=body)
	else:
		resp,content = client.request(url, method, headers=request_headers)
	print resp.status

	if resp.status >= 200 and resp.status < 300:
		return content
	elif resp.status >= 500 and resp.status < 600:
		error_string = "Status:\n\tRuh Roh! An application error occured! HTTP 5XX response received."
		log_diagnostic_info(client,url,request_headers,method,body,resp,content,error_string)

	else:
		status_codes = {403: "\n** Status:\n\tA 403 response was received. Usually this means you have reached a throttle limit.",
						401: "\n** Status:\n\tA 401 response was received. Usually this means the OAuth signature was bad.",
						405: "\n** Status:\n\tA 405 response was received. Usually this means you used the wrong HTTP method (GET when you should POST, etc).",
						400: "\n** Status:\n\tA 400 response was received. Usually this means your request was formatted incorrectly or you added an unexpected parameter.",
						404: "\n** Status:\n\tA 404 response was received. The resource was not found."}
		if resp.status in status_codes:
			log_diagnostic_info(client,url,request_headers,method,body,resp,content,status_codes[resp.status])
		else:
			log_diagnostic_info(client,url,request_headers,method,body,resp,content,http_status_print[resp.status][1])

