package nu.staldal.xtree;

import java.net.URL;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>ElementTest</code> contains tests for the class <code>{@link Element}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:55 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ElementTest {
	/**
	 * Run the Element(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_1()
		throws Exception {
		String namespaceURI = "";
		String localName = "";

		Element result = new Element(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_2()
		throws Exception {
		String namespaceURI = "";
		String localName = "";
		int numberOfAttributes = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_3()
		throws Exception {
		String namespaceURI = null;
		String localName = null;
		int numberOfAttributes = 1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_4()
		throws Exception {
		String namespaceURI = null;
		String localName = "";
		int numberOfAttributes = -1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_5()
		throws Exception {
		String namespaceURI = "";
		String localName = "";
		int numberOfAttributes = -1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_6()
		throws Exception {
		String namespaceURI = null;
		String localName = "";
		int numberOfAttributes = 1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Element(String,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testElement_7()
		throws Exception {
		String namespaceURI = "";
		String localName = "";
		int numberOfAttributes = 1;
		int numberOfChildren = 1;

		Element result = new Element(namespaceURI, localName, numberOfAttributes, numberOfChildren);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: nu/staldal/xtree/Element : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddAttribute_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "http://www.w3.org/XML/1998/namespace";
		String localName = "space";
		String type = "";
		String value = "default";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddAttribute_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "http://www.w3.org/XML/1998/namespace";
		String localName = "space";
		String type = "";
		String value = "";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddAttribute_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "http://www.w3.org/XML/1998/namespace";
		String localName = "space";
		String type = "";
		String value = "preserve";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddAttribute_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";
		String type = "";
		String value = "";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddAttribute_5()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "http://www.w3.org/XML/1998/namespace";
		String localName = "";
		String type = "";
		String value = "";

		fixture.addAttribute(namespaceURI, localName, type, value);

		// add additional test code here
	}

	/**
	 * Run the void addNamespaceMapping(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddNamespaceMapping_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String prefix = "";
		String URI = "";

		fixture.addNamespaceMapping(prefix, URI);

		// add additional test code here
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttrValue_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String localName = "";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String localName = "";

		String result = fixture.getAttrValue(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttrValue_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetAttrValue_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getAttrValue(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttrValueOrNull_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String localName = "";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValueOrNull(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetAttrValueOrNull_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String localName = "";

		String result = fixture.getAttrValueOrNull(localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttrValueOrNull_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttrValueOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetAttrValueOrNull_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getAttrValueOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeLocalName_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = -1;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeLocalName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeLocalName_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = 1;

		String result = fixture.getAttributeLocalName(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeNamespaceURI_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = -1;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeNamespaceURI(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeNamespaceURI_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = 1;

		String result = fixture.getAttributeNamespaceURI(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeType_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = -1;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeType(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeType_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = 1;

		String result = fixture.getAttributeType(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeValue_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = -1;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttributeValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetAttributeValue_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = 1;

		String result = fixture.getAttributeValue(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetBaseURI_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetBaseURI_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI((URL) null);
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getBaseURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetBaseURI_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI((URL) null);
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();

		URL result = fixture.getBaseURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElement_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElement();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElement_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetFirstChildElement_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElement(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetFirstChildElementOrNull_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetFirstChildElementOrNull_5()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		Element result = fixture.getFirstChildElementOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_6()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_7()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_8()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_9()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetFirstChildElementOrNull_10()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetFirstChildElementOrNull_11()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getFirstChildElementOrNull(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetFirstChildElementOrNull_12()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		Element result = fixture.getFirstChildElementOrNull(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetInheritedAttribute_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetInheritedAttribute_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInheritedAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetInheritedAttribute_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		String result = fixture.getInheritedAttribute(namespaceURI, localName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLocalName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetLocalName_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getLocalName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getNamespaceMapping(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetNamespaceMapping_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = 1;

		String[] result = fixture.getNamespaceMapping(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetNamespaceURI_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetPreserveSpace_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = 'p';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetPreserveSpace_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = 'd';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetPreserveSpace_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetPreserveSpace_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean getPreserveSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetPreserveSpace_5()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();

		boolean result = fixture.getPreserveSpace();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetTextContent_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTextContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetTextContent_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetTextContentOrNull_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetTextContentOrNull_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetTextContentOrNull_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetTextContentOrNull_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTextContentOrNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testGetTextContentOrNull_5()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		String result = fixture.getTextContentOrNull();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int lookupAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupAttribute_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String namespaceURI = "";
		String localName = "";

		int result = fixture.lookupAttribute(namespaceURI, localName);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespacePrefix_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String URI = "";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespacePrefix_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();
		String URI = "";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespacePrefix_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();
		String URI = "a";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespacePrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespacePrefix_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String URI = "";

		String result = fixture.lookupNamespacePrefix(URI);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespaceURI_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String prefix = "";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespaceURI_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();
		String prefix = "";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespaceURI_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = null;
		fixture.attrValue = new Vector();
		String prefix = "a";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String lookupNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testLookupNamespaceURI_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		String prefix = "";

		String result = fixture.lookupNamespaceURI(prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int numberOfAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testNumberOfAttributes_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		int result = fixture.numberOfAttributes();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfNamespaceMappings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testNumberOfNamespaceMappings_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();

		int result = fixture.numberOfNamespaceMappings();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOutputEndElement_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOutputEndElement_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testOutputEndElement_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputEndElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testOutputEndElement_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputEndElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOutputStartElement_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOutputStartElement_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOutputStartElement_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOutputStartElement_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testOutputStartElement_5()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void outputStartElement(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testOutputStartElement_6()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.outputStartElement(sax);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		int index = 1;

		fixture.removeAttribute(index);

		// add additional test code here
	}

	/**
	 * Run the void setBaseURI(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetBaseURI_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		URL URI = new URL("");

		fixture.setBaseURI(URI);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceMappings(Vector,Vector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetNamespaceMappings_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		Vector prefixes = new Vector();
		Vector URIs = new Vector();

		fixture.setNamespaceMappings(prefixes, URIs);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testToSAX_1()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testToSAX_2()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testToSAX_3()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testToSAX_4()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testToSAX_5()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
		ContentHandler sax = new DefaultHandler();

		fixture.toSAX(sax);

		// add additional test code here
	}

	/**
	 * Run the void toSAX(ContentHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.IndexOutOfBoundsException.class)
	public void testToSAX_6()
		throws Exception {
		Element fixture = new Element("", "", 1, 1);
		fixture.setNamespaceMappings(new Vector(), new Vector());
		fixture.setBaseURI(new URL(""));
		fixture.addChild(new Text(""));
		fixture.attrName = new Vector();
		fixture.attrType = new Vector();
		fixture.xmlSpaceAttribute = '';
		fixture.parent = new Element("", "");
		fixture.attrValue = new Vector();
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ElementTest.class);
	}
}