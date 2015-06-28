package net.sf.lavalamp.device;

import java.util.Calendar;
import net.sf.lavalamp.site.Builds;
import net.sf.lavalamp.properties.Off;
import java.util.GregorianCalendar;
import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractDeviceTest</code> contains tests for the class <code>{@link AbstractDevice}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AbstractDeviceTest {
	/**
	 * Run the Actions getActions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetActions_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();

		Actions result = fixture.getActions();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Builds getBuilds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetBuilds_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();

		Builds result = fixture.getBuilds();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.allSuccessful());
	}

	/**
	 * Run the boolean isAlwaysOff(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsAlwaysOff_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();
		Calendar now = new GregorianCalendar();

		boolean result = fixture.isAlwaysOff(now);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAlwaysOff(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsAlwaysOff_2()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();
		Calendar now = new GregorianCalendar();

		boolean result = fixture.isAlwaysOff(now);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAlwaysOffPeriod(Period) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetAlwaysOffPeriod_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();
		Period period = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		fixture.setAlwaysOffPeriod(period);

		// add additional test code here
	}

	/**
	 * Run the void setBuilds(Builds) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetBuilds_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();
		Builds builds = new Builds();

		fixture.setBuilds(builds);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(DeviceProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetProperties_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();
		DeviceProperties properties = new DeviceProperties();
		properties.setOff(new Off());
		properties.setIdentity("");

		fixture.setProperties(properties);

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
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("dummy device ", result);
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testTurnOff_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();

		fixture.turnOff();

		// add additional test code here
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testTurnOn_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		fixture.identity = "";
		fixture.builds = new Builds();
		fixture.logger = new LavaLogger();
		fixture.properties = new DeviceProperties();

		fixture.turnOn();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AbstractDeviceTest.class);
	}
}