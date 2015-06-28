package net.sf.xisemele.impl;

import java.util.Date;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.xisemele.api.Result;
import net.sf.xisemele.exception.InvalidNameException;
import net.sf.xisemele.exception.AttributeNotPermittedException;
import net.sf.xisemele.exception.NotWithinContextException;
import net.sf.xisemele.exception.WithinContextDuplicateException;
import net.sf.xisemele.exception.RemoveRootNotPermittedException;
import org.junit.*;
import net.sf.xisemele.exception.ElementNotFoundException;
import net.sf.xisemele.exception.RootDuplicateException;
import net.sf.xisemele.exception.WithinContextNotPermittedException;
import static org.junit.Assert.*;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import net.sf.xisemele.exception.ValueNotPermittedException;

/**
 * The class <code>WriterEditorImplTest</code> contains tests for the class <code>{@link WriterEditorImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WriterEditorImplTest {
	/**
	 * Run the WriterEditorImpl(Factory,FormatterProvider,Document) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWriterEditorImpl_1()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		FormatterProvider provider = new FormatterProviderImpl();
		Document document = null;

		WriterEditorImpl result = new WriterEditorImpl(factory, provider, document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/WriterEditorImpl : Unsupported major.minor version 51.0
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
	 * Run the WriterEditorImpl(Factory,FormatterProvider,Document,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWriterEditorImpl_2()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		FormatterProvider provider = new FormatterProviderImpl();
		Document document = null;
		String rootName = "";

		WriterEditorImpl result = new WriterEditorImpl(factory, provider, document, rootName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/WriterEditorImpl : Unsupported major.minor version 51.0
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
	 * Run the WriterEditorImpl(Factory,FormatterProvider,Document,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWriterEditorImpl_3()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		FormatterProvider provider = new FormatterProviderImpl();
		Document document = null;
		String rootName = "";

		WriterEditorImpl result = new WriterEditorImpl(factory, provider, document, rootName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/WriterEditorImpl : Unsupported major.minor version 51.0
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
	 * Run the WriterEditorImpl(Factory,FormatterProvider,Document,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWriterEditorImpl_4()
		throws Exception {
		Factory factory = new FactoryImpl(new FormatterProviderImpl());
		FormatterProvider provider = new FormatterProviderImpl();
		Document document = null;
		String rootName = "";

		WriterEditorImpl result = new WriterEditorImpl(factory, provider, document, rootName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/WriterEditorImpl : Unsupported major.minor version 51.0
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
	 * Run the void attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";
		Object value = new Object();

		fixture.attribute(name, value);

		// add additional test code here
	}

	/**
	 * Run the void attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.AttributeNotPermittedException.class)
	public void testAttribute_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";
		Object value = new Object();

		fixture.attribute(name, value);

		// add additional test code here
	}

	/**
	 * Run the void attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAttribute_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";
		Object value = new Object();

		fixture.attribute(name, value);

		// add additional test code here
	}

	/**
	 * Run the void attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_4()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";
		Date value = new Date();
		String pattern = "";

		fixture.attribute(name, value, pattern);

		// add additional test code here
	}

	/**
	 * Run the void attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.AttributeNotPermittedException.class)
	public void testAttribute_5()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";
		Date value = new Date();
		String pattern = "";

		fixture.attribute(name, value, pattern);

		// add additional test code here
	}

	/**
	 * Run the void attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAttribute_6()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";
		Date value = new Date();
		String pattern = "";

		fixture.attribute(name, value, pattern);

		// add additional test code here
	}

	/**
	 * Run the boolean containsElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsElement_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String path = "";

		boolean result = fixture.containsElement(path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testContainsElement_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String path = "";

		boolean result = fixture.containsElement(path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void defineAsCurrent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testDefineAsCurrent_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String path = "";

		fixture.defineAsCurrent(path);

		// add additional test code here
	}

	/**
	 * Run the void defineAsCurrent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ElementNotFoundException.class)
	public void testDefineAsCurrent_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String path = "";

		fixture.defineAsCurrent(path);

		// add additional test code here
	}

	/**
	 * Run the Document document() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testDocument_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		Document result = fixture.document();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.element(name);

		// add additional test code here
	}

	/**
	 * Run the void element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.element(name);

		// add additional test code here
	}

	/**
	 * Run the void element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.element(name);

		// add additional test code here
	}

	/**
	 * Run the void element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testElement_4()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.element(name);

		// add additional test code here
	}

	/**
	 * Run the void endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEndWithin_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.endWithin();

		// add additional test code here
	}

	/**
	 * Run the void endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEndWithin_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.endWithin();

		// add additional test code here
	}

	/**
	 * Run the void endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.NotWithinContextException.class)
	public void testEndWithin_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.endWithin();

		// add additional test code here
	}

	/**
	 * Run the Node getCurrent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testGetCurrent_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		Node result = fixture.getCurrent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void node(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNode_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Node node = new IIOMetadataNode();

		fixture.node(node);

		// add additional test code here
	}

	/**
	 * Run the void node(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testNode_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Node node = new IIOMetadataNode();

		fixture.node(node);

		// add additional test code here
	}

	/**
	 * Run the void node(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testNode_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Node node = new IIOMetadataNode();

		fixture.node(node);

		// add additional test code here
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.remove();

		// add additional test code here
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RemoveRootNotPermittedException.class)
	public void testRemove_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.remove();

		// add additional test code here
	}

	/**
	 * Run the void remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRemove_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.remove();

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeAttribute(name);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRemoveAttribute_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeAttribute(name);

		// add additional test code here
	}

	/**
	 * Run the void removeAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveAttributes_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.removeAttributes();

		// add additional test code here
	}

	/**
	 * Run the void removeAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveAttributes_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.removeAttributes();

		// add additional test code here
	}

	/**
	 * Run the void removeAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRemoveAttributes_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.removeAttributes();

		// add additional test code here
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChild_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeChild(name);

		// add additional test code here
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChild_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeChild(name);

		// add additional test code here
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRemoveChild_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeChild(name);

		// add additional test code here
	}

	/**
	 * Run the void removeChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChildren_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.removeChildren();

		// add additional test code here
	}

	/**
	 * Run the void removeChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChildren_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.removeChildren();

		// add additional test code here
	}

	/**
	 * Run the void removeChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRemoveChildren_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.removeChildren();

		// add additional test code here
	}

	/**
	 * Run the void removeChildren(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChildren_4()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeChildren(name);

		// add additional test code here
	}

	/**
	 * Run the void removeChildren(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChildren_5()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeChildren(name);

		// add additional test code here
	}

	/**
	 * Run the void removeChildren(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRemoveChildren_6()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String name = "";

		fixture.removeChildren(name);

		// add additional test code here
	}

	/**
	 * Run the void rename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRename_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String newName = "";

		fixture.rename(newName);

		// add additional test code here
	}

	/**
	 * Run the void rename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testRename_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String newName = "";

		fixture.rename(newName);

		// add additional test code here
	}

	/**
	 * Run the void rename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testRename_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		String newName = "";

		fixture.rename(newName);

		// add additional test code here
	}

	/**
	 * Run the Result result() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testResult_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		Result result = fixture.result();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Object value = new Object();

		fixture.value(value);

		// add additional test code here
	}

	/**
	 * Run the void value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Object value = null;

		fixture.value(value);

		// add additional test code here
	}

	/**
	 * Run the void value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testValue_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Object value = new Object();

		fixture.value(value);

		// add additional test code here
	}

	/**
	 * Run the void value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testValue_4()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Object value = new Object();

		fixture.value(value);

		// add additional test code here
	}

	/**
	 * Run the void value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testValue_5()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Object value = new Object();

		fixture.value(value);

		// add additional test code here
	}

	/**
	 * Run the void value(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_6()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Date date = new Date();
		String pattern = "";

		fixture.value(date, pattern);

		// add additional test code here
	}

	/**
	 * Run the void value(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testValue_7()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Date date = new Date();
		String pattern = "";

		fixture.value(date, pattern);

		// add additional test code here
	}

	/**
	 * Run the void value(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = org.w3c.dom.DOMException.class)
	public void testValue_8()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");
		Date date = new Date();
		String pattern = "";

		fixture.value(date, pattern);

		// add additional test code here
	}

	/**
	 * Run the void within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWithin_1()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.within();

		// add additional test code here
	}

	/**
	 * Run the void within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.WithinContextDuplicateException.class)
	public void testWithin_2()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.within();

		// add additional test code here
	}

	/**
	 * Run the void within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.WithinContextNotPermittedException.class)
	public void testWithin_3()
		throws Exception {
		WriterEditorImpl fixture = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null, "");

		fixture.within();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(WriterEditorImplTest.class);
	}
}