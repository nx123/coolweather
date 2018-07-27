package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 实体类
 *
 * @author niexin
 * @date 2018/7/26
 */
public class Basic {
    @SerializedName("city")//让JSON字段和Java字段之间建立映射联系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
