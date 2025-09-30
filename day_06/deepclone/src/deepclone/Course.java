package deepclone;

public class Course implements Cloneable{

	 private String c1;
	 private String c2;
	 private String c3;
	
	public Course(String c1, String c2, String c3)
	{
		System.out.println("this of c : "+this);
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
//	public String toString()
//	{
//		return "[c1 = "+c1+" c2 = "+c2+" c3 = "+c3+"]";
//	}
	
	public String getC1()
	{
		return c1;
	}
	
	public String getC2()
	{
		return c2;
	}
	
	public String getC3()
	{
		return c3;
	}
	
	public void setC1(String c)
	{
		c1 = c;
	}
	
	public void setC2(String c)
	{
		c2 = c;
	}
	
	public void setC3(String c)
	{
		c3 = c;
	}
	
	
}
