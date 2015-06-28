package geo.google.utils;

import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

/**
 * The class <code>XmlUtilsTest</code> contains tests for the class <code>{@link XmlUtils}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:06 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XmlUtilsTest {
	/**
	 * Run the XmlUtils() constructor test.
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testXmlUtils_1()
		throws Exception {
		XmlUtils result = new XmlUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the XPath newXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testNewXPath_1()
		throws Exception {

		XPath result = XmlUtils.newXPath();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getNamespaceContext());
		assertEquals(null, result.getXPathVariableResolver());
		assertEquals(null, result.getXPathFunctionResolver());
	}

	/**
	 * Run the Document parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParse_1()
		throws Exception {
		String xml = "";

		Document result = XmlUtils.parse(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Document parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParse_2()
		throws Exception {
		String xml = "0123456789";

		Document result = XmlUtils.parse(xml);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node selectNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = javax.xml.xpath.XPathExpressionException.class)
	public void testSelectNode_1()
		throws Exception {
		Node context = new IIOMetadataNode("");
		String xpath = "";

		Node result = XmlUtils.selectNode(context, xpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node selectNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = javax.xml.xpath.XPathExpressionException.class)
	public void testSelectNode_2()
		throws Exception {
		Node context = new IIOMetadataNode();
		String xpath = "0123456789";

		Node result = XmlUtils.selectNode(context, xpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node selectNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = javax.xml.xpath.XPathExpressionException.class)
	public void testSelectNode_3()
		throws Exception {
		Node context = new IIOMetadataNode();
		String xpath = "";

		Node result = XmlUtils.selectNode(context, xpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node selectNode(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = javax.xml.xpath.XPathExpressionException.class)
	public void testSelectNode_4()
		throws Exception {
		Node context = new IIOMetadataNode("");
		String xpath = "0123456789";

		Node result = XmlUtils.selectNode(context, xpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String selectValue(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSelectValue_1()
		throws Exception {
		Node context = new IIOMetadataNode();
		String xpath = "0123456789";

		String result = XmlUtils.selectValue(context, xpath);

		// add additional test code here
		assertEquals("123456789", result);
	}

	/**
	 * Run the String selectValue(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSelectValue_2()
		throws Exception {
		Node context = new IIOMetadataNode("");
		String xpath = "0123456789";

		String result = XmlUtils.selectValue(context, xpath);

		// add additional test code here
		assertEquals("123456789", result);
	}

	/**
	 * Run the String selectValue(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = javax.xml.xpath.XPathExpressionException.class)
	public void testSelectValue_3()
		throws Exception {
		Node context = new IIOMetadataNode("");
		String xpath = "";

		String result = XmlUtils.selectValue(context, xpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String selectValue(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test(expected = javax.xml.xpath.XPathExpressionException.class)
	public void testSelectValue_4()
		throws Exception {
		Node context = new IIOMetadataNode();
		String xpath = "";

		String result = XmlUtils.selectValue(context, xpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputSource stringToInputSource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testStringToInputSource_1()
		throws Exception {
		String xml = "";

		InputSource result = XmlUtils.stringToInputSource(xml);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getByteStream());
		assertEquals(null, result.getEncoding());
	}

	/**
	 * Run the InputSource stringToInputSource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testStringToInputSource_2()
		throws Exception {
		String xml = "0123456789";

		InputSource result = XmlUtils.stringToInputSource(xml);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getByteStream());
		assertEquals(null, result.getEncoding());
	}

	/**
	 * Run the void traverseTreeDepthFirst(Node,NodeProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testTraverseTreeDepthFirst_1()
		throws Exception {
		Node node = new IIOMetadataNode("");
		NodeProcessor processor = null;

		XmlUtils.traverseTreeDepthFirst(node, processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.utils.XmlUtils.traverseTreeDepthFirst(XmlUtils.java:69)
	}

	/**
	 * Run the void traverseTreeDepthFirst(Node,NodeProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testTraverseTreeDepthFirst_2()
		throws Exception {
		Node node = new IIOMetadataNode();
		NodeProcessor processor = null;

		XmlUtils.traverseTreeDepthFirst(node, processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at geo.google.utils.XmlUtils.traverseTreeDepthFirst(XmlUtils.java:69)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XmlUtilsTest.class);
	}
}