package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Methods.level02;

public class Main {
        // Generate random 4-digit numbers
        public static int[] generate4DigitRandomArray(int size) {
    
            int[] arr = new int[size];
    
            for (int i = 0; i < size; i++) {
                arr[i] = (int)(Math.random() * 9000) + 1000;
            }
    
            return arr;
        }
    
        // Find Average, Minimum and Maximum
        public static double[] findAverageMinMax(int[] numbers) {
    
            double sum = 0;
    
            int min = numbers[0];
            int max = numbers[0];
    
            for (int i = 0; i < numbers.length; i++) {
    
                sum += numbers[i];
    
                min = Math.min(min, numbers[i]);
                max = Math.max(max, numbers[i]);
            }
    
            double average = sum / numbers.length;
    
            return new double[]{average, min, max};
        }
    
        public static void main(String[] args) {
    
            int[] numbers = generate4DigitRandomArray(5);
    
            System.out.println("Generated Numbers:");
    
            for (int num : numbers) {
                System.out.print(num + " ");
            }
    
            double[] result = findAverageMinMax(numbers);
    
            System.out.println("\n\nAverage = " + result[0]);
            System.out.println("Minimum = " + (int)result[1]);
            System.out.println("Maximum = " + (int)result[2]);
        }
    }

