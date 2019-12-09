package point;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class PointTest {

	@Test
	public void testPointGetX() {

		Point point = new Point(1, 3);

		assertEquals(1, point.getX());
	}

	@Test
	public void testPointGetY() {

		Point point = new Point(1, 3);

		assertEquals(3, point.getY());
	}

	@Test
	public void testPointGetDistance() {

		Point firstPoint = new Point(1, 3);
		Point secondPoint = new Point(3, 5);

		assertEquals(2.828, firstPoint.getDistance(secondPoint), 0.001);
	}

	@Test
	public void testValidate() {
		assertThrows(IllegalArgumentException.class, () -> new Point(30,30));
	}
}
