package bierse.model;

import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import bierse.view.IModelChangedListener;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ModelTest</code> contains tests for the class <code>{@link Model}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ModelTest {
	/**
	 * Run the Model() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testModel_1()
		throws Exception {

		Model result = new Model();

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
		new org.junit.runner.JUnitCore().run(ModelTest.class);
	}
}