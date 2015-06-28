package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import org.junit.*;
import nu.staldal.xtree.Element;
import static org.junit.Assert.*;

/**
 * The class <code>PartEntryTest</code> contains tests for the class <code>{@link PartEntry}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PartEntryTest {
	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_1()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("", "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_2()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_3()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_4()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "0123456789";
		File sourceRootDir = new File("0123456789", "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_5()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String sourceURL = "";
		File sourceRootDir = new File(URI.create(""));

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_6()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("", "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_7()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("", "", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_8()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_9()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String sourceURL = "0123456789";
		File sourceRootDir = new File("");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_10()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "";
		File sourceRootDir = new File(URI.create(""));

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_11()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter4);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", ""), File.createTempFile("", ""));
		String sourceURL = "0123456789";
		File sourceRootDir = new File((File) null, "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_12()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("", "", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_13()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter3, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_14()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "0123456789";
		File sourceRootDir = new File("");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testPartEntry_15()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter3, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "";
		File sourceRootDir = new File("", "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_16()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("", "", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_17()
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
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_18()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "0123456789";
		File sourceRootDir = new File("");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_19()
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
		String sourceURL = "";
		File sourceRootDir = new File("", "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_20()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "0123456789";
		File sourceRootDir = new File((File) null, "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_21()
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
		String sourceURL = "";
		File sourceRootDir = new File((File) null, "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_22()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_23()
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
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_24()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "";
		File sourceRootDir = new File("", "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_25()
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
		String sourceURL = "0123456789";
		File sourceRootDir = new File("0123456789", "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_26()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "";
		File sourceRootDir = new File((File) null, "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_27()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("", "");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_28()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "0123456789";
		File sourceRootDir = File.createTempFile("0123456789", "0123456789", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_29()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0), File.createTempFile("", "", (File) null));
		String sourceURL = "";
		File sourceRootDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PartEntry(LagoonProcessor,Sitemap,String,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testPartEntry_30()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"));
		String sourceURL = "0123456789";
		File sourceRootDir = new File("0123456789", "0123456789");

		PartEntry result = new PartEntry(processor, sitemap, sourceURL, sourceRootDir);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(PartEntryTest.class);
	}
}