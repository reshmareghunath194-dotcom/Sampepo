package StringPrograms;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "   HELLO    ";
		String s3 = "World";
		String s4 = new String ("Java Programers");
		System.out.println(s.length());
		System.out.println(s.equals(s3));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s4.charAt(8));
		System.out.println(s4.indexOf('P'));
		System.out.println(s2.toLowerCase());
		System.out.println(s.toUpperCase());
        System.out.println(s3.contains("Java"));
        System.out.println(s4.substring(1,3));
        System.out.println(s3.replace("World", "Future"));
        System.out.println(s.concat(" " + s3));
        System.out.println(s2.trim());
        System.out.println("before trim" + s2);
        System.out.println("after trim" + s2.trim());
        System.out.println(s.startsWith("h"));
        System.out.println(s.endsWith("s"));
        
       String splitString[] = s4.split(" ");
       
    	   for(String a: splitString)
    	   {
    		   System.out.println(a);
       
    	   }
	}
}
	


