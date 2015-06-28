package nu.staldal.xmlutil;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import nu.staldal.lsp.StringHandler;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.dom.util.SAXDocumentFactory;
import nu.staldal.xtree.ElementHandler;
import nu.staldal.lsp.compile.LSPText;
import nu.staldal.lsp.compiler.LSPExpr;
import nu.staldal.lsp.compiledexpr.BuiltInFunctionCall;
import org.apache.fop.configuration.ConfigurationParser;
import org.apache.fop.fo.FOTreeBuilder;
import org.apache.fop.layout.hyphenation.HyphenationTree;
import org.apache.fop.layout.hyphenation.PatternConsumer;
import org.apache.fop.layout.hyphenation.PatternParser;
import org.apache.fop.render.pdf.FontReader;
import nu.staldal.xtree.Text;
import nu.staldal.lsp.compile.LSPProcessingInstruction;
import nu.staldal.xtree.TreeBuilder;
import nu.staldal.xtree.ProcessingInstruction;
import nu.staldal.xmltree.Element;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.helper.AntXMLContext;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.iso_relax.verifier.Verifier;
import org.iso_relax.verifier.impl.ForkContentHandler;
import org.iso_relax.verifier.impl.VerifierFilterImpl;
import nu.staldal.lsp.compile.LSPNode;
import nu.staldal.lsp.compile.LSPForEach;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lsp.compile.LSPIf;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.Attributes;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.Locator;
import nu.staldal.lsp.expr.FunctionCall;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.LocatorImpl;
import nu.staldal.xtree.SequentialTreeBuilder;
import nu.staldal.lsp.compiledexpr.ExtensionFunctionCall;
import org.xml.sax.helpers.XMLFilterImpl;
import nu.staldal.lsp.expr.ConditionalExpr;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lsp.servlet.ServletExtLib;

/**
 * The class <code>ContentHandlerFixerTest</code> contains tests for the class <code>{@link ContentHandlerFixer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ContentHandlerFixerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ContentHandlerFixer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private ContentHandlerFixer fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ContentHandlerFixer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public ContentHandlerFixer getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ContentHandlerFixer((ContentHandler) null);
		}
		return fixture;
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_1()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_2()
		throws Exception {
		ContentHandler ch = new BasicSplit();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_3()
		throws Exception {
		ContentHandler ch = new IslandSplit();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_4()
		throws Exception {
		ContentHandler ch = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_5()
		throws Exception {
		ContentHandler ch = new StringHandler();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_6()
		throws Exception {
		ContentHandler ch = new ServletExtLib();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_7()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_8()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_9()
		throws Exception {
		ContentHandler ch = new ContentHandlerFixer((ContentHandler) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_10()
		throws Exception {
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_11()
		throws Exception {
		ContentHandler ch = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_12()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_13()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_14()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_15()
		throws Exception {
		ContentHandler ch = new TreeBuilder();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_16()
		throws Exception {
		ContentHandler ch = new TreeBuilder(new URL("http://www.eclipse.org"));

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_17()
		throws Exception {
		ContentHandler ch = new SAXSVGDocumentFactory("");

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_18()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_19()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_20()
		throws Exception {
		ContentHandler ch = new ConfigurationParser();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_21()
		throws Exception {
		ContentHandler ch = new FOTreeBuilder();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_22()
		throws Exception {
		ContentHandler ch = new PatternParser();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_23()
		throws Exception {
		ContentHandler ch = new PatternParser(new HyphenationTree());

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_24()
		throws Exception {
		ContentHandler ch = new FontReader(new URL("http://www.eclipse.org"));

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_25()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_26()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_27()
		throws Exception {
		ContentHandler ch = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_28()
		throws Exception {
		ContentHandler ch = new VerifierFilterImpl((Verifier) null);

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_29()
		throws Exception {
		ContentHandler ch = new DefaultHandler2();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_30()
		throws Exception {
		ContentHandler ch = new DefaultHandler();

		ContentHandlerFixer result = new ContentHandlerFixer(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_31()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		boolean nsDecl = false;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_32()
		throws Exception {
		ContentHandler ch = new BasicSplit();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_33()
		throws Exception {
		ContentHandler ch = new IslandSplit();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_34()
		throws Exception {
		ContentHandler ch = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_35()
		throws Exception {
		ContentHandler ch = new StringHandler();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_36()
		throws Exception {
		ContentHandler ch = new ServletExtLib();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_37()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_38()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_39()
		throws Exception {
		ContentHandler ch = new ContentHandlerFixer((ContentHandler) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_40()
		throws Exception {
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_41()
		throws Exception {
		ContentHandler ch = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_42()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_43()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_44()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_45()
		throws Exception {
		ContentHandler ch = new TreeBuilder();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_46()
		throws Exception {
		ContentHandler ch = new TreeBuilder(new URL("http://www.eclipse.org"));
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_47()
		throws Exception {
		ContentHandler ch = new SAXSVGDocumentFactory("");
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_48()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_49()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

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
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_50()
		throws Exception {
		ContentHandler ch = new ConfigurationParser();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_51()
		throws Exception {
		ContentHandler ch = new FOTreeBuilder();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_52()
		throws Exception {
		ContentHandler ch = new PatternParser();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_53()
		throws Exception {
		ContentHandler ch = new PatternParser(new HyphenationTree());
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_54()
		throws Exception {
		ContentHandler ch = new FontReader(new URL("http://www.eclipse.org"));
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_55()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_56()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_57()
		throws Exception {
		ContentHandler ch = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_58()
		throws Exception {
		ContentHandler ch = new VerifierFilterImpl((Verifier) null);
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_59()
		throws Exception {
		ContentHandler ch = new DefaultHandler2();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_60()
		throws Exception {
		ContentHandler ch = new DefaultHandler();
		boolean nsDecl = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_61()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		boolean nsDecl = false;
		boolean stripNs = false;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_62()
		throws Exception {
		ContentHandler ch = new BasicSplit();
		boolean nsDecl = true;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_63()
		throws Exception {
		ContentHandler ch = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_64()
		throws Exception {
		ContentHandler ch = new StringHandler();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_65()
		throws Exception {
		ContentHandler ch = new ServletExtLib();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_66()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_67()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_68()
		throws Exception {
		ContentHandler ch = new ContentHandlerFixer((ContentHandler) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_69()
		throws Exception {
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_70()
		throws Exception {
		ContentHandler ch = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_71()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_72()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_73()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_74()
		throws Exception {
		ContentHandler ch = new TreeBuilder();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_75()
		throws Exception {
		ContentHandler ch = new TreeBuilder(new URL("http://www.eclipse.org"));
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_76()
		throws Exception {
		ContentHandler ch = new SAXSVGDocumentFactory("");
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_77()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_78()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_79()
		throws Exception {
		ContentHandler ch = new ConfigurationParser();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_80()
		throws Exception {
		ContentHandler ch = new FOTreeBuilder();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_81()
		throws Exception {
		ContentHandler ch = new PatternParser();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_82()
		throws Exception {
		ContentHandler ch = new PatternParser(new HyphenationTree());
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_83()
		throws Exception {
		ContentHandler ch = new FontReader(new URL("http://www.eclipse.org"));
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_84()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_85()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_86()
		throws Exception {
		ContentHandler ch = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_87()
		throws Exception {
		ContentHandler ch = new VerifierFilterImpl((Verifier) null);
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_88()
		throws Exception {
		ContentHandler ch = new DefaultHandler2();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_89()
		throws Exception {
		ContentHandler ch = new DefaultHandler();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerFixer(ContentHandler,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testContentHandlerFixer_90()
		throws Exception {
		ContentHandler ch = new XMLFilterImpl();
		boolean nsDecl = false;
		boolean stripNs = true;

		ContentHandlerFixer result = new ContentHandlerFixer(ch, nsDecl, stripNs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_5()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_6()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_7()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_8()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_9()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_10()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_11()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_12()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_13()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_14()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_15()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_16()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_17()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_18()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_19()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_20()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_21()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_22()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_23()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_24()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_25()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_26()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_27()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_28()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_29()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture_30()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.characters(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();

		fixture2.endDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endDocument(ContentHandlerFixer.java:133)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_5()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 1
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_6()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_7()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_8()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.hash(Hashtable.java:239)
		//       at java.util.Hashtable.get(Hashtable.java:434)
		//       at org.xml.sax.helpers.NamespaceSupport$Context.getPrefix(NamespaceSupport.java:755)
		//       at org.xml.sax.helpers.NamespaceSupport.getPrefix(NamespaceSupport.java:436)
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:264)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_9()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 0
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_10()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_11()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_12()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 0
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_13()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.hash(Hashtable.java:239)
		//       at java.util.Hashtable.get(Hashtable.java:434)
		//       at org.xml.sax.helpers.NamespaceSupport$Context.getPrefix(NamespaceSupport.java:755)
		//       at org.xml.sax.helpers.NamespaceSupport.getPrefix(NamespaceSupport.java:436)
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:264)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_14()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_15()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_16()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_17()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 1
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_18()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_19()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_20()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 1
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_21()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_22()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_23()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_24()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 0
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_25()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.hash(Hashtable.java:239)
		//       at java.util.Hashtable.get(Hashtable.java:434)
		//       at org.xml.sax.helpers.NamespaceSupport$Context.getPrefix(NamespaceSupport.java:755)
		//       at org.xml.sax.helpers.NamespaceSupport.getPrefix(NamespaceSupport.java:436)
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:264)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_26()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_27()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_28()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.hash(Hashtable.java:239)
		//       at java.util.Hashtable.get(Hashtable.java:434)
		//       at org.xml.sax.helpers.NamespaceSupport$Context.getPrefix(NamespaceSupport.java:755)
		//       at org.xml.sax.helpers.NamespaceSupport.getPrefix(NamespaceSupport.java:436)
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:264)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_29()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: No prefix for 0
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:280)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture_30()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.endElement(ContentHandlerFixer.java:287)
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String prefix = "";

		fixture2.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String prefix = "0";

		fixture2.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_5()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_6()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_7()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_8()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_9()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_10()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_11()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_12()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_13()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_14()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_15()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_16()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_17()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_18()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_19()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_20()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_21()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_22()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_23()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_24()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_25()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_26()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_27()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_28()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_29()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_30()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		char[] chars = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(chars, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.ignorableWhitespace(ContentHandlerFixer.java:332)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String target = "";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.processingInstruction(ContentHandlerFixer.java:341)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String target = "0123456789";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.processingInstruction(ContentHandlerFixer.java:341)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String target = "0123456789";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.processingInstruction(ContentHandlerFixer.java:341)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String target = "";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.processingInstruction(ContentHandlerFixer.java:341)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPForEach(new ConditionalExpr((LSPExpr) null, (LSPExpr) null, (LSPExpr) null), (String) null, (String) null, new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_5()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPForEach(new FunctionCall("0123456789", "0123456789"), "0123456789", "", new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_6()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_7()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_8()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_9()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_10()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_11()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_12()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPText("", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_13()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LSPText("0123456789", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_14()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_15()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_16()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new Element((Element) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmltree.Node.<init>(Node.java:97)
		//       at nu.staldal.xmltree.NodeWithChildren.<init>(NodeWithChildren.java:84)
		//       at nu.staldal.xmltree.Element.<init>(Element.java:131)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_17()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_18()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_19()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_20()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_21()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_22()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_23()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_24()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_25()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new Locator2Impl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_26()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new Locator2Impl((Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.LocatorImpl.<init>(LocatorImpl.java:103)
		//       at org.xml.sax.ext.Locator2Impl.<init>(Locator2Impl.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_27()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LocatorImpl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_28()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		Locator locator = new LocatorImpl((Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.LocatorImpl.<init>(LocatorImpl.java:103)
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String name = "";

		fixture2.skippedEntity(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.skippedEntity(ContentHandlerFixer.java:349)
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String name = "0123456789";

		fixture2.skippedEntity(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.skippedEntity(ContentHandlerFixer.java:349)
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();

		fixture2.startDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startDocument(ContentHandlerFixer.java:126)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "0";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "1";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = null;
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_5()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "0";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_6()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "1";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_7()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = null;
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:239)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_8()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_9()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "1";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_10()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = null;
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_11()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_12()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "0";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_13()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = null;
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.hash(Hashtable.java:239)
		//       at java.util.Hashtable.get(Hashtable.java:434)
		//       at org.xml.sax.helpers.NamespaceSupport$Context.getPrefix(NamespaceSupport.java:755)
		//       at org.xml.sax.helpers.NamespaceSupport.getPrefix(NamespaceSupport.java:436)
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:160)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_14()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_15()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "0";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_16()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "1";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_17()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:239)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_18()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "0";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_19()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "1";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_20()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = null;
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_21()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "0";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_22()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "1";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_23()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = null;
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_24()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_25()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "1";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:243)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_26()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = null;
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_27()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.hash(Hashtable.java:239)
		//       at java.util.Hashtable.get(Hashtable.java:434)
		//       at org.xml.sax.helpers.NamespaceSupport$Context.getPrefix(NamespaceSupport.java:755)
		//       at org.xml.sax.helpers.NamespaceSupport.getPrefix(NamespaceSupport.java:436)
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:160)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_28()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "0";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_29()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = null;
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.startElement(ContentHandlerFixer.java:239)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture_30()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.ext.Attributes2Impl.setAttributes(Attributes2Impl.java:220)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
		//       at org.xml.sax.ext.Attributes2Impl.<init>(Attributes2Impl.java:93)
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_1()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String prefix = "";
		String uri = "";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_2()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String prefix = "0";
		String uri = "0123456789";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_3()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String prefix = "0";
		String uri = "";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_4()
		throws Exception {
		ContentHandlerFixer fixture2 = getFixture();
		String prefix = "";
		String uri = "0123456789";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ContentHandlerFixerTest.class);
	}
}