package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiStereo0DTest</code> contains tests for the class <code>{@link JniInchiStereo0D}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiStereo0DTest {
	/**
	 * Run the JniInchiStereo0D(JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiStereo0D_1()
		throws Exception {
		JniInchiAtom atC = new JniInchiAtom("");
		JniInchiAtom at0 = new JniInchiAtom("");
		JniInchiAtom at1 = new JniInchiAtom("");
		JniInchiAtom at2 = new JniInchiAtom("");
		JniInchiAtom at3 = new JniInchiAtom("");
		int type = 1;
		int parity = 1;

		JniInchiStereo0D result = new JniInchiStereo0D(atC, at0, at1, at2, at3, type, parity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiStereo0D : Unsupported major.minor version 51.0
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
	 * Run the JniInchiStereo0D(JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,INCHI_STEREOTYPE,INCHI_PARITY) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiStereo0D_2()
		throws Exception {
		JniInchiAtom atC = new JniInchiAtom("");
		JniInchiAtom at0 = new JniInchiAtom("");
		JniInchiAtom at1 = new JniInchiAtom("");
		JniInchiAtom at2 = new JniInchiAtom("");
		JniInchiAtom at3 = new JniInchiAtom("");
		INCHI_STEREOTYPE type = INCHI_STEREOTYPE.ALLENE;
		INCHI_PARITY parity = INCHI_PARITY.EVEN;

		JniInchiStereo0D result = new JniInchiStereo0D(atC, at0, at1, at2, at3, type, parity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiStereo0D : Unsupported major.minor version 51.0
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
	 * Run the JniInchiStereo0D createNewDoublebondStereo0D(JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,INCHI_PARITY) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCreateNewDoublebondStereo0D_1()
		throws Exception {
		JniInchiAtom at0 = new JniInchiAtom("");
		JniInchiAtom at1 = new JniInchiAtom("");
		JniInchiAtom at2 = new JniInchiAtom("");
		JniInchiAtom at3 = new JniInchiAtom("");
		INCHI_PARITY parity = INCHI_PARITY.EVEN;

		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiStereo0D createNewTetrahedralStereo0D(JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,JniInchiAtom,INCHI_PARITY) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCreateNewTetrahedralStereo0D_1()
		throws Exception {
		JniInchiAtom atC = new JniInchiAtom("");
		JniInchiAtom at0 = new JniInchiAtom("");
		JniInchiAtom at1 = new JniInchiAtom("");
		JniInchiAtom at2 = new JniInchiAtom("");
		JniInchiAtom at3 = new JniInchiAtom("");
		INCHI_PARITY parity = INCHI_PARITY.EVEN;

		JniInchiStereo0D result = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void debug() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testDebug_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		fixture.debug();

		// add additional test code here
	}

	/**
	 * Run the JniInchiAtom getCentralAtom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetCentralAtom_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		JniInchiAtom result = fixture.getCentralAtom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDebugString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetDebugString_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		String result = fixture.getDebugString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDebugString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetDebugString_2()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D((JniInchiAtom) null, new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		String result = fixture.getDebugString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getDisconnectedParity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetDisconnectedParity_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		INCHI_PARITY result = fixture.getDisconnectedParity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getInchiParity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiParity_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		int result = fixture.getInchiParity();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInchiStereoType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiStereoType_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		int result = fixture.getInchiStereoType();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the JniInchiAtom getNeighbor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetNeighbor_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);
		int i = 1;

		JniInchiAtom result = fixture.getNeighbor(i);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiAtom[] getNeighbors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetNeighbors_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		JniInchiAtom[] result = fixture.getNeighbors();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_PARITY getParity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetParity_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		INCHI_PARITY result = fixture.getParity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_STEREOTYPE getStereoType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetStereoType_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);

		INCHI_STEREOTYPE result = fixture.getStereoType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDisconnectedParity(INCHI_PARITY) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetDisconnectedParity_1()
		throws Exception {
		JniInchiStereo0D fixture = new JniInchiStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_STEREOTYPE.ALLENE, INCHI_PARITY.EVEN);
		fixture.setDisconnectedParity(INCHI_PARITY.EVEN);
		INCHI_PARITY parity = INCHI_PARITY.EVEN;

		fixture.setDisconnectedParity(parity);

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
		new org.junit.runner.JUnitCore().run(JniInchiStereo0DTest.class);
	}
}