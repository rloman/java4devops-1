public class MathStuff {


    public int square(int n) { // instance method
        return n * n;
    }

    public String getHoursAndMinutes(int minutes) {
        int hours = minutes / 60;
        int min = minutes % 60;

        return hours+":"+min;
    }
}
