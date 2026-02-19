package Heirarchial;

public class Students extends Person{

	void study()

	{
		System.out.println("Students are studying");
	}

	public static void main(String[] args) 
	{
		Students c = new Students();
		c.study();
		c.displayInfo();
		Teacher t = new Teacher();
		t.teach();
		t.displayInfo();
		
	}
}