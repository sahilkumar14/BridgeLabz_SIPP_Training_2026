package BridgeLabz_SIPP_Training_2026.gcr_codebase.programming_elements.level_01;

public class CalculateProfitAndLoss {
    public static void main(String[] args) {
        int CostPrice = 129;
        int SellingPrice = 191;

        int Profit = SellingPrice - CostPrice;
        float ProfitPercentage =  ((float)Profit / CostPrice)  * 100;

        System.out.print("The Cost Price is INR "+CostPrice+" and Selling Price is INR "+SellingPrice +"\n"+"The Profit is INR "+Profit+" and the Profit Percentage is "+ProfitPercentage + "%");
    }
}
