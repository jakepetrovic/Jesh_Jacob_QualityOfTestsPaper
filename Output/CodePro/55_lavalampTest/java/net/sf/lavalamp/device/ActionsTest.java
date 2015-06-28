package net.sf.lavalamp.device;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ActionsTest</code> contains tests for the class <code>{@link Actions}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ActionsTest {
	/**
	 * Run the Actions(Action,Action,Action) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testActions_1()
		throws Exception {
		Action successAction = new Blink();
		Action failureAction = new Blink();
		Action errorAction = new Blink();

		Actions result = new Actions(successAction, failureAction, errorAction);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Action getErrorAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetErrorAction_1()
		throws Exception {
		Actions fixture = new Actions(new Blink(), new Blink(), new Blink());

		Action result = fixture.getErrorAction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Action getFailureAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetFailureAction_1()
		throws Exception {
		Actions fixture = new Actions(new Blink(), new Blink(), new Blink());

		Action result = fixture.getFailureAction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Action getSuccessAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetSuccessAction_1()
		throws Exception {
		Actions fixture = new Actions(new Blink(), new Blink(), new Blink());

		Action result = fixture.getSuccessAction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ActionsTest.class);
	}
}