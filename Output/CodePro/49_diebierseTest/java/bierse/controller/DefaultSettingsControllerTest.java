package bierse.controller;

import java.awt.event.ActionEvent;
import bierse.view.DefaultSettingsView;
import bierse.model.Model;
import org.junit.*;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultSettingsControllerTest</code> contains tests for the class <code>{@link DefaultSettingsController}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultSettingsControllerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultSettingsController
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	private DefaultSettingsController fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultSettingsController
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public DefaultSettingsController getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
		}
		return fixture;
	}

	/**
	 * Run the DefaultSettingsController(Model,ISettingsView,IDrinkSettingsView) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDefaultSettingsController_1()
		throws Exception {
		Model model = new Model();
		ISettingsView view = new DefaultSettingsView(new Model());
		IDrinkSettingsView drinkSettingsView = new DefaultSettingsView(new Model());

		DefaultSettingsController result = new DefaultSettingsController(model, view, drinkSettingsView);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_1()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), 0, "");

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_2()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), 0, "", -1L, 0);

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_3()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), 0, "", 0);

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_4()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), 7, "An��t-1.0.txt");

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_5()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), 7, "An��t-1.0.txt", 1L, 7);

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_6()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), 7, "An��t-1.0.txt", 7);

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_7()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent(new Object(), Integer.MIN_VALUE, "", Long.MIN_VALUE, Integer.MAX_VALUE);

		fixture2.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_8()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent((Object) null, -1, (String) null, -1);

		fixture2.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:225)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:188)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_9()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent((Object) null, -1, (String) null, Long.MAX_VALUE, -1);

		fixture2.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:225)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_10()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent((Object) null, 1, "0123456789");

		fixture2.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:225)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:188)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:159)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_11()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent((Object) null, 1, "0123456789", 0L, 1);

		fixture2.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:225)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testActionPerformed_fixture_12()
		throws Exception {
		DefaultSettingsController fixture2 = getFixture();
		ActionEvent e = new ActionEvent((Object) null, 1, "0123456789", 1);

		fixture2.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:225)
		//       at java.awt.event.ActionEvent.<init>(ActionEvent.java:188)
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
		new org.junit.runner.JUnitCore().run(DefaultSettingsControllerTest.class);
	}
}