package day_04;
import static java.lang.System.out;

public class EnumDemo {

	enum Month{JAN, FEB, MAR, APR} //with semicolon without semicolon both work
	
	public static void main(String args[])
	{
		Month m = Month.APR;
		out.println(m);
		
		m = Month.FEB;
		out.println(m);
	}
}
