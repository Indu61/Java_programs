import java.util.Scanner;

public class Circle {
	private float r;
	//private float pi = 3.14f;
	
	public Circle()
	{
		System.out.println("Default constructor called...");
		r = 0;
	}
	
	public Circle(float a)
	{
		System.out.println("para constructor called....");
		r = a;
	}
	
	public float area()
	{
		return 3.14f*r*r;
	}

	public float circumference()
	{
		return 2*3.14f*r;
	}
	
	void dispalyCircleInfo()
	{
		System.out.println("Area of Circle = "+3.14f*r*r+"\ncircumference of Circle = "+2*3.14f*r);
	}
	
	public static void main(String args[])
	{
		Circle c = new Circle();  // default
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r = s.nextFloat();
	
		Circle c1 = new Circle(r);
		
		System.out.println("Area of Circle = "+c1.area());
		System.out.println("circumference of Circle = "+c1.circumference());
		
		c1.dispalyCircleInfo();
		
		s.close();
		
	}
}
