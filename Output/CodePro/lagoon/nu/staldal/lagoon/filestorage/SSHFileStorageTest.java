package nu.staldal.lagoon.filestorage;

import java.io.CharArrayWriter;
import java.io.File;
import nu.staldal.lagoon.core.LagoonProcessor;
import java.io.IOException;
import java.io.PrintWriter;
import nu.staldal.xtree.Element;
import java.io.Writer;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.OutputHandler;
import org.junit.*;
import nu.staldal.lagoon.core.LagoonContext;
import static org.junit.Assert.*;

/**
 * The class <code>SSHFileStorageTest</code> contains tests for the class <code>{@link SSHFileStorage}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SSHFileStorageTest {
	/**
	 * Run the SSHFileStorage() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSSHFileStorage_1()
		throws Exception {

		SSHFileStorage result = new SSHFileStorage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/filestorage/SSHFileStorage : Unsupported major.minor version 51.0
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
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testClose_2()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the OutputHandler createFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCreateFile_1()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String path = "";

		OutputHandler result = fixture.createFile(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputHandler createFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testCreateFile_2()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String path = "";

		OutputHandler result = fixture.createFile(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDeleteFile_1()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String path = "";

		fixture.deleteFile(path);

		// add additional test code here
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeleteFile_2()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String path = "";

		fixture.deleteFile(path);

		// add additional test code here
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeleteFile_3()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String path = "";

		fixture.deleteFile(path);

		// add additional test code here
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.InterruptedException.class)
	public void testDeleteFile_4()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String path = "";

		fixture.deleteFile(path);

		// add additional test code here
	}

	/**
	 * Run the boolean isReentrant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIsReentrant_1()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();

		boolean result = fixture.isReentrant();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean needPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNeedPassword_1()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();

		boolean result = fixture.needPassword();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_1()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_2()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_3()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_4()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_5()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_6()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_7()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_8()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_9()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_10()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOpen_11()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOpen_12()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testOpen_13()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testOpen_14()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testOpen_15()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

		// add additional test code here
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testOpen_16()
		throws Exception {
		SSHFileStorage fixture = new SSHFileStorage();
		String url = "ssh://";
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		String passoword = "";

		fixture.open(url, context, passoword);

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
		new org.junit.runner.JUnitCore().run(SSHFileStorageTest.class);
	}
}