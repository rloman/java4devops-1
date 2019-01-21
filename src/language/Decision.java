package language;

public class Decision {

    public static void main(String[] args) {
        int age = 14;
        if (age > 12) {
            System.out.println("U bent 13+");
            System.out.println("Welkom bij de tiener club");
        }
        else {
            System.out.println("U bent onder de 13 jaar");
        }
    }


    public int max(int a, int b) { // oef: met 3 getallen
        if (a > b) {
            System.out.println("Returning a");
            return a;
        } else {
            System.out.println("Returning b");
            return b;
        }
    }


    public String label(int age) {
        String result = "";
        long b = 0L;
        String firstName = "Tessa";
        final String choosenName = "Willem";
        switch (firstName) {
            case "Tessa":

                break;

            case "Laura":
                break;

            case choosenName:

                break;
        }

        switch (age) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                result = "Peuter";
                break;
            case 5:
            case 6:
                result = "Kleuter";
                break;

            case 7:
                result = "Schoolkind";
                break;

            default:
                result = "Unknown";
                break;
        }

        return result;
    }

}
