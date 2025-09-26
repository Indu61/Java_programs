package day_03;

import java.util.Scanner;

public class LeapYear {

	private int year;
	
	public LeapYear()
	{
		year = 0;
	}
	
	public LeapYear(int year)
	{
		this.year = year;
	}
	
//	public void checkLeapYear()
//	{
//		int y = this.year;
//		
//		System.out.println("year = "+y);
//		
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//		{
//			System.out.println(this.year+ " is leap year");
//		}
//		else
//		{
//			System.out.println(this.year+ " is not leap year");
//		}
//	}
	
	public boolean checkLeapYear()
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))?(true):(false);
	
	}
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = s.nextInt();
		
		LeapYear y = new LeapYear(year);
//		y.checkLeapYear();
		
		if(y.checkLeapYear())
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
		
		s.close();
	
		
	}
}
