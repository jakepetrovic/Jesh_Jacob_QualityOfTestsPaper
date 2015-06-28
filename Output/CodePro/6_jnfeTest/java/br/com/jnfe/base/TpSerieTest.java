package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TpSerieTest</code> contains tests for the class <code>{@link TpSerie}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TpSerieTest {
	/**
	 * Run the int getSerieFin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetSerieFin_1()
		throws Exception {
		TpSerie fixture = TpSerie.CONTINGENCIA;

		int result = fixture.getSerieFin();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getSerieIni() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetSerieIni_1()
		throws Exception {
		TpSerie fixture = TpSerie.CONTINGENCIA;

		int result = fixture.getSerieIni();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the TpSerie getTpSerie(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetTpSerie_1()
		throws Exception {
		int serie = 1;

		TpSerie result = TpSerie.getTpSerie(serie);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TpSerie getTpSerie(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetTpSerie_2()
		throws Exception {
		int serie = 1;

		TpSerie result = TpSerie.getTpSerie(serie);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TpSerie getTpSerie(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetTpSerie_3()
		throws Exception {
		int serie = 1;

		TpSerie result = TpSerie.getTpSerie(serie);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TpSerie getTpSerie(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetTpSerie_4()
		throws Exception {
		int serie = 1;

		TpSerie result = TpSerie.getTpSerie(serie);

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
		new org.junit.runner.JUnitCore().run(TpSerieTest.class);
	}
}