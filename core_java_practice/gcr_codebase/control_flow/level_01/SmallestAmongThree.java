package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.control_flow.level_01;

import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if(number1 < number2 && number1 < number3){
            System.err.println("Is the first number the smallest? "+"yes");
        }else{
            System.err.println("Is the first number the smallest? "+"No");
        }
        sc.close();
    }
    
}
