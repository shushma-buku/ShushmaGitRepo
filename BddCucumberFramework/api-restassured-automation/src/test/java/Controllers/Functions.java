package Controllers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.lang.reflect.Array;

import static io.restassured.RestAssured.given;

/**
 * Created by Shushma on 25/03/19.
 */
public class Functions
{
    private Functions() {
    }

    public static Functions getInstance()
    {
        return SingletonHelper.INSTANCE;
    }


    public String getPlaceName(String baseURL, String endPoint)
    {
        RestAssured.baseURI=baseURL;

        Response response =
                given().when().
               get(endPoint);

        JsonPath jsonPathEvaluator = response.jsonPath();

        String placeName = jsonPathEvaluator.get("places").toString();
        String latitude = jsonPathEvaluator.get("places[6].latitude").toString();
        String longitude = jsonPathEvaluator.get("places[6].longitude").toString();

        return placeName+":"+latitude+":"+longitude ;
    }



    public String getPlaceName(String baseURL, String endPoint, String param1, String param1Value, String param2, String param2Value)
    {
        RestAssured.baseURI=baseURL;

        Response response =
                given().
                        headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                        param(param1,param1Value).
                        param(param2,param2Value).
                        when().
                        get(endPoint).
                        then().contentType(ContentType.JSON).extract().response();

        JsonPath jsonPathEvaluator = response.jsonPath();

        String latitude = jsonPathEvaluator.get("results[0].locations[1].displayLatLng.lat").toString();
        String longitude = jsonPathEvaluator.get("results[0].locations[1].displayLatLng.lng").toString();

        return latitude+":"+longitude ;
    }

    private static class SingletonHelper
    {
        private static final Functions INSTANCE = new Functions();
    }
}