package assignments;

import java.util.Scanner;

public class RotateArraybyK {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int[][] students = new int[4][4];
	
	for(int i=0; i<=3; i++)
	{
		for(int j=0; j<=3; j++)
		{
			if(j == 0)
			{
				System.out.println("Enter student id : ");
				students[i][j] = s.nextInt();
			}
			else
			{
				System.out.println("Enter student marks for subject "+(j)+" : ");
				students[i][j] = s.nextInt();
			}
		}
	}
	
	int sum;
	for(int i=0; i<=3; i++)
	{
		sum = 0;
		for(int j=0; i<=3; j++)
		{
			if(j != 0)
			{
				sum = sum + students[i][j];
			}
			
		}
		
		System.out.println("sum of 3 subject is "+sum);
		float percentage = (sum*100)/300;
		System.out.println("persentage of student "+(i+1)+" is "+percentage);
	}
	
	s.close();
	
    }
}
