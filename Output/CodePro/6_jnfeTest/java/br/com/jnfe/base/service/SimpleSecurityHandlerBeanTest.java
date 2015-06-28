package br.com.jnfe.base.service;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>SimpleSecurityHandlerBeanTest</code> contains tests for the class <code>{@link SimpleSecurityHandlerBean}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SimpleSecurityHandlerBeanTest {
	/**
	 * Run the SimpleSecurityHandlerBean() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSimpleSecurityHandlerBean_1()
		throws Exception {

		SimpleSecurityHandlerBean result = new SimpleSecurityHandlerBean();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: br/com/jnfe/base/service/SimpleSecurityHandlerBean : Unsupported major.minor version 51.0
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
	 * Run the SimpleSecurityHandlerBean(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSimpleSecurityHandlerBean_2()
		throws Exception {
		String alias = "";
		String password = "";

		SimpleSecurityHandlerBean result = new SimpleSecurityHandlerBean(alias, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: br/com/jnfe/base/service/SimpleSecurityHandlerBean : Unsupported major.minor version 51.0
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
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_1()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean((String) null, "");
		fixture.setPassword(new char[] {});

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_2()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_3()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean((String) null, "");
		fixture.setPassword(new char[] {});

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testAfterPropertiesSet_4()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_1()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_2()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_3()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_4()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_5()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_6()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_7()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_8()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_9()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_10()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_11()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_12()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_13()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_14()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_15()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void handle(Element,Element,SecurityCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testHandle_16()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		Element parentElement = new IIOMetadataNode();
		Element elementToSign = new IIOMetadataNode();
		SecurityCallBack action = null;

		fixture.handle(parentElement, elementToSign, action);

		// add additional test code here
	}

	/**
	 * Run the void setAlias(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetAlias_1()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		String alias = "";

		fixture.setAlias(alias);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testSetPassword_1()
		throws Exception {
		SimpleSecurityHandlerBean fixture = new SimpleSecurityHandlerBean("", "");
		fixture.setPassword(new char[] {});
		char[] password = new char[] {};

		fixture.setPassword(password);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleSecurityHandlerBeanTest.class);
	}
}