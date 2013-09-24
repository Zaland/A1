//class regular triangle
public class RegTri extends Triangle
{
	private int brightness;
	private float area;
	private float baseLength;
	
	public RegTri(int brightness, float baseLength)
	{
		super(brightness, baseLength, baseLength);
	}
	
	//calculates area for a regular triangle
	public void calcArea()
	{
		area = (baseLength * baseLength)/2;
	}
	
	public String toString()
	{
		return "Regular Triangle, brightness: " + brightness + ", area: " + area + ", base length: " + baseLength + "\n";
	}
	
	//abstract methods
	public int getBrightness()
	{
		return brightness;
	}
	
	public float getArea()
	{
		return area;
	}
}
