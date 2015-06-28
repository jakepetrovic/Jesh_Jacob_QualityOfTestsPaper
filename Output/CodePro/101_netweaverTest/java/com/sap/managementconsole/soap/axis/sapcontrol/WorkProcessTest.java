package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorkProcessTest</code> contains tests for the class <code>{@link WorkProcess}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:49 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WorkProcessTest {
	/**
	 * Run the WorkProcess() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testWorkProcess_1()
		throws Exception {

		WorkProcess result = new WorkProcess();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/WorkProcess : Unsupported major.minor version 51.0
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
	 * Run the WorkProcess(int,String,int,String,String,String,String,String,String,String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testWorkProcess_2()
		throws Exception {
		int no = 1;
		String typ = "";
		int pid = 1;
		String status = "";
		String reason = "";
		String start = "";
		String err = "";
		String sem = "";
		String cpu = "";
		String time = "";
		String program = "";
		String client = "";
		String user = "";
		String action = "";
		String table = "";

		WorkProcess result = new WorkProcess(no, typ, pid, status, reason, start, err, sem, cpu, time, program, client, user, action, table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/WorkProcess : Unsupported major.minor version 51.0
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
	 * Run the String getAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetAction_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getAction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetClient_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getClient();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCpu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetCpu_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getCpu();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = WorkProcess.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getErr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetErr_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getErr();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getNo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetNo_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		int result = fixture.getNo();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetPid_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		int result = fixture.getPid();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getProgram() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetProgram_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getProgram();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetReason_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getReason();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetSem_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getSem();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = WorkProcess.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetStart_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetTable_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetTime_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTyp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetTyp_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getTyp();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = WorkProcess.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");

		String result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetAction_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String action = "";

		fixture.setAction(action);

		// add additional test code here
	}

	/**
	 * Run the void setClient(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetClient_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String client = "";

		fixture.setClient(client);

		// add additional test code here
	}

	/**
	 * Run the void setCpu(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetCpu_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String cpu = "";

		fixture.setCpu(cpu);

		// add additional test code here
	}

	/**
	 * Run the void setErr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetErr_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String err = "";

		fixture.setErr(err);

		// add additional test code here
	}

	/**
	 * Run the void setNo(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetNo_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		int no = 1;

		fixture.setNo(no);

		// add additional test code here
	}

	/**
	 * Run the void setPid(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetPid_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		int pid = 1;

		fixture.setPid(pid);

		// add additional test code here
	}

	/**
	 * Run the void setProgram(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetProgram_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String program = "";

		fixture.setProgram(program);

		// add additional test code here
	}

	/**
	 * Run the void setReason(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetReason_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String reason = "";

		fixture.setReason(reason);

		// add additional test code here
	}

	/**
	 * Run the void setSem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetSem_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String sem = "";

		fixture.setSem(sem);

		// add additional test code here
	}

	/**
	 * Run the void setStart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetStart_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String start = "";

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String status = "";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetTable_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String table = "";

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetTime_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String time = "";

		fixture.setTime(time);

		// add additional test code here
	}

	/**
	 * Run the void setTyp(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetTyp_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
		String typ = "";

		fixture.setTyp(typ);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		WorkProcess fixture = new WorkProcess(1, "", 1, "", "", "", "", "", "", "", "", "", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 10:49 AM
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
	 * @generatedBy CodePro at 4/8/14 10:49 AM
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
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorkProcessTest.class);
	}
}