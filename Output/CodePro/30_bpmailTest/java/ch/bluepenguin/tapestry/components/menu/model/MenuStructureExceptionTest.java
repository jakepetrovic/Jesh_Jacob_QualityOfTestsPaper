package ch.bluepenguin.tapestry.components.menu.model;

import junit.framework.*;

/**
 * The class <code>MenuStructureExceptionTest</code> contains tests for the class <code>{@link MenuStructureException}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MenuStructureExceptionTest extends TestCase {
	/**
	 * Run the MenuStructureException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMenuStructureException_1()
		throws Exception {
		String message = "";

		MenuStructureException result = new MenuStructureException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("ch.bluepenguin.tapestry.components.menu.model.MenuStructureException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the MenuStructureException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMenuStructureException_2()
		throws Exception {
		String message = "0123456789";

		MenuStructureException result = new MenuStructureException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("ch.bluepenguin.tapestry.components.menu.model.MenuStructureException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}