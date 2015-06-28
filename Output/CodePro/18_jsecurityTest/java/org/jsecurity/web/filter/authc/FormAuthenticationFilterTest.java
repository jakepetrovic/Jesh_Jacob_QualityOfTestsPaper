package org.jsecurity.web.filter.authc;

import java.io.IOException;
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
 * The class <code>FormAuthenticationFilterTest</code> contains tests for the class <code>{@link FormAuthenticationFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FormAuthenticationFilterTest {
	/**
	 * Run the FormAuthenticationFilter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testFormAuthenticationFilter_1()
		throws Exception {

		FormAuthenticationFilter result = new FormAuthenticationFilter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/filter/authc/FormAuthenticationFilter : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationToken createToken(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testCreateToken_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		AuthenticationToken result = fixture.createToken(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFailureKeyAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetFailureKeyAttribute_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");

		String result = fixture.getFailureKeyAttribute();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPassword(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetPassword_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = fixture.getPassword(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPasswordParam() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetPasswordParam_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");

		String result = fixture.getPasswordParam();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRememberMeParam() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRememberMeParam_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");

		String result = fixture.getRememberMeParam();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUsername(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUsername_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = fixture.getUsername(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUsernameParam() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUsernameParam_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");

		String result = fixture.getUsernameParam();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLoginSubmission(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsLoginSubmission_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginSubmission(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginSubmission(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsLoginSubmission_2()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginSubmission(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isLoginSubmission(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsLoginSubmission_3()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isLoginSubmission(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRememberMe(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRememberMe_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		boolean result = fixture.isRememberMe(request);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRememberMe(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRememberMe_2()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		boolean result = fixture.isRememberMe(request);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onAccessDenied(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnAccessDenied_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnAccessDenied_2()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnAccessDenied_3()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnAccessDenied_4()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnAccessDenied_5()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOnAccessDenied_6()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOnAccessDenied_7()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onAccessDenied(request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void onFilterConfigSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnFilterConfigSet_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");

		fixture.onFilterConfigSet();

		// add additional test code here
	}

	/**
	 * Run the void onFilterConfigSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnFilterConfigSet_2()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");

		fixture.onFilterConfigSet();

		// add additional test code here
	}

	/**
	 * Run the boolean onLoginFailure(AuthenticationToken,AuthenticationException,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLoginFailure_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLoginSuccess_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		AuthenticationToken token = new UsernamePasswordToken();
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onLoginSuccess(token, subject, request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean onLoginSuccess(AuthenticationToken,Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOnLoginSuccess_2()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		AuthenticationToken token = new UsernamePasswordToken();
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.onLoginSuccess(token, subject, request, response);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setFailureAttribute(ServletRequest,AuthenticationException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetFailureAttribute_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		AuthenticationException ae = new AuthenticationException();

		fixture.setFailureAttribute(request, ae);

		// add additional test code here
	}

	/**
	 * Run the void setFailureKeyAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetFailureKeyAttribute_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		String failureKeyAttribute = "";

		fixture.setFailureKeyAttribute(failureKeyAttribute);

		// add additional test code here
	}

	/**
	 * Run the void setPasswordParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetPasswordParam_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		String passwordParam = "";

		fixture.setPasswordParam(passwordParam);

		// add additional test code here
	}

	/**
	 * Run the void setRememberMeParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetRememberMeParam_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		String rememberMeParam = "";

		fixture.setRememberMeParam(rememberMeParam);

		// add additional test code here
	}

	/**
	 * Run the void setUsernameParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetUsernameParam_1()
		throws Exception {
		FormAuthenticationFilter fixture = new FormAuthenticationFilter();
		fixture.setFailureKeyAttribute("");
		fixture.setUsernameParam("");
		fixture.setRememberMeParam("");
		fixture.setPasswordParam("");
		String usernameParam = "";

		fixture.setUsernameParam(usernameParam);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FormAuthenticationFilterTest.class);
	}
}