package org.jsecurity.jndi;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.NamingException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JndiTemplateTest</code> contains tests for the class <code>{@link JndiTemplate}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JndiTemplateTest {
	/**
	 * Run the JndiTemplate() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testJndiTemplate_1()
		throws Exception {

		JndiTemplate result = new JndiTemplate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/jndi/JndiTemplate : Unsupported major.minor version 51.0
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
	 * Run the JndiTemplate(Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testJndiTemplate_2()
		throws Exception {
		Properties environment = new Properties();

		JndiTemplate result = new JndiTemplate(environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/jndi/JndiTemplate : Unsupported major.minor version 51.0
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
	 * Run the void bind(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testBind_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Object object = new Object();

		fixture.bind(name, object);

		// add additional test code here
	}

	/**
	 * Run the void bind(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testBind_2()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Object object = new Object();

		fixture.bind(name, object);

		// add additional test code here
	}

	/**
	 * Run the void bind(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testBind_3()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Object object = new Object();

		fixture.bind(name, object);

		// add additional test code here
	}

	/**
	 * Run the Context createInitialContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testCreateInitialContext_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate((Properties) null);

		Context result = fixture.createInitialContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Context createInitialContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testCreateInitialContext_2()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());

		Context result = fixture.createInitialContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Context createInitialContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testCreateInitialContext_3()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());

		Context result = fixture.createInitialContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object execute(JndiCallback) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testExecute_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		JndiCallback contextCallback = null;

		Object result = fixture.execute(contextCallback);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object execute(JndiCallback) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testExecute_2()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		JndiCallback contextCallback = null;

		Object result = fixture.execute(contextCallback);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object execute(JndiCallback) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testExecute_3()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		JndiCallback contextCallback = null;

		Object result = fixture.execute(contextCallback);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Properties getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetEnvironment_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());

		Properties result = fixture.getEnvironment();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testLookup_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";

		Object result = fixture.lookup(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testLookup_2()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";

		Object result = fixture.lookup(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object lookup(String,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testLookup_3()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Class requiredType = null;

		Object result = fixture.lookup(name, requiredType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object lookup(String,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testLookup_4()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Class requiredType = Object.class;

		Object result = fixture.lookup(name, requiredType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object lookup(String,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testLookup_5()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Class requiredType = Object.class;

		Object result = fixture.lookup(name, requiredType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object lookup(String,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testLookup_6()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Class requiredType = Object.class;

		Object result = fixture.lookup(name, requiredType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void rebind(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRebind_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Object object = new Object();

		fixture.rebind(name, object);

		// add additional test code here
	}

	/**
	 * Run the void rebind(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRebind_2()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Object object = new Object();

		fixture.rebind(name, object);

		// add additional test code here
	}

	/**
	 * Run the void rebind(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testRebind_3()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";
		Object object = new Object();

		fixture.rebind(name, object);

		// add additional test code here
	}

	/**
	 * Run the void setEnvironment(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetEnvironment_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		Properties environment = new Properties();

		fixture.setEnvironment(environment);

		// add additional test code here
	}

	/**
	 * Run the void unbind(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testUnbind_1()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";

		fixture.unbind(name);

		// add additional test code here
	}

	/**
	 * Run the void unbind(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testUnbind_2()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";

		fixture.unbind(name);

		// add additional test code here
	}

	/**
	 * Run the void unbind(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = javax.naming.NamingException.class)
	public void testUnbind_3()
		throws Exception {
		JndiTemplate fixture = new JndiTemplate(new Properties());
		String name = "";

		fixture.unbind(name);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JndiTemplateTest.class);
	}
}