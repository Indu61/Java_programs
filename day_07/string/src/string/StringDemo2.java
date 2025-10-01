package string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str1 = "Indu";
		String str2 = "Indu";
		String str3 = new String("Indu");
		String str4 = new String("Indu");
		String str5 = "Gadagi";
		
		//ends with 
		System.out.println(str1.endsWith("u"));  //true
		System.out.println(str1.endsWith("o"));  //false
		
		System.out.println("_______________________________");
		//starts with
		System.out.println(str1.startsWith("In")); //true
		System.out.println(str1.startsWith("IN")); //false
		System.out.println(str1.startsWith("nu")); //false
		
		System.out.println("_______________________________");
		//isBank 
		System.out.println(str1.isBlank()); //false
		String str7 = " ";
		String str8 = "";
		System.out.println(str7.isBlank()); //true
		System.out.println(str7.isBlank()); //true
		
		System.out.println("_______________________________");
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("_______________________________");
		
		String s = "";
		String s1 = " ";
		String s2 = "Indu";
		
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		
		String s3 = "what";
		System.out.println(s3.replace("w", "a"));
		//System.out.println(s3);
		
		System.out.println(s2.indexOf("n"));
		
		
		
		
		
		
	}
}
