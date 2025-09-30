package shallowclonning;

public class Student implements Cloneable{

	 private int rollNo;
	 private String name;
	 private Course courses;
	
	public Student(int rollNo, String name, Course courses)
	{
		System.out.println("this of s : "+this);
		this.rollNo = rollNo;
		this.name = name;
		this.courses = courses;
	}
	
	public String toString()
	{
		return "[name = "+name+"\troll no = "+rollNo+"\tCourses = "+courses;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Course getCourses()
	{
		return courses;
	}
	
	public void setRollNo(int rn)
	{
		rollNo = rn;
	}
	
	public void setName(String nm)
	{
          name = nm;
	}
	
	public void setCourses(Course c)
	{
		courses = c;
	}
	
	
}
