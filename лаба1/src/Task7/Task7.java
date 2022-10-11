package Task7;

public class Task7 {

    public static void sort(double[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] <= array[i])
                i++;
            else {
                array[i - 1] = array[i - 1] + array[i];
                array[i] = array[i - 1] - array[i];
                array[i - 1] = array[i - 1] - array[i];
                if (i > 1) i--;
            }
        }
    }
}
