package org.jsecurity.spring.security.interceptor;

import org.aopalliance.intercept.MethodInvocation;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AopAllianceAnnotationsAuthorizingMethodInterceptorTest</code> contains tests for the class <code>{@link AopAllianceAnnotationsAuthorizingMethodInterceptor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AopAllianceAnnotationsAuthorizingMethodInterceptorTest {
	/**
	 * Run the Object continueInvocation(Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testContinueInvocation_1()
		throws Throwable {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		Object aopAllianceMethodInvocation = null;

		Object result = fixture.continueInvocation(aopAllianceMethodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object continueInvocation(Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.Throwable.class)
	public void testContinueInvocation_2()
		throws Throwable {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		Object aopAllianceMethodInvocation = null;

		Object result = fixture.continueInvocation(aopAllianceMethodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the org.jsecurity.aop.MethodInvocation createMethodInvocation(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testCreateMethodInvocation_1()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		Object implSpecificMethodInvocation = null;

		org.jsecurity.aop.MethodInvocation result = fixture.createMethodInvocation(implSpecificMethodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(MethodInvocation) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testInvoke_1()
		throws Throwable {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.Throwable.class)
	public void testInvoke_2()
		throws Throwable {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
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
		new org.junit.runner.JUnitCore().run(AopAllianceAnnotationsAuthorizingMethodInterceptorTest.class);
	}
}