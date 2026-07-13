package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Recursion.Practice_Problem;

public class Factorial {
    public static int fact(int n){
        if(n == 1 || n == 0) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(2));
    }
}
