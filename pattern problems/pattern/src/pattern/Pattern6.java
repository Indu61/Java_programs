package pattern;

public class Pattern6 {

	public static void main(String args[])
	{
		char ch;
		for(int i=0; i<4; i++)
		{
			ch = 'D';
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch --;
			}
			System.out.println("  ");
		}
		
		for(int i=2; i>=0; i--)
		{
			ch = 'D';
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println("  ");
		}
		
		
	}
}
