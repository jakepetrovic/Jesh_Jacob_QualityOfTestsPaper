package geo.google.mapping;

import java.util.List;
import org.junit.*;
import geo.google.datamodel.GeoAddress;
import static org.junit.Assert.*;

/**
 * The class <code>XmlToAddressFunctorTest</code> contains tests for the class <code>{@link XmlToAddressFunctor}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XmlToAddressFunctorTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XmlToAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private XmlToAddressFunctor fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XmlToAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private XmlToAddressFunctor fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XmlToAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public XmlToAddressFunctor getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = XmlToAddressFunctor.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XmlToAddressFunctor
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public XmlToAddressFunctor getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new XmlToAddressFunctor();
		}
		return fixture;
	}

	/**
	 * Run the List<GeoAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixtureInstance_1()
		throws Exception {
		XmlToAddressFunctor fixture2 = getFixtureInstance();
		String xml = "";

		List<GeoAddress> result = fixture2.execute(xml);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Unable to parse xml string using JAXB
		//       at geo.google.mapping.XmlToAddressFunctor.execute(XmlToAddressFunctor.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		XmlToAddressFunctor fixture2 = getFixture();
		String xml = "0123456789";

		List<GeoAddress> result = fixture2.execute(xml);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Unable to parse xml string using JAXB
		//       at geo.google.mapping.XmlToAddressFunctor.execute(XmlToAddressFunctor.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixture_2()
		throws Exception {
		XmlToAddressFunctor fixture2 = getFixture();
		String xml = "";

		List<GeoAddress> result = fixture2.execute(xml);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Unable to parse xml string using JAXB
		//       at geo.google.mapping.XmlToAddressFunctor.execute(XmlToAddressFunctor.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> execute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testExecute_fixtureInstance_2()
		throws Exception {
		XmlToAddressFunctor fixture2 = getFixtureInstance();
		String xml = "0123456789";

		List<GeoAddress> result = fixture2.execute(xml);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Unable to parse xml string using JAXB
		//       at geo.google.mapping.XmlToAddressFunctor.execute(XmlToAddressFunctor.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the XmlToAddressFunctor getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		XmlToAddressFunctor result = XmlToAddressFunctor.getInstance();

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
		new org.junit.runner.JUnitCore().run(XmlToAddressFunctorTest.class);
	}
}