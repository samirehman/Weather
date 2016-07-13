package com.develogical;

import org.junit.Test;

import static org.junit.Assert.assertThat;


/**
 * Created by ape16 on 13/07/2016.
 */
public class HolidayWeatherForcastTest {

    @Test
    public void CheckIfForcastExistsInCache(){

        assertThat(HolidayWeatherForcast.ReadCache(), is("this"));
    }
}
