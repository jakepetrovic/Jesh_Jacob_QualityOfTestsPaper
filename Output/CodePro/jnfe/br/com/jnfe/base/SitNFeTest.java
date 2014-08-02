package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SitNFeTest</code> contains tests for the class <code>{@link SitNFe}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SitNFeTest {
	/**
	 * Run the char getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		SitNFe fixture = SitNFe.AUTORIZADA;

		char result = fixture.getValue();

		// add additional test code here
		assertEquals(' ', result);
	}

	/**
	 * Run the boolean isReenviar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsReenviar_1()
		throws Exception {
		SitNFe fixture = SitNFe.AUTORIZADA;

		boolean result = fixture.isReenviar();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isReenviar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsReenviar_2()
		throws Exception {
		SitNFe fixture = SitNFe.AUTORIZADA;

		boolean result = fixture.isReenviar();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUsar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsUsar_1()
		throws Exception {
		SitNFe fixture = SitNFe.AUTORIZADA;

		boolean result = fixture.isUsar();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUsar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsUsar_2()
		throws Exception {
		SitNFe fixture = SitNFe.AUTORIZADA;

		boolean result = fixture.isUsar();

		// add additional test code here
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(SitNFeTest.class);
	}
}