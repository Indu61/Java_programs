//C = (°F - 32) × 5/9

import java.util.Scanner;

public class TemperatureConversion {

	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature : ");
		float f = s. nextFloat();
		
		float c = ((f - 32) * 5)/9;
		
		System.out.println("f = "+c);
		s.close();
	}
}
