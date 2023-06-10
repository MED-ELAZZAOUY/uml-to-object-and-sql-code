package models;

public class Attribut {
    private String name;
    private String type;
    private String visibity;
    private String valeur;

    public Attribut() {}
    public Attribut(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Attribut(String name, String type, String visibity) {
        this.name = name;
        this.type = type;
        this.visibity = visibity;
    }

    public Attribut(String name, String type, String visibity, String valeur) {
        this.name = name;
        this.type = type;
        this.visibity = visibity;
        this.valeur = valeur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisibity() {
        return visibity;
    }

    public void setVisibity(String visibity) {
        this.visibity = visibity;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
