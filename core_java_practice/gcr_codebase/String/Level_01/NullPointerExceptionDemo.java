package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.String.Level_01;

public class NullPointerExceptionDemo {
        // Method to generate NullPointerException
        public static void generateException() {
            String text = null;
    
            // This will throw NullPointerException
            System.out.println(text.length());
        }
    
        // Method to handle NullPointerException
        public static void handleException() {
            String text = null;
    
            try {
                System.out.println(text.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught!");
                System.out.println("Message: " + e.getMessage());
            }
        }
    
        public static void main(String[] args) {
    
            // Uncomment this method to see the exception
            //generateException();
    
            // Refactored code: Handle the exception
            handleException();
        }
    }

