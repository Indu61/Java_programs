public class FrequencyCount {
public static void main(String args[])
{
	 int a[] = {3, 5, 2, 3, 7, 3, 1, 3};
	 
	 int no = 3;
	 
	 int count = 0;
	 
	 for(int i = 0; i < a.length; i++)
	 {
		 if(a[i] == 3)
		 {
			 count ++;
		 }
	 }
	 System.out.println("the number "+no+" appears "+count+" times.");
}
}
