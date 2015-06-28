package geo.google;

import org.junit.*;
import geo.google.datamodel.GeoStatusCode;
import static org.junit.Assert.*;

/**
 * The class <code>GeoExceptionTest</code> contains tests for the class <code>{@link GeoException}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GeoExceptionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoException fixture9;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new GeoException("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new GeoException("", GeoStatusCode.G_GEO_BAD_KEY);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new GeoException("", new Throwable(""));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new GeoException("", new Throwable(""), GeoStatusCode.G_GEO_BAD_KEY);
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new GeoException("0123456789", GeoStatusCode.G_GEO_BAD_REQUEST);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new GeoException("0123456789", new Throwable("", (Throwable) null));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new GeoException("0123456789", new Throwable("", (Throwable) null), GeoStatusCode.G_GEO_BAD_REQUEST);
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new GeoException("An��t-1.0.txt", new Throwable("0123456789", (Throwable) null), GeoStatusCode.G_GEO_MISSING_QUERY);
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoException
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoException getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new GeoException(new Throwable(""));
		}
		return fixture9;
	}

	/**
	 * Run the GeoException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_1()
		throws Exception {
		String message = "";

		GeoException result = new GeoException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_2()
		throws Exception {
		String message = "0123456789";

		GeoException result = new GeoException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_3()
		throws Exception {
		Throwable cause = new Throwable("");

		GeoException result = new GeoException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_4()
		throws Exception {
		Throwable cause = new Throwable("", (Throwable) null);

		GeoException result = new GeoException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_5()
		throws Exception {
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		GeoException result = new GeoException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: java.lang.Throwable: 0123456789", result.toString());
		assertEquals("java.lang.Throwable: 0123456789", result.getMessage());
		assertEquals("java.lang.Throwable: 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_6()
		throws Exception {
		Throwable cause = new Throwable();

		GeoException result = new GeoException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_7()
		throws Exception {
		Throwable cause = new Throwable((Throwable) null);

		GeoException result = new GeoException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_8()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_KEY;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_9()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_REQUEST;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_10()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_MISSING_QUERY;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_11()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_SERVER_ERROR;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_12()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_SUCCESS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_13()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_TOO_MANY_QUERIES;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_14()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_15()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_ADDRESS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_16()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_17()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKOWN_STATUS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_18()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_KEY;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_19()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_REQUEST;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_20()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_MISSING_QUERY;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_21()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_SERVER_ERROR;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_22()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_SUCCESS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_23()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_TOO_MANY_QUERIES;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_24()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_25()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_ADDRESS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_26()
		throws Exception {
		String message = "0123456789";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_27()
		throws Exception {
		String message = "";
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKOWN_STATUS;

		GeoException result = new GeoException(message, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_28()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("");

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_29()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_30()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_31()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable();

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_32()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable((Throwable) null);

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_33()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("", (Throwable) null);

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_34()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_35()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_36()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable((Throwable) null);

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_37()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("");

		GeoException result = new GeoException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_38()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("");
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_KEY;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_39()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_REQUEST;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_40()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_MISSING_QUERY;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_41()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable();
		GeoStatusCode status = GeoStatusCode.G_GEO_SERVER_ERROR;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_42()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable((Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_SUCCESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_43()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("");
		GeoStatusCode status = GeoStatusCode.G_GEO_TOO_MANY_QUERIES;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_44()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_45()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_ADDRESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_46()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable();
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_47()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable((Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKOWN_STATUS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_48()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_KEY;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_49()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("0123456789", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_REQUEST;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_50()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();
		GeoStatusCode status = GeoStatusCode.G_GEO_MISSING_QUERY;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_51()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable((Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_SERVER_ERROR;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_52()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("");
		GeoStatusCode status = GeoStatusCode.G_GEO_SUCCESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_53()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_TOO_MANY_QUERIES;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_54()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("0123456789", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_55()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_ADDRESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_56()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable((Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_57()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("");
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKOWN_STATUS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_58()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_KEY;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_59()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable();
		GeoStatusCode status = GeoStatusCode.G_GEO_BAD_REQUEST;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_60()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable((Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_MISSING_QUERY;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_61()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("");
		GeoStatusCode status = GeoStatusCode.G_GEO_SERVER_ERROR;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_62()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_SUCCESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_63()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_TOO_MANY_QUERIES;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_64()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable();
		GeoStatusCode status = GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_65()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable((Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_ADDRESS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_66()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("");
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoException(String,Throwable,GeoStatusCode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoException_67()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);
		GeoStatusCode status = GeoStatusCode.G_GEO_UNKOWN_STATUS;

		GeoException result = new GeoException(message, cause, status);

		// add additional test code here
		assertNotNull(result);
		assertEquals("geo.google.GeoException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture1_1()
		throws Exception {
		GeoException fixture = getFixture1();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture2_1()
		throws Exception {
		GeoException fixture = getFixture2();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture3_1()
		throws Exception {
		GeoException fixture = getFixture3();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture4_1()
		throws Exception {
		GeoException fixture = getFixture4();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture5_1()
		throws Exception {
		GeoException fixture = getFixture5();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture6_1()
		throws Exception {
		GeoException fixture = getFixture6();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture7_1()
		throws Exception {
		GeoException fixture = getFixture7();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture8_1()
		throws Exception {
		GeoException fixture = getFixture8();

		GeoStatusCode result = fixture.getStatus();

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
	 * Run the GeoStatusCode getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetStatus_fixture9_1()
		throws Exception {
		GeoException fixture = getFixture9();

		GeoStatusCode result = fixture.getStatus();

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
		new org.junit.runner.JUnitCore().run(GeoExceptionTest.class);
	}
}