package nu.staldal.xodus;

import java.util.Properties;
import javax.xml.transform.stream.StreamResult;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;

/**
 * The class <code>XMLSerializerTest</code> contains tests for the class <code>{@link XMLSerializer}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XMLSerializerTest {
	/**
	 * Run the XMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testXMLSerializer_1()
		throws Exception {
		StreamResult result = new StreamResult();
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = false;

		XMLSerializer result2 = new XMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the XMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testXMLSerializer_2()
		throws Exception {
		StreamResult result = new StreamResult();
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;

		XMLSerializer result2 = new XMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAttributeDecl_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAttributeDecl_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = null;
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAttributeDecl_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = null;

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAttributeDecl_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = null;
		String value = null;

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_10()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_11()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_12()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_13()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = null;
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_14()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_15()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void attributeDecl(String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testAttributeDecl_16()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String eName = "";
		String aName = "";
		String type = "";
		String mode = "";
		String value = "";

		fixture.attributeDecl(eName, aName, type, mode, value);

		// add additional test code here
	}

	/**
	 * Run the void characters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCharacters_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_10()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_11()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_12()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testCharacters_13()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.characters(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void comment(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testComment_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.comment(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void comment(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testComment_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.comment(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void comment(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testComment_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.comment(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void comment(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testComment_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.comment(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void comment(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testComment_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.comment(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void comment(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testComment_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.comment(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testElementDecl_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testElementDecl_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testElementDecl_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testElementDecl_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testElementDecl_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testElementDecl_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void elementDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testElementDecl_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String model = "";

		fixture.elementDecl(name, model);

		// add additional test code here
	}

	/**
	 * Run the void endCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndCDATA_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endCDATA();

		// add additional test code here
	}

	/**
	 * Run the void endCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndCDATA_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endCDATA();

		// add additional test code here
	}

	/**
	 * Run the void endCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndCDATA_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endCDATA();

		// add additional test code here
	}

	/**
	 * Run the void endCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndCDATA_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endCDATA();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDTD_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDTD_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDTD_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDTD_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDTD_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDTD_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDTD() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDTD_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDTD();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDocument_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndDocument_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDocument_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDocument_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testEndDocument_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.endDocument();

		// add additional test code here
	}

	/**
	 * Run the void endEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndEntity_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";

		fixture.endEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void endPrefixMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testEndPrefixMapping_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String prefix = "";

		fixture.endPrefixMapping(prefix);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testExternalEntityDecl_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testExternalEntityDecl_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testExternalEntityDecl_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testExternalEntityDecl_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testExternalEntityDecl_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testExternalEntityDecl_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testExternalEntityDecl_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void externalEntityDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testExternalEntityDecl_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String publicId = "";
		String systemId = "";

		fixture.externalEntityDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void ignorableWhitespace(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testIgnorableWhitespace_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testIgnorableWhitespace_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		char[] ch = new char[] {};
		int start = 1;
		int length = 1;

		fixture.ignorableWhitespace(ch, start, length);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInternalEntityDecl_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInternalEntityDecl_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testInternalEntityDecl_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testInternalEntityDecl_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testInternalEntityDecl_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testInternalEntityDecl_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testInternalEntityDecl_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void internalEntityDecl(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testInternalEntityDecl_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";
		String value = "";

		fixture.internalEntityDecl(name, value);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNotationDecl_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = null;

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNotationDecl_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = null;
		String systemId = "";

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNotationDecl_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = null;
		String systemId = null;

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = null;
		String systemId = "";

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = null;
		String systemId = "";

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = null;

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = null;

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = null;

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void notationDecl(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testNotationDecl_10()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.notationDecl(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessingInstruction_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "a";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessingInstruction_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = null;

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessingInstruction_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessingInstruction_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "javax.xml.transform.enable-output-escaping";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessingInstruction_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "javax.xml.transform.disable-output-escaping";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_10()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "a";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_11()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "a";
		String data = "a";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testProcessingInstruction_12()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testProcessingInstruction_13()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = null;
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void processingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testProcessingInstruction_14()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String target = "";
		String data = "";

		fixture.processingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void setDocumentLocator(Locator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetDocumentLocator_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		Locator locator = new Locator2Impl();

		fixture.setDocumentLocator(locator);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSkippedEntity_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSkippedEntity_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "[dtd]";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSkippedEntity_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void skippedEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testSkippedEntity_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "aa";

		fixture.skippedEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void startCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartCDATA_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startCDATA();

		// add additional test code here
	}

	/**
	 * Run the void startCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartCDATA_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startCDATA();

		// add additional test code here
	}

	/**
	 * Run the void startCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartCDATA_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startCDATA();

		// add additional test code here
	}

	/**
	 * Run the void startCDATA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartCDATA_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startCDATA();

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = null;

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDTD_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = null;

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDTD_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDTD_10()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDTD_11()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDTD(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDTD_12()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";

		fixture.startDTD(name, publicId, systemId);

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = false;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = false;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_10()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_11()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_12()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartDocument_13()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDocument_14()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDocument_15()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStartDocument_16()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());

		fixture.startDocument();

		// add additional test code here
	}

	/**
	 * Run the void startEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartEntity_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";

		fixture.startEntity(name);

		// add additional test code here
	}

	/**
	 * Run the void startPrefixMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartPrefixMapping_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStartPrefixMapping_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String prefix = "";
		String uri = "";

		fixture.startPrefixMapping(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testUnparsedEntityDecl_1()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_2()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_3()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_4()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_5()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_6()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_7()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_8()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Run the void unparsedEntityDecl(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testUnparsedEntityDecl_9()
		throws Exception {
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());
		outputConfig.isXhtml = true;
		XMLSerializer fixture = new XMLSerializer(new StreamResult(), outputConfig);
		fixture.startCDATA();
		fixture.startElement("", "", "", new Attributes2Impl());
		String name = "";
		String publicId = "";
		String systemId = "";
		String notationName = "";

		fixture.unparsedEntityDecl(name, publicId, systemId, notationName);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XMLSerializerTest.class);
	}
}