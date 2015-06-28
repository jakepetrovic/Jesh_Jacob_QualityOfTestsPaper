package ch.bluepenguin.email.client.service.impl;

import junit.framework.*;

/**
 * The class <code>EmailFacadeStateTest</code> contains tests for the class <code>{@link EmailFacadeState}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class EmailFacadeStateTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeState
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeState fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeState
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeState getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new EmailFacadeState();
		}
		return fixture;
	}

	/**
	 * Run the EmailFacadeState() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEmailFacadeState_1()
		throws Exception {

		EmailFacadeState result = new EmailFacadeState();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isAllClean());
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testClear_fixture_1()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();

		fixture2.clear();

		// add additional test code here
	}

	/**
	 * Run the boolean isAllClean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsAllClean_fixture_1()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();

		boolean result = fixture2.isAllClean();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDirty(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture_1()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(-1);

		boolean result = fixture2.isDirty(ID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDirty(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture_2()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(0);

		boolean result = fixture2.isDirty(ID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDirty(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsDirty_fixture_3()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(1);

		boolean result = fixture2.isDirty(ID);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setAll(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAll_fixture_1()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		boolean dirtyFlag = false;

		fixture2.setAll(dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setAll(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAll_fixture_2()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		boolean dirtyFlag = true;

		fixture2.setAll(dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setState(Integer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetState_fixture_1()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(-1);
		boolean dirtyFlag = false;

		fixture2.setState(ID, dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setState(Integer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetState_fixture_2()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(0);
		boolean dirtyFlag = true;

		fixture2.setState(ID, dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setState(Integer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetState_fixture_3()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(1);
		boolean dirtyFlag = true;

		fixture2.setState(ID, dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setState(Integer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetState_fixture_4()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(0);
		boolean dirtyFlag = false;

		fixture2.setState(ID, dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setState(Integer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetState_fixture_5()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(1);
		boolean dirtyFlag = false;

		fixture2.setState(ID, dirtyFlag);

		// add additional test code here
	}

	/**
	 * Run the void setState(Integer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetState_fixture_6()
		throws Exception {
		EmailFacadeState fixture2 = getFixture();
		Integer ID = new Integer(-1);
		boolean dirtyFlag = true;

		fixture2.setState(ID, dirtyFlag);

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