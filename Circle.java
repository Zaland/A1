//class circle
public class Circle extends Shape
{
	private int brightness;
	private float area;
	private float radius;
	
	//constructor creates a circle with given values
	public Circle(int brightness, float radius)
	{
		if(brightness < 0) 			this.brightness = 0;
		else if(brightness > 100) 	this.brightness = 100;
		else 						this.brightness = brightness;
		
		if(radius < 0)	this.radius = 0;
		else			this.radius = radius;
		
		area = 2f * 3.14f * radius * radius;
	}
	
	//calculates area for circle
	public void calcArea()
	{
		area = 2f * 3.14f * radius * radius;
	}
	
	//prints information on circle
	public String toString()
	{
		return "Circle, brightness: " + brightness + ", area: " + area + ", radius: " + radius + "\n";
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
