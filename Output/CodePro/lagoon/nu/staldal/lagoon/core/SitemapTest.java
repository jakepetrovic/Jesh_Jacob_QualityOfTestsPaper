package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import nu.staldal.xtree.Element;
import java.io.Writer;
import java.util.Enumeration;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SitemapTest</code> contains tests for the class <code>{@link Sitemap}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SitemapTest {
	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSitemap_1()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		Element sitemapTree = new Element("", "", 1, 1);
		File sourceDir = new File("");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/core/Sitemap : Unsupported major.minor version 51.0
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
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSitemap_2()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		Element sitemapTree = new Element("", "sitemap", 1, 1);
		File sourceDir = new File("");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/core/Sitemap : Unsupported major.minor version 51.0
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
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDestroy_2()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDestroy_3()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the Enumeration getEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetEntries_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		Enumeration result = fixture.getEntries();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetProperty_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));
		String key = "";

		String result = fixture.getProperty(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSiteName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetSiteName_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		String result = fixture.getSiteName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Enumeration getTargets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetTargets_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		Enumeration result = fixture.getTargets();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_4()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_5()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_6()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_7()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_8()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_9()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_10()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_11()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_12()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_13()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_14()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_15()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_16()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the SitemapEntry lookupEntry(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupEntry_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));
		String target = "";

		SitemapEntry result = fixture.lookupEntry(target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputEntry lookupOutput(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupOutput_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));
		String name = "";

		OutputEntry result = fixture.lookupOutput(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry lookupPart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupPart_1()
		throws Exception {
		Sitemap fixture = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", "sitemap", 1, 1), new File(""));
		String name = "";

		PartEntry result = fixture.lookupPart(name);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(SitemapTest.class);
	}
}