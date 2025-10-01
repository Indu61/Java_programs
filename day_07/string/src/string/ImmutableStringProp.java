package string;

public class ImmutableStringProp {

	public static void main(String[] args) {
		
		String s1 = "Indu";
		
		String s2 = " Gadagi";
		
		System.out.println(s1.concat(s2)); //Indu Gadagi
		
		System.out.println(s1);  // Indu
		
		s1 = s1.concat(s2);
		
		System.out.println(s1);  // Indu Gadagi
		
		
	}
	
	
}
