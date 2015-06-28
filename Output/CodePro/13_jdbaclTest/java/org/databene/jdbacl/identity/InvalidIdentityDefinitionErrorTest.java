package org.databene.jdbacl.identity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InvalidIdentityDefinitionErrorTest</code> contains tests for the class <code>{@link InvalidIdentityDefinitionError}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class InvalidIdentityDefinitionErrorTest {
	/**
	 * Run the InvalidIdentityDefinitionError() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_1()
		throws Exception {

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_2()
		throws Exception {
		String message = "";

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_3()
		throws Exception {
		String message = "0123456789";

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_4()
		throws Exception {
		Throwable cause = new Throwable("");

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_5()
		throws Exception {
		Throwable cause = new Throwable("", (Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: java.lang.Throwable: ", result.toString());
		assertEquals("java.lang.Throwable: ", result.getMessage());
		assertEquals("java.lang.Throwable: ", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_6()
		throws Exception {
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: java.lang.Throwable: 0123456789", result.toString());
		assertEquals("java.lang.Throwable: 0123456789", result.getMessage());
		assertEquals("java.lang.Throwable: 0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_7()
		throws Exception {
		Throwable cause = new Throwable();

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_8()
		throws Exception {
		Throwable cause = new Throwable((Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_9()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("");

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_10()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("", (Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_11()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_12()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable();

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_13()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable((Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_14()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable("", (Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_15()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("0123456789", (Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_16()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_17()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable((Throwable) null);

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the InvalidIdentityDefinitionError(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testInvalidIdentityDefinitionError_18()
		throws Exception {
		String message = "0123456789";
		Throwable cause = new Throwable("");

		InvalidIdentityDefinitionError result = new InvalidIdentityDefinitionError(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.databene.jdbacl.identity.InvalidIdentityDefinitionError: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InvalidIdentityDefinitionErrorTest.class);
	}
}