package br.com.jnfe.base.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.servlet.ServletContext;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.core.io.Resource;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.support.ServletContextResource;

/**
 * The class <code>SecurityUtilsTest</code> contains tests for the class <code>{@link SecurityUtils}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SecurityUtilsTest {
	/**
	 * Run the SecurityUtils() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSecurityUtils_1()
		throws Exception {
		SecurityUtils result = new SecurityUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testInstallCertificate_1()
		throws Exception {
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInstallCertificate_2()
		throws Exception {
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testInstallCertificate_3()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testInstallCertificate_4()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInstallCertificate_5()
		throws Exception {
		String trustStorePath = "";
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testInstallCertificate_6()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testInstallCertificate_7()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.KeyStoreException.class)
	public void testInstallCertificate_8()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.KeyStoreException.class)
	public void testInstallCertificate_9()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.KeyStoreException.class)
	public void testInstallCertificate_10()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.KeyStoreException.class)
	public void testInstallCertificate_11()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.cert.CertificateException.class)
	public void testInstallCertificate_12()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void installCertificate(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.cert.CertificateException.class)
	public void testInstallCertificate_13()
		throws Exception {
		String trustStorePath = null;
		String certificateLocation = "";
		String certificateName = "";

		SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		SecurityUtils.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {"", ""};

		SecurityUtils.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {"", "", null};

		SecurityUtils.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testMain_4()
		throws Exception {
		String[] args = new String[] {"", ""};

		SecurityUtils.main(args);

		// add additional test code here
	}

	/**
	 * Run the KeyStore openStore(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenStore_1()
		throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenStore_2()
		throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenStore_3()
		throws Exception {
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenStore_4()
		throws Exception {
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenStore_5()
		throws Exception {
		String keyStoreType = "";
		String storeLocation = "";
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, storeLocation, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenStore_6()
		throws Exception {
		String keyStoreType = "";
		String storeLocation = "";
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, storeLocation, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenStore_7()
		throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOpenStore_8()
		throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOpenStore_9()
		throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.KeyStoreException.class)
	public void testOpenStore_10()
		throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testOpenStore_11()
		throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openStore(String,Resource,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.cert.CertificateException.class)
	public void testOpenStore_12()
		throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = new ServletContextResource(new MockServletContext(), "");
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openTrustStore(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenTrustStore_1()
		throws Exception {
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openTrustStore(passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openTrustStore(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenTrustStore_2()
		throws Exception {
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openTrustStore(passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openTrustStore(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenTrustStore_3()
		throws Exception {
		String trustStorePath = null;
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openTrustStore(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenTrustStore_4()
		throws Exception {
		String trustStorePath = "";
		char[] passphrase = new char[] {};

		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SecurityUtilsTest.class);
	}
}