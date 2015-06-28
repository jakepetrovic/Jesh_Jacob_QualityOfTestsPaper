package ch.bluepenguin.email.client.service;

import junit.framework.*;

/**
 * The class <code>EmailFacadeExceptionTest</code> contains tests for the class <code>{@link EmailFacadeException}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class EmailFacadeExceptionTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeException fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeException fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeException fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private EmailFacadeException fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeException getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new EmailFacadeException();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeException getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new EmailFacadeException();
			fixture2.setTechnicalException(new Exception(""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeException getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new EmailFacadeException();
			fixture3.setTechnicalException(new Exception("", new Throwable("")));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see EmailFacadeException
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public EmailFacadeException getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new EmailFacadeException();
			fixture4.setTechnicalException(new Exception("0123456789", new Throwable("", (Throwable) null)));
		}
		return fixture4;
	}

	/**
	 * Run the Exception getTechnicalException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalException_fixture1_1()
		throws Exception {
		EmailFacadeException fixture = getFixture1();

		Exception result = fixture.getTechnicalException();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Exception getTechnicalException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalException_fixture2_1()
		throws Exception {
		EmailFacadeException fixture = getFixture2();

		Exception result = fixture.getTechnicalException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("java.lang.Exception: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the Exception getTechnicalException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalException_fixture3_1()
		throws Exception {
		EmailFacadeException fixture = getFixture3();

		Exception result = fixture.getTechnicalException();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.lang.Exception: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the Exception getTechnicalException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetTechnicalException_fixture4_1()
		throws Exception {
		EmailFacadeException fixture = getFixture4();

		Exception result = fixture.getTechnicalException();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.lang.Exception: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture1_1()
		throws Exception {
		EmailFacadeException fixture = getFixture1();
		Exception technicalException = new Exception("");

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture2_1()
		throws Exception {
		EmailFacadeException fixture = getFixture2();
		Exception technicalException = new Exception("", new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture3_1()
		throws Exception {
		EmailFacadeException fixture = getFixture3();
		Exception technicalException = new Exception("0123456789", new Throwable("", (Throwable) null));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture4_1()
		throws Exception {
		EmailFacadeException fixture = getFixture4();
		Exception technicalException = new Exception();

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture1_2()
		throws Exception {
		EmailFacadeException fixture = getFixture1();
		Exception technicalException = new Exception(new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture3_2()
		throws Exception {
		EmailFacadeException fixture = getFixture3();
		Exception technicalException = new Exception("");

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture4_2()
		throws Exception {
		EmailFacadeException fixture = getFixture4();
		Exception technicalException = new Exception("", new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture1_3()
		throws Exception {
		EmailFacadeException fixture = getFixture1();
		Exception technicalException = new Exception("0123456789", new Throwable("", (Throwable) null));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture2_2()
		throws Exception {
		EmailFacadeException fixture = getFixture2();
		Exception technicalException = new Exception();

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture3_3()
		throws Exception {
		EmailFacadeException fixture = getFixture3();
		Exception technicalException = new Exception(new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture1_4()
		throws Exception {
		EmailFacadeException fixture = getFixture1();
		Exception technicalException = new Exception("", new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture2_3()
		throws Exception {
		EmailFacadeException fixture = getFixture2();
		Exception technicalException = new Exception("0123456789", new Throwable("", (Throwable) null));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture3_4()
		throws Exception {
		EmailFacadeException fixture = getFixture3();
		Exception technicalException = new Exception();

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture4_3()
		throws Exception {
		EmailFacadeException fixture = getFixture4();
		Exception technicalException = new Exception(new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture2_4()
		throws Exception {
		EmailFacadeException fixture = getFixture2();
		Exception technicalException = new Exception("");

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture3_5()
		throws Exception {
		EmailFacadeException fixture = getFixture3();
		Exception technicalException = new Exception("", new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture4_4()
		throws Exception {
		EmailFacadeException fixture = getFixture4();
		Exception technicalException = new Exception("0123456789", new Throwable("", (Throwable) null));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture1_5()
		throws Exception {
		EmailFacadeException fixture = getFixture1();
		Exception technicalException = new Exception();

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture2_5()
		throws Exception {
		EmailFacadeException fixture = getFixture2();
		Exception technicalException = new Exception(new Throwable(""));

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Run the void setTechnicalException(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetTechnicalException_fixture4_5()
		throws Exception {
		EmailFacadeException fixture = getFixture4();
		Exception technicalException = new Exception("");

		fixture.setTechnicalException(technicalException);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}