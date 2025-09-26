package day_03;

public class ThisKeyword {

	private int a, b;
	
	public ThisKeyword()
	{
		//this(1,2);
		System.out.println("Default constructor called...");
		a = 0;
		b = 0;
	}
	
	public ThisKeyword(int a, int b)
	{
		//this(1,2); // error recursive call
		this();
		System.out.println("para consructor called");
		
	}
	
	public static void main(String[] args)
	{
		ThisKeyword t = new ThisKeyword();
		ThisKeyword t1 = new ThisKeyword(1,2);
		
	}
}

