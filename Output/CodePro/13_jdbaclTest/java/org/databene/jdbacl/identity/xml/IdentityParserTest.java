package org.databene.jdbacl.identity.xml;

import javax.imageio.metadata.IIOMetadataNode;
import org.apache.html.dom.HTMLAnchorElementImpl;
import org.apache.html.dom.HTMLAppletElementImpl;
import org.apache.html.dom.HTMLAreaElementImpl;
import org.apache.html.dom.HTMLBRElementImpl;
import org.apache.html.dom.HTMLBaseElementImpl;
import org.apache.html.dom.HTMLBaseFontElementImpl;
import org.apache.html.dom.HTMLBodyElementImpl;
import org.apache.html.dom.HTMLButtonElementImpl;
import org.apache.html.dom.HTMLDListElementImpl;
import org.apache.html.dom.HTMLDirectoryElementImpl;
import org.apache.html.dom.HTMLDivElementImpl;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.html.dom.HTMLElementImpl;
import org.apache.html.dom.HTMLFieldSetElementImpl;
import org.apache.html.dom.HTMLFontElementImpl;
import org.apache.html.dom.HTMLFormElementImpl;
import org.apache.html.dom.HTMLFrameElementImpl;
import org.databene.jdbacl.identity.IdentityModel;
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.webdecs.xml.ParseContext;
import org.databene.webdecs.xml.XMLElementParserFactory;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>IdentityParserTest</code> contains tests for the class <code>{@link IdentityParser}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class IdentityParserTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityParser
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityParser fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityParser
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityParser getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new IdentityParser();
		}
		return fixture;
	}

	/**
	 * Run the IdentityParser() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIdentityParser_1()
		throws Exception {

		IdentityParser result = new IdentityParser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String createCheckName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateCheckName_1()
		throws Exception {
		String tableName = "";
		String type = "";

		String result = IdentityParser.createCheckName(tableName, type);

		// add additional test code here
		assertEquals("-identity-", result);
	}

	/**
	 * Run the String createCheckName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateCheckName_2()
		throws Exception {
		String tableName = "0123456789";
		String type = "0123456789";

		String result = IdentityParser.createCheckName(tableName, type);

		// add additional test code here
		assertEquals("0123456789-identity-0123456789", result);
	}

	/**
	 * Run the String createCheckName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateCheckName_3()
		throws Exception {
		String tableName = "0123456789";
		String type = "";

		String result = IdentityParser.createCheckName(tableName, type);

		// add additional test code here
		assertEquals("0123456789-identity-", result);
	}

	/**
	 * Run the String createCheckName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateCheckName_4()
		throws Exception {
		String tableName = "";
		String type = "0123456789";

		String result = IdentityParser.createCheckName(tableName, type);

		// add additional test code here
		assertEquals("-identity-0123456789", result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_1()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new IIOMetadataNode("");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new IdentityParseContext();

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Syntax error: 'type' attribute expected in </>
		//       
		//       at org.databene.webdecs.xml.AbstractXMLElementParser.syntaxError(AbstractXMLElementParser.java:179)
		//       at org.databene.webdecs.xml.AbstractXMLElementParser.getRequiredAttribute(AbstractXMLElementParser.java:163)
		//       at org.databene.jdbacl.identity.xml.IdentityParser.doParse(IdentityParser.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_2()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLAnchorElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new IdentityParseContext(new IdentityProvider());

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Syntax error: 'type' attribute expected in </>
		//       
		//       at org.databene.webdecs.xml.AbstractXMLElementParser.syntaxError(AbstractXMLElementParser.java:179)
		//       at org.databene.webdecs.xml.AbstractXMLElementParser.getRequiredAttribute(AbstractXMLElementParser.java:163)
		//       at org.databene.jdbacl.identity.xml.IdentityParser.doParse(IdentityParser.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_3()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLAppletElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName(""));

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_4()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLAreaElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName(""), new XMLElementParserFactory());

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_5()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBRElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_6()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBRElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_7()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBaseElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_8()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBaseElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_9()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBaseFontElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_10()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBaseFontElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_11()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBodyElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_12()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLBodyElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_13()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLButtonElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_14()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLButtonElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_15()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLDListElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_16()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLDListElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_17()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLDirectoryElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_18()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLDirectoryElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_19()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLDivElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_20()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLDivElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_21()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_22()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_23()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFieldSetElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_24()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFieldSetElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_25()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFontElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_26()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFontElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_27()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFormElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_28()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFormElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_29()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFrameElementImpl(new HTMLDocumentImpl(), "");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the IdentityModel doParse(Element,Object[],ParseContext<Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDoParse_fixture_30()
		throws Exception {
		IdentityParser fixture2 = getFixture();
		Element element = new HTMLFrameElementImpl((HTMLDocumentImpl) null, "0123456789");
		Object[] parentPath = new Object[] {new Object(), null};
		ParseContext<Object> context = new ParseContext(Class.forName("", false, ClassLoader.getSystemClassLoader()), (XMLElementParserFactory<Object>) null);

		IdentityModel result = fixture2.doParse(element, parentPath, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IdentityParserTest.class);
	}
}