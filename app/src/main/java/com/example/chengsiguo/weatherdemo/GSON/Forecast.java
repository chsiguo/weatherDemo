package com.example.chengsiguo.weatherdemo.GSON;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2018/7/19.
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature {
        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
