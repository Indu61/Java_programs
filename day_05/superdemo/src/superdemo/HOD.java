package superdemo;

public class HOD extends Teacher{

	private String dept;
	
	public HOD(String name, int age, String sub, int year_of_exp, String dept)
	{
		super(name, age, sub, year_of_exp);
		this.dept = dept;
	}
	
	public String toString()
	{
		return super.toString()+"\tdepartment = "+dept;
	}
}
