package assignments;

public class Array {
	private int[] a;
	
	//para constructor
	public Array(int[] a)
	{
		this.a = a;
	}
	
	//sort array in descneding oreder 
	public void sortDescending()
	{
		for(int i=0; i<5; i++)
		{
			 for(int j=i; j<6; j++)
			 {
				 if(a[i] < a[j])
				 {
					 int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				}
			 }
		}
	}
	
	//sort array in ascending order
	public void sortAscending()
	{
		for(int i=0; i<5; i++)
		{
			 for(int j=i; j<6; j++)
			 {
				 if(a[i] > a[j])
				 {
					 int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				}
			 }
		}
	}
	
	//find min element in array 
	public int minInArray()
	{
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		return min;
	}
	
	//find max element in array 
	public int maxInArray()
	{
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
	
	//find frequency of elements in array
	public int findfrequency(int ele)
	{
		int count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == ele)
			{
				count++;
			}
		}
		
		return count;
	}
	
	//Total of all elements in an Array.
	public int sumOfAllElements()
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}
	
	//Reverse an Array.
	public void reverseArray()
	{
		int start = 0, end = a.length - 1;
		
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
	
	//print array elements
	public void desplay()
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] {2,2,2,1,6,5};
		
		Array obj = new Array(a);
		
		System.out.println("Ascending oreder");
		obj.sortAscending();
		obj.desplay();
		
		System.out.println("\ndecending oreder");
		obj.sortDescending();
		obj.desplay();
		
		System.out.println("\nmin element in array : "+obj.minInArray());
		System.out.println("max element in array : "+obj.maxInArray());
		
		System.out.println("frequency of 2 is "+obj.findfrequency(2));
		
		System.out.println("Sum of All elemets of Array : "+obj.sumOfAllElements());
		
		obj.reverseArray();
		//obj.desplay();
		
	}
}
