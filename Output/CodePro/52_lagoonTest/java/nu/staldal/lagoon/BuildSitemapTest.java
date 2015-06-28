package nu.staldal.lagoon;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import org.apache.batik.dom.GenericDOMImplementation;
import nu.staldal.xtree.ElementHandler;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import nu.staldal.xmlutil.ContentHandlerAdapter;
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
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lsp.servlet.ServletExtLib;
import nu.staldal.xmlutil.ContentHandlerFixer;
import nu.staldal.xmltree.TreeBuilder;
import org.apache.tools.ant.helper.AntXMLContext;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.iso_relax.verifier.Verifier;
import org.iso_relax.verifier.impl.ForkContentHandler;
import org.iso_relax.verifier.impl.VerifierFilterImpl;
import nu.staldal.lagoon.producer.BasicSplit;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>BuildSitemapTest</code> contains tests for the class <code>{@link BuildSitemap}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:37 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BuildSitemapTest {
	/**
	 * Run the BuildSitemap() constructor test.
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testBuildSitemap_1()
		throws Exception {
		BuildSitemap result = new BuildSitemap();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {""};

		BuildSitemap.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.SecurityException.class)
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {"0123456789", "0123456789"};

		BuildSitemap.main(args);

		// add additional test code here
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_1()
		throws Exception {
		File dir = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_2()
		throws Exception {
		File dir = null;
		ContentHandler ch = new BasicSplit();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_3()
		throws Exception {
		File dir = null;
		ContentHandler ch = new IslandSplit();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_4()
		throws Exception {
		File dir = null;
		ContentHandler ch = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_5()
		throws Exception {
		File dir = null;
		ContentHandler ch = new StringHandler();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_6()
		throws Exception {
		File dir = null;
		ContentHandler ch = new ServletExtLib();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_7()
		throws Exception {
		File dir = null;
		ContentHandler ch = new TreeBuilder();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_8()
		throws Exception {
		File dir = null;
		ContentHandler ch = new TreeBuilder(new URL("http://www.eclipse.org"));

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_9()
		throws Exception {
		File dir = null;
		ContentHandler ch = new ContentHandlerFixer((ContentHandler) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_10()
		throws Exception {
		File dir = null;
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_11()
		throws Exception {
		File dir = null;
		ContentHandler ch = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_12()
		throws Exception {
		File dir = null;
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_13()
		throws Exception {
		File dir = null;
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_14()
		throws Exception {
		File dir = null;
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_15()
		throws Exception {
		File dir = null;
		ContentHandler ch = new nu.staldal.xtree.TreeBuilder();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_16()
		throws Exception {
		File dir = null;
		ContentHandler ch = new nu.staldal.xtree.TreeBuilder(new URL("http://www.eclipse.org"));

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_17()
		throws Exception {
		File dir = null;
		ContentHandler ch = new SAXSVGDocumentFactory("");

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_18()
		throws Exception {
		File dir = null;
		ContentHandler ch = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_19()
		throws Exception {
		File dir = null;
		ContentHandler ch = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchFieldError: parser
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.registerCustomCSSValueFactory(Unknown Source)
		//       at org.apache.batik.extension.svg.BatikDomExtension.registerTags(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<init>(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<clinit>(Unknown Source)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_20()
		throws Exception {
		File dir = null;
		ContentHandler ch = new ConfigurationParser();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_21()
		throws Exception {
		File dir = null;
		ContentHandler ch = new FOTreeBuilder();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_22()
		throws Exception {
		File dir = null;
		ContentHandler ch = new PatternParser();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_23()
		throws Exception {
		File dir = null;
		ContentHandler ch = new PatternParser(new HyphenationTree());

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_24()
		throws Exception {
		File dir = null;
		ContentHandler ch = new FontReader(new URL("http://www.eclipse.org"));

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_25()
		throws Exception {
		File dir = null;
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_26()
		throws Exception {
		File dir = null;
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_27()
		throws Exception {
		File dir = null;
		ContentHandler ch = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_28()
		throws Exception {
		File dir = null;
		ContentHandler ch = new VerifierFilterImpl((Verifier) null);

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_29()
		throws Exception {
		File dir = null;
		ContentHandler ch = new DefaultHandler2();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Run the void processDirectory(File,ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessDirectory_30()
		throws Exception {
		File dir = null;
		ContentHandler ch = new DefaultHandler();

		BuildSitemap.processDirectory(dir, ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.BuildSitemap.processDirectory(BuildSitemap.java:109)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BuildSitemapTest.class);
	}
}