package org.jsecurity.realm;

import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.IncorrectCredentialsException;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.AllowAllCredentialsMatcher;
import org.jsecurity.authc.credential.CredentialsMatcher;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuthenticatingRealmTest</code> contains tests for the class <code>{@link AuthenticatingRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthenticatingRealmTest {
	/**
	 * Run the AuthenticationInfo getAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAuthenticationInfo_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.getAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo getAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAuthenticationInfo_2()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.getAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo getAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAuthenticationInfo_3()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.getAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo getAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testGetAuthenticationInfo_4()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.getAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo getAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testGetAuthenticationInfo_5()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.getAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo getAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.authc.IncorrectCredentialsException.class)
	public void testGetAuthenticationInfo_6()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.getAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Class getAuthenticationTokenClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAuthenticationTokenClass_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();

		Class result = fixture.getAuthenticationTokenClass();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CredentialsMatcher getCredentialsMatcher() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetCredentialsMatcher_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();

		CredentialsMatcher result = fixture.getCredentialsMatcher();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnLogout_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void setAuthenticationTokenClass(Class<? extends AuthenticationToken>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetAuthenticationTokenClass_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		Class<? extends AuthenticationToken> authenticationTokenClass = AuthenticationToken.class;

		fixture.setAuthenticationTokenClass(authenticationTokenClass);

		// add additional test code here
	}

	/**
	 * Run the void setCredentialsMatcher(CredentialsMatcher) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetCredentialsMatcher_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		CredentialsMatcher credentialsMatcher = new AllowAllCredentialsMatcher();

		fixture.setCredentialsMatcher(credentialsMatcher);

		// add additional test code here
	}

	/**
	 * Run the boolean supports(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSupports_1()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		boolean result = fixture.supports(token);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean supports(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSupports_2()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = null;

		boolean result = fixture.supports(token);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean supports(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSupports_3()
		throws Exception {
		AuthenticatingRealm fixture = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		boolean result = fixture.supports(token);

		// add additional test code here
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(AuthenticatingRealmTest.class);
	}
}