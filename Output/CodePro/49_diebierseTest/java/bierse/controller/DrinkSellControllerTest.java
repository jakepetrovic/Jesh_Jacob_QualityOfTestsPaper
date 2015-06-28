package bierse.controller;

import java.awt.event.KeyEvent;
import bierse.model.Model;
import org.junit.*;
import bierse.view.IDrinkSellView;
import bierse.view.DefaultDrinkSellView;
import static org.junit.Assert.*;

/**
 * The class <code>DrinkSellControllerTest</code> contains tests for the class <code>{@link DrinkSellController}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DrinkSellControllerTest {
	/**
	 * Run the DrinkSellController(Model,IDrinkSellView) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDrinkSellController_1()
		throws Exception {
		Model m = new Model();
		IDrinkSellView v = new DefaultDrinkSellView("", new Model());

		DrinkSellController result = new DrinkSellController(m, v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the DrinkSellController(Model,IDrinkSellView) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDrinkSellController_2()
		throws Exception {
		Model m = new Model();
		IDrinkSellView v = new DefaultDrinkSellView("0123456789", (Model) null);

		DrinkSellController result = new DrinkSellController(m, v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DrinkSellControllerTest.class);
	}
}