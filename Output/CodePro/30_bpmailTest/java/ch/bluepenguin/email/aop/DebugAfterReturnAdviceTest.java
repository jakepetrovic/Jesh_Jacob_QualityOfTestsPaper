package ch.bluepenguin.email.aop;

import java.lang.reflect.Method;
import junit.framework.*;

/**
 * The class <code>DebugAfterReturnAdviceTest</code> contains tests for the class <code>{@link DebugAfterReturnAdvice}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DebugAfterReturnAdviceTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DebugAfterReturnAdvice fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DebugAfterReturnAdvice fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DebugAfterReturnAdvice fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DebugAfterReturnAdvice fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DebugAfterReturnAdvice getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DebugAfterReturnAdvice();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DebugAfterReturnAdvice getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DebugAfterReturnAdvice();
			fixture2.setLocale("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DebugAfterReturnAdvice getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DebugAfterReturnAdvice();
			fixture3.setLocale("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DebugAfterReturnAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DebugAfterReturnAdvice getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DebugAfterReturnAdvice();
			fixture4.setLocale("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture1_1()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture1();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture3_1()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture3();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture1_2()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture1();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture2_1()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture2();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture1_3()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture1();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture3_2()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture3();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture4_1()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture4();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture2_2()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture2();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture4_2()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture4();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture1_4()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture1();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture4_3()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture4();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture2_3()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture2();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture3_3()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture3();
		Object returnValue = new Object();
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture2_4()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture2();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture4_4()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture4();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = null;

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the void afterReturning(Object,Method,Object[],Object) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAfterReturning_fixture3_4()
		throws Throwable {
		DebugAfterReturnAdvice fixture = getFixture3();
		Object returnValue = null;
		Method m = Object.class.getMethods()[0];
		Object[] args = null;
		Object target = new Object();

		fixture.afterReturning(returnValue, m, args, target);

		// add additional test code here
	}

	/**
	 * Run the String getLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLocale_fixture1_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture1();

		String result = fixture.getLocale();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLocale_fixture2_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture2();

		String result = fixture.getLocale();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLocale_fixture3_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture3();

		String result = fixture.getLocale();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLocale_fixture4_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture4();

		String result = fixture.getLocale();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture1_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture1();
		String locale = "";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture2_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture2();
		String locale = "0123456789";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture3_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture3();
		String locale = "0123456789";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture4_1()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture4();
		String locale = "0123456789";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture2_2()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture2();
		String locale = "";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture3_2()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture3();
		String locale = "";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture4_2()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture4();
		String locale = "";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLocale_fixture1_2()
		throws Exception {
		DebugAfterReturnAdvice fixture = getFixture1();
		String locale = "0123456789";

		fixture.setLocale(locale);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}