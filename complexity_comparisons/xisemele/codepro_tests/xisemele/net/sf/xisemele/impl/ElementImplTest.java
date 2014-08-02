package net.sf.xisemele.impl;

import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.xisemele.api.Element;
import net.sf.xisemele.exception.ChildNotFoundException;
import net.sf.xisemele.api.ValueList;
import org.junit.*;
import net.sf.xisemele.api.Attribute;
import net.sf.xisemele.api.Value;
import static org.junit.Assert.*;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import net.sf.xisemele.exception.ElementIndexOutOfBoundsException;

/**
 * The class <code>ElementImplTest</code> contains tests for the class <code>{@link ElementImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ElementImplTest {
	/**
	 * Run the ElementImpl(Factory,Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElementImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		Node node = new IIOMetadataNode();

		ElementImpl result = new ElementImpl(factory, node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/ElementImpl : Unsupported major.minor version 51.0
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
	 * Run the Value attribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		Value result = fixture.attribute(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Attribute> attributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttributes_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		List<Attribute> result = fixture.attributes();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element child(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChild_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		int index = 1;

		Element result = fixture.child(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element child(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ElementIndexOutOfBoundsException.class)
	public void testChild_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		int index = 1;

		Element result = fixture.child(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element child(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChild_3()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		Element result = fixture.child(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element child(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ChildNotFoundException.class)
	public void testChild_4()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		Element result = fixture.child(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Element> children() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChildren_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		List<Element> result = fixture.children();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Element> children(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChildren_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		List<Element> result = fixture.children(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ValueList childrenValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChildrenValue_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		ValueList result = fixture.childrenValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ValueList childrenValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testChildrenValue_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		ValueList result = fixture.childrenValue(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean containsAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttribute_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		boolean result = fixture.containsAttribute(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttribute_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		boolean result = fixture.containsAttribute(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttributes_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		boolean result = fixture.containsAttributes();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsAttributes_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		boolean result = fixture.containsAttributes();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChild_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		boolean result = fixture.containsChild(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChild_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		boolean result = fixture.containsChild(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChildren_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		boolean result = fixture.containsChildren();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsChildren_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		boolean result = fixture.containsChildren();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		String result = fixture.name();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node node() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNode_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Node result = fixture.node();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNumberOfChildren_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfChildren(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNumberOfChildren_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());
		String name = "";

		int result = fixture.numberOfChildren(name);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String path() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testPath_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		String result = fixture.path();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Value value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_1()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Value result = fixture.value();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Value value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_2()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Value result = fixture.value();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Value value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testValue_3()
		throws Exception {
		ElementImpl fixture = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Value result = fixture.value();

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
		new org.junit.runner.JUnitCore().run(ElementImplTest.class);
	}
}