package net.sf.xisemele.impl;

import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.xisemele.exception.ElementNotFoundException;
import static org.junit.Assert.*;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * The class <code>OperationsImplTest</code> contains tests for the class <code>{@link OperationsImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OperationsImplTest {
	/**
	 * Run the OperationsImpl(OperationsHelper) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testOperationsImpl_1()
		throws Exception {
		OperationsHelper operationsHelper = new OperationsHelperImpl();

		OperationsImpl result = new OperationsImpl(operationsHelper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/OperationsImpl : Unsupported major.minor version 51.0
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
	 * Run the String attributeValue(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttributeValue_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		String result = fixture.attributeValue(node, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String attributeValue(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testAttributeValue_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		String result = fixture.attributeValue(node, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Node> attributes(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttributes_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		List<Node> result = fixture.attributes(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Node> attributes(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttributes_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		List<Node> result = fixture.attributes(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node child(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChild_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		int index = 1;

		Node result = fixture.child(node, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node child(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChild_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		int index = -1;

		Node result = fixture.child(node, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node child(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChild_3()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		int index = 1;

		Node result = fixture.child(node, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node child(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChild_4()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		Node result = fixture.child(node, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Node> children(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChildren_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		List<Node> result = fixture.children(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Node> children(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChildren_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		List<Node> result = fixture.children(node, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean containsAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttribute_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		boolean result = fixture.containsAttribute(node, name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttribute_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		boolean result = fixture.containsAttribute(node, name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsAttributes(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttributes_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsAttributes(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsAttributes(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttributes_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsAttributes(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChild(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChild_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		boolean result = fixture.containsChild(node, name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChild(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChild_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		boolean result = fixture.containsChild(node, name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChildren(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChildren_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsChildren(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChildren(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChildren_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsChildren(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsElement(Document,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsElement_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Document document = null;
		String path = "";

		boolean result = fixture.containsElement(document, path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsElement(Document,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsElement_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Document document = null;
		String path = "";

		boolean result = fixture.containsElement(document, path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsValue(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsValue_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsValue(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsValue(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsValue_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsValue(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsValue(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsValue_3()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsValue(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsValue(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testContainsValue_4()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.containsValue(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Node find(Document,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testFind_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Document document = null;
		String path = "";

		Node result = fixture.find(document, path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node find(Document,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ElementNotFoundException.class)
	public void testFind_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Document document = null;
		String path = "";

		Node result = fixture.find(document, path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRootElement(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testIsRootElement_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.isRootElement(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRootElement(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testIsRootElement_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		boolean result = fixture.isRootElement(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the int numberOfChildren(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNumberOfChildren_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		int result = fixture.numberOfChildren(node);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfChildren(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNumberOfChildren_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();
		String name = "";

		int result = fixture.numberOfChildren(node, name);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String path(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testPath_1()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		String result = fixture.path(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String path(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testPath_2()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		String result = fixture.path(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String path(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testPath_3()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		String result = fixture.path(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String path(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testPath_4()
		throws Exception {
		OperationsImpl fixture = new OperationsImpl(new OperationsHelperImpl());
		Node node = new IIOMetadataNode();

		String result = fixture.path(node);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OperationsImplTest.class);
	}
}