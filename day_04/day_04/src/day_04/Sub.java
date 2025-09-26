package day_04;

public class Sub extends Base{

	@Override         // if we not write Override still it not give error and print Sub class function
	public void print()
	{
		System.out.println("Sub class print called...");
	}
	
	public void m1()
	{
		System.out.println("Sub class m1 called...");
	}
	
	public static Base print1(Base b)
	{
		return b;
	}
	
	public static void main(String... args)
	{
		Sub s = new Sub();
		
		//Sub s1 = new Base(); // error
		
		Base s2 = new Sub();
		//s2.m1();  // i can not access specific method of sub class through parent reference object 
		
		//((Sub)s2).m1();  // explicit type conversion
		
		//s.print();
		
		print1(s2);
	}
	
}
