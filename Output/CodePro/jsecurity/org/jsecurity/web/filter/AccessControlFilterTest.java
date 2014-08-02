package org.jsecurity.web.filter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.subject.Subject;
import org.jsecurity.util.AntPathMatcher;
import org.jsecurity.util.PatternMatcher;
import org.jsecurity.web.filter.authc.BasicHttpAuthenticationFilter;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AccessControlFilterTest</code> contains tests for the class <code>{@link AccessControlFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AccessControlFilterTest {
	/**
	 * Run the String getLoginUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetLoginUrl_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();

		String result = fixture.getLoginUrl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject getSubject(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetSubject_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Subject result = fixture.getSubject(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLoginRequest(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsLoginRequest_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginRequest(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginRequest(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsLoginRequest_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginRequest(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onPreHandle(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnPreHandle_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.onPreHandle(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onPreHandle(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnPreHandle_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.onPreHandle(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onPreHandle(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnPreHandle_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.onPreHandle(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onPreHandle(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOnPreHandle_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.onPreHandle(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onPreHandle(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOnPreHandle_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.onPreHandle(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void redirectToLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRedirectToLogin_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.redirectToLogin(request, response);

		// add additional test code here
	}

	/**
	 * Run the void redirectToLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testRedirectToLogin_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.redirectToLogin(request, response);

		// add additional test code here
	}

	/**
	 * Run the void saveRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSaveRequest_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		fixture.saveRequest(request);

		// add additional test code here
	}

	/**
	 * Run the void saveRequestAndRedirectToLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSaveRequestAndRedirectToLogin_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.saveRequestAndRedirectToLogin(request, response);

		// add additional test code here
	}

	/**
	 * Run the void saveRequestAndRedirectToLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testSaveRequestAndRedirectToLogin_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.saveRequestAndRedirectToLogin(request, response);

		// add additional test code here
	}

	/**
	 * Run the void setLoginUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetLoginUrl_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.appliedPaths = new LinkedHashMap();
		fixture.pathMatcher = new AntPathMatcher();
		String loginUrl = "";

		fixture.setLoginUrl(loginUrl);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AccessControlFilterTest.class);
	}
}