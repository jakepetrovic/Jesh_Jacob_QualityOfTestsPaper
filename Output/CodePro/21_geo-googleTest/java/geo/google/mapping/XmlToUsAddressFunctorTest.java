package geo.google.mapping;

import java.util.List;
import org.junit.*;
import geo.google.datamodel.GeoUsAddress;
import geo.google.GeoException;
import static org.junit.Assert.*;

/**
 * The class <code>XmlToUsAddressFunctorTest</code> contains tests for the class <code>{@link XmlToUsAddressFunctor}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:06 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XmlToUsAddressFunctorTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XmlToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private XmlToUsAddressFunctor fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XmlToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private XmlToUsAddressFunctor fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XmlToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public XmlToUsAddressFunctor getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = XmlToUsAddressFunctor.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XmlToUsAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public XmlToUsAddressFunctor getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new XmlToUsAddressFunctor();
		}
		return fixture;
	}

	/**
	 * Run the List<GeoUsAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = geo.google.GeoException.class)
	public void testExecute_fixtureInstance_1()
		throws Exception {
		XmlToUsAddressFunctor fixture2 = getFixtureInstance();
		String xml = "";

		List<GeoUsAddress> result = fixture2.execute(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = geo.google.GeoException.class)
	public void testExecute_fixture_1()
		throws Exception {
		XmlToUsAddressFunctor fixture2 = getFixture();
		String xml = "0123456789";

		List<GeoUsAddress> result = fixture2.execute(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = geo.google.GeoException.class)
	public void testExecute_fixture_2()
		throws Exception {
		XmlToUsAddressFunctor fixture2 = getFixture();
		String xml = "";

		List<GeoUsAddress> result = fixture2.execute(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = geo.google.GeoException.class)
	public void testExecute_fixtureInstance_2()
		throws Exception {
		XmlToUsAddressFunctor fixture2 = getFixtureInstance();
		String xml = "0123456789";

		List<GeoUsAddress> result = fixture2.execute(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XmlToUsAddressFunctor getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		XmlToUsAddressFunctor result = XmlToUsAddressFunctor.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XmlToUsAddressFunctorTest.class);
	}
}