package model;

public class Person {

    private String name;
    private String bsn;

    public Person(String name, String bsn) {
        this.name = name;
        this.bsn = bsn;
    }

    public String getName() {

        return name;
    }

    public String getBsn() {

        return this.bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }
}
