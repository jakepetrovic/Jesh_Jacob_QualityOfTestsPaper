package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>INCHI_RADICALTest</code> contains tests for the class <code>{@link INCHI_RADICAL}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class INCHI_RADICALTest {
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
		INCHI_RADICAL fixture = INCHI_RADICAL.DOUBLET;

		int result = fixture.getIndx();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the INCHI_RADICAL getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		int rad = 0;

		INCHI_RADICAL result = INCHI_RADICAL.getValue(rad);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_RADICAL getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		int rad = 1;

		INCHI_RADICAL result = INCHI_RADICAL.getValue(rad);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_RADICAL getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_3()
		throws Exception {
		int rad = 2;

		INCHI_RADICAL result = INCHI_RADICAL.getValue(rad);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_RADICAL getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_4()
		throws Exception {
		int rad = 3;

		INCHI_RADICAL result = INCHI_RADICAL.getValue(rad);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_RADICAL getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_5()
		throws Exception {
		int rad = 4;

		INCHI_RADICAL result = INCHI_RADICAL.getValue(rad);

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
		new org.junit.runner.JUnitCore().run(INCHI_RADICALTest.class);
	}
}