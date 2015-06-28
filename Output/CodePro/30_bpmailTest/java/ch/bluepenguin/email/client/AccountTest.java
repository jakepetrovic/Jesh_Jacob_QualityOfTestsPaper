package ch.bluepenguin.email.client;

import junit.framework.*;

/**
 * The class <code>AccountTest</code> contains tests for the class <code>{@link Account}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AccountTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Account
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Account fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Account
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Account fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Account
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Account getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Account();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Account
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Account getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Account();
			fixture2.setPerson(new Person());
		}
		return fixture2;
	}

	/**
	 * Run the Person getPerson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetPerson_fixture1_1()
		throws Exception {
		Account fixture = getFixture1();

		Person result = fixture.getPerson();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person getPerson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetPerson_fixture2_1()
		throws Exception {
		Account fixture = getFixture2();

		Person result = fixture.getPerson();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getReserve());
		assertEquals(null, result.getFirstname());
		assertEquals(null, result.getNickname());
		assertEquals(null, result.getLastname());
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
		Account fixture = getFixture1();

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
		Account fixture = getFixture2();

		AbstractUniqueID result = fixture.getUniqueID();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the void setPerson(Person) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetPerson_fixture1_1()
		throws Exception {
		Account fixture = getFixture1();
		Person person = new Person();

		fixture.setPerson(person);

		// add additional test code here
	}

	/**
	 * Run the void setPerson(Person) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetPerson_fixture2_1()
		throws Exception {
		Account fixture = getFixture2();
		Person person = new Person();

		fixture.setPerson(person);

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