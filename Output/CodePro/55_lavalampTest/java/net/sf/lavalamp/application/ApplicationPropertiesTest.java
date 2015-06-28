package net.sf.lavalamp.application;

import org.junit.*;
import net.sf.lavalamp.device.DeviceProperties;
import static org.junit.Assert.*;

/**
 * The class <code>ApplicationPropertiesTest</code> contains tests for the class <code>{@link ApplicationProperties}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ApplicationPropertiesTest {
	/**
	 * Run the ApplicationProperties() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testApplicationProperties_1()
		throws Exception {
		ApplicationProperties result = new ApplicationProperties();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testCheck_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testCheck_2()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the DeviceProperties[] getDeviceProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetDeviceProperties_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		DeviceProperties[] result = fixture.getDeviceProperties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getRunInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetRunInterval_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		int result = fixture.getRunInterval();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isDebug() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testIsDebug_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		boolean result = fixture.isDebug();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDebug() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testIsDebug_2()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(false);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		boolean result = fixture.isDebug();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setDebug(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetDebug_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);
		boolean debug = true;

		fixture.setDebug(debug);

		// add additional test code here
	}

	/**
	 * Run the void setDeviceProperties(DeviceProperties[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetDeviceProperties_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);
		DeviceProperties[] deviceProperties = new DeviceProperties[] {};

		fixture.setDeviceProperties(deviceProperties);

		// add additional test code here
	}

	/**
	 * Run the void setPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetPort_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);
		int port = 1;

		fixture.setPort(port);

		// add additional test code here
	}

	/**
	 * Run the void setRunInterval(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetRunInterval_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);
		int runInterval = 1;

		fixture.setRunInterval(runInterval);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ApplicationProperties fixture = new ApplicationProperties();
		fixture.setDeviceProperties(new DeviceProperties[] {});
		fixture.setDebug(true);
		fixture.setRunInterval(1);
		fixture.setPort(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("debug=true, port=1, runInterval=1, []", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ApplicationPropertiesTest.class);
	}
}