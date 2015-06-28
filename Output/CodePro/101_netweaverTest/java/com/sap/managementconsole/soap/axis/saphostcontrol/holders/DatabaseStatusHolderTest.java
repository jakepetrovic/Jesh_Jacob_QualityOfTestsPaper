package com.sap.managementconsole.soap.axis.saphostcontrol.holders;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.saphostcontrol.DatabaseStatus;

/**
 * The class <code>DatabaseStatusHolderTest</code> contains tests for the class <code>{@link DatabaseStatusHolder}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:42 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DatabaseStatusHolderTest {
	/**
	 * Run the DatabaseStatusHolder() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testDatabaseStatusHolder_1()
		throws Exception {

		DatabaseStatusHolder result = new DatabaseStatusHolder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DatabaseStatusHolder(DatabaseStatus) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testDatabaseStatusHolder_2()
		throws Exception {
		DatabaseStatus value = DatabaseStatus.fromString("");

		DatabaseStatusHolder result = new DatabaseStatusHolder(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
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
	 * @generatedBy CodePro at 4/8/14 11:42 AM
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
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DatabaseStatusHolderTest.class);
	}
}