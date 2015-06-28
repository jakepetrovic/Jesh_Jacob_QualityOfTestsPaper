package nu.staldal.lagoon.filestorage;

import java.io.File;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.LagoonProcessor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.*;
import nu.staldal.lagoon.core.LagoonContext;
import nu.staldal.xtree.Element;
import static org.junit.Assert.*;

/**
 * The class <code>FTPFileStorageTest</code> contains tests for the class <code>{@link FTPFileStorage}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FTPFileStorageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FTPFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private FTPFileStorage fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FTPFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public FTPFileStorage getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new FTPFileStorage();
		}
		return fixture;
	}

	/**
	 * Run the FTPFileStorage() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFTPFileStorage_1()
		throws Exception {

		FTPFileStorage result = new FTPFileStorage();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReentrant());
		assertEquals(true, result.needPassword());
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
		FTPFileStorage fixture2 = getFixture();

		fixture2.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.closeDateFile(RemoteFileStorage.java:88)
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.close(FTPFileStorage.java:105)
	}

	/**
	 * Run the OutputHandler createFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCreateFile_fixture_1()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String pathname = "";

		OutputHandler result = fixture2.createFile(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.createFile(FTPFileStorage.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the OutputHandler createFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCreateFile_fixture_2()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String pathname = "0123456789";

		OutputHandler result = fixture2.createFile(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.createFile(FTPFileStorage.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteFile_fixture_1()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String pathname = "";

		fixture2.deleteFile(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.deleteFile(FTPFileStorage.java:147)
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteFile_fixture_2()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String pathname = "0123456789";

		fixture2.deleteFile(pathname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.deleteFile(FTPFileStorage.java:147)
	}

	/**
	 * Run the boolean isReentrant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIsReentrant_fixture_1()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();

		boolean result = fixture2.isReentrant();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean needPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNeedPassword_fixture_1()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();

		boolean result = fixture2.needPassword();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_1()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_2()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_3()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_4()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_5()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_6()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_7()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_8()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_9()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_10()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_11()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_12()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_13()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_14()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_15()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_16()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_17()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_18()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_19()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_20()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_21()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_22()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_23()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "0123456789";

		fixture2.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void open(String,LagoonContext,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOpen_fixture_24()
		throws Exception {
		FTPFileStorage fixture2 = getFixture();
		String url = "";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "";

		fixture2.open(url, context, password);

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
		new org.junit.runner.JUnitCore().run(FTPFileStorageTest.class);
	}
}