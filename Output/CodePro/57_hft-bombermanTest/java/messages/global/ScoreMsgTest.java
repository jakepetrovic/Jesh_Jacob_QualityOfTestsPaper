package messages.global;

import java.util.ArrayList;
import client.BomberClient;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ScoreMsgTest</code> contains tests for the class <code>{@link ScoreMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ScoreMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ScoreMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	private ScoreMsg fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public ScoreMsgTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ScoreMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public ScoreMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ScoreMsg(new ArrayList());
		}
		return fixture;
	}

	/**
	 * Run the ScoreMsg(ArrayList) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testScoreMsg_1()
		throws Exception {
		ArrayList scores = new ArrayList();

		ScoreMsg result = new ScoreMsg(scores);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(BomberClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		ScoreMsg fixture2 = getFixture();
		BomberClient bomberClient = BomberClient.getInstance();

		fixture2.execute(bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.BomberClient.<clinit>(BomberClient.java:36)
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ScoreMsgTest.class);
	}
}