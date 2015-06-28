package db;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBServiceFactoryTest</code> contains tests for the class <code>{@link DBServiceFactory}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBServiceFactoryTest {
	/**
	 * Run the BombermanDBService getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		BombermanDBService result = DBServiceFactory.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:103)
		//       at logging.Logging.init(Logging.java:60)
		//       at logging.Logging.<init>(Logging.java:54)
		//       at logging.Logging.getInstance(Logging.java:76)
		//       at db.BombermanDBService.<clinit>(BombermanDBService.java:36)
		//       at db.DBServiceFactory.getInstance(DBServiceFactory.java:21)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DBServiceFactoryTest.class);
	}
}