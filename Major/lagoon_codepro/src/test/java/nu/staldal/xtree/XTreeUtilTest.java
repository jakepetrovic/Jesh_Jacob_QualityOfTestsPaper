package nu.staldal.xtree;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.xml.transform.TransformerFactoryConfigurationError;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * The class <code>XTreeUtilTest</code> contains tests for the class <code>{@link XTreeUtil}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XTreeUtilTest {
	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testParseXML_1()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = null;

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testParseXML_2()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testParseXML_3()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXML_4()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXML_5()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXML_6()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_7()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXML_8()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXML_9()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXML_10()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXML_11()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXML_12()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXML_13()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testParseXML_14()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean,String,InputSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testParseXML_15()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();

		Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testParseXMLSequential_1()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = null;
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testParseXMLSequential_2()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testParseXMLSequential_3()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_4()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_5()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_6()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_7()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_8()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_9()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_10()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_11()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_12()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testParseXMLSequential_13()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,String,InputSource,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testParseXMLSequential_14()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		String schemaType = "";
		InputSource schema = new InputSource();
		ElementHandler handler = null;

		Element result = XTreeUtil.parseXMLSequential(xmlInput, validateDTD, schemaType, schema, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void serialize(Node,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSerialize_1()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();

		XTreeUtil.serialize(tree, os);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testSerialize_2()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();

		XTreeUtil.serialize(tree, os);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSerialize_3()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSerialize_4()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testSerialize_5()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testSerialize_6()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testSerialize_7()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testSerialize_8()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testSerialize_9()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSerialize_10()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

		// add additional test code here
	}

	/**
	 * Run the void serialize(Node,OutputStream,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = javax.xml.transform.TransformerFactoryConfigurationError.class)
	public void testSerialize_11()
		throws Exception {
		Node tree = new Text("");
		OutputStream os = new ByteArrayOutputStream();
		Properties prop = new Properties();

		XTreeUtil.serialize(tree, os, prop);

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
		new org.junit.runner.JUnitCore().run(XTreeUtilTest.class);
	}
}