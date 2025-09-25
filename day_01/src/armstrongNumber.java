import java.util.Scanner;

public class armstrongNumber {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = s.nextInt();
		
		int sum = 0;
		
		int num = n;
		
		while(num != 0)
		{
			int dig = num % 10;
			sum = sum + dig*dig*dig;
			num = num/10;
		}
		
		if(n == sum)
		{
			System.out.println(n+" is armstrong number");
		}
		else
		{
			System.out.println(n+" is not armstrong number");
		}
		
	}
}
