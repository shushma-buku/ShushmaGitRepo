$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeDetailsComparion.feature");
formatter.feature({
  "line": 1,
  "name": "Comparison of the details of a place between two websites",
  "description": "",
  "id": "comparison-of-the-details-of-a-place-between-two-websites",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verifying the postcode of a place with \u0027zippopotam.us\u0027 and save the details",
  "description": "",
  "id": "comparison-of-the-details-of-a-place-between-two-websites;verifying-the-postcode-of-a-place-with-\u0027zippopotam.us\u0027-and-save-the-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "baseURL as \u0027http://api.zippopotam.us\u0027, endPoint as \u0027/IN/560001\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Response has place name as \u0027Vidhana Soudha\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Save the details latitude and longitude",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://api.zippopotam.us",
      "offset": 12
    },
    {
      "val": "/IN/560001",
      "offset": 52
    }
  ],
  "location": "Steps.baseurlAsHttpApiZippopotamUsEndPointAsIN(String,String)"
});
formatter.result({
  "duration": 4367628094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vidhana Soudha",
      "offset": 28
    }
  ],
  "location": "Steps.responseIsSuccessAndHasPlaceNameAs(String)"
});
formatter.result({
  "duration": 2747311,
  "status": "passed"
});
formatter.match({
  "location": "Steps.saveTheDetailsAnd()"
});
formatter.result({
  "duration": 32717,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Get the details of a place with \u0027Mapquest’s Geocoding API\u0027  and compare with \u0027zippopotam.us\u0027 results",
  "description": "",
  "id": "comparison-of-the-details-of-a-place-between-two-websites;get-the-details-of-a-place-with-\u0027mapquest’s-geocoding-api\u0027--and-compare-with-\u0027zippopotam.us\u0027-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "The baseURL as \u0027http://www.mapquestapi.com/\u0027, endPoint as \u0027geocoding/v1/address\u0027, param1 \u0027key\u0027 value \u0027aPQ5Sz6bp5DouaC487GPr6Ed4gE9aHln\u0027, param2 \u0027location\u0027 value \u0027Bangalore\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Response is success",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "compare the details latitude and longitude fetched, to that of zippopotam results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.mapquestapi.com/",
      "offset": 16
    },
    {
      "val": "geocoding/v1/address",
      "offset": 59
    },
    {
      "val": "key",
      "offset": 90
    },
    {
      "val": "aPQ5Sz6bp5DouaC487GPr6Ed4gE9aHln",
      "offset": 102
    },
    {
      "val": "location",
      "offset": 145
    },
    {
      "val": "Bangalore",
      "offset": 162
    }
  ],
  "location": "Steps.theBaseURLAsHttpWwwMapquestapiComEndPointAsGeocodingVAddressParamKeyValueAPQSzBpDouaCGPrEdGEAHlnParamLocationValueBangalore(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2958469308,
  "status": "passed"
});
formatter.match({
  "location": "Steps.responseIsSuccess()"
});
formatter.result({
  "duration": 30333,
  "status": "passed"
});
formatter.match({
  "location": "Steps.compareTheDetailsLatAndLngFetchedToThatOfZippopotamResults()"
});
formatter.result({
  "duration": 140060,
  "status": "passed"
});
});