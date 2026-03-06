package Inheritance;

public class Calculate extends Employee {
	
	
	    double hra;
	    double pf;

	    void calc() {
	        hra = getBasic * 0.05;   
	        pf = getBasic * 0.20;    
	    }
	}

	