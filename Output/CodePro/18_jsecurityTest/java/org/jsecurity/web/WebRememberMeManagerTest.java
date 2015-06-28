package org.jsecurity.web;

import org.jsecurity.web.attr.CookieAttribute;
import org.jsecurity.web.attr.WebAttribute;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WebRememberMeManagerTest</code> contains tests for the class <code>{@link WebRememberMeManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:33 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WebRememberMeManagerTest {
	/**
	 * Run the WebRememberMeManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testWebRememberMeManager_1()
		throws Exception {

		WebRememberMeManager result = new WebRememberMeManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/WebRememberMeManager : Unsupported major.minor version 51.0
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
	 * Run the void assertCookieAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testAssertCookieAttribute_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		fixture.assertCookieAttribute();

		// add additional test code here
	}

	/**
	 * Run the void assertCookieAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testAssertCookieAttribute_2()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		fixture.assertCookieAttribute();

		// add additional test code here
	}

	/**
	 * Run the void forgetIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testForgetIdentity_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		fixture.forgetIdentity();

		// add additional test code here
	}

	/**
	 * Run the void forgetIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testForgetIdentity_2()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		fixture.forgetIdentity();

		// add additional test code here
	}

	/**
	 * Run the void forgetIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testForgetIdentity_3()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		fixture.forgetIdentity();

		// add additional test code here
	}

	/**
	 * Run the int getCookieMaxAge() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetCookieMaxAge_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		int result = fixture.getCookieMaxAge();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getCookieName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetCookieName_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		String result = fixture.getCookieName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCookiePath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetCookiePath_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		String result = fixture.getCookiePath();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WebAttribute<String> getIdentityAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetIdentityAttribute_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		WebAttribute<String> result = fixture.getIdentityAttribute();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getSerializedRememberedIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetSerializedRememberedIdentity_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		byte[] result = fixture.getSerializedRememberedIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getSerializedRememberedIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetSerializedRememberedIdentity_2()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		byte[] result = fixture.getSerializedRememberedIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getSerializedRememberedIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetSerializedRememberedIdentity_3()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		byte[] result = fixture.getSerializedRememberedIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getSerializedRememberedIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testGetSerializedRememberedIdentity_4()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		byte[] result = fixture.getSerializedRememberedIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getSerializedRememberedIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetSerializedRememberedIdentity_5()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		byte[] result = fixture.getSerializedRememberedIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getSerializedRememberedIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetSerializedRememberedIdentity_6()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		byte[] result = fixture.getSerializedRememberedIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isCookieSecure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testIsCookieSecure_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		boolean result = fixture.isCookieSecure();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isCookieSecure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testIsCookieSecure_2()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());

		boolean result = fixture.isCookieSecure();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void rememberSerializedIdentity(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testRememberSerializedIdentity_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		byte[] serialized = new byte[] {};

		fixture.rememberSerializedIdentity(serialized);

		// add additional test code here
	}

	/**
	 * Run the void rememberSerializedIdentity(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRememberSerializedIdentity_2()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		byte[] serialized = new byte[] {};

		fixture.rememberSerializedIdentity(serialized);

		// add additional test code here
	}

	/**
	 * Run the void rememberSerializedIdentity(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRememberSerializedIdentity_3()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		byte[] serialized = new byte[] {};

		fixture.rememberSerializedIdentity(serialized);

		// add additional test code here
	}

	/**
	 * Run the void setCookieMaxAge(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testSetCookieMaxAge_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		int maxAge = 1;

		fixture.setCookieMaxAge(maxAge);

		// add additional test code here
	}

	/**
	 * Run the void setCookieName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testSetCookieName_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		String name = "";

		fixture.setCookieName(name);

		// add additional test code here
	}

	/**
	 * Run the void setCookiePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testSetCookiePath_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		String path = "";

		fixture.setCookiePath(path);

		// add additional test code here
	}

	/**
	 * Run the void setCookieSecure(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testSetCookieSecure_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		boolean secure = true;

		fixture.setCookieSecure(secure);

		// add additional test code here
	}

	/**
	 * Run the void setIdentityAttribute(WebAttribute<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	@Test
	public void testSetIdentityAttribute_1()
		throws Exception {
		WebRememberMeManager fixture = new WebRememberMeManager();
		fixture.setIdentityAttribute(new CookieAttribute());
		WebAttribute<String> identityAttribute = new CookieAttribute();

		fixture.setIdentityAttribute(identityAttribute);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:33 PM
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
	 * @generatedBy CodePro at 4/19/14 3:33 PM
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
	 * @generatedBy CodePro at 4/19/14 3:33 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WebRememberMeManagerTest.class);
	}
}