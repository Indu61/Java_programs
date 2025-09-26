package day_04;

//containment types
//composition(tightly coupled)

public class Employee {

	private String empName;
	private int empId;
	private Date date_of_joining;
	
	public Employee(String empName, int empId, Date date_of_joining)
	{
		this.empName = empName;
		this.empId = empId;
		this.date_of_joining = date_of_joining;
	}
	
	public String toString()
	{
		return "employee details\nName : "+empName+"\tId :"+empId+"\tDOJ : "+date_of_joining;
	}
	
	public static void main(String abc[])
	{
		Employee e = new Employee("Indu", 1, new Date(1,1,2026));
		System.out.println(e);
	}
}
                     