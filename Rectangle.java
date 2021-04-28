package areaofshapes;

public class Rectangle  implements Shapes{
	
	int length = 12;
	int width = 10;
	
	public void calculateArea() {
		double area = length*width;
		System.out.println("area of rectangle = " + area);
	}

}
