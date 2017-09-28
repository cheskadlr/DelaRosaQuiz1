package com.delarosa.delarosaquiz1.model;

/**
 * Created by Cheska Dela Rosa on 028, 9/28/17.
 */

public class Android {
    private int androidLogo;
    private String androidName, androidVer, androidAPI, androidReleaseDate;

    public Android(int androidLogo, String androidName, String androidVer, String androidAPI, String androidReleaseDate){
        this.androidLogo = androidLogo;
        this.androidName = androidName;
        this.androidVer = androidVer;
        this.androidAPI = androidAPI;
        this.androidReleaseDate = androidReleaseDate;
    }

    public int getAndroidLogo(){ return androidLogo; }
    public void setAndroidLogo(int androidLogo){ this.androidLogo = androidLogo; }

    public String getAndroidName(){ return androidName; }
    public void setAndroidName(String androidName){ this.androidName = androidName; }

    public String getAndroidVer(){ return androidVer; }
    public void setAndroidVer(String androidVer){ this.androidVer = androidVer; }

    public String getAndroidAPI(){ return androidAPI; }
    public void setAndroidAPI(String androidAPI){ this.androidAPI = androidAPI; }

    public String getAndroidReleaseDate(){ return androidReleaseDate; }
    public void setAndroidReleaseDate(String androidReleaseDate){ this.androidReleaseDate = androidReleaseDate; }
}
