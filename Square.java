package areaofshapes;

public class Square implements Shapes{
	
	int side = 4;
	
	public void calculateArea() {
		double area = side*side;
		System.out.println("area of square = " + area);
	}

}
