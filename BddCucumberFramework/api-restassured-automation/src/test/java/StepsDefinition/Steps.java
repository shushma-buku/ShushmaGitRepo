package StepsDefinition;

import Controllers.Functions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.mozilla.javascript.regexp.SubString;

import java.sql.Array;
import java.util.List;


/**
 * Created by Shushma on 25/03/19.
 */
public class Steps {

    private Functions functions = Functions.getInstance();
    private static String actualPlaceName = "";
    private static String latitude_Zippo = "";
    private static String longitude_Zippo = "";
    private static String latitude_Map = "";
    private static String longitude_Map = "";

    @Given( "^baseURL as '(.*)', endPoint as '(.*)'$" )
    public void baseurlAsHttpApiZippopotamUsEndPointAsIN(String baseURL, String endPoint)
    {
       String response  = functions.getPlaceName(baseURL,endPoint);
        String[] output = response.split(":");
        actualPlaceName = output[0];
        latitude_Zippo = output[1];
        longitude_Zippo = output[2];
    }

    @When( "^Response has place name as '(.*)'$" )
    public void responseIsSuccessAndHasPlaceNameAs(String expectedPlaceName)
    {
        Assert.assertTrue("Place Name does not exist",actualPlaceName.contains(expectedPlaceName));
    }

    @Then( "^Save the details latitude and longitude$" )
    public void saveTheDetailsAnd() throws Throwable
    {
    }

    @Given( "^The baseURL as '(.*)', endPoint as '(.*)', param1 '(.*)' value '(.*)', param2 '(.*)' value '(.*)'$" )
    public void theBaseURLAsHttpWwwMapquestapiComEndPointAsGeocodingVAddressParamKeyValueAPQSzBpDouaCGPrEdGEAHlnParamLocationValueBangalore
            (String baseURL, String endPoint, String param1, String param1Value, String param2, String param2Value)
    {
        String response = functions.getPlaceName(baseURL,endPoint,param1,param1Value,param2,param2Value);
        String[] output = response.split(":");
         latitude_Map = output[0];
         longitude_Map = output[1];
    }

    @When( "^Response is success$" )
    public void responseIsSuccess() throws Throwable
    {
    }

    @Then( "^compare the details latitude and longitude fetched, to that of zippopotam results$" )
    public void compareTheDetailsLatAndLngFetchedToThatOfZippopotamResults( )
    {
        Assert.assertEquals(Float.parseFloat(latitude_Map), Float.parseFloat(latitude_Zippo), 1);
        Assert.assertEquals(Float.parseFloat(longitude_Map), Float.parseFloat(longitude_Zippo), 1);
    }
}
