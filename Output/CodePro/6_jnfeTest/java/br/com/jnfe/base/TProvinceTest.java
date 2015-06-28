package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TProvinceTest</code> contains tests for the class <code>{@link TProvince}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TProvinceTest {
	/**
	 * Run the String getProvinceCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetProvinceCode_1()
		throws Exception {
		TProvince fixture = new TProvince();
		fixture.setProvinceName("");
		fixture.setProvinceCode("");

		String result = fixture.getProvinceCode();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProvinceName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetProvinceName_1()
		throws Exception {
		TProvince fixture = new TProvince();
		fixture.setProvinceName("");
		fixture.setProvinceCode("");

		String result = fixture.getProvinceName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setProvinceCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetProvinceCode_1()
		throws Exception {
		TProvince fixture = new TProvince();
		fixture.setProvinceName("");
		fixture.setProvinceCode("");
		String value = "";

		fixture.setProvinceCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setProvinceName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetProvinceName_1()
		throws Exception {
		TProvince fixture = new TProvince();
		fixture.setProvinceName("");
		fixture.setProvinceCode("");
		String value = "";

		fixture.setProvinceName(value);

		// add additional test code here
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
		TProvince fixture = new TProvince();
		fixture.setProvinceName("");
		fixture.setProvinceCode("");

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
		new org.junit.runner.JUnitCore().run(TProvinceTest.class);
	}
}