package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.PrintWriter;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.BatikFormatter;
import java.io.Writer;
import nu.staldal.xtree.Element;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OutputEntryTest</code> contains tests for the class <code>{@link OutputEntry}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OutputEntryTest {
	/**
	 * Run the OutputEntry() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testOutputEntry_1()
		throws Exception {

		OutputEntry result = new OutputEntry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/core/OutputEntry : Unsupported major.minor version 51.0
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
	 * Run the ByteStreamProducer getByteProducer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetByteProducer_1()
		throws Exception {
		OutputEntry fixture = new OutputEntry();
		fixture.setBottomProducer(new BatikFormatter());
		fixture.setSourceManager(new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File("")));
		fixture.setMyProducer(new BatikFormatter());

		ByteStreamProducer result = fixture.getByteProducer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetSourceManager_1()
		throws Exception {
		OutputEntry fixture = new OutputEntry();
		fixture.setBottomProducer(new BatikFormatter());
		fixture.setSourceManager(new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File("")));
		fixture.setMyProducer(new BatikFormatter());

		SourceManager result = fixture.getSourceManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetBottomProducer_1()
		throws Exception {
		OutputEntry fixture = new OutputEntry();
		fixture.setBottomProducer(new BatikFormatter());
		fixture.setSourceManager(new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File("")));
		fixture.setMyProducer(new BatikFormatter());
		XMLStreamConsumer prod = new BatikFormatter();

		fixture.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setMyProducer(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetMyProducer_1()
		throws Exception {
		OutputEntry fixture = new OutputEntry();
		fixture.setBottomProducer(new BatikFormatter());
		fixture.setSourceManager(new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File("")));
		fixture.setMyProducer(new BatikFormatter());
		ByteStreamProducer prod = new BatikFormatter();

		fixture.setMyProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetNext_1()
		throws Exception {
		OutputEntry fixture = new OutputEntry();
		fixture.setBottomProducer(new BatikFormatter());
		fixture.setSourceManager(new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File("")));
		fixture.setMyProducer(new BatikFormatter());
		XMLStreamProducer next = new XMLParse();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetSourceManager_1()
		throws Exception {
		OutputEntry fixture = new OutputEntry();
		fixture.setBottomProducer(new BatikFormatter());
		fixture.setSourceManager(new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File("")));
		fixture.setMyProducer(new BatikFormatter());
		SourceManager sm = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.setSourceManager(sm);

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
		new org.junit.runner.JUnitCore().run(OutputEntryTest.class);
	}
}