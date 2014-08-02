package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiAtomTest</code> contains tests for the class <code>{@link JniInchiAtom}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiAtomTest {
	/**
	 * Run the JniInchiAtom(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiAtom_1()
		throws Exception {
		String el = "";

		JniInchiAtom result = new JniInchiAtom(el);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiAtom : Unsupported major.minor version 51.0
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
	 * Run the JniInchiAtom(double,double,double,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiAtom_2()
		throws Exception {
		double x = 1.0;
		double y = 1.0;
		double z = 1.0;
		String el = null;

		JniInchiAtom result = new JniInchiAtom(x, y, z, el);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiAtom : Unsupported major.minor version 51.0
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
	 * Run the JniInchiAtom(double,double,double,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiAtom_3()
		throws Exception {
		double x = 1.0;
		double y = 1.0;
		double z = 1.0;
		String el = "";

		JniInchiAtom result = new JniInchiAtom(x, y, z, el);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiAtom : Unsupported major.minor version 51.0
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
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		fixture.debug();

		// add additional test code here
	}

	/**
	 * Run the int getCharge() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetCharge_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getCharge();

		// add additional test code here
		assertEquals(0, result);
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
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		String result = fixture.getDebugString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getElementType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetElementType_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		String result = fixture.getElementType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getImplicitDeuterium() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetImplicitDeuterium_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getImplicitDeuterium();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getImplicitH() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetImplicitH_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getImplicitH();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getImplicitProtium() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetImplicitProtium_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getImplicitProtium();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getImplicitTritium() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetImplicitTritium_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getImplicitTritium();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInchiRadical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiRadical_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getInchiRadical();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIsotopicMass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetIsotopicMass_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		int result = fixture.getIsotopicMass();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the INCHI_RADICAL getRadical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetRadical_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		INCHI_RADICAL result = fixture.getRadical();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		double result = fixture.getX();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		double result = fixture.getY();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getZ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetZ_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);

		double result = fixture.getZ();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void setCharge(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetCharge_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int charge = 1;

		fixture.setCharge(charge);

		// add additional test code here
	}

	/**
	 * Run the void setImplicitDeuterium(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetImplicitDeuterium_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int n = 1;

		fixture.setImplicitDeuterium(n);

		// add additional test code here
	}

	/**
	 * Run the void setImplicitH(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetImplicitH_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int n = 1;

		fixture.setImplicitH(n);

		// add additional test code here
	}

	/**
	 * Run the void setImplicitProtium(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetImplicitProtium_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int n = 1;

		fixture.setImplicitProtium(n);

		// add additional test code here
	}

	/**
	 * Run the void setImplicitTritium(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetImplicitTritium_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int n = 1;

		fixture.setImplicitTritium(n);

		// add additional test code here
	}

	/**
	 * Run the void setInchiRadical(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetInchiRadical_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int radical = 1;

		fixture.setInchiRadical(radical);

		// add additional test code here
	}

	/**
	 * Run the void setIsotopicMass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetIsotopicMass_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int mass = 1;

		fixture.setIsotopicMass(mass);

		// add additional test code here
	}

	/**
	 * Run the void setIsotopicMassShift(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetIsotopicMassShift_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		int shift = 1;

		fixture.setIsotopicMassShift(shift);

		// add additional test code here
	}

	/**
	 * Run the void setRadical(INCHI_RADICAL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetRadical_1()
		throws Exception {
		JniInchiAtom fixture = new JniInchiAtom(1.0, 1.0, 1.0, "");
		fixture.setImplicitH(1);
		fixture.setImplicitDeuterium(1);
		fixture.setIsotopicMass(1);
		fixture.setImplicitProtium(1);
		fixture.setImplicitTritium(1);
		fixture.setCharge(1);
		fixture.setRadical(INCHI_RADICAL.DOUBLET);
		INCHI_RADICAL radical = INCHI_RADICAL.DOUBLET;

		fixture.setRadical(radical);

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
		new org.junit.runner.JUnitCore().run(JniInchiAtomTest.class);
	}
}