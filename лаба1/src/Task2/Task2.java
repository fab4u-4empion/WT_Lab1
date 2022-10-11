package Task2;

public class Task2 {
    public static boolean itBelongs(double x, double y) {
        return (y <= 5 && y > 0 && Math.abs(x) <= 4) || (y <= 0 && y >= -3 && Math.abs(x) <= 6 );
    }
}
