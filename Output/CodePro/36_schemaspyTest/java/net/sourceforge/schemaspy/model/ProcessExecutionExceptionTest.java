package net.sourceforge.schemaspy.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProcessExecutionExceptionTest</code> contains tests for the class <code>{@link ProcessExecutionException}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:21 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ProcessExecutionExceptionTest {
	/**
	 * Run the ProcessExecutionException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_1()
		throws Exception {
		String msg = "";

		ProcessExecutionException result = new ProcessExecutionException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_2()
		throws Exception {
		String msg = "0123456789";

		ProcessExecutionException result = new ProcessExecutionException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_3()
		throws Exception {
		Throwable cause = new Throwable("");

		ProcessExecutionException result = new ProcessExecutionException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_4()
		throws Exception {
		Throwable cause = new Throwable("", (Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_5()
		throws Exception {
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: java.lang.Throwable: 0123456789", result.toString());
		assertEquals("java.lang.Throwable: 0123456789", result.getMessage());
		assertEquals("java.lang.Throwable: 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_6()
		throws Exception {
		Throwable cause = new Throwable();

		ProcessExecutionException result = new ProcessExecutionException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_7()
		throws Exception {
		Throwable cause = new Throwable((Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_8()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable("");

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException:  ", result.toString());
		assertEquals(" ", result.getMessage());
		assertEquals(" ", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_9()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: 0123456789 ", result.toString());
		assertEquals("0123456789 ", result.getMessage());
		assertEquals("0123456789 ", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_10()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException:  0123456789", result.toString());
		assertEquals(" 0123456789", result.getMessage());
		assertEquals(" 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_11()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable();

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: 0123456789 null", result.toString());
		assertEquals("0123456789 null", result.getMessage());
		assertEquals("0123456789 null", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_12()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable((Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException:  null", result.toString());
		assertEquals(" null", result.getMessage());
		assertEquals(" null", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_13()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable("", (Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException:  ", result.toString());
		assertEquals(" ", result.getMessage());
		assertEquals(" ", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_14()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: 0123456789 0123456789", result.toString());
		assertEquals("0123456789 0123456789", result.getMessage());
		assertEquals("0123456789 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_15()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable();

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException:  null", result.toString());
		assertEquals(" null", result.getMessage());
		assertEquals(" null", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_16()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable((Throwable) null);

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: 0123456789 null", result.toString());
		assertEquals("0123456789 null", result.getMessage());
		assertEquals("0123456789 null", result.getLocalizedMessage());
	}

	/**
	 * Run the ProcessExecutionException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testProcessExecutionException_17()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable("");

		ProcessExecutionException result = new ProcessExecutionException(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ProcessExecutionException: 0123456789 ", result.toString());
		assertEquals("0123456789 ", result.getMessage());
		assertEquals("0123456789 ", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProcessExecutionExceptionTest.class);
	}
}