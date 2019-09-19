package com.example.amercombiefitchtestcode.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageDataPojo {


    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("backgroundImage")
    @Expose
    public String backgroundImage;
    @SerializedName("content")
    @Expose
    public List<ContentPojo> content = null;
    @SerializedName("promoMessage")
    @Expose
    public String promoMessage;
    @SerializedName("topDescription")
    @Expose
    public String topDescription;
    @SerializedName("bottomDescription")
    @Expose
    public String bottomDescription;

}
