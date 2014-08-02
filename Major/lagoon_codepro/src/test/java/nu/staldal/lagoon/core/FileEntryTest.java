package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.xtree.Element;
import java.io.Writer;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/**
 * The class <code>FileEntryTest</code> contains tests for the class <code>{@link FileEntry}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FileEntryTest {
	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testFileEntry_1()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));
		Sitemap sitemap = new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File(""));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = new File("");
		File tempDir = new File("");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/core/FileEntry : Unsupported major.minor version 51.0
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
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		boolean always = true;

		fixture.afterBuild(always);

		// add additional test code here
	}

	/**
	 * Run the void afterBuild(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAfterBuild_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer((Producer) null);
		fixture.newAsyncTarget("", true);
		boolean always = true;

		fixture.afterBuild(always);

		// add additional test code here
	}

	/**
	 * Run the void afterBuild(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testAfterBuild_3()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
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
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		boolean always = true;

		fixture.beforeBuild(always);

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
	public void testBeforeBuild_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer((Producer) null);
		fixture.newAsyncTarget("", true);
		boolean always = true;

		fixture.beforeBuild(always);

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testBeforeBuild_3()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
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
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
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
	@Test
	public void testBuild_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
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
	public void testBuild_3()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
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
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

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
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer((Producer) null);
		fixture.newAsyncTarget("", true);

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
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the String getCurrentTargetURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetCurrentTargetURL_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

		String result = fixture.getCurrentTargetURL();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSourceURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetSourceURL_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

		String result = fixture.getSourceURL();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSourceURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSourceURL_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

		String result = fixture.getSourceURL();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isWildcard() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIsWildcard_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

		boolean result = fixture.isWildcard();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isWildcard() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIsWildcard_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);

		boolean result = fixture.isWildcard();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the OutputHandler newAsyncTarget(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNewAsyncTarget_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "aa";
		boolean prependFilename = false;

		OutputHandler result = fixture.newAsyncTarget(filename, prependFilename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputHandler newAsyncTarget(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNewAsyncTarget_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "aa";
		boolean prependFilename = false;

		OutputHandler result = fixture.newAsyncTarget(filename, prependFilename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputHandler newAsyncTarget(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testNewAsyncTarget_3()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "aa";
		boolean prependFilename = true;

		OutputHandler result = fixture.newAsyncTarget(filename, prependFilename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputHandler newAsyncTarget(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testNewAsyncTarget_4()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "aa";
		boolean prependFilename = true;

		OutputHandler result = fixture.newAsyncTarget(filename, prependFilename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNewAsyncTargetWithOutput_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("aa", "aa"), new File("aa")), "", "", new File("aa"), new File("aa"));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;
		String outputName = "aa";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testNewAsyncTargetWithOutput_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = true;
		String outputName = "";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testNewAsyncTargetWithOutput_3()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("aa", "aa"), new File("aa")), "", "", new File("aa"), new File("aa"));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;
		String outputName = "aa";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNewAsyncTargetWithOutput_4()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("aa", "aa"), new File("aa")), "", "", new File("aa"), new File("aa"));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;
		String outputName = "aa";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNewAsyncTargetWithOutput_5()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("aa", "aa"), new File("aa")), "", "", new File("aa"), new File("aa"));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;
		String outputName = "aa";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testNewAsyncTargetWithOutput_6()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("aa", "aa"), new File("aa")), "", "", new File("aa"), new File("aa"));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;
		String outputName = "aa";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandler newAsyncTargetWithOutput(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testNewAsyncTargetWithOutput_7()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("aa", new Element("aa", "aa"), new File("aa"), "aa", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("aa", "aa"), new File("aa")), "", "", new File("aa"), new File("aa"));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;
		String outputName = "aa";

		ContentHandler result = fixture.newAsyncTargetWithOutput(filename, prependFilename, outputName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void newTarget(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNewTarget_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = false;

		fixture.newTarget(filename, prependFilename);

		// add additional test code here
	}

	/**
	 * Run the void newTarget(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNewTarget_2()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		String filename = "";
		boolean prependFilename = true;

		fixture.newTarget(filename, prependFilename);

		// add additional test code here
	}

	/**
	 * Run the void setMyOutput(OutputEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetMyOutput_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		OutputEntry outputEntry = new OutputEntry();

		fixture.setMyOutput(outputEntry);

		// add additional test code here
	}

	/**
	 * Run the void setMyProducer(Producer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetMyProducer_1()
		throws Exception {
		FileEntry fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		fixture.setMyOutput(new OutputEntry());
		fixture.setMyProducer(new XMLParse());
		fixture.newAsyncTarget("", true);
		Producer prod = new XMLParse();

		fixture.setMyProducer(prod);

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
		new org.junit.runner.JUnitCore().run(FileEntryTest.class);
	}
}