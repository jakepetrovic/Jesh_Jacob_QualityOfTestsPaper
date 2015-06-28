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
 * The class <code>LocalFileStorageTest</code> contains tests for the class <code>{@link LocalFileStorage}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LocalFileStorageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LocalFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private LocalFileStorage fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LocalFileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public LocalFileStorage getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new LocalFileStorage();
		}
		return fixture;
	}

	/**
	 * Run the LocalFileStorage() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLocalFileStorage_1()
		throws Exception {

		LocalFileStorage result = new LocalFileStorage();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isReentrant());
		assertEquals(false, result.needPassword());
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
		LocalFileStorage fixture2 = getFixture();

		fixture2.close();

		// add additional test code here
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
		LocalFileStorage fixture2 = getFixture();
		String path = "";

		OutputHandler result = fixture2.createFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		//       at java.lang.String.substring(String.java:1875)
		//       at nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(LocalFileStorage.java:153)
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
		LocalFileStorage fixture2 = getFixture();
		String path = "0123456789";

		OutputHandler result = fixture2.createFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(LocalFileStorage.java:156)
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
		LocalFileStorage fixture2 = getFixture();
		String path = "";

		fixture2.deleteFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		//       at java.lang.String.substring(String.java:1875)
		//       at nu.staldal.lagoon.filestorage.LocalFileStorage.deleteFile(LocalFileStorage.java:181)
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
		LocalFileStorage fixture2 = getFixture();
		String path = "0123456789";

		fixture2.deleteFile(path);

		// add additional test code here
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFileLastModified_fixture_1()
		throws Exception {
		LocalFileStorage fixture2 = getFixture();
		String path = "";

		long result = fixture2.fileLastModified(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		//       at java.lang.String.substring(String.java:1875)
		//       at nu.staldal.lagoon.filestorage.LocalFileStorage.fileLastModified(LocalFileStorage.java:127)
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
	public void testFileLastModified_fixture_2()
		throws Exception {
		LocalFileStorage fixture2 = getFixture();
		String path = "0123456789";

		long result = fixture2.fileLastModified(path);

		// add additional test code here
		assertEquals(0L, result);
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
		LocalFileStorage fixture2 = getFixture();

		boolean result = fixture2.isReentrant();

		// add additional test code here
		assertEquals(true, result);
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
		LocalFileStorage fixture2 = getFixture();

		boolean result = fixture2.needPassword();

		// add additional test code here
		assertEquals(false, result);
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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		String password = "0123456789";

		fixture2.open(loc, context, password);

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
		LocalFileStorage fixture2 = getFixture();
		String loc = "";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "";

		fixture2.open(loc, context, password);

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
		new org.junit.runner.JUnitCore().run(LocalFileStorageTest.class);
	}
}