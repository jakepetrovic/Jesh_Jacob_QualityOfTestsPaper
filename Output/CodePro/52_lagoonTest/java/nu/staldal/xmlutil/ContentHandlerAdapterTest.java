package nu.staldal.xmlutil;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import nu.staldal.lsp.StringHandler;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
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
import nu.staldal.lsp.expr.ConditionalExpr;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lsp.servlet.ServletExtLib;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.AttributeList;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.Locator;
import nu.staldal.lsp.expr.FunctionCall;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributeListImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.LocatorImpl;
import nu.staldal.xtree.SequentialTreeBuilder;
import nu.staldal.lsp.compiledexpr.ExtensionFunctionCall;

/**
 * The class <code>ContentHandlerAdapterTest</code> contains tests for the class <code>{@link ContentHandlerAdapter}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:37 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ContentHandlerAdapterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ContentHandlerAdapter
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private ContentHandlerAdapter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ContentHandlerAdapter
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public ContentHandlerAdapter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ContentHandlerAdapter((ContentHandler) null);
		}
		return fixture;
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_1()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_2()
		throws Exception {
		ContentHandler ch = new BasicSplit();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_3()
		throws Exception {
		ContentHandler ch = new IslandSplit();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_4()
		throws Exception {
		ContentHandler ch = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_5()
		throws Exception {
		ContentHandler ch = new StringHandler();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_6()
		throws Exception {
		ContentHandler ch = new ServletExtLib();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_7()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_8()
		throws Exception {
		ContentHandler ch = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_9()
		throws Exception {
		ContentHandler ch = new ContentHandlerFixer((ContentHandler) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_10()
		throws Exception {
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_11()
		throws Exception {
		ContentHandler ch = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_12()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_13()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_14()
		throws Exception {
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_15()
		throws Exception {
		ContentHandler ch = new TreeBuilder();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_16()
		throws Exception {
		ContentHandler ch = new TreeBuilder(new URL("http://www.eclipse.org"));

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_17()
		throws Exception {
		ContentHandler ch = new SAXSVGDocumentFactory("");

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_18()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_19()
		throws Exception {
		ContentHandler ch = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

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
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_20()
		throws Exception {
		ContentHandler ch = new ConfigurationParser();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_21()
		throws Exception {
		ContentHandler ch = new FOTreeBuilder();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_22()
		throws Exception {
		ContentHandler ch = new PatternParser();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_23()
		throws Exception {
		ContentHandler ch = new PatternParser(new HyphenationTree());

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_24()
		throws Exception {
		ContentHandler ch = new FontReader(new URL("http://www.eclipse.org"));

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_25()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_26()
		throws Exception {
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_27()
		throws Exception {
		ContentHandler ch = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_28()
		throws Exception {
		ContentHandler ch = new VerifierFilterImpl((Verifier) null);

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_29()
		throws Exception {
		ContentHandler ch = new DefaultHandler2();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContentHandlerAdapter(ContentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testContentHandlerAdapter_30()
		throws Exception {
		ContentHandler ch = new DefaultHandler();

		ContentHandlerAdapter result = new ContentHandlerAdapter(ch);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_2()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_3()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_4()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_5()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_6()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_7()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_8()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_9()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_10()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_11()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_12()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_13()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_14()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_15()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_16()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_17()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_18()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_19()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_20()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_21()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_22()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_23()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_24()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_25()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_26()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_27()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_28()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_29()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture_30()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.characters(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();

		fixture2.endDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.endDocument(ContentHandlerAdapter.java:86)
	}

	/**
	 * Run the void endElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String name = "";

		fixture2.endElement(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.endElement(ContentHandlerAdapter.java:139)
	}

	/**
	 * Run the void endElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture_2()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String name = "0123456789";

		fixture2.endElement(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.endElement(ContentHandlerAdapter.java:139)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_2()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_3()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_4()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_5()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_6()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_7()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_8()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_9()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_10()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_11()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_12()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_13()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_14()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_15()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_16()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_17()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_18()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_19()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_20()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_21()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_22()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_23()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_24()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_25()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_26()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_27()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_28()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_29()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_30()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		char[] c = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(c, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.ignorableWhitespace(ContentHandlerAdapter.java:159)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String target = "";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.processingInstruction(ContentHandlerAdapter.java:165)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_2()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String target = "0123456789";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.processingInstruction(ContentHandlerAdapter.java:165)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_3()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String target = "0123456789";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.processingInstruction(ContentHandlerAdapter.java:165)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_4()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String target = "";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.processingInstruction(ContentHandlerAdapter.java:165)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_2()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_3()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_4()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new ConditionalExpr((LSPExpr) null, (LSPExpr) null, (LSPExpr) null), (String) null, (String) null, new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_5()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new FunctionCall("0123456789", "0123456789"), "0123456789", "", new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_6()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_7()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_8()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_9()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_10()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_11()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_12()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPText("", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_13()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPText("0123456789", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_14()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_15()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_16()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_17()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_18()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_19()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_20()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_21()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_22()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_23()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_24()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_25()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Locator2Impl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_26()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_27()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LocatorImpl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.setDocumentLocator(ContentHandlerAdapter.java:74)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_28()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LocatorImpl((Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.LocatorImpl.<init>(LocatorImpl.java:103)
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();

		fixture2.startDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.startDocument(ContentHandlerAdapter.java:80)
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture_1()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String name = "";
		AttributeList atts = new AttributeListImpl();

		fixture2.startElement(name, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.startElement(ContentHandlerAdapter.java:129)
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture_2()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String name = "0123456789";
		AttributeList atts = new AttributeListImpl((AttributeList) null);

		fixture2.startElement(name, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributeListImpl.setAttributeList(AttributeListImpl.java:140)
		//       at org.xml.sax.helpers.AttributeListImpl.<init>(AttributeListImpl.java:120)
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture_3()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String name = "0123456789";
		AttributeList atts = new AttributeListImpl();

		fixture2.startElement(name, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.startElement(ContentHandlerAdapter.java:129)
	}

	/**
	 * Run the void startElement(String,AttributeList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture_4()
		throws Exception {
		ContentHandlerAdapter fixture2 = getFixture();
		String name = "";
		AttributeList atts = new AttributeListImpl((AttributeList) null);

		fixture2.startElement(name, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributeListImpl.setAttributeList(AttributeListImpl.java:140)
		//       at org.xml.sax.helpers.AttributeListImpl.<init>(AttributeListImpl.java:120)
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
		new org.junit.runner.JUnitCore().run(ContentHandlerAdapterTest.class);
	}
}