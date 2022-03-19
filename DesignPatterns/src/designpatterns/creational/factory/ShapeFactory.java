package designpatterns.creational.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType == "CIRCLE") {
			return new Circle();
		}
		if (shapeType == "RECTANGLE") {
			return new Rectangle();
		}
		if (shapeType == "SQUARE") {
			return new Square();
		}
		return null;
	}
}
