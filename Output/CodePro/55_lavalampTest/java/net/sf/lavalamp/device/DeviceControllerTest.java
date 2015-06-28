package net.sf.lavalamp.device;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.site.MissingBuildException;
import net.sf.lavalamp.site.Builds;
import java.util.Vector;
import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import static org.junit.Assert.*;

/**
 * The class <code>DeviceControllerTest</code> contains tests for the class <code>{@link DeviceController}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DeviceControllerTest {
	/**
	 * Run the DeviceController(List<Device>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testDeviceController_1()
		throws Exception {
		List<Device> devices = new Vector();

		DeviceController result = new DeviceController(devices);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testGetBuild_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testGetBuild_2()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testGetBuild_3()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Device> getDevices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetDevices_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());

		List<Device> result = fixture.getDevices();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setLogger(LavaLogger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetLogger_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		LavaLogger logger = new LavaLogger();

		fixture.setLogger(logger);

		// add additional test code here
	}

	/**
	 * Run the void setStatusForBuild(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testSetStatusForBuild_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		String buildId = "";
		boolean successful = true;

		fixture.setStatusForBuild(buildId, successful);

		// add additional test code here
	}

	/**
	 * Run the void setStatusForBuild(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testSetStatusForBuild_2()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		String buildId = "";
		boolean successful = true;

		fixture.setStatusForBuild(buildId, successful);

		// add additional test code here
	}

	/**
	 * Run the void switchDevice(Calendar,List<String>,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSwitchDevice_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		Calendar calendar = new GregorianCalendar();
		List<String> events = new Vector();
		Device device = new DummyDevice();

		fixture.switchDevice(calendar, events, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.device.AbstractDevice.isAlwaysOff(AbstractDevice.java:87)
		//       at net.sf.lavalamp.device.DeviceController.switchDevice(DeviceController.java:73)
	}

	/**
	 * Run the void switchDevice(Calendar,List<String>,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSwitchDevice_2()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		Calendar calendar = new GregorianCalendar();
		List<String> events = new Vector();
		Device device = new DummyDevice();

		fixture.switchDevice(calendar, events, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.device.AbstractDevice.isAlwaysOff(AbstractDevice.java:87)
		//       at net.sf.lavalamp.device.DeviceController.switchDevice(DeviceController.java:73)
	}

	/**
	 * Run the List<String> switchDevices(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSwitchDevices_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		Calendar calendar = new GregorianCalendar();

		List<String> result = fixture.switchDevices(calendar);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> switchDevices(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSwitchDevices_2()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		Calendar calendar = new GregorianCalendar();

		List<String> result = fixture.switchDevices(calendar);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void turnOffOrOn(List<String>,Builds,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testTurnOffOrOn_1()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		List<String> events = new Vector();
		Builds builds = new Builds();
		Device device = new DummyDevice();

		fixture.turnOffOrOn(events, builds, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.device.DeviceController.turnOffOrOn(DeviceController.java:83)
	}

	/**
	 * Run the void turnOffOrOn(List<String>,Builds,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testTurnOffOrOn_2()
		throws Exception {
		DeviceController fixture = new DeviceController(new Vector());
		fixture.setLogger(new LavaLogger());
		List<String> events = new Vector();
		Builds builds = new Builds();
		Device device = new DummyDevice();

		fixture.turnOffOrOn(events, builds, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.device.DeviceController.turnOffOrOn(DeviceController.java:83)
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
		new org.junit.runner.JUnitCore().run(DeviceControllerTest.class);
	}
}