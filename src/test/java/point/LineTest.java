package point;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class LineTest {
	
	Shape line;
	String shapeName = "직선";
	List<Point> points;
	
	@Test
	public void testPointGetResult() {
		
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		
		line = new Line(points, shapeName);
		assertEquals(1.414, line.getResult(),0.001);
	}
	
	@Test
	public void testGetShapeName() {
		points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		
		line = new Line(points, shapeName);
		assertEquals(line.getShapeName(), shapeName + "의 거리는 ");
	}
	

}
