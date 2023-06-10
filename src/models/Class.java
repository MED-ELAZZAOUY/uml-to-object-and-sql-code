package models;


import java.util.ArrayList;

public class Class {
    private String name;

    private String superClass = "";

    private String type = "";
    public Class () {}
    public Class (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Class (String name, String superClass){
        this.name = name;
        this.superClass = superClass;
    }

    public Class (String name, String superClass, String type){
        this.name = name;
        this.superClass = superClass;
        this.type = type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}