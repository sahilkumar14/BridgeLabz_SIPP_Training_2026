package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Methods.level01;

import java.util.Scanner;

public class Handshakes {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.out.println("Number of students cannot be negative.");
            return;
        }

        // Calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Output
        System.out.println("Maximum number of possible handshakes = " + handshakes);

        sc.close();
    }
}
