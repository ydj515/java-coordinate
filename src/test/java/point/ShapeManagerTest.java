package point;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class ShapeManagerTest {
	
	@Test
	public void testGetShape() {
		List<Point> points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(3,3));
		points.add(new Point(3,1));
		points.add(new Point(1,3));
		
		Shape rectangle = new Rectangle(points, "사각형");
		
		assertEquals(rectangle.getClass() , ShapeManager.getShape(points).getClass());
	}
}
