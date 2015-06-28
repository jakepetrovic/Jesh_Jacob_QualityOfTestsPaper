package geo.google.mapping;

import org.junit.*;
import geo.google.GeoException;
import geo.google.datamodel.GeoCoordinate;
import static org.junit.Assert.*;

/**
 * The class <code>MappingUtilsTest</code> contains tests for the class <code>{@link MappingUtils}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MappingUtilsTest {
	/**
	 * Run the GeoCoordinate stringToCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStringToCoordinate_1()
		throws Exception {
		String coord = null;

		GeoCoordinate result = MappingUtils.stringToCoordinate(coord);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate stringToCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test(expected = geo.google.GeoException.class)
	public void testStringToCoordinate_2()
		throws Exception {
		String coord = "1";

		GeoCoordinate result = MappingUtils.stringToCoordinate(coord);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MappingUtilsTest.class);
	}
}