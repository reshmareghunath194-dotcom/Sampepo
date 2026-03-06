package Polymorphism;

public class Circle extends Shape{
    void area(double r)
    {
    	double result = 3.14*r*r;
    	System.out.println("Area of the circle = " + result);
    }
    }