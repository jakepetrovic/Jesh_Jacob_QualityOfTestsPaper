package net.sf.lavalamp.site;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UrlGetterTest</code> contains tests for the class <code>{@link UrlGetter}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class UrlGetterTest {
	/**
	 * Run the UrlGetter() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGet_2()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testGet_3()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGet_5()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGet_6()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGet_7()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testGet_8()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testGet_9()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = org.apache.commons.httpclient.HttpException.class)
	public void testGet_10()
		throws Exception {
		UrlGetter fixture = new UrlGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMaskedUrl(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
		assertNotNull(result);
	}

	/**
	 * Run the String getMaskedUrl(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
		assertNotNull(result);
	}

	/**
	 * Run the String getMaskedUrl(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
		assertNotNull(result);
	}

	/**
	 * Run the void handleStatusCode(GetMethod,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	}

	/**
	 * Run the void setAuthType(GetMethod,HttpClient,AuthScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UrlGetterTest.class);
	}
}