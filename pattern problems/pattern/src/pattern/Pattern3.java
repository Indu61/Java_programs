package pattern;

public class Pattern3 {

	public static void main(String... args)
	{
		int count = 4;
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i == j || j == count)
				{
					System.out.print("X ");
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
