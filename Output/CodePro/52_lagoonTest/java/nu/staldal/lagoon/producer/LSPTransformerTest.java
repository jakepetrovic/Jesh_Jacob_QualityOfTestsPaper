package nu.staldal.lagoon.producer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import org.apache.batik.dom.GenericDOMImplementation;
import nu.staldal.xtree.ElementHandler;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import nu.staldal.xmlutil.ContentHandlerAdapter;
import nu.staldal.lagoon.core.Target;
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
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>LSPTransformerTest</code> contains tests for the class <code>{@link LSPTransformer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LSPTransformerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LSPTransformer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private LSPTransformer fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LSPTransformer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public LSPTransformer getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new LSPTransformer();
		}
		return fixture;
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_1()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		long when = -1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_2()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		long when = 0L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_3()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		long when = 1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testInit_fixture_1()
		throws Exception {
		LSPTransformer fixture2 = getFixture();

		fixture2.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/bcel/Constants
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:800)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:449)
		//       at java.net.URLClassLoader.access$100(URLClassLoader.java:71)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:358)
		//       at nu.staldal.lsp.compiler.LSPCompiler.<init>(LSPCompiler.java:111)
		//       at nu.staldal.lagoon.producer.LSPTransformer.init(LSPTransformer.java:66)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_1()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_2()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new BasicSplit();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_3()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new IslandSplit();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_4()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_5()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new StringHandler();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_6()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new ServletExtLib();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_7()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new TreeBuilder();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_8()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new TreeBuilder(new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_9()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new ContentHandlerFixer((ContentHandler) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_10()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.<init>(ContentHandlerSnooper.java:71)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_11()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_12()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_13()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_14()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_15()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new nu.staldal.xtree.TreeBuilder();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_16()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new nu.staldal.xtree.TreeBuilder(new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_17()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new SAXSVGDocumentFactory("");
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_18()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_19()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchFieldError: parser
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.registerCustomCSSValueFactory(Unknown Source)
		//       at org.apache.batik.extension.svg.BatikDomExtension.registerTags(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<init>(Unknown Source)
		//       at org.apache.batik.dom.svg.ExtensibleSVGDOMImplementation.<clinit>(Unknown Source)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_20()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new ConfigurationParser();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_21()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new FOTreeBuilder();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_22()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new PatternParser();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_23()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new PatternParser(new HyphenationTree());
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.fop.layout.hyphenation.HyphenationException: Could not find org.apache.xerces.parsers.SAXParser
		//       at org.apache.fop.layout.hyphenation.PatternParser.createParser(PatternParser.java:137)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:90)
		//       at org.apache.fop.layout.hyphenation.PatternParser.<init>(PatternParser.java:99)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_24()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new FontReader(new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at org.apache.fop.configuration.ConfigurationReader.createParser(ConfigurationReader.java:136)
		//       at org.apache.fop.render.pdf.FontReader.createFont(FontReader.java:99)
		//       at org.apache.fop.render.pdf.FontReader.<init>(FontReader.java:156)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_25()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_26()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_27()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_28()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new VerifierFilterImpl((Verifier) null);
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.VerifierFilterImpl.<init>(VerifierFilterImpl.java:39)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_29()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new DefaultHandler2();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_30()
		throws Exception {
		LSPTransformer fixture2 = getFixture();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture2.start(ch, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.LSPTransformer.readSource(LSPTransformer.java:141)
		//       at nu.staldal.lagoon.producer.LSPTransformer.start(LSPTransformer.java:183)
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
		new org.junit.runner.JUnitCore().run(LSPTransformerTest.class);
	}
}