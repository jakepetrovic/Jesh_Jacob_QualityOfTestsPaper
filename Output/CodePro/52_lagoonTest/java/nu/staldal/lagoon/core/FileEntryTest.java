package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.xtree.Element;
import java.io.Writer;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.ContentHandler;

/**
 * The class <code>FileEntryTest</code> contains tests for the class <code>{@link FileEntry}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:39 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FileEntryTest {
	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_1()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("", "");
		File tempDir = File.createTempFile("", "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_2()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789", (File) null);
		File tempDir = File.createTempFile("0123456789", "0123456789", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_3()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter3, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		File tempDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_4()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = new File("0123456789", "0123456789");
		File tempDir = new File("0123456789", "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_5()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter3, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = new File(URI.create(""));
		File tempDir = new File(URI.create(""));

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_6()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		File tempDir = File.createTempFile("0123456789", "0123456789", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_7()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = new File(URI.create(""));
		File tempDir = new File("0123456789", "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_8()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = new File((File) null, "");
		File tempDir = new File(URI.create(""));

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_9()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789");
		File tempDir = File.createTempFile("", "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_10()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter3, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789", (File) null);
		File tempDir = File.createTempFile("", "", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_11()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter3, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = new File("0123456789", "0123456789");
		File tempDir = new File("");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testFileEntry_12()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = new File((File) null, "");
		File tempDir = new File("0123456789", "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_13()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("", "", (File) null);
		File tempDir = File.createTempFile("", "", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_14()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789");
		File tempDir = File.createTempFile("0123456789", "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_15()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = new File("");
		File tempDir = new File("");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_16()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = new File("", "");
		File tempDir = new File("", "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_17()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "0123456789";
		String sourceURL = "0123456789";
		File sourceRootDir = new File((File) null, "");
		File tempDir = new File((File) null, "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_18()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = new File((File) null, "0123456789");
		File tempDir = new File((File) null, "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_19()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("", "", (File) null);
		File tempDir = File.createTempFile("", "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_20()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789");
		File tempDir = File.createTempFile("", "", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_21()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789", (File) null);
		File tempDir = File.createTempFile("0123456789", "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_22()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = new File("");
		File tempDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_23()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = new File("", "");
		File tempDir = new File("");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_24()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = new File("0123456789", "0123456789");
		File tempDir = new File("", "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_25()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = new File((File) null, "0123456789");
		File tempDir = new File((File) null, "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_26()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("", "");
		File tempDir = new File((File) null, "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_27()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter3);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		File tempDir = File.createTempFile("0123456789", "0123456789");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_28()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String targetURL = "";
		String sourceURL = "0123456789";
		File sourceRootDir = new File("");
		File tempDir = File.createTempFile("0123456789", "0123456789", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_29()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "";
		String sourceURL = "";
		File sourceRootDir = new File("", "");
		File tempDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileEntry(LagoonProcessor,Sitemap,String,String,File,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileEntry_30()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String targetURL = "0123456789";
		String sourceURL = "";
		File sourceRootDir = new File(URI.create(""));
		File tempDir = new File("", "");

		FileEntry result = new FileEntry(processor, sitemap, targetURL, sourceURL, sourceRootDir, tempDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
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
	 * @generatedBy CodePro at 6/28/15 2:39 PM
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
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FileEntryTest.class);
	}
}