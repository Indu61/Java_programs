package shape;

public class Reactangle extends Shape{

	public Reactangle(float len, float br)
	{
		super(len, br);
	}
	
	@Override
	public float calArea()
	{
		return 2*getLen()*getBr();
	}
}
