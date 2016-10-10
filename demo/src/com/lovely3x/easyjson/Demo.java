package com.lovely3x.easyjson;

import com.lovely3x.easyjson.benas.Class;
import com.lovely3x.easyjson.benas.School;
import com.lovely3x.easyjson.benas.Student;
import com.lovely3x.jsonparser.Config;
import com.lovely3x.jsonparser.model.JSONObject;
import com.lovely3x.jsonparser.source.JSONSourceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by lovely3x on 16/10/10.
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        Demo demo = new Demo();

        //解析json
        demo.deserializeJson();

        //序列化json
        demo.serializeJson();
    }

    private void deserializeJson() {
        InputStream is = null;
        try {
            is = Demo.class.getResourceAsStream("School.json");

            //new JSONSourceImpl(is), Config.createDefault()

            String jsonStr = "{\"name\":\"重庆大学\",\"classes\":[{\"id\":1,\"name\":\"一班\",\"students\":[{\"name\":\"张三\",\"age\":24,\"sex\":1,\"married\":true}]}]}";
            JSONObject jo = new JSONObject(jsonStr);
            School school = jo.createObject(School.class);

            System.out.println(school);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private void serializeJson() {

        School school = new School(
                "南山幼儿园",
                Collections.singletonList(
                        new Class(1, "大班", Collections.singletonList(
                                new Student("张三", 24, 1, true)))));

        JSONObject jo = new JSONObject(school);

        System.out.print(jo);
    }
}
