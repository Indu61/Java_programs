import java.util.Scanner;

public class Switch2 {

	private int a, b;
	
	public void inputNum()
	{
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter 2 Numbers: ");
		 a = s.nextInt();
		 b = s.nextInt();
	}
	
	int getA()
	{
		return a;
	}
	
	int getB()
	{
		return b;
	}
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch, ans;
		int a, b;
		float c = 0.0f;
		
		do {
			System.out.println("a.Add\tb.Sub\tc.Mul\td.Div\te.Exit");
			System.out.println("Enter your choice: ");
			ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case 'a' : Switch2 o1 = new Switch2();
            o1.inputNum();
            a = o1.getA();
            b = o1.getB();
            c = a + b;
            System.out.println("Sum = "+c);
            break;
                  
			case 'b' : Switch2 o2 = new Switch2();
            o2.inputNum();
            a = o2.getA();
            b = o2.getB();
            c = (a>b)?a-b:b-a;
			System.out.println("sub = "+c);
			break;   
			
			case 'c' : Switch2 o3 = new Switch2();
            o3.inputNum();
            a = o3.getA();
            b = o3.getB();
            c = a*b;
			System.out.println("Mul = "+c);
			break;
			
			case 'd' : Switch2 o4 = new Switch2();
            o4.inputNum();
            a = o4.getA();
            b = o4.getB();
            if(b == 0)
			{
				System.out.println("Denominator is zero");
			}
			else 
			{
				c = a / b;
				System.out.println("Div = "+c);
			}
			break;
			
			case 'e' : System.exit(1);
			
			default: System.out.println("Enter valid choice");
			
			}
			
			System.out.println("Do you want to continue(YES/NO);");
			ans = sc.next().charAt(0);
			
			
			
		}while(ans != 'N');
		
		sc.close();
	}
}