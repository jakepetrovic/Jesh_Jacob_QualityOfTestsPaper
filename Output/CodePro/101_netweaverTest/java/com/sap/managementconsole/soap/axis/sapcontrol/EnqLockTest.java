package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EnqLockTest</code> contains tests for the class <code>{@link EnqLock}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:31 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class EnqLockTest {
	/**
	 * Run the EnqLock() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testEnqLock_1()
		throws Exception {

		EnqLock result = new EnqLock();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/EnqLock : Unsupported major.minor version 51.0
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
	 * Run the EnqLock(String,String,String,String,String,int,int,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testEnqLock_2()
		throws Exception {
		String lockName = "";
		String lockArg = "";
		String lockMode = "";
		String owner = "";
		String ownerVb = "";
		int useCountOwner = 1;
		int useCountOwnerVb = 1;
		String client = "";
		String user = "";
		String transaction = "";
		String object = "";
		boolean backup = true;

		EnqLock result = new EnqLock(lockName, lockArg, lockMode, owner, ownerVb, useCountOwner, useCountOwnerVb, client, user, transaction, object, backup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/EnqLock : Unsupported major.minor version 51.0
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
	 * Run the String getClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetClient_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getClient();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = EnqLock.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLockArg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetLockArg_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getLockArg();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLockMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetLockMode_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getLockMode();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLockName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetLockName_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getLockName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetObject_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getObject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getOwnerVb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetOwnerVb_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getOwnerVb();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = EnqLock.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTransaction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetTransaction_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getTransaction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = EnqLock.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getUseCountOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetUseCountOwner_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		int result = fixture.getUseCountOwner();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getUseCountOwnerVb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetUseCountOwnerVb_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		int result = fixture.getUseCountOwnerVb();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		String result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		EnqLock fixture = new EnqLock((String) null, (String) null, (String) null, "", "", 1, 1, "", "", "", "", false);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", (String) null, (String) null, 1, 1, (String) null, (String) null, (String) null, (String) null, true);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isBackup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testIsBackup_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);

		boolean result = fixture.isBackup();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isBackup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testIsBackup_2()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", false);

		boolean result = fixture.isBackup();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setBackup(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetBackup_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		boolean backup = true;

		fixture.setBackup(backup);

		// add additional test code here
	}

	/**
	 * Run the void setClient(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetClient_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String client = "";

		fixture.setClient(client);

		// add additional test code here
	}

	/**
	 * Run the void setLockArg(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetLockArg_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String lockArg = "";

		fixture.setLockArg(lockArg);

		// add additional test code here
	}

	/**
	 * Run the void setLockMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetLockMode_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String lockMode = "";

		fixture.setLockMode(lockMode);

		// add additional test code here
	}

	/**
	 * Run the void setLockName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetLockName_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String lockName = "";

		fixture.setLockName(lockName);

		// add additional test code here
	}

	/**
	 * Run the void setObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetObject_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String object = "";

		fixture.setObject(object);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String owner = "";

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwnerVb(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetOwnerVb_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String ownerVb = "";

		fixture.setOwnerVb(ownerVb);

		// add additional test code here
	}

	/**
	 * Run the void setTransaction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetTransaction_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		String transaction = "";

		fixture.setTransaction(transaction);

		// add additional test code here
	}

	/**
	 * Run the void setUseCountOwner(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetUseCountOwner_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		int useCountOwner = 1;

		fixture.setUseCountOwner(useCountOwner);

		// add additional test code here
	}

	/**
	 * Run the void setUseCountOwnerVb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetUseCountOwnerVb_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
		int useCountOwnerVb = 1;

		fixture.setUseCountOwnerVb(useCountOwnerVb);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		EnqLock fixture = new EnqLock("", "", "", "", "", 1, 1, "", "", "", "", true);
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
	 * @generatedBy CodePro at 4/8/14 11:31 AM
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
	 * @generatedBy CodePro at 4/8/14 11:31 AM
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
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EnqLockTest.class);
	}
}