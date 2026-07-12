package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Array.Level_02;

import java.util.Scanner;

public class StudentGrade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // rows = students, columns = subjects
        // 0 = Physics, 1 = Chemistry, 2 = Maths
        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input Marks
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks of Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Enter again!");
                i--;
                continue;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Display Result
        System.out.println("\n----------------------------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-12s %-6s%n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-10d %-10d %-10d %-12.2f %-6c%n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close();
    }
}

