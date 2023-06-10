package models;

class Parameter {

    private String name;
    private String type;

    public Parameter() {

    }

    public Parameter(String name) {
        this.name = name;
    }

    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

}

