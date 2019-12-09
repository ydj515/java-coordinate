package point;

import java.util.*;

public class PointInputView {
	private final static Scanner scanner = new Scanner(System.in);

	public static List<String> inputPoints() {
		System.out.println("좌표를 입력하세요.");
		return Arrays.asList(scanner.nextLine().split("-"));
	}
}
