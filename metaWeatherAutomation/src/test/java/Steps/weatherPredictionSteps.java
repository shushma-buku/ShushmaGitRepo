package Steps;

import Controllers.LocationByCityController;
import Controllers.WeatherDetailsByWoeidController;
import Data.weatherData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class weatherPredictionSteps
{

    @Autowired
    LocationByCityController locationByCityController;

    @Autowired
    WeatherDetailsByWoeidController weatherDetailsByWoeidController;

    @Autowired
    weatherData weatherData;

        @Given( "The (.*) of which we need weather" )
        public void theCityOfWhichWeNeedWeather(String city)
        {
            weatherData.Weiod = locationByCityController.fetchWoeidByCity(city);
        }

    @When( "The woeid of the City is fetched by City" )
    public void theWoeidOfTheCityIsFetchedByCity()
    {
         System.out.println(weatherData.Weiod);
    }

    @Then( "print min_tem and max_temp with score >= (.*)" )
    public void printMin_temAndMax_tempWithScoreScore(String discount)
    {
        System.out.println("Min Temp"+weatherData.minTemp+" Max Temp"+weatherData.maxTemp);

    }

}
