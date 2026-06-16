package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.programming_elements.level_02;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseinCM = sc.nextInt();
        int heightInCM = sc.nextInt();

        double areaInSqINCH = 0.5 * (baseinCM * 2.54) * (heightInCM * 2.54);
        double areaInCM = 0.5 * baseinCM * heightInCM;

        System.out.print("the Area of the triangle in sq in is " + areaInSqINCH + " and sq cm is " + areaInCM);
        sc.close();
    }
}
