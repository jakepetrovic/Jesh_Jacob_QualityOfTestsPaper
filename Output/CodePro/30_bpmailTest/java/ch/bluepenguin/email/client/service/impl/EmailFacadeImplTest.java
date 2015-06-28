package ch.bluepenguin.email.client.service.impl;

import java.util.logging.Logger;
import org.springframework.mail.MailSender;
import ch.bluepenguin.email.client.MailMessage;
import ch.bluepenguin.email.client.cache.MailCache;
import org.springframework.mail.cos.CosMailSenderImpl;
import org.springframework.mail.javamail.JavaMailReader;
import org.springframework.mail.javamail.JavaMailReaderImpl;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import ch.bluepenguin.email.client.Folder;
import ch.bluepenguin.email.client.service.EmailFacadeException;
import junit.framework.*;

/**
 * The class <code>EmailFacadeImplTest</code> contains tests for the class <code>{@link EmailFacadeImpl}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class EmailFacadeImplTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeImpl fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeImpl fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeImpl fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeImpl fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeImpl fixture5;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeImpl getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new EmailFacadeImpl();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeImpl getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new EmailFacadeImpl();
			fixture2.setCache(new MailCache(""));
			fixture2.setLogger(Logger.getAnonymousLogger());
			fixture2.setReader(new JavaMailReaderImpl());
			fixture2.setSender(new CosMailSenderImpl());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeImpl getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new EmailFacadeImpl();
			fixture3.setCache(new MailCache(""));
			fixture3.setLogger(Logger.getAnonymousLogger());
			fixture3.setReader(new JavaMailReaderImpl());
			fixture3.setSender(new JavaMailSenderImpl());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeImpl getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new EmailFacadeImpl();
			fixture4.setCache(new MailCache(""));
			fixture4.setLogger(Logger.getGlobal());
			fixture4.setReader(new JavaMailReaderImpl());
			fixture4.setSender(new CosMailSenderImpl());
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeImpl getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new EmailFacadeImpl();
			fixture5.setCache(new MailCache(""));
			fixture5.setLogger(Logger.getGlobal());
			fixture5.setReader(new JavaMailReaderImpl());
			fixture5.setSender(new JavaMailSenderImpl());
		}
		return fixture5;
	}

	/**
	 * Run the EmailFacadeImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEmailFacadeImpl_1()
		throws Exception {

		EmailFacadeImpl result = new EmailFacadeImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Default EmailFacade Impl", result.getName());
		assertEquals(null, result.getLogger());
		assertEquals(null, result.getCache());
		assertEquals(null, result.getSender());
		assertEquals(true, result.isDirty());
		assertEquals(null, result.getReader());
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_7()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture1_8()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

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
	public void testCopyMessages_fixture2_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture2_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture5_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture2_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture3_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture5_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture3_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture3_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture5_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture2_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture5_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture3_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture5_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture2_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_6()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture3_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture4_7()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.copyMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void fillMessageBody(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFillMessageBody_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage message = new MailMessage();

		fixture.fillMessageBody(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.fillMessageBody(EmailFacadeImpl.java:370)
	}

	/**
	 * Run the void fillMessageBody(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFillMessageBody_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		MailMessage message = new MailMessage();

		fixture.fillMessageBody(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.fillMessageBody(EmailFacadeImpl.java:370)
	}

	/**
	 * Run the void fillMessageBody(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFillMessageBody_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		MailMessage message = new MailMessage();

		fixture.fillMessageBody(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.fillMessageBody(EmailFacadeImpl.java:370)
	}

	/**
	 * Run the void fillMessageBody(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFillMessageBody_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		MailMessage message = new MailMessage();

		fixture.fillMessageBody(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.fillMessageBody(EmailFacadeImpl.java:370)
	}

	/**
	 * Run the void fillMessageBody(MailMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFillMessageBody_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		MailMessage message = new MailMessage();

		fixture.fillMessageBody(message);

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
	public void testGetAllFolders_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:108)
		assertNotNull(result);
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllMessages(EmailFacadeImpl.java:224)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllMessages(EmailFacadeImpl.java:226)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllMessages(EmailFacadeImpl.java:226)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllMessages(EmailFacadeImpl.java:226)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllFolders(EmailFacadeImpl.java:111)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getAllMessages(EmailFacadeImpl.java:226)
		assertNotNull(result);
	}

	/**
	 * Run the MailCache getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCache_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		MailCache result = fixture.getCache();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MailCache getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCache_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		MailCache result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
	}

	/**
	 * Run the MailCache getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCache_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		MailCache result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
	}

	/**
	 * Run the MailCache getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCache_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		MailCache result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
	}

	/**
	 * Run the MailCache getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCache_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		MailCache result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
	}

	/**
	 * Run the Logger getLogger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLogger_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		Logger result = fixture.getLogger();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Logger getLogger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLogger_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		Logger result = fixture.getLogger();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(true, result.getUseParentHandlers());
		assertEquals(null, result.getLevel());
		assertEquals(null, result.getResourceBundle());
		assertEquals(null, result.getResourceBundleName());
		assertEquals(null, result.getFilter());
	}

	/**
	 * Run the Logger getLogger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLogger_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		Logger result = fixture.getLogger();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(true, result.getUseParentHandlers());
		assertEquals(null, result.getLevel());
		assertEquals(null, result.getResourceBundle());
		assertEquals(null, result.getResourceBundleName());
		assertEquals(null, result.getFilter());
	}

	/**
	 * Run the Logger getLogger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLogger_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		Logger result = fixture.getLogger();

		// add additional test code here
		assertNotNull(result);
		assertEquals("global", result.getName());
		assertEquals(true, result.getUseParentHandlers());
		assertEquals(null, result.getLevel());
		assertEquals(null, result.getResourceBundle());
		assertEquals(null, result.getResourceBundleName());
		assertEquals(null, result.getFilter());
	}

	/**
	 * Run the Logger getLogger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetLogger_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		Logger result = fixture.getLogger();

		// add additional test code here
		assertNotNull(result);
		assertEquals("global", result.getName());
		assertEquals(true, result.getUseParentHandlers());
		assertEquals(null, result.getLevel());
		assertEquals(null, result.getResourceBundle());
		assertEquals(null, result.getResourceBundleName());
		assertEquals(null, result.getFilter());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Folder folder = new Folder();

		MailMessage[] result = fixture.getMessagesFromFolder(folder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getMessagesFromFolder(EmailFacadeImpl.java:254)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Folder folder = new Folder();

		MailMessage[] result = fixture.getMessagesFromFolder(folder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getMessagesFromFolder(EmailFacadeImpl.java:257)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Folder folder = new Folder();

		MailMessage[] result = fixture.getMessagesFromFolder(folder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getMessagesFromFolder(EmailFacadeImpl.java:257)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Folder folder = new Folder();

		MailMessage[] result = fixture.getMessagesFromFolder(folder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getMessagesFromFolder(EmailFacadeImpl.java:257)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Folder folder = new Folder();

		MailMessage[] result = fixture.getMessagesFromFolder(folder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.getMessagesFromFolder(EmailFacadeImpl.java:257)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Default EmailFacade Impl", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Default EmailFacade Impl", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Default EmailFacade Impl", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Default EmailFacade Impl", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Default EmailFacade Impl", result);
	}

	/**
	 * Run the JavaMailReader getReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetReader_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		JavaMailReader result = fixture.getReader();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the JavaMailReader getReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetReader_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		JavaMailReader result = fixture.getReader();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getAllMessages());
	}

	/**
	 * Run the JavaMailReader getReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetReader_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		JavaMailReader result = fixture.getReader();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getAllMessages());
	}

	/**
	 * Run the JavaMailReader getReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetReader_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		JavaMailReader result = fixture.getReader();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getAllMessages());
	}

	/**
	 * Run the JavaMailReader getReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetReader_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		JavaMailReader result = fixture.getReader();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getAllMessages());
	}

	/**
	 * Run the MailSender getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSender_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		MailSender result = fixture.getSender();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MailSender getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSender_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		MailSender result = fixture.getSender();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MailSender getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSender_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		MailSender result = fixture.getSender();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MailSender getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSender_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		MailSender result = fixture.getSender();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MailSender getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSender_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		MailSender result = fixture.getSender();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isDirty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();

		boolean result = fixture.isDirty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDirty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();

		boolean result = fixture.isDirty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDirty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();

		boolean result = fixture.isDirty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDirty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();

		boolean result = fixture.isDirty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDirty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();

		boolean result = fixture.isDirty();

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
	public void testMoveMessages_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_7()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture1_8()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

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
	public void testMoveMessages_fixture2_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture2_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture5_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture2_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture3_1()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture5_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture3_2()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture3_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture5_3()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture2_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture5_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture3_4()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture5_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture5();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture2_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture2();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_6()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage()};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture3_5()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture3();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "";
			String folderTo = "0123456789";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture4_7()
		throws Exception {
		try {
			EmailFacadeImpl fixture = getFixture4();
			MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
			String folderFrom = "0123456789";
			String folderTo = "";

			fixture.moveMessages(messages, folderFrom, folderTo);

			// add additional test code here
			fail("The exception ch.bluepenguin.email.client.service.EmailFacadeException should have been thrown.");
		} catch (ch.bluepenguin.email.client.service.EmailFacadeException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "0123456789";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture3_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		String from = "0123456789";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setTo(MimeMessageHelper.java:391)
		//       at org.springframework.mail.javamail.MimeMailMessage.setTo(MimeMailMessage.java:105)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:184)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture5_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture2_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture3_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Mail server connection failed; nested exception is javax.mail.MessagingException: Could not connect to SMTP host: localhost, port: 25;
		//       nested exception is:
		//       java.net.ConnectException: Connection refused
		//       javax.mail.MessagingException: Could not connect to SMTP host: localhost, port: 25;
		//       nested exception is:
		//       java.net.ConnectException: Connection refused
		//       at com.sun.mail.smtp.SMTPTransport.openServer(SMTPTransport.java:1008)
		//       at com.sun.mail.smtp.SMTPTransport.protocolConnect(SMTPTransport.java:197)
		//       at javax.mail.Service.connect(Service.java:233)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.doSend(JavaMailSenderImpl.java:373)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:291)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture5_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		String from = "0123456789";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setTo(MimeMessageHelper.java:391)
		//       at org.springframework.mail.javamail.MimeMailMessage.setTo(MimeMailMessage.java:105)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:184)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture2_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture4_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture2_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture4_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture3_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture4_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture3_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture5_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture1_7()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

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
	public void testSendMessage_fixture3_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture5_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setFrom(MimeMessageHelper.java:342)
		//       at org.springframework.mail.javamail.MimeMailMessage.setFrom(MimeMailMessage.java:78)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:178)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture2_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture4_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture5_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		String from = "0123456789";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailParseException: Could not parse mail: Illegal address; nested exception is javax.mail.internet.AddressException: Illegal address
		//       javax.mail.internet.AddressException: Illegal address in string ``''
		//       at javax.mail.internet.InternetAddress.<init>(InternetAddress.java:68)
		//       at org.springframework.mail.javamail.MimeMessageHelper.setTo(MimeMessageHelper.java:391)
		//       at org.springframework.mail.javamail.MimeMailMessage.setTo(MimeMailMessage.java:105)
		//       at org.springframework.mail.SimpleMailMessage.copyTo(SimpleMailMessage.java:184)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:288)
		//       at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:277)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture2_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.mail.MailSendException: Could not send mails: Connection refused
		//       java.net.ConnectException: Connection refused
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		//       at com.oreilly.servlet.MailMessage.connect(MailMessage.java:278)
		//       at com.oreilly.servlet.MailMessage.<init>(MailMessage.java:108)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:78)
		//       at org.springframework.mail.cos.CosMailSenderImpl.send(CosMailSenderImpl.java:61)
		//       at ch.bluepenguin.email.client.service.impl.EmailFacadeImpl.sendMessage(EmailFacadeImpl.java:95)
	}

	/**
	 * Run the void setCache(MailCache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCache_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailCache cache = new MailCache("");

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(MailCache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCache_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		MailCache cache = new MailCache("");

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(MailCache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCache_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		MailCache cache = new MailCache("");

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(MailCache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCache_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		MailCache cache = new MailCache("");

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(MailCache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCache_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		MailCache cache = new MailCache("");

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		boolean dirty = false;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		boolean dirty = true;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		boolean dirty = true;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		boolean dirty = true;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		boolean dirty = true;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture2_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		boolean dirty = false;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture3_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		boolean dirty = false;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture4_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		boolean dirty = false;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture5_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		boolean dirty = false;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setDirty(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDirty_fixture1_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		boolean dirty = true;

		fixture.setDirty(dirty);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Logger logger = Logger.getAnonymousLogger("");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.Logger.getAnonymousLogger(Logger.java:533)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Logger logger = Logger.getAnonymousLogger();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Logger logger = Logger.getGlobal();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Logger logger = Logger.getLogger("");

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Logger logger = Logger.getLogger("", "");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.getLogger(Logger.java:455)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture1_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Logger logger = Logger.getLogger("0123456789", "0123456789");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find 0123456789 bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.LogManager.demandLogger(LogManager.java:433)
		//       at java.util.logging.Logger.demandLogger(Logger.java:346)
		//       at java.util.logging.Logger.getLogger(Logger.java:442)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture2_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Logger logger = Logger.global;

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture4_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Logger logger = Logger.getAnonymousLogger("");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.Logger.getAnonymousLogger(Logger.java:533)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture5_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Logger logger = Logger.getAnonymousLogger();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture1_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Logger logger = Logger.getGlobal();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture2_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Logger logger = Logger.getLogger("");

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture3_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Logger logger = Logger.getLogger("", "");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.getLogger(Logger.java:455)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture4_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Logger logger = Logger.getLogger("0123456789", "0123456789");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find 0123456789 bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.LogManager.demandLogger(LogManager.java:433)
		//       at java.util.logging.Logger.demandLogger(Logger.java:346)
		//       at java.util.logging.Logger.getLogger(Logger.java:442)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture5_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Logger logger = Logger.global;

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture2_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Logger logger = Logger.getAnonymousLogger("");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.Logger.getAnonymousLogger(Logger.java:533)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture3_3()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Logger logger = Logger.getAnonymousLogger();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture4_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Logger logger = Logger.getGlobal();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture5_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Logger logger = Logger.getLogger("");

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture1_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Logger logger = Logger.getLogger("", "");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.getLogger(Logger.java:455)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture2_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Logger logger = Logger.getLogger("0123456789", "0123456789");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find 0123456789 bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.LogManager.demandLogger(LogManager.java:433)
		//       at java.util.logging.Logger.demandLogger(Logger.java:346)
		//       at java.util.logging.Logger.getLogger(Logger.java:442)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture3_4()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Logger logger = Logger.global;

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture5_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Logger logger = Logger.getAnonymousLogger("");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.Logger.getAnonymousLogger(Logger.java:533)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture1_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Logger logger = Logger.getAnonymousLogger();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture2_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		Logger logger = Logger.getGlobal();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture3_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Logger logger = Logger.getLogger("");

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture4_5()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Logger logger = Logger.getLogger("", "");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.getLogger(Logger.java:455)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture5_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		Logger logger = Logger.getLogger("0123456789", "0123456789");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find 0123456789 bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.LogManager.demandLogger(LogManager.java:433)
		//       at java.util.logging.Logger.demandLogger(Logger.java:346)
		//       at java.util.logging.Logger.getLogger(Logger.java:442)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture1_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		Logger logger = Logger.global;

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture3_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		Logger logger = Logger.getAnonymousLogger("");

		fixture.setLogger(logger);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find  bundle
		//       at java.util.logging.Logger.setupResourceInfo(Logger.java:1537)
		//       at java.util.logging.Logger.<init>(Logger.java:267)
		//       at java.util.logging.Logger.getAnonymousLogger(Logger.java:533)
	}

	/**
	 * Run the void setLogger(Logger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLogger_fixture4_6()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		Logger logger = Logger.getAnonymousLogger();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setReader(JavaMailReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetReader_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		JavaMailReader reader = new JavaMailReaderImpl();

		fixture.setReader(reader);

		// add additional test code here
	}

	/**
	 * Run the void setReader(JavaMailReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetReader_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		JavaMailReader reader = new JavaMailReaderImpl();

		fixture.setReader(reader);

		// add additional test code here
	}

	/**
	 * Run the void setReader(JavaMailReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetReader_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		JavaMailReader reader = new JavaMailReaderImpl();

		fixture.setReader(reader);

		// add additional test code here
	}

	/**
	 * Run the void setReader(JavaMailReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetReader_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		JavaMailReader reader = new JavaMailReaderImpl();

		fixture.setReader(reader);

		// add additional test code here
	}

	/**
	 * Run the void setReader(JavaMailReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetReader_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		JavaMailReader reader = new JavaMailReaderImpl();

		fixture.setReader(reader);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture1_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailSender sender = new CosMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture2_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		MailSender sender = new JavaMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture3_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		MailSender sender = new JavaMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture4_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		MailSender sender = new JavaMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture5_1()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		MailSender sender = new JavaMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture2_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture2();
		MailSender sender = new CosMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture3_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture3();
		MailSender sender = new CosMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture4_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture4();
		MailSender sender = new CosMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture5_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture5();
		MailSender sender = new CosMailSenderImpl();

		fixture.setSender(sender);

		// add additional test code here
	}

	/**
	 * Run the void setSender(MailSender) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSender_fixture1_2()
		throws Exception {
		EmailFacadeImpl fixture = getFixture1();
		MailSender sender = new JavaMailSenderImpl();

		fixture.setSender(sender);

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