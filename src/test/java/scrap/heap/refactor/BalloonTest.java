package scrap.heap.refactor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Balloon class
 *
 * @author prasan
 */
public class BalloonTest {

	private Balloon testBalloonObject = null;

	@Before
	public void setUp() throws Exception {
		testBalloonObject = new Balloon("abc", "def", "ghi");
	}

	@Test
	public void testGetBalloonColor() {
		final String expectedBalloonColor = "abc";
		final String actualBalloonColor = testBalloonObject.getBalloonColor();
		assertEquals("actualBalloonColor is expected to match the expectedBalloonColor", expectedBalloonColor, actualBalloonColor);
	}

	@Test
	public void testGetMaterial() {
		final String expectedBalloonMaterial = "def";
		final String actualBalloonMaterial = testBalloonObject.getMaterial();
		assertEquals("actualBalloonMaterial is expected to match the expectedBalloonMaterial", expectedBalloonMaterial, actualBalloonMaterial);
	}

	@Test
	public void testGetNumber() {
		final String expectedBalloonNumber = "ghi";
		final String actualBalloonNumber = testBalloonObject.getNumber();
		assertEquals("actualBalloonNumber is expected to match the expectedBalloonNumber", expectedBalloonNumber, actualBalloonNumber);
	}
}
