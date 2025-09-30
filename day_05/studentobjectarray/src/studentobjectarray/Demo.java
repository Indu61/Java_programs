package studentobjectarray;
import java.util.Scanner;

public class Demo {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Entert roll no:");
//		int r = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("Enter name: ");
//		String nm = sc.nextLine();
//		
//		System.out.println("Enter marks");
//		int m = sc.nextInt();
//		
//		Student s = new Student(r, nm, m);
//		
//		System.out.println(s);
		
		System.out.println("Enter Number of Student you want enter:");
    	int size = sc.nextInt();
		Student s[] = new Student[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter student new info");
			
			System.out.println("Entert roll no:");
			int r = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter name: ");
			String nm = sc.nextLine();
			
			int[] m = new int[6];
			
			System.out.println("Enter 6 subject marks");
			for(int j=0; j<6; j++)
			{
				if(m[j] <= 100)
				{
					System.out.println("Enter subejct "+(j+1)+" marks");
					m[j] = sc.nextInt();
				}
				else
				{
					System.out.println("invalid marks");
				}
				
			}
			
			s[i] = new Student(r, nm, m);
		}
		
		System.out.println("-------------Student Info---------------------------");
		for(Student i : s)
		{
			System.out.println(i);
			System.out.println("Roll no: "+i.getRollNo()+"\tname: "+i.getName()+"\tpercentage of student "+" name "+i.getPercentage());
		}
		
		
		Student.getTopStudent(s);
	}
}
