package org.databene.jdbacl.model.xml;

import java.io.File;
import java.net.URI;
import org.databene.jdbacl.model.Database;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>XMLModelImporterTest</code> contains tests for the class <code>{@link XMLModelImporter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLModelImporterTest {
	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_1()
		throws Exception {
		File file = File.createTempFile("", "");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_2()
		throws Exception {
		File file = File.createTempFile("", "", (File) null);

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_3()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_4()
		throws Exception {
		File file = File.createTempFile("0123456789", "0123456789", (File) null);

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_5()
		throws Exception {
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_6()
		throws Exception {
		File file = new File("");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_7()
		throws Exception {
		File file = new File("", "");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_8()
		throws Exception {
		File file = new File("0123456789", "0123456789");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_9()
		throws Exception {
		File file = new File(URI.create(""));

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_10()
		throws Exception {
		File file = new File((File) null, "");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLModelImporter(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testXMLModelImporter_11()
		throws Exception {
		File file = new File((File) null, "0123456789");

		XMLModelImporter result = new XMLModelImporter(file);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(XMLModelImporterTest.class);
	}
}