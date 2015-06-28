package br.com.jnfe.base;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TUFsTest</code> contains tests for the class <code>{@link TUFs}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TUFsTest {
	/**
	 * Run the List<TProvince> getProvinces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetProvinces_1()
		throws Exception {
		TUFs fixture = new TUFs();
		fixture.provinces = null;

		List<TProvince> result = fixture.getProvinces();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<TProvince> getProvinces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetProvinces_2()
		throws Exception {
		TUFs fixture = new TUFs();
		fixture.provinces = new ArrayList();

		List<TProvince> result = fixture.getProvinces();

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
		new org.junit.runner.JUnitCore().run(TUFsTest.class);
	}
}