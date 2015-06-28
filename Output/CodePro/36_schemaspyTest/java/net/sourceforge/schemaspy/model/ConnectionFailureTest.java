package net.sourceforge.schemaspy.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConnectionFailureTest</code> contains tests for the class <code>{@link ConnectionFailure}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ConnectionFailureTest {
	/**
	 * Run the ConnectionFailure(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_1()
		throws Exception {
		String msg = "";

		ConnectionFailure result = new ConnectionFailure(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_2()
		throws Exception {
		String msg = "0123456789";

		ConnectionFailure result = new ConnectionFailure(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_3()
		throws Exception {
		Throwable cause = new Throwable("");

		ConnectionFailure result = new ConnectionFailure(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_4()
		throws Exception {
		Throwable cause = new Throwable("", (Throwable) null);

		ConnectionFailure result = new ConnectionFailure(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_5()
		throws Exception {
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		ConnectionFailure result = new ConnectionFailure(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.Throwable: 0123456789", result.toString());
		assertEquals("java.lang.Throwable: 0123456789", result.getMessage());
		assertEquals("java.lang.Throwable: 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_6()
		throws Exception {
		Throwable cause = new Throwable();

		ConnectionFailure result = new ConnectionFailure(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_7()
		throws Exception {
		Throwable cause = new Throwable((Throwable) null);

		ConnectionFailure result = new ConnectionFailure(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_8()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable("");

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure:  ", result.toString());
		assertEquals(" ", result.getMessage());
		assertEquals(" ", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_9()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: 0123456789 ", result.toString());
		assertEquals("0123456789 ", result.getMessage());
		assertEquals("0123456789 ", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_10()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure:  0123456789", result.toString());
		assertEquals(" 0123456789", result.getMessage());
		assertEquals(" 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_11()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable();

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: 0123456789 null", result.toString());
		assertEquals("0123456789 null", result.getMessage());
		assertEquals("0123456789 null", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_12()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable((Throwable) null);

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure:  null", result.toString());
		assertEquals(" null", result.getMessage());
		assertEquals(" null", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_13()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable("", (Throwable) null);

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure:  ", result.toString());
		assertEquals(" ", result.getMessage());
		assertEquals(" ", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_14()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: 0123456789 0123456789", result.toString());
		assertEquals("0123456789 0123456789", result.getMessage());
		assertEquals("0123456789 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_15()
		throws Exception {
		String msg = "";
		Throwable cause = new Throwable();

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure:  null", result.toString());
		assertEquals(" null", result.getMessage());
		assertEquals(" null", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_16()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable((Throwable) null);

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: 0123456789 null", result.toString());
		assertEquals("0123456789 null", result.getMessage());
		assertEquals("0123456789 null", result.getLocalizedMessage());
	}

	/**
	 * Run the ConnectionFailure(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionFailure_17()
		throws Exception {
		String msg = "0123456789";
		Throwable cause = new Throwable("");

		ConnectionFailure result = new ConnectionFailure(msg, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sourceforge.schemaspy.model.ConnectionFailure: 0123456789 ", result.toString());
		assertEquals("0123456789 ", result.getMessage());
		assertEquals("0123456789 ", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConnectionFailureTest.class);
	}
}