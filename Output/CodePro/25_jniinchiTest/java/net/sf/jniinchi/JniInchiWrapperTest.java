package net.sf.jniinchi;

import java.util.List;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JniInchiWrapperTest</code> contains tests for the class <code>{@link JniInchiWrapper}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:04 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JniInchiWrapperTest {
	/**
	 * Run the INCHI_STATUS checkInchi(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckInchi_1()
		throws Exception {
		String inchi = "";
		boolean strict = true;

		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_STATUS checkInchi(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testCheckInchi_2()
		throws Exception {
		String inchi = "";
		boolean strict = true;

		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_STATUS checkInchi(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testCheckInchi_3()
		throws Exception {
		String inchi = "";
		boolean strict = true;

		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_STATUS checkInchi(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCheckInchi_4()
		throws Exception {
		String inchi = null;
		boolean strict = true;

		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_STATUS checkInchi(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testCheckInchi_5()
		throws Exception {
		String inchi = "";
		boolean strict = true;

		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY_STATUS checkInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckInchiKey_1()
		throws Exception {
		String key = "";

		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY_STATUS checkInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testCheckInchiKey_2()
		throws Exception {
		String key = "";

		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY_STATUS checkInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testCheckInchiKey_3()
		throws Exception {
		String key = "";

		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY_STATUS checkInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCheckInchiKey_4()
		throws Exception {
		String key = null;

		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the INCHI_KEY_STATUS checkInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testCheckInchiKey_5()
		throws Exception {
		String key = "";

		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckOptions_1()
		throws Exception {
		String ops = "";

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckOptions_2()
		throws Exception {
		String ops = "";

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckOptions_3()
		throws Exception {
		String ops = "";

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testCheckOptions_4()
		throws Exception {
		String ops = "";

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCheckOptions_5()
		throws Exception {
		String ops = null;

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(List<INCHI_OPTION>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckOptions_6()
		throws Exception {
		List<INCHI_OPTION> ops = new Vector();

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(List<INCHI_OPTION>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testCheckOptions_7()
		throws Exception {
		List<INCHI_OPTION> ops = new Vector();

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(List<INCHI_OPTION>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testCheckOptions_8()
		throws Exception {
		List<INCHI_OPTION> ops = new Vector();

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String checkOptions(List<INCHI_OPTION>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCheckOptions_9()
		throws Exception {
		List<INCHI_OPTION> ops = null;

		String result = JniInchiWrapper.checkOptions(ops);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchi_1()
		throws Exception {
		JniInchiInput input = new JniInchiInput();

		JniInchiOutput result = JniInchiWrapper.getInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testGetInchi_2()
		throws Exception {
		JniInchiInput input = new JniInchiInput();

		JniInchiOutput result = JniInchiWrapper.getInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetInchi_3()
		throws Exception {
		JniInchiInput input = null;

		JniInchiOutput result = JniInchiWrapper.getInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testGetInchi_4()
		throws Exception {
		JniInchiInput input = new JniInchiInput();

		JniInchiOutput result = JniInchiWrapper.getInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchiFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiFromInchi_1()
		throws Exception {
		JniInchiInputInchi input = new JniInchiInputInchi("", new Vector());
		input.options = "";

		JniInchiOutput result = JniInchiWrapper.getInchiFromInchi(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiInputInchi : Unsupported major.minor version 51.0
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
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchiFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testGetInchiFromInchi_2()
		throws Exception {
		JniInchiInputInchi input = new JniInchiInputInchi("");

		JniInchiOutput result = JniInchiWrapper.getInchiFromInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchiFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetInchiFromInchi_3()
		throws Exception {
		JniInchiInputInchi input = null;

		JniInchiOutput result = JniInchiWrapper.getInchiFromInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getInchiFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testGetInchiFromInchi_4()
		throws Exception {
		JniInchiInputInchi input = new JniInchiInputInchi("");

		JniInchiOutput result = JniInchiWrapper.getInchiFromInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputKey getInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInchiKey_1()
		throws Exception {
		String inchi = "";

		JniInchiOutputKey result = JniInchiWrapper.getInchiKey(inchi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputKey getInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testGetInchiKey_2()
		throws Exception {
		String inchi = "";

		JniInchiOutputKey result = JniInchiWrapper.getInchiKey(inchi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputKey getInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetInchiKey_3()
		throws Exception {
		String inchi = null;

		JniInchiOutputKey result = JniInchiWrapper.getInchiKey(inchi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputKey getInchiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testGetInchiKey_4()
		throws Exception {
		String inchi = "";

		JniInchiOutputKey result = JniInchiWrapper.getInchiKey(inchi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiInputData getInputFromAuxInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetInputFromAuxInfo_1()
		throws Exception {
		String auxInfo = "";

		JniInchiInputData result = JniInchiWrapper.getInputFromAuxInfo(auxInfo);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiInputData getInputFromAuxInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testGetInputFromAuxInfo_2()
		throws Exception {
		String auxInfo = "";

		JniInchiInputData result = JniInchiWrapper.getInputFromAuxInfo(auxInfo);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiInputData getInputFromAuxInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetInputFromAuxInfo_3()
		throws Exception {
		String auxInfo = null;

		JniInchiInputData result = JniInchiWrapper.getInputFromAuxInfo(auxInfo);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiInputData getInputFromAuxInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testGetInputFromAuxInfo_4()
		throws Exception {
		String auxInfo = "";

		JniInchiInputData result = JniInchiWrapper.getInputFromAuxInfo(auxInfo);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getStdInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetStdInchi_1()
		throws Exception {
		JniInchiInput input = new JniInchiInput();

		JniInchiOutput result = JniInchiWrapper.getStdInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getStdInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testGetStdInchi_2()
		throws Exception {
		JniInchiInput input = new JniInchiInput();

		JniInchiOutput result = JniInchiWrapper.getStdInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getStdInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetStdInchi_3()
		throws Exception {
		JniInchiInput input = null;

		JniInchiOutput result = JniInchiWrapper.getStdInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutput getStdInchi(JniInchiInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testGetStdInchi_4()
		throws Exception {
		JniInchiInput input = new JniInchiInput();

		JniInchiOutput result = JniInchiWrapper.getStdInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputStructure getStructureFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testGetStructureFromInchi_1()
		throws Exception {
		JniInchiInputInchi input = new JniInchiInputInchi("", new Vector());
		input.options = "";

		JniInchiOutputStructure result = JniInchiWrapper.getStructureFromInchi(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/jniinchi/JniInchiInputInchi : Unsupported major.minor version 51.0
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
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputStructure getStructureFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.JniInchiException.class)
	public void testGetStructureFromInchi_2()
		throws Exception {
		JniInchiInputInchi input = new JniInchiInputInchi("");

		JniInchiOutputStructure result = JniInchiWrapper.getStructureFromInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputStructure getStructureFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetStructureFromInchi_3()
		throws Exception {
		JniInchiInputInchi input = null;

		JniInchiOutputStructure result = JniInchiWrapper.getStructureFromInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the JniInchiOutputStructure getStructureFromInchi(JniInchiInputInchi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testGetStructureFromInchi_4()
		throws Exception {
		JniInchiInputInchi input = new JniInchiInputInchi("");

		JniInchiOutputStructure result = JniInchiWrapper.getStructureFromInchi(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void loadLibrary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testLoadLibrary_1()
		throws Exception {

		JniInchiWrapper.loadLibrary();

		// add additional test code here
	}

	/**
	 * Run the void loadLibrary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test
	public void testLoadLibrary_2()
		throws Exception {

		JniInchiWrapper.loadLibrary();

		// add additional test code here
	}

	/**
	 * Run the void loadLibrary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testLoadLibrary_3()
		throws Exception {

		JniInchiWrapper.loadLibrary();

		// add additional test code here
	}

	/**
	 * Run the void loadLibrary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:04 PM
	 */
	@Test(expected = net.sf.jniinchi.LoadNativeLibraryException.class)
	public void testLoadLibrary_4()
		throws Exception {

		JniInchiWrapper.loadLibrary();

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
		new org.junit.runner.JUnitCore().run(JniInchiWrapperTest.class);
	}
}