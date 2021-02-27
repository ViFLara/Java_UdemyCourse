package udemy.course.exercise4;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dp, double total_dollars) {
        total_dollars += total_dollars * IOF * dp;
        return total_dollars ;
    }
}
