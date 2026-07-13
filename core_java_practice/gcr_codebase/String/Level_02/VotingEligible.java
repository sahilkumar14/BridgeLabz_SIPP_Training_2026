package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.String.Level_02;
import java.util.Scanner;
public class VotingEligible {


    // Input ages
    public static int[] inputAges(int n) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Check voting eligibility
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            }
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Display result
    public static void display(String[][] result) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        int students = 10;

        int[] ages = inputAges(students);

        String[][] result = checkVoting(ages);

        display(result);
    }
}

