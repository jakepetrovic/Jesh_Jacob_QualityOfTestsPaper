package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlMultipleSchemasIndexPageTest</code> contains tests for the class <code>{@link HtmlMultipleSchemasIndexPage}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlMultipleSchemasIndexPageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlMultipleSchemasIndexPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private HtmlMultipleSchemasIndexPage fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlMultipleSchemasIndexPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public HtmlMultipleSchemasIndexPage getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = HtmlMultipleSchemasIndexPage.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the HtmlMultipleSchemasIndexPage getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		HtmlMultipleSchemasIndexPage result = HtmlMultipleSchemasIndexPage.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_1()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("", "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_2()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("", 0, "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_3()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("0123456789", "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_4()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("0123456789", 1, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_5()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_6()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> populatedSchemas = new LinkedList<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", ""), "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_7()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_8()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_9()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_10()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_11()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter((OutputStream) null, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_12()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_13()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("", "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_14()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		List<String> populatedSchemas = new ArrayList<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("", 0, "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_15()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> populatedSchemas = new Vector<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("0123456789", "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_16()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("0123456789", 1, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_17()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_18()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", ""), "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_19()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_20()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> populatedSchemas = new ArrayList<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_21()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		List<String> populatedSchemas = new Vector<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_22()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_23()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		List<String> populatedSchemas = new ArrayList<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter((OutputStream) null, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_24()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> populatedSchemas = new Vector<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWrite_fixtureInstance_25()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWrite_fixtureInstance_26()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		List<String> populatedSchemas = new LinkedList<String>();
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWrite_fixtureInstance_27()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> populatedSchemas = new ArrayList<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWrite_fixtureInstance_28()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWrite_fixtureInstance_29()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> populatedSchemas = new LinkedList<String>();
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
	}

	/**
	 * Run the void write(String,List<String>,DatabaseMetaData,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWrite_fixtureInstance_30()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> populatedSchemas = new Vector<String>();
		populatedSchemas.add("");
		populatedSchemas.add("0123456789");
		DatabaseMetaData meta = null;
		LineWriter index = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.write(dbName, populatedSchemas, meta, index);

		// add additional test code here
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_1()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("", "");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_2()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("", 0, "");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_3()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_4()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_5()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_6()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_7()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_8()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_9()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_10()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_11()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixtureInstance_12()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteFooter_fixtureInstance_13()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeFooter(html);

		// add additional test code here
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteFooter_fixtureInstance_14()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeFooter(html);

		// add additional test code here
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteFooter_fixtureInstance_15()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeFooter(html);

		// add additional test code here
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_1()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("", "");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_2()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("", 0, "");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_3()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_4()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_5()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_6()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_7()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_8()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_9()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_10()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_11()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixtureInstance_12()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteTableOfContents_fixtureInstance_13()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeTableOfContents(html);

		// add additional test code here
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteTableOfContents_fixtureInstance_14()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeTableOfContents(html);

		// add additional test code here
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteTableOfContents_fixtureInstance_15()
		throws Exception {
		HtmlMultipleSchemasIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeTableOfContents(html);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(HtmlMultipleSchemasIndexPageTest.class);
	}
}