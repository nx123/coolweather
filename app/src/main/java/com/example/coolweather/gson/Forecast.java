package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 实体类
 *
 * @author niexin
 * @date 2018/7/26
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
