package com.lovely3x.jsonpareser.request;

import com.lovely3x.jsonpareser.bean.Person;
import com.lovely3x.jsonpareser.bean.Response;
import com.lovely3x.jsonparser.Config;
import com.lovely3x.jsonparser.matcher.AnnotationMatcher;

/**
 * Created by lovely3x on 15-7-18.
 */
public class UserRequest {

    public Response getUser() {
        Response res = new Response();
        res.isSucessful = true;
        com.lovely3x.jsonparser.model.JSONObject jo = new com.lovely3x.jsonparser.model.JSONObject(buildJSON());
        res.obj = jo.createObject(Person.class);
        return res;

    }

    private String buildJSON() {
        return "{\"id\":1001,\"sex\":0,\"friends\":[{\"id\":1002,\"sex\":1,\"friends\":[],\"name\":\"Jennifer\"},{\"id\":1003,\"sex\":1,\"friends\":[],\"name\":\"Jennifer\"},{\"id\":1004,\"sex\":1,\"friends\":[],\"name\":\"Jennifer\"}],\"name\":\"Lovely3x\",\"partner\":{\"id\":1008,\"sex\":1,\"friends\":[],\"name\":\"Jennifer\"}}";
    }
}
