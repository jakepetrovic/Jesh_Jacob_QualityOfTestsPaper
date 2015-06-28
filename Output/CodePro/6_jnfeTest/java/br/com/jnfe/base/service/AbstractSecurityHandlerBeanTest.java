package br.com.jnfe.base.service;

import java.security.KeyStore;
import javax.servlet.ServletContext;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.core.io.Resource;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.support.ServletContextResource;

/**
 * The class <code>AbstractSecurityHandlerBeanTest</code> contains tests for the class <code>{@link AbstractSecurityHandlerBean}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractSecurityHandlerBeanTest {
	/**
	 * Run the KeyStore getKeyStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetKeyStore_1()
		throws Exception {
		AbstractSecurityHandlerBean fixture = new Pkcs12SecurityHandlerBean();

		KeyStore result = fixture.getKeyStore();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Resource getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		AbstractSecurityHandlerBean fixture = new Pkcs12SecurityHandlerBean();

		Resource result = fixture.getLocation();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setKeyStore(KeyStore) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetKeyStore_1()
		throws Exception {
		AbstractSecurityHandlerBean fixture = new Pkcs12SecurityHandlerBean();
		KeyStore keyStore = KeyStore.getInstance("");

		fixture.setKeyStore(keyStore);

		// add additional test code here
	}

	/**
	 * Run the void setLocation(Resource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		AbstractSecurityHandlerBean fixture = new Pkcs12SecurityHandlerBean();
		Resource location = new ServletContextResource(new MockServletContext(), "");

		fixture.setLocation(location);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AbstractSecurityHandlerBeanTest.class);
	}
}