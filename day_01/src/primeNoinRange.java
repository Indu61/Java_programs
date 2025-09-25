import java.util.Scanner;

public class primeNoinRange {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st num");
		int n1 = s.nextInt();
		
		System.out.println("Enter 2nd num");
		int n2 = s.nextInt();
		int i,j;
		
		for(i = n1; i <= n2; i++)
		{
			for(j = 2; j < i; j++)
			{
				if(i % j == 0)
					break;
			}
			if(i == j)
				System.out.println(i);
		}
	}
}
