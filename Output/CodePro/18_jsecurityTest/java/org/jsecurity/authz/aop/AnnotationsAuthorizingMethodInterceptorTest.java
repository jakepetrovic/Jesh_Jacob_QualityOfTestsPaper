package org.jsecurity.authz.aop;

import java.util.Collection;
import java.util.Vector;
import org.jsecurity.aop.MethodInvocation;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.spring.security.interceptor.AopAllianceAnnotationsAuthorizingMethodInterceptor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AnnotationsAuthorizingMethodInterceptorTest</code> contains tests for the class <code>{@link AnnotationsAuthorizingMethodInterceptor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AnnotationsAuthorizingMethodInterceptorTest {
	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testAssertAuthorized_1()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();
		MethodInvocation methodInvocation = null;

		fixture.assertAuthorized(methodInvocation);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testAssertAuthorized_2()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();
		MethodInvocation methodInvocation = null;

		fixture.assertAuthorized(methodInvocation);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testAssertAuthorized_3()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();
		MethodInvocation methodInvocation = null;

		fixture.assertAuthorized(methodInvocation);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testAssertAuthorized_4()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = null;
		MethodInvocation methodInvocation = null;

		fixture.assertAuthorized(methodInvocation);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testAssertAuthorized_5()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();
		MethodInvocation methodInvocation = null;

		fixture.assertAuthorized(methodInvocation);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testAssertAuthorized_6()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();
		MethodInvocation methodInvocation = null;

		fixture.assertAuthorized(methodInvocation);

		// add additional test code here
	}

	/**
	 * Run the Collection<AuthorizingAnnotationMethodInterceptor> getMethodInterceptors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetMethodInterceptors_1()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();

		Collection<AuthorizingAnnotationMethodInterceptor> result = fixture.getMethodInterceptors();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setMethodInterceptors(Collection<AuthorizingAnnotationMethodInterceptor>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetMethodInterceptors_1()
		throws Exception {
		AopAllianceAnnotationsAuthorizingMethodInterceptor fixture = new AopAllianceAnnotationsAuthorizingMethodInterceptor();
		fixture.methodInterceptors = new Vector();
		Collection<AuthorizingAnnotationMethodInterceptor> methodInterceptors = new Vector();

		fixture.setMethodInterceptors(methodInterceptors);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AnnotationsAuthorizingMethodInterceptorTest.class);
	}
}