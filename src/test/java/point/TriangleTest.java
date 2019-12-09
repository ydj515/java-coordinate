package point;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class TriangleTest {

	Shape triangle;
	String shapeName = "삼각형";
	List<Point> points;
	List<Double> sides;
	
	@Before
	public void setup() {
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(2,1));
		
		triangle = new Triangle(points, shapeName);
		
		sides = new ArrayList<>();
	}
	
	@Test
	public void testPointGetResult() {
		
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(2,1));
		
		
		triangle = new Triangle(points, shapeName);
		
		assertEquals(0.5, triangle.getResult(),0.001);
	}
	
	@Test
	public void testGetShapeName() {
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(2,1));
		
		triangle = new Triangle(points, shapeName);
		
		assertEquals(triangle.getShapeName(), shapeName + "의 넓이는 ");
	}
	
}
