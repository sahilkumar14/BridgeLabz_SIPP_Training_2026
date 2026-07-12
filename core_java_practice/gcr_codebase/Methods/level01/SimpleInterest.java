package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Methods.level01;

import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output
        System.out.println("\nThe Simple Interest is " + simpleInterest
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time + ".");

        sc.close();
    }
}
