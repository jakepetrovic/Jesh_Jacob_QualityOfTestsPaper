package br.com.jnfe.base.adapter.dom;

import javax.xml.parsers.DocumentBuilderFactory;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import br.com.jnfe.base.pl006.RequestAdapterImpl;

/**
 * The class <code>AbstractNFeDOMAdapterTest</code> contains tests for the class <code>{@link AbstractNFeDOMAdapter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractNFeDOMAdapterTest {
	/**
	 * Run the Document newDocument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewDocument_1()
		throws Exception {
		AbstractNFeDOMAdapter fixture = new RequestAdapterImpl();
		String qualifiedName = "";

		Document result = fixture.newDocument(qualifiedName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Document newDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNewDocument_2()
		throws Exception {
		AbstractNFeDOMAdapter fixture = new RequestAdapterImpl();
		String namespaceURI = "";
		String qualifiedName = "";

		Document result = fixture.newDocument(namespaceURI, qualifiedName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Document newDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testNewDocument_3()
		throws Exception {
		AbstractNFeDOMAdapter fixture = new RequestAdapterImpl();
		String namespaceURI = "";
		String qualifiedName = "";

		Document result = fixture.newDocument(namespaceURI, qualifiedName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Document newDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testNewDocument_4()
		throws Exception {
		AbstractNFeDOMAdapter fixture = new RequestAdapterImpl();
		String namespaceURI = "";
		String qualifiedName = "";

		Document result = fixture.newDocument(namespaceURI, qualifiedName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDocumentBuilder(DocumentBuilderFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetDocumentBuilder_1()
		throws Exception {
		AbstractNFeDOMAdapter fixture = new RequestAdapterImpl();
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

		fixture.setDocumentBuilder(documentBuilderFactory);

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
		new org.junit.runner.JUnitCore().run(AbstractNFeDOMAdapterTest.class);
	}
}