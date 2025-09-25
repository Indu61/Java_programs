import java.util.Scanner;

public class IfElseDemo {

	public static void main(String args[])
	{
		int marks;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		marks = s.nextInt();
		
		if(marks >= 75)
			System.out.println("Distinction");
		
		else if(marks < 90 && marks >= 65)
			System.out.println("First class");
		
		else if(marks < 65 && marks >= 55)
			System.out.println("Second class");
		
		else if(marks < 55 && marks >= 40)
			System.out.println("Third class");
		
		else
			System.out.println("Fail");
		
		s.close();
	}
	
	
	
}
