package net.sf.lavalamp.application;

import org.junit.*;
import net.sf.lavalamp.site.Console;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultApplicationTest</code> contains tests for the class <code>{@link DefaultApplication}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DefaultApplicationTest {
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
		applicationProperties.setDebug(true);
		fixture.properties = applicationProperties;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setConsole(Console) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetConsole_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		Console console = new Console();

		fixture.setConsole(console);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(ApplicationProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetProperties_1()
		throws Exception {
		WebRun fixture = new WebRun();
		fixture.console = new Console();
		fixture.properties = new ApplicationProperties();
		ApplicationProperties properties = new ApplicationProperties();

		fixture.setProperties(properties);

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
		new org.junit.runner.JUnitCore().run(DefaultApplicationTest.class);
	}
}