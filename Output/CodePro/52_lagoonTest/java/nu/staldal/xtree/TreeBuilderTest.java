package nu.staldal.xtree;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import nu.staldal.lsp.compiledexpr.BuiltInFunctionCall;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import nu.staldal.lsp.compiledexpr.ExtensionFunctionCall;
import nu.staldal.lsp.compile.LSPForEach;
import nu.staldal.lsp.compile.LSPIf;
import nu.staldal.lsp.compiler.LSPExpr;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import nu.staldal.lsp.compile.LSPNode;

/**
 * The class <code>TreeBuilderTest</code> contains tests for the class <code>{@link TreeBuilder}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:37 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TreeBuilderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private TreeBuilder fixture20;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new TreeBuilder();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new TreeBuilder();
			fixture2.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture2.startPrefixMapping("", "");
			fixture2.startPrefixMapping("", "");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new TreeBuilder();
			fixture3.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture3.startPrefixMapping("", "");
			fixture3.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new TreeBuilder();
			fixture4.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture4.startPrefixMapping("", "");
			fixture4.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new TreeBuilder();
			fixture5.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture5.startPrefixMapping("", "");
			fixture5.startPrefixMapping("", "");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new TreeBuilder();
			fixture6.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture6.startPrefixMapping("", "");
			fixture6.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new TreeBuilder();
			fixture7.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture7.startPrefixMapping("", "");
			fixture7.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new TreeBuilder();
			fixture8.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture8.startPrefixMapping("", "");
			fixture8.startPrefixMapping("", "");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new TreeBuilder();
			fixture9.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture9.startPrefixMapping("", "");
			fixture9.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new TreeBuilder();
			fixture10.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture10.startPrefixMapping("", "");
			fixture10.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new TreeBuilder((URL) null);
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new TreeBuilder((URL) null);
			fixture12.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture12.startPrefixMapping("", "");
			fixture12.startPrefixMapping("", "");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new TreeBuilder((URL) null);
			fixture13.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture13.startPrefixMapping("", "");
			fixture13.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new TreeBuilder((URL) null);
			fixture14.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture14.startPrefixMapping("", "");
			fixture14.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new TreeBuilder((URL) null);
			fixture15.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture15.startPrefixMapping("", "");
			fixture15.startPrefixMapping("", "");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new TreeBuilder((URL) null);
			fixture16.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture16.startPrefixMapping("", "");
			fixture16.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new TreeBuilder((URL) null);
			fixture17.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture17.startPrefixMapping("", "");
			fixture17.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new TreeBuilder((URL) null);
			fixture18.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture18.startPrefixMapping("", "");
			fixture18.startPrefixMapping("", "");
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new TreeBuilder((URL) null);
			fixture19.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture19.startPrefixMapping("", "");
			fixture19.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public TreeBuilder getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new TreeBuilder((URL) null);
			fixture20.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture20.startPrefixMapping("", "");
			fixture20.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture20;
	}

	/**
	 * Run the TreeBuilder() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testTreeBuilder_1()
		throws Exception {

		TreeBuilder result = new TreeBuilder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TreeBuilder(URL) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testTreeBuilder_2()
		throws Exception {
		URL base = null;

		TreeBuilder result = new TreeBuilder(base);

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
	public void testCharacters_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture1_2()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:536)
		//       at java.lang.StringBuffer.append(StringBuffer.java:322)
		//       at nu.staldal.xtree.TreeBuilder.characters(TreeBuilder.java:331)
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture12_2()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testCharacters_fixture13_2()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndDocument_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture1_2()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String namespaceURI = "";
		String localName = "";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture12_2()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture13_2()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndElement_fixture14_2()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";

		fixture.endElement(namespaceURI, localName, qname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at java.util.Stack.pop(Stack.java:84)
		//       at nu.staldal.xtree.TreeBuilder.endElement(TreeBuilder.java:295)
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testEndPrefixMapping_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testFileToInputSource_1()
		throws Exception {
		File file = File.createTempFile("", "");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testFileToInputSource_2()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testFileToInputSource_3()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPublicId());
		assertEquals("file:///private/var/folders/m5/dv90pgm117qcb50zjvwdln1c0000gn/T/012345678975408563862503004040123456789", result.getSystemId());
		assertEquals(null, result.getByteStream());
		assertEquals(null, result.getCharacterStream());
		assertEquals(null, result.getEncoding());
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testFileToInputSource_4()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPublicId());
		assertEquals("file:///private/var/folders/m5/dv90pgm117qcb50zjvwdln1c0000gn/T/012345678988408183250998454010123456789", result.getSystemId());
		assertEquals(null, result.getByteStream());
		assertEquals(null, result.getCharacterStream());
		assertEquals(null, result.getEncoding());
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testFileToInputSource_5()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPublicId());
		assertEquals("file:///private/var/folders/m5/dv90pgm117qcb50zjvwdln1c0000gn/T/An��t-1.0.txt6095873800342222746An��t-1.0.txt", result.getSystemId());
		assertEquals(null, result.getByteStream());
		assertEquals(null, result.getCharacterStream());
		assertEquals(null, result.getEncoding());
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testFileToInputSource_6()
		throws Exception {
		File file = new File(URI.create(""));

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToInputSource_7()
		throws Exception {
		File file = new File("");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToInputSource_8()
		throws Exception {
		File file = new File("", "");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToInputSource_9()
		throws Exception {
		File file = new File("0123456789", "0123456789");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToInputSource_10()
		throws Exception {
		File file = new File((File) null, "");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputSource fileToInputSource(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToInputSource_11()
		throws Exception {
		File file = new File((File) null, "0123456789");

		InputSource result = TreeBuilder.fileToInputSource(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetTree_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();

		Element result = fixture.getTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 0;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture1_2()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 0;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		char[] ch = new char[] {'a'};
		int start = 7;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		char[] ch = new char[] {' '};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		char[] ch = new char[] {'\n'};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		char[] ch = new char[] {'a'};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture12_2()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture13_2()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_1()
		throws Exception {
		InputSource xmlInput = new InputSource("");
		boolean validateDTD = false;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_2()
		throws Exception {
		InputSource xmlInput = new InputSource(new ByteArrayInputStream("".getBytes()));
		boolean validateDTD = true;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_3()
		throws Exception {
		InputSource xmlInput = new InputSource(new StringReader(""));
		boolean validateDTD = true;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_4()
		throws Exception {
		InputSource xmlInput = new InputSource(new ByteArrayInputStream("".getBytes()));
		boolean validateDTD = false;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_5()
		throws Exception {
		InputSource xmlInput = new InputSource(new StringReader(""));
		boolean validateDTD = false;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXML_6()
		throws Exception {
		InputSource xmlInput = new InputSource("");
		boolean validateDTD = true;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testParseXML_7()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXML(InputSource,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testParseXML_8()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = false;

		Element result = TreeBuilder.parseXML(xmlInput, validateDTD);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String target = "";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String target = "0123456789";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture1_2()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String target = "";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testProcessingInstruction_fixture12_2()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String target = "0123456789";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Stack.java:102)
		//       at nu.staldal.xtree.TreeBuilder.processingInstruction(TreeBuilder.java:353)
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testReset_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetDocumentLocator_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSkippedEntity_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartDocument_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";
		String qname = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture1_2()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qname = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qname, atts);

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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture12_2()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String namespaceURI = "";
		String localName = "0123456789";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture14_2()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String namespaceURI = "";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture15_2()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture16_2()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture17_2()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture18_2()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartElement_fixture19_2()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String namespaceURI = "0123456789";
		String localName = "";
		String qname = "0123456789";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qname, atts);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		String prefix = "0";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture1_2()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture12_2()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		String prefix = "0";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture1_1()
		throws Exception {
		TreeBuilder fixture = getFixture1();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture2_1()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture3_1()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture4_1()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture5_1()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture6_1()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture7_1()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture8_1()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture9_1()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture10_1()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture11_1()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture12_1()
		throws Exception {
		TreeBuilder fixture = getFixture12();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture13_1()
		throws Exception {
		TreeBuilder fixture = getFixture13();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture14_1()
		throws Exception {
		TreeBuilder fixture = getFixture14();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture15_1()
		throws Exception {
		TreeBuilder fixture = getFixture15();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture16_1()
		throws Exception {
		TreeBuilder fixture = getFixture16();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture17_1()
		throws Exception {
		TreeBuilder fixture = getFixture17();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture18_1()
		throws Exception {
		TreeBuilder fixture = getFixture18();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture19_1()
		throws Exception {
		TreeBuilder fixture = getFixture19();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture20_1()
		throws Exception {
		TreeBuilder fixture = getFixture20();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture2_2()
		throws Exception {
		TreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture3_2()
		throws Exception {
		TreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture4_2()
		throws Exception {
		TreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture5_2()
		throws Exception {
		TreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture6_2()
		throws Exception {
		TreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture7_2()
		throws Exception {
		TreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture8_2()
		throws Exception {
		TreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture9_2()
		throws Exception {
		TreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture10_2()
		throws Exception {
		TreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testWarning_fixture11_2()
		throws Exception {
		TreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.warning(e);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(TreeBuilderTest.class);
	}
}