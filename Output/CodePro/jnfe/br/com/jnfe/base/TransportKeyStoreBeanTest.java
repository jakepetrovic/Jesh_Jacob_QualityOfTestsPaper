package br.com.jnfe.base;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManagerFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TransportKeyStoreBeanTest</code> contains tests for the class <code>{@link TransportKeyStoreBean}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TransportKeyStoreBeanTest {
	/**
	 * Run the TransportKeyStoreBean() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testTransportKeyStoreBean_1()
		throws Exception {
		TransportKeyStoreBean result = new TransportKeyStoreBean();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_2()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType((String) null);
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword((String) null);
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri((String) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_3()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword((String) null);
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_4()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword((String) null);
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_5()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType((String) null);
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword((String) null);
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_6()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword((String) null);
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_7()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword((String) null);
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_8()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType((String) null);
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri((String) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_9()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri((String) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_10()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri((String) null);

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_11()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType((String) null);
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_12()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_13()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_14()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType((String) null);
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_15()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_16()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore((String) null);
		fixture.setTrustStoreType((String) null);
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword((String) null);
		fixture.setKeyStoreUri("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the KeyManagerFactory openTransportKeyManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenTransportKeyManagerFactory_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyManagerFactory result = fixture.openTransportKeyManagerFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyManagerFactory openTransportKeyManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenTransportKeyManagerFactory_2()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyManagerFactory result = fixture.openTransportKeyManagerFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyManagerFactory openTransportKeyManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.KeyStoreException.class)
	public void testOpenTransportKeyManagerFactory_3()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyManagerFactory result = fixture.openTransportKeyManagerFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyManagerFactory openTransportKeyManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testOpenTransportKeyManagerFactory_4()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyManagerFactory result = fixture.openTransportKeyManagerFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyManagerFactory openTransportKeyManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testOpenTransportKeyManagerFactory_5()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyManagerFactory result = fixture.openTransportKeyManagerFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyManagerFactory openTransportKeyManagerFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.security.UnrecoverableKeyException.class)
	public void testOpenTransportKeyManagerFactory_6()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyManagerFactory result = fixture.openTransportKeyManagerFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openTransportStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testOpenTransportStore_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyStore result = fixture.openTransportStore();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the KeyStore openTransportStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testOpenTransportStore_2()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		KeyStore result = fixture.openTransportStore();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setKeyStorePassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetKeyStorePassword_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");
		String keyStorePassword = "";

		fixture.setKeyStorePassword(keyStorePassword);

		// add additional test code here
	}

	/**
	 * Run the void setKeyStoreType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetKeyStoreType_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");
		String keyStoreType = "";

		fixture.setKeyStoreType(keyStoreType);

		// add additional test code here
	}

	/**
	 * Run the void setKeyStoreUri(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetKeyStoreUri_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");
		String keyStoreUri = "";

		fixture.setKeyStoreUri(keyStoreUri);

		// add additional test code here
	}

	/**
	 * Run the void setTrustStore(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetTrustStore_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");
		String trustStore = "";

		fixture.setTrustStore(trustStore);

		// add additional test code here
	}

	/**
	 * Run the void setTrustStorePassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetTrustStorePassword_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");
		String trustStorePassword = "";

		fixture.setTrustStorePassword(trustStorePassword);

		// add additional test code here
	}

	/**
	 * Run the void setTrustStoreType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetTrustStoreType_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");
		String trustStoreType = "";

		fixture.setTrustStoreType(trustStoreType);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TransportKeyStoreBean fixture = new TransportKeyStoreBean();
		fixture.setKeyStoreType("");
		fixture.setTrustStore("");
		fixture.setTrustStoreType("");
		fixture.setKeyStorePassword("");
		fixture.setTrustStorePassword("");
		fixture.setKeyStoreUri("");

		String result = fixture.toString();

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
		new org.junit.runner.JUnitCore().run(TransportKeyStoreBeanTest.class);
	}
}