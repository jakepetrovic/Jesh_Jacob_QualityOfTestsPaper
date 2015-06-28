package org.jsecurity.config;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReflectionBuilderTest</code> contains tests for the class <code>{@link ReflectionBuilder}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ReflectionBuilderTest {
	/**
	 * Run the ReflectionBuilder() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testReflectionBuilder_1()
		throws Exception {

		ReflectionBuilder result = new ReflectionBuilder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/config/ReflectionBuilder : Unsupported major.minor version 51.0
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
	 * Run the ReflectionBuilder(Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testReflectionBuilder_2()
		throws Exception {
		Map defaults = new LinkedHashMap();

		ReflectionBuilder result = new ReflectionBuilder(defaults);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/config/ReflectionBuilder : Unsupported major.minor version 51.0
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
	 * Run the void applyGlobalProperty(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyGlobalProperty_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String property = "";
		String value = "";

		fixture.applyGlobalProperty(objects, property, value);

		// add additional test code here
	}

	/**
	 * Run the void applyGlobalProperty(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyGlobalProperty_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String property = "";
		String value = "";

		fixture.applyGlobalProperty(objects, property, value);

		// add additional test code here
	}

	/**
	 * Run the void applyGlobalProperty(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyGlobalProperty_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String property = "";
		String value = "";

		fixture.applyGlobalProperty(objects, property, value);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(Object,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Object object = new Object();
		String propertyName = "";
		String stringValue = "";

		fixture.applyProperty(object, propertyName, stringValue);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(Object,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Object object = new Object();
		String propertyName = "";
		String stringValue = "";

		fixture.applyProperty(object, propertyName, stringValue);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(Object,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Object object = new Object();
		String propertyName = "";
		String stringValue = "";

		fixture.applyProperty(object, propertyName, stringValue);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(Object,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_4()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Object object = new Object();
		String propertyName = "";
		String stringValue = "";

		fixture.applyProperty(object, propertyName, stringValue);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(Object,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_5()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Object object = new Object();
		String propertyName = "";
		String stringValue = "";

		fixture.applyProperty(object, propertyName, stringValue);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(Object,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_6()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Object object = new Object();
		String propertyName = "";
		String stringValue = "";

		fixture.applyProperty(object, propertyName, stringValue);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(String,String,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_7()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String key = "";
		String value = "";
		Map objects = new LinkedHashMap();

		fixture.applyProperty(key, value, objects);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(String,String,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyProperty_8()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String key = "";
		String value = "";
		Map objects = new LinkedHashMap();

		fixture.applyProperty(key, value, objects);

		// add additional test code here
	}

	/**
	 * Run the void applyProperty(String,String,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testApplyProperty_9()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String key = "";
		String value = "";
		Map objects = new LinkedHashMap();

		fixture.applyProperty(key, value, objects);

		// add additional test code here
	}

	/**
	 * Run the void applySingleProperty(Map,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplySingleProperty_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String property = "";
		String value = "";

		fixture.applySingleProperty(objects, name, property, value);

		// add additional test code here
	}

	/**
	 * Run the void applySingleProperty(Map,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testApplySingleProperty_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String property = "class";
		String value = "";

		fixture.applySingleProperty(objects, name, property, value);

		// add additional test code here
	}

	/**
	 * Run the void applySingleProperty(Map,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testApplySingleProperty_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String property = "";
		String value = "";

		fixture.applySingleProperty(objects, name, property, value);

		// add additional test code here
	}

	/**
	 * Run the Map buildObjects(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBuildObjects_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map<String, String> kvPairs = new LinkedHashMap();

		Map result = fixture.buildObjects(kvPairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map buildObjects(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBuildObjects_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map<String, String> kvPairs = new LinkedHashMap();

		Map result = fixture.buildObjects(kvPairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map buildObjects(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBuildObjects_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map<String, String> kvPairs = new LinkedHashMap();

		Map result = fixture.buildObjects(kvPairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map buildObjects(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBuildObjects_4()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map<String, String> kvPairs = new LinkedHashMap();

		Map result = fixture.buildObjects(kvPairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map buildObjects(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBuildObjects_5()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map<String, String> kvPairs = null;

		Map result = fixture.buildObjects(kvPairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map buildObjects(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBuildObjects_6()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map<String, String> kvPairs = new LinkedHashMap();

		Map result = fixture.buildObjects(kvPairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void createNewInstance(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreateNewInstance_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String value = "";

		fixture.createNewInstance(objects, name, value);

		// add additional test code here
	}

	/**
	 * Run the void createNewInstance(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreateNewInstance_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String value = "";

		fixture.createNewInstance(objects, name, value);

		// add additional test code here
	}

	/**
	 * Run the void createNewInstance(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreateNewInstance_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String value = "";

		fixture.createNewInstance(objects, name, value);

		// add additional test code here
	}

	/**
	 * Run the void createNewInstance(Map,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreateNewInstance_4()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();
		String name = "";
		String value = "";

		fixture.createNewInstance(objects, name, value);

		// add additional test code here
	}

	/**
	 * Run the String getId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String referenceToken = "";

		String result = fixture.getId(referenceToken);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map getObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetObjects_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());

		Map result = fixture.getObjects();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getReferencedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetReferencedObject_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects((Map) null);
		String id = "";

		Object result = fixture.getReferencedObject(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getReferencedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetReferencedObject_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String id = "";

		Object result = fixture.getReferencedObject(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getReferencedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.config.UnresolveableReferenceException.class)
	public void testGetReferencedObject_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String id = "";

		Object result = fixture.getReferencedObject(id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isReference(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsReference_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String value = "$";

		boolean result = fixture.isReference(value);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isReference(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsReference_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String value = null;

		boolean result = fixture.isReference(value);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isReference(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsReference_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String value = "";

		boolean result = fixture.isReference(value);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setObjects(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetObjects_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		Map objects = new LinkedHashMap();

		fixture.setObjects(objects);

		// add additional test code here
	}

	/**
	 * Run the String unescapeIfNecessary(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnescapeIfNecessary_1()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String value = "\\$";

		String result = fixture.unescapeIfNecessary(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String unescapeIfNecessary(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnescapeIfNecessary_2()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String value = null;

		String result = fixture.unescapeIfNecessary(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String unescapeIfNecessary(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnescapeIfNecessary_3()
		throws Exception {
		ReflectionBuilder fixture = new ReflectionBuilder();
		fixture.setObjects(new LinkedHashMap());
		String value = "";

		String result = fixture.unescapeIfNecessary(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReflectionBuilderTest.class);
	}
}