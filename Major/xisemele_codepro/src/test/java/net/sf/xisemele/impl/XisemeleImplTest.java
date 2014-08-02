package net.sf.xisemele.impl;

import java.io.File;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.Xisemele;
import java.io.InputStream;
import java.io.PipedInputStream;
import net.sf.xisemele.api.Writer;
import net.sf.xisemele.api.Editor;
import net.sf.xisemele.api.Reader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.DOMException;

/**
 * The class <code>XisemeleImplTest</code> contains tests for the class <code>{@link XisemeleImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XisemeleImplTest {
	/**
	 * Run the XisemeleImpl(Factory,FormatterProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testXisemeleImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		FormatterProvider formatterProvider = new FormatterProviderImpl();

		XisemeleImpl result = new XisemeleImpl(factory, formatterProvider);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/XisemeleImpl : Unsupported major.minor version 51.0
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
	 * Run the Editor createEditor(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateEditor_1()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		File file = new File("");

		Editor result = fixture.createEditor(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor createEditor(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateEditor_2()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		InputStream inputStream = new PipedInputStream();

		Editor result = fixture.createEditor(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor createEditor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateEditor_3()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String xml = "";

		Editor result = fixture.createEditor(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Reader createReader(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateReader_1()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		File file = new File("");

		Reader result = fixture.createReader(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Reader createReader(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateReader_2()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		InputStream inputStream = new PipedInputStream();

		Reader result = fixture.createReader(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Reader createReader(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateReader_3()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String xml = "";

		Reader result = fixture.createReader(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer createWriter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateWriter_1()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String rootElement = "";

		Writer result = fixture.createWriter(rootElement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer createWriter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCreateWriter_2()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String rootElement = "";

		Writer result = fixture.createWriter(rootElement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer createWriter(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testCreateWriter_3()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String rootElement = "";
		String xmlVersion = "";

		Writer result = fixture.createWriter(rootElement, xmlVersion);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer createWriter(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCreateWriter_4()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String rootElement = "";
		String xmlVersion = "";

		Writer result = fixture.createWriter(rootElement, xmlVersion);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer createWriter(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testCreateWriter_5()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String rootElement = "";
		String xmlVersion = "";

		Writer result = fixture.createWriter(rootElement, xmlVersion);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Xisemele setDatePattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testSetDatePattern_1()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String datePattern = "";

		Xisemele result = fixture.setDatePattern(datePattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Xisemele setDatePattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetDatePattern_2()
		throws Exception {
		XisemeleImpl fixture = new XisemeleImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl());
		String datePattern = "";

		Xisemele result = fixture.setDatePattern(datePattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XisemeleImplTest.class);
	}
}