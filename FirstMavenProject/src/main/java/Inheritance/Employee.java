package Inheritance;

public class Employee {


	    double getBasic() {
	    	return 20000;
	    }
	    
	    double getDeduction() {
	    	return 2000;
	    } 
	    
	    double getBonus() {
	    	return 3000;
	    }    
	    public static void main(String[] args) {

	        Employee e = new Employee();

	        System.out.println("Basic Salary: " + e.getBasic());
	        System.out.println("Deduction: " + e.getDeduction());
	        System.out.println("Bonus: " + e.getBonus());
	}

}