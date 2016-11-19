
import googlemaps

key = 'AIzaSyAyov_YrE4tVc_ONvycn6-zetUWNstJW0U'

client = googlemaps.Client(key)

loc =  (-33.86746, 151.207090)

zip = '20740'

geocode_result = client.geocode(zip)


"""generates coordinate according to zipcode"""
coordinate = (geocode_result[0]['geometry']['location']['lat'],geocode_result[0]['geometry']['location']['lng'])

"""find hospitals nearby"""
hospital = client.places('hospital',location=coordinate,radius=100)


print(hospital)

