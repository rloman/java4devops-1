package language;

public class Loops {

    public static void main(String[] args) {
        // for
        for(int i = 0;i<10;i++) {
            System.out.println(i);
        }

        // while
        int a = 15;
        while(a < 20) {
            System.out.println(a++);
        }

        // do ... while
        a = 100;
        do {
            System.out.println(a);
            a++;
        }
        while(a < 50);

        for( int i = 1;i<20;i++) {
           if(i != 13) {
               System.out.println(i);
           }
        }

        /*
        while(true) {
            // forever
        }
        */

        // Zoek de String Rome in de plaatsnamen
        String[] names = {"Almelooo", "Groningen", "Utrecht", "Rome", "Venice", "Amsterdam", "Enschede"};
        String destination = "Rome";
        int index = 0;
        boolean found = false;
        for(;;) { // for ever
            if(names[index].equals(destination)){
                found = true;
                break;
            }
            index++;
        }

        System.out.println("Gevonden is: "+found);
    }

}
