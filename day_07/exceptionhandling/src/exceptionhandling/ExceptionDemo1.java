package exceptionhandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		int a, b, c = 0;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter atleat 2 values");
		} catch(NumberFormatException e) {
			System.out.println("Accept only Integer");
		} catch(Exception e) {
			System.out.println("Exception!!");
		}
		
	}
}
