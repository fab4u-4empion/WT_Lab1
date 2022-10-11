package Task4;

import java.util.ArrayList;

public class Task4 {

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    static public String getPositionsOfPrimeNumbers(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++)
            if (isPrime(array[i]))
                result.add(i + 1);
        return result.toString();
    }
}
