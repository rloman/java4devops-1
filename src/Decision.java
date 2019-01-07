public class Decision {


    public int max(int a, int b) { // oef: met 3 getallen
        if (a > b) {
            System.out.println("Returning a");
            return a;
        } else {
            System.out.println("Returning b");
            return b;
        }
    }


    public String label(int a) {
        String result = "";
        switch (a) {

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
