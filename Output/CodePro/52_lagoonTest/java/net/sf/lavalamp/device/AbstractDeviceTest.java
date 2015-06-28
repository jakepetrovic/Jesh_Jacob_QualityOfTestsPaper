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
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractDeviceTest {
	/**
	 * Run the Actions getActions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetActions_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		Actions result = fixture.getActions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Builds getBuilds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetBuilds_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		Builds result = fixture.getBuilds();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAlwaysOff(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testIsAlwaysOff_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		Calendar now = new GregorianCalendar();

		boolean result = fixture.isAlwaysOff(now);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAlwaysOff(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testIsAlwaysOff_2()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		Calendar now = new GregorianCalendar();

		boolean result = fixture.isAlwaysOff(now);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setAlwaysOffPeriod(Period) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetAlwaysOffPeriod_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		Period period = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		fixture.setAlwaysOffPeriod(period);

		// add additional test code here
	}

	/**
	 * Run the void setBuilds(Builds) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetBuilds_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		Builds builds = new Builds();

		fixture.setBuilds(builds);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(DeviceProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetProperties_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		DeviceProperties properties = new DeviceProperties();
		properties.setOff(new Off());
		properties.setIdentity("");

		fixture.setProperties(properties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/lavalamp/device/DeviceProperties : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
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
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testTurnOff_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		fixture.turnOff();

		// add additional test code here
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testTurnOn_1()
		throws Exception {
		DummyDevice fixture = new DummyDevice();
		fixture.builds = new Builds();
		fixture.identity = "";
		fixture.properties = new DeviceProperties();
		fixture.logger = new LavaLogger();
		fixture.offPeriod = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));

		fixture.turnOn();

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
		new org.junit.runner.JUnitCore().run(AbstractDeviceTest.class);
	}
}