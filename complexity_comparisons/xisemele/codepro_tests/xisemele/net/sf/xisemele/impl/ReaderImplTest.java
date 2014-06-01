package net.sf.xisemele.impl;

import org.junit.*;
import net.sf.xisemele.exception.ElementNotFoundException;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import net.sf.xisemele.api.Element;

/**
 * The class <code>ReaderImplTest</code> contains tests for the class <code>{@link ReaderImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ReaderImplTest {
	/**
	 * Run the ReaderImpl(Factory,Document) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testReaderImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		Document document = null;

		ReaderImpl result = new ReaderImpl(factory, document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ReaderImpl : Unsupported major.minor version 51.0
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
	 * Run the boolean containsElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsElement_1()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		String path = "";

		boolean result = fixture.containsElement(path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsElement_2()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		String path = "";

		boolean result = fixture.containsElement(path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String encoding() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEncoding_1()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);

		String result = fixture.encoding();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element find(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testFind_1()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		String path = "";

		Element result = fixture.find(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element find(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ElementNotFoundException.class)
	public void testFind_2()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		String path = "";

		Element result = fixture.find(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element root() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRoot_1()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);

		Element result = fixture.root();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String version() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testVersion_1()
		throws Exception {
		ReaderImpl fixture = new ReaderImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);

		String result = fixture.version();

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
		new org.junit.runner.JUnitCore().run(ReaderImplTest.class);
	}
}