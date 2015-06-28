package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiOutputStructureTest</code> contains tests for the class <code>{@link JniInchiOutputStructure}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiOutputStructureTest {
	/**
	 * Run the JniInchiOutputStructure(INCHI_RET) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiOutputStructure_1()
		throws Exception {
		INCHI_RET value = INCHI_RET.BUSY;

		JniInchiOutputStructure result = new JniInchiOutputStructure(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiOutputStructure : Unsupported major.minor version 51.0
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
	 * Run the JniInchiOutputStructure(int,String,String,long,long,long,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiOutputStructure_2()
		throws Exception {
		int ret = 1;
		String message = "";
		String log = "";
		long w00 = 1L;
		long w01 = 1L;
		long w10 = 1L;
		long w11 = 1L;

		JniInchiOutputStructure result = new JniInchiOutputStructure(ret, message, log, w00, w01, w10, w11);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiOutputStructure : Unsupported major.minor version 51.0
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
	 * Run the String getLog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetLog_1()
		throws Exception {
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));

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
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));

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
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));

		INCHI_RET result = fixture.getReturnStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long[][] getWarningFlags() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetWarningFlags_1()
		throws Exception {
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));

		long[][] result = fixture.getWarningFlags();

		// add additional test code here
		assertNotNull(result);
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
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
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
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
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
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		INCHI_RET retStatus = INCHI_RET.BUSY;

		fixture.setRetStatus(retStatus);

		// add additional test code here
	}

	/**
	 * Run the void setWarningFlags(long[][]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetWarningFlags_1()
		throws Exception {
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		long[][] warningFlags = new long[][] {};

		fixture.setWarningFlags(warningFlags);

		// add additional test code here
	}

	/**
	 * Run the void setWarningFlags(long,long,long,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetWarningFlags_2()
		throws Exception {
		JniInchiOutputStructure fixture = new JniInchiOutputStructure(INCHI_RET.BUSY);
		fixture.setWarningFlags(new long[][] {});
		fixture.setMessage("");
		fixture.setLog("");
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		long f00 = 1L;
		long f01 = 1L;
		long f10 = 1L;
		long f11 = 1L;

		fixture.setWarningFlags(f00, f01, f10, f11);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JniInchiOutputStructureTest.class);
	}
}