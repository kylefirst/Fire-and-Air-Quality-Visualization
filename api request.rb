require 'open-uri'
require 'json'

#this is the api key that I need to use to grab the data
api_key = "58738BEF-720D-4683-BF50-11F5BFAC8566"
for i in 1...1000
 random_zip_code = rand(20000...40000)+i
 zip_toString = random_zip_code.to_s
airnow = open("http://www.airnowapi.org/aq/forecast/zipCode/?format=application/json&zipCode="+zip_toString+"&date=2016-11-18&distance=25&API_KEY=58738BEF-720D-4683-BF50-11F5BFAC8566")
read = airnow.read
	to_string = ""
	to_string << read
	puts to_string
end