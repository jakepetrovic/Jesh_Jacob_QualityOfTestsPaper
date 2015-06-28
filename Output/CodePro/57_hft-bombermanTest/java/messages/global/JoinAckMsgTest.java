package messages.global;

import java.util.ArrayList;
import client.BomberClient;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JoinAckMsgTest</code> contains tests for the class <code>{@link JoinAckMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class JoinAckMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see JoinAckMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private JoinAckMsg fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see JoinAckMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private JoinAckMsg fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see JoinAckMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public JoinAckMsg getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new JoinAckMsg(false, 0);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see JoinAckMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public JoinAckMsg getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new JoinAckMsg(true, 1);
		}
		return fixture2;
	}

	/**
	 * Run the JoinAckMsg(boolean,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testJoinAckMsg_1()
		throws Exception {
		boolean joinSuccessful = false;
		int idOffset = 0;

		JoinAckMsg result = new JoinAckMsg(joinSuccessful, idOffset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JoinAckMsg(boolean,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testJoinAckMsg_2()
		throws Exception {
		boolean joinSuccessful = true;
		int idOffset = 1;

		JoinAckMsg result = new JoinAckMsg(joinSuccessful, idOffset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JoinAckMsg(boolean,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testJoinAckMsg_3()
		throws Exception {
		boolean joinSuccessful = false;
		int idOffset = 7;

		JoinAckMsg result = new JoinAckMsg(joinSuccessful, idOffset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JoinAckMsg(boolean,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testJoinAckMsg_4()
		throws Exception {
		boolean joinSuccessful = false;
		int idOffset = 1;

		JoinAckMsg result = new JoinAckMsg(joinSuccessful, idOffset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JoinAckMsg(boolean,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testJoinAckMsg_5()
		throws Exception {
		boolean joinSuccessful = true;
		int idOffset = 7;

		JoinAckMsg result = new JoinAckMsg(joinSuccessful, idOffset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JoinAckMsg(boolean,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testJoinAckMsg_6()
		throws Exception {
		boolean joinSuccessful = true;
		int idOffset = 0;

		JoinAckMsg result = new JoinAckMsg(joinSuccessful, idOffset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(BomberClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_1()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		BomberClient bomberClient = BomberClient.getInstance();

		fixture.execute(bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.BomberClient.<clinit>(BomberClient.java:36)
	}

	/**
	 * Run the void execute(BomberClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_1()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		BomberClient bomberClient = BomberClient.getInstance();

		fixture.execute(bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.BomberClient
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_1()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		ArrayList<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_1()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		ArrayList<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_2()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		ArrayList<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_2()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		LinkedList<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_3()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		LinkedList<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_3()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		LinkedList<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_4()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		Vector<ParticipantInfo> participants = new Vector<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_4()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		Vector<ParticipantInfo> participants = new Vector<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_5()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		Vector<ParticipantInfo> participants = new Vector<ParticipantInfo>();
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_5()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		List<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_6()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		List<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_6()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		List<ParticipantInfo> participants = new Vector<ParticipantInfo>();

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_7()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		ArrayList<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_7()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		ArrayList<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_8()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		ArrayList<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_8()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		LinkedList<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_9()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		LinkedList<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_9()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		LinkedList<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_10()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		Vector<ParticipantInfo> participants = new Vector<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_10()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		Vector<ParticipantInfo> participants = new Vector<ParticipantInfo>();
		participants.add(new ParticipantInfo(0, ""));
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_11()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		Vector<ParticipantInfo> participants = new Vector<ParticipantInfo>();
		participants.add(new ParticipantInfo(1, "0123456789"));

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_11()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		List<ParticipantInfo> participants = new ArrayList<ParticipantInfo>();

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture2_12()
		throws Exception {
		JoinAckMsg fixture = getFixture2();
		List<ParticipantInfo> participants = new LinkedList<ParticipantInfo>();

		fixture.setParticipants(participants);

		// add additional test code here
	}

	/**
	 * Run the void setParticipants(List<ParticipantInfo>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSetParticipants_fixture1_12()
		throws Exception {
		JoinAckMsg fixture = getFixture1();
		List<ParticipantInfo> participants = new Vector<ParticipantInfo>();

		fixture.setParticipants(participants);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JoinAckMsgTest.class);
	}
}