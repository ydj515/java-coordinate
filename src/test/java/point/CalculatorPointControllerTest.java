package point;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class CalculatorPointControllerTest {

	@Test
	public void testValidOverlapPoints() {

		List<String> points = new ArrayList<>();
		points.add("(1,1)");
		points.add("(1,1)");

		assertThrows(IllegalArgumentException.class, () -> validateOverlapPoints(points));
	}

	@Test
	public void testConvertStringToPoint() {

		List<String> points = new ArrayList<>();
		points.add("(1,1)");
		points.add("(1,2)");
		points.add("(2,2)");
		
		List<Point> convertedPoints = new ArrayList<>();
		convertedPoints.add(new Point(1,1));
		convertedPoints.add(new Point(1,2));
		convertedPoints.add(new Point(2,1));
		

		assertEquals(convertedPoints.getClass(), convertStringToPoint(points).getClass());
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
