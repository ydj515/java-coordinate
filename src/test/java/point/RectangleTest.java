package point;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class RectangleTest {

	Shape rectangle;
	String shapeName = "사각형";
	List<Point> points;
	
	@Before
	public void setup() {
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(3,3));
		points.add(new Point(3,1));
		points.add(new Point(1,3));
		
		rectangle = new Rectangle(points, shapeName);
	}
	
	@Test
	public void testPointGetResult() {
		
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(3,3));
		points.add(new Point(3,1));
		points.add(new Point(1,3));
		
		rectangle = new Rectangle(points, shapeName);
		
		assertEquals(4.0, rectangle.getResult(),0.001);
	}
	
	@Test
	public void testGetShapeName() {
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(2,1));
		
		rectangle = new Triangle(points, shapeName);
		
		assertEquals(rectangle.getShapeName(), shapeName + "의 넓이는 ");
	}
	
}
