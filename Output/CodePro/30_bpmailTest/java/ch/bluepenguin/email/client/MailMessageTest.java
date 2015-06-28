package ch.bluepenguin.email.client;

import junit.framework.*;

/**
 * The class <code>MailMessageTest</code> contains tests for the class <code>{@link MailMessage}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MailMessageTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private MailMessage fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private MailMessage fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private MailMessage fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private MailMessage fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public MailMessage getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new MailMessage();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public MailMessage getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new MailMessage();
			fixture2.setFolder(new Folder());
			fixture2.setTechnicalID(0);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public MailMessage getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new MailMessage();
			fixture3.setFolder(new Folder());
			fixture3.setTechnicalID(1);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailMessage
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public MailMessage getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new MailMessage();
			fixture4.setFolder(new Folder());
			fixture4.setTechnicalID(7);
		}
		return fixture4;
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture1_1()
		throws Exception {
		MailMessage fixture = getFixture1();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture2_1()
		throws Exception {
		MailMessage fixture = getFixture2();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture3_1()
		throws Exception {
		MailMessage fixture = getFixture3();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture4_1()
		throws Exception {
		MailMessage fixture = getFixture4();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the int getTechnicalID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalID_fixture1_1()
		throws Exception {
		MailMessage fixture = getFixture1();

		int result = fixture.getTechnicalID();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTechnicalID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalID_fixture2_1()
		throws Exception {
		MailMessage fixture = getFixture2();

		int result = fixture.getTechnicalID();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTechnicalID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalID_fixture3_1()
		throws Exception {
		MailMessage fixture = getFixture3();

		int result = fixture.getTechnicalID();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTechnicalID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalID_fixture4_1()
		throws Exception {
		MailMessage fixture = getFixture4();

		int result = fixture.getTechnicalID();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the AbstractUniqueID getUniqueID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUniqueID_fixture1_1()
		throws Exception {
		MailMessage fixture = getFixture1();

		AbstractUniqueID result = fixture.getUniqueID();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the AbstractUniqueID getUniqueID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUniqueID_fixture2_1()
		throws Exception {
		MailMessage fixture = getFixture2();

		AbstractUniqueID result = fixture.getUniqueID();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the AbstractUniqueID getUniqueID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUniqueID_fixture3_1()
		throws Exception {
		MailMessage fixture = getFixture3();

		AbstractUniqueID result = fixture.getUniqueID();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the AbstractUniqueID getUniqueID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUniqueID_fixture4_1()
		throws Exception {
		MailMessage fixture = getFixture4();

		AbstractUniqueID result = fixture.getUniqueID();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture1_1()
		throws Exception {
		MailMessage fixture = getFixture1();
		Folder folder = new Folder();

		fixture.setFolder(folder);

		// add additional test code here
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture2_1()
		throws Exception {
		MailMessage fixture = getFixture2();
		Folder folder = new Folder();

		fixture.setFolder(folder);

		// add additional test code here
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture3_1()
		throws Exception {
		MailMessage fixture = getFixture3();
		Folder folder = new Folder();

		fixture.setFolder(folder);

		// add additional test code here
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture4_1()
		throws Exception {
		MailMessage fixture = getFixture4();
		Folder folder = new Folder();

		fixture.setFolder(folder);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture1_1()
		throws Exception {
		MailMessage fixture = getFixture1();
		int technicalID = 0;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture2_1()
		throws Exception {
		MailMessage fixture = getFixture2();
		int technicalID = 1;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture3_1()
		throws Exception {
		MailMessage fixture = getFixture3();
		int technicalID = 7;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture4_1()
		throws Exception {
		MailMessage fixture = getFixture4();
		int technicalID = 7;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture2_2()
		throws Exception {
		MailMessage fixture = getFixture2();
		int technicalID = 0;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture3_2()
		throws Exception {
		MailMessage fixture = getFixture3();
		int technicalID = 1;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture4_2()
		throws Exception {
		MailMessage fixture = getFixture4();
		int technicalID = 1;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture1_2()
		throws Exception {
		MailMessage fixture = getFixture1();
		int technicalID = 7;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture3_3()
		throws Exception {
		MailMessage fixture = getFixture3();
		int technicalID = 0;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture4_3()
		throws Exception {
		MailMessage fixture = getFixture4();
		int technicalID = 0;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture1_3()
		throws Exception {
		MailMessage fixture = getFixture1();
		int technicalID = 1;

		fixture.setTechnicalID(technicalID);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalID(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalID_fixture2_3()
		throws Exception {
		MailMessage fixture = getFixture2();
		int technicalID = 7;

		fixture.setTechnicalID(technicalID);

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