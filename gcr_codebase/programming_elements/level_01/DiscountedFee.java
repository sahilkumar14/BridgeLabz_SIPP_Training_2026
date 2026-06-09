package BridgeLabz_SIPP_Training_2026.gcr_codebase.programming_elements.level_01;

public class DiscountedFee {
    public static void main(String[] args) {
        int OriginalFee = 125000;
        int discountPercent = 10;

        int discountAmount = OriginalFee * discountPercent / 100;
        int feeAfterDiscount = OriginalFee - discountAmount;

        System.out.print("the discount amount is "+discountAmount+" and final discounted fee is INR "+feeAfterDiscount);
    }
}
