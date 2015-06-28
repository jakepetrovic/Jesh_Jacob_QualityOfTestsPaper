package org.jsecurity.config;

import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import org.jsecurity.JSecurityException;
import org.jsecurity.io.IniResource;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.RealmSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IniConfigurationTest</code> contains tests for the class <code>{@link IniConfiguration}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:29 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class IniConfigurationTest {
	/**
	 * Run the IniConfiguration() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testIniConfiguration_1()
		throws Exception {

		IniConfiguration result = new IniConfiguration();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/config/IniConfiguration : Unsupported major.minor version 51.0
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
	 * Run the IniConfiguration(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testIniConfiguration_2()
		throws Exception {
		String configBodyOrResourcePath = "";

		IniConfiguration result = new IniConfiguration(configBodyOrResourcePath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/config/IniConfiguration : Unsupported major.minor version 51.0
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
	 * Run the IniConfiguration(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testIniConfiguration_3()
		throws Exception {
		String configBodyOrResourcePath = "";

		IniConfiguration result = new IniConfiguration(configBodyOrResourcePath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/config/IniConfiguration : Unsupported major.minor version 51.0
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
	 * Run the IniConfiguration(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testIniConfiguration_4()
		throws Exception {
		String configBodyOrResourcePath = "";
		String charsetName = "";

		IniConfiguration result = new IniConfiguration(configBodyOrResourcePath, charsetName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/config/IniConfiguration : Unsupported major.minor version 51.0
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
	 * Run the void afterSecurityManagerSet(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testAfterSecurityManagerSet_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		fixture.afterSecurityManagerSet(sections);

		// add additional test code here
	}

	/**
	 * Run the SecurityManager createDefaultSecurityManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateDefaultSecurityManager_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		SecurityManager result = fixture.createDefaultSecurityManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManager(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManager_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManager(sections);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_2()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_3()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_4()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_5()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_6()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateSecurityManagerForSection_7()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.JSecurityException.class)
	public void testCreateSecurityManagerForSection_8()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.JSecurityException.class)
	public void testCreateSecurityManagerForSection_9()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager createSecurityManagerForSection(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.JSecurityException.class)
	public void testCreateSecurityManagerForSection_10()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, String> mainSection = new LinkedHashMap();

		SecurityManager result = fixture.createSecurityManagerForSection(mainSection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getConfigUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetConfigUrl_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		String result = fixture.getConfigUrl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl((String) null);
		fixture.securityManager = null;
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl((String) null);
		fixture.securityManager = null;
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = null;
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_4()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = null;
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_5()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = null;
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_6()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl((String) null);
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_7()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl((String) null);
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_8()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_9()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testInit_10()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.JSecurityException.class)
	public void testInit_11()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testInit_12()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testInit_13()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = false;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testInit_14()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl((String) null);
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void load(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		InputStream is = new PipedInputStream();

		fixture.load(is);

		// add additional test code here
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testLoad_2()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Reader r = new PipedReader();

		fixture.load(r);

		// add additional test code here
	}

	/**
	 * Run the void load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testLoad_3()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		String path = "";

		fixture.load(path);

		// add additional test code here
	}

	/**
	 * Run the void load(Scanner) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testLoad_4()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Scanner s = new Scanner(new PipedReader());

		fixture.load(s);

		// add additional test code here
	}

	/**
	 * Run the RealmSecurityManager newSecurityManagerInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testNewSecurityManagerInstance_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();

		RealmSecurityManager result = fixture.newSecurityManagerInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void process(IniResource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testProcess_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		IniResource ini = new IniResource();
		ini.setSections(new LinkedHashMap());

		fixture.process(ini);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/io/IniResource : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
	}

	/**
	 * Run the void processIni(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testProcessIni_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		fixture.processIni(sections);

		// add additional test code here
	}

	/**
	 * Run the void processIni(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testProcessIni_2()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		fixture.processIni(sections);

		// add additional test code here
	}

	/**
	 * Run the void setConfigUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testSetConfigUrl_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.setConfigUrl("");
		fixture.securityManager = new DefaultSecurityManager();
		fixture.ignoreResourceNotFound = true;
		fixture.iniResource = new IniResource();
		String configUrl = "";

		fixture.setConfigUrl(configUrl);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
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
	 * @generatedBy CodePro at 4/19/14 3:29 PM
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
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IniConfigurationTest.class);
	}
}