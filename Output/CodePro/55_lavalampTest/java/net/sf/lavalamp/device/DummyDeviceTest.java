package net.sf.lavalamp.device;

import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import net.sf.lavalamp.site.Builds;
import static org.junit.Assert.*;

/**
 * The class <code>DummyDeviceTest</code> contains tests for the class <code>{@link DummyDevice}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DummyDeviceTest {
	/**
	 * Run the DummyDevice() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testDummyDevice_1()
		throws Exception {
		DummyDevice result = new DummyDevice();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.builds = new Builds();
		fixture.properties = new DeviceProperties();
		fixture.identity = "";
		fixture.logger = new LavaLogger();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.builds = new Builds();
		fixture.properties = new DeviceProperties();
		fixture.identity = "";
		fixture.logger = new LavaLogger();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("dummy device ", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DummyDeviceTest.class);
	}
}