import java.util.Scanner;

public class TernaryDemo {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		//(a>b)? System.out.println(a):System.out.println(b);
		
		//(a>b)? {System.out.println(a)}:{System.out.println(b)};
		String msg = (a>b)? a+" is greater than "+b : b+" is greater than "+a;
		System.out.println(msg);
		s.close();
	}
}
