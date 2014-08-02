package br.com.jnfe.base.service;

import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * The class <code>DOMNFeSignatureHandlerTest</code> contains tests for the class <code>{@link DOMNFeSignatureHandler}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DOMNFeSignatureHandlerTest {
	/**
	 * Run the DOMNFeSignatureHandler() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testDOMNFeSignatureHandler_1()
		throws Exception {
		DOMNFeSignatureHandler result = new DOMNFeSignatureHandler();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void setSecurityHandler(SecurityHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetSecurityHandler_1()
		throws Exception {
		DOMNFeSignatureHandler fixture = new DOMNFeSignatureHandler();
		fixture.setSecurityHandler(new Pkcs12SecurityHandlerBean());
		fixture.setSignatureBuilder(new DOMNFeSignatureBuilder());
		SecurityHandler securityHandler = new Pkcs12SecurityHandlerBean();

		fixture.setSecurityHandler(securityHandler);

		// add additional test code here
	}

	/**
	 * Run the void setSignatureBuilder(SignatureBuilder<Element>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetSignatureBuilder_1()
		throws Exception {
		DOMNFeSignatureHandler fixture = new DOMNFeSignatureHandler();
		fixture.setSecurityHandler(new Pkcs12SecurityHandlerBean());
		fixture.setSignatureBuilder(new DOMNFeSignatureBuilder());
		SignatureBuilder<Element> signatureBuilder = new DOMNFeSignatureBuilder();

		fixture.setSignatureBuilder(signatureBuilder);

		// add additional test code here
	}

	/**
	 * Run the void sign(XMLStructure,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSign_1()
		throws Exception {
		DOMNFeSignatureHandler fixture = new DOMNFeSignatureHandler();
		fixture.setSecurityHandler(new Pkcs12SecurityHandlerBean());
		fixture.setSignatureBuilder(new DOMNFeSignatureBuilder());
		XMLStructure sourceStructure = new DOMStructure(new IIOMetadataNode());
		String tagNameToSign = "";

		fixture.sign(sourceStructure, tagNameToSign);

		// add additional test code here
	}

	/**
	 * Run the void sign(XMLStructure,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSign_2()
		throws Exception {
		DOMNFeSignatureHandler fixture = new DOMNFeSignatureHandler();
		fixture.setSecurityHandler(new Pkcs12SecurityHandlerBean());
		fixture.setSignatureBuilder(new DOMNFeSignatureBuilder());
		XMLStructure sourceStructure = new DOMStructure(new IIOMetadataNode());
		String tagNameToSign = "";

		fixture.sign(sourceStructure, tagNameToSign);

		// add additional test code here
	}

	/**
	 * Run the void sign(XMLStructure,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSign_3()
		throws Exception {
		DOMNFeSignatureHandler fixture = new DOMNFeSignatureHandler();
		fixture.setSecurityHandler(new Pkcs12SecurityHandlerBean());
		fixture.setSignatureBuilder(new DOMNFeSignatureBuilder());
		XMLStructure sourceStructure = new DOMStructure(new IIOMetadataNode());
		String tagNameToSign = "";

		fixture.sign(sourceStructure, tagNameToSign);

		// add additional test code here
	}

	/**
	 * Run the void sign(XMLStructure,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSign_4()
		throws Exception {
		DOMNFeSignatureHandler fixture = new DOMNFeSignatureHandler();
		fixture.setSecurityHandler(new Pkcs12SecurityHandlerBean());
		fixture.setSignatureBuilder(new DOMNFeSignatureBuilder());
		XMLStructure sourceStructure = new DOMStructure(new IIOMetadataNode());
		String tagNameToSign = "";

		fixture.sign(sourceStructure, tagNameToSign);

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
		new org.junit.runner.JUnitCore().run(DOMNFeSignatureHandlerTest.class);
	}
}