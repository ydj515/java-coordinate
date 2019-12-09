package point;

import java.util.*;

public class Line extends Shape {

	public Line(List<Point> points, String shapeName) {
		super(points, shapeName);
	}

	@Override
	public double getResult() {
		return Math.sqrt(Math.pow((points.get(0).getX() - points.get(1).getX()), 2)
				+ Math.pow((points.get(0).getY() - points.get(1).getY()), 2));
	}

	@Override
	public String getShapeName() {
		return shapeName + "의 거리는 ";
	}

}
