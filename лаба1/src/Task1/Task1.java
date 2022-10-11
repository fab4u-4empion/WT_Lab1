package Task1;

public class Task1 {
    public static double calculate(double x, double y) {
        double sin = Math.sin(x + y);
        double a = 2 * x / (1 + x * x * y * y);
        return (1 + sin * sin) / (2 + Math.abs(x - a)) + x;
    }
}
