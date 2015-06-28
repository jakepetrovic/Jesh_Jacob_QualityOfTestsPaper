package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.xtree.Element;
import java.io.Writer;
import java.net.URI;
import java.util.Enumeration;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SitemapTest</code> contains tests for the class <code>{@link Sitemap}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SitemapTest {
	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_1()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		Element sitemapTree = new Element("", "");
		File sourceDir = File.createTempFile("", "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_2()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_3()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789", 1, 1);
		File sourceDir = new File("");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_4()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7);
		File sourceDir = new File("", "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_5()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "");
		File sourceDir = new File((File) null, "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_6()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = new File((File) null, "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_7()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = File.createTempFile("", "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_8()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7, 7);
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_9()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		Element sitemapTree = new Element((String) null, (String) null, -1, -1);
		File sourceDir = new File("");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_10()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = new File((File) null, "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_11()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = new File((File) null, "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_12()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7);
		File sourceDir = File.createTempFile("", "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_13()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "");
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_14()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSitemap_15()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		Element sitemapTree = new Element("", "", 0, 0);
		File sourceDir = new File("");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_16()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = File.createTempFile("", "", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_17()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "", 0, 0);
		File sourceDir = File.createTempFile("0123456789", "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_18()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_19()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7, 7);
		File sourceDir = new File("0123456789", "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_20()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element((String) null, (String) null, -1, -1);
		File sourceDir = new File(URI.create(""));

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_21()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = File.createTempFile("", "", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_22()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789", 1, 1);
		File sourceDir = File.createTempFile("0123456789", "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_23()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7);
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_24()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "");
		File sourceDir = new File("", "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_25()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = new File("0123456789", "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_26()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("", "", 0, 0);
		File sourceDir = new File(URI.create(""));

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_27()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7, 7);
		File sourceDir = File.createTempFile("", "", (File) null);

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_28()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element((String) null, (String) null, -1, -1);
		File sourceDir = File.createTempFile("0123456789", "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_29()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = new File("", "");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Sitemap(LagoonProcessor,Element,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testSitemap_30()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = new File("0123456789", "0123456789");

		Sitemap result = new Sitemap(processor, sitemapTree, sourceDir);

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
		new org.junit.runner.JUnitCore().run(SitemapTest.class);
	}
}