package org.jsecurity.authz.aop;

import org.jsecurity.aop.MethodInvocation;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.spring.security.interceptor.AopAllianceAnnotationsAuthorizingMethodInterceptor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuthorizingMethodInterceptorTest</code> contains tests for the class <code>{@link AuthorizingMethodInterceptor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthorizingMethodInterceptorTest {
	/**
	 * Run the Object invoke(MethodInvocation) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInvoke_1()
		throws Throwable {
		AuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		MethodInvocation methodInvocation = null;

		Object result = fixture.invoke(methodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(MethodInvocation) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.Throwable.class)
	public void testInvoke_2()
		throws Throwable {
		AuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		MethodInvocation methodInvocation = null;

		Object result = fixture.invoke(methodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(MethodInvocation) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testInvoke_3()
		throws Throwable {
		AuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		MethodInvocation methodInvocation = null;

		Object result = fixture.invoke(methodInvocation);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AuthorizingMethodInterceptorTest.class);
	}
}