package net.sf.xisemele.impl;

import java.io.File;
import net.sf.xisemele.api.Result;
import org.junit.*;
import net.sf.xisemele.exception.XisemeleIOException;
import static org.junit.Assert.*;
import org.w3c.dom.Document;

/**
 * The class <code>ResultImplTest</code> contains tests for the class <code>{@link ResultImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ResultImplTest {
	/**
	 * Run the ResultImpl(Factory,Document) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testResultImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		Document document = null;

		ResultImpl result = new ResultImpl(factory, document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ResultImpl : Unsupported major.minor version 51.0
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
	 * Run the ResultImpl(Factory,Document) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testResultImpl_2()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		Document document = null;

		ResultImpl result = new ResultImpl(factory, document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ResultImpl : Unsupported major.minor version 51.0
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
	 * Run the Result encoding(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEncoding_1()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		String encoding = "";

		Result result = fixture.encoding(encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result encoding(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testEncoding_2()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		String encoding = "";

		Result result = fixture.encoding(encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result ident(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testIdent_1()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		boolean ident = true;

		Result result = fixture.ident(ident);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result ident(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIdent_2()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		boolean ident = true;

		Result result = fixture.ident(ident);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result identNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testIdentNumber_1()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		int identNumber = 1;

		Result result = fixture.identNumber(identNumber);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result identNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIdentNumber_2()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		int identNumber = 1;

		Result result = fixture.identNumber(identNumber);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result toFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testToFile_1()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		File file = new File("");

		Result result = fixture.toFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result toFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.XisemeleIOException.class)
	public void testToFile_2()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		File file = new File("");

		Result result = fixture.toFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result toFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testToFile_3()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		File file = new File("");

		Result result = fixture.toFile(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result toFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testToFile_4()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		String fileName = "";

		Result result = fixture.toFile(fileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result toFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.XisemeleIOException.class)
	public void testToFile_5()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		String fileName = "";

		Result result = fixture.toFile(fileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result toFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testToFile_6()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");
		String fileName = "";

		Result result = fixture.toFile(fileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toXML() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testToXML_1()
		throws Exception {
		ResultImpl fixture = new ResultImpl(new FactoryImpl(new FormatterProviderImpl()), (Document) null);
		fixture.ident(true);
		fixture.identNumber(1);
		fixture.encoding("");

		String result = fixture.toXML();

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
		new org.junit.runner.JUnitCore().run(ResultImplTest.class);
	}
}