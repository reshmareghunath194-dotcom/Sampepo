package Polymorphism;


public class Onseason extends Clothes {
    void discount(double amount) {
        double discount = amount * 0.40;
        double total = amount - discount;
        System.out.println("On Season Discount (40%) = " + total);
    }
}

