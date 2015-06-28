package messages.global;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ParticipantInfoTest</code> contains tests for the class <code>{@link ParticipantInfo}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ParticipantInfoTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ParticipantInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private ParticipantInfo fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ParticipantInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private ParticipantInfo fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ParticipantInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public ParticipantInfo getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ParticipantInfo(0, "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ParticipantInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public ParticipantInfo getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ParticipantInfo(1, "0123456789");
		}
		return fixture2;
	}

	/**
	 * Run the ParticipantInfo(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testParticipantInfo_1()
		throws Exception {
		int id = 0;
		String name = "";

		ParticipantInfo result = new ParticipantInfo(id, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the ParticipantInfo(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testParticipantInfo_2()
		throws Exception {
		int id = 1;
		String name = "0123456789";

		ParticipantInfo result = new ParticipantInfo(id, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the ParticipantInfo(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testParticipantInfo_3()
		throws Exception {
		int id = 7;
		String name = "0123456789";

		ParticipantInfo result = new ParticipantInfo(id, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the ParticipantInfo(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testParticipantInfo_4()
		throws Exception {
		int id = 1;
		String name = "";

		ParticipantInfo result = new ParticipantInfo(id, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the ParticipantInfo(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testParticipantInfo_5()
		throws Exception {
		int id = 7;
		String name = "";

		ParticipantInfo result = new ParticipantInfo(id, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the ParticipantInfo(int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testParticipantInfo_6()
		throws Exception {
		int id = 0;
		String name = "0123456789";

		ParticipantInfo result = new ParticipantInfo(id, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture1_1()
		throws Exception {
		ParticipantInfo fixture = getFixture1();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture2_1()
		throws Exception {
		ParticipantInfo fixture = getFixture2();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		ParticipantInfo fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		ParticipantInfo fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
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
		new org.junit.runner.JUnitCore().run(ParticipantInfoTest.class);
	}
}