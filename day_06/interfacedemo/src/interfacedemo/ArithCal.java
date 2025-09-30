package interfacedemo;

//interface must contain all abstract methods
//by default all methods are abstract
//data members and functions must be public 
// data members by default static, final


/*
 * a class can extends only one class
 * an interface can not extends another class
 * an interface can extends one or more interface
 * a class can implements one or more interfaces
 * an interface can not implements another interface
 * */

public interface ArithCal {

	// this are class variable
	public int a = 10;  // public static final int a = 10 // both stmt same
	public static final int b = 20;
	
	// this a and b are local variable
	public int add(int a, int b); // public abstract int add(int a, int b) // both stmt same
	
	public abstract int sub(int a, int b);

}
