package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import org.junit.*;
import nu.staldal.xtree.Element;
import static org.junit.Assert.*;

/**
 * The class <code>DeleteEntryTest</code> contains tests for the class <code>{@link DeleteEntry}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeleteEntryTest {
	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDeleteEntry_1()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/core/DeleteEntry : Unsupported major.minor version 51.0
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
	 * Run the void afterBuild(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAfterBuild_1()
		throws Exception {
		DeleteEntry fixture = new DeleteEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), "");
		boolean always = true;

		fixture.afterBuild(always);

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testBeforeBuild_1()
		throws Exception {
		DeleteEntry fixture = new DeleteEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), "");
		boolean always = true;

		fixture.beforeBuild(always);

		// add additional test code here
	}

	/**
	 * Run the boolean build(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testBuild_1()
		throws Exception {
		DeleteEntry fixture = new DeleteEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), "");
		boolean always = true;

		boolean result = fixture.build(always);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean build(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testBuild_2()
		throws Exception {
		DeleteEntry fixture = new DeleteEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), "");
		boolean always = true;

		boolean result = fixture.build(always);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		DeleteEntry fixture = new DeleteEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), "");

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DeleteEntryTest.class);
	}
}