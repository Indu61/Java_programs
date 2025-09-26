package day_04;

// look at class B
public final class FinalDemo2 {

private final int NO;  // like constant
	
	public FinalDemo2()
	{
		NO = 10;
	}
	
	public void print()
	{
		System.out.println("print method called..");
	}
	
	public static void main(String... abc)
	{
		// we cane create multiple objects of final class
		FinalDemo2 f = new FinalDemo2();
		f.print();
		FinalDemo2 f1 = new FinalDemo2();
		f1.print();
		f = f1;
		
		//if reference is final then we can we can not change object stored in that reference 
		//(final reference must remain same, not object)
		
		final FinalDemo2 f2;  // reference
		f2 = new FinalDemo2();
		f2.print();
		
		//f2 = new FinalDemo2(); //error
	}
}
