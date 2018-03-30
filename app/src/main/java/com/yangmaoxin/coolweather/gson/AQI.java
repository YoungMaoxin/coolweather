package com.yangmaoxin.coolweather.gson;

/**
 * Created by Yang maoxin on 2018/3/29.
 */

public class AQI {

    public AQICity city;

    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
