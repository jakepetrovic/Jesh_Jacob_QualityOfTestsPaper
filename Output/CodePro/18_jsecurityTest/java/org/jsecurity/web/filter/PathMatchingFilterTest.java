package org.jsecurity.web.filter;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.util.AntPathMatcher;
import org.jsecurity.util.PatternMatcher;
import org.jsecurity.web.filter.authc.BasicHttpAuthenticationFilter;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PathMatchingFilterTest</code> contains tests for the class <code>{@link PathMatchingFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PathMatchingFilterTest {
	/**
	 * Run the String getPathWithinApplication(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetPathWithinApplication_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = fixture.getPathWithinApplication(request);

		// add additional test code here
		assertNotNull(result);
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
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.onPreHandle(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean pathsMatch(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPathsMatch_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		String pattern = "";
		String path = "";

		boolean result = fixture.pathsMatch(pattern, path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean pathsMatch(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPathsMatch_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		String pattern = "";
		String path = "";

		boolean result = fixture.pathsMatch(pattern, path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean pathsMatch(String,ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPathsMatch_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		String path = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		boolean result = fixture.pathsMatch(path, request);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean pathsMatch(String,ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPathsMatch_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		String path = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		boolean result = fixture.pathsMatch(path, request);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPreHandle_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPreHandle_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPreHandle_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPreHandle_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPreHandle_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPreHandle_6()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testPreHandle_7()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void processPathConfig(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testProcessPathConfig_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		String path = "";
		String config = "";

		fixture.processPathConfig(path, config);

		// add additional test code here
	}

	/**
	 * Run the void processPathConfig(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testProcessPathConfig_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.pathMatcher = new AntPathMatcher();
		fixture.appliedPaths = new LinkedHashMap();
		String path = "";
		String config = null;

		fixture.processPathConfig(path, config);

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
		new org.junit.runner.JUnitCore().run(PathMatchingFilterTest.class);
	}
}