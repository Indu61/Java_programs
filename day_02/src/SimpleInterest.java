import java.util.Scanner;

public class SimpleInterest {

	private int principalAmount, time, rate;
	
	public SimpleInterest()
	{
		principalAmount = 0;
		time = 0;
		rate = 0;
	}
	
	public SimpleInterest(int p, int t, int r)
	{
		principalAmount = p;
		time = t;
		rate = r;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principle amount, time, rate : ");
		int p = s.nextInt();
		int t = s.nextInt();
		int r = s.nextInt();
		
		SimpleInterest obj = new SimpleInterest(p,t,r);
		
		float res = (obj.principalAmount * obj.rate * obj.time)/100;
		
		System.out.println("Simple Interst = "+res);
		
	}
}
