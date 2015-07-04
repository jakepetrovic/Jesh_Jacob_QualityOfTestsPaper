package org.saxpath;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SAXPathExceptionTest</code> contains tests for the class <code>{@link SAXPathException}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SAXPathExceptionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SAXPathException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private SAXPathException fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SAXPathException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public SAXPathException getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SAXPathException("");
		}
		return fixture;
	}

	/**
	 * Run the SAXPathException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSAXPathException_1()
		throws Exception {
		String msg = "";

		SAXPathException result = new SAXPathException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.saxpath.SAXPathException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the SAXPathException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSAXPathException_2()
		throws Exception {
		String msg = "0123456789";

		SAXPathException result = new SAXPathException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.saxpath.SAXPathException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the SAXPathException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSAXPathException_3()
		throws Exception {
		Throwable src = null;

		SAXPathException result = new SAXPathException(src);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.saxpath.SAXPathException.<init>(SAXPathException.java:91)
		assertNotNull(result);
	}

	/**
	 * Run the Throwable getCause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetCause_fixture_1()
		throws Exception {
		SAXPathException fixture2 = getFixture();

		Throwable result = fixture2.getCause();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void printStackTrace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_1()
		throws Exception {
		SAXPathException fixture2 = getFixture();

		fixture2.printStackTrace();

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_2()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream("");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.FileNotFoundException:  (No such file or directory)
		//       at java.io.FileOutputStream.open(Native Method)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:221)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at java.io.PrintStream.<init>(PrintStream.java:208)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_3()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream("", "");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 
		//       at java.io.PrintStream.toCharset(PrintStream.java:96)
		//       at java.io.PrintStream.<init>(PrintStream.java:248)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_4()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream("0123456789", "0123456789");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 0123456789
		//       at java.io.PrintStream.toCharset(PrintStream.java:96)
		//       at java.io.PrintStream.<init>(PrintStream.java:248)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_5()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream(File.createTempFile("", ""));

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_6()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream(File.createTempFile("", ""), "");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_7()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_8()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream(new ByteArrayOutputStream());

		fixture2.printStackTrace(s);

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_9()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream(new ByteArrayOutputStream(), false);

		fixture2.printStackTrace(s);

		// add additional test code here
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_10()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream(new ByteArrayOutputStream(), false, "");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 
		//       at java.io.PrintStream.toCharset(PrintStream.java:96)
		//       at java.io.PrintStream.<init>(PrintStream.java:175)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_11()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream((OutputStream) null, false, "An��t-1.0.txt");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Null output stream
		//       at java.io.PrintStream.requireNonNull(PrintStream.java:79)
		//       at java.io.PrintStream.<init>(PrintStream.java:175)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_12()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream((OutputStream) null, true);

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Null output stream
		//       at java.io.PrintStream.requireNonNull(PrintStream.java:79)
		//       at java.io.PrintStream.<init>(PrintStream.java:151)
	}

	/**
	 * Run the void printStackTrace(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_13()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		PrintStream s = new PrintStream((OutputStream) null, true, "0123456789");

		fixture2.printStackTrace(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: Null output stream
		//       at java.io.PrintStream.requireNonNull(PrintStream.java:79)
		//       at java.io.PrintStream.<init>(PrintStream.java:175)
	}

	/**
	 * Run the void printStackTrace(PrintWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPrintStackTrace_fixture_14()
		throws Exception {
		SAXPathException fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter s = new PrintWriter(stringWriter);

		fixture2.printStackTrace(s);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SAXPathExceptionTest.class);
	}
}