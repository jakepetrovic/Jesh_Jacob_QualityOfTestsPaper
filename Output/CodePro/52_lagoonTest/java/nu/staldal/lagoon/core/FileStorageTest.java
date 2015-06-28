package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.lagoon.filestorage.LocalFileStorage;
import nu.staldal.xtree.Element;
import java.io.Writer;
import org.junit.*;
import nu.staldal.lagoon.filestorage.SSHFileStorage;
import nu.staldal.lagoon.filestorage.FTPFileStorage;
import static org.junit.Assert.*;

/**
 * The class <code>FileStorageTest</code> contains tests for the class <code>{@link FileStorage}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FileStorageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private FileStorage fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see FileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private FileStorage fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see FileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private FileStorage fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public FileStorage getFixture1()
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
	 * @see FileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public FileStorage getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new LocalFileStorage();
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FileStorage
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public FileStorage getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new SSHFileStorage();
		}
		return fixture3;
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testClose_fixture1_1()
		throws Exception {
		FileStorage fixture = getFixture1();

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.closeDateFile(RemoteFileStorage.java:88)
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.close(FTPFileStorage.java:105)
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testClose_fixture2_1()
		throws Exception {
		FileStorage fixture = getFixture2();

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testClose_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.closeDateFile(RemoteFileStorage.java:88)
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.close(SSHFileStorage.java:176)
	}

	/**
	 * Run the OutputHandler createFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCreateFile_fixture1_1()
		throws Exception {
		FileStorage fixture = getFixture1();
		String path = "";

		OutputHandler result = fixture.createFile(path);

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
	public void testCreateFile_fixture2_1()
		throws Exception {
		FileStorage fixture = getFixture2();
		String path = "0123456789";

		OutputHandler result = fixture.createFile(path);

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
	 * Run the OutputHandler createFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCreateFile_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();
		String path = "0123456789";

		OutputHandler result = fixture.createFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH(SSHFileStorage.java:95)
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.createFile(SSHFileStorage.java:200)
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
	public void testCreateFile_fixture2_2()
		throws Exception {
		FileStorage fixture = getFixture2();
		String path = "";

		OutputHandler result = fixture.createFile(path);

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
	public void testCreateFile_fixture3_2()
		throws Exception {
		FileStorage fixture = getFixture3();
		String path = "";

		OutputHandler result = fixture.createFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH(SSHFileStorage.java:95)
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.createFile(SSHFileStorage.java:200)
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
	public void testCreateFile_fixture1_2()
		throws Exception {
		FileStorage fixture = getFixture1();
		String path = "0123456789";

		OutputHandler result = fixture.createFile(path);

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
	public void testDeleteFile_fixture1_1()
		throws Exception {
		FileStorage fixture = getFixture1();
		String path = "";

		fixture.deleteFile(path);

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
	public void testDeleteFile_fixture2_1()
		throws Exception {
		FileStorage fixture = getFixture2();
		String path = "0123456789";

		fixture.deleteFile(path);

		// add additional test code here
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteFile_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();
		String path = "0123456789";

		fixture.deleteFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH(SSHFileStorage.java:95)
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.deleteFile(SSHFileStorage.java:218)
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteFile_fixture2_2()
		throws Exception {
		FileStorage fixture = getFixture2();
		String path = "";

		fixture.deleteFile(path);

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
	public void testDeleteFile_fixture3_2()
		throws Exception {
		FileStorage fixture = getFixture3();
		String path = "";

		fixture.deleteFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH(SSHFileStorage.java:95)
		//       at nu.staldal.lagoon.filestorage.SSHFileStorage.deleteFile(SSHFileStorage.java:218)
	}

	/**
	 * Run the void deleteFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteFile_fixture1_2()
		throws Exception {
		FileStorage fixture = getFixture1();
		String path = "0123456789";

		fixture.deleteFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.filestorage.FTPFileStorage.deleteFile(FTPFileStorage.java:147)
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
		FileStorage fixture = getFixture1();
		String path = "";

		long result = fixture.fileLastModified(path);

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
		FileStorage fixture = getFixture2();
		String path = "0123456789";

		long result = fixture.fileLastModified(path);

		// add additional test code here
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
	public void testFileLastModified_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();
		String path = "0123456789";

		long result = fixture.fileLastModified(path);

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
		FileStorage fixture = getFixture2();
		String path = "";

		long result = fixture.fileLastModified(path);

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
	public void testFileLastModified_fixture3_2()
		throws Exception {
		FileStorage fixture = getFixture3();
		String path = "";

		long result = fixture.fileLastModified(path);

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
		FileStorage fixture = getFixture1();
		String path = "0123456789";

		long result = fixture.fileLastModified(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.RemoteFileStorage.fileLastModified(RemoteFileStorage.java:113)
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
	public void testIsReentrant_fixture1_1()
		throws Exception {
		FileStorage fixture = getFixture1();

		boolean result = fixture.isReentrant();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isReentrant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIsReentrant_fixture2_1()
		throws Exception {
		FileStorage fixture = getFixture2();

		boolean result = fixture.isReentrant();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isReentrant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testIsReentrant_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();

		boolean result = fixture.isReentrant();

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
	public void testNeedPassword_fixture1_1()
		throws Exception {
		FileStorage fixture = getFixture1();

		boolean result = fixture.needPassword();

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
	public void testNeedPassword_fixture2_1()
		throws Exception {
		FileStorage fixture = getFixture2();

		boolean result = fixture.needPassword();

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
	public void testNeedPassword_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();

		boolean result = fixture.needPassword();

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
	public void testOpen_fixture1_1()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_1()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_2()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_2()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_3()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_3()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "0123456789";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_4()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_1()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_5()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_2()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_6()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "0123456789";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_3()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_4()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_4()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_5()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_5()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_6()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_7()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_7()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_8()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_8()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_9()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_6()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_10()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_7()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture1_11()
		throws Exception {
		FileStorage fixture = getFixture1();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String password = "0123456789";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_8()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "";
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_9()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture3_9()
		throws Exception {
		FileStorage fixture = getFixture3();
		String url = "0123456789";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

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
	public void testOpen_fixture2_10()
		throws Exception {
		FileStorage fixture = getFixture2();
		String url = "";
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonContext context = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String password = "";

		fixture.open(url, context, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
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
		new org.junit.runner.JUnitCore().run(FileStorageTest.class);
	}
}