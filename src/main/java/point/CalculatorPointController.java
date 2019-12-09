package point;

import java.util.*;
import java.util.regex.*;

public class CalculatorPointController {

	public void run() {

		while (true) {
			List<String> pointsString = PointInputView.inputPoints();

			validateOverlapPoints(pointsString);

			List<Point> points = convertStringToPoint(pointsString);

			Shape shape = ShapeManager.getShape(points);

			PointOutputView.printResult(shape.getShapeName(), shape.getResult());
		}

	}

	private void validateOverlapPoints(List<String> inputs) {
		
		Set<String> set = new HashSet<String>(inputs);
		
		if (set.size() != inputs.size()) {
			throw new IllegalArgumentException("위치가 같은 점이 존재합니다. 점의 위치는 모두 달라야 합니다.");
		}
	}

	private List<Point> convertStringToPoint(List<String> pointsString) {

		List<Point> points = new ArrayList<Point>();

		Pattern pointPattern = Pattern.compile("[(]([\\d]*)[,]([\\d]*)[)]");

		pointsString.stream().forEach(i -> {
			Matcher matcher = pointPattern.matcher(i);
			matcher.matches();

			int x = Integer.parseInt(matcher.group(1));
			int y = Integer.parseInt(matcher.group(2));

			points.add(new Point(x, y));
		});

		return points;
	}

}
