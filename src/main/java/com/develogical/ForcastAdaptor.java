package com.develogical;

import com.weather.Day;
import com.weather.Forecast;
import com.weather.Forecaster;
import com.weather.Region;

/**
 * Created by ape16 on 13/07/2016.
 */
public class ForcastAdaptor {

    Forecaster forecaster = new Forecaster();

    Forecast londonForecast = forecaster.forecastFor(Region.LONDON, Day.MONDAY);

    System.out.println("London outlook: " + londonForecast.summary());
    System.out.println("London temperature: " + londonForecast.temperature());

    Forecast edinburghForecast = forecaster.forecastFor(Region.EDINBURGH, Day.MONDAY);

    System.out.println("Edinburgh outlook: " + edinburghForecast.summary());
    System.out.println("Edinburgh temperature: " + edinburghForecast.temperature());

    public ForcastRequest PublishForcast(ForcastRequest MyForcast){

        Forecaster forecaster = new Forecaster();

        Forecast londonForecast = forecaster.forecastFor(Region.LONDON, Day.MONDAY);

    }
}
