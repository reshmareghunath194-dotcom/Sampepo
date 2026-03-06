package Inheritance;

public class Salary extends Calculate{


	    void display() {
	        double total = getBasic + hra - pf - getDeduction + getBonus;

	        System.out.println("Basic Pay : " + getBasic);
	        System.out.println("HRA       : " + hra);
	        System.out.println("PF        : " + pf);
	        System.out.println("Deduction : " + getDeduction);
	        System.out.println("Bonus     : " + getBonus);
	        System.out.println("Total     : " + total);
	    }
	

	    public static void main(String[] args) {
	        Salary s = new Salary();
	        s.calc();
	        s.display();
	    }
	}
	
