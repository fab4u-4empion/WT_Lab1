package Runner;

import Task1.Task1;
import Task2.Task2;
import Task3.Task3;
import Task4.Task4;
import Task5.Task5;
import Task6.Task6;
import Task7.Task7;
import Task8.Task8;

import java.awt.*;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println("x = 1, y = 1: "+ Task1.calculate(1, 1));
        System.out.println("===========");

        System.out.println("\nTask 2:");
        System.out.println("(0, 0): " + Task2.itBelongs(0, 0));
        System.out.println("(2, -2): " + Task2.itBelongs(2, -2));
        System.out.println("(10, 10): " + Task2.itBelongs(10, 10));
        System.out.println("===========");

        System.out.println("\nTask 3:");
        System.out.println("[0, 5], 1:\n" + Task3.result(0, 5, 1));
        System.out.println("[3.1415, 10], 0.5:\n" + Task3.result(3.1415, 10, 0.5));
        System.out.println("===========");

        System.out.println("\nTask 4:");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 25};
        int[] b = {2, 3, 5, 7, 11, 13};
        int[] c = {4, 6, 8, 9};
        int[] d = { };
        System.out.println(Arrays.toString(a) + ": " + Task4.getPositionsOfPrimeNumbers(a));
        System.out.println(Arrays.toString(b) + ": " + Task4.getPositionsOfPrimeNumbers(b));
        System.out.println(Arrays.toString(c) + ": " + Task4.getPositionsOfPrimeNumbers(c));
        System.out.println(Arrays.toString(d) + ": " + Task4.getPositionsOfPrimeNumbers(d));
        System.out.println("===========");

        System.out.println("\nTask 5:");
        int[] t5_1 = {};
        int[] t5_2 = {1, 2, 3, 10, 4, 5, 6};
        int[] t5_3 = {4, 3, 2, 1};
        int[] t5_4 = {1, 2, 3, 4, 5};
        int[] t5_5 = {1, 3, 2, 4, 5, 6, 8, 7, 9, 10};
        int[] t5_6 = {1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(t5_1) + ": " + Task5.getCountOfRedundantMembers(t5_1));
        System.out.println(Arrays.toString(t5_2) + ": " + Task5.getCountOfRedundantMembers(t5_2));
        System.out.println(Arrays.toString(t5_3) + ": " + Task5.getCountOfRedundantMembers(t5_3));
        System.out.println(Arrays.toString(t5_4) + ": " + Task5.getCountOfRedundantMembers(t5_4));
        System.out.println(Arrays.toString(t5_5) + ": " + Task5.getCountOfRedundantMembers(t5_5));
        System.out.println(Arrays.toString(t5_6) + ": " + Task5.getCountOfRedundantMembers(t5_6));
        System.out.println("===========");

        System.out.println("\nTask 6:");
        double[] t6_1 = {1, 2, 3};
        double[] t6_2 = {1};
        double[] t6_3 = {1, 2, 10, 4, 5};
        System.out.println("[1, 2, 3]: ");
        Task6.printMatrix(Task6.getMatrix(t6_1));
        System.out.println("\n[1]: ");
        Task6.printMatrix(Task6.getMatrix(t6_2));
        System.out.println("\n[1, 2, 3, 4, 5]: ");
        Task6.printMatrix(Task6.getMatrix(t6_3));
        System.out.println("===========");

        System.out.println("\nTask 7:");
        double[] t7_1 = {-1, 2, -10, 15, -100, 5, 3, 1, 20, 15, 13, 16, 22, 33, 18, 0};
        System.out.println(Arrays.toString(t7_1) + ": ");
        Task7.sort(t7_1);
        System.out.println(Arrays.toString(t7_1));
        System.out.println("===========");

        System.out.println("\nTask 8:");
        double[] t8_1 = {1, 3, 5, 7, 9, 11, 13};
        double[] t8_2 = {2, 4, 6};
        System.out.println(Arrays.toString(Task8.mergeArrays(t8_1, t8_2)));
        System.out.println("===========");

    }
}
