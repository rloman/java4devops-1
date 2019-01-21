package apps.printerdemo;

import model.Person;
import model.Verkeersboete;

public class PrinterApp {

    public static void main(String[] args) {

        Person p = new Person("Jansen", "1234");
        Verkeersboete vb = new Verkeersboete(p, 45.00);

        System.out.println(vb);

        // bovenstaande is identiek met:
        System.out.println(vb.toString());

        String label = "" + vb;
        // bovenstaande is identiek met: (en dat is ook netter IMHO)
        String label2 = vb.toString();

        System.out.println(label);
        System.out.println(label2);
    }
}
