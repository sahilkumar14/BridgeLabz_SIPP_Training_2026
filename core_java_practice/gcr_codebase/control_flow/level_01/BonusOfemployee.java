package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.control_flow.level_01;

import java.util.Scanner;

public class BonusOfemployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextInt();
        double yearOfService = sc.nextInt();

        double bonus = salary * (yearOfService / 100);
        
        System.out.print("the bonus amount is "+bonus);
        sc.close();
    }
}
