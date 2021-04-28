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

}
