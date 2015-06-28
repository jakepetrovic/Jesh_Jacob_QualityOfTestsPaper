package nu.staldal.xodus;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XMLCharacterEncoderTest</code> contains tests for the class <code>{@link XMLCharacterEncoder}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLCharacterEncoderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLCharacterEncoder
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLCharacterEncoder fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLCharacterEncoder
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLCharacterEncoder getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new XMLCharacterEncoder((Writer) null);
		}
		return fixture;
	}

	/**
	 * Run the XMLCharacterEncoder(Writer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testXMLCharacterEncoder_1()
		throws Exception {
		Writer writer = null;

		XMLCharacterEncoder result = new XMLCharacterEncoder(writer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLCharacterEncoder(OutputStream,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testXMLCharacterEncoder_2()
		throws Exception {
		OutputStream os = new ByteArrayOutputStream();
		String encoding = "";

		XMLCharacterEncoder result = new XMLCharacterEncoder(os, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLCharacterEncoder(OutputStream,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testXMLCharacterEncoder_3()
		throws Exception {
		OutputStream os = new ByteArrayOutputStream();
		String encoding = "0123456789";

		XMLCharacterEncoder result = new XMLCharacterEncoder(os, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testClose_fixture_1()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();

		fixture2.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder._finish(XMLCharacterEncoder.java:278)
		//       at nu.staldal.xodus.XMLCharacterEncoder.close(XMLCharacterEncoder.java:299)
	}

	/**
	 * Run the void disableEscaping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDisableEscaping_fixture_1()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();

		fixture2.disableEscaping();

		// add additional test code here
	}

	/**
	 * Run the void enableEscaping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testEnableEscaping_fixture_1()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();

		fixture2.enableEscaping();

		// add additional test code here
	}

	/**
	 * Run the void finish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFinish_fixture_1()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();

		fixture2.finish();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder._finish(XMLCharacterEncoder.java:278)
		//       at nu.staldal.xodus.XMLCharacterEncoder.finish(XMLCharacterEncoder.java:257)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFlush_fixture_1()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();

		fixture2.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.flush(XMLCharacterEncoder.java:244)
	}

	/**
	 * Run the void write(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_1()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		int c = 0;

		fixture2.write(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:174)
	}

	/**
	 * Run the void write(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_2()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		int c = 1;

		fixture2.write(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:174)
	}

	/**
	 * Run the void write(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_3()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		int c = 7;

		fixture2.write(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:174)
	}

	/**
	 * Run the void write(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_4()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";

		fixture2.write(str);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:216)
	}

	/**
	 * Run the void write(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_5()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";

		fixture2.write(str);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:216)
	}

	/**
	 * Run the void write(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_6()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};

		fixture2.write(cbuf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:188)
	}

	/**
	 * Run the void write(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_7()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};

		fixture2.write(cbuf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:188)
	}

	/**
	 * Run the void write(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_8()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'\n'};

		fixture2.write(cbuf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:188)
	}

	/**
	 * Run the void write(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_9()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};

		fixture2.write(cbuf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:188)
	}

	/**
	 * Run the void write(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_10()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};

		fixture2.write(cbuf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:188)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_11()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 0;
		int len = 0;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_12()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 1;
		int len = 1;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_13()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 7;
		int len = 7;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_14()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 1;
		int len = 0;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_15()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 7;
		int len = 1;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_16()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 0;
		int len = 7;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_17()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 7;
		int len = 0;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_18()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 0;
		int len = 1;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_19()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 1;
		int len = 7;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_20()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 0;
		int len = 0;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_21()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 1;
		int len = 1;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_22()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 7;
		int len = 7;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_23()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 1;
		int len = 0;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_24()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 7;
		int len = 1;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_25()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 0;
		int len = 7;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_26()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 7;
		int len = 0;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_27()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "0123456789";
		int off = 0;
		int len = 1;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_28()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		String str = "";
		int off = 1;
		int len = 7;

		fixture2.write(str, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:464)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:230)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_29()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};
		int off = 0;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_30()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 1;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_31()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'\n'};
		int off = 7;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_32()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};
		int off = 0;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_33()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};
		int off = 1;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_34()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'\n'};
		int off = 0;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_35()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};
		int off = 1;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_36()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};
		int off = 7;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_37()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 0;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_38()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'\n'};
		int off = 1;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_39()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};
		int off = 0;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_40()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};
		int off = 1;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_41()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 7;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_42()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};
		int off = 0;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_43()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};
		int off = 1;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_44()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};
		int off = 7;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_45()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'\n'};
		int off = 0;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_46()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};
		int off = 7;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_47()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};
		int off = 0;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_48()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 1;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_49()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};
		int off = 0;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_50()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};
		int off = 1;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_51()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 0;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_52()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'\n'};
		int off = 1;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.XMLCharacterEncoder.encodeWrite(XMLCharacterEncoder.java:317)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_53()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};
		int off = 7;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_54()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' ', '\n', 'a', '�'};
		int off = 0;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_55()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 7;
		int len = 1;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_56()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'a'};
		int off = 0;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_57()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {'�'};
		int off = 7;
		int len = 0;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
	}

	/**
	 * Run the void write(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testWrite_fixture_58()
		throws Exception {
		XMLCharacterEncoder fixture2 = getFixture();
		char[] cbuf = new char[] {' '};
		int off = 0;
		int len = 7;

		fixture2.write(cbuf, off, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException
		//       at java.nio.CharBuffer.wrap(CharBuffer.java:371)
		//       at nu.staldal.xodus.XMLCharacterEncoder.write(XMLCharacterEncoder.java:202)
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
		new org.junit.runner.JUnitCore().run(XMLCharacterEncoderTest.class);
	}
}