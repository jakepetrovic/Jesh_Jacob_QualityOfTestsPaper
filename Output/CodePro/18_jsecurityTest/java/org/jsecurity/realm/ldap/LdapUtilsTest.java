package org.jsecurity.realm.ldap;

import java.util.Collection;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.BasicAttribute;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LdapUtilsTest</code> contains tests for the class <code>{@link LdapUtils}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:24 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LdapUtilsTest {
	/**
	 * Run the void closeContext(LdapContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testCloseContext_1()
		throws Exception {
		LdapContext ctx = new InitialLdapContext();

		LdapUtils.closeContext(ctx);

		// add additional test code here
	}

	/**
	 * Run the void closeContext(LdapContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testCloseContext_2()
		throws Exception {
		LdapContext ctx = null;

		LdapUtils.closeContext(ctx);

		// add additional test code here
	}

	/**
	 * Run the void closeContext(LdapContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testCloseContext_3()
		throws Exception {
		LdapContext ctx = new InitialLdapContext();

		LdapUtils.closeContext(ctx);

		// add additional test code here
	}

	/**
	 * Run the void closeContext(LdapContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testCloseContext_4()
		throws Exception {
		LdapContext ctx = new InitialLdapContext();

		LdapUtils.closeContext(ctx);

		// add additional test code here
	}

	/**
	 * Run the Collection<String> getAllAttributeValues(Attribute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetAllAttributeValues_1()
		throws Exception {
		Attribute attr = new BasicAttribute("");

		Collection<String> result = LdapUtils.getAllAttributeValues(attr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<String> getAllAttributeValues(Attribute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetAllAttributeValues_2()
		throws Exception {
		Attribute attr = new BasicAttribute("");

		Collection<String> result = LdapUtils.getAllAttributeValues(attr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<String> getAllAttributeValues(Attribute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testGetAllAttributeValues_3()
		throws Exception {
		Attribute attr = new BasicAttribute("");

		Collection<String> result = LdapUtils.getAllAttributeValues(attr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<String> getAllAttributeValues(Attribute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testGetAllAttributeValues_4()
		throws Exception {
		Attribute attr = new BasicAttribute("");

		Collection<String> result = LdapUtils.getAllAttributeValues(attr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<String> getAllAttributeValues(Attribute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testGetAllAttributeValues_5()
		throws Exception {
		Attribute attr = new BasicAttribute("");

		Collection<String> result = LdapUtils.getAllAttributeValues(attr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<String> getAllAttributeValues(Attribute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testGetAllAttributeValues_6()
		throws Exception {
		Attribute attr = new BasicAttribute("");

		Collection<String> result = LdapUtils.getAllAttributeValues(attr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LdapUtilsTest.class);
	}
}