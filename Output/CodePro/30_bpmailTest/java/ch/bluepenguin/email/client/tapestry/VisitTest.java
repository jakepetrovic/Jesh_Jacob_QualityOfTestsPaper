package ch.bluepenguin.email.client.tapestry;

import junit.framework.*;

/**
 * The class <code>VisitTest</code> contains tests for the class <code>{@link Visit}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class VisitTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Visit fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Visit fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Visit fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Visit fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Visit getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Visit();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Visit getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Visit();
			fixture2.setUserID("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Visit getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Visit();
			fixture3.setUserID("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Visit
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Visit getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Visit();
			fixture4.setUserID("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Run the String getUserID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUserID_fixture1_1()
		throws Exception {
		Visit fixture = getFixture1();

		String result = fixture.getUserID();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getUserID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUserID_fixture2_1()
		throws Exception {
		Visit fixture = getFixture2();

		String result = fixture.getUserID();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUserID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUserID_fixture3_1()
		throws Exception {
		Visit fixture = getFixture3();

		String result = fixture.getUserID();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUserID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetUserID_fixture4_1()
		throws Exception {
		Visit fixture = getFixture4();

		String result = fixture.getUserID();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture1_1()
		throws Exception {
		Visit fixture = getFixture1();
		String userID = "";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture2_1()
		throws Exception {
		Visit fixture = getFixture2();
		String userID = "0123456789";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture3_1()
		throws Exception {
		Visit fixture = getFixture3();
		String userID = "0123456789";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture4_1()
		throws Exception {
		Visit fixture = getFixture4();
		String userID = "0123456789";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture2_2()
		throws Exception {
		Visit fixture = getFixture2();
		String userID = "";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture3_2()
		throws Exception {
		Visit fixture = getFixture3();
		String userID = "";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture4_2()
		throws Exception {
		Visit fixture = getFixture4();
		String userID = "";

		fixture.setUserID(userID);

		// add additional test code here
	}

	/**
	 * Run the void setUserID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetUserID_fixture1_2()
		throws Exception {
		Visit fixture = getFixture1();
		String userID = "0123456789";

		fixture.setUserID(userID);

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