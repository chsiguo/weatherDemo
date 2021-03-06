package com.example.chengsiguo.weatherdemo.GSON;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lenovo on 2018/7/19.
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
