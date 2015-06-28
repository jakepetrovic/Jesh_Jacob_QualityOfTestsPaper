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
 * The class <code>TextTest</code> contains tests for the class <code>{@link Text}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TextTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Text
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Text fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Text
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private Text fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Text
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Text getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Text("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Text
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public Text getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Text(new char[] {' ', '\n', 'a', '�'}, 0, 0, false);
		}
		return fixture2;
	}

	/**
	 * Run the Text(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_1()
		throws Exception {
		String value = "";

		Text result = new Text(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_2()
		throws Exception {
		String value = "0123456789";

		Text result = new Text(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getValue());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_3()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 0;
		int length = 0;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_4()
		throws Exception {
		char[] data = new char[] {};
		int start = 1;
		int length = 1;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_5()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 0;
		int length = 7;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_6()
		throws Exception {
		char[] data = null;
		int start = 0;
		int length = 1;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_7()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 1;
		int length = 7;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_8()
		throws Exception {
		char[] data = null;
		int start = 1;
		int length = 0;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_9()
		throws Exception {
		char[] data = new char[] {};
		int start = 0;
		int length = 1;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 1
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_10()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 0;
		int length = 0;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_11()
		throws Exception {
		char[] data = new char[] {};
		int start = 1;
		int length = 7;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_12()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 1;
		int length = 0;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_13()
		throws Exception {
		char[] data = null;
		int start = 0;
		int length = 1;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_14()
		throws Exception {
		char[] data = new char[] {};
		int start = 0;
		int length = 0;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_15()
		throws Exception {
		char[] data = null;
		int start = 1;
		int length = 1;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_16()
		throws Exception {
		char[] data = new char[] {};
		int start = 0;
		int length = 7;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_17()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 0;
		int length = 1;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\n", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_18()
		throws Exception {
		char[] data = new char[] {};
		int start = 1;
		int length = 7;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_19()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 1;
		int length = 1;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_20()
		throws Exception {
		char[] data = null;
		int start = 0;
		int length = 7;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_21()
		throws Exception {
		char[] data = new char[] {};
		int start = 0;
		int length = 0;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_22()
		throws Exception {
		char[] data = null;
		int start = 1;
		int length = 7;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_23()
		throws Exception {
		char[] data = new char[] {};
		int start = 1;
		int length = 0;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 1
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_24()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 0;
		int length = 1;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\n", result.getValue());
		assertEquals(true, result.isWhitespaceNode());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(false, result.getPreserveSpace());
		assertEquals(-1, result.getColumnNumber());
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_25()
		throws Exception {
		char[] data = null;
		int start = 0;
		int length = 0;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_26()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 1;
		int length = 1;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_27()
		throws Exception {
		char[] data = null;
		int start = 1;
		int length = 0;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_28()
		throws Exception {
		char[] data = new char[] {};
		int start = 0;
		int length = 7;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_29()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 0;
		int length = 7;
		boolean forceCopy = false;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_30()
		throws Exception {
		char[] data = null;
		int start = 0;
		int length = 0;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_31()
		throws Exception {
		char[] data = new char[] {'\n'};
		int start = 1;
		int length = 7;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		//       at java.lang.String.<init>(String.java:201)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the Text(char[],int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testText_32()
		throws Exception {
		char[] data = null;
		int start = 1;
		int length = 1;
		boolean forceCopy = true;

		Text result = new Text(data, start, length, forceCopy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.lang.String.<init>(String.java:200)
		//       at nu.staldal.xtree.Text.<init>(Text.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the char[] asCharArray() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAsCharArray_fixture1_1()
		throws Exception {
		Text fixture = getFixture1();

		char[] result = fixture.asCharArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the char[] asCharArray() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAsCharArray_fixture2_1()
		throws Exception {
		Text fixture = getFixture2();

		char[] result = fixture.asCharArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
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
		Text fixture = getFixture1();

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
		Text fixture = getFixture2();

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isWhitespaceNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIsWhitespaceNode_fixture1_1()
		throws Exception {
		Text fixture = getFixture1();

		boolean result = fixture.isWhitespaceNode();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWhitespaceNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIsWhitespaceNode_fixture2_1()
		throws Exception {
		Text fixture = getFixture2();

		boolean result = fixture.isWhitespaceNode();

		// add additional test code here
		assertEquals(true, result);
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
		Text fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandler sax = new ContentHandlerSnooper((ContentHandler) null, printWriter);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerSnooper.characters(ContentHandlerSnooper.java:141)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
		ContentHandler sax = new IslandSplit();

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.characters(IslandSplit.java:228)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture2();
		ContentHandler sax = new ContentHandlerStartEndDocumentFilter((ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lsp.ContentHandlerStartEndDocumentFilter.characters(ContentHandlerStartEndDocumentFilter.java:121)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder();

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
	public void testToSAX_fixture2_4()
		throws Exception {
		Text fixture = getFixture2();
		ContentHandler sax = new nu.staldal.xmltree.TreeBuilder(new URL("http://www.eclipse.org"));

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
	public void testToSAX_fixture1_5()
		throws Exception {
		Text fixture = getFixture1();
		ContentHandler sax = new ContentHandlerFixer((ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerFixer.characters(ContentHandlerFixer.java:326)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
		ContentHandler sax = new DocumentHandlerAdapter(new ContentHandlerAdapter((ContentHandler) null));

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.ContentHandlerAdapter.characters(ContentHandlerAdapter.java:153)
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
		ContentHandler sax = new TreeBuilder();

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
	public void testToSAX_fixture2_8()
		throws Exception {
		Text fixture = getFixture2();
		ContentHandler sax = new TreeBuilder(new URL("http://www.eclipse.org"));

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
	public void testToSAX_fixture1_9()
		throws Exception {
		Text fixture = getFixture1();
		ContentHandler sax = new SAXSVGDocumentFactory("");

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
	public void testToSAX_fixture2_9()
		throws Exception {
		Text fixture = getFixture2();
		ContentHandler sax = new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), "");

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
	public void testToSAX_fixture1_10()
		throws Exception {
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
		ContentHandler sax = new org.apache.tools.ant.helper.ProjectHelper2.RootHandler((AntXMLContext) null, (org.apache.tools.ant.helper.ProjectHelper2.AntHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.tools.ant.helper.ProjectHelper2$RootHandler.characters(ProjectHelper2.java:543)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture1();
		ContentHandler sax = new ForkContentHandler((ContentHandler) null, (ContentHandler) null);

		fixture.toSAX(sax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.iso_relax.verifier.impl.ForkContentHandler.characters(ForkContentHandler.java:85)
		//       at nu.staldal.xtree.Text.toSAX(Text.java:115)
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
		Text fixture = getFixture2();
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
		Text fixture = getFixture1();
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
		Text fixture = getFixture2();
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
		new org.junit.runner.JUnitCore().run(TextTest.class);
	}
}