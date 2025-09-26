package day_03;

public class Person1 {

	private int age, gender;  //gender 1 for male, 0 for female
	
	public Person1(int age, int gender)
	{
		this.age = age;
		this.gender = gender;
	}
	
	public boolean EligibleForMarriage()
	{
		if(age >= 22) 
			return true;
		return false;
	}
	
	public static void main(String args[])
	{
		Person1 p = new Person1(29,1);
		
		if(p.EligibleForMarriage())
		{
			System.out.println("Eligible for marriede");
		}
		
		else
		{
			System.out.println("Not Eligible for marriede");
		}
	}
}
