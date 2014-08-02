package br.com.jnfe.base.service;

import java.security.cert.Certificate;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DOMNFeKeyInfoBuilderTest</code> contains tests for the class <code>{@link DOMNFeKeyInfoBuilder}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DOMNFeKeyInfoBuilderTest {
	/**
	 * Run the DOMNFeKeyInfoBuilder() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testDOMNFeKeyInfoBuilder_1()
		throws Exception {
		DOMNFeKeyInfoBuilder result = new DOMNFeKeyInfoBuilder();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the KeyInfo newKeyInfo(Certificate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewKeyInfo_1()
		throws Exception {
		DOMNFeKeyInfoBuilder fixture = new DOMNFeKeyInfoBuilder();
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		Certificate certificate = null;

		KeyInfo result = fixture.newKeyInfo(certificate);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setXMLSignatureFactory(XMLSignatureFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetXMLSignatureFactory_1()
		throws Exception {
		DOMNFeKeyInfoBuilder fixture = new DOMNFeKeyInfoBuilder();
		fixture.setXMLSignatureFactory(XMLSignatureFactory.getInstance());
		XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance();

		fixture.setXMLSignatureFactory(signatureFactory);

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
		new org.junit.runner.JUnitCore().run(DOMNFeKeyInfoBuilderTest.class);
	}
}