package geo.google.datamodel;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GeoAddressAccuracyTest</code> contains tests for the class <code>{@link GeoAddressAccuracy}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GeoAddressAccuracyTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressAccuracy fixture9;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = GeoAddressAccuracy.ADDRESS_LEVEL;
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = GeoAddressAccuracy.COUNTRY_LEVEL;
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = GeoAddressAccuracy.INTERSECTION_LEVEL;
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = GeoAddressAccuracy.POST_CODE_LEVEL;
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = GeoAddressAccuracy.REGION_LEVEL;
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = GeoAddressAccuracy.STREET_LEVEL;
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = GeoAddressAccuracy.SUB_REGION_LEVEL;
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = GeoAddressAccuracy.TOWN_LEVEL;
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressAccuracy
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressAccuracy getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = GeoAddressAccuracy.UNKNOWN_LOCATION;
		}
		return fixture9;
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_1()
		throws Exception {
		int code = 0;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("UNKNOWN_LOCATION", result.getName());
		assertEquals(0, result.getCode());
		assertEquals("UNKNOWN_LOCATION", result.name());
		assertEquals("UNKNOWN_LOCATION", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_2()
		throws Exception {
		int code = 1;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_3()
		throws Exception {
		int code = 2;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("REGION_LEVEL", result.getName());
		assertEquals(2, result.getCode());
		assertEquals("REGION_LEVEL", result.name());
		assertEquals("REGION_LEVEL", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_4()
		throws Exception {
		int code = 3;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("SUB_REGION_LEVEL", result.getName());
		assertEquals(3, result.getCode());
		assertEquals("SUB_REGION_LEVEL", result.name());
		assertEquals("SUB_REGION_LEVEL", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_5()
		throws Exception {
		int code = 4;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TOWN_LEVEL", result.getName());
		assertEquals(4, result.getCode());
		assertEquals("TOWN_LEVEL", result.name());
		assertEquals("TOWN_LEVEL", result.toString());
		assertEquals(4, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_6()
		throws Exception {
		int code = 5;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("POST_CODE_LEVEL", result.getName());
		assertEquals(5, result.getCode());
		assertEquals("POST_CODE_LEVEL", result.name());
		assertEquals("POST_CODE_LEVEL", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_7()
		throws Exception {
		int code = 6;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("STREET_LEVEL", result.getName());
		assertEquals(6, result.getCode());
		assertEquals("STREET_LEVEL", result.name());
		assertEquals("STREET_LEVEL", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_8()
		throws Exception {
		int code = 7;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_9()
		throws Exception {
		int code = 8;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracyByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracyByCode_10()
		throws Exception {
		int code = 9;

		GeoAddressAccuracy result = GeoAddressAccuracy.getAccuracyByCode(code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("UNKNOWN_LOCATION", result.getName());
		assertEquals(0, result.getCode());
		assertEquals("UNKNOWN_LOCATION", result.name());
		assertEquals("UNKNOWN_LOCATION", result.toString());
		assertEquals(0, result.ordinal());
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
		GeoAddressAccuracy fixture = getFixture1();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(8, result);
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
		GeoAddressAccuracy fixture = getFixture2();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(1, result);
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
		GeoAddressAccuracy fixture = getFixture3();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(7, result);
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
		GeoAddressAccuracy fixture = getFixture4();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(5, result);
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
		GeoAddressAccuracy fixture = getFixture5();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(2, result);
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
		GeoAddressAccuracy fixture = getFixture6();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(6, result);
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
		GeoAddressAccuracy fixture = getFixture7();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(3, result);
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
		GeoAddressAccuracy fixture = getFixture8();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(4, result);
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
		GeoAddressAccuracy fixture = getFixture9();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(0, result);
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
		GeoAddressAccuracy fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("ADDRESS_LEVEL", result);
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
		GeoAddressAccuracy fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("COUNTRY_LEVEL", result);
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
		GeoAddressAccuracy fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("INTERSECTION_LEVEL", result);
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
		GeoAddressAccuracy fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("POST_CODE_LEVEL", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture5_1()
		throws Exception {
		GeoAddressAccuracy fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("REGION_LEVEL", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture6_1()
		throws Exception {
		GeoAddressAccuracy fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("STREET_LEVEL", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture7_1()
		throws Exception {
		GeoAddressAccuracy fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("SUB_REGION_LEVEL", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture8_1()
		throws Exception {
		GeoAddressAccuracy fixture = getFixture8();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("TOWN_LEVEL", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetName_fixture9_1()
		throws Exception {
		GeoAddressAccuracy fixture = getFixture9();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("UNKNOWN_LOCATION", result);
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
		new org.junit.runner.JUnitCore().run(GeoAddressAccuracyTest.class);
	}
}