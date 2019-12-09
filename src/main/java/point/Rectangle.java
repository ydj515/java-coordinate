package point;

import java.util.*;

public class Rectangle extends Shape {

	public Rectangle(List<Point> points, String shapeName) {
		super(points, shapeName);
	}

	private double calculateSides() {
		int width = points.get(1).getX() - points.get(0).getX();
		int height = points.get(2).getY() - points.get(0).getY();

		return width * height;
	}

	@Override
	public double getResult() {

		Collections.sort(points);

		return calculateSides();
	}

	@Override
	public String getShapeName() {
		return shapeName + "의 넓이는 ";
	}
}
