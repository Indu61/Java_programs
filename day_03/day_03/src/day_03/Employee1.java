package day_03;

public class Employee1 {

	private static int empId = 0;
	private float salary;
	private static float totalSalary = 0;
	
	public Employee1(float salary)
	{
		empId = empId+1;
		this.salary = salary;
		totalSalary = totalSalary + salary;
	}
	
	public static void display()
	{
		System.out.println("empno = "+empId);
		System.out.println("total salary = "+totalSalary);
	}
	
	public static void main(String args[])
	{
		Employee1 e = new Employee1(3000.0f);
		display();
		Employee1 e1 = new Employee1(4000.0f);
		display();
	}
	
}
