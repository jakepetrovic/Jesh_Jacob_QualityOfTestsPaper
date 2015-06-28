package org.databene.jdbacl.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBUniqueIndexTest</code> contains tests for the class <code>{@link DBUniqueIndex}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBUniqueIndexTest {
	/**
	 * Run the DBUniqueIndex(String,boolean,DBUniqueConstraint) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueIndex_1()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBUniqueConstraint constraint = null;

		DBUniqueIndex result = new DBUniqueIndex(name, nameDeterministic, constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBUniqueIndex.<init>(DBUniqueIndex.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueIndex(String,boolean,DBUniqueConstraint) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueIndex_2()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBUniqueConstraint constraint = null;

		DBUniqueIndex result = new DBUniqueIndex(name, nameDeterministic, constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBUniqueIndex.<init>(DBUniqueIndex.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueIndex(String,boolean,DBUniqueConstraint) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueIndex_3()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBUniqueConstraint constraint = null;

		DBUniqueIndex result = new DBUniqueIndex(name, nameDeterministic, constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBUniqueIndex.<init>(DBUniqueIndex.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueIndex(String,boolean,DBUniqueConstraint) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueIndex_4()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBUniqueConstraint constraint = null;

		DBUniqueIndex result = new DBUniqueIndex(name, nameDeterministic, constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBUniqueIndex.<init>(DBUniqueIndex.java:45)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DBUniqueIndexTest.class);
	}
}