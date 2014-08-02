package org.jsecurity.web.filter.authc;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BasicHttpAuthenticationFilterTest</code> contains tests for the class <code>{@link BasicHttpAuthenticationFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:07 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BasicHttpAuthenticationFilterTest {
	/**
	 * Run the BasicHttpAuthenticationFilter() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testBasicHttpAuthenticationFilter_1()
		throws Exception {
		BasicHttpAuthenticationFilter result = new BasicHttpAuthenticationFilter();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the AuthenticationToken createToken(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateToken_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationToken createToken(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateToken_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationToken createToken(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateToken_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationToken createToken(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateToken_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationToken createToken(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateToken_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getApplicationName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetApplicationName_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");

		String result = fixture.getApplicationName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAuthcScheme() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthcScheme_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");

		String result = fixture.getAuthcScheme();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAuthzHeader(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthzHeader_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = fixture.getAuthzHeader(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAuthzScheme() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthzScheme_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");

		String result = fixture.getAuthzScheme();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPrincipalsAndCredentials(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetPrincipalsAndCredentials_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String scheme = "";
		String encoded = "";

		String[] result = fixture.getPrincipalsAndCredentials(scheme, encoded);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPrincipalsAndCredentials(String,ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetPrincipalsAndCredentials_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authorizationHeader = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String[] result = fixture.getPrincipalsAndCredentials(authorizationHeader, request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPrincipalsAndCredentials(String,ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetPrincipalsAndCredentials_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authorizationHeader = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String[] result = fixture.getPrincipalsAndCredentials(authorizationHeader, request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPrincipalsAndCredentials(String,ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetPrincipalsAndCredentials_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authorizationHeader = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String[] result = fixture.getPrincipalsAndCredentials(authorizationHeader, request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPrincipalsAndCredentials(String,ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetPrincipalsAndCredentials_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authorizationHeader = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String[] result = fixture.getPrincipalsAndCredentials(authorizationHeader, request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLoginAttempt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsLoginAttempt_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authzHeader = "";

		boolean result = fixture.isLoginAttempt(authzHeader);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginAttempt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsLoginAttempt_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authzHeader = "";

		boolean result = fixture.isLoginAttempt(authzHeader);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginAttempt(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsLoginAttempt_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginAttempt(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginAttempt(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsLoginAttempt_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginAttempt(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginAttempt(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsLoginAttempt_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginAttempt(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onAccessDenied(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testOnAccessDenied_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onAccessDenied(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onAccessDenied(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testOnAccessDenied_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onAccessDenied(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onAccessDenied(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOnAccessDenied_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onAccessDenied(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean sendChallenge(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSendChallenge_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.sendChallenge(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean sendChallenge(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSendChallenge_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.sendChallenge(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setApplicationName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetApplicationName_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String applicationName = "";

		fixture.setApplicationName(applicationName);

		// add additional test code here
	}

	/**
	 * Run the void setAuthcScheme(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAuthcScheme_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authcScheme = "";

		fixture.setAuthcScheme(authcScheme);

		// add additional test code here
	}

	/**
	 * Run the void setAuthzScheme(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAuthzScheme_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.setAuthzScheme("");
		fixture.setAuthcScheme("");
		fixture.setApplicationName("");
		String authzScheme = "";

		fixture.setAuthzScheme(authzScheme);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BasicHttpAuthenticationFilterTest.class);
	}
}