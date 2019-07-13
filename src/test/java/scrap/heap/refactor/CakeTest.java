package scrap.heap.refactor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Cake class
 *
 * @author prasan
 */
public class CakeTest {

	private Cake cake = null;

	@Before
	public void setUp() throws Exception {
		cake = new Cake("abc", "def", "ghi", "jkl", "mno");
	}

	@Test
	public void testGetFlavor() {
		final String expectedCakeFlavor = "abc";
		final String actualCakeFlavor = cake.getFlavor();
		assertEquals("actualCakeFlavor is expected to match the expectedCakeFlavor", expectedCakeFlavor, actualCakeFlavor);

	}

	@Test
	public void testGetFrostingFlavor() {
		final String expectedCakeFrostingFlavor = "def";
		final String actualCakeFrostingFlavor = cake.getFrostingFlavor();
		assertEquals("actualCakeFrostingFlavor is expected to match the expectedCakeFrostingFlavor", expectedCakeFrostingFlavor, actualCakeFrostingFlavor);
	}

	@Test
	public void testGetShape() {
		final String expectedCakeShape = "ghi";
		final String actualCakeShape = cake.getShape();
		assertEquals("actualCakeShape is expected to match the expectedCakeShape", expectedCakeShape, actualCakeShape);
	}

	@Test
	public void testGetSize() {
		final String expectedCakeSize = "jkl";
		final String actualCakeSize = cake.getSize();
		assertEquals("actualCakeSize is expected to match the expectedCakeSize", expectedCakeSize, actualCakeSize);
	}

	@Test
	public void testGetCakeColor() {
		final String expectedCakeColor = "mno";
		final String actualCakeColor = cake.getCakeColor();
		assertEquals("actualCakeColor is expected to match the expectedCakeColor", expectedCakeColor, actualCakeColor);
	}
}
