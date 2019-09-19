package com.example.amercombiefitchtestcode.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentPojo {

    @SerializedName("target")
    @Expose
    public String target;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("elementType")
    @Expose
    public String elementType;

}
