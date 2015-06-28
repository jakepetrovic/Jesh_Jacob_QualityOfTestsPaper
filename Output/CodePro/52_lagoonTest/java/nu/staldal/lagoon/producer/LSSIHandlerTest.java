package nu.staldal.lagoon.producer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.HashSet;
import nu.staldal.xtree.ElementHandler;
import java.util.Set;
import nu.staldal.xmlutil.ContentHandlerAdapter;
import nu.staldal.lagoon.core.SourceManager;
import nu.staldal.lagoon.core.Target;
import java.util.TreeSet;
import org.apache.batik.dom.GenericDOMImplementation;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.dom.util.SAXDocumentFactory;
import org.apache.fop.configuration.ConfigurationParser;
import org.apache.fop.fo.FOTreeBuilder;
import org.apache.fop.layout.hyphenation.HyphenationTree;
import nu.staldal.lsp.StringHandler;
import nu.staldal.xmlutil.ContentHandlerSnooper;
import org.apache.fop.layout.hyphenation.PatternConsumer;
import org.apache.fop.layout.hyphenation.PatternParser;
import org.apache.fop.render.pdf.FontReader;
import nu.staldal.xtree.SequentialTreeBuilder;
import org.apache.tools.ant.Project;
import nu.staldal.lsp.servlet.ServletExtLib;
import nu.staldal.xmlutil.ContentHandlerFixer;
import nu.staldal.xmltree.TreeBuilder;
import org.apache.tools.ant.helper.AntXMLContext;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.iso_relax.verifier.Verifier;
import org.iso_relax.verifier.impl.ForkContentHandler;
import org.iso_relax.verifier.impl.VerifierFilterImpl;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * The class <code>LSSIHandlerTest</code> contains tests for the class <code>{@link LSSIHandler}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LSSIHandlerTest {
	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_1()
		throws Exception {
		SourceManager sourceMan = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		Target target = null;
		Set includedFiles = new HashSet();

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_2()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new IslandSplit();
		Target target = null;
		Set includedFiles = new TreeSet();

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_3()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new StringHandler();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_4()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new ServletExtLib();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_5()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new TreeBuilder();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_6()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_7()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_8()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_9()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_10()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_11()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_12()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_13()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new nu.staldal.xtree.TreeBuilder();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_14()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new nu.staldal.xtree.TreeBuilder(new URL("http://www.eclipse.org"));
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_15()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new SAXSVGDocumentFactory("");
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_16()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_17()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchFieldError: parser
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.registerCustomCSSValueFactory(Unknown Source)
		//       at org.apache.batik.extension.svg.BatikDomExtension.registerTags(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<init>(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<clinit>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_18()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new ConfigurationParser();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_19()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new FOTreeBuilder();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_20()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new PatternParser();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_21()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new PatternParser(new HyphenationTree());
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_22()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_23()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_24()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_25()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_26()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_27()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new DefaultHandler2();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_28()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new DefaultHandler();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_29()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new XMLFilterImpl();
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LSSIHandler(SourceManager,ContentHandler,Target,Set) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLSSIHandler_30()
		throws Exception {
		SourceManager sourceMan = null;
		ContentHandler sax = new XMLFilterImpl((XMLReader) null);
		Target target = null;
		Set includedFiles = null;

		LSSIHandler result = new LSSIHandler(sourceMan, sax, target, includedFiles);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(LSSIHandlerTest.class);
	}
}