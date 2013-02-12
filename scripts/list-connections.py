import time, os, simplejson
import urlparse
from linkedin_core_auth import *

if __name__ == "__main__":
	# Get authorization set up and create the OAuth client
	client = get_auth()

	#print "\n********A basic user profile call with field selectors going into a subresource********"
	#api_url = "http://api.linkedin.com/v1/people/~:(first-name,last-name,skills,positions:(company:(name)))"
	#response = make_request(client,api_url)
	#print response


	print "\n********Get the profile in JSON using query parameter********"
	api_url="http://api.linkedin.com/v1/people/~/connections:(id,skills,first-name,headline,specialties,positions,public-profile-url)?format=xml&count=1"
	response = make_request(client,api_url)
	print response
	#connections_data = simplejson.loads(response)
	#print connections_data.values()[0]
	#print connections_data.values()[1]
	#print connections_data.values()[2]
	#connections = []
	#for conn in connections_data.values()[3]:
	#	print conn
	
	#api_url = "http://api.linkedin.com/v1/people/~:(first-name,last-name,skills,positions:(company:(name)))"
	#response = make_request(client,api_url)
	



	#print "\n********A basic user profile call into a subresource return data in JSON********"
	#api_url = "https://api.linkedin.com/v1/people/~/connections:(first-name,last-name,headline)?format=json"
	#response = make_request(client,api_url)
	#print response


	#print "\n********A more complicated example using postings into groups********"
	#api_url = "http://api.linkedin.com/v1/groups/3297124/posts:(id,category,creator:(id,first-name,last-name),title,summary,creation-timestamp,site-group-post-url,comments,likes)"
	#response = make_request(client,api_url)



