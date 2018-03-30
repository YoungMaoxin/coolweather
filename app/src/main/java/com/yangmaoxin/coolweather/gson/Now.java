package com.yangmaoxin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.jar.Manifest;

/**
 * Created by Yang maoxin on 2018/3/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
