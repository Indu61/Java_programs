package exceptionhandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		int a, b, c = 0;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println(c);
		} catch(Exception e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println("Denominator should not be zero");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Enter atleat 2 values");
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println("Accept only Integer");
			}
			else
			{
				System.out.println("Exception!!");
			}
		}
		
	}
}
