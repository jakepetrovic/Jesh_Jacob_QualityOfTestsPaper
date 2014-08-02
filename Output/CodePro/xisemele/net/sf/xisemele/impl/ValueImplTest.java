package net.sf.xisemele.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ValueImplTest</code> contains tests for the class <code>{@link ValueImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ValueImplTest {
	/**
	 * Run the ValueImpl(Factory,FormatterProvider,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValueImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		FormatterProvider provider = new FormatterProviderImpl();
		String value = "";

		ValueImpl result = new ValueImpl(factory, provider, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ValueImpl : Unsupported major.minor version 51.0
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
	 * Run the BigDecimal asBigDecimal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBigDecimal_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		BigDecimal result = fixture.asBigDecimal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigInteger asBigInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBigInteger_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		BigInteger result = fixture.asBigInteger();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Boolean asBoolean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBoolean_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Boolean result = fixture.asBoolean();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Byte asByte() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsByte_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Byte result = fixture.asByte();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date asDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDate_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Date result = fixture.asDate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date asDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDate_2()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");
		String pattern = "";

		Date result = fixture.asDate(pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Double asDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDouble_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Double result = fixture.asDouble();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Float asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsFloat_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Float result = fixture.asFloat();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Integer asInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsInteger_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Integer result = fixture.asInteger();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Long asLong() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsLong_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Long result = fixture.asLong();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Short asShort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsShort_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		Short result = fixture.asShort();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String asString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsString_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		String result = fixture.asString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object asType(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsType_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");
		Class<Object> type = Object.class;

		Object result = fixture.asType(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");
		Object o = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");
		Object o = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ValueImpl fixture = new ValueImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), "");

		String result = fixture.toString();

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
		new org.junit.runner.JUnitCore().run(ValueImplTest.class);
	}
}