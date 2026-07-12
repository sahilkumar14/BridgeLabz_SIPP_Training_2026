package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Array.level_01;

import java.util.Scanner;

public class NumberStored {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            if (index == 10) {
                System.out.println("Array is full.");
                break;
            }

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println("\nSum = " + total);

        sc.close();
    }
}
