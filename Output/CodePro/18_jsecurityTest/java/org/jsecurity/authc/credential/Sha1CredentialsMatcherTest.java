package org.jsecurity.authc.credential;

import org.jsecurity.crypto.hash.AbstractHash;
import org.jsecurity.crypto.hash.Hash;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>Sha1CredentialsMatcherTest</code> contains tests for the class <code>{@link Sha1CredentialsMatcher}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class Sha1CredentialsMatcherTest {
	/**
	 * Run the Hash hashProvidedCredentials(Object,Object,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testHashProvidedCredentials_1()
		throws Exception {
		Sha1CredentialsMatcher fixture = new Sha1CredentialsMatcher();
		Object credentials = new Object();
		Object salt = new Object();
		int hashIterations = 1;

		Hash result = fixture.hashProvidedCredentials(credentials, salt, hashIterations);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AbstractHash newHashInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testNewHashInstance_1()
		throws Exception {
		Sha1CredentialsMatcher fixture = new Sha1CredentialsMatcher();

		AbstractHash result = fixture.newHashInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(Sha1CredentialsMatcherTest.class);
	}
}