package Demopackage;

public class DiscountCheck {

    // Method 1: calculate total amount
    static double calculateTotal(double item1, double item2, double item3) {
        return item1 + item2 + item3;
    }

    // Method 2: check discount and return final amount
    static double checkDiscount(double totalAmount) {
        if (totalAmount > 5000) {
            return totalAmount - (totalAmount * 0.20); // 20% discount
        } else {
            return totalAmount;
        }
    }

    public static void main(String[] args) {

        double price1 = 2000;
        double price2 = 1800;
        double price3 = 1500;

        double totalAmount = calculateTotal(price1, price2, price3);
        double finalAmount = checkDiscount(totalAmount);

        System.out.println("Total Amount = " + totalAmount);
        System.out.println("Final Amount to Pay = " + finalAmount);
    }
}
