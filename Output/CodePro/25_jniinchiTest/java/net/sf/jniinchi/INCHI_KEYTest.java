package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>INCHI_KEYTest</code> contains tests for the class <code>{@link INCHI_KEY}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class INCHI_KEYTest {
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
		INCHI_KEY fixture = INCHI_KEY.EMPTY_INPUT;

		int result = fixture.getIndx();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		int ret = 0;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		int ret = 1;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_3()
		throws Exception {
		int ret = 2;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_4()
		throws Exception {
		int ret = 3;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_5()
		throws Exception {
		int ret = 4;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_6()
		throws Exception {
		int ret = 20;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_7()
		throws Exception {
		int ret = 21;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY getValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetValue_8()
		throws Exception {
		int ret = 5;

		INCHI_KEY result = INCHI_KEY.getValue(ret);

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
		new org.junit.runner.JUnitCore().run(INCHI_KEYTest.class);
	}
}