package ch.bluepenguin.email.client.service;

import junit.framework.*;
import ch.bluepenguin.email.client.MailMessage;
import ch.bluepenguin.email.client.service.impl.EmailFacadeImpl;
import ch.bluepenguin.email.client.Folder;

/**
 * The class <code>EmailFacadeTest</code> contains tests for the class <code>{@link EmailFacade}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class EmailFacadeTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacade
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacade fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacade
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacade getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new EmailFacadeImpl();
		}
		return fixture;
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_2()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_3()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_4()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_5()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_6()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_7()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture_8()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture2.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessages(EmailFacadeImpl.java:407)
	}

	/**
	 * Run the void fillMessageBody(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFillMessageBody_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage message = new MailMessage();

		fixture2.fillMessageBody(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.fillMessageBody(EmailFacadeImpl.java:370)
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();

		Folder[] result = fixture2.getAllFolders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:108)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();

		MailMessage[] result = fixture2.getAllMessages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllMessages(EmailFacadeImpl.java:224)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		Folder folder = new Folder();

		MailMessage[] result = fixture2.getMessagesFromFolder(folder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getMessagesFromFolder(EmailFacadeImpl.java:254)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();

		String result = fixture2.getName();

		// add additional test code here
		assertEquals("Default EmailFacade Impl", result);
	}

	/**
	 * Run the boolean isDirty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();

		boolean result = fixture2.isDirty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_2()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_3()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_4()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_5()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_6()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_7()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture_8()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture2.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.copyMessagesInternal(EmailFacadeImpl.java:427)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.moveMessages(EmailFacadeImpl.java:385)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_2()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_3()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_4()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_5()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_6()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_7()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_8()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_9()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "0123456789";
		String to = "";
		String subject = "";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_10()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_11()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_12()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_13()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_14()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_15()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture_16()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture2.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:89)
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture_1()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		boolean dirty = false;

		fixture2.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture_2()
		throws Exception {
		EmailFacade fixture2 = getFixture();
		boolean dirty = true;

		fixture2.setDirty(dirty);

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