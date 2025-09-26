package pattern;

public class Pattern5 {

	public static void main(String args[])
	{
		int count = 4;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i == j || j == count || i == 0 || i == 4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(". ");
				}
			}
			count --;
			System.out.println();
		}
	}
}
