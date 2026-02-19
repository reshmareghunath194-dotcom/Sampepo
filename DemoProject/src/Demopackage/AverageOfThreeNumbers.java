package Demopackage;

public class AverageOfThreeNumbers {
		static void avg(int a, int b, int c) {
	        int result = (a + b + c) / 3;
	        System.out.println("Average of integers: " + result);
	    }
	    static void avg(float a, float b, float c) {
	        float result = (a + b + c) / 3;
	        System.out.println("Average of floats: " + result);
	    }

	    public static void main(String args[]) {

	        avg(10, 20, 30);          // int method
	        avg(10.5f, 20.5f, 30f);   // float method
	    }
	}
