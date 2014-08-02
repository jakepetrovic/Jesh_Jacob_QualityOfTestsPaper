package nu.staldal.xmlutil;

import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.AttributeList;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributeListImpl;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>ContentHandlerAdapterTest</code> contains tests for the class <code>{@link ContentHandlerAdapter}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ContentHandlerAdapterTest {
	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testContentHandlerAdapter_1()
		throws Exception {
		ContentHandler ch = new DefaultHandler();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xmlutil/ContentHandlerAdapter : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		char[] c = new char[] {};
		int start = 1;
		int length = 1;

		fixture.characters(c, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		char[] c = new char[] {};
		int start = 1;
		int length = 1;

		fixture.characters(c, start, length);

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDocument_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDocument_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";

		fixture.endElement(name);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";

		fixture.endElement(name);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_3()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";

		fixture.endElement(name);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_4()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";

		fixture.endElement(name);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIgnorableWhitespace_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		char[] c = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(c, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testIgnorableWhitespace_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		char[] c = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(c, start, length);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessingInstruction_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String target = "";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String target = "";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetDocumentLocator_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		Locator locator = new Locator2Impl();

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDocument_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_1()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_2()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_3()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_4()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_5()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_6()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_7()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_8()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_9()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_10()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_11()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_12()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_13()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_14()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_15()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_16()
		throws Exception {
		ContentHandlerAdapter fixture = new ContentHandlerAdapter(new DefaultHandler());
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture.startElement(name, atts);

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
		new org.junit.runner.JUnitCore().run(ContentHandlerAdapterTest.class);
	}
}