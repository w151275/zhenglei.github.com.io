package com.bestpay.rxandroiddemo.bean;

/**
 * Created by wuzhenglei on 2016/7/26.
 */
public class Course {
    private String name;
    private String techear;

    public Course(String name, String techear) {
        this.name = name;
        this.techear = techear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechear() {
        return techear;
    }

    public void setTechear(String techear) {
        this.techear = techear;
    }
}
