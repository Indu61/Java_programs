package day_03;

import static java.lang.System.out;

public class Employee {

	private int empId;
	private String name;
	private static int countEmp;
	
	public Employee()
	{
		out.println("default constructor called.. ");
//		empId = 0;
//		name = "\0";
	}
	
	public Employee(int empId, String name)
	{
		out.println("para constructor called.. ");
		this.empId = empId;
		this.name = name;
		countEmp ++;
	}
	
	public String toString()
	{
		return "employee Id = "+empId+"\tname = "+name;
	}
	
	static {
		out.println("inside static block ");
		countEmp = 50;
	}
	
	public static void setCountEmp(int c)
	{
		Employee.countEmp = c;
	}
	
	public static void main(String... args)
	{
		
		Employee e = new Employee();
		out.println(e);
		out.println(Employee.countEmp);
		
		Employee.setCountEmp(10);
		out.println(Employee.countEmp);
		
		//Employee e1 = new Employee("")
	}
}
