package net.sf.xisemele.impl;

import org.junit.*;
import net.sf.xisemele.exception.InvalidNameException;
import static org.junit.Assert.*;

/**
 * The class <code>ValidationsImplTest</code> contains tests for the class <code>{@link ValidationsImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ValidationsImplTest {
	/**
	 * Run the ValidationsImpl(Factory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValidationsImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());

		ValidationsImpl result = new ValidationsImpl(factory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ValidationsImpl : Unsupported major.minor version 51.0
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
	 * Run the void assertNotNull(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAssertNotNull_1()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));
		Object parameter1 = null;

		fixture.assertNotNull(parameter1);

		// add additional test code here
	}

	/**
	 * Run the void assertNotNull(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAssertNotNull_2()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));

		fixture.assertNotNull();

		// add additional test code here
	}

	/**
	 * Run the void assertNotNull(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testAssertNotNull_3()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));
		Object parameter1 = new Object();
		Object parameter2 = null;

		fixture.assertNotNull(parameter1, parameter2);

		// add additional test code here
	}

	/**
	 * Run the void assertValidName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAssertValidName_1()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));
		String name = "";

		fixture.assertValidName(name);

		// add additional test code here
	}

	/**
	 * Run the void assertValidName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAssertValidName_2()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));
		String name = "";

		fixture.assertValidName(name);

		// add additional test code here
	}

	/**
	 * Run the Object getFirstNotNull(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testGetFirstNotNull_1()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));

		Object result = fixture.getFirstNotNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFirstNotNull(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testGetFirstNotNull_2()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));

		Object result = fixture.getFirstNotNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFirstNotNull(T[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testGetFirstNotNull_3()
		throws Exception {
		ValidationsImpl fixture = new ValidationsImpl(new FactoryImpl(new FormatterProviderImpl()));

		Object result = fixture.getFirstNotNull();

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
		new org.junit.runner.JUnitCore().run(ValidationsImplTest.class);
	}
}