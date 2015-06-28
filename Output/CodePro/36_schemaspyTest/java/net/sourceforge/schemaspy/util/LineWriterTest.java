package net.sourceforge.schemaspy.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LineWriterTest</code> contains tests for the class <code>{@link LineWriter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:23 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LineWriterTest {
	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_1()
		throws Exception {
		File file = File.createTempFile("", "");
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_2()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_3()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_4()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_5()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_6()
		throws Exception {
		File file = new File("");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_7()
		throws Exception {
		File file = new File("", "");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_8()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_9()
		throws Exception {
		File file = new File(URI.create(""));
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_10()
		throws Exception {
		File file = new File((File) null, "");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_11()
		throws Exception {
		File file = new File((File) null, "0123456789");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_12()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_13()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_14()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_15()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_16()
		throws Exception {
		File file = new File("");
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_17()
		throws Exception {
		File file = new File("", "");
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_18()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_19()
		throws Exception {
		File file = new File(URI.create(""));
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_20()
		throws Exception {
		File file = new File((File) null, "");
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_21()
		throws Exception {
		File file = new File((File) null, "0123456789");
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_22()
		throws Exception {
		File file = File.createTempFile("", "");
		String charset = "1";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_23()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_24()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_25()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_26()
		throws Exception {
		File file = new File("");
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_27()
		throws Exception {
		File file = new File("", "");
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_28()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_29()
		throws Exception {
		File file = new File(URI.create(""));
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_30()
		throws Exception {
		File file = new File((File) null, "");
		String charset = "";

		LineWriter result = new LineWriter(file, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_31()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		String charset = "";

		LineWriter result = new LineWriter(out, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_32()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		String charset = "0123456789";

		LineWriter result = new LineWriter(out, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_33()
		throws Exception {
		String filename = "";
		String charset = "";

		LineWriter result = new LineWriter(filename, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_34()
		throws Exception {
		String filename = "0123456789";
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_35()
		throws Exception {
		String filename = "";
		String charset = "1";

		LineWriter result = new LineWriter(filename, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_36()
		throws Exception {
		String filename = "";
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_37()
		throws Exception {
		String filename = "0123456789";
		String charset = "1";

		LineWriter result = new LineWriter(filename, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_38()
		throws Exception {
		String filename = "0123456789";
		String charset = "";

		LineWriter result = new LineWriter(filename, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_39()
		throws Exception {
		File file = File.createTempFile("", "");
		int sz = 0;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_40()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);
		int sz = 1;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_41()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		int sz = 2;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_42()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		int sz = 7;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_43()
		throws Exception {
		File file = new File("");
		int sz = 0;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_44()
		throws Exception {
		File file = new File("", "");
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_45()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_46()
		throws Exception {
		File file = new File(URI.create(""));
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_47()
		throws Exception {
		File file = new File((File) null, "");
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_48()
		throws Exception {
		File file = new File((File) null, "0123456789");
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_49()
		throws Exception {
		File file = File.createTempFile("", "");
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_50()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);
		int sz = 7;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_51()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		int sz = 0;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_52()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		int sz = 1;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_53()
		throws Exception {
		File file = new File("");
		int sz = 2;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_54()
		throws Exception {
		File file = new File("", "");
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_55()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_56()
		throws Exception {
		File file = new File(URI.create(""));
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_57()
		throws Exception {
		File file = new File((File) null, "");
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_58()
		throws Exception {
		File file = new File((File) null, "0123456789");
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_59()
		throws Exception {
		File file = File.createTempFile("", "");
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_60()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		int sz = 0;
		String charset = "1";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_61()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		int sz = 2;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_62()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		int sz = 7;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_63()
		throws Exception {
		File file = new File("", "");
		int sz = 0;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_64()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_65()
		throws Exception {
		File file = new File(URI.create(""));
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_66()
		throws Exception {
		File file = new File((File) null, "");
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_67()
		throws Exception {
		File file = new File((File) null, "0123456789");
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(File,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_68()
		throws Exception {
		File file = File.createTempFile("", "");
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(file, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_69()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 0;
		String charset = "";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_70()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 1;
		String charset = "0123456789";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_71()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 2;
		String charset = "0123456789";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_72()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_73()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_74()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 2;
		String charset = "";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_75()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 7;
		String charset = "";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(OutputStream,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testLineWriter_76()
		throws Exception {
		OutputStream out = new ByteArrayOutputStream();
		int sz = 0;
		String charset = "0123456789";

		LineWriter result = new LineWriter(out, sz, charset);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_77()
		throws Exception {
		String filename = "";
		int sz = 0;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_78()
		throws Exception {
		String filename = "0123456789";
		int sz = 1;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_79()
		throws Exception {
		String filename = "";
		int sz = 2;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_80()
		throws Exception {
		String filename = "0123456789";
		int sz = 7;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_81()
		throws Exception {
		String filename = "0123456789";
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_82()
		throws Exception {
		String filename = "";
		int sz = 2;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_83()
		throws Exception {
		String filename = "0123456789";
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_84()
		throws Exception {
		String filename = "0123456789";
		int sz = 0;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_85()
		throws Exception {
		String filename = "";
		int sz = 2;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_86()
		throws Exception {
		String filename = "0123456789";
		int sz = 7;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_87()
		throws Exception {
		String filename = "0123456789";
		int sz = 0;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_88()
		throws Exception {
		String filename = "";
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_89()
		throws Exception {
		String filename = "0123456789";
		int sz = 2;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_90()
		throws Exception {
		String filename = "0123456789";
		int sz = 0;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_91()
		throws Exception {
		String filename = "";
		int sz = 1;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_92()
		throws Exception {
		String filename = "0123456789";
		int sz = 2;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_93()
		throws Exception {
		String filename = "";
		int sz = 7;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_94()
		throws Exception {
		String filename = "";
		int sz = 1;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_95()
		throws Exception {
		String filename = "0123456789";
		int sz = 2;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_96()
		throws Exception {
		String filename = "";
		int sz = 7;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_97()
		throws Exception {
		String filename = "";
		int sz = 0;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_98()
		throws Exception {
		String filename = "0123456789";
		int sz = 1;
		String charset = "1";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_99()
		throws Exception {
		String filename = "";
		int sz = 7;
		String charset = "";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the LineWriter(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testLineWriter_100()
		throws Exception {
		String filename = "";
		int sz = 0;
		String charset = "0123456789";

		LineWriter result = new LineWriter(filename, sz, charset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
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
	 * @generatedBy CodePro at 6/7/15 4:23 PM
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
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LineWriterTest.class);
	}
}