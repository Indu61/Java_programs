public class RotateArray {

	public static void main(String args[])
	{
		int[] arr = {10, 20, 30, 40, 50, 60};
		
		int k = 3, start = k - 1, end = arr.length - 1;
		
		while(start >= 0 && end >= arr.length - k)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end --;
			start --;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			 System.out.println(arr[i]+" ");
		}
		
	}
}
