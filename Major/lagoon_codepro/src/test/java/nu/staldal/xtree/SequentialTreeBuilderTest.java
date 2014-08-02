package nu.staldal.xtree;

import java.io.IOException;
import java.net.URL;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;

/**
 * The class <code>SequentialTreeBuilderTest</code> contains tests for the class <code>{@link SequentialTreeBuilder}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:55 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SequentialTreeBuilderTest {
	/**
	 * Run the SequentialTreeBuilder(ElementHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSequentialTreeBuilder_1()
		throws Exception {
		ElementHandler handler = null;

		SequentialTreeBuilder result = new SequentialTreeBuilder(handler);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/SequentialTreeBuilder : Unsupported major.minor version 51.0
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
	 * Run the SequentialTreeBuilder(ElementHandler,URL) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSequentialTreeBuilder_2()
		throws Exception {
		ElementHandler handler = null;
		URL base = new URL("");

		SequentialTreeBuilder result = new SequentialTreeBuilder(handler, base);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/SequentialTreeBuilder : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testCharacters_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testCharacters_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndDocument_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndElement_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndElement_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndElement_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndElement_4()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndElement_5()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndElement_6()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_7()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_8()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testEndElement_9()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndPrefixMapping_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "a";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndPrefixMapping_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testEndPrefixMapping_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		SAXParseException e = new SAXParseException("", new Locator2Impl());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		SAXParseException e = new SAXParseException("", new Locator2Impl());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetRootElement_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testIgnorableWhitespace_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testIgnorableWhitespace_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testIgnorableWhitespace_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testParseXMLSequential_1()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testParseXMLSequential_2()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_3()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_4()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testParseXMLSequential_5()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_6()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_7()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_8()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testParseXMLSequential_9()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testParseXMLSequential_10()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXNotRecognizedException.class)
	public void testParseXMLSequential_11()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXNotRecognizedException.class)
	public void testParseXMLSequential_12()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXNotRecognizedException.class)
	public void testParseXMLSequential_13()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXNotSupportedException.class)
	public void testParseXMLSequential_14()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXNotSupportedException.class)
	public void testParseXMLSequential_15()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXNotSupportedException.class)
	public void testParseXMLSequential_16()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testProcessingInstruction_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testProcessingInstruction_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetDocumentLocator_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		Locator locator = new Locator2Impl();

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSkippedEntity_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSkippedEntity_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartDocument_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		fixture.setDocumentLocator((Locator) null);
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_4()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_5()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator((Locator) null);
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_6()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator((Locator) null);
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_7()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_8()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_9()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		fixture.setDocumentLocator((Locator) null);
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartElement_10()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		fixture.setDocumentLocator((Locator) null);
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_11()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_12()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "a";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_2()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_3()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_4()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "a";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_5()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_6()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_7()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "a";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_8()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStartPrefixMapping_9()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartPrefixMapping_10()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testWarning_1()
		throws Exception {
		SequentialTreeBuilder fixture = new SequentialTreeBuilder((ElementHandler) null, new URL(""));
		fixture.setDocumentLocator(new Locator2Impl());
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		SAXParseException e = new SAXParseException("", new Locator2Impl());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SequentialTreeBuilderTest.class);
	}
}