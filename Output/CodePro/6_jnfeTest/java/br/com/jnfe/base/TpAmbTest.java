package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TpAmbTest</code> contains tests for the class <code>{@link TpAmb}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TpAmbTest {
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
		TpAmb fixture = TpAmb.HOMOLOGACAO;

		char result = fixture.getValue();

		// add additional test code here
		assertEquals(' ', result);
	}

	/**
	 * Run the String getValueAsString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetValueAsString_1()
		throws Exception {
		TpAmb fixture = TpAmb.HOMOLOGACAO;

		String result = fixture.getValueAsString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TpAmb valueOf(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testValueOf_1()
		throws Exception {
		char value = '1';

		TpAmb result = TpAmb.valueOf(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TpAmb valueOf(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testValueOf_2()
		throws Exception {
		char value = '2';

		TpAmb result = TpAmb.valueOf(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TpAmb valueOf(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testValueOf_3()
		throws Exception {
		char value = '';

		TpAmb result = TpAmb.valueOf(value);

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
		new org.junit.runner.JUnitCore().run(TpAmbTest.class);
	}
}