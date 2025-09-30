package shape;

import java.util.Scanner;

public class Demo {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Radius of circle : ");
		float r = s.nextFloat();
		Shape circle = new Circle(r);
		
	    System.out.println("Area of cirlce :"+circle.calArea());
		System.out.println("Ente length and breadth of rectangle :");
		float l = s.nextFloat();
		float b = s.nextFloat();
		
		Shape reactangle = new Reactangle(l,b);
		System.out.println("Area of rectangle : "+reactangle.calArea());
	}
}
