package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 县信息表
 */
public class County extends DataSupport{
    //ID
    private int id;
    //县名称
    private String countyName;
    //天气ID
    private String weatherId;
    //所属市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
