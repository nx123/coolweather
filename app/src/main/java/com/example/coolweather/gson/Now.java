package com.example.coolweather.gson;
/**
 * 实体类
 *
 * @author niexin
 * @date 2018/7/26
 */

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")

    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
