package point;

import java.util.*;
import java.util.stream.*;

public class Triangle extends Shape {

	private List<Double> sides;

	public Triangle(List<Point> points, String shapeName) {
		super(points, shapeName);
		sides = new ArrayList<>();
	}

	private void calculateSides() {
		IntStream.range(0, points.size()).forEach(i -> {
			sides.add(Math.sqrt(Math.pow((points.get(i).getX() - points.get((i + 1) % 3).getX()), 2)
					+ Math.pow((points.get(i).getY() - points.get((i + 1) % 3).getY()), 2)));
		});

	}

	private double carcluateS() {
		double sum = 0;

		for (int i = 0; i < points.size(); i++) {
			sum += sides.get(i);
		}

		return sum / 2;
	}

	@Override
	public double getResult() {

		calculateSides();
		double s = carcluateS();

		return Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)));
	}

	@Override
	public String getShapeName() {
		return shapeName + "의 넓이는 ";
	}
}
