package models;

public class Method {
    private String name;
    private String returnType;
    private String vsibility;

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
