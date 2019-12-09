package point;

import java.util.*;

public abstract class Shape {

	protected List<Point> points;
	protected String shapeName;
	

	public Shape(List<Point> points, String shapeName) {
		this.points = points;
		this.shapeName = shapeName;
	}

	public double getResult() {
		return 0;
	}
	
	public String getShapeName() {
		return shapeName;
	}

}
