package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Recursion.Practice_Problem;

public class PrintNumberUptoN {
    public static String uptoN(int n){
        if(n == 1) return n+"";
        return n+" "+ uptoN(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(uptoN(5));
    }
}
