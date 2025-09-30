package shallowclonning;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course c = new Course("math","chem","phy");
		
		Student s = new Student(1, "Indu", c);
		
		Student s1 = (Student) s.clone();
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("__________________________________________________________________________");
		s.getCourses().setC1("bio");
		s.setRollNo(7);
		
		System.out.println(s);
	    System.out.println(s1);
		
		
	}
}
