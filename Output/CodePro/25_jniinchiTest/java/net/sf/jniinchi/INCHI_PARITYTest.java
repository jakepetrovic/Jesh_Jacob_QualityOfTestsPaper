package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>INCHI_PARITYTest</code> contains tests for the class <code>{@link INCHI_PARITY}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class INCHI_PARITYTest {
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
		INCHI_PARITY fixture = INCHI_PARITY.EVEN;

		int result = fixture.getIndx();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the INCHI_PARITY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		int parity = 0;

		INCHI_PARITY result = INCHI_PARITY.getValue(parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		int parity = 1;

		INCHI_PARITY result = INCHI_PARITY.getValue(parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_3()
		throws Exception {
		int parity = 2;

		INCHI_PARITY result = INCHI_PARITY.getValue(parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_4()
		throws Exception {
		int parity = 3;

		INCHI_PARITY result = INCHI_PARITY.getValue(parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_5()
		throws Exception {
		int parity = 4;

		INCHI_PARITY result = INCHI_PARITY.getValue(parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_6()
		throws Exception {
		int parity = 5;

		INCHI_PARITY result = INCHI_PARITY.getValue(parity);

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
		new org.junit.runner.JUnitCore().run(INCHI_PARITYTest.class);
	}
}