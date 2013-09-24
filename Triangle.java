//class triangle
public class Triangle extends Shape
{
	private int brightness;
	private float area;
	private float baseLength;
	private float height;
	
	//constructor creates a triangle with given values
	public Triangle(int brightness, float baseLength, float height)
	{
		if(brightness < 0) 			this.brightness = 0;
		else if(brightness > 100) 	this.brightness = 100;
		else 						this.brightness = brightness;
		
		if(baseLength < 0)	this.baseLength = 0;
		else				this.baseLength = baseLength;
		
		if(height < 0)	this.height = 0;
		else			this.height = height;
		
		area = (baseLength * height)/2f;
	}
	
	//calculates area of the triangle
	public void calcArea()
	{
		area = (baseLength * height)/2f;
	}
	
	//prints information on triangle
	public String toString()
	{
		return "Triangle, brightness: " + brightness + ", area: " + area + ", base length: " + baseLength + ", height: " + height + "\n";
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
