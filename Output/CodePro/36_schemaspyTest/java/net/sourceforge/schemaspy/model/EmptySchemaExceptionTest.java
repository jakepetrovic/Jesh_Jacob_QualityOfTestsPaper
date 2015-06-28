package net.sourceforge.schemaspy.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EmptySchemaExceptionTest</code> contains tests for the class <code>{@link EmptySchemaException}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:21 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class EmptySchemaExceptionTest {
	/**
	 * Run the EmptySchemaException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testEmptySchemaException_1()
		throws Exception {

		EmptySchemaException result = new EmptySchemaException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sourceforge.schemaspy.model.EmptySchemaException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmptySchemaExceptionTest.class);
	}
}