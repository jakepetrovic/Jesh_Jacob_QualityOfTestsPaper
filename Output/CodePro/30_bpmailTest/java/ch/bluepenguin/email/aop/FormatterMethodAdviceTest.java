package ch.bluepenguin.email.aop;

import org.aopalliance.intercept.MethodInvocation;
import junit.framework.*;

/**
 * The class <code>FormatterMethodAdviceTest</code> contains tests for the class <code>{@link FormatterMethodAdvice}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FormatterMethodAdviceTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FormatterMethodAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private FormatterMethodAdvice fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FormatterMethodAdvice
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public FormatterMethodAdvice getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new FormatterMethodAdvice();
		}
		return fixture;
	}

	/**
	 * Run the Object invoke(MethodInvocation) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testInvoke_fixture_1()
		throws Throwable {
		try {
			FormatterMethodAdvice fixture2 = getFixture();
			MethodInvocation invocation = null;

			Object result = fixture2.invoke(invocation);

			// add additional test code here
			fail("The exception java.lang.NullPointerException should have been thrown.");
		} catch (java.lang.NullPointerException exception) {
			// The test succeeded by throwing the expected exception
		}
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