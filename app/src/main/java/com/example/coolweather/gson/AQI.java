package com.example.coolweather.gson;

/**
 * 实体类
 *
 * @author niexin
 * @date 2018/7/26
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
