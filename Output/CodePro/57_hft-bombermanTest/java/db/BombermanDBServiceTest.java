package db;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BombermanDBServiceTest</code> contains tests for the class <code>{@link BombermanDBService}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BombermanDBServiceTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public BombermanDBServiceTest(String name) {
	}

	/**
	 * Run the BombermanDBService() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testBombermanDBService_1()
		throws Exception {

		BombermanDBService result = new BombermanDBService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class db.BombermanDBService
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BombermanDBServiceTest.class);
	}
}