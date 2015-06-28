package br.com.jnfe.base.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.TransformerFactoryConfigurationError;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.SAXException;

/**
 * The class <code>DOMNFeFileReaderTest</code> contains tests for the class <code>{@link DOMNFeFileReader}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DOMNFeFileReaderTest {
	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testLoadAndSign_1()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testLoadAndSign_2()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testLoadAndSign_3()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testLoadAndSign_4()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testLoadAndSign_5()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = javax.xml.parsers.ParserConfigurationException.class)
	public void testLoadAndSign_6()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = javax.xml.transform.TransformerFactoryConfigurationError.class)
	public void testLoadAndSign_7()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(InputStream,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testLoadAndSign_8()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		InputStream inputStream = new PipedInputStream();
		String tagToSign = "";

		Result result = fixture.loadAndSign(inputStream, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testLoadAndSign_9()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		String filePath = "";
		String tagToSign = "";

		Result result = fixture.loadAndSign(filePath, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testLoadAndSign_10()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		String filePath = "";
		String tagToSign = "";

		Result result = fixture.loadAndSign(filePath, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Result loadAndSign(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testLoadAndSign_11()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		String filePath = "";
		String tagToSign = "";

		Result result = fixture.loadAndSign(filePath, tagToSign);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDocumentBuilderFactory(DocumentBuilderFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetDocumentBuilderFactory_1()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

		fixture.setDocumentBuilderFactory(documentBuilderFactory);

		// add additional test code here
	}

	/**
	 * Run the void setSignatureHandler(SignatureHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetSignatureHandler_1()
		throws Exception {
		DOMNFeFileReader fixture = new DOMNFeFileReader();
		fixture.setSignatureHandler(new DOMNFeSignatureHandler());
		fixture.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		SignatureHandler signatureHandler = new DOMNFeSignatureHandler();

		fixture.setSignatureHandler(signatureHandler);

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
		new org.junit.runner.JUnitCore().run(DOMNFeFileReaderTest.class);
	}
}