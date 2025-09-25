
public class Employee {

	private int empId;
	private String name;
	private float empSalary;
	
	public Employee()
	{
		System.out.println("Default constructor called..");
		empId = 0;
		name = "\0";
		empSalary = 0.0f;
	}
	
	public Employee(int eid, String nm)
	{
		System.out.println("2 para constructor called..");
		empId = eid;
		name = nm;
	}
	
	public Employee(int eid, String nm, float s)
	{
		System.out.println("3 para constructor called..");
		empId = eid;
		name = nm;
		empSalary = 1000000.0f;
	}
	
	public void setEmpid(int eid)
	{
		empId = eid;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public void setEmpSalary(float s)
	{
		empSalary = s;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getEmpSalary()
	{
		return empSalary;
	}
	
	public String toString()
	{
		return "Employee id = "+empId+"\t employee name = "+name+" Employee Salary = "+empSalary;
	}
	public static void main(String args[])
	{
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee(1, "Ab");
		System.out.println(e1);
		
		Employee e2 = new Employee(1, "Abcd", 70000.0f);
		System.out.println(e2);
		
		e2.setEmpid(111);
		System.out.println("empid = "+ e2.empId);
		
	}
}
