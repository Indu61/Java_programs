package superdemo;

import java.util.Scanner;

public class Demo {

	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in); 
		
	    System.out.println("Enter Name:");
	    String nm = s.nextLine();
	    
	    System.out.println("Enter age:");
	    int age = s.nextInt();
	    
	    s.nextLine();
	    
	    System.out.println("Enter Subject:");
	    String sub = s.nextLine();
	    
	    System.out.println("Enter year of experience:");
	    int exp = s.nextInt();
	    
	    s.nextLine();
	    
	    System.out.println("Enter department:");
	    String dept = s.nextLine();
	    
		Person p = new HOD(nm, age, sub, exp, dept);
		
		System.out.println(p);
	    
	    
		
		s.close();
		
	}
}
