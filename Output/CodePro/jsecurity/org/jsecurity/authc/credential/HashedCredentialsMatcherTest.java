package org.jsecurity.authc.credential;

import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HashedCredentialsMatcherTest</code> contains tests for the class <code>{@link HashedCredentialsMatcher}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class HashedCredentialsMatcherTest {
	/**
	 * Run the Object getCredentials(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetCredentials_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		AuthenticationInfo info = new SimpleAccount();

		Object result = fixture.getCredentials(info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getCredentials(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetCredentials_2()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		AuthenticationInfo info = new SimpleAccount();

		Object result = fixture.getCredentials(info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getCredentials(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetCredentials_3()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		AuthenticationInfo info = new SimpleAccount();

		Object result = fixture.getCredentials(info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getCredentials(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetCredentials_4()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		AuthenticationToken token = new UsernamePasswordToken();

		Object result = fixture.getCredentials(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getCredentials(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetCredentials_5()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		AuthenticationToken token = new UsernamePasswordToken();

		Object result = fixture.getCredentials(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getHashIterations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetHashIterations_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();

		int result = fixture.getHashIterations();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Object getSalt(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetSalt_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		AuthenticationToken token = new UsernamePasswordToken();

		Object result = fixture.getSalt(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isHashSalted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsHashSalted_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();

		boolean result = fixture.isHashSalted();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHashSalted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsHashSalted_2()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();

		boolean result = fixture.isHashSalted();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isStoredCredentialsHexEncoded() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsStoredCredentialsHexEncoded_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();

		boolean result = fixture.isStoredCredentialsHexEncoded();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isStoredCredentialsHexEncoded() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsStoredCredentialsHexEncoded_2()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();

		boolean result = fixture.isStoredCredentialsHexEncoded();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setHashIterations(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetHashIterations_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		int hashIterations = 1;

		fixture.setHashIterations(hashIterations);

		// add additional test code here
	}

	/**
	 * Run the void setHashIterations(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetHashIterations_2()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		int hashIterations = 0;

		fixture.setHashIterations(hashIterations);

		// add additional test code here
	}

	/**
	 * Run the void setHashSalted(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetHashSalted_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		boolean hashSalted = true;

		fixture.setHashSalted(hashSalted);

		// add additional test code here
	}

	/**
	 * Run the void setStoredCredentialsHexEncoded(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetStoredCredentialsHexEncoded_1()
		throws Exception {
		HashedCredentialsMatcher fixture = new Md2CredentialsMatcher();
		boolean storedCredentialsHexEncoded = true;

		fixture.setStoredCredentialsHexEncoded(storedCredentialsHexEncoded);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(HashedCredentialsMatcherTest.class);
	}
}