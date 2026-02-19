package StringPrograms;

public class BuliderSample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder("Hello");
		StringBuilder sb3=new StringBuilder("Hello Java Programmers");
		StringBuilder sb4=new StringBuilder("Hello World");
		
		System.out.println(sb.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.length());
		System.out.println(sb4.append("Programmers"));
		System.out.println(sb4.delete(5, 10));
		System.out.println(sb4.reverse());
		System.out.println(sb4.replace(6, 11, "All"));
		System.out.println(sb4.insert(5, 'o'));
		
	}

}

