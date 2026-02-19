package StringPrograms;

public class AppendDeleteReverseReplaceInsert {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Hello World");
		System.out.println(sb1.append("Programmers"));
		System.out.println(sb1.delete(5, 10));
		System.out.println(sb1.reverse());
		System.out.println(sb1.replace(6, 11, "All"));
		System.out.println(sb1.insert(5, 'o'));
		

	}

}
