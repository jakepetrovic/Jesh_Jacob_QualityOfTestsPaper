package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CST_COFINSTest</code> contains tests for the class <code>{@link CST_COFINS}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CST_COFINSTest {
	/**
	 * Run the String getDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetDesc_1()
		throws Exception {
		CST_COFINS fixture = CST_COFINS.COFINS_01;

		String result = fixture.getDesc();

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
		CST_COFINS fixture = CST_COFINS.COFINS_01;

		String result = fixture.getGroup();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		CST_COFINS fixture = CST_COFINS.COFINS_01;

		String result = fixture.getValue();

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
		CST_COFINS fixture = CST_COFINS.COFINS_01;

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
		CST_COFINS fixture = CST_COFINS.COFINS_01;

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
		CST_COFINS fixture = CST_COFINS.COFINS_01;
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
		CST_COFINS fixture = CST_COFINS.COFINS_01;
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
	public void testIsRequiredTag_3()
		throws Exception {
		CST_COFINS fixture = CST_COFINS.COFINS_01;
		String tag = "";

		boolean result = fixture.isRequiredTag(tag);

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
		new org.junit.runner.JUnitCore().run(CST_COFINSTest.class);
	}
}