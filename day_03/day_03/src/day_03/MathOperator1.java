package day_03;

public class MathOperator1 {

	private int x, y, r;
	//private static int r;
	
	public MathOperator1(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int add()
	{
		r = x + y ;
		return y;
	}
	
	public int multiply()
	{
		r = x * r ;
		return y;
	}
	
	public int power()
	{
		int res = 1;
		for(int i=1; i<=y; i++)
		{
			res = res*x;
		}
		
		r = res;
		return r;
	}
	
	public void display()
	{
		System.out.println("result is "+r);
	}
	
	public static void main(String args[])
	{
		MathOperator1 m = new MathOperator1(2,3);
		m.add();
		m.display();
		
		m.power();
		m.display();
	}

}
