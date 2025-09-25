import java.util.Scanner;

public class SwitchDemo {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a, b;
		float c = 0.0f;
		String ch, ans;
		
		do {
			System.out.println("Add\tSub\tMul\tDiv\tExit");
			System.out.println("Enter your choice: ");
			ch = s.next();
			System.out.println("Enter 2 Numbers: ");
			 a = s.nextInt();
			 b = s.nextInt();
			
			switch(ch)
			{
			case "Add" : c = a + b;
			System.out.println("add = "+c);
			break;
			
			case "Sub" : c = (a>b)?a-b:b-a;
			System.out.println("sub = "+c);
			break;
			
			case "Mul" : c = a*b;
			System.out.println("Mul = "+c);
			break;
			
			case "Div" : if(b == 0)
			{
				System.out.println("Denominator is zero");
			}
			else 
			{
				c = a / b;
				System.out.println("Div = "+c);
			}
			break;
			
			
			case " Exit" : System.exit(1);
			
			default: System.out.println("Enter valid choice");
			
			}
			
			System.out.println("Do you want to continue(YES/NO);");
			ans = s.next();
			
			
			
		}while(ans != "NO");
		
		s.close();
	}
}