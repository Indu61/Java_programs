package day_04;

// look at class A
public class FinalDemo {

	private final int NO;  // like constant
	
	public FinalDemo()
	{
		NO = 10;
	}
	
//	public int getNo()
//	{
//		return NO;
//	}
	
	//overriding this method in class A
//	public void print()
//	{
//		System.out.println("print method in FinalDemo");
//	}
	
	public final void print()
	{
		System.out.println("print method in FinalDemo");
	}
	
	public static void main(String args[])
	{
		FinalDemo f = new FinalDemo();
	    System.out.println(f.NO);
	    //f.NO = 20; // error - we can not reinitialize final variable
	    
	    
	}
}
