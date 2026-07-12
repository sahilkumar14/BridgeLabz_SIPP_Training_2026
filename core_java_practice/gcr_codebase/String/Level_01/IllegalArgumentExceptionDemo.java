package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.String.Level_01;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
        // Method to generate the exception
        public static void generateException(String text) {
    
            // start index > end index
            System.out.println(text.substring(5, 2));
        }
    
        // Method to handle the exception
        public static void handleException(String text) {
    
            try {
                System.out.println(text.substring(5, 2));
            }
            catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught!");
                System.out.println(e.getMessage());
            }
            catch (RuntimeException e) {
                System.out.println("Runtime Exception caught!");
                System.out.println(e.getClass().getSimpleName());
                System.out.println(e.getMessage());
            }
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
    
            // Uncomment to generate the exception
            //generateException(text);
    
            // Refactored code to handle the exception
            handleException(text);
    
            sc.close();
        }
    }

