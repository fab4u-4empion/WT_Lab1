package Task3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    private static String getTable(ArrayList<ArrayList<Double>> resultArray) {
        StringBuilder result = new StringBuilder();
        resultArray.forEach(e -> result
                .append(e.get(0))
                .append(" === ")
                .append(e.get(1))
                .append("\n")
        );
        return result.toString();
    }

    private static ArrayList<ArrayList<Double>> calculate(double rangeStart, double rangeEnd, double step) {
        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (double i = rangeStart; i <= rangeEnd; i += step) {
            ArrayList<Double> tempResult = new ArrayList<>();
            tempResult.add(i);
            tempResult.add(Math.tan(i));
            result.add(tempResult);
        }
        return result;
    }

    public static String result(double rangeStart, double rangeEnd, double step) {
        return getTable(calculate(rangeStart, rangeEnd, step));
    }
}
