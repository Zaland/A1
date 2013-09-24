//abstract class shape
import java.util.*;

public abstract class Shape implements Comparable
{
	public abstract int getBrightness();
	public abstract float getArea();
	
	public ArrayList<Shape> sort(ArrayList<Shape> list)
	{
		ArrayList<Shape> list1 = new ArrayList<Shape>();
		float lowA = 1000000000;
		int index = 0, lowB = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getArea() < lowA)
			{
				lowA = list.get(i).getArea();
				lowB = list.get(i).getBrightness();
				index = i;
			}
			
			else if(list.get(i).getArea() == lowA)
			{
				if(list.get(i).getBrightness() > lowB)
				{
					lowA = list.get(i).getArea();
					lowB = list.get(i).getBrightness();
					index = i;
				}
			}
		}
		
		list1.add(list.get(index));
		list.remove(index);
		
		return list1;
	}

}
