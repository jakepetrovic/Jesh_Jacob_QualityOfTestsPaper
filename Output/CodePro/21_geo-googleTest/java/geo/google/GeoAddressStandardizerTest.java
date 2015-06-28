package geo.google;

import java.util.List;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import geo.google.datamodel.GeoAltitude;
import geo.google.datamodel.GeoUsAddress;
import geo.google.datamodel.GeoAddress;
import geo.google.mapping.XmlMappingFunctor;
import org.apache.commons.httpclient.params.HttpClientParams;
import geo.google.datamodel.GeoCoordinate;
import geo.google.datamodel.GeoAddressAccuracy;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GeoAddressStandardizerTest</code> contains tests for the class <code>{@link GeoAddressStandardizer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GeoAddressStandardizerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddressStandardizer fixture10;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new GeoAddressStandardizer("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new GeoAddressStandardizer("");
			fixture2.setHttpClientParams(new HttpClientParams());
			fixture2.setRateLimitInterval(-1L);
			fixture2.setUserAgent((UserAgent) null);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new GeoAddressStandardizer("");
			fixture3.setHttpClientParams(new HttpClientParams());
			fixture3.setRateLimitInterval(0L);
			fixture3.setUserAgent((UserAgent) null);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new GeoAddressStandardizer("");
			fixture4.setHttpClientParams(new HttpClientParams());
			fixture4.setRateLimitInterval(1L);
			fixture4.setUserAgent((UserAgent) null);
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new GeoAddressStandardizer("");
			fixture5.setHttpClientParams(new HttpClientParams(org.apache.commons.httpclient.params.DefaultHttpParams.getDefaultParams()));
			fixture5.setRateLimitInterval(-1L);
			fixture5.setUserAgent((UserAgent) null);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new GeoAddressStandardizer("");
			fixture6.setHttpClientParams(new HttpClientParams(org.apache.commons.httpclient.params.DefaultHttpParams.getDefaultParams()));
			fixture6.setRateLimitInterval(0L);
			fixture6.setUserAgent((UserAgent) null);
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new GeoAddressStandardizer("");
			fixture7.setHttpClientParams(new HttpClientParams(org.apache.commons.httpclient.params.DefaultHttpParams.getDefaultParams()));
			fixture7.setRateLimitInterval(1L);
			fixture7.setUserAgent((UserAgent) null);
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new GeoAddressStandardizer("1", 0);
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new GeoAddressStandardizer("1", 0);
			fixture9.setHttpClientParams(new HttpClientParams());
			fixture9.setUserAgent((UserAgent) null);
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddressStandardizer
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddressStandardizer getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new GeoAddressStandardizer("1", 0);
			fixture10.setHttpClientParams(new HttpClientParams(org.apache.commons.httpclient.params.DefaultHttpParams.getDefaultParams()));
			fixture10.setUserAgent((UserAgent) null);
		}
		return fixture10;
	}

	/**
	 * Run the GeoAddressStandardizer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoAddressStandardizer_1()
		throws Exception {
		String apiKey = "";

		GeoAddressStandardizer result = new GeoAddressStandardizer(apiKey);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getApiKey());
		assertEquals(5769L, result.getRateLimitInterval());
		assertEquals(null, result.getHttpClientParams());
	}

	/**
	 * Run the GeoAddressStandardizer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoAddressStandardizer_2()
		throws Exception {
		String apiKey = "0123456789";

		GeoAddressStandardizer result = new GeoAddressStandardizer(apiKey);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getApiKey());
		assertEquals(5769L, result.getRateLimitInterval());
		assertEquals(null, result.getHttpClientParams());
	}

	/**
	 * Run the GeoAddressStandardizer(String,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoAddressStandardizer_3()
		throws Exception {
		String apiKey = "1";
		long rateIntervalInMillis = -1L;

		GeoAddressStandardizer result = new GeoAddressStandardizer(apiKey, rateIntervalInMillis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: rateInterval cannot be negative
		//       at geo.google.GeoAddressStandardizer.<init>(GeoAddressStandardizer.java:143)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddressStandardizer(String,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGeoAddressStandardizer_4()
		throws Exception {
		String apiKey = "1";
		long rateIntervalInMillis = 0;

		GeoAddressStandardizer result = new GeoAddressStandardizer(apiKey, rateIntervalInMillis);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.getApiKey());
		assertEquals(0L, result.getRateLimitInterval());
		assertEquals(null, result.getHttpClientParams());
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetApiKey_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();

		String result = fixture.getApiKey();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the HttpClientParams getHttpClientParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetHttpClientParams_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();

		HttpClientParams result = fixture.getHttpClientParams();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.getConnectionManagerTimeout());
		assertEquals(false, result.isAuthenticationPreemptive());
		assertEquals(null, result.getVirtualHost());
		assertEquals("ISO-8859-1", result.getContentCharset());
		assertEquals("default", result.getCookiePolicy());
		assertEquals("US-ASCII", result.getHttpElementCharset());
		assertEquals(0, result.getSoTimeout());
		assertEquals("US-ASCII", result.getCredentialCharset());
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(5769L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(-1L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(-1L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRateLimitInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetRateLimitInterval_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();

		long result = fixture.getRateLimitInterval();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String apiKey = "";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setApiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetApiKey_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String apiKey = "0123456789";

		fixture.setApiKey(apiKey);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionManager(HttpConnectionManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetConnectionManager_1()
		throws Exception {
		HttpConnectionManager manager = new MultiThreadedHttpConnectionManager();

		GeoAddressStandardizer.setConnectionManager(manager);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionManager(HttpConnectionManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetConnectionManager_2()
		throws Exception {
		HttpConnectionManager manager = new SimpleHttpConnectionManager();

		GeoAddressStandardizer.setConnectionManager(manager);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClient(HttpClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClient_1()
		throws Exception {
		HttpClient client = null;

		GeoAddressStandardizer.setHttpClient(client);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setHttpClientParams(HttpClientParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetHttpClientParams_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		HttpClientParams httpClientParams = null;

		fixture.setHttpClientParams(httpClientParams);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture3_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture4_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture5_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture6_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture7_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture8_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture9_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture10_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		long rateLimitInterval = -1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture1_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		long rateLimitInterval = 0L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setRateLimitInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetRateLimitInterval_fixture2_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		long rateLimitInterval = 1L;

		fixture.setRateLimitInterval(rateLimitInterval);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the void setUserAgent(UserAgent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetUserAgent_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		UserAgent userAgent = null;

		fixture.setUserAgent(userAgent);

		// add additional test code here
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the Object standardize(String,XmlMappingFunctor<ReturnType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardize_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "0123456789";
		XmlMappingFunctor<Object> mappingFunction = null;

		Object result = fixture.standardize(addressLine, mappingFunction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress();

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress();

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture3_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture4_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture5_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture6_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture7_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture8_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture9_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture10_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture1_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture2_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress();

		GeoAddress result = fixture.standardizeToGeoAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture1_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture2_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture3_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture4_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture5_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture6_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture7_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture8_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture9_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture10_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture2_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture3_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture4_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture5_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture6_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture7_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture8_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture9_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture10_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the GeoAddress standardizeToGeoAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddress_fixture1_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "0123456789";

		GeoAddress result = fixture.standardizeToGeoAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddress(GeoAddressStandardizer.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress();

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress();

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture3_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture4_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture5_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture6_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture7_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture8_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture9_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture10_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture1_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture2_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress();

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:231)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture1_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture2_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture3_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture4_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture5_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture6_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture7_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture8_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture9_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture10_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture2_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture3_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture4_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture5_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture6_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture7_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture8_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture9_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture10_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoAddress> standardizeToGeoAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoAddresses_fixture1_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "0123456789";

		List<GeoAddress> result = fixture.standardizeToGeoAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoAddresses(GeoAddressStandardizer.java:211)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoCoordinate standardizeToGeoCoordinate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoCoordinate_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "0123456789";

		GeoCoordinate result = fixture.standardizeToGeoCoordinate(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoCoordinate(GeoAddressStandardizer.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress();

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress();

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture3_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture4_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture5_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture6_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture7_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture8_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture9_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture10_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture1_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture2_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress();

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:167)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture1_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture2_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture3_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture4_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture5_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture6_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture7_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture8_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture9_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture10_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture2_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture3_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture4_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture5_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture6_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture7_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture8_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture9_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture10_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the GeoUsAddress standardizeToGeoUsAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddress_fixture1_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "0123456789";

		GeoUsAddress result = fixture.standardizeToGeoUsAddress(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddress(GeoAddressStandardizer.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture1_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture2_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture3_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture4_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture5_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture6_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture7_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture8_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture9_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture10_1()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress();

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture2_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture3_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture4_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture5_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture6_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture7_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture8_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture9_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture10_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture1_2()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress();

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture3_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		GeoUsAddress usAddress = new GeoUsAddress("", "", "", "", "", "", "", new GeoCoordinate(), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture4_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture5_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture6_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture7_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		GeoUsAddress usAddress = new GeoUsAddress("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture8_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(-1.0, -1.0, new GeoAltitude()), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture9_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.ADDRESS_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture10_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.COUNTRY_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture1_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		GeoUsAddress usAddress = new GeoUsAddress("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)), GeoAddressAccuracy.INTERSECTION_LEVEL);

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(GeoUsAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture2_3()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		GeoUsAddress usAddress = new GeoUsAddress();

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(usAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:221)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture1_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture2_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture3_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture4_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture5_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture6_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture7_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture8_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture9_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture10_4()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture2_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture2();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture3_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture3();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture4_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture4();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture5_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture5();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture6_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture6();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture7_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture7();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture8_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture8();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture9_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture9();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture10_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture10();
		String addressLine = "";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the List<GeoUsAddress> standardizeToGeoUsAddresses(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testStandardizeToGeoUsAddresses_fixture1_5()
		throws Exception {
		GeoAddressStandardizer fixture = getFixture1();
		String addressLine = "0123456789";

		List<GeoUsAddress> result = fixture.standardizeToGeoUsAddresses(addressLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at org.apache.commons.httpclient.HttpConnection.open(HttpConnection.java:745)
		//       at org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter.open(MultiThreadedHttpConnectionManager.java:1319)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeWithRetry(HttpMethodDirector.java:386)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:170)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:396)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:324)
		//       at geo.google.GeoAddressStandardizer$1.getUrlAsString(GeoAddressStandardizer.java:77)
		//       at geo.google.GeoAddressStandardizer.getServerResponse(GeoAddressStandardizer.java:282)
		//       at geo.google.GeoAddressStandardizer.standardize(GeoAddressStandardizer.java:263)
		//       at geo.google.GeoAddressStandardizer.standardizeToGeoUsAddresses(GeoAddressStandardizer.java:201)
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
		new org.junit.runner.JUnitCore().run(GeoAddressStandardizerTest.class);
	}
}