package net.sf.xisemele.impl;

import java.util.Date;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.xisemele.exception.WithinContextDuplicateException;
import net.sf.xisemele.exception.RemoveRootNotPermittedException;
import net.sf.xisemele.exception.ValueNotPermittedException;
import org.junit.*;
import net.sf.xisemele.exception.ElementNotFoundException;
import net.sf.xisemele.exception.RootDuplicateException;
import net.sf.xisemele.exception.WithinContextNotPermittedException;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import net.sf.xisemele.api.Result;
import net.sf.xisemele.exception.InvalidNameException;
import net.sf.xisemele.exception.AttributeNotPermittedException;
import net.sf.xisemele.api.Element;
import net.sf.xisemele.exception.NotWithinContextException;
import net.sf.xisemele.api.Editor;
import org.w3c.dom.Node;

/**
 * The class <code>EditorImplTest</code> contains tests for the class <code>{@link EditorImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class EditorImplTest {
	/**
	 * Run the EditorImpl(WriterEditor) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEditorImpl_1()
		throws Exception {
		WriterEditor writerEditor = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null);

		EditorImpl result = new EditorImpl(writerEditor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/EditorImpl : Unsupported major.minor version 51.0
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
	 * Run the Editor attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.attribute(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.AttributeNotPermittedException.class)
	public void testAttribute_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.attribute(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAttribute_3()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.attribute(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_4()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.attribute(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.AttributeNotPermittedException.class)
	public void testAttribute_5()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.attribute(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAttribute_6()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.attribute(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
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
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
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
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String path = "";

		boolean result = fixture.containsElement(path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Editor defineAsCurrent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testDefineAsCurrent_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String path = "";

		Editor result = fixture.defineAsCurrent(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor defineAsCurrent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ElementNotFoundException.class)
	public void testDefineAsCurrent_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String path = "";

		Editor result = fixture.defineAsCurrent(path);

		// add additional test code here
		assertNotNull(result);
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
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Document result = fixture.document();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Editor result = fixture.element(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Editor result = fixture.element(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_3()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Editor result = fixture.element(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_4()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Element element = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Editor result = fixture.element(element);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_5()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Element element = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Editor result = fixture.element(element);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_6()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_7()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_8()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testElement_9()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Editor result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_10()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.element(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_11()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.element(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_12()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.element(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testElement_13()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.element(name, value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEndWithin_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.endWithin();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.NotWithinContextException.class)
	public void testEndWithin_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.endWithin();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.remove();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor remove() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RemoveRootNotPermittedException.class)
	public void testRemove_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.remove();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor removeAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Editor result = fixture.removeAttribute(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor removeAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveAttributes_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.removeAttributes();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor removeChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChild_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Editor result = fixture.removeChild(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor removeChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChildren_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.removeChildren();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor removeChildren(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRemoveChildren_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Editor result = fixture.removeChildren(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor rename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testRename_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String newName = "";

		Editor result = fixture.rename(newName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor rename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testRename_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String newName = "";

		Editor result = fixture.rename(newName);

		// add additional test code here
		assertNotNull(result);
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
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Result result = fixture.result();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Object value = new Object();

		Editor result = fixture.value(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor value(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testValue_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Object value = new Object();

		Editor result = fixture.value(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor value(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testValue_3()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.value(value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor value(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testValue_4()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Date value = new Date();
		String pattern = "";

		Editor result = fixture.value(value, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWithin_1()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.within();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.WithinContextDuplicateException.class)
	public void testWithin_2()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.within();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Editor within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.WithinContextNotPermittedException.class)
	public void testWithin_3()
		throws Exception {
		EditorImpl fixture = new EditorImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Editor result = fixture.within();

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
		new org.junit.runner.JUnitCore().run(EditorImplTest.class);
	}
}