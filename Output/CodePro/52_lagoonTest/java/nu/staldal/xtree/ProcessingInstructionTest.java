package nu.staldal.xtree;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import org.apache.batik.dom.GenericDOMImplementation;
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
import org.apache.tools.ant.Project;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lsp.servlet.ServletExtLib;
import nu.staldal.xmlutil.ContentHandlerFixer;
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
 * The class <code>ProcessingInstructionTest</code> contains tests for the class <code>{@link ProcessingInstruction}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ProcessingInstructionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ProcessingInstruction
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProcessingInstruction fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProcessingInstruction
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProcessingInstruction fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProcessingInstruction
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProcessingInstruction getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ProcessingInstruction("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProcessingInstruction
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProcessingInstruction getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ProcessingInstruction("0123456789", "0123456789");
		}
		return fixture2;
	}

	/**
	 * Run the ProcessingInstruction(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_1()
		throws Exception {
		String target = "";
		String value = "";

		ProcessingInstruction result = new ProcessingInstruction(target, value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals("", result.getTarget());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the ProcessingInstruction(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_2()
		throws Exception {
		String target = "0123456789";
		String value = "0123456789";

		ProcessingInstruction result = new ProcessingInstruction(target, value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getValue());
		assertEquals("0123456789", result.getTarget());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the ProcessingInstruction(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_3()
		throws Exception {
		String target = "0123456789";
		String value = "";

		ProcessingInstruction result = new ProcessingInstruction(target, value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals("0123456789", result.getTarget());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the ProcessingInstruction(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_4()
		throws Exception {
		String target = "";
		String value = "0123456789";

		ProcessingInstruction result = new ProcessingInstruction(target, value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getValue());
		assertEquals("", result.getTarget());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the String getTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTarget_fixture1_1()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();

		String result = fixture.getTarget();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTarget_fixture2_1()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();

		String result = fixture.getTarget();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetValue_fixture1_1()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetValue_fixture2_1()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_1()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.processingInstruction(ContentHandlerSnooper.java:158)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_1()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new BasicSplit();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_2()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new IslandSplit();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.processingInstruction(IslandSplit.java:240)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_2()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.ContentHandlerStartEndDocumentFilter.processingInstruction(ContentHandlerStartEndDocumentFilter.java:135)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_3()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new StringHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_3()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new ServletExtLib();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_4()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xmltree.TreeBuilder.processingInstruction(TreeBuilder.java:344)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_4()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xmltree.TreeBuilder.processingInstruction(TreeBuilder.java:344)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_5()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.processingInstruction(ContentHandlerFixer.java:341)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_5()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_6()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.processingInstruction(ContentHandlerAdapter.java:165)
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(DocumentHandlerAdapter.java:253)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_6()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_7()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_7()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_8()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new TreeBuilder();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_8()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_9()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new SAXSVGDocumentFactory("");

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.processingInstruction(SAXDocumentFactory.java:719)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_9()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.batik.dom.util.SAXDocumentFactory.processingInstruction(SAXDocumentFactory.java:719)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_10()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchFieldError: parser
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.registerCustomCSSValueFactory(Unknown Source)
		//       at org.apache.batik.extension.svg.BatikDomExtension.registerTags(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<init>(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<clinit>(Unknown Source)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_10()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new ConfigurationParser();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_11()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new FOTreeBuilder();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_11()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new PatternParser();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_12()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new PatternParser(new HyphenationTree());

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_12()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_13()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_13()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_14()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.ForkContentHandler.processingInstruction(ForkContentHandler.java:95)
		//       at nu.staldal.xtree.ProcessingInstruction.toSAX(ProcessingInstruction.java:90)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_14()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture1_15()
		throws Exception {
		ProcessingInstruction fixture = getFixture1();
		ContentHandler sax = new DefaultHandler2();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testToSAX_fixture2_15()
		throws Exception {
		ProcessingInstruction fixture = getFixture2();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

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
		new org.junit.runner.JUnitCore().run(ProcessingInstructionTest.class);
	}
}