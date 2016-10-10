package com.lovely3x.easyjson;

import com.lovely3x.easyjson.benas.Person;
import com.lovely3x.jsonparser.Config;
import com.lovely3x.jsonparser.model.JSONObject;
import com.lovely3x.jsonparser.source.JSONSourceImpl;

import java.io.IOException;
import java.io.InputStream;

/**
 * 支持注解方式来进行解析
 * 比如,服务器返回的的一个字段性别是 sex,但是我现在想使用 gender 来表示
 * 那么这时候注解就起作用了
 * <p>
 * Created by lovely3x on 16/10/10.
 */
public class AnnotationDemo {

    public static void main(String[] args) throws IOException {

        InputStream is = Demo.class.getResourceAsStream("Person.json");

        JSONObject jo = new JSONObject(new JSONSourceImpl(is), Config.createDefault());

        Person person = jo.createObject(Person.class);

        System.out.println(person);
    }
}
