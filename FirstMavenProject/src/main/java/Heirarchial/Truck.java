package Heirarchial;

public class Truck extends Vehicle{

	 void load() {
	        System.out.println("Truck is loading");
	    }
	
public static void main(String[] args) {
    Car c = new Car();
    c.start();
    c.drive();

    Bike b = new Bike();
    b.start();
    b.ride();

    Truck t = new Truck();
    t.start();    
    t.load();
}
}