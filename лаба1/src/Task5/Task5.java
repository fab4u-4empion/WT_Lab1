package Task5;

public class Task5 {

    public static int getCountOfRedundantMembers(int[] array) {

        if (array.length < 2)
            return 0;

        int[] lengthOfSubsequence = new int[array.length];

        for (int j = 1; j < array.length; j++)
            for (int k = 0; k < j; k++)
                if (array[j] > array[k])
                    if (lengthOfSubsequence[j] <= lengthOfSubsequence[k])
                        lengthOfSubsequence[j] = lengthOfSubsequence[k] + 1;

        int maxLength = 0;
        for (int length : lengthOfSubsequence)
            if (length > maxLength)
                maxLength = length;

        return array.length - maxLength - 1;
    }
}
