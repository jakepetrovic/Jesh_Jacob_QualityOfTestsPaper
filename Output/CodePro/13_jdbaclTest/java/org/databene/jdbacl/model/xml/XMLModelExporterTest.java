package org.databene.jdbacl.model.xml;

import java.io.File;
import java.net.URI;
import org.databene.commons.xml.SimpleXMLWriter;
import org.databene.jdbacl.model.Database;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XMLModelExporterTest</code> contains tests for the class <code>{@link XMLModelExporter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLModelExporterTest {
	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_1()
		throws Exception {
		File file = File.createTempFile("", "");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_2()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_3()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_4()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_5()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_6()
		throws Exception {
		File file = new File("");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_7()
		throws Exception {
		File file = new File("", "");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_8()
		throws Exception {
		File file = new File("0123456789", "0123456789");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_9()
		throws Exception {
		File file = new File(URI.create(""));

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_10()
		throws Exception {
		File file = new File((File) null, "");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_11()
		throws Exception {
		File file = new File((File) null, "0123456789");

		XMLModelExporter result = new XMLModelExporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_12()
		throws Exception {
		File file = File.createTempFile("", "");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_13()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_14()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_15()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_16()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_17()
		throws Exception {
		File file = new File("");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_18()
		throws Exception {
		File file = new File("", "");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_19()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_20()
		throws Exception {
		File file = new File(URI.create(""));
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_21()
		throws Exception {
		File file = new File((File) null, "");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_22()
		throws Exception {
		File file = new File((File) null, "0123456789");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_23()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_24()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_25()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_26()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_27()
		throws Exception {
		File file = new File("");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_28()
		throws Exception {
		File file = new File("", "");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_29()
		throws Exception {
		File file = new File("0123456789", "0123456789");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_30()
		throws Exception {
		File file = new File(URI.create(""));
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_31()
		throws Exception {
		File file = new File((File) null, "");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_32()
		throws Exception {
		File file = new File((File) null, "0123456789");
		String encoding = "";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelExporter(File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelExporter_33()
		throws Exception {
		File file = File.createTempFile("", "");
		String encoding = "0123456789";

		XMLModelExporter result = new XMLModelExporter(file, encoding);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(XMLModelExporterTest.class);
	}
}