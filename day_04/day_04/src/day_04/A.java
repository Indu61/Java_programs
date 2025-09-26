package day_04;

public class A extends FinalDemo{
	
	// method overrideing run time polymorphism
//	@Override
//	public void print()
//	{
//		System.out.println("print method in A class");
//	}
	
	//error- we can not override final methods 
//	@Override
//	public final void print()
//	{
//		System.out.println("print method in A class");
//	}
	
	public static void main(String args[])
	{
		A a = new A();
		a.print();
	}
	

}
