package org.jsecurity.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JSecurityHttpServletResponseTest</code> contains tests for the class <code>{@link JSecurityHttpServletResponse}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JSecurityHttpServletResponseTest {
	/**
	 * Run the JSecurityHttpServletResponse(HttpServletResponse,ServletContext,JSecurityHttpServletRequest) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testJSecurityHttpServletResponse_1()
		throws Exception {
		HttpServletResponse wrapped = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		ServletContext context = null;
		JSecurityHttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		JSecurityHttpServletResponse result = new JSecurityHttpServletResponse(wrapped, context, request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/servlet/JSecurityHttpServletResponse : Unsupported major.minor version 51.0
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
	 * Run the String encodeRedirectURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeRedirectURL_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		String result = fixture.encodeRedirectURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeRedirectURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeRedirectURL_2()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		String result = fixture.encodeRedirectURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeRedirectUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeRedirectUrl_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String s = "";

		String result = fixture.encodeRedirectUrl(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeURL_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		String result = fixture.encodeURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeURL_2()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		String result = fixture.encodeURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeURL_3()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		String result = fixture.encodeURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEncodeUrl_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String s = "";

		String result = fixture.encodeUrl(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetContext_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		ServletContext result = fixture.getContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JSecurityHttpServletRequest getRequest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetRequest_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		JSecurityHttpServletRequest result = fixture.getRequest();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = null;

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_2()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = null;

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_3()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "#";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_4()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "#";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_5()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_6()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_7()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_8()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_9()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEncodeable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsEncodeable_10()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String location = "";

		boolean result = fixture.isEncodeable(location);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSchemeChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsSchemeChar_1()
		throws Exception {
		char c = '';

		boolean result = JSecurityHttpServletResponse.isSchemeChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSchemeChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsSchemeChar_2()
		throws Exception {
		char c = '+';

		boolean result = JSecurityHttpServletResponse.isSchemeChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSchemeChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsSchemeChar_3()
		throws Exception {
		char c = '-';

		boolean result = JSecurityHttpServletResponse.isSchemeChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSchemeChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsSchemeChar_4()
		throws Exception {
		char c = '.';

		boolean result = JSecurityHttpServletResponse.isSchemeChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSchemeChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsSchemeChar_5()
		throws Exception {
		char c = '';

		boolean result = JSecurityHttpServletResponse.isSchemeChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setContext(ServletContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetContext_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		ServletContext context = null;

		fixture.setContext(context);

		// add additional test code here
	}

	/**
	 * Run the void setRequest(JSecurityHttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetRequest_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		JSecurityHttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		fixture.setRequest(request);

		// add additional test code here
	}

	/**
	 * Run the String toEncoded(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testToEncoded_1()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = null;
		String sessionId = "";

		String result = fixture.toEncoded(url, sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toEncoded(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testToEncoded_2()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		String sessionId = null;

		String result = fixture.toEncoded(url, sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toEncoded(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testToEncoded_3()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		String sessionId = "";

		String result = fixture.toEncoded(url, sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toEncoded(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testToEncoded_4()
		throws Exception {
		JSecurityHttpServletResponse fixture = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		String sessionId = "";

		String result = fixture.toEncoded(url, sessionId);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(JSecurityHttpServletResponseTest.class);
	}
}