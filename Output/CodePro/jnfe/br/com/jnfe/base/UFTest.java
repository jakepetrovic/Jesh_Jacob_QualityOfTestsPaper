package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UFTest</code> contains tests for the class <code>{@link UF}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class UFTest {
	/**
	 * Run the String getCUF() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetCUF_1()
		throws Exception {
		UF fixture = UF.AC;

		String result = fixture.getCUF();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getNomeUF() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetNomeUF_1()
		throws Exception {
		UF fixture = UF.AC;

		String result = fixture.getNomeUF();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the UF getUF(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetUF_1()
		throws Exception {
		String cUF = "";

		UF result = UF.getUF(cUF);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the UF getUF(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetUF_2()
		throws Exception {
		String cUF = "";

		UF result = UF.getUF(cUF);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the UF getUF(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetUF_3()
		throws Exception {
		String cUF = "";

		UF result = UF.getUF(cUF);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UFTest.class);
	}
}