package day_03;

public class Greaterin3Num {

	public static void main(String... args)
	{
		int a = 2, b = 6, c = 10;
		
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max = "+max);
	}
}
