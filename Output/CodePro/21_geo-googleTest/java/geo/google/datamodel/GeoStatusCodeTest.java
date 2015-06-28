package geo.google.datamodel;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GeoStatusCodeTest</code> contains tests for the class <code>{@link GeoStatusCode}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GeoStatusCodeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoStatusCode fixture10;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = GeoStatusCode.G_GEO_BAD_KEY;
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = GeoStatusCode.G_GEO_BAD_REQUEST;
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = GeoStatusCode.G_GEO_MISSING_QUERY;
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = GeoStatusCode.G_GEO_SERVER_ERROR;
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = GeoStatusCode.G_GEO_SUCCESS;
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = GeoStatusCode.G_GEO_TOO_MANY_QUERIES;
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS;
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = GeoStatusCode.G_GEO_UNKNOWN_ADDRESS;
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoStatusCode
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoStatusCode getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = GeoStatusCode.G_GEO_UNKOWN_STATUS;
		}
		return fixture10;
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture1_1()
		throws Exception {
		GeoStatusCode fixture = getFixture1();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(610, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture2_1()
		throws Exception {
		GeoStatusCode fixture = getFixture2();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(400, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture3_1()
		throws Exception {
		GeoStatusCode fixture = getFixture3();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(601, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture4_1()
		throws Exception {
		GeoStatusCode fixture = getFixture4();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(500, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture5_1()
		throws Exception {
		GeoStatusCode fixture = getFixture5();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(200, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture6_1()
		throws Exception {
		GeoStatusCode fixture = getFixture6();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(620, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture7_1()
		throws Exception {
		GeoStatusCode fixture = getFixture7();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(603, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture8_1()
		throws Exception {
		GeoStatusCode fixture = getFixture8();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(602, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture9_1()
		throws Exception {
		GeoStatusCode fixture = getFixture9();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(604, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCode_fixture10_1()
		throws Exception {
		GeoStatusCode fixture = getFixture10();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture1_1()
		throws Exception {
		GeoStatusCode fixture = getFixture1();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_BAD_KEY", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture2_1()
		throws Exception {
		GeoStatusCode fixture = getFixture2();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_BAD_REQUEST", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture3_1()
		throws Exception {
		GeoStatusCode fixture = getFixture3();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_MISSING_QUERY", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture4_1()
		throws Exception {
		GeoStatusCode fixture = getFixture4();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_SERVER_ERROR", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture5_1()
		throws Exception {
		GeoStatusCode fixture = getFixture5();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_SUCCESS", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture6_1()
		throws Exception {
		GeoStatusCode fixture = getFixture6();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_TOO_MANY_QUERIES", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture7_1()
		throws Exception {
		GeoStatusCode fixture = getFixture7();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_UNAVAILABLE_ADDRESS", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture8_1()
		throws Exception {
		GeoStatusCode fixture = getFixture8();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_UNKNOWN_ADDRESS", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture9_1()
		throws Exception {
		GeoStatusCode fixture = getFixture9();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_UNKNOWN_DIRECTIONS", result);
	}

	/**
	 * Run the String getCodeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCodeName_fixture10_1()
		throws Exception {
		GeoStatusCode fixture = getFixture10();

		String result = fixture.getCodeName();

		// add additional test code here
		assertEquals("G_GEO_UNKOWN_STATUS", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture1_1()
		throws Exception {
		GeoStatusCode fixture = getFixture1();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("The given key is either invalid or does not match the domain for which it was given. (Since 2.55)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture2_1()
		throws Exception {
		GeoStatusCode fixture = getFixture2();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("A directions request could not be successfully parsed. (Since 2.81)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture3_1()
		throws Exception {
		GeoStatusCode fixture = getFixture3();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("The HTTP q parameter was either missing or had no value. For geocoding requests, this means that an empty address was specified as input. For directions requests, this means that no query was specified in the input. (Since 2.81)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture4_1()
		throws Exception {
		GeoStatusCode fixture = getFixture4();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("A geocoding or directions request could not be successfully processed, yet the exact reason for the failure is not known. (Since 2.55)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture5_1()
		throws Exception {
		GeoStatusCode fixture = getFixture5();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("No errors occurred; the address was successfully parsed and its geocode has been returned. (Since 2.55)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture6_1()
		throws Exception {
		GeoStatusCode fixture = getFixture6();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("The given key has gone over the requests limit in the 24 hour period. ", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture7_1()
		throws Exception {
		GeoStatusCode fixture = getFixture7();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("The geocode for the given address or the route for the given directions query cannot be returned due to legal or contractual reasons. (Since 2.55)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture8_1()
		throws Exception {
		GeoStatusCode fixture = getFixture8();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("No corresponding geographic location could be found for the specified address. This may be due to the fact that the address is relatively new, or it may be incorrect. (Since 2.55)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture9_1()
		throws Exception {
		GeoStatusCode fixture = getFixture9();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("The GDirections object could not compute directions between the points mentioned in the query. This is usually because there is no route available between the two points, or because we do not have data for routing in that region. (Since 2.81)", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDescription_fixture10_1()
		throws Exception {
		GeoStatusCode fixture = getFixture10();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Uknown Status", result);
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_1()
		throws Exception {
		int code = 0;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_UNKOWN_STATUS", result.getCodeName());
		assertEquals(-1, result.getCode());
		assertEquals("Uknown Status", result.getDescription());
		assertEquals("G_GEO_UNKOWN_STATUS", result.name());
		assertEquals("G_GEO_UNKOWN_STATUS", result.toString());
		assertEquals(9, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_2()
		throws Exception {
		int code = 200;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_SUCCESS", result.getCodeName());
		assertEquals(200, result.getCode());
		assertEquals("No errors occurred; the address was successfully parsed and its geocode has been returned. (Since 2.55)", result.getDescription());
		assertEquals("G_GEO_SUCCESS", result.name());
		assertEquals("G_GEO_SUCCESS", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_3()
		throws Exception {
		int code = 400;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_BAD_REQUEST", result.getCodeName());
		assertEquals(400, result.getCode());
		assertEquals("A directions request could not be successfully parsed. (Since 2.81)", result.getDescription());
		assertEquals("G_GEO_BAD_REQUEST", result.name());
		assertEquals("G_GEO_BAD_REQUEST", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_4()
		throws Exception {
		int code = 500;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_SERVER_ERROR", result.getCodeName());
		assertEquals(500, result.getCode());
		assertEquals("A geocoding or directions request could not be successfully processed, yet the exact reason for the failure is not known. (Since 2.55)", result.getDescription());
		assertEquals("G_GEO_SERVER_ERROR", result.name());
		assertEquals("G_GEO_SERVER_ERROR", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_5()
		throws Exception {
		int code = 601;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_MISSING_QUERY", result.getCodeName());
		assertEquals(601, result.getCode());
		assertEquals("The HTTP q parameter was either missing or had no value. For geocoding requests, this means that an empty address was specified as input. For directions requests, this means that no query was specified in the input. (Since 2.81)", result.getDescription());
		assertEquals("G_GEO_MISSING_QUERY", result.name());
		assertEquals("G_GEO_MISSING_QUERY", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_6()
		throws Exception {
		int code = 602;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_UNKNOWN_ADDRESS", result.getCodeName());
		assertEquals(602, result.getCode());
		assertEquals("No corresponding geographic location could be found for the specified address. This may be due to the fact that the address is relatively new, or it may be incorrect. (Since 2.55)", result.getDescription());
		assertEquals("G_GEO_UNKNOWN_ADDRESS", result.name());
		assertEquals("G_GEO_UNKNOWN_ADDRESS", result.toString());
		assertEquals(4, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_7()
		throws Exception {
		int code = 603;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_UNAVAILABLE_ADDRESS", result.getCodeName());
		assertEquals(603, result.getCode());
		assertEquals("The geocode for the given address or the route for the given directions query cannot be returned due to legal or contractual reasons. (Since 2.55)", result.getDescription());
		assertEquals("G_GEO_UNAVAILABLE_ADDRESS", result.name());
		assertEquals("G_GEO_UNAVAILABLE_ADDRESS", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_8()
		throws Exception {
		int code = 604;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_UNKNOWN_DIRECTIONS", result.getCodeName());
		assertEquals(604, result.getCode());
		assertEquals("The GDirections object could not compute directions between the points mentioned in the query. This is usually because there is no route available between the two points, or because we do not have data for routing in that region. (Since 2.81)", result.getDescription());
		assertEquals("G_GEO_UNKNOWN_DIRECTIONS", result.name());
		assertEquals("G_GEO_UNKNOWN_DIRECTIONS", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_9()
		throws Exception {
		int code = 610;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_BAD_KEY", result.getCodeName());
		assertEquals(610, result.getCode());
		assertEquals("The given key is either invalid or does not match the domain for which it was given. (Since 2.55)", result.getDescription());
		assertEquals("G_GEO_BAD_KEY", result.name());
		assertEquals("G_GEO_BAD_KEY", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoStatusCode getStatusCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatusCode_10()
		throws Exception {
		int code = 620;

		GeoStatusCode result = GeoStatusCode.getStatusCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("G_GEO_TOO_MANY_QUERIES", result.getCodeName());
		assertEquals(620, result.getCode());
		assertEquals("The given key has gone over the requests limit in the 24 hour period. ", result.getDescription());
		assertEquals("G_GEO_TOO_MANY_QUERIES", result.name());
		assertEquals("G_GEO_TOO_MANY_QUERIES", result.toString());
		assertEquals(8, result.ordinal());
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
		new org.junit.runner.JUnitCore().run(GeoStatusCodeTest.class);
	}
}