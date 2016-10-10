package com.lovely3x.easyjson.benas;

import com.lovely3x.jsonparser.annotations.JSON;

/**
 * Created by lovely3x on 16/10/10.
 */
public class Person {

    private String name;

    private int age;

    /**
     * 这里的注解是 JSON 表示单个注解
     * 如果这里是一个对象类型的话就需要 注解 JSONObject
     * 如果这里是一个列表类型的话就需要 注解 JSONArray
     */
    @JSON("sex")
    private int gender;

    private boolean married;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", married=" + married +
                '}';
    }
}
