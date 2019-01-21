package apps.boeteApp;

import model.Person;
import model.Verkeersboete;

public class VerkeersboeteApp {

    public static void main(String[] args) {

        Person piet = new Person("Johan", "123443211" );

        System.out.println(piet.getName());

        Verkeersboete boete = new Verkeersboete(piet, 99);

        System.out.println(boete.getDader().getName());

        Person ray = new Person("Ray", "2122882");

        Person[] personen = new Person[]{piet, ray};

        Person inge = new Person("Inge", "7347437");

        Verkeersboete ingesBoete = new Verkeersboete(inge, 45.00);

        inge.setBsn("8837373");

        Verkeersboete[] boetes = new Verkeersboete[]{boete, ingesBoete};
    }
}
