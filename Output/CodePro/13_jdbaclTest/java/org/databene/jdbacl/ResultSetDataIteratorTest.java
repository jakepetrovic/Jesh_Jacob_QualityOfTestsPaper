package org.databene.jdbacl;

import java.sql.ResultSet;
import org.databene.webdecs.DataContainer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResultSetDataIteratorTest</code> contains tests for the class <code>{@link ResultSetDataIterator}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ResultSetDataIteratorTest {
	/**
	 * Run the ResultSetDataIterator(ResultSet) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultSetDataIterator_1()
		throws Exception {
		ResultSet resultSet = null;

		ResultSetDataIterator result = new ResultSetDataIterator(resultSet);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: resultSet is null
		//       at org.databene.jdbacl.ResultSetDataIterator.<init>(ResultSetDataIterator.java:56)
		//       at org.databene.jdbacl.ResultSetDataIterator.<init>(ResultSetDataIterator.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the ResultSetDataIterator(ResultSet,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultSetDataIterator_2()
		throws Exception {
		ResultSet resultSet = null;
		String query = "";

		ResultSetDataIterator result = new ResultSetDataIterator(resultSet, query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: resultSet is null
		//       at org.databene.jdbacl.ResultSetDataIterator.<init>(ResultSetDataIterator.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the ResultSetDataIterator(ResultSet,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultSetDataIterator_3()
		throws Exception {
		ResultSet resultSet = null;
		String query = "0123456789";

		ResultSetDataIterator result = new ResultSetDataIterator(resultSet, query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: resultSet is null
		//       at org.databene.jdbacl.ResultSetDataIterator.<init>(ResultSetDataIterator.java:56)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResultSetDataIteratorTest.class);
	}
}