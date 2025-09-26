package day_03;

public class MathOperation {

	private int a, b;
	private float c, d, e;
	private int[] arr;
	private double f;
	
	public MathOperation(int a, int b, float c, float d, float e, int[] arr, double f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.arr = arr;
		this.f = f;
	}
	
	public void multiply()
	{
		int res1 = a * b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+res1);
		
		float res2 = c * d * e;
		System.out.println("Multiplication of "+c+", "+d+" and "+e+" is "+res2);
		
		int res3 = 1;
		for(int i: arr)
		{
			res3 = res3 * i;
		}
		System.out.println("multiplication of array elements is "+res3);
		
		double res4 = a * f;
		System.out.println("Multiplication of "+a+" and "+f+" is "+res4);
		
		
		
		
	}
	
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};
		MathOperation m = new MathOperation(1,2,3.0f,4.0f,5.0f,arr, 8.0d);
		
		m.multiply();
	}
}
