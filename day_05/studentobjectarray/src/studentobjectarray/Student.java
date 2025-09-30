package studentobjectarray;


import java.util.Arrays;

public class Student {

	private int rollNo;
	private String name;
	private int[] marks;
	
	public Student(int rollNo, String name, int[] marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public float getPercentage()
	{
		int sum = 0;
		for(int i=0; i<6; i++)
		{
			sum = sum + marks[i];
		}
		return (sum*100)/600;
	}
	
	public String toString()
	{
		return "roll no = "+rollNo+"\tname = "+name+"\tmarks = "+Arrays.toString(marks);
			
	}
	
	public static void getTopStudent(Student s[])
	{
		for(Student i : s)
		{
			if(i.getPercentage() >= 60)
			{
				System.out.println(i);
			}
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
//	public static float percentsge
}
