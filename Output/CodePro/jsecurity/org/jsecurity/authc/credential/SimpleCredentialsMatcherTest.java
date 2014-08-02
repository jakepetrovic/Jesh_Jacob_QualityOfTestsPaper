package org.jsecurity.authc.credential;

import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SimpleCredentialsMatcherTest</code> contains tests for the class <code>{@link SimpleCredentialsMatcher}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SimpleCredentialsMatcherTest {
	/**
	 * Run the SimpleCredentialsMatcher() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSimpleCredentialsMatcher_1()
		throws Exception {
		SimpleCredentialsMatcher result = new SimpleCredentialsMatcher();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean doCredentialsMatch(AuthenticationToken,AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoCredentialsMatch_1()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationInfo info = new SimpleAccount();

		boolean result = fixture.doCredentialsMatch(token, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean doCredentialsMatch(AuthenticationToken,AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDoCredentialsMatch_2()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationInfo info = new SimpleAccount();

		boolean result = fixture.doCredentialsMatch(token, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		Object tokenCredentials = new Object();
		Object accountCredentials = new Object();

		boolean result = fixture.equals(tokenCredentials, accountCredentials);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		Object tokenCredentials = new Object();
		Object accountCredentials = new Object();

		boolean result = fixture.equals(tokenCredentials, accountCredentials);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		Object tokenCredentials = new Object();
		Object accountCredentials = new Object();

		boolean result = fixture.equals(tokenCredentials, accountCredentials);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		Object tokenCredentials = new Object();
		Object accountCredentials = new Object();

		boolean result = fixture.equals(tokenCredentials, accountCredentials);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		Object tokenCredentials = new Object();
		Object accountCredentials = new Object();

		boolean result = fixture.equals(tokenCredentials, accountCredentials);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Object getCredentials(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetCredentials_1()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetCredentials_2()
		throws Exception {
		SimpleCredentialsMatcher fixture = new SimpleCredentialsMatcher();
		AuthenticationToken token = new UsernamePasswordToken();

		Object result = fixture.getCredentials(token);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(SimpleCredentialsMatcherTest.class);
	}
}