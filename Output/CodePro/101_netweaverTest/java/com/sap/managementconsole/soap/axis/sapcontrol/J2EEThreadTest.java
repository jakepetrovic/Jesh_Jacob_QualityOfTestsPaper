package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EEThreadTest</code> contains tests for the class <code>{@link J2EEThread}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EEThreadTest {
	/**
	 * Run the J2EEThread() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testJ2EEThread_1()
		throws Exception {

		J2EEThread result = new J2EEThread();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEThread : Unsupported major.minor version 51.0
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
	 * Run the J2EEThread(String,String,String,String,String,String,String,String,String,String,String,String,STATECOLOR) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testJ2EEThread_2()
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

		J2EEThread result = new J2EEThread(processname, startTime, updateTime, taskupdateTime, subtaskupdateTime, task, subtask, name, classname, user, pool, state, dispstatus);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEThread : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetClassname_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getClassname();

		// add additional test code here
		assertNotNull(result);
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

		Deserializer result = J2EEThread.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getDispstatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDispstatus_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		STATECOLOR result = fixture.getDispstatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPool() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPool_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getPool();

		// add additional test code here
		assertNotNull(result);
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
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getProcessname();

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

		Serializer result = J2EEThread.getSerializer(mechType, _javaType, _xmlType);

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
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getStartTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSubtask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetSubtask_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getSubtask();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSubtaskupdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetSubtaskupdateTime_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getSubtaskupdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetTask_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getTask();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTaskupdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetTaskupdateTime_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getTaskupdateTime();

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

		TypeDesc result = J2EEThread.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetUpdateTime_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getUpdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setClassname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetClassname_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String classname = "";

		fixture.setClassname(classname);

		// add additional test code here
	}

	/**
	 * Run the void setDispstatus(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetDispstatus_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		fixture.setDispstatus(dispstatus);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPool(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetPool_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String pool = "";

		fixture.setPool(pool);

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
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String processname = "";

		fixture.setProcessname(processname);

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
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String startTime = "";

		fixture.setStartTime(startTime);

		// add additional test code here
	}

	/**
	 * Run the void setState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetState_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String state = "";

		fixture.setState(state);

		// add additional test code here
	}

	/**
	 * Run the void setSubtask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetSubtask_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String subtask = "";

		fixture.setSubtask(subtask);

		// add additional test code here
	}

	/**
	 * Run the void setSubtaskupdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetSubtaskupdateTime_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String subtaskupdateTime = "";

		fixture.setSubtaskupdateTime(subtaskupdateTime);

		// add additional test code here
	}

	/**
	 * Run the void setTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetTask_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String task = "";

		fixture.setTask(task);

		// add additional test code here
	}

	/**
	 * Run the void setTaskupdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetTaskupdateTime_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String taskupdateTime = "";

		fixture.setTaskupdateTime(taskupdateTime);

		// add additional test code here
	}

	/**
	 * Run the void setUpdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetUpdateTime_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String updateTime = "";

		fixture.setUpdateTime(updateTime);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		J2EEThread fixture = new J2EEThread("", "", "", "", "", "", "", "", "", "", "", "", STATECOLOR.fromString(""));
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
		new org.junit.runner.JUnitCore().run(J2EEThreadTest.class);
	}
}