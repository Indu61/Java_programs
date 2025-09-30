package shape;

public abstract class Shape {

	private float radius;
	private float len;
	private float br;
	
	public Shape()
	{
		
	}
	
	public Shape(float radius)
	{
		this.radius = radius;
	}
	
	public Shape(float len, float br)
	{
		this.len = len;
		this.br = br;
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public float getLen()
	{
		return len;
	}
	
	public float getBr()
	{
		return br;
	}
	
	public abstract float calArea();
	
}
