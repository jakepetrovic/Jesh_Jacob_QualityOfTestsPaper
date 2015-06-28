package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EEThread2Test</code> contains tests for the class <code>{@link J2EEThread2}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:55 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EEThread2Test {
	/**
	 * Run the J2EEThread2() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testJ2EEThread2_1()
		throws Exception {

		J2EEThread2 result = new J2EEThread2();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEThread2 : Unsupported major.minor version 51.0
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
	 * Run the J2EEThread2(String,String,String,String,String,String,String,String,String,String,String,String,STATECOLOR,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testJ2EEThread2_2()
		throws Exception {
		String processname = "";
		String startTime = "";
		String updateTime = "";
		String taskupdateTime = "";
		String subtaskupdateTime = "";
		String task = "";
		String subtask = "";
		String name = "";
		String classname = "";
		String user = "";
		String pool = "";
		String state = "";
		STATECOLOR dispstatus = STATECOLOR.fromString("");
		int index = 1;

		J2EEThread2 result = new J2EEThread2(processname, startTime, updateTime, taskupdateTime, subtaskupdateTime, task, subtask, name, classname, user, pool, state, dispstatus, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEThread2 : Unsupported major.minor version 51.0
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
	 * Run the String getClassname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetClassname_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getClassname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = J2EEThread2.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getDispstatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetDispstatus_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		STATECOLOR result = fixture.getDispstatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetIndex_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPool() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetPool_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getPool();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProcessname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetProcessname_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getProcessname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = J2EEThread2.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStartTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetStartTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getStartTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSubtask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetSubtask_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getSubtask();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSubtaskupdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetSubtaskupdateTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getSubtaskupdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetTask_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getTask();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTaskupdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetTaskupdateTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getTaskupdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = J2EEThread2.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetUpdateTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getUpdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);

		String result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setClassname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetClassname_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String classname = "";

		fixture.setClassname(classname);

		// add additional test code here
	}

	/**
	 * Run the void setDispstatus(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetDispstatus_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		fixture.setDispstatus(dispstatus);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetIndex_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		int index = 1;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPool(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetPool_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String pool = "";

		fixture.setPool(pool);

		// add additional test code here
	}

	/**
	 * Run the void setProcessname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetProcessname_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String processname = "";

		fixture.setProcessname(processname);

		// add additional test code here
	}

	/**
	 * Run the void setStartTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetStartTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String startTime = "";

		fixture.setStartTime(startTime);

		// add additional test code here
	}

	/**
	 * Run the void setState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetState_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String state = "";

		fixture.setState(state);

		// add additional test code here
	}

	/**
	 * Run the void setSubtask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetSubtask_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String subtask = "";

		fixture.setSubtask(subtask);

		// add additional test code here
	}

	/**
	 * Run the void setSubtaskupdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetSubtaskupdateTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String subtaskupdateTime = "";

		fixture.setSubtaskupdateTime(subtaskupdateTime);

		// add additional test code here
	}

	/**
	 * Run the void setTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetTask_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String task = "";

		fixture.setTask(task);

		// add additional test code here
	}

	/**
	 * Run the void setTaskupdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetTaskupdateTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String taskupdateTime = "";

		fixture.setTaskupdateTime(taskupdateTime);

		// add additional test code here
	}

	/**
	 * Run the void setUpdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetUpdateTime_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String updateTime = "";

		fixture.setUpdateTime(updateTime);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		J2EEThread2 fixture = new J2EEThread2("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""), 1);
		String user = "";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:55 AM
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
	 * @generatedBy CodePro at 4/8/14 10:55 AM
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
	 * @generatedBy CodePro at 4/8/14 10:55 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(J2EEThread2Test.class);
	}
}