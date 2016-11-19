require 'open-uri'
require 'json'

#this is the api key that I need to use to grab the data
api_key = "58738BEF-720D-4683-BF50-11F5BFAC8566"
airnow = open("http://www.airnowapi.org/aq/forecast/zipCode/?format=application/json&zipCode=20002&date=2016-11-18&distance=25&API_KEY=58738BEF-720D-4683-BF50-11F5BFAC8566")
read = airnow.read
puts read