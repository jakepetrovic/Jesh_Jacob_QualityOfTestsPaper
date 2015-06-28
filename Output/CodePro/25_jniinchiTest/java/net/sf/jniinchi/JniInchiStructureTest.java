package net.sf.jniinchi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiStructureTest</code> contains tests for the class <code>{@link JniInchiStructure}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiStructureTest {
	/**
	 * Run the JniInchiStructure() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testJniInchiStructure_1()
		throws Exception {
		JniInchiStructure result = new JniInchiStructure();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the JniInchiAtom addAtom(JniInchiAtom) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddAtom_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		JniInchiAtom atom = new JniInchiAtom("");

		JniInchiAtom result = fixture.addAtom(atom);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addAtoms(JniInchiAtom[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddAtoms_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		fixture.addAtoms();

		// add additional test code here
	}

	/**
	 * Run the void addAtoms(JniInchiAtom[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddAtoms_2()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		fixture.addAtoms();

		// add additional test code here
	}

	/**
	 * Run the JniInchiBond addBond(JniInchiBond) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddBond_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		JniInchiBond bond = new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN);

		JniInchiBond result = fixture.addBond(bond);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addBonds(JniInchiBond[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddBonds_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		fixture.addBonds();

		// add additional test code here
	}

	/**
	 * Run the void addBonds(JniInchiBond[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddBonds_2()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		fixture.addBonds();

		// add additional test code here
	}

	/**
	 * Run the JniInchiStereo0D addStereo0D(JniInchiStereo0D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testAddStereo0D_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		JniInchiStereo0D parity = JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN);

		JniInchiStereo0D result = fixture.addStereo0D(parity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiAtom getAtom(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetAtom_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		int i = 1;

		JniInchiAtom result = fixture.getAtom(i);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getAtomIndex(JniInchiAtom) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetAtomIndex_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		JniInchiAtom atom = new JniInchiAtom("");

		int result = fixture.getAtomIndex(atom);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the JniInchiBond getBond(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetBond_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		int i = 1;

		JniInchiBond result = fixture.getBond(i);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getNumAtoms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetNumAtoms_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		int result = fixture.getNumAtoms();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumBonds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetNumBonds_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		int result = fixture.getNumBonds();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumStereo0D() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetNumStereo0D_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		int result = fixture.getNumStereo0D();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the JniInchiStereo0D getStereo0D(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetStereo0D_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		int i = 1;

		JniInchiStereo0D result = fixture.getStereo0D(i);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getStereo0DIndex(JniInchiStereo0D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetStereo0DIndex_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN);

		int result = fixture.getStereo0DIndex(stereo);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setStructure(JniInchiStructure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testSetStructure_1()
		throws Exception {
		JniInchiStructure fixture = new JniInchiStructure();
		fixture.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		fixture.addAtom(new JniInchiAtom(""));
		fixture.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));
		JniInchiStructure structure = new JniInchiStructure();
		structure.addBond(new JniInchiBond(new JniInchiAtom(""), new JniInchiAtom(""), INCHI_BOND_TYPE.ALTERN));
		structure.addAtom(new JniInchiAtom(""));
		structure.addStereo0D(JniInchiStereo0D.createNewDoublebondStereo0D(new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), new JniInchiAtom(""), INCHI_PARITY.EVEN));

		fixture.setStructure(structure);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiStructure : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
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
		new org.junit.runner.JUnitCore().run(JniInchiStructureTest.class);
	}
}