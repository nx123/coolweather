package com.example.coolweather.db;

/**
 * 省份的实体类
 *
 * @author niexin
 * @date 2018/7/25
 */

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    private int id;

    private String provinceName;//省份的名字

    private int provinceCode;//省份的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
