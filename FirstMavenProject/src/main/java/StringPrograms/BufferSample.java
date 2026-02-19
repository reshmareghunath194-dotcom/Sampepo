package StringPrograms;

public class BufferSample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb2=new StringBuffer("Hello");
		StringBuffer sb3=new StringBuffer("Hello Java Programmers");
		
		System.out.println(sb.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.length());
		
	}

}
