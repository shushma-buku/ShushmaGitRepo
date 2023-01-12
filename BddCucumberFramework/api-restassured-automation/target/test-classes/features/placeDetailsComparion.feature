Feature: Comparison of the details of a place between two websites

  Scenario: Verifying the postcode of a place with 'zippopotam.us' and save the details
    Given baseURL as 'http://api.zippopotam.us', endPoint as '/IN/560001'
    When Response has place name as 'Vidhana Soudha'
    Then Save the details latitude and longitude

  Scenario: Get the details of a place with 'Mapquest’s Geocoding API'  and compare with 'zippopotam.us' results

    Given The baseURL as 'http://www.mapquestapi.com/', endPoint as 'geocoding/v1/address', param1 'key' value 'aPQ5Sz6bp5DouaC487GPr6Ed4gE9aHln', param2 'location' value 'Bangalore'
    When Response is success
    Then compare the details latitude and longitude fetched, to that of zippopotam results