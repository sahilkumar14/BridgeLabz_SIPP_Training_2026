package BridgeLabz_SIPP_Training_2026.core_java_practice.gcr_codebase.Array.level_01;

import java.util.Scanner;
public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ageOfstudent = new int[10];
        for(int i = 0;i<10;i++){
            ageOfstudent[i] = sc.nextInt();
        }
        String[] eligibleForVote = new String[10];
        for(int i = 0;i<10;i++){
            if(ageOfstudent[i] >= 18){
                eligibleForVote[i] = "Yes";
            }else{
                eligibleForVote[i] = "No";
            }
        }

        for(String x:eligibleForVote){
            System.out.println(x);
        }
        sc.close();
    }
}
