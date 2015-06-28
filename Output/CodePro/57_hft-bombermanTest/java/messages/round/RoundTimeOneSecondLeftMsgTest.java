package messages.round;

import org.junit.*;
import client.ClientGameRound;
import static org.junit.Assert.*;

/**
 * The class <code>RoundTimeOneSecondLeftMsgTest</code> contains tests for the class <code>{@link RoundTimeOneSecondLeftMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class RoundTimeOneSecondLeftMsgTest {
	/**
	 * Run the RoundTimeOneSecondLeftMsg(long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testRoundTimeOneSecondLeftMsg_1()
		throws Exception {
		long time = -1L;

		RoundTimeOneSecondLeftMsg result = new RoundTimeOneSecondLeftMsg(time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.RoundTimeOneSecondLeftMsg
		assertNotNull(result);
	}

	/**
	 * Run the RoundTimeOneSecondLeftMsg(long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testRoundTimeOneSecondLeftMsg_2()
		throws Exception {
		long time = 0L;

		RoundTimeOneSecondLeftMsg result = new RoundTimeOneSecondLeftMsg(time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.RoundTimeOneSecondLeftMsg
		assertNotNull(result);
	}

	/**
	 * Run the RoundTimeOneSecondLeftMsg(long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testRoundTimeOneSecondLeftMsg_3()
		throws Exception {
		long time = 1L;

		RoundTimeOneSecondLeftMsg result = new RoundTimeOneSecondLeftMsg(time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.RoundTimeOneSecondLeftMsg
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RoundTimeOneSecondLeftMsgTest.class);
	}
}