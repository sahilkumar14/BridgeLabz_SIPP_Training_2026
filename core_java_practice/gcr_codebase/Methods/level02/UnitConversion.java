package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Methods.level02;
import java.util.Scanner;
public class UnitConversion {
    public class UnitConverter {

        // Yards to Feet
        public static double convertYardsToFeet(double yards) {
            double yards2feet = 3;
            return yards * yards2feet;
        }
    
        // Feet to Yards
        public static double convertFeetToYards(double feet) {
            double feet2yards = 0.333333;
            return feet * feet2yards;
        }
    
        // Meters to Inches
        public static double convertMetersToInches(double meters) {
            double meters2inches = 39.3701;
            return meters * meters2inches;
        }
    
        // Inches to Meters
        public static double convertInchesToMeters(double inches) {
            double inches2meters = 0.0254;
            return inches * inches2meters;
        }
    
        // Inches to Centimeters
        public static double convertInchesToCentimeters(double inches) {
            double inches2cm = 2.54;
            return inches * inches2cm;
        }
    }


    
    public class Main {
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter yards: ");
            double yards = sc.nextDouble();
    
            System.out.print("Enter feet: ");
            double feet = sc.nextDouble();
    
            System.out.print("Enter meters: ");
            double meters = sc.nextDouble();
    
            System.out.print("Enter inches: ");
            double inches = sc.nextDouble();
    
            System.out.println("\nConversions:");
            System.out.println("Yards to Feet = " +
                    UnitConverter.convertYardsToFeet(yards));
    
            System.out.println("Feet to Yards = " +
                    UnitConverter.convertFeetToYards(feet));
    
            System.out.println("Meters to Inches = " +
                    UnitConverter.convertMetersToInches(meters));
    
            System.out.println("Inches to Meters = " +
                    UnitConverter.convertInchesToMeters(inches));
    
            System.out.println("Inches to Centimeters = " +
                    UnitConverter.convertInchesToCentimeters(inches));
    
            sc.close();
        }
    }
}
