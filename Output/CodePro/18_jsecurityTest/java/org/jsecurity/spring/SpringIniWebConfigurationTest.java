package org.jsecurity.spring;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jsecurity.JSecurityException;
import org.jsecurity.mgt.SecurityManager;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * The class <code>SpringIniWebConfigurationTest</code> contains tests for the class <code>{@link SpringIniWebConfiguration}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:07 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SpringIniWebConfigurationTest {
	/**
	 * Run the SpringIniWebConfiguration() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSpringIniWebConfiguration_1()
		throws Exception {

		SpringIniWebConfiguration result = new SpringIniWebConfiguration();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/spring/SpringIniWebConfiguration : Unsupported major.minor version 51.0
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
	 * Run the SecurityManager createDefaultSecurityManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManager_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");

		SecurityManager result = fixture.createDefaultSecurityManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_2()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_3()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_4()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_5()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_6()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateDefaultSecurityManagerFromRealms_7()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManagerFromRealms(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.springframework.beans.BeansException.class)
	public void testCreateDefaultSecurityManagerFromRealms_8()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createDefaultSecurityManagerFromRealms(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManager(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCreateSecurityManager_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManager(sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManager(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateSecurityManager_2()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManager(sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getOrCreateSecurityManager(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetOrCreateSecurityManager_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.getOrCreateSecurityManager(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getOrCreateSecurityManager(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.springframework.beans.BeansException.class)
	public void testGetOrCreateSecurityManager_2()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.getOrCreateSecurityManager(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getOrCreateSecurityManager(ApplicationContext,Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.springframework.context.ApplicationContextException.class)
	public void testGetOrCreateSecurityManager_3()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName((String) null);
		ApplicationContext appCtx = new XmlWebApplicationContext();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.getOrCreateSecurityManager(appCtx, sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSecurityManagerBeanName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSecurityManagerBeanName_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");

		String result = fixture.getSecurityManagerBeanName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSecurityManagerByType_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSecurityManagerByType_2()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSecurityManagerByType_3()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSecurityManagerByType_4()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSecurityManagerByType_5()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.springframework.beans.BeansException.class)
	public void testGetSecurityManagerByType_6()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManagerByType(ApplicationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.springframework.context.ApplicationContextException.class)
	public void testGetSecurityManagerByType_7()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		ApplicationContext appCtx = new XmlWebApplicationContext();

		SecurityManager result = fixture.getSecurityManagerByType(appCtx);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.JSecurityException.class)
	public void testInit_3()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setSecurityManagerBeanName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetSecurityManagerBeanName_1()
		throws Exception {
		SpringIniWebConfiguration fixture = new SpringIniWebConfiguration();
		fixture.setSecurityManagerBeanName("");
		String securityManagerBeanName = "";

		fixture.setSecurityManagerBeanName(securityManagerBeanName);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SpringIniWebConfigurationTest.class);
	}
}