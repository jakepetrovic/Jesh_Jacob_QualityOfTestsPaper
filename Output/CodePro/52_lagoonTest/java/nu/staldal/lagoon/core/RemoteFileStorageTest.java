package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.*;
import nu.staldal.lagoon.filestorage.SSHFileStorage;
import nu.staldal.xtree.Element;
import nu.staldal.lagoon.filestorage.FTPFileStorage;
import static org.junit.Assert.*;

/**
 * The class <code>RemoteFileStorageTest</code> contains tests for the class <code>{@link RemoteFileStorage}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class RemoteFileStorageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see RemoteFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private RemoteFileStorage fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see RemoteFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private RemoteFileStorage fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see RemoteFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public RemoteFileStorage getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new FTPFileStorage();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see RemoteFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public RemoteFileStorage getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SSHFileStorage();
		}
		return fixture2;
	}

	/**
	 * Run the void closeDateFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCloseDateFile_fixture1_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();

		fixture.closeDateFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.closeDateFile(RemoteFileStorage.java:88)
	}

	/**
	 * Run the void closeDateFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCloseDateFile_fixture2_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();

		fixture.closeDateFile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.closeDateFile(RemoteFileStorage.java:88)
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileLastModified_fixture1_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		String pathname = "";

		long result = fixture.fileLastModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileLastModified(RemoteFileStorage.java:113)
		assertEquals(0L, result);
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileLastModified_fixture2_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		String pathname = "0123456789";

		long result = fixture.fileLastModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileLastModified(RemoteFileStorage.java:113)
		assertEquals(0L, result);
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileLastModified_fixture2_2()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		String pathname = "";

		long result = fixture.fileLastModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileLastModified(RemoteFileStorage.java:113)
		assertEquals(0L, result);
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileLastModified_fixture1_2()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		String pathname = "0123456789";

		long result = fixture.fileLastModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileLastModified(RemoteFileStorage.java:113)
		assertEquals(0L, result);
	}

	/**
	 * Run the void fileModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileModified_fixture1_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		String pathname = "";

		fixture.fileModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileModified(RemoteFileStorage.java:99)
	}

	/**
	 * Run the void fileModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileModified_fixture2_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		String pathname = "0123456789";

		fixture.fileModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileModified(RemoteFileStorage.java:99)
	}

	/**
	 * Run the void fileModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileModified_fixture2_2()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		String pathname = "";

		fixture.fileModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileModified(RemoteFileStorage.java:99)
	}

	/**
	 * Run the void fileModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileModified_fixture1_2()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		String pathname = "0123456789";

		fixture.fileModified(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileModified(RemoteFileStorage.java:99)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture1_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture2_1()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture1_2()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture2_2()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture1_3()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture2_3()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture2_4()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture1_4()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture2_5()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture1_5()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture2_6()
		throws Exception {
		RemoteFileStorage fixture = getFixture2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpenDateFile_fixture1_6()
		throws Exception {
		RemoteFileStorage fixture = getFixture1();
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.openDateFile(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
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
		new org.junit.runner.JUnitCore().run(RemoteFileStorageTest.class);
	}
}