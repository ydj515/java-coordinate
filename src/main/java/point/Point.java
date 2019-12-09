package point;

public class Point implements Comparable<Point> {

	private final int MAX_X = 24;
	private final int MAX_Y = 24;

	private final int x;
	private final int y;

	public Point(int x, int y) {
		validate(x, y);
		this.x = x;
		this.y = y;

	}

	private void validate(int x, int y) {
		if (x > MAX_X || y > MAX_Y) {
			throw new IllegalArgumentException("좌표의 최대값은" + MAX_X + "이하 입니다.");
		}
	}

	public double getDistance(Point secondPoint) {
		return Math.sqrt(Math.pow((x - secondPoint.getX()), 2) + Math.pow((y - secondPoint.getY()), 2));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int compareTo(Point o) {

		int standard = x - o.y; // y 순으로 정렬

		if (standard == 0) { // y가 같다면 x순으로 정렬
			standard = y - o.y;
		}

		return standard;
	}
}
