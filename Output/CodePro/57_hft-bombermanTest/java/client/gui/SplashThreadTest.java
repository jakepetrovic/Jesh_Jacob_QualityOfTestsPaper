package client.gui;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SplashThreadTest</code> contains tests for the class <code>{@link SplashThread}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SplashThreadTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SplashThread
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	private SplashThread fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public SplashThreadTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SplashThread
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public SplashThread getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SplashThread();
		}
		return fixture;
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testRun_fixture_1()
		throws Exception {
		SplashThread fixture2 = getFixture();

		fixture2.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: /images/logo.png
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		//       at common.ResourceService.getImageIcon(ResourceService.java:47)
		//       at client.gui.SplashFrame.<init>(SplashFrame.java:23)
		//       at client.gui.SplashThread.run(SplashThread.java:10)
	}

	/**
	 * Run the void setRun(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testSetRun_fixture_1()
		throws Exception {
		SplashThread fixture2 = getFixture();
		boolean run = false;

		fixture2.setRun(run);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SplashThreadTest.class);
	}
}