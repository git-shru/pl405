package areaofshapes;

public class Main {

	public static void main(String[] args) {

		ShapeFactoryDesign sfd = new ShapeFactoryDesign();
		
		Shapes obj1 = sfd.getinstance("circle");
		
		obj1.calculateArea();
		
		Shapes obj2 = sfd.getinstance("square");
		
		obj2.calculateArea();
		
		Shapes obj3 = sfd.getinstance("rectangle");
		
		obj3.calculateArea();

	}




public static class ShapeFactoryDesign {

	public Shapes getinstance(String str)
	{
		if(str.equals("square")) {
			
			return new Square();
			
		}
		else if(str.equals("rectangle")) {
			
			return new Rectangle();
			
		}
		else
		{
			return new Circle();
		}
	}
}

public interface Shapes {

	void calculateArea();
}

public class Square implements Shapes{
	
	int side = 4;
	
	public void calculateArea() {
		double area = side*side;
		System.out.println("area of square = " + area);
	}

}

public class Circle  implements Shapes{
	
	int radius = 15;
	
	public void calculateArea() {
		double area = 3.14*radius*radius;
		System.out.println("area of circle = " + area);
	}

}

public class Rectangle  implements Shapes{
	
	int length = 12;
	int width = 10;
	
	public void calculateArea() {
		double area = length*width;
		System.out.println("area of rectangle = " + area);
	}

}

}
