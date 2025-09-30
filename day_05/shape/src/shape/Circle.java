package shape;

public class Circle extends Shape{

	private final float PI;
//	
//	public Circle()
//	{
//		PI = 3.14f;
//	}
//	
	public Circle(float radius)
	{
		super(radius);
		PI = 3.14f;
	}
	
	@Override
	public float calArea()
	{
		return PI*getRadius()*getRadius();
	}

	

	 
}
