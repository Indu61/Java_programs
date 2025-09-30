package interfacedemo;

public class Test {

	public static void main(String[] args) {
		
//		ArithCal a = new ArithCal(); // can not instanciate interface
		
		CalNumber a = new CalNumber();
		System.out.println("sum = "+a.add(2, 3));
	    System.out.println("sub = "+a.sub(3, 2));
	    System.out.println("avg = "+a.avg(5, 4));
	    System.out.println("min = "+a.min(7, 1));
	    System.out.println("factorial = "+a.fact(3));
	}
}

/*
 * class can extends only one class */
 */