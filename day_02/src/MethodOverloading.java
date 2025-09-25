
public class MethodOverloading {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public float add(float a, int b)
	{
		return a+b;
	}
	
	public float add(int a, float b)
	{
		return a+b;
	}
	
	public int add(int... a)
	{
		int sum = 0;
		for(int i : a)
		{
			sum += i;
		}
		return sum;
	}
	
	public float add(float b, int... a)
	{
		int sum = 0;
		for(int i : a)
		{
			sum += i;
		}
		return sum + b;
	}
	
//	public float add(float... b, int a)
//	{
//		return 0;
//	}
	
	public static void main(String args[])
	{
		MethodOverloading obj = new MethodOverloading();
		System.out.println("sum = "+obj.add(2, 2));
		System.out.println("sum = "+obj.add(2, 2.4f));
		System.out.println("sum = "+obj.add(2.5f, 2));
		System.out.println("sum = "+obj.add(2, 2, 2, 2));
		System.out.println("sum = "+obj.add(2.5f, 2, 2, 2));
	}
	
}
