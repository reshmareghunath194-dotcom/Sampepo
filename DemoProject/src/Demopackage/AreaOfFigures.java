package Demopackage;

public class AreaOfFigures {

		// Area of c
	    static void area(double r) 
	    {
	        double result = 3.14 * r * r;
	        System.out.println("Area of Circle: " + result);
	    }

	    // Area of r
	    static void area(double l, double b) 
	    {
	        double result = l * b;
	        System.out.println("Area of Rectangle: " + result);
	    }

	    // Area of s
	    static void area(int s) 
	    {
	        int result = s * s;
	        System.out.println("Area of Square: " + result);
	    }

	    public static void main(String args[]) 
	    {

	        area(5.0);        // c
	        area(10.0, 5.0);  // r
	        area(4);          // s
	    }
	}

