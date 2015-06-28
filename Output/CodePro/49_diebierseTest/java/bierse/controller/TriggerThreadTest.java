package bierse.controller;

import org.junit.*;
import bierse.model.Model;
import static org.junit.Assert.*;

/**
 * The class <code>TriggerThreadTest</code> contains tests for the class <code>{@link TriggerThread}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TriggerThreadTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TriggerThread
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	private TriggerThread fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TriggerThread
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public TriggerThread getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new TriggerThread("0123456789", (Model) null);
		}
		return fixture;
	}

	/**
	 * Run the TriggerThread(String,Model) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testTriggerThread_1()
		throws Exception {
		String name = "";
		Model model = new Model();

		TriggerThread result = new TriggerThread(name, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the TriggerThread(String,Model) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testTriggerThread_2()
		throws Exception {
		String name = "0123456789";
		Model model = new Model();

		TriggerThread result = new TriggerThread(name, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testRun_fixture_1()
		throws Exception {
		TriggerThread fixture2 = getFixture();

		fixture2.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.controller.TriggerThread.run(TriggerThread.java:28)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
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
	 * @generatedBy CodePro at 5/31/15 5:22 PM
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
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TriggerThreadTest.class);
	}
}