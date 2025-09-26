
public class ThisKeyword {

	private String name, email;
	private int id;
	public ThisKeyword()
	{
		System.out.println("Default constructor called....");
		name = "\0";
		email = "\0";
		id = 0;
	}
	
	public ThisKeyword( int id, String name, String email)
	{
		System.out.println("para constructor called....");
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//setter methods (mutator)
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	//getter method (accessor)
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Id = "+id+"\tName = "+name+"\tEmail = "+email);
	}
	
	public String toString()
	{
		return "Information of student : \nId = "+id+"\nname = "+name+"\nemail = "+email;
	}
	
	public static void main(String args[])
	{
		
		ThisKeyword obj = new ThisKeyword();
		//System.out.println(obj);
		obj.setName("Mrunal");
		obj.setEmail("mrunal@gmail.com");
		obj.displayStudentInfo();
		
		ThisKeyword obj1 = new ThisKeyword(12,"Indu", "indu@gmail.com");
		System.out.println(obj1);
		
		System.out.println("name = "+obj1.getName());
		System.out.println("id = "+obj1.getId());
		System.out.println("email = "+obj1.getEmail());
		
	}
}
