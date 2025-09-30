package interfacedemo;

/*must need to overriDde all abstract methods otherwise this if not then i need to make unimplemets
method abstract than i need to make class also abstract 
( if class have one or more abstract method must need to make class also abstract) we can not create object of abstract class */

public class CalNumber extends Factorial implements StaticCal, CompareCal{

	@Override
	public int add(int a, int b)
	{
		return (a + b);
	}
	
	@Override
	public int sub(int a, int b)
	{
		return (a - b);
	}
	
	@Override
	public int min(int a, int b)
	{
		return (a < b)?a:b;
	}
	
	@Override
	public int avg(int a, int b)
	{
		return(a + b)/2;
	}
	
	
	
}
