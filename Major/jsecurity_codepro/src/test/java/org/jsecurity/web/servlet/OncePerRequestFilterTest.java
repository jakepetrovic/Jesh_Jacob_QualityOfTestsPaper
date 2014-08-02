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
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OncePerRequestFilterTest</code> contains tests for the class <code>{@link OncePerRequestFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OncePerRequestFilterTest {
	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoFilter_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoFilter_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoFilter_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoFilter_4()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoFilter_5()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoFilter_6()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoFilter_7()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoFilter_8()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testDoFilter_9()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testDoFilter_10()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testDoFilter_11()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain filterChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
	}

	/**
	 * Run the String getAlreadyFilteredAttributeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAlreadyFilteredAttributeName_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		String result = fixture.getAlreadyFilteredAttributeName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAlreadyFilteredAttributeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAlreadyFilteredAttributeName_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		String result = fixture.getAlreadyFilteredAttributeName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterConfig getFilterConfig() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetFilterConfig_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		FilterConfig result = fixture.getFilterConfig();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetName_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init(FilterConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		FilterConfig filterConfig = null;

		fixture.init(filterConfig);

		// add additional test code here
	}

	/**
	 * Run the void onFilterConfigSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnFilterConfigSet_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;

		fixture.onFilterConfigSet();

		// add additional test code here
	}

	/**
	 * Run the void setFilterConfig(FilterConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetFilterConfig_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		FilterConfig filterConfig = null;

		fixture.setFilterConfig(filterConfig);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the boolean shouldNotFilter(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testShouldNotFilter_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.filterConfig = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		boolean result = fixture.shouldNotFilter(request);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OncePerRequestFilterTest.class);
	}
}