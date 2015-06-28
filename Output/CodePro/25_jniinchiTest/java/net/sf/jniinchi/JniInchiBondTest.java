package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiBondTest</code> contains tests for the class <code>{@link JniInchiBond}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiBondTest {
	/**
	 * Run the JniInchiBond(JniInchiAtom,JniInchiAtom,INCHI_BOND_TYPE) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiBond_1()
		throws Exception {
		JniInchiAtom atO = new JniInchiAtom("");
		JniInchiAtom atT = new JniInchiAtom("");
		INCHI_BOND_TYPE type = INCHI_BOND_TYPE.ALTERN;

		JniInchiBond result = new JniInchiBond(atO, atT, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiBond : Unsupported major.minor version 51.0
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
	 * Run the JniInchiBond(JniInchiAtom,JniInchiAtom,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiBond_2()
		throws Exception {
		JniInchiAtom atO = new JniInchiAtom("");
		JniInchiAtom atT = new JniInchiAtom("");
		int type = 1;
		int stereo = 1;

		JniInchiBond result = new JniInchiBond(atO, atT, type, stereo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiBond : Unsupported major.minor version 51.0
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
	 * Run the JniInchiBond(JniInchiAtom,JniInchiAtom,INCHI_BOND_TYPE,INCHI_BOND_STEREO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiBond_3()
		throws Exception {
		JniInchiAtom atO = new JniInchiAtom("");
		JniInchiAtom atT = new JniInchiAtom("");
		INCHI_BOND_TYPE type = INCHI_BOND_TYPE.ALTERN;
		INCHI_BOND_STEREO stereo = INCHI_BOND_STEREO.DOUBLE_EITHER;

		JniInchiBond result = new JniInchiBond(atO, atT, type, stereo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiBond : Unsupported major.minor version 51.0
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
	 * Run the void debug() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testDebug_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		fixture.debug();

		// add additional test code here
	}

	/**
	 * Run the INCHI_BOND_STEREO getBondStereo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetBondStereo_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		INCHI_BOND_STEREO result = fixture.getBondStereo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_BOND_TYPE getBondType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetBondType_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		INCHI_BOND_TYPE result = fixture.getBondType();

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
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		String result = fixture.getDebugString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getInchiBondStereo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiBondStereo_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		int result = fixture.getInchiBondStereo();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInchiBondType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiBondType_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		int result = fixture.getInchiBondType();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the JniInchiAtom getOriginAtom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetOriginAtom_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		JniInchiAtom result = fixture.getOriginAtom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiAtom getTargetAtom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetTargetAtom_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);

		JniInchiAtom result = fixture.getTargetAtom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setStereoDefinition(INCHI_BOND_STEREO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetStereoDefinition_1()
		throws Exception {
		JniInchiBond fixture = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN, INCHI_BOND_STEREO.DOUBLE_EITHER);
		INCHI_BOND_STEREO stereo = INCHI_BOND_STEREO.DOUBLE_EITHER;

		fixture.setStereoDefinition(stereo);

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
		new org.junit.runner.JUnitCore().run(JniInchiBondTest.class);
	}
}