import javax.sound.midi.Soundbank;

public class Application {

    public static void main(String[] args) {

        Person tessa = new Person();
        tessa.age = 25;

        Person ingrid = new Person();
        ingrid.age = 35;


        System.out.println(tessa.age);
        System.out.println(ingrid.age);

        tessa.age++;

        System.out.println(tessa.age);
        System.out.println(ingrid.age);

        Person rene = new Person();
        rene.myShoe = new Shoe();

        rene.walk();


        int a = 5;
        int b = 3;

        MathStuff m = new MathStuff();
        System.out.println(m.square(4));

        System.out.println(rene.age);

        System.out.println(++rene.age);


        b = -b;


        String label = rene.age > 50 ? "Senior" : "Junior";

        System.out.println(label);

        System.out.println(m.getHoursAndMinutes(521));






    }
}
