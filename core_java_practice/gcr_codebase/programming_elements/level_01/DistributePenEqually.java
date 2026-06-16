package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.programming_elements.level_01;

public class DistributePenEqually {
    public static void main(String[] args) {
        int totalAmountOfPen = 14;
        int totalStudent = 3;

        int notDistributedPen = totalAmountOfPen % totalStudent;
        int distributedPen = (totalAmountOfPen - notDistributedPen) / totalStudent;
        System.out.println("The Pen per student is "+distributedPen+" and the remaining pen not distributed is "+notDistributedPen);
    }
}
