package org.jsecurity.aop;

import org.jsecurity.authz.aop.AuthenticatedAnnotationMethodInterceptor;
import org.jsecurity.subject.Subject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MethodInterceptorSupportTest</code> contains tests for the class <code>{@link MethodInterceptorSupport}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class MethodInterceptorSupportTest {
	/**
	 * Run the Subject getSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetSubject_1()
		throws Exception {
		MethodInterceptorSupport fixture = new AuthenticatedAnnotationMethodInterceptor();

		Subject result = fixture.getSubject();

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
		new org.junit.runner.JUnitCore().run(MethodInterceptorSupportTest.class);
	}
}