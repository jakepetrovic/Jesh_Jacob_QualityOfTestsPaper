package org.jsecurity.aop;

import java.lang.annotation.Annotation;
import org.jsecurity.authz.aop.AuthenticatedAnnotationHandler;
import org.jsecurity.authz.aop.AuthenticatedAnnotationMethodInterceptor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AnnotationMethodInterceptorTest</code> contains tests for the class <code>{@link AnnotationMethodInterceptor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:34 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AnnotationMethodInterceptorTest {
	/**
	 * Run the Annotation getAnnotation(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testGetAnnotation_1()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		Annotation result = fixture.getAnnotation(mi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Annotation getAnnotation(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetAnnotation_2()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		Annotation result = fixture.getAnnotation(mi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Annotation getAnnotation(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetAnnotation_3()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		Annotation result = fixture.getAnnotation(mi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AnnotationHandler getHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testGetHandler_1()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();

		AnnotationHandler result = fixture.getHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setHandler(AnnotationHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetHandler_1()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		AnnotationHandler handler = new AuthenticatedAnnotationHandler();

		fixture.setHandler(handler);

		// add additional test code here
	}

	/**
	 * Run the boolean supports(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSupports_1()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		boolean result = fixture.supports(mi);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean supports(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSupports_2()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		boolean result = fixture.supports(mi);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean supports(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSupports_3()
		throws Exception {
		AnnotationMethodInterceptor fixture = new AuthenticatedAnnotationMethodInterceptor();
		MethodInvocation mi = null;

		boolean result = fixture.supports(mi);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
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
	 * @generatedBy CodePro at 4/19/14 3:34 PM
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
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AnnotationMethodInterceptorTest.class);
	}
}