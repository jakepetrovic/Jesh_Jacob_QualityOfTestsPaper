package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ICMCacheEntryTest</code> contains tests for the class <code>{@link ICMCacheEntry}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:46 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ICMCacheEntryTest {
	/**
	 * Run the ICMCacheEntry() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testICMCacheEntry_1()
		throws Exception {

		ICMCacheEntry result = new ICMCacheEntry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMCacheEntry : Unsupported major.minor version 51.0
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
	 * Run the ICMCacheEntry(String,int,long,boolean,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testICMCacheEntry_2()
		throws Exception {
		String name = "";
		int version = 1;
		long size = 1L;
		boolean valid = true;
		String cache = "";
		String creationTime = "";
		String lastAccessTime = "";
		String expirationTime = "";
		String cacheurl = "";

		ICMCacheEntry result = new ICMCacheEntry(name, version, size, valid, cache, creationTime, lastAccessTime, expirationTime, cacheurl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMCacheEntry : Unsupported major.minor version 51.0
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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		Object obj = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		Object obj = new ICMCacheEntry();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		Object obj = new ICMCacheEntry();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry((String) null, 1, 1L, true, (String) null, (String) null, (String) null, (String) null, (String) null);
		Object obj = new ICMCacheEntry();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetCache_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		String result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCacheurl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetCacheurl_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		String result = fixture.getCacheurl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCreationTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetCreationTime_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		String result = fixture.getCreationTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = ICMCacheEntry.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getExpirationTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetExpirationTime_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		String result = fixture.getExpirationTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLastAccessTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetLastAccessTime_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		String result = fixture.getLastAccessTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = ICMCacheEntry.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		long result = fixture.getSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = ICMCacheEntry.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		int result = fixture.getVersion();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry((String) null, 1, 1L, false, (String) null, "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", (String) null, (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");

		boolean result = fixture.isValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, false, "", "", "", "", "");

		boolean result = fixture.isValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetCache_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		String cache = "";

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCacheurl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetCacheurl_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		String cacheurl = "";

		fixture.setCacheurl(cacheurl);

		// add additional test code here
	}

	/**
	 * Run the void setCreationTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetCreationTime_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		String creationTime = "";

		fixture.setCreationTime(creationTime);

		// add additional test code here
	}

	/**
	 * Run the void setExpirationTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetExpirationTime_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		String expirationTime = "";

		fixture.setExpirationTime(expirationTime);

		// add additional test code here
	}

	/**
	 * Run the void setLastAccessTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetLastAccessTime_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		String lastAccessTime = "";

		fixture.setLastAccessTime(lastAccessTime);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		long size = 1L;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setValid(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetValid_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		boolean valid = true;

		fixture.setValid(valid);

		// add additional test code here
	}

	/**
	 * Run the void setVersion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetVersion_1()
		throws Exception {
		ICMCacheEntry fixture = new ICMCacheEntry("", 1, 1L, true, "", "", "", "", "");
		int version = 1;

		fixture.setVersion(version);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
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
	 * @generatedBy CodePro at 4/8/14 10:46 AM
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
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ICMCacheEntryTest.class);
	}
}