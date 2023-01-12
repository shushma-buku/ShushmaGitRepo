package Controllers;

import javax.xml.namespace.QName;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import java.util.HashMap;

public class WeatherDetailsByWoeidController
{
    public String returnMinMaxTempByWoeid(String woeid)
    {
      Response response = (Response) Service.create(QName.valueOf("https://www.metaweather.com/api/location/"+woeid+"/"));
      response.getContext();
      return null;
    }
}
