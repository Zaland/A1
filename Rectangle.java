//class rectangle
public class Rectangle extends Shape
{
	private int brightness;
	private float area;
	private float length;
	private float height;
	
	//constructor creates a circle with given values
	public Rectangle(int brightness, float length, float height)
	{
		if(brightness < 0) 			this.brightness = 0;
		else if(brightness > 100) 	this.brightness = 100;
		else 						this.brightness = brightness;
		
		if(length < 0)	this.length = 0;
		else			this.length = length;
		
		if(height < 0)	this.height = 0;
		else			this.height = height;
		
		area = length * height;
	}
	
	//calculates area
	public void calcArea()
	{
		area = length * height;
	}
	
	//prints information on rectangle
	public String toString()
	{
		return "Rectangle, brightness: " + brightness + ", area: " + area + ", length: " + length + ", height: " + height + "\n";
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
