package com.google.earth.kml._2;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResponseTypeTest</code> contains tests for the class <code>{@link ResponseType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ResponseTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private ResponseType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private ResponseType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private ResponseType fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private ResponseType fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public ResponseType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ResponseType();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public ResponseType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ResponseType();
			fixture2.setName("");
			fixture2.setStatus(new StatusType());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public ResponseType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new ResponseType();
			fixture3.setName("0123456789");
			fixture3.setStatus(new StatusType());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResponseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public ResponseType getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new ResponseType();
			fixture4.setName("An��t-1.0.txt");
			fixture4.setStatus(new StatusType());
		}
		return fixture4;
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		ResponseType fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		ResponseType fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		ResponseType fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture4_1()
		throws Exception {
		ResponseType fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the List<PlacemarkType> getPlacemark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPlacemark_fixture1_1()
		throws Exception {
		ResponseType fixture = getFixture1();

		List<PlacemarkType> result = fixture.getPlacemark();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PlacemarkType> getPlacemark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPlacemark_fixture2_1()
		throws Exception {
		ResponseType fixture = getFixture2();

		List<PlacemarkType> result = fixture.getPlacemark();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PlacemarkType> getPlacemark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPlacemark_fixture3_1()
		throws Exception {
		ResponseType fixture = getFixture3();

		List<PlacemarkType> result = fixture.getPlacemark();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PlacemarkType> getPlacemark() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPlacemark_fixture4_1()
		throws Exception {
		ResponseType fixture = getFixture4();

		List<PlacemarkType> result = fixture.getPlacemark();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the StatusType getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture1_1()
		throws Exception {
		ResponseType fixture = getFixture1();

		StatusType result = fixture.getStatus();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StatusType getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture2_1()
		throws Exception {
		ResponseType fixture = getFixture2();

		StatusType result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getRequest());
	}

	/**
	 * Run the StatusType getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture3_1()
		throws Exception {
		ResponseType fixture = getFixture3();

		StatusType result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getRequest());
	}

	/**
	 * Run the StatusType getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture4_1()
		throws Exception {
		ResponseType fixture = getFixture4();

		StatusType result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getRequest());
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture1_1()
		throws Exception {
		ResponseType fixture = getFixture1();
		String value = "";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture2_1()
		throws Exception {
		ResponseType fixture = getFixture2();
		String value = "0123456789";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture3_1()
		throws Exception {
		ResponseType fixture = getFixture3();
		String value = "0123456789";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture4_1()
		throws Exception {
		ResponseType fixture = getFixture4();
		String value = "0123456789";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture2_2()
		throws Exception {
		ResponseType fixture = getFixture2();
		String value = "";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture3_2()
		throws Exception {
		ResponseType fixture = getFixture3();
		String value = "";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture4_2()
		throws Exception {
		ResponseType fixture = getFixture4();
		String value = "";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetName_fixture1_2()
		throws Exception {
		ResponseType fixture = getFixture1();
		String value = "0123456789";

		fixture.setName(value);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(StatusType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetStatus_fixture1_1()
		throws Exception {
		ResponseType fixture = getFixture1();
		StatusType value = new StatusType();

		fixture.setStatus(value);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(StatusType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetStatus_fixture2_1()
		throws Exception {
		ResponseType fixture = getFixture2();
		StatusType value = new StatusType();

		fixture.setStatus(value);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(StatusType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetStatus_fixture3_1()
		throws Exception {
		ResponseType fixture = getFixture3();
		StatusType value = new StatusType();

		fixture.setStatus(value);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(StatusType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetStatus_fixture4_1()
		throws Exception {
		ResponseType fixture = getFixture4();
		StatusType value = new StatusType();

		fixture.setStatus(value);

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
		new org.junit.runner.JUnitCore().run(ResponseTypeTest.class);
	}
}