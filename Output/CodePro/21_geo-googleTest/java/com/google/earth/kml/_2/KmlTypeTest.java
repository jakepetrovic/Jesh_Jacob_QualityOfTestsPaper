package com.google.earth.kml._2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>KmlTypeTest</code> contains tests for the class <code>{@link KmlType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class KmlTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see KmlType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private KmlType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see KmlType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private KmlType fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see KmlType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public KmlType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new KmlType();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see KmlType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public KmlType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new KmlType();
			fixture2.setResponse(new ResponseType());
		}
		return fixture2;
	}

	/**
	 * Run the ResponseType getResponse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetResponse_fixture1_1()
		throws Exception {
		KmlType fixture = getFixture1();

		ResponseType result = fixture.getResponse();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ResponseType getResponse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetResponse_fixture2_1()
		throws Exception {
		KmlType fixture = getFixture2();

		ResponseType result = fixture.getResponse();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getStatus());
	}

	/**
	 * Run the void setResponse(ResponseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetResponse_fixture1_1()
		throws Exception {
		KmlType fixture = getFixture1();
		ResponseType value = new ResponseType();

		fixture.setResponse(value);

		// add additional test code here
	}

	/**
	 * Run the void setResponse(ResponseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetResponse_fixture2_1()
		throws Exception {
		KmlType fixture = getFixture2();
		ResponseType value = new ResponseType();

		fixture.setResponse(value);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(KmlTypeTest.class);
	}
}