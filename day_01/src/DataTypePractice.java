public class DataTypePractice {

	public static void main(String args[])
	{
		int a = 10, b = 20, c = 0;
		
		float d;
		c = a++;
		System.out.println("a = "+a+" c = "+c);  //11 10
		
		c = ++b;
		System.out.println("b = "+b+" c = "+c);  // 21  21
		
		d = 7/2;
		System.out.println("d = "+d);    // 3.0
		
		d = (float) 7/2;
		System.out.println("d = "+d);   //3.5
		
		d = 7%2;
		System.out.println("d = "+d);  //1
		
		System.out.println("10/0 = "+(10/0.0)); // infinity
		System.out.println("10/0 = "+(-10/0.0)); // -infinity
		System.out.println("10/0 = "+(0.0/0.0)); // infinity
	}
}
