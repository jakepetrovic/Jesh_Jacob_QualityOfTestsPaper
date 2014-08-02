package net.sf.xisemele.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import net.sf.xisemele.exception.FormatterNotConfiguredException;
import java.util.LinkedList;
import java.util.List;
import net.sf.xisemele.api.Value;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ValueListImplTest</code> contains tests for the class <code>{@link ValueListImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ValueListImplTest {
	/**
	 * Run the ValueListImpl(List<Value>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValueListImpl_1()
		throws Exception {
		List<Value> values = new LinkedList();

		ValueListImpl result = new ValueListImpl(values);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ValueListImpl : Unsupported major.minor version 51.0
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
	 * Run the List<BigDecimal> asBigDecimal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBigDecimal_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<BigDecimal> result = fixture.asBigDecimal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<BigDecimal> asBigDecimal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBigDecimal_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<BigDecimal> result = fixture.asBigDecimal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<BigInteger> asBigInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBigInteger_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<BigInteger> result = fixture.asBigInteger();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<BigInteger> asBigInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBigInteger_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<BigInteger> result = fixture.asBigInteger();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Boolean> asBoolean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBoolean_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Boolean> result = fixture.asBoolean();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Boolean> asBoolean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsBoolean_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Boolean> result = fixture.asBoolean();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Byte> asByte() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsByte_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Byte> result = fixture.asByte();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Byte> asByte() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsByte_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Byte> result = fixture.asByte();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Date> asDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDate_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Date> result = fixture.asDate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Date> asDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDate_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Date> result = fixture.asDate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Date> asDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDate_3()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());
		String pattern = "";

		List<Date> result = fixture.asDate(pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Date> asDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDate_4()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());
		String pattern = "";

		List<Date> result = fixture.asDate(pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Double> asDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDouble_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Double> result = fixture.asDouble();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Double> asDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsDouble_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Double> result = fixture.asDouble();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Float> asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsFloat_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Float> result = fixture.asFloat();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Float> asFloat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsFloat_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Float> result = fixture.asFloat();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Integer> asInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsInteger_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Integer> result = fixture.asInteger();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Integer> asInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsInteger_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Integer> result = fixture.asInteger();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Long> asLong() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsLong_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Long> result = fixture.asLong();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Long> asLong() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsLong_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Long> result = fixture.asLong();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Short> asShort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsShort_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Short> result = fixture.asShort();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Short> asShort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsShort_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<Short> result = fixture.asShort();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> asString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsString_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<String> result = fixture.asString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> asString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsString_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());

		List<String> result = fixture.asString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> asType(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsType_1()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());
		Class<Object> type = Object.class;

		List<Object> result = fixture.asType(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> asType(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAsType_2()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());
		Class<Object> type = Object.class;

		List<Object> result = fixture.asType(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> asType(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.FormatterNotConfiguredException.class)
	public void testAsType_3()
		throws Exception {
		ValueListImpl fixture = new ValueListImpl(new LinkedList());
		Class<Object> type = Object.class;

		List<Object> result = fixture.asType(type);

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
		new org.junit.runner.JUnitCore().run(ValueListImplTest.class);
	}
}