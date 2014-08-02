package nu.staldal.xtree;

import java.net.URL;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NodeTest</code> contains tests for the class <code>{@link Node}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class NodeTest {
	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetBaseURI_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = null;

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetBaseURI_2()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getColumnNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetColumnNumber_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		int result = fixture.getColumnNumber();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetInheritedAttribute_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = null;
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetInheritedAttribute_2()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getLineNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetLineNumber_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		int result = fixture.getLineNumber();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the NodeWithChildren getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		NodeWithChildren result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetPreserveSpace_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = null;

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetPreserveSpace_2()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetPreserveSpace_3()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String getPublicId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetPublicId_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		String result = fixture.getPublicId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystemId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetSystemId_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		String result = fixture.getSystemId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isWhitespaceNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIsWhitespaceNode_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");

		boolean result = fixture.isWhitespaceNode();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupNamespacePrefix_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = null;
		String URI = "";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupNamespacePrefix_2()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		String URI = "";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupNamespaceURI_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = null;
		String prefix = "";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLookupNamespaceURI_2()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		String prefix = "";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setColumn(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetColumn_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		int column = 1;

		fixture.setColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void setLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetLine_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		int line = 1;

		fixture.setLine(line);

		// add additional test code here
	}

	/**
	 * Run the void setParent(NodeWithChildren) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetParent_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		NodeWithChildren n = new Element("", "");

		fixture.setParent(n);

		// add additional test code here
	}

	/**
	 * Run the void setPublicId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetPublicId_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		String publicId = "";

		fixture.setPublicId(publicId);

		// add additional test code here
	}

	/**
	 * Run the void setSystemId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetSystemId_1()
		throws Exception {
		Text fixture = new Text("");
		fixture.parent = new Element("", "");
		String systemId = "";

		fixture.setSystemId(systemId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NodeTest.class);
	}
}