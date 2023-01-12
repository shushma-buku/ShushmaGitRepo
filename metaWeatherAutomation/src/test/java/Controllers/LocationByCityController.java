package Controllers;

import org.codehaus.plexus.component.annotations.Component;

import javax.xml.namespace.QName;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import java.util.HashMap;

public class LocationByCityController
{
    public int fetchWoeidByCity(String city)
    {
        Response response = (Response) Service.create(QName.valueOf("https://www.metaweather.com/api/location/search/?query="+city));
        System.out.println(response.getContext());
       // return response;
        return 0;
    }
}
