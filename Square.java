//class square
public class Square extends Rectangle
{
	private int brightness;
	private float area;
	private float length;
	
	//constructor creates a circle with given values
	public Square(int brightness, float length)
	{
		super(brightness, length, length);
	}
	
	//calculates area
	public void calcArea()
	{
		area = length * length;
	}
	
	//prints information on square
	public String toString()
	{
		return "Square, brightness: " + brightness + ", area: " + area + ", length: " + length + "\n";
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
