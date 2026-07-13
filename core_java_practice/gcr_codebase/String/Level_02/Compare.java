package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.String.Level_02;
import java.util.Scanner;
public class Compare {

    // Find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Split without using split()
    public static String[] splitWords(String str) {

        int len = findLength(str);

        // Count words
        int words = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        // Store space indexes
        int[] spaces = new int[words + 1];
        spaces[0] = -1;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaces[k++] = i;
            }
        }

        spaces[k] = len;

        // Extract words
        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";

            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                word += str.charAt(j);
            }

            result[i] = word;
        }

        return result;
    }

    // Compare two String arrays
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    // Print array
    public static void printArray(String[] arr) {
        for (String word : arr) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] manual = splitWords(text);

        // Built-in split
        String[] builtin = text.split(" ");

        System.out.println("\nManual Split:");
        printArray(manual);

        System.out.println("\nBuilt-in Split:");
        printArray(builtin);

        boolean same = compareArrays(manual, builtin);

        System.out.println("\nAre both arrays same? " + same);

        sc.close();
    }
}
