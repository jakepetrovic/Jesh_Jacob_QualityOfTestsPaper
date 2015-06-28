package org.jsecurity.web.filter.authc;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserFilterTest</code> contains tests for the class <code>{@link UserFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class UserFilterTest {
	/**
	 * Run the boolean isAccessAllowed(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAccessAllowed_1()
		throws Exception {
		UserFilter fixture = new UserFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.isAccessAllowed(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAccessAllowed(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAccessAllowed_2()
		throws Exception {
		UserFilter fixture = new UserFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.isAccessAllowed(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAccessAllowed(ServletRequest,ServletResponse,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAccessAllowed_3()
		throws Exception {
		UserFilter fixture = new UserFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		Object mappedValue = new Object();

		boolean result = fixture.isAccessAllowed(request, response, mappedValue);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onAccessDenied(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testOnAccessDenied_1()
		throws Exception {
		UserFilter fixture = new UserFilter();
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOnAccessDenied_2()
		throws Exception {
		UserFilter fixture = new UserFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onAccessDenied(request, response);

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
		new org.junit.runner.JUnitCore().run(UserFilterTest.class);
	}
}