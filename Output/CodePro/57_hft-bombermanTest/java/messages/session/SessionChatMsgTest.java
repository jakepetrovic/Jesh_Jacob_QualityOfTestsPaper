package messages.session;

import java.net.Socket;
import server.ServerGameSession;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import client.ClientGameSession;
import javax.swing.ImageIcon;
import server.ClientInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SessionChatMsgTest</code> contains tests for the class <code>{@link SessionChatMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SessionChatMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionChatMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private SessionChatMsg fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionChatMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private SessionChatMsg fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionChatMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private SessionChatMsg fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionChatMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public SessionChatMsg getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SessionChatMsg("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionChatMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public SessionChatMsg getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SessionChatMsg("", "");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionChatMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public SessionChatMsg getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new SessionChatMsg("0123456789", "0123456789");
		}
		return fixture3;
	}

	/**
	 * Run the SessionChatMsg(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_1()
		throws Exception {
		String msg = "";

		SessionChatMsg result = new SessionChatMsg(msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionChatMsg(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_2()
		throws Exception {
		String msg = "0123456789";

		SessionChatMsg result = new SessionChatMsg(msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionChatMsg(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_3()
		throws Exception {
		String msg = "1";

		SessionChatMsg result = new SessionChatMsg(msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_4()
		throws Exception {
		String sender = "";
		String msg = "";

		SessionChatMsg result = new SessionChatMsg(sender, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_5()
		throws Exception {
		String sender = "0123456789";
		String msg = "0123456789";

		SessionChatMsg result = new SessionChatMsg(sender, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_6()
		throws Exception {
		String sender = "0123456789";
		String msg = "";

		SessionChatMsg result = new SessionChatMsg(sender, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSessionChatMsg_7()
		throws Exception {
		String sender = "";
		String msg = "0123456789";

		SessionChatMsg result = new SessionChatMsg(sender, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_1()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.GameSession.<clinit>(GameSession.java:20)
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_1()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_1()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_2()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_2()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_2()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_3()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_3()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_3()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_4()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_4()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_4()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_5()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_5()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_5()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_6()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_6()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_6()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_7()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("0123456789", list, new ImageIcon("", ""), 1, 1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_7()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(""), 0, 0);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_7()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_8()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_8()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession((String) null, list, new ImageIcon(), -1, -1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_9()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(""), 0, 0);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_9()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_8()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_10()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession((String) null, list, new ImageIcon(), -1, -1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_9()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("0123456789", list, new ImageIcon("", ""), 1, 1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture1_11()
		throws Exception {
		SessionChatMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_10()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_10()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession((String) null, list, new ImageIcon(), -1, -1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture2_11()
		throws Exception {
		SessionChatMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("0123456789", list, new ImageIcon("", ""), 1, 1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture3_11()
		throws Exception {
		SessionChatMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(""), 0, 0);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.GameSession
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
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
		new org.junit.runner.JUnitCore().run(SessionChatMsgTest.class);
	}
}