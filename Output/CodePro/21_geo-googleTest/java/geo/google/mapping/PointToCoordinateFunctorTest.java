package geo.google.mapping;

import org.junit.*;
import geo.google.datamodel.GeoCoordinate;
import static org.junit.Assert.*;
import com.google.earth.kml._2.PointType;

/**
 * The class <code>PointToCoordinateFunctorTest</code> contains tests for the class <code>{@link PointToCoordinateFunctor}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PointToCoordinateFunctorTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PointToCoordinateFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PointToCoordinateFunctor fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PointToCoordinateFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PointToCoordinateFunctor fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PointToCoordinateFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PointToCoordinateFunctor getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = PointToCoordinateFunctor.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PointToCoordinateFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PointToCoordinateFunctor getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new PointToCoordinateFunctor();
		}
		return fixture;
	}

	/**
	 * Run the GeoCoordinate execute(PointType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixtureInstance_1()
		throws Exception {
		PointToCoordinateFunctor fixture2 = getFixtureInstance();
		PointType point = new PointType();

		GeoCoordinate result = fixture2.execute(point);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate execute(PointType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		PointToCoordinateFunctor fixture2 = getFixture();
		PointType point = new PointType();

		GeoCoordinate result = fixture2.execute(point);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the PointToCoordinateFunctor getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		PointToCoordinateFunctor result = PointToCoordinateFunctor.getInstance();

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
		new org.junit.runner.JUnitCore().run(PointToCoordinateFunctorTest.class);
	}
}