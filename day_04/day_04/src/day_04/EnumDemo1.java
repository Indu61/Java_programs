package day_04;

public class EnumDemo1 {

	enum subjectAndMarks {JAVA(100), OS(50), DBT(50);
		
		private int marks;
		
		private subjectAndMarks(int marks)
		{
			this.marks = marks;
		}
		
		public int getMarks()
		{
			return marks;
		}
	};
	
	public static void main(String... abc)
	{
		subjectAndMarks sub = subjectAndMarks.JAVA;
		
		System.out.println("subject = "+sub+"\tMarks = "+sub.getMarks());
	}
}
