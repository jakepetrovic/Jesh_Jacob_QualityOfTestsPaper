package org.databene.jdbacl.identity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IdentityProviderTest</code> contains tests for the class <code>{@link IdentityProvider}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class IdentityProviderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityProvider
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityProvider fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityProvider
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityProvider getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new IdentityProvider();
		}
		return fixture;
	}

	/**
	 * Run the IdentityModel getIdentity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentity_fixture_1()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		String tableName = "";

		IdentityModel result = fixture2.getIdentity(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel getIdentity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentity_fixture_2()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		String tableName = "0123456789";

		IdentityModel result = fixture2.getIdentity(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table '0123456789'
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel getIdentity(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentity_fixture_3()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		String tableName = "";
		boolean required = false;

		IdentityModel result = fixture2.getIdentity(tableName, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IdentityModel getIdentity(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentity_fixture_4()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		String tableName = "0123456789";
		boolean required = true;

		IdentityModel result = fixture2.getIdentity(tableName, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table '0123456789'
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel getIdentity(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentity_fixture_5()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		String tableName = "0123456789";
		boolean required = false;

		IdentityModel result = fixture2.getIdentity(tableName, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IdentityModel getIdentity(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIdentity_fixture_6()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		String tableName = "";
		boolean required = true;

		IdentityModel result = fixture2.getIdentity(tableName, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_1()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NaturalPkIdentity("");
		String tableName = "";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_2()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String tableName = "0123456789";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_3()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String tableName = "0123456789";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_4()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NoIdentity("");
		String tableName = "0123456789";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_5()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String tableName = "";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_6()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String tableName = "";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_7()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NoIdentity("");
		String tableName = "";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
	}

	/**
	 * Run the void registerIdentity(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterIdentity_fixture_8()
		throws Exception {
		IdentityProvider fixture2 = getFixture();
		IdentityModel identity = new NaturalPkIdentity("");
		String tableName = "0123456789";

		fixture2.registerIdentity(identity, tableName);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(IdentityProviderTest.class);
	}
}