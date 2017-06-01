package com.coolweathertest.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public class Basic {

    //当java对象中的字段名字与json对象中的名字不一样时，用这个注解的方式建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherid;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
