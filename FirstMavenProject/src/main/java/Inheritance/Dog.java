package Inheritance;

public class Dog extends AnimalInheritance {
	
	void bark()
	{
		System.out.println("Dog bark");
		System.out.println(p);
	}
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.run();
	}
}

