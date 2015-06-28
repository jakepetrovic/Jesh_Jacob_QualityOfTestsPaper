package db;

import javax.persistence.EntityManagerFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBEntityManagerFactoryTest</code> contains tests for the class <code>{@link DBEntityManagerFactory}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBEntityManagerFactoryTest {
	/**
	 * Run the void createEntityManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCreateEntityManagerFactory_1()
		throws Exception {

		DBEntityManagerFactory.createEntityManagerFactory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    javax.persistence.PersistenceException: java.lang.IllegalArgumentException: Unable to visit JAR file:/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/57_hft-bomberman/bin. Cause: Illegal character in path at index 40: file:/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/57_hft-bomberman/bin
		//       at org.hibernate.ejb.Ejb3Configuration.configure(Ejb3Configuration.java:258)
		//       at org.hibernate.ejb.HibernatePersistence.createEntityManagerFactory(HibernatePersistence.java:120)
		//       at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:51)
		//       at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:33)
		//       at db.DBEntityManagerFactory.createEntityManagerFactory(DBEntityManagerFactory.java:35)
	}

	/**
	 * Run the EntityManagerFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test(expected = db.DBException.class)
	public void testGetInstance_1()
		throws Exception {

		EntityManagerFactory result = DBEntityManagerFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DBEntityManagerFactoryTest.class);
	}
}