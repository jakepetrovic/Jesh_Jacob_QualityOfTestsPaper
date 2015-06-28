package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>C_ICMSTest</code> contains tests for the class <code>{@link C_ICMS}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class C_ICMSTest {
	/**
	 * Run the CST_Grupo getCstGrupo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetCstGrupo_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		CST_Grupo result = fixture.getCstGrupo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetGroup_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		String result = fixture.getGroup();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isIsento() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsIsento_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		boolean result = fixture.isIsento();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isIsento() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsIsento_2()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		boolean result = fixture.isIsento();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequiredTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsRequiredTag_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;
		String tag = "";

		boolean result = fixture.isRequiredTag(tag);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequiredTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsRequiredTag_2()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;
		String tag = "";

		boolean result = fixture.isRequiredTag(tag);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isST() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsST_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		boolean result = fixture.isST();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isST() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsST_2()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		boolean result = fixture.isST();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSimplesNacional() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsSimplesNacional_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		boolean result = fixture.isSimplesNacional();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSimplesNacional() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsSimplesNacional_2()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		boolean result = fixture.isSimplesNacional();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		C_ICMS fixture = C_ICMS._00;

		String result = fixture.toString();

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
		new org.junit.runner.JUnitCore().run(C_ICMSTest.class);
	}
}