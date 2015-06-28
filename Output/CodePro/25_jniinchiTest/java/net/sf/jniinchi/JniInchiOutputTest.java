package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiOutputTest</code> contains tests for the class <code>{@link JniInchiOutput}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiOutputTest {
	/**
	 * Run the JniInchiOutput(int,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiOutput_1()
		throws Exception {
		int ret = 1;
		String inchi = "";
		String auxInfo = "";
		String message = "";
		String log = "";

		JniInchiOutput result = new JniInchiOutput(ret, inchi, auxInfo, message, log);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiOutput : Unsupported major.minor version 51.0
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
	 * Run the JniInchiOutput(INCHI_RET,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiOutput_2()
		throws Exception {
		INCHI_RET ret = INCHI_RET.BUSY;
		String inchi = "";
		String auxInfo = "";
		String message = "";
		String log = "";

		JniInchiOutput result = new JniInchiOutput(ret, inchi, auxInfo, message, log);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiOutput : Unsupported major.minor version 51.0
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
	 * Run the String getAuxInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetAuxInfo_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");

		String result = fixture.getAuxInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInchi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchi_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");

		String result = fixture.getInchi();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetLog_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");

		String result = fixture.getLog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");

		String result = fixture.getMessage();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_RET getReturnStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetReturnStatus_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");

		INCHI_RET result = fixture.getReturnStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAuxInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetAuxInfo_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");
		String auxInfo = "";

		fixture.setAuxInfo(auxInfo);

		// add additional test code here
	}

	/**
	 * Run the void setInchi(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetInchi_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");
		String inchi = "";

		fixture.setInchi(inchi);

		// add additional test code here
	}

	/**
	 * Run the void setLog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetLog_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");
		String log = "";

		fixture.setLog(log);

		// add additional test code here
	}

	/**
	 * Run the void setMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetMessage_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");
		String message = "";

		fixture.setMessage(message);

		// add additional test code here
	}

	/**
	 * Run the void setRetStatus(INCHI_RET) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetRetStatus_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");
		INCHI_RET retStatus = INCHI_RET.BUSY;

		fixture.setRetStatus(retStatus);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		JniInchiOutput fixture = new JniInchiOutput(INCHI_RET.BUSY, "", "", "", "");

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
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
	 * @generatedBy CodePro at 4/19/14 3:04 PM
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
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JniInchiOutputTest.class);
	}
}