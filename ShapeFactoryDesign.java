package areaofshapes;

public class ShapeFactoryDesign {

	public Shapes getinstance(String str)
	{
		if(str.equals("square")) {
			
			return new Square();
			
		}
		else if(str.equals("circle")) {
			
			return new Rectangle();
			
		}
		else
		{
			return new Circle();
		}
	}
}
