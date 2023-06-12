package models;


import java.util.ArrayList;

public class Class {
    private String name;

    private String superClass = "";

    private String type = "";

    private ArrayList<Attribut> attributs = new ArrayList<Attribut>();

    private ArrayList<Method> methods= new ArrayList<Method>();

    public Class () {}
    public Class (String name){
        this.name=name;
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

    public ArrayList<Attribut> getAttributs() {
        return attributs;
    }

    public void setAttributs(ArrayList<Attribut> attributs) {
        this.attributs = attributs;
    }

    public ArrayList<Method> getMethods() {
        return methods;
    }

    public void setMethods(ArrayList<Method> methods) {
        this.methods = methods;
    }

    public String getName() {
        return name;
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