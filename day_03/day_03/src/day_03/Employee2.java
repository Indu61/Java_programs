package day_03;

import java.util.Scanner;

public class Employee2 {

	private float salary;
	
	public Employee2(float salary)
	{
		this.salary = salary;
	}
	
	public float calculateGrossSalary()
	{
		
		if(salary < 1500)
		{
			return salary+((90*salary)/100)+((10*salary)/100);
		}
		else
		{
			return salary+((98*salary)/100)+500;                                                                               
		}
	}
	
	public static void main(String abc[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary :");
		float salary = s.nextFloat();
		Employee2 e = new Employee2(salary);
		System.out.println(e.calculateGrossSalary());
	}
}
