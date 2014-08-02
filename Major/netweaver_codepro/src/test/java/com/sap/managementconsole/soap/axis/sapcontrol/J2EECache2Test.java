package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EECache2Test</code> contains tests for the class <code>{@link J2EECache2}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:13 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EECache2Test {
	/**
	 * Run the J2EECache2() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testJ2EECache2_1()
		throws Exception {

		J2EECache2 result = new J2EECache2();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EECache2 : Unsupported major.minor version 51.0
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
	 * Run the J2EECache2(String,String,String,String,long,long,long,int,int,int,int,int,int,int,int,int,int,String,STATECOLOR) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testJ2EECache2_2()
		throws Exception {
		String description = "";
		String owner = "";
		String processname = "";
		String type = "";
		long size = 1L;
		long attrSize = 1L;
		long keysSize = 1L;
		int cachedObjects = 1;
		int usedObjects = 1;
		int puts = 1;
		int gets = 1;
		int hits = 1;
		int changes = 1;
		int removes = 1;
		int evictions = 1;
		int instanceInvalidations = 1;
		int clusterInvalidations = 1;
		String updateTime = "";
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		J2EECache2 result = new J2EECache2(description, owner, processname, type, size, attrSize, keysSize, cachedObjects, usedObjects, puts, gets, hits, changes, removes, evictions, instanceInvalidations, clusterInvalidations, updateTime, dispstatus);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EECache2 : Unsupported major.minor version 51.0
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
	 * Run the long getAttrSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetAttrSize_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		long result = fixture.getAttrSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the int getCachedObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetCachedObjects_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getCachedObjects();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetChanges_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getChanges();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getClusterInvalidations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetClusterInvalidations_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getClusterInvalidations();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		String result = fixture.getDescription();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = J2EECache2.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getDispstatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetDispstatus_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		STATECOLOR result = fixture.getDispstatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getEvictions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetEvictions_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getEvictions();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getGets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetGets_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getGets();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getHits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetHits_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getHits();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInstanceInvalidations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetInstanceInvalidations_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getInstanceInvalidations();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the long getKeysSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetKeysSize_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		long result = fixture.getKeysSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		String result = fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProcessname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetProcessname_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		String result = fixture.getProcessname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPuts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetPuts_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getPuts();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getRemoves() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetRemoves_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getRemoves();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = J2EECache2.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		long result = fixture.getSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		String result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = J2EECache2.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetUpdateTime_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		String result = fixture.getUpdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getUsedObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testGetUsedObjects_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.getUsedObjects();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		J2EECache2 fixture = new J2EECache2((String) null, (String) null, "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", (String) null, (String) null, 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, (String) null, (STATECOLOR) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAttrSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetAttrSize_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		long attrSize = 1L;

		fixture.setAttrSize(attrSize);

		// add additional test code here
	}

	/**
	 * Run the void setCachedObjects(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetCachedObjects_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int cachedObjects = 1;

		fixture.setCachedObjects(cachedObjects);

		// add additional test code here
	}

	/**
	 * Run the void setChanges(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetChanges_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int changes = 1;

		fixture.setChanges(changes);

		// add additional test code here
	}

	/**
	 * Run the void setClusterInvalidations(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetClusterInvalidations_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int clusterInvalidations = 1;

		fixture.setClusterInvalidations(clusterInvalidations);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDispstatus(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetDispstatus_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		fixture.setDispstatus(dispstatus);

		// add additional test code here
	}

	/**
	 * Run the void setEvictions(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetEvictions_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int evictions = 1;

		fixture.setEvictions(evictions);

		// add additional test code here
	}

	/**
	 * Run the void setGets(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetGets_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int gets = 1;

		fixture.setGets(gets);

		// add additional test code here
	}

	/**
	 * Run the void setHits(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetHits_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int hits = 1;

		fixture.setHits(hits);

		// add additional test code here
	}

	/**
	 * Run the void setInstanceInvalidations(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetInstanceInvalidations_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int instanceInvalidations = 1;

		fixture.setInstanceInvalidations(instanceInvalidations);

		// add additional test code here
	}

	/**
	 * Run the void setKeysSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetKeysSize_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		long keysSize = 1L;

		fixture.setKeysSize(keysSize);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		String owner = "";

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setProcessname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetProcessname_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		String processname = "";

		fixture.setProcessname(processname);

		// add additional test code here
	}

	/**
	 * Run the void setPuts(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetPuts_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int puts = 1;

		fixture.setPuts(puts);

		// add additional test code here
	}

	/**
	 * Run the void setRemoves(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetRemoves_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int removes = 1;

		fixture.setRemoves(removes);

		// add additional test code here
	}

	/**
	 * Run the void setSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		long size = 1L;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setUpdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetUpdateTime_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		String updateTime = "";

		fixture.setUpdateTime(updateTime);

		// add additional test code here
	}

	/**
	 * Run the void setUsedObjects(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	@Test
	public void testSetUsedObjects_1()
		throws Exception {
		J2EECache2 fixture = new J2EECache2("", "", "", "", 1L, 1L, 1L, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "", STATECOLOR.fromString(""));
		int usedObjects = 1;

		fixture.setUsedObjects(usedObjects);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:13 AM
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
	 * @generatedBy CodePro at 4/8/14 11:13 AM
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
	 * @generatedBy CodePro at 4/8/14 11:13 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(J2EECache2Test.class);
	}
}