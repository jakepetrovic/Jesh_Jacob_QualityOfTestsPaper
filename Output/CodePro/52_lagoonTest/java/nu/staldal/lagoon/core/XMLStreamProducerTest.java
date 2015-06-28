package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
import nu.staldal.xtree.ElementHandler;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import nu.staldal.lsp.StringHandler;
import org.apache.batik.dom.util.SAXDocumentFactory;
import nu.staldal.xmlutil.ContentHandlerAdapter;
import nu.staldal.lagoon.producer.FileSource;
import org.apache.fop.configuration.ConfigurationParser;
import org.apache.fop.fo.FOTreeBuilder;
import org.apache.fop.layout.hyphenation.HyphenationTree;
import org.apache.fop.layout.hyphenation.PatternConsumer;
import org.apache.fop.layout.hyphenation.PatternParser;
import org.apache.fop.render.pdf.FontReader;
import nu.staldal.xtree.SequentialTreeBuilder;
import nu.staldal.xtree.TreeBuilder;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.helper.AntXMLContext;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.iso_relax.verifier.Verifier;
import nu.staldal.lagoon.producer.LSSITransformer;
import nu.staldal.lagoon.producer.LSPTransformer;
import org.iso_relax.verifier.impl.ForkContentHandler;
import org.iso_relax.verifier.impl.VerifierFilterImpl;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lagoon.producer.XSLTransformer;
import org.junit.*;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lsp.servlet.ServletExtLib;
import nu.staldal.xmlutil.ContentHandlerFixer;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import nu.staldal.xmlutil.ContentHandlerSnooper;
import nu.staldal.xtree.Element;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import nu.staldal.lagoon.producer.DirSource;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>XMLStreamProducerTest</code> contains tests for the class <code>{@link XMLStreamProducer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLStreamProducerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamProducer fixture8;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new BasicSplit();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DirSource();
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new FileSource();
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new IslandSplit();
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new LSPTransformer();
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new LSSITransformer();
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new XMLParse();
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamProducer getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new XSLTransformer();
		}
		return fixture8;
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStart_fixture1_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter5 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter5, printWriter3);
		StringWriter stringWriter5 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter5);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter4, printWriter2);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "", "", File.createTempFile("", ""), File.createTempFile("", ""));

		fixture.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture2();
		ContentHandler sax = new BasicSplit();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "0123456789", "0123456789", File.createTempFile("", "", (File) null), File.createTempFile("", "", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture3();
		ContentHandler sax = new IslandSplit();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null), sitemap, "0123456789", "", File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture4();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "An��t-1.0.txt", "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"), File.createTempFile("0123456789", "0123456789"));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture5_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture5();
		ContentHandler sax = new StringHandler();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry((LagoonProcessor) null, sitemap, "An��t-1.0.txt", "0123456789", new File(""), new File(""));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture6_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture6();
		ContentHandler sax = new ServletExtLib();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture7_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture7();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture8_1()
		throws Exception {
		XMLStreamProducer fixture = getFixture8();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture1();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture2();
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture3();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture4();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture5_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture5();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture6_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture6();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture7_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture7();
		ContentHandler sax = new TreeBuilder();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture8_2()
		throws Exception {
		XMLStreamProducer fixture = getFixture8();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture1();
		ContentHandler sax = new SAXSVGDocumentFactory("");
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture2();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture3();
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture4();
		ContentHandler sax = new ConfigurationParser();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture5_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture5();
		ContentHandler sax = new FOTreeBuilder();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture6_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture6();
		ContentHandler sax = new PatternParser();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture7_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture7();
		ContentHandler sax = new PatternParser(new HyphenationTree());
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture8_3()
		throws Exception {
		XMLStreamProducer fixture = getFixture8();
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_4()
		throws Exception {
		XMLStreamProducer fixture = getFixture1();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_4()
		throws Exception {
		XMLStreamProducer fixture = getFixture2();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_4()
		throws Exception {
		XMLStreamProducer fixture = getFixture3();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_4()
		throws Exception {
		XMLStreamProducer fixture = getFixture4();
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture5_4()
		throws Exception {
		XMLStreamProducer fixture = getFixture5();
		ContentHandler sax = new DefaultHandler2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture6_4()
		throws Exception {
		XMLStreamProducer fixture = getFixture6();
		ContentHandler sax = new DefaultHandler();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XMLStreamProducerTest.class);
	}
}