package saxpath;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SAXPathExceptionTest</code> contains tests for the class <code>{@link SAXPathException}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:36 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SAXPathExceptionTest {
	/**
	 * Run the SAXPathException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSAXPathException_1()
		throws Exception {
		String msg = "";

		SAXPathException result = new SAXPathException(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: saxpath/SAXPathException : Unsupported major.minor version 51.0
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
	 * Run the SAXPathException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSAXPathException_2()
		throws Exception {
		Throwable src = new Throwable();

		SAXPathException result = new SAXPathException(src);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: saxpath/SAXPathException : Unsupported major.minor version 51.0
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
	 * Run the Throwable getCause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetCause_1()
		throws Exception {
		SAXPathException fixture = new SAXPathException(new Throwable());
		fixture.addSuppressed(new Throwable());

		Throwable result = fixture.getCause();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void printStackTrace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPrintStackTrace_1()
		throws Exception {
		SAXPathException fixture = new SAXPathException(new Throwable());
		fixture.addSuppressed(new Throwable());

		fixture.printStackTrace();

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPrintStackTrace_2()
		throws Exception {
		SAXPathException fixture = new SAXPathException(new Throwable());
		fixture.addSuppressed(new Throwable());
		PrintStream s = new PrintStream(new ByteArrayOutputStream());

		fixture.printStackTrace(s);

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPrintStackTrace_3()
		throws Exception {
		SAXPathException fixture = new SAXPathException(new Throwable());
		fixture.addSuppressed(new Throwable());
		PrintStream s = new PrintStream(new ByteArrayOutputStream());

		fixture.printStackTrace(s);

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPrintStackTrace_4()
		throws Exception {
		SAXPathException fixture = new SAXPathException(new Throwable());
		fixture.addSuppressed(new Throwable());
		PrintWriter s = new PrintWriter(new CharArrayWriter());

		fixture.printStackTrace(s);

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPrintStackTrace_5()
		throws Exception {
		SAXPathException fixture = new SAXPathException(new Throwable());
		fixture.addSuppressed(new Throwable());
		PrintWriter s = new PrintWriter(new CharArrayWriter());

		fixture.printStackTrace(s);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SAXPathExceptionTest.class);
	}
}