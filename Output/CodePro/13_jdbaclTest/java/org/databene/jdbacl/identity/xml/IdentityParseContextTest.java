package org.databene.jdbacl.identity.xml;

import org.databene.jdbacl.identity.IdentityProvider;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IdentityParseContextTest</code> contains tests for the class <code>{@link IdentityParseContext}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class IdentityParseContextTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityParseContext
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityParseContext fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityParseContext
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityParseContext fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityParseContext
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityParseContext getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new IdentityParseContext();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityParseContext
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityParseContext getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new IdentityParseContext(new IdentityProvider());
		}
		return fixture2;
	}

	/**
	 * Run the IdentityParseContext() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIdentityParseContext_1()
		throws Exception {

		IdentityParseContext result = new IdentityParseContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IdentityParseContext(IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIdentityParseContext_2()
		throws Exception {
		IdentityProvider identityProvider = new IdentityProvider();

		IdentityParseContext result = new IdentityParseContext(identityProvider);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IdentityProvider getIdentityProvider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentityProvider_fixture1_1()
		throws Exception {
		IdentityParseContext fixture = getFixture1();

		IdentityProvider result = fixture.getIdentityProvider();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IdentityProvider getIdentityProvider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentityProvider_fixture2_1()
		throws Exception {
		IdentityParseContext fixture = getFixture2();

		IdentityProvider result = fixture.getIdentityProvider();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(IdentityParseContextTest.class);
	}
}