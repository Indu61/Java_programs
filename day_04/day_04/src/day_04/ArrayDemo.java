package day_04;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String abc[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		
		//types of initializing 1D array
		int[] arr = new int[size];
		int []a = new int[2];
		int[] b = new int[] {1,2,3,4};
		int []c = new int[] {1,2};
		
		System.out.println("Enter "+size+" Array elements");
		for(int i= 0; i<size; i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println(" Array elements");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		s.close();
	}
}
 