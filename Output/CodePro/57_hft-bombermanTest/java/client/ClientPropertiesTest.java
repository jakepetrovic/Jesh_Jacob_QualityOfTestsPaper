package client;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClientPropertiesTest</code> contains tests for the class <code>{@link ClientProperties}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ClientPropertiesTest {
	/**
	 * Run the ClientProperties(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientProperties_1()
		throws Exception {
		String fileName = "";

		ClientProperties result = new ClientProperties(fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertNotNull(result);
	}

	/**
	 * Run the ClientProperties(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientProperties_2()
		throws Exception {
		String fileName = "0123456789";

		ClientProperties result = new ClientProperties(fileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertNotNull(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_1()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = File.createTempFile("", "");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_2()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = File.createTempFile("", "", (File) null);

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_3()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = File.createTempFile("0123456789", "0123456789");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_4()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = File.createTempFile("0123456789", "0123456789", (File) null);

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_5()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_6()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = new File("");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_7()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = new File("", "");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_8()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = new File("0123456789", "0123456789");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_9()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = new File(URI.create(""));

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_10()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = new File((File) null, "");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_11()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = new File((File) null, "0123456789");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_12()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = File.createTempFile("", "", (File) null);

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_13()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = File.createTempFile("0123456789", "0123456789");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_14()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = File.createTempFile("0123456789", "0123456789", (File) null);

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_15()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_16()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = new File("");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_17()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = new File("", "");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_18()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = new File("0123456789", "0123456789");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_19()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = new File(URI.create(""));

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_20()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("".getBytes());
		File destFile = new File((File) null, "");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_21()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = new File((File) null, "0123456789");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientProperties
		assertTrue(result);
	}

	/**
	 * Run the boolean fileCopy(InputStream,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testFileCopy_22()
		throws Exception {
		InputStream sourceFile = new ByteArrayInputStream("012345678901234567890".getBytes());
		File destFile = File.createTempFile("", "");

		boolean result = ClientProperties.fileCopy(sourceFile, destFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientPropertiesTest.class);
	}
}