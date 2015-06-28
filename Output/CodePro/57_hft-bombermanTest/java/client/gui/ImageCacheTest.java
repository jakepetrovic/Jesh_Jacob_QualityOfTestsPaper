package client.gui;

import java.awt.Image;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImageCacheTest</code> contains tests for the class <code>{@link ImageCache}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ImageCacheTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ImageCache fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ImageCache fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ImageCache fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ImageCache fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ImageCache fixture5;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ImageCache getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ImageCache((Image) null, -1, -1, -1, -1);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ImageCache getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ImageCache((Image) null, 0, 0, 0, 0);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ImageCache getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new ImageCache((Image) null, 1, 1, 1, 1);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ImageCache getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new ImageCache((Image) null, 7, 7, 7, 7);
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImageCache
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ImageCache getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new ImageCache((Image) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
		}
		return fixture5;
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_1()
		throws Exception {
		Image img = null;
		int x = 0;
		int y = 0;
		int w = 0;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(0, result.getX());
		assertEquals(0, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_2()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_3()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 7;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(7, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_4()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 1;
		int w = 1;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(0, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_5()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 7;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(1, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_6()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 1;
		int w = 0;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(7, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_7()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 7;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(0, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_8()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 1;
		int w = 0;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_9()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 1;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(7, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_10()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 1;
		int w = 0;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(1, result.getX());
		assertEquals(0, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_11()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 1;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(1, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_12()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 7;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(7, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_13()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 1;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(0, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_14()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 7;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_15()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 0;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(7, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_16()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 7;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(0, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_17()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 0;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(1, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_18()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 1;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(7, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_19()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 7;
		int w = 0;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(7, result.getX());
		assertEquals(0, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_20()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 1;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_21()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 1;
		int w = 7;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(7, result.getX());
		assertEquals(7, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_22()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 1;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(0, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_23()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 1;
		int w = 7;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(7, result.getX());
		assertEquals(1, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_24()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 0;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(7, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_25()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 1;
		int w = 7;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(7, result.getX());
		assertEquals(0, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_26()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 0;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(1, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_27()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 1;
		int w = 1;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(7, result.getX());
		assertEquals(7, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_28()
		throws Exception {
		Image img = null;
		int x = 1;
		int y = 0;
		int w = 0;
		int h = 0;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getY());
		assertEquals(1, result.getX());
		assertEquals(0, result.getH());
		assertEquals(0, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_29()
		throws Exception {
		Image img = null;
		int x = 7;
		int y = 1;
		int w = 1;
		int h = 1;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getY());
		assertEquals(7, result.getX());
		assertEquals(1, result.getH());
		assertEquals(1, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the ImageCache(Image,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testImageCache_30()
		throws Exception {
		Image img = null;
		int x = 0;
		int y = 7;
		int w = 7;
		int h = 7;

		ImageCache result = new ImageCache(img, x, y, w, h);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getY());
		assertEquals(0, result.getX());
		assertEquals(7, result.getH());
		assertEquals(7, result.getW());
		assertEquals(null, result.getImg());
	}

	/**
	 * Run the int getH() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetH_fixture1_1()
		throws Exception {
		ImageCache fixture = getFixture1();

		int result = fixture.getH();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getH() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetH_fixture2_1()
		throws Exception {
		ImageCache fixture = getFixture2();

		int result = fixture.getH();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getH() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetH_fixture3_1()
		throws Exception {
		ImageCache fixture = getFixture3();

		int result = fixture.getH();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getH() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetH_fixture4_1()
		throws Exception {
		ImageCache fixture = getFixture4();

		int result = fixture.getH();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getH() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetH_fixture5_1()
		throws Exception {
		ImageCache fixture = getFixture5();

		int result = fixture.getH();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the Image getImg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetImg_fixture1_1()
		throws Exception {
		ImageCache fixture = getFixture1();

		Image result = fixture.getImg();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Image getImg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetImg_fixture2_1()
		throws Exception {
		ImageCache fixture = getFixture2();

		Image result = fixture.getImg();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Image getImg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetImg_fixture3_1()
		throws Exception {
		ImageCache fixture = getFixture3();

		Image result = fixture.getImg();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Image getImg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetImg_fixture4_1()
		throws Exception {
		ImageCache fixture = getFixture4();

		Image result = fixture.getImg();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Image getImg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetImg_fixture5_1()
		throws Exception {
		ImageCache fixture = getFixture5();

		Image result = fixture.getImg();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getW() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetW_fixture1_1()
		throws Exception {
		ImageCache fixture = getFixture1();

		int result = fixture.getW();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getW() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetW_fixture2_1()
		throws Exception {
		ImageCache fixture = getFixture2();

		int result = fixture.getW();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getW() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetW_fixture3_1()
		throws Exception {
		ImageCache fixture = getFixture3();

		int result = fixture.getW();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getW() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetW_fixture4_1()
		throws Exception {
		ImageCache fixture = getFixture4();

		int result = fixture.getW();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getW() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetW_fixture5_1()
		throws Exception {
		ImageCache fixture = getFixture5();

		int result = fixture.getW();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetX_fixture1_1()
		throws Exception {
		ImageCache fixture = getFixture1();

		int result = fixture.getX();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetX_fixture2_1()
		throws Exception {
		ImageCache fixture = getFixture2();

		int result = fixture.getX();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetX_fixture3_1()
		throws Exception {
		ImageCache fixture = getFixture3();

		int result = fixture.getX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetX_fixture4_1()
		throws Exception {
		ImageCache fixture = getFixture4();

		int result = fixture.getX();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetX_fixture5_1()
		throws Exception {
		ImageCache fixture = getFixture5();

		int result = fixture.getX();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetY_fixture1_1()
		throws Exception {
		ImageCache fixture = getFixture1();

		int result = fixture.getY();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetY_fixture2_1()
		throws Exception {
		ImageCache fixture = getFixture2();

		int result = fixture.getY();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetY_fixture3_1()
		throws Exception {
		ImageCache fixture = getFixture3();

		int result = fixture.getY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetY_fixture4_1()
		throws Exception {
		ImageCache fixture = getFixture4();

		int result = fixture.getY();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetY_fixture5_1()
		throws Exception {
		ImageCache fixture = getFixture5();

		int result = fixture.getY();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the void setImg(Image) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetImg_fixture1_1()
		throws Exception {
		ImageCache fixture = getFixture1();
		Image img = null;

		fixture.setImg(img);

		// add additional test code here
	}

	/**
	 * Run the void setImg(Image) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetImg_fixture2_1()
		throws Exception {
		ImageCache fixture = getFixture2();
		Image img = null;

		fixture.setImg(img);

		// add additional test code here
	}

	/**
	 * Run the void setImg(Image) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetImg_fixture3_1()
		throws Exception {
		ImageCache fixture = getFixture3();
		Image img = null;

		fixture.setImg(img);

		// add additional test code here
	}

	/**
	 * Run the void setImg(Image) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetImg_fixture4_1()
		throws Exception {
		ImageCache fixture = getFixture4();
		Image img = null;

		fixture.setImg(img);

		// add additional test code here
	}

	/**
	 * Run the void setImg(Image) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetImg_fixture5_1()
		throws Exception {
		ImageCache fixture = getFixture5();
		Image img = null;

		fixture.setImg(img);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ImageCacheTest.class);
	}
}