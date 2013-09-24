import java.util.ArrayList;
import java.util.Collections;

//class main
public class Main
{
	public static void main(String[] args)
	{
		Shape triangle = new Triangle(100, 1.0f, 6.0f);
		System.out.println(triangle);
		
		Shape square = new Square(0, 2.0f);
		System.out.println(square);
		
		System.out.println();
		ComplexShape complex = new ComplexShape();
		complex.add(triangle);
		complex.add(square);
		System.out.println(complex);
		
		for(Shape s : complex)
			System.out.println("-> " + s);
			
		complex.add(new Rectangle(50, 2.0f, 1.0f));
		System.out.println(complex);
			
		System.out.println();
		ArrayList<Shape> shapeArray = new ArrayList<Shape>();
		shapeArray.add(triangle);
		shapeArray.add(square);
		shapeArray.add(new Circle(66, 1.0f));
		shapeArray.add(new Circle(33, 2.0f));
		shapeArray.add(new Square(50, 10.0f));
		shapeArray.add(new Rectangle(90, 25.0f, 4.0f));
		shapeArray.add(complex);
		//Collections.sort(shapeArray);
		for(Shape s : shapeArray)
			System.out.println(" * " + s);
	}	
}
