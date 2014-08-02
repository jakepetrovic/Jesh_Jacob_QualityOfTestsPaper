package org.jsecurity.web.filter.authc;

import java.net.InetAddress;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuthenticatingFilterTest</code> contains tests for the class <code>{@link AuthenticatingFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:24 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthenticatingFilterTest {
	/**
	 * Run the AuthenticationToken createToken(String,String,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testCreateToken_1()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		String username = "";
		String password = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(username, password, request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationToken createToken(String,String,boolean,InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testCreateToken_2()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		String username = "";
		String password = "";
		boolean rememberMe = true;
		InetAddress inet = InetAddress.getLocalHost();

		AuthenticationToken result = fixture.createToken(username, password, rememberMe, inet);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean executeLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testExecuteLogin_1()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.executeLogin(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean executeLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testExecuteLogin_2()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.executeLogin(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean executeLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testExecuteLogin_3()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.executeLogin(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean executeLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testExecuteLogin_4()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.executeLogin(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean executeLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testExecuteLogin_5()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.executeLogin(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean executeLogin(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testExecuteLogin_6()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.executeLogin(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the InetAddress getInetAddress(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetInetAddress_1()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		InetAddress result = fixture.getInetAddress(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRememberMe(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testIsRememberMe_1()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		boolean result = fixture.isRememberMe(request);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onLoginFailure(AuthenticationToken,AuthenticationException,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testOnLoginFailure_1()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationException e = new AuthenticationException();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onLoginFailure(token, e, request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onLoginSuccess(AuthenticationToken,Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testOnLoginSuccess_1()
		throws Exception {
		AuthenticatingFilter fixture = new BasicHttpAuthenticationFilter();
		AuthenticationToken token = new UsernamePasswordToken();
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onLoginSuccess(token, subject, request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuthenticatingFilterTest.class);
	}
}