package org.jsecurity.authz.aop;

import java.lang.annotation.Annotation;
import org.jsecurity.authz.UnauthorizedException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RoleAnnotationHandlerTest</code> contains tests for the class <code>{@link RoleAnnotationHandler}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class RoleAnnotationHandlerTest {
	/**
	 * Run the RoleAnnotationHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRoleAnnotationHandler_1()
		throws Exception {

		RoleAnnotationHandler result = new RoleAnnotationHandler();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/aop/RoleAnnotationHandler : Unsupported major.minor version 51.0
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
	 * Run the void assertAuthorized(Annotation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAssertAuthorized_1()
		throws Exception {
		RoleAnnotationHandler fixture = new RoleAnnotationHandler();
		Annotation a = null;

		fixture.assertAuthorized(a);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(Annotation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAssertAuthorized_2()
		throws Exception {
		RoleAnnotationHandler fixture = new RoleAnnotationHandler();
		Annotation a = null;

		fixture.assertAuthorized(a);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(Annotation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAssertAuthorized_3()
		throws Exception {
		RoleAnnotationHandler fixture = new RoleAnnotationHandler();
		Annotation a = null;

		fixture.assertAuthorized(a);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(Annotation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authz.UnauthorizedException.class)
	public void testAssertAuthorized_4()
		throws Exception {
		RoleAnnotationHandler fixture = new RoleAnnotationHandler();
		Annotation a = null;

		fixture.assertAuthorized(a);

		// add additional test code here
	}

	/**
	 * Run the void assertAuthorized(Annotation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authz.UnauthorizedException.class)
	public void testAssertAuthorized_5()
		throws Exception {
		RoleAnnotationHandler fixture = new RoleAnnotationHandler();
		Annotation a = null;

		fixture.assertAuthorized(a);

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
		new org.junit.runner.JUnitCore().run(RoleAnnotationHandlerTest.class);
	}
}