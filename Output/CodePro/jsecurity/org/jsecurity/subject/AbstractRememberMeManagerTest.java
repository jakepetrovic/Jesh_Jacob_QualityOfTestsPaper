package org.jsecurity.subject;

import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.crypto.BlowfishCipher;
import org.jsecurity.crypto.Cipher;
import org.jsecurity.io.DefaultSerializer;
import org.jsecurity.io.SerializationException;
import org.jsecurity.io.Serializer;
import org.jsecurity.web.WebRememberMeManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractRememberMeManagerTest</code> contains tests for the class <code>{@link AbstractRememberMeManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:13 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractRememberMeManagerTest {
	/**
	 * Run the byte[] decrypt(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testDecrypt_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] encrypted = new byte[] {};

		byte[] result = fixture.decrypt(encrypted);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decrypt(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testDecrypt_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] encrypted = new byte[] {};

		byte[] result = fixture.decrypt(encrypted);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection deserialize(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testDeserialize_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] serializedIdentity = new byte[] {};

		PrincipalCollection result = fixture.deserialize(serializedIdentity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection deserialize(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = org.jsecurity.io.SerializationException.class)
	public void testDeserialize_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] serializedIdentity = new byte[] {};

		PrincipalCollection result = fixture.deserialize(serializedIdentity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] encrypt(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testEncrypt_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] serialized = new byte[] {};

		byte[] result = fixture.encrypt(serialized);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] encrypt(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testEncrypt_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] serialized = new byte[] {};

		byte[] result = fixture.encrypt(serialized);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void forgetIdentity(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testForgetIdentity_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();

		fixture.forgetIdentity(token);

		// add additional test code here
	}

	/**
	 * Run the void forgetIdentity(AuthenticationToken,AuthenticationException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testForgetIdentity_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationException ae = new AuthenticationException();

		fixture.forgetIdentity(token, ae);

		// add additional test code here
	}

	/**
	 * Run the Cipher getCipher() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetCipher_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		Cipher result = fixture.getCipher();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getCipherKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetCipherKey_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		byte[] result = fixture.getCipherKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getDecryptionCipherKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetDecryptionCipherKey_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		byte[] result = fixture.getDecryptionCipherKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getEncryptionCipherKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetEncryptionCipherKey_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		byte[] result = fixture.getEncryptionCipherKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getIdentityToRemember(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetIdentityToRemember_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationInfo info = new SimpleAccount();

		PrincipalCollection result = fixture.getIdentityToRemember(info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getRememberedPrincipals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetRememberedPrincipals_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		PrincipalCollection result = fixture.getRememberedPrincipals();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getRememberedPrincipals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetRememberedPrincipals_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		PrincipalCollection result = fixture.getRememberedPrincipals();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getRememberedPrincipals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetRememberedPrincipals_3()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		PrincipalCollection result = fixture.getRememberedPrincipals();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();

		Serializer result = fixture.getSerializer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRememberMe(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testIsRememberMe_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();

		boolean result = fixture.isRememberMe(token);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRememberMe(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testIsRememberMe_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = null;

		boolean result = fixture.isRememberMe(token);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRememberMe(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testIsRememberMe_3()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();

		boolean result = fixture.isRememberMe(token);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRememberMe(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testIsRememberMe_4()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();

		boolean result = fixture.isRememberMe(token);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void onFailedLogin(AuthenticationToken,AuthenticationException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnFailedLogin_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationException ae = new AuthenticationException();

		fixture.onFailedLogin(token, ae);

		// add additional test code here
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnLogout_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		PrincipalCollection subjectPrincipals = new SimplePrincipalCollection();

		fixture.onLogout(subjectPrincipals);

		// add additional test code here
	}

	/**
	 * Run the PrincipalCollection onRememberedPrincipalFailure(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnRememberedPrincipalFailure_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		Exception e = new Exception();

		PrincipalCollection result = fixture.onRememberedPrincipalFailure(e);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection onRememberedPrincipalFailure(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnRememberedPrincipalFailure_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		Exception e = new Exception();

		PrincipalCollection result = fixture.onRememberedPrincipalFailure(e);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onSuccessfulLogin(AuthenticationToken,AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnSuccessfulLogin_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationInfo info = new SimpleAccount();

		fixture.onSuccessfulLogin(token, info);

		// add additional test code here
	}

	/**
	 * Run the void onSuccessfulLogin(AuthenticationToken,AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnSuccessfulLogin_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationInfo info = new SimpleAccount();

		fixture.onSuccessfulLogin(token, info);

		// add additional test code here
	}

	/**
	 * Run the void onSuccessfulLogin(AuthenticationToken,AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testOnSuccessfulLogin_3()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken token = new UsernamePasswordToken();
		AuthenticationInfo info = new SimpleAccount();

		fixture.onSuccessfulLogin(token, info);

		// add additional test code here
	}

	/**
	 * Run the void rememberIdentity(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testRememberIdentity_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationInfo successfullyAuthenticated = new SimpleAccount();

		fixture.rememberIdentity(successfullyAuthenticated);

		// add additional test code here
	}

	/**
	 * Run the void rememberIdentity(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testRememberIdentity_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		PrincipalCollection accountPrincipals = new SimplePrincipalCollection();

		fixture.rememberIdentity(accountPrincipals);

		// add additional test code here
	}

	/**
	 * Run the void rememberIdentity(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testRememberIdentity_3()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		PrincipalCollection accountPrincipals = new SimplePrincipalCollection();

		fixture.rememberIdentity(accountPrincipals);

		// add additional test code here
	}

	/**
	 * Run the void rememberIdentity(AuthenticationToken,AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testRememberIdentity_4()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		AuthenticationToken submittedToken = new UsernamePasswordToken();
		AuthenticationInfo successfullyAuthenticated = new SimpleAccount();

		fixture.rememberIdentity(submittedToken, successfullyAuthenticated);

		// add additional test code here
	}

	/**
	 * Run the byte[] serialize(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSerialize_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		PrincipalCollection principals = new SimplePrincipalCollection();

		byte[] result = fixture.serialize(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] serialize(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = org.jsecurity.io.SerializationException.class)
	public void testSerialize_2()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		PrincipalCollection principals = new SimplePrincipalCollection();

		byte[] result = fixture.serialize(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCipher(Cipher) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetCipher_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		Cipher cipher = new BlowfishCipher();

		fixture.setCipher(cipher);

		// add additional test code here
	}

	/**
	 * Run the void setCipherKey(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetCipherKey_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] cipherKey = new byte[] {};

		fixture.setCipherKey(cipherKey);

		// add additional test code here
	}

	/**
	 * Run the void setCipherKeyBase64(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetCipherKeyBase64_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		String base64 = "";

		fixture.setCipherKeyBase64(base64);

		// add additional test code here
	}

	/**
	 * Run the void setCipherKeyHex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetCipherKeyHex_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		String hex = "";

		fixture.setCipherKeyHex(hex);

		// add additional test code here
	}

	/**
	 * Run the void setDecryptionCipherKey(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetDecryptionCipherKey_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] decryptionCipherKey = new byte[] {};

		fixture.setDecryptionCipherKey(decryptionCipherKey);

		// add additional test code here
	}

	/**
	 * Run the void setDecryptionCipherKeyBase64(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetDecryptionCipherKeyBase64_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		String base64 = "";

		fixture.setDecryptionCipherKeyBase64(base64);

		// add additional test code here
	}

	/**
	 * Run the void setDecryptionCipherKeyHex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetDecryptionCipherKeyHex_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		String hex = "";

		fixture.setDecryptionCipherKeyHex(hex);

		// add additional test code here
	}

	/**
	 * Run the void setEncryptionCipherKey(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetEncryptionCipherKey_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		byte[] encryptionCipherKey = new byte[] {};

		fixture.setEncryptionCipherKey(encryptionCipherKey);

		// add additional test code here
	}

	/**
	 * Run the void setEncryptionCipherKeyBase64(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetEncryptionCipherKeyBase64_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		String base64 = "";

		fixture.setEncryptionCipherKeyBase64(base64);

		// add additional test code here
	}

	/**
	 * Run the void setEncryptionCipherKeyHex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetEncryptionCipherKeyHex_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		String hex = "";

		fixture.setEncryptionCipherKeyHex(hex);

		// add additional test code here
	}

	/**
	 * Run the void setSerializer(Serializer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetSerializer_1()
		throws Exception {
		AbstractRememberMeManager fixture = new WebRememberMeManager();
		Serializer serializer = new DefaultSerializer();

		fixture.setSerializer(serializer);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
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
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractRememberMeManagerTest.class);
	}
}