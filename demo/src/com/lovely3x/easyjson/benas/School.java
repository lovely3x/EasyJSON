package com.lovely3x.easyjson.benas;

import java.util.List;

/**
 * Created by lovely3x on 16/10/10.
 */
public class School {

    private String name;

    private List<Class> classes;

    public School() {
    }

    public School(String name, List<Class> classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
