package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.programming_elements.level_02;

import java.util.Scanner;

public class CalculateSideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        int lengthOfSide = perimeter / 4;

        System.out.print("The length of the side is "+lengthOfSide+" whose perimeter is "+perimeter);
        sc.close();
    }
}
