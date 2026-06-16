package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.control_flow.level_01;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder oddstr = new StringBuilder();
        StringBuilder evenstr = new StringBuilder();

        for(int i = 0; i<n;i++){
            if(i%2==0){
                evenstr.append(i + " ");
            }else{
                oddstr.append(i + " ");
            }
        }

        System.out.print("even number between 1 to n: "+evenstr.toString().trim());
        System.out.println("Odd number between 1 to n: "+oddstr.toString().trim());
        sc.close();
    }
}
