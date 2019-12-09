package point;

import java.util.*;

public class ShapeManager {

	private static Map<Integer, Shape> shapeMap = new HashMap<>();

	public static Shape getShape(List<Point> points) {
		shapeMap.put(2, new Line(points, "직선"));
		shapeMap.put(3, new Triangle(points, "삼각형"));
		shapeMap.put(4, new Rectangle(points, "사각형"));

		return shapeMap.get(points.size());
	}
}
