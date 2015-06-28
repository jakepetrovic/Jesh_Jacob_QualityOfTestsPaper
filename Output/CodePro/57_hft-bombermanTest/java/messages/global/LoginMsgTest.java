package messages.global;

import java.net.Socket;
import server.BomberServer;
import org.junit.*;
import server.ClientInfo;
import static org.junit.Assert.*;

/**
 * The class <code>LoginMsgTest</code> contains tests for the class <code>{@link LoginMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoginMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LoginMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	private LoginMsg fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public LoginMsgTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LoginMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public LoginMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new LoginMsg("", "", 0);
		}
		return fixture;
	}

	/**
	 * Run the LoginMsg(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testLoginMsg_1()
		throws Exception {
		String username = "";
		int action = 0;

		LoginMsg result = new LoginMsg(username, action);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getAction());
		assertEquals(null, result.getPassword());
		assertEquals("", result.getUsername());
	}

	/**
	 * Run the LoginMsg(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testLoginMsg_2()
		throws Exception {
		String username = "";
		String password = "";
		int action = 0;

		LoginMsg result = new LoginMsg(username, password, action);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getAction());
		assertEquals("", result.getPassword());
		assertEquals("", result.getUsername());
	}

	/**
	 * Run the void execute(BomberServer,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		LoginMsg.LOGIN = 0;
		LoginMsg.REGISTER = 0;
		LoginMsg.GUEST_LOGIN = 0;
		LoginMsg fixture2 = getFixture();
		BomberServer bomberSrv = BomberServer.getInstance();
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(bomberSrv, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.BomberServer.<clinit>(BomberServer.java:36)
	}

	/**
	 * Run the int getAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testGetAction_fixture_1()
		throws Exception {
		LoginMsg fixture2 = getFixture();

		int result = fixture2.getAction();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testGetPassword_fixture_1()
		throws Exception {
		LoginMsg fixture2 = getFixture();

		String result = fixture2.getPassword();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUsername() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testGetUsername_fixture_1()
		throws Exception {
		LoginMsg fixture2 = getFixture();

		String result = fixture2.getUsername();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setAction(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testSetAction_fixture_1()
		throws Exception {
		LoginMsg fixture2 = getFixture();
		int action = 1;

		fixture2.setAction(action);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testSetPassword_fixture_1()
		throws Exception {
		LoginMsg fixture2 = getFixture();
		String password = "";

		fixture2.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testSetUsername_fixture_1()
		throws Exception {
		LoginMsg fixture2 = getFixture();
		String username = "";

		fixture2.setUsername(username);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LoginMsgTest.class);
	}
}