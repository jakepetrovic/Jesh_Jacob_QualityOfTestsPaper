package messages.global;

import java.net.Socket;
import server.BomberServer;
import org.junit.*;
import server.ClientInfo;
import static org.junit.Assert.*;

/**
 * The class <code>GlobalClientMsgTest</code> contains tests for the class <code>{@link GlobalClientMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GlobalClientMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GlobalClientMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private GlobalClientMsg fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GlobalClientMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private GlobalClientMsg fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GlobalClientMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private GlobalClientMsg fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GlobalClientMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public GlobalClientMsg getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new JoinSessionMsg("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GlobalClientMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public GlobalClientMsg getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new JoinSessionMsg("0123456789", "0123456789");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GlobalClientMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public GlobalClientMsg getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new StopServerMsg();
		}
		return fixture3;
	}

	/**
	 * Run the void execute(BomberServer,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_1()
		throws Exception {
		GlobalClientMsg fixture = getFixture1();
		BomberServer bomberSrv = BomberServer.getInstance();
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(bomberSrv, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.BomberServer.<clinit>(BomberServer.java:36)
	}

	/**
	 * Run the void execute(BomberServer,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_1()
		throws Exception {
		GlobalClientMsg fixture = getFixture2();
		BomberServer bomberSrv = BomberServer.getInstance();
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(bomberSrv, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.BomberServer
	}

	/**
	 * Run the void execute(BomberServer,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_1()
		throws Exception {
		GlobalClientMsg fixture = getFixture3();
		BomberServer bomberSrv = BomberServer.getInstance();
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(bomberSrv, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.BomberServer
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GlobalClientMsgTest.class);
	}
}