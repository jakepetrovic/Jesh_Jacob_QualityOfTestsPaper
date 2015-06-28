package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>INCHI_BOND_STEREOTest</code> contains tests for the class <code>{@link INCHI_BOND_STEREO}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class INCHI_BOND_STEREOTest {
	/**
	 * Run the int getIndx() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetIndx_1()
		throws Exception {
		INCHI_BOND_STEREO fixture = INCHI_BOND_STEREO.DOUBLE_EITHER;

		int result = fixture.getIndx();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		int bster = 0;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		int bster = 1;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_3()
		throws Exception {
		int bster = 4;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_4()
		throws Exception {
		int bster = 6;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_5()
		throws Exception {
		int bster = 3;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_6()
		throws Exception {
		int bster = -1;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_7()
		throws Exception {
		int bster = -4;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_8()
		throws Exception {
		int bster = -6;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_STEREO getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_9()
		throws Exception {
		int bster = -5;

		INCHI_BOND_STEREO result = INCHI_BOND_STEREO.getValue(bster);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
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
	 * @generatedBy CodePro at 4/19/14 3:04 PM
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
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(INCHI_BOND_STEREOTest.class);
	}
}