package br.com.jnfe.base.service;

import javax.xml.crypto.dsig.XMLSignatureFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DOMNFeSigantureFactoryBeanTest</code> contains tests for the class <code>{@link DOMNFeSigantureFactoryBean}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DOMNFeSigantureFactoryBeanTest {
	/**
	 * Run the DOMNFeSigantureFactoryBean() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testDOMNFeSigantureFactoryBean_1()
		throws Exception {
		DOMNFeSigantureFactoryBean result = new DOMNFeSigantureFactoryBean();
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
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

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
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

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
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

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
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the XMLSignatureFactory getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetObject_1()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		XMLSignatureFactory result = fixture.getObject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLSignatureFactory getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.ClassNotFoundException.class)
	public void testGetObject_2()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		XMLSignatureFactory result = fixture.getObject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLSignatureFactory getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalAccessException.class)
	public void testGetObject_3()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		XMLSignatureFactory result = fixture.getObject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLSignatureFactory getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.InstantiationException.class)
	public void testGetObject_4()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		XMLSignatureFactory result = fixture.getObject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProviderClassName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetProviderClassName_1()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		String result = fixture.getProviderClassName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProviderName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetProviderName_1()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		String result = fixture.getProviderName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isSingleton() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testIsSingleton_1()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");

		boolean result = fixture.isSingleton();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setProviderClassName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetProviderClassName_1()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");
		String providerClassName = "";

		fixture.setProviderClassName(providerClassName);

		// add additional test code here
	}

	/**
	 * Run the void setProviderName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetProviderName_1()
		throws Exception {
		DOMNFeSigantureFactoryBean fixture = new DOMNFeSigantureFactoryBean();
		fixture.setProviderName("");
		fixture.setProviderClassName("");
		String providerName = "";

		fixture.setProviderName(providerName);

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
		new org.junit.runner.JUnitCore().run(DOMNFeSigantureFactoryBeanTest.class);
	}
}