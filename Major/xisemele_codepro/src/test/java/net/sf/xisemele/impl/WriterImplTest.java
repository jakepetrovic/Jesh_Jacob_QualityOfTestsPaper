package net.sf.xisemele.impl;

import java.util.Date;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.xisemele.api.Result;
import net.sf.xisemele.exception.InvalidNameException;
import net.sf.xisemele.exception.AttributeNotPermittedException;
import net.sf.xisemele.api.Element;
import net.sf.xisemele.exception.NotWithinContextException;
import net.sf.xisemele.exception.WithinContextDuplicateException;
import org.junit.*;
import net.sf.xisemele.api.Writer;
import net.sf.xisemele.exception.RootDuplicateException;
import net.sf.xisemele.exception.WithinContextNotPermittedException;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import net.sf.xisemele.exception.ValueNotPermittedException;

/**
 * The class <code>WriterImplTest</code> contains tests for the class <code>{@link WriterImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WriterImplTest {
	/**
	 * Run the WriterImpl(WriterEditor) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWriterImpl_1()
		throws Exception {
		WriterEditor writerEditor = new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null);

		WriterImpl result = new WriterImpl(writerEditor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/xisemele/impl/WriterImpl : Unsupported major.minor version 51.0
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
	 * Run the Writer attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_1()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.attribute(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.AttributeNotPermittedException.class)
	public void testAttribute_2()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.attribute(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer attribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAttribute_3()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.attribute(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testAttribute_4()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.attribute(name, date, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.AttributeNotPermittedException.class)
	public void testAttribute_5()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.attribute(name, date, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer attribute(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testAttribute_6()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.attribute(name, date, pattern);

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
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Document result = fixture.document();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_1()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Writer result = fixture.element(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_2()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Writer result = fixture.element(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_3()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";

		Writer result = fixture.element(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_4()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Element element = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Writer result = fixture.element(element);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_5()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		Element element = new ElementImpl(new FactoryImpl(new FormatterProviderImpl()), new IIOMetadataNode());

		Writer result = fixture.element(element);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_6()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_7()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_8()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testElement_9()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Object value = new Object();

		Writer result = fixture.element(name, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testElement_10()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.element(name, date, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.InvalidNameException.class)
	public void testElement_11()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.element(name, date, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.RootDuplicateException.class)
	public void testElement_12()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.element(name, date, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer element(String,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.ValueNotPermittedException.class)
	public void testElement_13()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));
		String name = "";
		Date date = new Date();
		String pattern = "";

		Writer result = fixture.element(name, date, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEndWithin_1()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Writer result = fixture.endWithin();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer endWithin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.NotWithinContextException.class)
	public void testEndWithin_2()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Writer result = fixture.endWithin();

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
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Result result = fixture.result();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWithin_1()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Writer result = fixture.within();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.WithinContextNotPermittedException.class)
	public void testWithin_2()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Writer result = fixture.within();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Writer within() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test(expected = net.sf.xisemele.exception.WithinContextDuplicateException.class)
	public void testWithin_3()
		throws Exception {
		WriterImpl fixture = new WriterImpl(new WriterEditorImpl(new FactoryImpl(new FormatterProviderImpl()), new FormatterProviderImpl(), (Document) null));

		Writer result = fixture.within();

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
		new org.junit.runner.JUnitCore().run(WriterImplTest.class);
	}
}