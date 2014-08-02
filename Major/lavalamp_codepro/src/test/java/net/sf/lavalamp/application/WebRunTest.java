package net.sf.lavalamp.application;

import java.util.List;
import java.util.Vector;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.device.Device;
import net.sf.lavalamp.Pause;
import net.sf.lavalamp.site.BuildChecker;
import net.sf.lavalamp.site.Console;
import net.sf.lavalamp.LavaLogger;
import net.sf.lavalamp.device.DeviceController;
import org.junit.*;
import net.sf.lavalamp.site.UrlGetter;
import net.sf.lavalamp.device.DummyDevice;
import net.sf.lavalamp.device.DeviceProperties;
import static org.junit.Assert.*;

/**
 * The class <code>WebRunTest</code> contains tests for the class <code>{@link WebRun}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WebRunTest {
	/**
	 * Run the WebRun() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testWebRun_1()
		throws Exception {
		WebRun result = new WebRun();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void checkAllBuilds(BuildChecker,UrlGetter,DeviceController,Pause,Console,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckAllBuilds_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		DeviceController deviceController = new DeviceController(new Vector());
		Pause pause = new Pause();
		Console console = new Console();
		long runInterval = 1L;

		fixture.checkAllBuilds(checker, getter, deviceController, pause, console, runInterval);

		// add additional test code here
	}

	/**
	 * Run the void checkAllBuilds(BuildChecker,UrlGetter,DeviceController,Pause,Console,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckAllBuilds_2()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		DeviceController deviceController = new DeviceController(new Vector());
		Pause pause = new Pause();
		Console console = new Console();
		long runInterval = 1L;

		fixture.checkAllBuilds(checker, getter, deviceController, pause, console, runInterval);

		// add additional test code here
	}

	/**
	 * Run the void checkAllBuilds(BuildChecker,UrlGetter,DeviceController,Pause,Console,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckAllBuilds_3()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		DeviceController deviceController = new DeviceController(new Vector());
		Pause pause = new Pause();
		Console console = new Console();
		long runInterval = 1L;

		fixture.checkAllBuilds(checker, getter, deviceController, pause, console, runInterval);

		// add additional test code here
	}

	/**
	 * Run the void checkAllBuilds(BuildChecker,UrlGetter,DeviceController,Pause,Console,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.InterruptedException.class)
	public void testCheckAllBuilds_4()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		DeviceController deviceController = new DeviceController(new Vector());
		Pause pause = new Pause();
		Console console = new Console();
		long runInterval = 1L;

		fixture.checkAllBuilds(checker, getter, deviceController, pause, console, runInterval);

		// add additional test code here
	}

	/**
	 * Run the void checkBuild(BuildChecker,UrlGetter,Console,Device,Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckBuild_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		Console console = new Console();
		Device device = new DummyDevice();
		Build build = new Build("");

		fixture.checkBuild(checker, getter, console, device, build);

		// add additional test code here
	}

	/**
	 * Run the void checkBuild(BuildChecker,UrlGetter,Console,Device,Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckBuild_2()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		Console console = new Console();
		Device device = new DummyDevice();
		Build build = new Build("");

		fixture.checkBuild(checker, getter, console, device, build);

		// add additional test code here
	}

	/**
	 * Run the void checkBuild(BuildChecker,UrlGetter,Console,Device,Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckBuild_3()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		Console console = new Console();
		Device device = new DummyDevice();
		Build build = new Build("");

		fixture.checkBuild(checker, getter, console, device, build);

		// add additional test code here
	}

	/**
	 * Run the void checkBuild(BuildChecker,UrlGetter,Console,Device,Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckBuild_4()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		Console console = new Console();
		Device device = new DummyDevice();
		Build build = new Build("");

		fixture.checkBuild(checker, getter, console, device, build);

		// add additional test code here
	}

	/**
	 * Run the void checkBuild(BuildChecker,UrlGetter,Console,Device,Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheckBuild_5()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		BuildChecker checker = new BuildChecker();
		UrlGetter getter = new UrlGetter();
		Console console = new Console();
		Device device = new DummyDevice();
		Build build = new Build("");

		fixture.checkBuild(checker, getter, console, device, build);

		// add additional test code here
	}

	/**
	 * Run the void exec(LavaLogger,Pause) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testExec_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		LavaLogger logger = new LavaLogger();
		Pause pause = new Pause();

		fixture.exec(logger, pause);

		// add additional test code here
	}

	/**
	 * Run the void exec(LavaLogger,Pause) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testExec_2()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		LavaLogger logger = new LavaLogger();
		Pause pause = new Pause();

		fixture.exec(logger, pause);

		// add additional test code here
	}

	/**
	 * Run the void exec(LavaLogger,Pause) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testExec_3()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		LavaLogger logger = new LavaLogger();
		Pause pause = new Pause();

		fixture.exec(logger, pause);

		// add additional test code here
	}

	/**
	 * Run the void exec(LavaLogger,Pause) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.InterruptedException.class)
	public void testExec_4()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		LavaLogger logger = new LavaLogger();
		Pause pause = new Pause();

		fixture.exec(logger, pause);

		// add additional test code here
	}

	/**
	 * Run the DeviceController getDeviceController() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetDeviceController_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();

		DeviceController result = fixture.getDeviceController();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		ApplicationProperties applicationProperties = new ApplicationProperties();
		applicationProperties.setPort(1);
		applicationProperties.setRunInterval(1);
		applicationProperties.setDeviceProperties(new DeviceProperties[] {});
		fixture.properties = applicationProperties;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInit_2()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testInit_3()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		ApplicationProperties applicationProperties = new ApplicationProperties();
		applicationProperties.setPort(1);
		applicationProperties.setRunInterval(1);
		applicationProperties.setDeviceProperties(new DeviceProperties[] {});
		fixture.properties = applicationProperties;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.IllegalAccessException.class)
	public void testInit_4()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		ApplicationProperties applicationProperties = new ApplicationProperties();
		applicationProperties.setPort(1);
		applicationProperties.setRunInterval(1);
		applicationProperties.setDeviceProperties(new DeviceProperties[] {});
		fixture.properties = applicationProperties;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.InstantiationException.class)
	public void testInit_5()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		ApplicationProperties applicationProperties = new ApplicationProperties();
		applicationProperties.setPort(1);
		applicationProperties.setRunInterval(1);
		applicationProperties.setDeviceProperties(new DeviceProperties[] {});
		fixture.properties = applicationProperties;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void initDevices(DeviceProperties[],List<Device>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testInitDevices_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		DeviceProperties[] deviceProperties = new DeviceProperties[] {};
		List<Device> devices = new Vector();

		fixture.initDevices(deviceProperties, devices);

		// add additional test code here
	}

	/**
	 * Run the void initDevices(DeviceProperties[],List<Device>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testInitDevices_2()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		DeviceProperties[] deviceProperties = new DeviceProperties[] {};
		List<Device> devices = new Vector();

		fixture.initDevices(deviceProperties, devices);

		// add additional test code here
	}

	/**
	 * Run the void initDevices(DeviceProperties[],List<Device>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testInitDevices_3()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		DeviceProperties[] deviceProperties = new DeviceProperties[] {};
		List<Device> devices = new Vector();

		fixture.initDevices(deviceProperties, devices);

		// add additional test code here
	}

	/**
	 * Run the void initDevices(DeviceProperties[],List<Device>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.IllegalAccessException.class)
	public void testInitDevices_4()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		DeviceProperties[] deviceProperties = new DeviceProperties[] {};
		List<Device> devices = new Vector();

		fixture.initDevices(deviceProperties, devices);

		// add additional test code here
	}

	/**
	 * Run the void initDevices(DeviceProperties[],List<Device>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.InstantiationException.class)
	public void testInitDevices_5()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		DeviceProperties[] deviceProperties = new DeviceProperties[] {};
		List<Device> devices = new Vector();

		fixture.initDevices(deviceProperties, devices);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WebRunTest.class);
	}
}