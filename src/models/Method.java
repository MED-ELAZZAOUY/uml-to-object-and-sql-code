package models;

import java.util.ArrayList;

public class Method {
    private String name;
    private String returnType;
    private String vsibility;

    private ArrayList<Parameter> parameters = new ArrayList<Parameter>();

    public Method () {}

    public Method(String name) {
        this.name = name;
    }

    public Method(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
    }

    public Method(String name, String returnType, String vsibility) {
        this.name = name;
        this.returnType = returnType;
        this.vsibility = vsibility;
    }

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getVsibility() {
        return vsibility;
    }

    public void setVsibility(String vsibility) {
        this.vsibility = vsibility;
    }
}
