package day_03;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name)
	{
		this.name = name;
		this.age = 18;
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void displayPersonInfo()
	{
		System.out.println("name = "+name+"\tage = "+age);
	}
	
	public static void main(String args[])
	{
		Person p = new Person("abc");
		p.displayPersonInfo();
		
		Person p1 = new Person("def",22);
		p1.displayPersonInfo();
	}

}
