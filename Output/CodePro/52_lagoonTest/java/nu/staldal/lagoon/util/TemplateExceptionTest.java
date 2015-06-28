package nu.staldal.lagoon.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TemplateExceptionTest</code> contains tests for the class <code>{@link TemplateException}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TemplateExceptionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TemplateException
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private TemplateException fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TemplateException
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private TemplateException fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TemplateException
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private TemplateException fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TemplateException
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public TemplateException getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new TemplateException("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TemplateException
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public TemplateException getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new TemplateException();
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TemplateException
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public TemplateException getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new TemplateException(new Exception(""));
		}
		return fixture3;
	}

	/**
	 * Run the TemplateException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_1()
		throws Exception {

		TemplateException result = new TemplateException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getException());
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_2()
		throws Exception {
		Exception e = new Exception("");

		TemplateException result = new TemplateException(e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_3()
		throws Exception {
		Exception e = new Exception("", new Throwable(""));

		TemplateException result = new TemplateException(e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_4()
		throws Exception {
		Exception e = new Exception("0123456789", new Throwable("", (Throwable) null));

		TemplateException result = new TemplateException(e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_5()
		throws Exception {
		Exception e = new Exception();

		TemplateException result = new TemplateException(e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_6()
		throws Exception {
		Exception e = new Exception(new Throwable(""));

		TemplateException result = new TemplateException(e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_7()
		throws Exception {
		String template = "";

		TemplateException result = new TemplateException(template);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getException());
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the TemplateException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testTemplateException_8()
		throws Exception {
		String template = "0123456789";

		TemplateException result = new TemplateException(template);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getException());
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.util.TemplateException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the Exception getException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetException_fixture1_1()
		throws Exception {
		TemplateException fixture = getFixture1();

		Exception result = fixture.getException();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Exception getException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetException_fixture2_1()
		throws Exception {
		TemplateException fixture = getFixture2();

		Exception result = fixture.getException();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Exception getException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetException_fixture3_1()
		throws Exception {
		TemplateException fixture = getFixture3();

		Exception result = fixture.getException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("java.lang.Exception: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TemplateExceptionTest.class);
	}
}