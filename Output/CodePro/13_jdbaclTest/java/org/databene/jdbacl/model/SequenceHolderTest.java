package org.databene.jdbacl.model;

import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SequenceHolderTest</code> contains tests for the class <code>{@link SequenceHolder}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SequenceHolderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private SequenceHolder fixture8;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBSchema("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBSchema("", new DBCatalog(""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new TableContainer("");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequenceHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public SequenceHolder getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new TableContainerSupport();
		}
		return fixture8;
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_1()
		throws Exception {
		SequenceHolder fixture = getFixture1();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_1()
		throws Exception {
		SequenceHolder fixture = getFixture2();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_1()
		throws Exception {
		SequenceHolder fixture = getFixture3();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture4_1()
		throws Exception {
		SequenceHolder fixture = getFixture4();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture5_1()
		throws Exception {
		SequenceHolder fixture = getFixture5();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture6_1()
		throws Exception {
		SequenceHolder fixture = getFixture6();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture7_1()
		throws Exception {
		SequenceHolder fixture = getFixture7();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture8_1()
		throws Exception {
		SequenceHolder fixture = getFixture8();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_2()
		throws Exception {
		SequenceHolder fixture = getFixture2();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_2()
		throws Exception {
		SequenceHolder fixture = getFixture3();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture4_2()
		throws Exception {
		SequenceHolder fixture = getFixture4();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture5_2()
		throws Exception {
		SequenceHolder fixture = getFixture5();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture6_2()
		throws Exception {
		SequenceHolder fixture = getFixture6();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture7_2()
		throws Exception {
		SequenceHolder fixture = getFixture7();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture8_2()
		throws Exception {
		SequenceHolder fixture = getFixture8();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_2()
		throws Exception {
		SequenceHolder fixture = getFixture1();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SequenceHolderTest.class);
	}
}