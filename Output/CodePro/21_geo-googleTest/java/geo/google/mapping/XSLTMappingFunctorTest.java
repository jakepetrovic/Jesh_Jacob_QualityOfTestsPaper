package geo.google.mapping;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.util.JAXBSource;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.EventReaderDelegate;
import javax.xml.stream.util.StreamReaderDelegate;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamSource;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLReaderAdapter;

/**
 * The class <code>XSLTMappingFunctorTest</code> contains tests for the class <code>{@link XSLTMappingFunctor}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XSLTMappingFunctorTest {
	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_1()
		throws Exception {
		Source xsltSource = new JAXBSource((JAXBContext) null, new Object());

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    javax.xml.bind.JAXBException: JAXBContext can not be null
		//       at javax.xml.bind.util.JAXBSource.assertionFailed(JAXBSource.java:269)
		//       at javax.xml.bind.util.JAXBSource.<init>(JAXBSource.java:109)
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_2()
		throws Exception {
		Source xsltSource = new JAXBSource((JAXBContext) null, (Object) null);

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    javax.xml.bind.JAXBException: JAXBContext can not be null
		//       at javax.xml.bind.util.JAXBSource.assertionFailed(JAXBSource.java:269)
		//       at javax.xml.bind.util.JAXBSource.<init>(JAXBSource.java:109)
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_3()
		throws Exception {
		Source xsltSource = new DOMSource();

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_4()
		throws Exception {
		Source xsltSource = new DOMSource(new IIOMetadataNode(""));

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_5()
		throws Exception {
		Source xsltSource = new DOMSource(new IIOMetadataNode(""), "");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_6()
		throws Exception {
		Source xsltSource = new DOMSource(new IIOMetadataNode(), "0123456789");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_7()
		throws Exception {
		Source xsltSource = new SAXSource();

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_8()
		throws Exception {
		Source xsltSource = new SAXSource(new InputSource(""));

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_9()
		throws Exception {
		Source xsltSource = new SAXSource(new ParserAdapter(), new InputSource(""));

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.xml.sax.SAXException: System property org.xml.sax.parser not specified
		//       at org.xml.sax.helpers.ParserAdapter.<init>(ParserAdapter.java:130)
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_10()
		throws Exception {
		Source xsltSource = new SAXSource(new ParserAdapter(new XMLReaderAdapter()), new InputSource());

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_11()
		throws Exception {
		Source xsltSource = new StAXSource(new EventReaderDelegate());

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.xml.stream.util.EventReaderDelegate.peek(EventReaderDelegate.java:104)
		//       at javax.xml.transform.stax.StAXSource.<init>(StAXSource.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_12()
		throws Exception {
		Source xsltSource = new StAXSource(new StreamReaderDelegate());

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.xml.stream.util.StreamReaderDelegate.getEventType(StreamReaderDelegate.java:197)
		//       at javax.xml.transform.stax.StAXSource.<init>(StAXSource.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_13()
		throws Exception {
		Source xsltSource = new StreamSource("");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_14()
		throws Exception {
		Source xsltSource = new StreamSource();

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_15()
		throws Exception {
		Source xsltSource = new StreamSource(File.createTempFile("", ""));

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_16()
		throws Exception {
		Source xsltSource = new StreamSource(new ByteArrayInputStream("".getBytes()));

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_17()
		throws Exception {
		Source xsltSource = new StreamSource(new ByteArrayInputStream("".getBytes()), "");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_18()
		throws Exception {
		Source xsltSource = new StreamSource(new ByteArrayInputStream("012345678901234567890".getBytes()), "0123456789");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_19()
		throws Exception {
		Source xsltSource = new StreamSource(new StringReader(""));

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_20()
		throws Exception {
		Source xsltSource = new StreamSource(new StringReader(""), "");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XSLTMappingFunctor(Source) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testXSLTMappingFunctor_21()
		throws Exception {
		Source xsltSource = new StreamSource(new StringReader("012345678901234567890"), "0123456789");

		XSLTMappingFunctor result = new XSLTMappingFunctor(xsltSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XSLTMappingFunctorTest.class);
	}
}