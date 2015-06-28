package org.jsecurity.crypto;

import java.security.Key;
import javax.security.auth.kerberos.KerberosKey;
import javax.security.auth.kerberos.KerberosPrincipal;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BlowfishCipherTest</code> contains tests for the class <code>{@link BlowfishCipher}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:13 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BlowfishCipherTest {
	/**
	 * Run the BlowfishCipher() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testBlowfishCipher_1()
		throws Exception {

		BlowfishCipher result = new BlowfishCipher();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/crypto/BlowfishCipher : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the byte[] crypt(Cipher,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testCrypt_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("");
		byte[] bytes = new byte[] {};

		byte[] result = fixture.crypt(cipher, bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] crypt(byte[],int,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testCrypt_2()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] bytes = new byte[] {};
		int mode = 1;
		byte[] key = new byte[] {};

		byte[] result = fixture.crypt(bytes, mode, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] crypt(byte[],int,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testCrypt_3()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] bytes = new byte[] {};
		int mode = 1;
		byte[] key = new byte[] {};

		byte[] result = fixture.crypt(bytes, mode, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] crypt(byte[],int,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCrypt_4()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] bytes = new byte[] {};
		int mode = 1;
		byte[] key = new byte[] {};

		byte[] result = fixture.crypt(bytes, mode, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decrypt(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testDecrypt_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] encrypted = new byte[] {};
		byte[] key = new byte[] {};

		byte[] result = fixture.decrypt(encrypted, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decrypt(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testDecrypt_2()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] encrypted = new byte[] {};
		byte[] key = new byte[] {};

		byte[] result = fixture.decrypt(encrypted, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decrypt(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testDecrypt_3()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] encrypted = new byte[] {};
		byte[] key = new byte[] {};

		byte[] result = fixture.decrypt(encrypted, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] encrypt(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testEncrypt_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] raw = new byte[] {};
		byte[] key = new byte[] {};

		byte[] result = fixture.encrypt(raw, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] encrypt(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testEncrypt_2()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] raw = new byte[] {};
		byte[] key = new byte[] {};

		byte[] result = fixture.encrypt(raw, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] encrypt(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testEncrypt_3()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		byte[] raw = new byte[] {};
		byte[] key = new byte[] {};

		byte[] result = fixture.encrypt(raw, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Key generateNewKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGenerateNewKey_1()
		throws Exception {

		Key result = BlowfishCipher.generateNewKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Key generateNewKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGenerateNewKey_2()
		throws Exception {
		int keyBitSize = 1;

		Key result = BlowfishCipher.generateNewKey(keyBitSize);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Key generateNewKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGenerateNewKey_3()
		throws Exception {
		int keyBitSize = 1;

		Key result = BlowfishCipher.generateNewKey(keyBitSize);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Key getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));

		Key result = fixture.getKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init(Cipher,int,Key) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("");
		int mode = 1;
		Key key = new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1);

		fixture.init(cipher, mode, key);

		// add additional test code here
	}

	/**
	 * Run the void init(Cipher,int,Key) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testInit_2()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("");
		int mode = 1;
		Key key = new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1);

		fixture.init(cipher, mode, key);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] unused = new String[] {};

		BlowfishCipher.main(unused);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] unused = new String[] {};

		BlowfishCipher.main(unused);

		// add additional test code here
	}

	/**
	 * Run the javax.crypto.Cipher newCipherInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testNewCipherInstance_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));

		javax.crypto.Cipher result = fixture.newCipherInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setKey(Key) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:13 PM
	 */
	@Test
	public void testSetKey_1()
		throws Exception {
		BlowfishCipher fixture = new BlowfishCipher();
		fixture.setKey(new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1));
		Key key = new KerberosKey(new KerberosPrincipal(""), new byte[] {}, 1, 1);

		fixture.setKey(key);

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
		new org.junit.runner.JUnitCore().run(BlowfishCipherTest.class);
	}
}