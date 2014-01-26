#!/usr/bin/python
# -*- coding: utf-8 -*-

__version__ = "1.0"
__authors__ = "Jose María Alvarez"
__license__ = "MIT License <http://www.opensource.org/licenses/mit-license.php>"
__contact__ = "chema.ar@gmail.com"
__date__    = "2013-05-05"


import os
import sys
import time
import re
import urllib
from string import Template
import string
import sparql
import getopt
import collections
import itertools
from compiler.ast import flatten
import operator
import unittest
import numpy as np
from numpy import matrix
from sets import Set
import csv
import datetime
import skillranking

def create_list_from_file(filename):
    raw_list = []
    for line in open(filename):
	rawname = filter(lambda x: x in string.letters or x in string.whitespace, line)
	raw_list.append(rawname.strip()) 
    return raw_list

def create_activities_from_file(filename):
    f = open(filename, 'rb')
    reader = csv.reader(f)
    activities = []
    for row in reader:
	date = datetime.datetime(int(row[0]),int(row[1]),int(row[2]),int(row[3]),int(row[4]),int(row[5]))
	connection = row[6].strip()
	skill = row[7].strip()
	activities.append((date,connection,skill))
    return activities

if __name__ == "__main__":
	names = create_list_from_file("names.txt")
	for name in names:
		skills = create_list_from_file("test-data/"+name+"-skills.txt")
		connections = create_list_from_file("test-data/"+name+"-connections.txt")
		activities = create_activities_from_file("test-data/"+name+"-activities.txt")
		print skills
		print connections
		print activities
		spear = skillranking.Spear(activities)
                expertise_results, quality_results = spear.run(verbose=True)
