package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.String.Level_01;


import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert text to lowercase using ASCII values
    public static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result += ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // User-defined lowercase conversion
        String myLowerCase = convertToLowerCase(text);

        // Built-in lowercase conversion
        String builtInLowerCase = text.toLowerCase();

        // Compare both strings
        boolean isSame = compareStrings(myLowerCase, builtInLowerCase);

        // Display results
        System.out.println("\nLowercase using user-defined method : " + myLowerCase);
        System.out.println("Lowercase using built-in method     : " + builtInLowerCase);
        System.out.println("Are both strings equal?             : " + isSame);

        sc.close();
    }
}

