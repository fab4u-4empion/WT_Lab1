package Task8;

public class Task8 {
    public  static double[] mergeArrays(double[] a, double[] b) {
        double[] result = new double[a.length + b.length];
        int positionA = 0;
        int positionB = 0;

        for (int i = 0; i < result.length; i++) {
            if (positionA == a.length) {
                result[i] = b[positionB];
                positionB++;
            } else if (positionB == b.length) {
                result[i] = a[positionA];
                positionA++;
            } else if (a[positionA] > b[positionB]) {
                result[i] = b[positionB];
                positionB++;
            } else {
                result[i] = a[positionA];
                positionA++;
            }
        }
        return result;
    }
}
