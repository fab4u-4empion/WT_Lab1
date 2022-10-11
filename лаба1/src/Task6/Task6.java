package Task6;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.printf("%.2f ", matrix[i][j]);
            System.out.println();
        }
    }

    public static double[][] getMatrix(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                matrix[i][j] = array[(j + i) % array.length];
        return matrix;
    }
}
