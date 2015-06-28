package ch.bluepenguin.email.client.service.impl;

import java.util.logging.Logger;
import ch.bluepenguin.email.client.MailMessage;
import ch.bluepenguin.email.client.Folder;
import junit.framework.*;

/**
 * The class <code>DummyEmailFacadeImplTest</code> contains tests for the class <code>{@link DummyEmailFacadeImpl}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DummyEmailFacadeImplTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DummyEmailFacadeImpl fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DummyEmailFacadeImpl();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DummyEmailFacadeImpl();
			fixture2.setCurrentFolder("");
			fixture2.setLogger(Logger.getAnonymousLogger());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DummyEmailFacadeImpl();
			fixture3.setCurrentFolder("");
			fixture3.setLogger(Logger.getGlobal());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DummyEmailFacadeImpl();
			fixture4.setCurrentFolder("0123456789");
			fixture4.setLogger(Logger.getAnonymousLogger());
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DummyEmailFacadeImpl();
			fixture5.setCurrentFolder("0123456789");
			fixture5.setLogger(Logger.getGlobal());
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DummyEmailFacadeImpl();
			fixture6.setCurrentFolder("An��t-1.0.txt");
			fixture6.setLogger(Logger.getAnonymousLogger());
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DummyEmailFacadeImpl
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DummyEmailFacadeImpl getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DummyEmailFacadeImpl();
			fixture7.setCurrentFolder("An��t-1.0.txt");
			fixture7.setLogger(Logger.getGlobal());
		}
		return fixture7;
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture6_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture6_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture6_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
	}

	/**
	 * Run the void copyMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCopyMessages_fixture7_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.copyMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.copyMessages(DummyEmailFacadeImpl.java:134)
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
		DummyEmailFacadeImpl fixture = getFixture1();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(105), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
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
		DummyEmailFacadeImpl fixture = getFixture2();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(108), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
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
		DummyEmailFacadeImpl fixture = getFixture3();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(111), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
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
		DummyEmailFacadeImpl fixture = getFixture4();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(114), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
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
		DummyEmailFacadeImpl fixture = getFixture5();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(117), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(120), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
	}

	/**
	 * Run the Folder[] getAllFolders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllFolders_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();

		Folder[] result = fixture.getAllFolders();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFullName());
		assertEquals("INBOX", result[0].getName());
		assertEquals(null, result[0].getParent());
		assertEquals(null, result[0].getAccount());
		assertEquals(null, result[0].getParentFolderId());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFullName());
		assertEquals("IMPORTANT", result[1].getName());
		assertEquals(null, result[1].getAccount());
		assertEquals(new Integer(123), result[1].getParentFolderId());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFullName());
		assertEquals("DUMMY", result[2].getName());
		assertEquals(null, result[2].getParent());
		assertEquals(null, result[2].getAccount());
		assertEquals(null, result[2].getParentFolderId());
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
		DummyEmailFacadeImpl fixture = getFixture1();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
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
		DummyEmailFacadeImpl fixture = getFixture2();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
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
		DummyEmailFacadeImpl fixture = getFixture3();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
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
		DummyEmailFacadeImpl fixture = getFixture4();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
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
		DummyEmailFacadeImpl fixture = getFixture5();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getAllMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetAllMessages_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();

		MailMessage[] result = fixture.getAllMessages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("NO Folder selectet!  Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("NO Folder selectet!  not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=NO Folder selectet!  spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("NO Folder selectet!  spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture1_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture2_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture3_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture4_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture5_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getCurrentFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCurrentFolder_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();

		Folder result = fixture.getCurrentFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals("Current Folder", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture1_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		int id = 0;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture2_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		int id = 1;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture3_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		int id = 7;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture5_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		int id = 0;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		int id = 0;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		int id = 0;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture1_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		int id = 0;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture2_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		int id = 7;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture4_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		int id = 0;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture5_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		int id = 1;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		int id = 1;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		int id = 1;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture1_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		int id = 1;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture2_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		int id = 7;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture4_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		int id = 0;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture5_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		int id = 1;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture6_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		int id = 1;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture7_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		int id = 1;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture1_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		int id = 1;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture3_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		int id = 0;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture4_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		int id = 1;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture5_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		int id = 7;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture6_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		int id = 7;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture7_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		int id = 7;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture1_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		int id = 7;
		String folderName = "";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture3_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		int id = 0;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture4_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		int id = 1;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture5_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		int id = 7;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture6_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		int id = 7;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage getMessage(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessage_fixture7_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		int id = 7;
		String folderName = "0123456789";

		MailMessage result = fixture.getMessage(id, folderName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.getMessage(DummyEmailFacadeImpl.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture1_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture2_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture3_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture4_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture5_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture2_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture3_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture4_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture5_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String folderName = "";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals(" Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals(" not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject= spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals(" spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
	}

	/**
	 * Run the MailMessage[] getMessagesFromFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMessagesFromFolder_fixture1_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		String folderName = "0123456789";

		MailMessage[] result = fixture.getMessagesFromFolder(folderName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getFolder());
		assertEquals(0, result[0].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 Very important message 0; text=short message", result[0].toString());
		assertEquals("cs@bluepenguin.ch", result[0].getFrom());
		assertEquals("0123456789 Very important message 0", result[0].getSubject());
		assertEquals("short message", result[0].getText());
		assertEquals(null, result[0].getBcc());
		assertEquals(null, result[0].getReplyTo());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getFolder());
		assertEquals(0, result[1].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 not too important message; text=short message", result[1].toString());
		assertEquals("cs@bluepenguin.ch", result[1].getFrom());
		assertEquals("0123456789 not too important message", result[1].getSubject());
		assertEquals("short message", result[1].getText());
		assertEquals(null, result[1].getBcc());
		assertEquals(null, result[1].getReplyTo());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getFolder());
		assertEquals(0, result[2].getTechnicalID());
		assertEquals("SimpleMailMessage: from=cs@bluepenguin.ch; replyTo=null; to=noone@nowhere.com; cc=cc@dd.ee; bcc=; sentDate=Wed Sep 12 00:00:00 MDT 3900; subject=0123456789 spam!; text=short message", result[2].toString());
		assertEquals("cs@bluepenguin.ch", result[2].getFrom());
		assertEquals("0123456789 spam!", result[2].getSubject());
		assertEquals("short message", result[2].getText());
		assertEquals(null, result[2].getBcc());
		assertEquals(null, result[2].getReplyTo());
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
		DummyEmailFacadeImpl fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
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
		DummyEmailFacadeImpl fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
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
		DummyEmailFacadeImpl fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
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
		DummyEmailFacadeImpl fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
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
		DummyEmailFacadeImpl fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("Dummy EmailFacade Impl", result);
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture6_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture4();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture6_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "0123456789";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "0123456789";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		MailMessage[] messages = new MailMessage[] {new MailMessage()};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture5();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture6_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
	}

	/**
	 * Run the void moveMessages(MailMessage[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMoveMessages_fixture7_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		MailMessage[] messages = new MailMessage[] {new MailMessage(), null};
		String folderFrom = "";
		String folderTo = "";

		fixture.moveMessages(messages, folderFrom, folderTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Method not implemented
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.moveMessages(DummyEmailFacadeImpl.java:143)
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
		DummyEmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.sendMessage(DummyEmailFacadeImpl.java:37)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture4();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String from = "0123456789";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.sendMessage(DummyEmailFacadeImpl.java:37)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture1();
		String from = "0123456789";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.sendMessage(DummyEmailFacadeImpl.java:37)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture4();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture1();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.sendMessage(DummyEmailFacadeImpl.java:37)
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
		DummyEmailFacadeImpl fixture = getFixture3();
		String from = "0123456789";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture5();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture6_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture4();
		String from = "";
		String to = "";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture5();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture7_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture1();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.service.impl.DummyEmailFacadeImpl.sendMessage(DummyEmailFacadeImpl.java:37)
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
		DummyEmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture4();
		String from = "";
		String to = "";
		String subject = "0123456789";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture6_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String from = "";
		String to = "";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void sendMessage(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSendMessage_fixture7_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String from = "0123456789";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture2();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
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
		DummyEmailFacadeImpl fixture = getFixture3();
		String from = "";
		String to = "0123456789";
		String subject = "";
		String message = "0123456789";

		fixture.sendMessage(from, to, subject, message);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture1_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture2_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture3_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture4_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture5_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture2_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture3_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture4_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture5_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
		String folderName = "";

		fixture.setCurrentFolder(folderName);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetCurrentFolder_fixture1_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
		String folderName = "0123456789";

		fixture.setCurrentFolder(folderName);

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
		DummyEmailFacadeImpl fixture = getFixture1();
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
		DummyEmailFacadeImpl fixture = getFixture2();
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
		DummyEmailFacadeImpl fixture = getFixture3();
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
		DummyEmailFacadeImpl fixture = getFixture4();
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
		DummyEmailFacadeImpl fixture = getFixture5();
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
	public void testSetLogger_fixture6_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
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
	public void testSetLogger_fixture7_1()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
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
	public void testSetLogger_fixture2_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
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
	public void testSetLogger_fixture3_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
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
	public void testSetLogger_fixture4_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
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
	public void testSetLogger_fixture5_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
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
	public void testSetLogger_fixture6_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
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
	public void testSetLogger_fixture7_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
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
	public void testSetLogger_fixture1_2()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
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
	public void testSetLogger_fixture3_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture3();
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
	public void testSetLogger_fixture4_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
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
	public void testSetLogger_fixture5_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
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
	public void testSetLogger_fixture6_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
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
	public void testSetLogger_fixture7_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
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
	public void testSetLogger_fixture1_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture1();
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
	public void testSetLogger_fixture2_3()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
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
	public void testSetLogger_fixture4_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture4();
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
	public void testSetLogger_fixture5_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture5();
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
	public void testSetLogger_fixture6_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
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
	public void testSetLogger_fixture7_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture7();
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
		DummyEmailFacadeImpl fixture = getFixture1();
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
	public void testSetLogger_fixture2_4()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture2();
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
		DummyEmailFacadeImpl fixture = getFixture3();
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
		DummyEmailFacadeImpl fixture = getFixture5();
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
	public void testSetLogger_fixture6_5()
		throws Exception {
		DummyEmailFacadeImpl fixture = getFixture6();
		Logger logger = Logger.getAnonymousLogger();

		fixture.setLogger(logger);

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