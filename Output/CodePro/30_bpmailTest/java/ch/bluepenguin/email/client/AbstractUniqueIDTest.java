package ch.bluepenguin.email.client;

import junit.framework.*;

/**
 * The class <code>AbstractUniqueIDTest</code> contains tests for the class <code>{@link AbstractUniqueID}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AbstractUniqueIDTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractUniqueID fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractUniqueID fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractUniqueID fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractUniqueID fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractUniqueID getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new AbstractUniqueID();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractUniqueID getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new AbstractUniqueID();
			fixture2.setId(new Integer(-1));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractUniqueID getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new AbstractUniqueID();
			fixture3.setId(new Integer(0));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractUniqueID
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractUniqueID getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new AbstractUniqueID();
			fixture4.setId(new Integer(1));
		}
		return fixture4;
	}

	/**
	 * Run the Integer getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetId_fixture1_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture1();

		Integer result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetId_fixture2_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture2();

		Integer result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetId_fixture3_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture3();

		Integer result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetId_fixture4_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture4();

		Integer result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture1_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(629, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture2_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(628, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture3_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture3();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(629, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture4_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture4();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(630, result);
	}

	/**
	 * Run the void setId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetId_fixture1_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture1();
		Integer id = null;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetId_fixture2_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture2();
		Integer id = null;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetId_fixture3_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture3();
		Integer id = null;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetId_fixture4_1()
		throws Exception {
		AbstractUniqueID fixture = getFixture4();
		Integer id = null;

		fixture.setId(id);

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