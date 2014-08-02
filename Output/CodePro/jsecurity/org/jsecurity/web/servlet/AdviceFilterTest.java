package org.jsecurity.web.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.web.filter.authc.BasicHttpAuthenticationFilter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AdviceFilterTest</code> contains tests for the class <code>{@link AdviceFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AdviceFilterTest {
	/**
	 * Run the void afterCompletion(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testAfterCompletion_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception exception = new Exception();

		fixture.afterCompletion(request, response, exception);

		// add additional test code here
	}

	/**
	 * Run the void cleanup(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testCleanup_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception existing = null;

		fixture.cleanup(request, response, existing);

		// add additional test code here
	}

	/**
	 * Run the void cleanup(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testCleanup_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception existing = null;

		fixture.cleanup(request, response, existing);

		// add additional test code here
	}

	/**
	 * Run the void cleanup(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testCleanup_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception existing = null;

		fixture.cleanup(request, response, existing);

		// add additional test code here
	}

	/**
	 * Run the void cleanup(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testCleanup_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception existing = new IOException();

		fixture.cleanup(request, response, existing);

		// add additional test code here
	}

	/**
	 * Run the void cleanup(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testCleanup_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception existing = new ServletException();

		fixture.cleanup(request, response, existing);

		// add additional test code here
	}

	/**
	 * Run the void cleanup(ServletRequest,ServletResponse,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testCleanup_6()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Exception existing = new Exception();

		fixture.cleanup(request, response, existing);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_4()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_5()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_6()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_7()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testDoFilterInternal_8()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoFilterInternal_9()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoFilterInternal_10()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testDoFilterInternal_11()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testDoFilterInternal_12()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDoFilterInternal_13()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void executeChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testExecuteChain_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.executeChain(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void executeChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testExecuteChain_2()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.executeChain(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void executeChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testExecuteChain_3()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain chain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.executeChain(request, response, chain);

		// add additional test code here
	}

	/**
	 * Run the void postHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testPostHandle_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.postHandle(request, response);

		// add additional test code here
	}

	/**
	 * Run the boolean preHandle(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testPreHandle_1()
		throws Exception {
		BasicHttpAuthenticationFilter fixture = new BasicHttpAuthenticationFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.preHandle(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AdviceFilterTest.class);
	}
}