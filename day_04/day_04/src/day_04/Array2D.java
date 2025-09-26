package day_04;
// jagged array

import java.util.Scanner;

public class Array2D {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
    	System.out.println("Enter row of Array : ");
		int row = s.nextInt();
		int[][] arr = new int[row][];
		int sum;
		
		//int[][] a = new int[][]  {{1,2},{3,4,5},{6,7,8,9}};

		
		for(int i=0; i<row; i++)
		{
			System.out.println("Enter col size : ");
			int col = s.nextInt();
			arr[i] = new int[col];
			
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = s.nextInt();
			}
			System.out.println();
		}
		
//		for(int i=0; i<3; i++)
//		{
//			for(int j=0; j<arr[i].length; j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i[] : arr)
		{
			sum = 0;
			for(int j: i)
			{
				System.out.print(j+"\t");
				sum += j;
			}
			System.out.println("Sum = "+sum);
		}
		
		s.close();
	}
}
