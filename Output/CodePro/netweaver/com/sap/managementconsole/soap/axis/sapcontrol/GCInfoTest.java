package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GCInfoTest</code> contains tests for the class <code>{@link GCInfo}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class GCInfoTest {
	/**
	 * Run the GCInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGCInfo_1()
		throws Exception {

		GCInfo result = new GCInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/GCInfo : Unsupported major.minor version 51.0
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
	 * Run the GCInfo(String,String,String,String,int,int,long,long,long,long,long,long,long,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGCInfo_2()
		throws Exception {
		String processname = "";
		String type = "";
		String reason = "";
		String startTime = "";
		int duration = 1;
		int cpuTime = 1;
		long objBytesBefore = 1L;
		long objBytesAfter = 1L;
		long objBytesFreed = 1L;
		long clsBytesBefore = 1L;
		long clsBytesAfter = 1L;
		long clsBytesFreed = 1L;
		long heapSize = 1L;
		int unloadedClasses = 1;

		GCInfo result = new GCInfo(processname, type, reason, startTime, duration, cpuTime, objBytesBefore, objBytesAfter, objBytesFreed, clsBytesBefore, clsBytesAfter, clsBytesFreed, heapSize, unloadedClasses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/GCInfo : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		Object obj = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		Object obj = new GCInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		Object obj = new GCInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		GCInfo fixture = new GCInfo((String) null, (String) null, (String) null, (String) null, 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		Object obj = new GCInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the long getClsBytesAfter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetClsBytesAfter_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getClsBytesAfter();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getClsBytesBefore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetClsBytesBefore_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getClsBytesBefore();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getClsBytesFreed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetClsBytesFreed_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getClsBytesFreed();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the int getCpuTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetCpuTime_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		int result = fixture.getCpuTime();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = GCInfo.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getDuration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDuration_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		int result = fixture.getDuration();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the long getHeapSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetHeapSize_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getHeapSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getObjBytesAfter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetObjBytesAfter_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getObjBytesAfter();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getObjBytesBefore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetObjBytesBefore_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getObjBytesBefore();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getObjBytesFreed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetObjBytesFreed_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		long result = fixture.getObjBytesFreed();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getProcessname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetProcessname_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		String result = fixture.getProcessname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetReason_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		String result = fixture.getReason();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = GCInfo.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStartTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetStartTime_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		String result = fixture.getStartTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		String result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = GCInfo.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getUnloadedClasses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetUnloadedClasses_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		int result = fixture.getUnloadedClasses();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		GCInfo fixture = new GCInfo((String) null, "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		GCInfo fixture = new GCInfo("", (String) null, (String) null, (String) null, 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setClsBytesAfter(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetClsBytesAfter_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long clsBytesAfter = 1L;

		fixture.setClsBytesAfter(clsBytesAfter);

		// add additional test code here
	}

	/**
	 * Run the void setClsBytesBefore(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetClsBytesBefore_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long clsBytesBefore = 1L;

		fixture.setClsBytesBefore(clsBytesBefore);

		// add additional test code here
	}

	/**
	 * Run the void setClsBytesFreed(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetClsBytesFreed_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long clsBytesFreed = 1L;

		fixture.setClsBytesFreed(clsBytesFreed);

		// add additional test code here
	}

	/**
	 * Run the void setCpuTime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetCpuTime_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		int cpuTime = 1;

		fixture.setCpuTime(cpuTime);

		// add additional test code here
	}

	/**
	 * Run the void setDuration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetDuration_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		int duration = 1;

		fixture.setDuration(duration);

		// add additional test code here
	}

	/**
	 * Run the void setHeapSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetHeapSize_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long heapSize = 1L;

		fixture.setHeapSize(heapSize);

		// add additional test code here
	}

	/**
	 * Run the void setObjBytesAfter(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetObjBytesAfter_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long objBytesAfter = 1L;

		fixture.setObjBytesAfter(objBytesAfter);

		// add additional test code here
	}

	/**
	 * Run the void setObjBytesBefore(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetObjBytesBefore_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long objBytesBefore = 1L;

		fixture.setObjBytesBefore(objBytesBefore);

		// add additional test code here
	}

	/**
	 * Run the void setObjBytesFreed(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetObjBytesFreed_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		long objBytesFreed = 1L;

		fixture.setObjBytesFreed(objBytesFreed);

		// add additional test code here
	}

	/**
	 * Run the void setProcessname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetProcessname_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		String processname = "";

		fixture.setProcessname(processname);

		// add additional test code here
	}

	/**
	 * Run the void setReason(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetReason_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		String reason = "";

		fixture.setReason(reason);

		// add additional test code here
	}

	/**
	 * Run the void setStartTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetStartTime_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		String startTime = "";

		fixture.setStartTime(startTime);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setUnloadedClasses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetUnloadedClasses_1()
		throws Exception {
		GCInfo fixture = new GCInfo("", "", "", "", 1, 1, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1);
		int unloadedClasses = 1;

		fixture.setUnloadedClasses(unloadedClasses);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GCInfoTest.class);
	}
}