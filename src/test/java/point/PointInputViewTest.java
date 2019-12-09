package point;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class PointInputViewTest {

	@Test
	public void testInputPoints() {

		List<String> returnInputList = new ArrayList<String>();
		returnInputList.add("(1,1)");
		returnInputList.add("(2,3)");

		assertEquals(returnInputList, PointInputView.inputPoints());
	}
}
