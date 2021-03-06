package org.jsecurity.web.tags;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RoleTagTest</code> contains tests for the class <code>{@link RoleTag}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class RoleTagTest {
	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		RoleTag fixture = new HasAnyRolesTag();

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnDoStartTag_1()
		throws Exception {
		RoleTag fixture = new HasAnyRolesTag();

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnDoStartTag_2()
		throws Exception {
		RoleTag fixture = new HasAnyRolesTag();

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		RoleTag fixture = new HasAnyRolesTag();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RoleTagTest.class);
	}
}