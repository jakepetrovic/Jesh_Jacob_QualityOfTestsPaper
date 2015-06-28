package nu.staldal.xmlutil;

import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.lsp.compile.LSPNode;
import java.io.Writer;
import nu.staldal.xtree.ProcessingInstruction;
import nu.staldal.lsp.compiler.LSPExpr;
import nu.staldal.xmltree.Text;
import org.junit.*;
import nu.staldal.lsp.expr.ConditionalExpr;
import nu.staldal.lsp.compile.LSPText;
import nu.staldal.lsp.compile.LSPForEach;
import nu.staldal.xtree.Element;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.Locator;
import nu.staldal.lsp.expr.FunctionCall;
import nu.staldal.lsp.compiledexpr.BuiltInFunctionCall;
import nu.staldal.lsp.compile.LSPProcessingInstruction;
import org.xml.sax.Parser;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLReaderAdapter;
import nu.staldal.lsp.compiledexpr.ExtensionFunctionCall;
import nu.staldal.lsp.compile.LSPIf;

/**
 * The class <code>DocumentHandlerAdapterTest</code> contains tests for the class <code>{@link DocumentHandlerAdapter}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DocumentHandlerAdapterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DocumentHandlerAdapter
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private DocumentHandlerAdapter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DocumentHandlerAdapter
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public DocumentHandlerAdapter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DocumentHandlerAdapter((DocumentHandler) null);
		}
		return fixture;
	}

	/**
	 * Run the DocumentHandlerAdapter(DocumentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDocumentHandlerAdapter_1()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		ContentHandlerSnooper contentHandlerSnooper = new ContentHandlerSnooper((ContentHandler) null, printWriter);
		DocumentHandler dh = new ContentHandlerAdapter(contentHandlerSnooper);

		DocumentHandlerAdapter result = new DocumentHandlerAdapter(dh);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DocumentHandlerAdapter(DocumentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDocumentHandlerAdapter_2()
		throws Exception {
		DocumentHandler dh = new HandlerBase();

		DocumentHandlerAdapter result = new DocumentHandlerAdapter(dh);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DocumentHandlerAdapter(DocumentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDocumentHandlerAdapter_3()
		throws Exception {
		DocumentHandler dh = new ParserAdapter();

		DocumentHandlerAdapter result = new DocumentHandlerAdapter(dh);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.xml.sax.SAXException: System property org.xml.sax.parser not specified
		//       at org.xml.sax.helpers.ParserAdapter.<init>(ParserAdapter.java:130)
		assertNotNull(result);
	}

	/**
	 * Run the DocumentHandlerAdapter(DocumentHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDocumentHandlerAdapter_4()
		throws Exception {
		DocumentHandler dh = new ParserAdapter(new XMLReaderAdapter());

		DocumentHandlerAdapter result = new DocumentHandlerAdapter(dh);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_5()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_6()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_7()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_8()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_9()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_10()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_11()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_12()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_13()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_14()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_15()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_16()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_17()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_18()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_19()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_20()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_21()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_22()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_23()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_24()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_25()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_26()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_27()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_28()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_29()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCharacters_fixture_30()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.characters(DocumentHandlerAdapter.java:238)
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndDocument_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();

		fixture2.endDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endDocument(DocumentHandlerAdapter.java:92)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_5()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '1'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_6()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_7()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_8()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_9()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '0'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_10()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_11()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_12()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '0'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_13()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_14()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_15()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_16()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_17()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '1'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_18()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_19()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_20()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '1'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_21()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_22()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_23()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_24()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '0'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_25()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_26()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_27()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = "1";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_28()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = null;

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_29()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '0'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:199)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndElement_fixture_30()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "0";

		fixture2.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(DocumentHandlerAdapter.java:206)
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String prefix = "";

		fixture2.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String prefix = "0";

		fixture2.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_5()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_6()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_7()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_8()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_9()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_10()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_11()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_12()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_13()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_14()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_15()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_16()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 7;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_17()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_18()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_19()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_20()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_21()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_22()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_23()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_24()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_25()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_26()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_27()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 7;
		int length = 1;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_28()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_29()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {'�'};
		int start = 7;
		int length = 0;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture_30()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 7;

		fixture2.ignorableWhitespace(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace(DocumentHandlerAdapter.java:244)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String target = "";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(DocumentHandlerAdapter.java:253)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String target = "0123456789";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(DocumentHandlerAdapter.java:253)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String target = "0123456789";
		String data = "";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(DocumentHandlerAdapter.java:253)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testProcessingInstruction_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String target = "";
		String data = "0123456789";

		fixture2.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(DocumentHandlerAdapter.java:253)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new ConditionalExpr((LSPExpr) null, (LSPExpr) null, (LSPExpr) null), (String) null, (String) null, new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_5()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPForEach(new FunctionCall("0123456789", "0123456789"), "0123456789", "", new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_6()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_7()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_8()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_9()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_10()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_11()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPProcessingInstruction(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_12()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPText("", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_13()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LSPText("0123456789", (Locator) null);

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_14()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_15()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_16()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.Element((nu.staldal.xmltree.Element) null);

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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_17()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_18()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xmltree.ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_19()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_20()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Element("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_21()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Element("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_22()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("", "");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_23()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new ProcessingInstruction("0123456789", "0123456789");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_24()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new nu.staldal.xtree.Text("");

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_25()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new Locator2Impl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_26()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_27()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		Locator locator = new LocatorImpl();

		fixture2.setDocumentLocator(locator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(DocumentHandlerAdapter.java:78)
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture_28()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSkippedEntity_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String name = "";

		fixture2.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSkippedEntity_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String name = "0123456789";

		fixture2.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartDocument_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();

		fixture2.startDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startDocument(DocumentHandlerAdapter.java:85)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "1";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_5()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "0";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_6()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_7()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = null;
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '0'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:126)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_8()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_9()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "1";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_10()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_11()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_12()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_13()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = null;
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_14()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_15()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "0";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_16()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_17()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '1'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:126)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_18()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_19()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "0123456789";
		String qname = "1";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_20()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_21()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "0";
		String localName = "";
		String qname = "0";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_22()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_23()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "";
		String localName = "";
		String qname = null;
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_24()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_25()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "0123456789";
		String qname = "1";
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:171)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_26()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_27()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = null;
		String localName = "";
		String qname = "";
		Attributes atts = new AttributesImpl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_28()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_29()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
		String namespaceURI = "1";
		String localName = "";
		String qname = null;
		Attributes atts = new Attributes2Impl();

		fixture2.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: no prefix for '1'
		//       at nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(DocumentHandlerAdapter.java:126)
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartElement_fixture_30()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_1()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_2()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_3()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture_4()
		throws Exception {
		DocumentHandlerAdapter fixture2 = getFixture();
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
		new org.junit.runner.JUnitCore().run(DocumentHandlerAdapterTest.class);
	}
}