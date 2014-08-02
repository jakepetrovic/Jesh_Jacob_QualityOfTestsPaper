package nu.staldal.lagoon.producer;

import java.util.HashSet;
import java.util.Set;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;
import nu.staldal.lagoon.core.SourceManager;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>LSSIHandlerTest</code> contains tests for the class <code>{@link LSSIHandler}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LSSIHandlerTest {
	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLSSIHandler_1()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new DefaultHandler();
		Target target = null;
		Set includedFiles = new HashSet();

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/lagoon/producer/LSSIHandler : Unsupported major.minor version 51.0
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
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDocument_1()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_1()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_3()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndPrefixMapping_1()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndPrefixMapping_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String prefix = "";

		fixture.endPrefixMapping(prefix);

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
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testIgnorableWhitespace_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

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
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		Locator locator = new Locator2Impl();

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSkippedEntity_1()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String name = "";

		fixture.skippedEntity(name);

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
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_1()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "root";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "lastmod";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_3()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "lastmod";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_4()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "lastmod";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_5()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "date";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_6()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "date";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_7()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "date";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_8()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "date";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_9()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "include";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_10()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "include";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_11()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "date";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_12()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "lastmod";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_13()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testStartElement_14()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "include";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testStartElement_15()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
		String localName = "lastmod";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testStartElement_16()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String namespaceURI = "http://staldal.nu/Lagoon/LSSI";
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartPrefixMapping_1()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartPrefixMapping_2()
		throws Exception {
		LSSIHandler fixture = new LSSIHandler((SourceManager) null, new DefaultHandler(), (Target) null, new HashSet());
		fixture.setDocumentLocator(new Locator2Impl());
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

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
		new org.junit.runner.JUnitCore().run(LSSIHandlerTest.class);
	}
}