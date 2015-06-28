package nu.staldal.lagoon.producer;

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
import nu.staldal.xmlutil.ContentHandlerAdapter;
import nu.staldal.lagoon.core.Target;
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
import nu.staldal.lsp.compile.LSPIf;
import org.junit.*;
import nu.staldal.lsp.expr.ConditionalExpr;
import nu.staldal.xmlutil.ContentHandlerFixer;
import nu.staldal.lsp.servlet.ServletExtLib;
import static org.junit.Assert.*;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.Attributes;
import nu.staldal.lsp.ContentHandlerStartEndDocumentFilter;
import nu.staldal.xmlutil.ContentHandlerSnooper;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
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

/**
 * The class <code>IslandSplitTest</code> contains tests for the class <code>{@link IslandSplit}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class IslandSplitTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see IslandSplit
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private IslandSplit fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IslandSplit
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public IslandSplit getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new IslandSplit();
		}
		return fixture;
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
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
		IslandSplit fixture2 = getFixture();

		fixture2.endDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endDocument(IslandSplit.java:142)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "0123456789";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture2.endElement(namespaceURI, localName, qName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.endElement(IslandSplit.java:205)
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
		IslandSplit fixture2 = getFixture();
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
		IslandSplit fixture2 = getFixture();
		String prefix = "0123456789";

		fixture2.endPrefixMapping(prefix);

		// add additional test code here
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
		IslandSplit fixture2 = getFixture();
		long when = -1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(IslandSplit.java:124)
		assertTrue(result);
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
		IslandSplit fixture2 = getFixture();
		long when = 0L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(IslandSplit.java:124)
		assertTrue(result);
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
		IslandSplit fixture2 = getFixture();
		long when = 1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(IslandSplit.java:124)
		assertTrue(result);
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace(IslandSplit.java:234)
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
		IslandSplit fixture2 = getFixture();

		fixture2.init();

		// add additional test code here
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
		IslandSplit fixture2 = getFixture();
		String target = "";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.processingInstruction(IslandSplit.java:240)
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
		IslandSplit fixture2 = getFixture();
		String target = "0123456789";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.processingInstruction(IslandSplit.java:240)
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
		IslandSplit fixture2 = getFixture();
		String target = "0123456789";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.processingInstruction(IslandSplit.java:240)
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
		IslandSplit fixture2 = getFixture();
		String target = "";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.processingInstruction(IslandSplit.java:240)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPForEach(new ConditionalExpr((LSPExpr) null, (LSPExpr) null, (LSPExpr) null), (String) null, (String) null, new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPForEach(new FunctionCall("0123456789", "0123456789"), "0123456789", "", new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPText("", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LSPText("0123456789", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new Locator2Impl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
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
		IslandSplit fixture2 = getFixture();
		Locator locator = new LocatorImpl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(IslandSplit.java:132)
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
		IslandSplit fixture2 = getFixture();
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
		IslandSplit fixture2 = getFixture();
		String name = "";

		fixture2.skippedEntity(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.skippedEntity(IslandSplit.java:246)
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
		IslandSplit fixture2 = getFixture();
		String name = "0123456789";

		fixture2.skippedEntity(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.skippedEntity(IslandSplit.java:246)
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
		IslandSplit fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new BasicSplit();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new IslandSplit();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new StringHandler();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new ServletExtLib();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, (PrintWriter) null);
		Target target = null;

		fixture2.start(sax, target);

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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new TreeBuilder();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new SAXSVGDocumentFactory("");
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new SAXDocumentFactory(ExtensibleSVGDOMImplementation.getDOMImplementation(), "0123456789");
		Target target = null;

		fixture2.start(sax, target);

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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new ConfigurationParser();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new FOTreeBuilder();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new PatternParser();
		Target target = null;

		fixture2.start(sax, target);

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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new PatternParser(new HyphenationTree());
		Target target = null;

		fixture2.start(sax, target);

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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new FontReader(new URL("http://www.eclipse.org"));
		Target target = null;

		fixture2.start(sax, target);

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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler(new AntXMLContext(new Project()), new org.apache.tools.ant.helper.ProjectHelper2.AntHandler());
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new VerifierFilterImpl((Verifier) null);
		Target target = null;

		fixture2.start(sax, target);

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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new DefaultHandler2();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture2.start(sax, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.start(IslandSplit.java:110)
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
		IslandSplit fixture2 = getFixture();

		fixture2.startDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startDocument(IslandSplit.java:137)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startElement(IslandSplit.java:160)
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
		IslandSplit fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture2.startElement(namespaceURI, localName, qName, atts);

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
		IslandSplit fixture2 = getFixture();
		String prefix = "";
		String uri = "";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startPrefixMapping(IslandSplit.java:148)
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
		IslandSplit fixture2 = getFixture();
		String prefix = "0123456789";
		String uri = "0123456789";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startPrefixMapping(IslandSplit.java:148)
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
		IslandSplit fixture2 = getFixture();
		String prefix = "0123456789";
		String uri = "";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startPrefixMapping(IslandSplit.java:148)
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
		IslandSplit fixture2 = getFixture();
		String prefix = "";
		String uri = "0123456789";

		fixture2.startPrefixMapping(prefix, uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.startPrefixMapping(IslandSplit.java:148)
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
		new org.junit.runner.JUnitCore().run(IslandSplitTest.class);
	}
}