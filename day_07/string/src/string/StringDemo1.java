package string;

public class StringDemo1 {

	public static void main(String args[])
	{
		String str1 = "Indu";
		String str2 = "Indu";
		String str3 = new String("Indu");
		String str4 = new String("Indu");
		String str5 = "Gadagi";
		
		// compare address
		System.out.println(str1 == str2); //true
		
		System.out.println(str1 == str3);  //false
		
		System.out.println(str3 == str4);  //false
		
		System.out.println(str1 == str5);  //false
		
		//compare string char return equal or not 
		System.out.println(str1.equals(str2));  //true
		
		System.out.println(str3.equals(str4));  //true
		
		
		/*
		 * compare string bit by bit return integer value 
		 * if 2 strings are equal return 0
		 * if 1st string is greater than 2nd string return +ve val
		 * if 1st string is less than 2nd reurn -ve val*/
		
		System.out.println(str1.compareTo(str2)); //0
		System.out.println(str1.compareTo(str4)); //0
		System.out.println(str1.compareTo(str5)); //+ve val
		System.out.println(str5.compareTo(str1)); //-ve val
		
		//substring
		System.out.println(str1.substring(0,2));
		
		//trim - remove space at beginning and end of string
		
		String str6 = " Indu Gadagi ";
		
		System.out.println(str6.length());
		System.out.println((str6.trim()).length());
		
        //Formating
		
		double d = 3.143424d;
		
		System.out.println(String.format("%.2f",d));
		
		
		
	}
}
