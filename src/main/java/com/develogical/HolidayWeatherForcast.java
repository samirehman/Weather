package com.develogical;

import java.util.ArrayList;

/**
 * Created by ape16 on 13/07/2016.
 */
public class HolidayWeatherForcast {

        list <ForcastRequest> WeatherForcast = new ArrayList<ForcastRequest>();


        public void ShowForcast(ForcastRequest Forcast){

            System.out.println("The Region Requested: "+Forcast.RequestRegion);
            System.out.println("The Day Requested: "+Forcast.RequestDay);
            System.out.println("The forcast is : "+Forcast.RegionForcast);
            System.out.println("The Region Requested: "+Forcast.RegionTemperature);
        }

}
