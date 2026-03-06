package Polymorphism;

	public class Offseason extends Clothes {
	    void discount(double amount) {
	        double discount = amount * 0.15;
	        double total = amount - discount;
	        System.out.println("Off Season Discount (15%) = " + total);
	    }
	

	    public static void main(String[] args) {
	        
	       Onseason on = new Onseason();
	       Offseason off = new Offseason();

	        on.discount(1000);
	        off.discount(1000);
	    	
	    	Clothes c;
	    	c =new Onseason();
	    	c.discount(1000);
	    	
	    	c = new Offseason();
	    	c.discount(1000);
	    }

}