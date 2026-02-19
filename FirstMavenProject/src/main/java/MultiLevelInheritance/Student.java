package MultiLevelInheritance;

public class Student extends Standard {
		
		
		void dance()
		{
			System.out.println("Student Dance");
			
		}
		public static void main(String[] args) 
		{
			Student s = new Student();
			s.power();
			s.future();
			s.fourteen();
			s.eleven();
			s.dance();
		}
}