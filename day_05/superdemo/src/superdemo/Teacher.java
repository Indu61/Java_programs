package superdemo;

public class Teacher extends Person{

	private String sub;
	private int year_of_exp;
	
	public Teacher(String name, int age, String sub, int year_of_exp)
	{
		super(name, age);
		this.sub = sub;
		this.year_of_exp = year_of_exp;
	}
	
	public String toString()
	{
		return super.toString()+ "\tsubject = "+sub+"\t year of experience = "+year_of_exp+"\t";
	}
}
