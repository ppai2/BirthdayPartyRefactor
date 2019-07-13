package scrap.heap.refactor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Order class
 *
 * @author prasan
 */
public class OrderTest {

	@Test
	public void testOrderWithNullBalloon() {
		final Balloon testBalloonObject = null;
		final Cake testCakeObject = new Cake("abc", "def", "ghi", "jkl", "mno");
		final Order testOrderObject = new Order("test order object", testBalloonObject, testCakeObject);
		final boolean actualFlag = testOrderObject.order();
		assertFalse("testOrderObject is expected to be false", actualFlag);
	}

	@Test
	public void testOrderWithNullCake() {
		final Balloon testBalloonObject = new Balloon("abc", "def", "ghi");;
		final Cake testCakeObject = null;
		final Order testOrderObject = new Order("test order object", testBalloonObject, testCakeObject);
		final boolean actualFlag = testOrderObject.order();
		assertFalse("testOrderObject is expected to be false", actualFlag);
	}

	@Test
	public void testOrderWithValidObjects() {
		final Balloon testBalloonObject = new Balloon("abc", "def", "ghi");
		final Cake testCakeObject = new Cake("abc", "def", "ghi", "jkl", "mno");
		final Order testOrderObject = new Order("test order object", testBalloonObject, testCakeObject);
		final boolean actualFlag = testOrderObject.order();
		assertNotNull("testOrderObject is not expected to be null", testOrderObject.toString());
		assertTrue("testOrderObject is expected to be true", actualFlag);
	}
}
