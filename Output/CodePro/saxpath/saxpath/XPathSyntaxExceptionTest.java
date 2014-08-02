package saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XPathSyntaxExceptionTest</code> contains tests for the class <code>{@link XPathSyntaxException}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:36 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XPathSyntaxExceptionTest {
	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testXPathSyntaxException_1()
		throws Exception {
		String xpath = "";
		int position = 1;
		String message = "";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: saxpath/XPathSyntaxException : Unsupported major.minor version 51.0
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
	 * Run the String getMultilineMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetMultilineMessage_1()
		throws Exception {
		XPathSyntaxException fixture = new XPathSyntaxException("", 1, "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getMultilineMessage();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetPosition_1()
		throws Exception {
		XPathSyntaxException fixture = new XPathSyntaxException("", 1, "");
		fixture.addSuppressed(new Throwable());

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getPositionMarker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetPositionMarker_1()
		throws Exception {
		XPathSyntaxException fixture = new XPathSyntaxException("", 1, "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getPositionMarker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPositionMarker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetPositionMarker_2()
		throws Exception {
		XPathSyntaxException fixture = new XPathSyntaxException("", 0, "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getPositionMarker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetXPath_1()
		throws Exception {
		XPathSyntaxException fixture = new XPathSyntaxException("", 1, "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.getXPath();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		XPathSyntaxException fixture = new XPathSyntaxException("", 1, "");
		fixture.addSuppressed(new Throwable());

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
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
	 * @generatedBy CodePro at 4/8/14 10:36 AM
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
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XPathSyntaxExceptionTest.class);
	}
}