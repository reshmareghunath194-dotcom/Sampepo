package Demopackage;

public class StudentGrade {

    class Student {

	        int m1, m2, m3;

	        Student(int a, int b, int c) {
	            m1 = a;
	            m2 = b;
	            m3 = c;
	        }

	        int getTotal() {
	            return m1 + m2 + m3;
	        }

	        void findGrade() {
	            int total = getTotal();
	            double avg = total / 3.0;

	            System.out.println("Total Marks: " + total);

	            if (avg >= 90) {
	                System.out.println("Grade: A");
	            } else if (avg >= 75) {
	                System.out.println("Grade: B");
	            } else if (avg >= 60) {
	                System.out.println("Grade: C");
	            } else {
	                System.out.println("Grade: Fail");
	            }
	        }
	    }

	    public static void main(String[] args) {

	        StudentGrade sg = new StudentGrade(); 

	        // Student 1
	        StudentGrade.Student s1 = sg.new Student(85, 90, 88);
	        System.out.println("Student 1");
	        s1.findGrade();

	        System.out.println();

	        // Student 2
	        StudentGrade.Student s2 = sg.new Student(65, 70, 60);
	        System.out.println("Student 2");
	        s2.findGrade();
	    }
	}