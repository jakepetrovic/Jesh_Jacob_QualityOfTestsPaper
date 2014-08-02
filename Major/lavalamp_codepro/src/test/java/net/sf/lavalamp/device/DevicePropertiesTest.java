package net.sf.lavalamp.device;

import org.junit.*;
import net.sf.lavalamp.properties.MissingPropertyException;
import net.sf.lavalamp.properties.Off;
import net.sf.lavalamp.site.BuildProperties;
import static org.junit.Assert.*;

/**
 * The class <code>DevicePropertiesTest</code> contains tests for the class <code>{@link DeviceProperties}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DevicePropertiesTest {
	/**
	 * Run the DeviceProperties() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testDeviceProperties_1()
		throws Exception {
		DeviceProperties result = new DeviceProperties();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheck_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheck_2()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.properties.MissingPropertyException.class)
	public void testCheck_3()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity((String) null);
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.properties.MissingPropertyException.class)
	public void testCheck_4()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName((String) null);
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the BuildProperties[] getBuildProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetBuildProperties_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		BuildProperties[] result = fixture.getBuildProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getClassName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetClassName_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		String result = fixture.getClassName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetIdentity_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		String result = fixture.getIdentity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Off getOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetOff_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		Off result = fixture.getOff();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OnError getOnError() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetOnError_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		OnError result = fixture.getOnError();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetPath_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		String result = fixture.getPath();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isOnWhenSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testIsOnWhenSuccessful_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

		boolean result = fixture.isOnWhenSuccessful();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isOnWhenSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testIsOnWhenSuccessful_2()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(false);
		fixture.setOff(new Off());

		boolean result = fixture.isOnWhenSuccessful();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setBuildProperties(BuildProperties[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetBuildProperties_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		BuildProperties[] buildProperties = new BuildProperties[] {};

		fixture.setBuildProperties(buildProperties);

		// add additional test code here
	}

	/**
	 * Run the void setClassName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetClassName_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		String className = "";

		fixture.setClassName(className);

		// add additional test code here
	}

	/**
	 * Run the void setIdentity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetIdentity_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		String identity = "";

		fixture.setIdentity(identity);

		// add additional test code here
	}

	/**
	 * Run the void setOff(Off) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetOff_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		Off off = new Off();

		fixture.setOff(off);

		// add additional test code here
	}

	/**
	 * Run the void setOnError(OnError) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetOnError_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		OnError onError = OnError.BLINK;

		fixture.setOnError(onError);

		// add additional test code here
	}

	/**
	 * Run the void setOnWhenSuccessful(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetOnWhenSuccessful_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		boolean onWhenSuccessful = true;

		fixture.setOnWhenSuccessful(onWhenSuccessful);

		// add additional test code here
	}

	/**
	 * Run the void setPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetPath_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());
		String path = "";

		fixture.setPath(path);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		DeviceProperties fixture = new DeviceProperties();
		fixture.setOnError(OnError.BLINK);
		fixture.setIdentity("");
		fixture.setBuildProperties(new BuildProperties[] {});
		fixture.setClassName("");
		fixture.setPath("");
		fixture.setOnWhenSuccessful(true);
		fixture.setOff(new Off());

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
		new org.junit.runner.JUnitCore().run(DevicePropertiesTest.class);
	}
}