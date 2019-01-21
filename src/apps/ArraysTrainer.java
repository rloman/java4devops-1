package apps;

public class ArraysTrainer {

    public static void main(String[] args) {
        int[] numbers = new int[] {15,18,21};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        int[] numbersAgain = {15, 18,21};

        // enhanced for (uitbreiding op zojuist) :-) // for each
        System.out.println("For each =>");  // handige manier
        for(int element : numbers) {
            System.out.println(element);
        }

        // basic for // complexer

        System.out.println("Basic for over an array =>");  // boekhouder manier :-)
        for(int i = 0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        int arraySize = 15;

        float decimalen[] = new float[arraySize];


        String[] names = {"Rene", "Monique", "Albert"};


        for(String x: names) {
            System.out.println(x);
        }




    }
}
