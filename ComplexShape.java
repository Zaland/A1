import java.util.ArrayList;
import java.util.Iterator;

//class Complex Shape
public class ComplexShape extends Shape implements Iterable
{
	private ArrayList<Shape> list;	
	private float area;
	private int brightness;
	
	public ComplexShape()
	{
		list = new ArrayList<Shape>();
		brightness = 0;
		area = 0;
	}
	
	public void add(Shape shape)
	{
		list.add(shape);
		
		for(int i = 0; i < list.size(); i++)
			brightness += list.get(i).getBrightness();
		brightness /= list.size();
		
		area += shape.getArea();
	}
	
	//Abstract Methods
	public int getBrightness()
	{
		return brightness;
	}
	
	public float getArea()
	{
		return area;
	}

	@Override
	public Iterator<Shape> iterator() 
	{
		
	}
}
