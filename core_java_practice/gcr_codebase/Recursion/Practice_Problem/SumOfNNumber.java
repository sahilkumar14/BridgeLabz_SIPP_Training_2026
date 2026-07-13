package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Recursion.Practice_Problem;

public class SumOfNNumber {
    public static int SUM(int n){
        if(n == 1) return 1;
        return n + SUM(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SUM(5));
    }
}
