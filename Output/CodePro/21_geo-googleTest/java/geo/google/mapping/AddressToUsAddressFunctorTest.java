package geo.google.mapping;

import org.junit.*;
import geo.google.datamodel.GeoUsAddress;
import geo.google.datamodel.GeoAddress;
import static org.junit.Assert.*;

/**
 * The class <code>AddressToUsAddressFunctorTest</code> contains tests for the class <code>{@link AddressToUsAddressFunctor}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AddressToUsAddressFunctorTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see AddressToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private AddressToUsAddressFunctor fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AddressToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private AddressToUsAddressFunctor fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AddressToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public AddressToUsAddressFunctor getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = AddressToUsAddressFunctor.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AddressToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public AddressToUsAddressFunctor getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new AddressToUsAddressFunctor();
		}
		return fixture;
	}

	/**
	 * Run the GeoUsAddress execute(GeoAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixtureInstance_1()
		throws Exception {
		AddressToUsAddressFunctor fixture2 = getFixtureInstance();
		GeoAddress addr = new GeoAddress();

		GeoUsAddress result = fixture2.execute(addr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.mapping.AddressToUsAddressFunctor.execute(AddressToUsAddressFunctor.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress execute(GeoAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		AddressToUsAddressFunctor fixture2 = getFixture();
		GeoAddress addr = new GeoAddress();

		GeoUsAddress result = fixture2.execute(addr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.mapping.AddressToUsAddressFunctor.execute(AddressToUsAddressFunctor.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the AddressToUsAddressFunctor getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		AddressToUsAddressFunctor result = AddressToUsAddressFunctor.getInstance();

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
		new org.junit.runner.JUnitCore().run(AddressToUsAddressFunctorTest.class);
	}
}