package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.control_flow.level_01;

import java.util.Scanner;

public class DivisibiltyByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = n % 5;
        if(result == 0){
            System.err.println("is the number "+n+" divisibe by 5? "+"yes");
        }else{
            System.err.println("is the number "+n+" divisibe by 5? "+"no");
        }
    }
}
