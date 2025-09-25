
public class SecondLargest {

	public static void main(String args[])
	{
		int a[] = {12, 45, 1, 78, 34, 78, 23};
		
		int max1 = a[0], max2 = a[0];
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max1)
			{
				max2 = max1;
				max1 = a[i];

			}
		}
		
		System.out.println("Second largest = "+max2);
		
		
	}
}
