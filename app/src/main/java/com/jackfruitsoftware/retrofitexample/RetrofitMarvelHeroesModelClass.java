package com.jackfruitsoftware.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class RetrofitMarvelHeroesModelClass {
    @SerializedName("name")
    private String name;

    @SerializedName("realname")
    private String realName;

    @SerializedName("firstappearance")
    private String firstAppareance;

    @SerializedName("createdby")
    private String createdby;

    @SerializedName("imageurl")
    private String imageurl;

    @SerializedName("bio")
    private String bio;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFirstAppareance() {
        return firstAppareance;
    }

    public void setFirstAppareance(String firstAppareance) {
        this.firstAppareance = firstAppareance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
