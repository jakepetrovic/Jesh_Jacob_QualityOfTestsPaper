package nu.staldal.xtree;

import java.io.ByteArrayInputStream;
import nu.staldal.lsp.compiledexpr.BuiltInFunctionCall;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import nu.staldal.lsp.compile.LSPForEach;
import nu.staldal.lsp.compile.LSPIf;
import nu.staldal.lsp.compiler.LSPExpr;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import nu.staldal.lsp.compiledexpr.ExtensionFunctionCall;
import nu.staldal.lsp.compile.LSPNode;

/**
 * The class <code>SequentialTreeBuilderTest</code> contains tests for the class <code>{@link SequentialTreeBuilder}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SequentialTreeBuilderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private SequentialTreeBuilder fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SequentialTreeBuilder((ElementHandler) null);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new SequentialTreeBuilder((ElementHandler) null);
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
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
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new SequentialTreeBuilder((ElementHandler) null, new URL("http://www.eclipse.org"));
			fixture20.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture20.startPrefixMapping("", "");
			fixture20.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture22.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture22.startPrefixMapping("", "");
			fixture22.startPrefixMapping("", "");
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture23.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture23.startPrefixMapping("", "");
			fixture23.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture24.setDocumentLocator(new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture24.startPrefixMapping("", "");
			fixture24.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture25.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture25.startPrefixMapping("", "");
			fixture25.startPrefixMapping("", "");
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture26.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture26.startPrefixMapping("", "");
			fixture26.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture27.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));
			fixture27.startPrefixMapping("", "");
			fixture27.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture28.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture28.startPrefixMapping("", "");
			fixture28.startPrefixMapping("", "");
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture29.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture29.startPrefixMapping("", "");
			fixture29.startPrefixMapping("0123456789", "0123456789");
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SequentialTreeBuilder
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public SequentialTreeBuilder getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
			fixture30.setDocumentLocator(new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null));
			fixture30.startPrefixMapping("", "");
			fixture30.startPrefixMapping("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture30;
	}

	/**
	 * Run the SequentialTreeBuilder(ElementHandler) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSequentialTreeBuilder_1()
		throws Exception {
		ElementHandler handler = null;

		SequentialTreeBuilder result = new SequentialTreeBuilder(handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SequentialTreeBuilder(ElementHandler,URL) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSequentialTreeBuilder_2()
		throws Exception {
		ElementHandler handler = null;
		URL base = null;

		SequentialTreeBuilder result = new SequentialTreeBuilder(handler, base);

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
	public void testCharacters_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		char[] ch = new char[] {'\n'};
		int start = 7;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		char[] ch = new char[] {'�'};
		int start = 0;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		char[] ch = new char[] {' ', '\n', 'a', '�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		char[] ch = new char[] {' '};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		char[] ch = new char[] {'\n'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		char[] ch = new char[] {'a'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testCharacters_fixture1_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndDocument_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";
		String qName = "";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture1_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

		// add additional test code here
	}

	/**
	 * Run the void endElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEndElement_fixture2_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String namespaceURI = "";
		String localName = "";
		String qName = "0123456789";

		fixture.endElement(namespaceURI, localName, qName);

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
	public void testEndPrefixMapping_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String prefix = "";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

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
	public void testEndPrefixMapping_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		String prefix = "0";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testError_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testFatalError_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRootElement_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();

		Element result = fixture.getRootElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIgnorableWhitespace_fixture1_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		char[] ch = new char[] {'�'};
		int start = 1;
		int length = 7;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_1()
		throws Exception {
		InputSource xmlInput = new InputSource("");
		boolean validateDTD = false;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_2()
		throws Exception {
		InputSource xmlInput = new InputSource(new ByteArrayInputStream("".getBytes()));
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_3()
		throws Exception {
		InputSource xmlInput = new InputSource(new StringReader(""));
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_4()
		throws Exception {
		InputSource xmlInput = new InputSource(new ByteArrayInputStream("".getBytes()));
		boolean validateDTD = false;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_5()
		throws Exception {
		InputSource xmlInput = new InputSource(new StringReader(""));
		boolean validateDTD = false;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParseXMLSequential_6()
		throws Exception {
		InputSource xmlInput = new InputSource("");
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testParseXMLSequential_7()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = true;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element parseXMLSequential(InputSource,boolean,ElementHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testParseXMLSequential_8()
		throws Exception {
		InputSource xmlInput = new InputSource();
		boolean validateDTD = false;
		ElementHandler handler = null;

		Element result = SequentialTreeBuilder.parseXMLSequential(xmlInput, validateDTD, handler);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessingInstruction_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String target = "";
		String data = "";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String target = "0123456789";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testProcessingInstruction_fixture1_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String target = "";
		String data = "0123456789";

		fixture.processingInstruction(target, data);

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
	public void testSetDocumentLocator_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

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
	public void testSetDocumentLocator_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		Locator locator = null;

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSkippedEntity_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		String name = "0123456789";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartDocument_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String namespaceURI = "";
		String localName = "";
		String qName = "";
		Attributes atts = new Attributes2Impl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "0123456789";
		Attributes atts = new Attributes2Impl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl();

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
	}

	/**
	 * Run the void startElement(String,String,String,Attributes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartElement_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "0123456789";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		String namespaceURI = "0123456789";
		String localName = "";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		String namespaceURI = "";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture1_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture2_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

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
	public void testStartElement_fixture4_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		String namespaceURI = "0123456789";
		String localName = "0123456789";
		String qName = "";
		Attributes atts = new AttributesImpl((Attributes) null);

		fixture.startElement(namespaceURI, localName, qName, atts);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.xml.sax.helpers.AttributesImpl.setAttributes(AttributesImpl.java:372)
		//       at org.xml.sax.helpers.AttributesImpl.<init>(AttributesImpl.java:99)
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStartPrefixMapping_fixture1_2()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		String prefix = "";
		String uri = "0123456789";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture1_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture1();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture2_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture2();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture3_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture3();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture4_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture4();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture5_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture5();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture6_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture6();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture7_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture7();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture8_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture8();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture9_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture9();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture10_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture10();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture11_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture11();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture12_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture12();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture13_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture13();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture14_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture14();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture15_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture15();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture16_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture16();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture17_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture17();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture18_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture18();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture19_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture19();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture20_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture20();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture21_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture21();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture22_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture22();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture23_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture23();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture24_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture24();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture25_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture25();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture26_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture26();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture27_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture27();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture28_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture28();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture29_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture29();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testWarning_fixture30_1()
		throws Exception {
		SequentialTreeBuilder fixture = getFixture30();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture.warning(e);

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
		new org.junit.runner.JUnitCore().run(SequentialTreeBuilderTest.class);
	}
}