import java.util.Scanner;

public class Percentage {

	private String sub;
	private int marks;
	
	public Percentage()
	{
		sub = "\0";
		marks = 0;
	}
	
	public Percentage(String s, int m)
	{
		sub = s;
		marks = m;
	}
	
	public static void main(String args[])
	{
		/*Percentage p1 = new Percentage("Java",100);
		Percentage p2 = new Percentage("Cpp",90);
		Percentage p3 = new Percentage("OS",60);
		Percentage p4 = new Percentage("DBT",40);
		Percentage p5 = new Percentage("DSA",90);*/
		Scanner s = new Scanner(System.in);
		
		//float per = ((p1.marks + p2.marks + p3.marks + p4.marks + p5.marks)*100)/500;
		
		//System.out.println("per = "+per);
		
		
		Percentage[] p = new Percentage[5];
		
		p[0] = new Percentage("Java",100);
		p[1] = new Percentage("Cpp",90);
		p[2] = new Percentage("OS",60);
		p[3] = new Percentage("DBT",40);
		p[4] = new Percentage("DSA",90);
		int sum = 0;
		
		for(int i=0; i<5; i++)
		{
			//System.out.println("Enter Subject : ");
			//p[i].sub = s.next();
			
//			System.out.println("Enter marks : ");
//			p[i].marks = s.nextInt();
			sum = sum + p[i].marks;
			System.out.println("sum = "+sum);
			
		}
		
		System.out.println("Pecentage = "+(sum*100)/500);
		
//		Percentage[] p1 = new Percentage[5];
//		
//		for(int i=0; i<5; i++)
//		{
//			System.out.println("Enter Subject : ");
//			p1[i].sub = s.next();
//			System.out.println("Enter marks : ");
//			p1[i].marks = s.nextInt();
//		}
//		
//		for(int i=0; i<5; i++)
//		{
//			System.out.println("sub = "+p1[i].sub); 
//			System.out.println("marks = "+p1[i].marks);
//		}
		
		s.close();
		
	}
}
