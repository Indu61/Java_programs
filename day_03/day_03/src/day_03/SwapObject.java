package day_03;

public class SwapObject {

	private int id;
	private String name;
	
	public SwapObject()
	{
		id = 0;
		name = null;
	}
	
	public SwapObject(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "Id = "+id+"\tname = "+name;
	}
	
//	public static SwapObject[] swap(SwapObject obj1, SwapObject obj2)
//	{
//		SwapObject temp = obj1;
//		obj1 = obj2;
//		obj2 = temp;
//		
////		System.out.println("obj1 :\n"+obj1);
////		System.out.println("obj2 :\n"+obj2);
//		return new SwapObject[] {obj1, obj2};
//	}
	
	public static void swap(SwapObject[] res)
	{
		SwapObject temp = res[0];
		res[0] = res[1];
		res[1] = temp;
		
	}
	
	public static void main(String[] args)
	{
		SwapObject obj1 = new SwapObject(1,"a");
		SwapObject obj2 = new SwapObject(2,"b");
//		
//		System.out.println("Before Swapping");
//		System.out.println("obj1 :\n"+obj1);
//		System.out.println("obj2 :\n"+obj2);
//		
//    	System.out.println("After Swapping");
//    	SwapObject[] res = swap(obj1, obj2);
//    	
//    	for(int i = 0; i < 2; i++)
//    	{
//    		System.out.println("id = "+res[i].id+"\nname = "+res[i].name);
//    	}
//    	
//    	
//    	obj1 = res[0];
//    	obj2 = res[1];
//		System.out.println("obj1 :\n"+obj1);
//		System.out.println("obj2 :\n"+obj2);
		
		SwapObject[] res = {obj1, obj2};
		
		System.out.println("Before swaping");
		for(SwapObject i: res)
		{
			System.out.println(i);
		}
		
		swap(res);
		
		System.out.println("After swaping");
		
		for(SwapObject i: res)
		{
			System.out.println(i);
		}
		
		
		
	}
	
	
}
