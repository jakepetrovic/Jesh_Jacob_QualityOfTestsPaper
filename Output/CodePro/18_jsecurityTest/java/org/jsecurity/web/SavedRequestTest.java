package org.jsecurity.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SavedRequestTest</code> contains tests for the class <code>{@link SavedRequest}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:07 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SavedRequestTest {
	/**
	 * Run the SavedRequest(HttpServletRequest) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSavedRequest_1()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		SavedRequest result = new SavedRequest(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/SavedRequest : Unsupported major.minor version 51.0
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
	 * Run the String getMethod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetMethod_1()
		throws Exception {
		SavedRequest fixture = new SavedRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		String result = fixture.getMethod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getQueryString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetQueryString_1()
		throws Exception {
		SavedRequest fixture = new SavedRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		String result = fixture.getQueryString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetRequestURI_1()
		throws Exception {
		SavedRequest fixture = new SavedRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		String result = fixture.getRequestURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetRequestUrl_1()
		throws Exception {
		SavedRequest fixture = new SavedRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		String result = fixture.getRequestUrl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetRequestUrl_2()
		throws Exception {
		SavedRequest fixture = new SavedRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		String result = fixture.getRequestUrl();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(SavedRequestTest.class);
	}
}