package net.sf.lavalamp.site;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UrlGetterTest</code> contains tests for the class <code>{@link UrlGetter}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class UrlGetterTest {
	/**
	 * Run the UrlGetter() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testUrlGetter_1()
		throws Exception {
		UrlGetter result = new UrlGetter();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_3()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_4()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_5()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_6()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_7()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_8()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_9()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_10()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: host parameter is null
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:206)
		//       at org.apache.commons.httpclient.HttpConnection.<init>(HttpConnection.java:155)
		//       at org.apache.commons.httpclient.SimpleHttpConnectionManager.getConnectionWithTimeout(SimpleHttpConnectionManager.java:175)
		//       at org.apache.commons.httpclient.HttpMethodDirector.executeMethod(HttpMethodDirector.java:153)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:397)
		//       at org.apache.commons.httpclient.HttpClient.executeMethod(HttpClient.java:323)
		//       at net.sf.lavalamp.site.UrlGetter.get(UrlGetter.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String getMaskedUrl(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetMaskedUrl_1()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {' '};

		String result = fixture.getMaskedUrl(url, sensitive);

		// add additional test code here
		assertEquals("*****", result);
	}

	/**
	 * Run the String getMaskedUrl(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetMaskedUrl_2()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.getMaskedUrl(url, sensitive);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMaskedUrl(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetMaskedUrl_3()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.getMaskedUrl(url, sensitive);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void handleStatusCode(GetMethod,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testHandleStatusCode_1()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		GetMethod method = new GetMethod();
		int statusCode = 200;

		fixture.handleStatusCode(method, statusCode);

		// add additional test code here
	}

	/**
	 * Run the void handleStatusCode(GetMethod,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testHandleStatusCode_2()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		GetMethod method = new GetMethod();
		int statusCode = 1;

		fixture.handleStatusCode(method, statusCode);

		// add additional test code here
	}

	/**
	 * Run the void handleStatusCode(GetMethod,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testHandleStatusCode_3()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		GetMethod method = new GetMethod();
		int statusCode = 401;

		fixture.handleStatusCode(method, statusCode);

		// add additional test code here
	}

	/**
	 * Run the void handleStatusCode(GetMethod,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testHandleStatusCode_4()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		GetMethod method = new GetMethod();
		int statusCode = 403;

		fixture.handleStatusCode(method, statusCode);

		// add additional test code here
	}

	/**
	 * Run the void setAuthType(GetMethod,HttpClient,AuthScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetAuthType_1()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		GetMethod method = new GetMethod();
		HttpClient client = new HttpClient();
		AuthScope scope = new AuthScope(new AuthScope((AuthScope) null));

		fixture.setAuthType(method, client, scope);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Scope may not be null
		//       at org.apache.commons.httpclient.auth.AuthScope.<init>(AuthScope.java:160)
	}

	/**
	 * Run the void setAuthType(GetMethod,HttpClient,AuthScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetAuthType_2()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = null;
		GetMethod method = new GetMethod();
		HttpClient client = new HttpClient();
		AuthScope scope = new AuthScope(new AuthScope((AuthScope) null));

		fixture.setAuthType(method, client, scope);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Scope may not be null
		//       at org.apache.commons.httpclient.auth.AuthScope.<init>(AuthScope.java:160)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UrlGetterTest.class);
	}
}