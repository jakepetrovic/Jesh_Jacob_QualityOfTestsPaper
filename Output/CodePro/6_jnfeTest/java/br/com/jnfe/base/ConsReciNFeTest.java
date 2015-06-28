package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConsReciNFeTest</code> contains tests for the class <code>{@link ConsReciNFe}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ConsReciNFeTest {
	/**
	 * Run the String getNRec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetNRec_1()
		throws Exception {
		ConsReciNFe fixture = new ConsReciNFe();
		fixture.setVersao("");
		fixture.setNRec("");
		fixture.setTpAmb("");

		String result = fixture.getNRec();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTpAmb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetTpAmb_1()
		throws Exception {
		ConsReciNFe fixture = new ConsReciNFe();
		fixture.setVersao("");
		fixture.setNRec("");
		fixture.setTpAmb("");

		String result = fixture.getTpAmb();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetVersao_1()
		throws Exception {
		ConsReciNFe fixture = new ConsReciNFe();
		fixture.setVersao("");
		fixture.setNRec("");
		fixture.setTpAmb("");

		String result = fixture.getVersao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setNRec(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetNRec_1()
		throws Exception {
		ConsReciNFe fixture = new ConsReciNFe();
		fixture.setVersao("");
		fixture.setNRec("");
		fixture.setTpAmb("");
		String value = "";

		fixture.setNRec(value);

		// add additional test code here
	}

	/**
	 * Run the void setTpAmb(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetTpAmb_1()
		throws Exception {
		ConsReciNFe fixture = new ConsReciNFe();
		fixture.setVersao("");
		fixture.setNRec("");
		fixture.setTpAmb("");
		String value = "";

		fixture.setTpAmb(value);

		// add additional test code here
	}

	/**
	 * Run the void setVersao(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetVersao_1()
		throws Exception {
		ConsReciNFe fixture = new ConsReciNFe();
		fixture.setVersao("");
		fixture.setNRec("");
		fixture.setTpAmb("");
		String value = "";

		fixture.setVersao(value);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ConsReciNFeTest.class);
	}
}