package model;

public class Verkeersboete {

    private double bedrag; // field, instance variable of attribute
    private Person dader; // fields

    // constructor!!!
    public Verkeersboete(Person dader, double bedrag) {
        this.dader = dader;
        this.bedrag = bedrag;
    }

    public Person getDader() {
        return dader;
    }

    public String toString() {
        return "Dit is een boete voor: "+dader.getName()+" en die bedraagt: "+this.bedrag;
    }
}
