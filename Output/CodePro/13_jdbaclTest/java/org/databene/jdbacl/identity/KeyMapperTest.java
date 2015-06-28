package org.databene.jdbacl.identity;

import java.sql.Connection;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.identity.mem.MemKeyMapper;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDatabase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>KeyMapperTest</code> contains tests for the class <code>{@link KeyMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class KeyMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see KeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private KeyMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see KeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private KeyMapper fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see KeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public KeyMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see KeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public KeyMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
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
		KeyMapper fixture = getFixture1();

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
		KeyMapper fixture = getFixture2();

		IdentityProvider result = fixture.getIdentityProvider();

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(KeyMapperTest.class);
	}
}