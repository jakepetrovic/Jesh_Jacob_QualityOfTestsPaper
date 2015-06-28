package common;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MapPreviewTest</code> contains tests for the class <code>{@link MapPreview}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MapPreviewTest {
	/**
	 * Run the MapPreview(Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMapPreview_1()
		throws Exception {
		Map map = new Map("");

		MapPreview result = new MapPreview(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the MapPreview(Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMapPreview_2()
		throws Exception {
		Map map = new Map("", false, false, false);

		MapPreview result = new MapPreview(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the MapPreview(Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMapPreview_3()
		throws Exception {
		Map map = new Map("0123456789", false, false, true);

		MapPreview result = new MapPreview(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the MapPreview(Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMapPreview_4()
		throws Exception {
		Map map = new Map("0123456789", true, true, true);

		MapPreview result = new MapPreview(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the MapPreview(Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMapPreview_5()
		throws Exception {
		Map map = new Map((String) null, true, false, true);

		MapPreview result = new MapPreview(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:66)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(MapPreviewTest.class);
	}
}