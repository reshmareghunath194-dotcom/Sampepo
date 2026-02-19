package MultiLevelInheritance;

	
	public class Peacock extends Owl {
		
		
		void dance()
		{
			System.out.println("Peacock Dance");
			
		}
		public static void main(String[] args) 
		{
			Peacock p = new Peacock();
			p.fly();
			p.eat();
			p.sound();
			p.dance();
		}
}