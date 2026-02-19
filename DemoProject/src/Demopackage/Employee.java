package Demopackage;

public class Employee {

		String name;
		int id;
		int salary;
		 
		Employee (int i, int m, String name)
		{
		 this();
		 this.name = name;
		 this.id = id;
		 this.salary = salary;
		  
	    System.out.println( "parametrized" );
		}
		
		Employee()
		{
		this("Reshmaa");
		System.out.println("Student Constructor");
		}
		
	    Employee(String s)
		{
			
		System.out.println(s);
		}
		
		void displayInfo()
		{
		this.show();
		
		System.out.println("employee name = " + name);
		System.out.println("employee id = " + id);
		System.out.println("employee salary = " + salary);
		}
		
		void show()
		{
		this.show2(10);
		System.out.println("This show method");
		}
		
		void show2(int a)
		{
		System.out.println(a);
		}
		
		public static void main (String args [])
		{
			
		Employee st = new Employee(101, 22, "Reshma");
		st. displayInfo();
		
		}
		
	}


