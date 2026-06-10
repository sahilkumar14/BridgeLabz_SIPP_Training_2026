package BridgeLabz_SIPP_Training_2026.gcr_codebase.programming_elements.level_02;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();

        float Addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = 0;
        if(number1 > 0 ){
            division = number1 / number2;
        }else{
            System.out.print("Division by 0 is not possible");
        }

        System.out.print("the adddition, subtraction, multiplication, Division of 2 numbers "+number1 + " and "+number2 +" is "+Addition+","+subtraction+","+multiplication+","+division);

    }
}
