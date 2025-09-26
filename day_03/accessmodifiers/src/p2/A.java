package p2;
import static java.lang.System.out;

//import p1.A; // error


public class A{
	
	public A()
	{
		out.println("p1 package class A constructor called...");
	}

	public static void main(String... args)
	{
		A a1 = new A();
		p1.A a = new p1.A();
	}
}
																						