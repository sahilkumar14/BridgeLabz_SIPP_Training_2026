package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Array.Level_02;
import java.util.Scanner;
public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input details of 10 employees
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // Repeat the same employee
                continue;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display employee details
        System.out.println("\n---------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-10s %-12s %-12s%n",
                "Employee", "Old Salary", "Bonus", "New Salary", "Years");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12.2f %-10.2f %-12.2f %-12.1f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i], yearsOfService[i]);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);

        sc.close();
    }
}

