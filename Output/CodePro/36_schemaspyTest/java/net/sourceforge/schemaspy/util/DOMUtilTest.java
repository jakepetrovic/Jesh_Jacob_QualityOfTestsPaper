package net.sourceforge.schemaspy.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Node;

/**
 * The class <code>DOMUtilTest</code> contains tests for the class <code>{@link DOMUtil}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DOMUtilTest {
	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_1()
		throws Exception {
		Node node = new IIOMetadataNode("");
		String name = "";
		String value = "1";

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.DOMUtil.appendAttribute(DOMUtil.java:60)
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_2()
		throws Exception {
		Node node = new IIOMetadataNode();
		String name = "0123456789";
		String value = null;

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_3()
		throws Exception {
		Node node = new IIOMetadataNode();
		String name = "0123456789";
		String value = "1";

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.DOMUtil.appendAttribute(DOMUtil.java:60)
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_4()
		throws Exception {
		Node node = new IIOMetadataNode();
		String name = "";
		String value = null;

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_5()
		throws Exception {
		Node node = new IIOMetadataNode();
		String name = "";
		String value = "1";

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.DOMUtil.appendAttribute(DOMUtil.java:60)
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_6()
		throws Exception {
		Node node = new IIOMetadataNode("");
		String name = "0123456789";
		String value = null;

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_7()
		throws Exception {
		Node node = new IIOMetadataNode("");
		String name = "0123456789";
		String value = "1";

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.DOMUtil.appendAttribute(DOMUtil.java:60)
	}

	/**
	 * Run the void appendAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAppendAttribute_8()
		throws Exception {
		Node node = new IIOMetadataNode("");
		String name = "";
		String value = null;

		DOMUtil.appendAttribute(node, name, value);

		// add additional test code here
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_1()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter("", "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_2()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter("", 0, "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_3()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter("0123456789", "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_4()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_5()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_6()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_7()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_8()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_9()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_10()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_11()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 
		//       at sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:61)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:100)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_12()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 
		//       at sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:61)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:100)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_13()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: An��t-1.0.txt
		//       at sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:61)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:100)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_14()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_15()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_16()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter("", 0, "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_17()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter("0123456789", "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_18()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_19()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_20()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_21()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_22()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_23()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_24()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_25()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 
		//       at sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:61)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:100)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_26()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: 
		//       at sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:61)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:100)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_27()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.UnsupportedEncodingException: An��t-1.0.txt
		//       at sun.nio.cs.StreamEncoder.forOutputStreamWriter(StreamEncoder.java:61)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:100)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_28()
		throws Exception {
		Node node = new IIOMetadataNode("");
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_29()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void printDOM(Node,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPrintDOM_30()
		throws Exception {
		Node node = new IIOMetadataNode();
		LineWriter out = new LineWriter("", "");

		DOMUtil.printDOM(node, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
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
		new org.junit.runner.JUnitCore().run(DOMUtilTest.class);
	}
}