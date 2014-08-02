package nu.staldal.lagoon.producer;

import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.DefaultHandler;
import nu.staldal.lagoon.core.Target;

/**
 * The class <code>IslandSplitTest</code> contains tests for the class <code>{@link IslandSplit}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class IslandSplitTest {
	/**
	 * Run the IslandSplit() constructor test.
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIslandSplit_1()
		throws Exception {
		IslandSplit result = new IslandSplit();
		assertNotNull(result);
		// add additional test code here
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
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDocument_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

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
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndElement_3()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_4()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndElement_5()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndPrefixMapping_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testHasBeenUpdated_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testHasBeenUpdated_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testHasBeenUpdated_3()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testHasBeenUpdated_4()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
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
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testIgnorableWhitespace_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_3()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_4()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

		fixture.init();

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
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetDocumentLocator_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSkippedEntity_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_3()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStart_4()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

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
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");

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
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartElement_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_2()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_3()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_4()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_5()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_6()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_7()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_8()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_9()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_10()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_11()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_12()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_13()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test
	public void testStartElement_14()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_15()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartElement_16()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartPrefixMapping_1()
		throws Exception {
		IslandSplit fixture = new IslandSplit();
		fixture.startPrefixMapping("", "");
		fixture.startPrefixMapping("", "");
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
		new org.junit.runner.JUnitCore().run(IslandSplitTest.class);
	}
}