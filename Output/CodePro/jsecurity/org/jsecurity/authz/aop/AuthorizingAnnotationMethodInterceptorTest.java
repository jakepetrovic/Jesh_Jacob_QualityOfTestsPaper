package org.jsecurity.authz.aop;

import org.jsecurity.aop.MethodInvocation;
import org.jsecurity.authz.AuthorizationException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuthorizingAnnotationMethodInterceptorTest</code> contains tests for the class <code>{@link AuthorizingAnnotationMethodInterceptor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:13 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthorizingAnnotationMethodInterceptorTest {
	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testAssertAuthorized_1()
		throws Exception {
		AuthorizingAnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		fixture.assertAuthorized(mi);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testAssertAuthorized_2()
		throws Exception {
		AuthorizingAnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		fixture.assertAuthorized(mi);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAssertAuthorized_3()
		throws Exception {
		AuthorizingAnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		fixture.assertAuthorized(mi);

		// add additional test code here
	}

	/**
	 * Run the Object invoke(MethodInvocation) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testInvoke_1()
		throws Throwable {
		AuthorizingAnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = java.lang.Throwable.class)
	public void testInvoke_2()
		throws Throwable {
		AuthorizingAnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testInvoke_3()
		throws Throwable {
		AuthorizingAnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuthorizingAnnotationMethodInterceptorTest.class);
	}
}