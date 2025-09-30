package garbagecollector;

//by default all classes extends Object class
public class GCDemo extends Object{
	
	public void finalize()
	{
		System.out.println("GC called");
	}

	public static void main(String[] args) {
		
		GCDemo g1 = new GCDemo();
		GCDemo g2 = new GCDemo();
		GCDemo g3 = new GCDemo();
		
		g1 = null;
		g2 = null;
		g3 = null;
		
		System.gc();
	}
}
