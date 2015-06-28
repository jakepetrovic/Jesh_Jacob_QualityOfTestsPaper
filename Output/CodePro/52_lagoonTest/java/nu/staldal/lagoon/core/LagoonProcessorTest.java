package nu.staldal.lagoon.core;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.xtree.Element;
import java.io.Writer;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LagoonProcessorTest</code> contains tests for the class <code>{@link LagoonProcessor}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LagoonProcessorTest {
	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_1()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("", "");
		File sourceDir = File.createTempFile("", "");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_2()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = File.createTempFile("", "", (File) null);
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_3()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element((String) null, (String) null, -1, -1);
		File sourceDir = new File(URI.create(""));
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_4()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = File.createTempFile("", "", (File) null);
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_5()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element((String) null, (String) null, -1, -1);
		File sourceDir = new File("", "");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_6()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = new File(URI.create(""));
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_7()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("0123456789", "0123456789", 1, 1);
		File sourceDir = File.createTempFile("", "");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_8()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7);
		File sourceDir = File.createTempFile("", "", (File) null);
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_9()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element((String) null, (String) null, -1, -1);
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: LocalName may not be null
		//       at nu.staldal.xtree.Element.<init>(Element.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonProcessor_10()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = new File(URI.create(""));
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_11()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("", "", 0, 0);
		File sourceDir = File.createTempFile("0123456789", "0123456789");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_12()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_13()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_14()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("0123456789", "0123456789", 1, 1);
		File sourceDir = new File("");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_15()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7);
		File sourceDir = new File("", "");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_16()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7, 7);
		File sourceDir = new File("0123456789", "0123456789");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_17()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("", "");
		File sourceDir = new File((File) null, "");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_18()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = new File((File) null, "0123456789");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_19()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("0123456789", "0123456789", 1);
		File sourceDir = File.createTempFile("0123456789", "0123456789");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_20()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("0123456789", "0123456789", 1, 1);
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_21()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7);
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_22()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7, 7);
		File sourceDir = new File("");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_23()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("", "");
		File sourceDir = new File("0123456789", "0123456789");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_24()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("", "", 0, 0);
		File sourceDir = new File((File) null, "");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_25()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = new File((File) null, "0123456789");
		String password = "1";
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_26()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("An��t-1.0.txt", "An��t-1.0.txt", 7, 7);
		File sourceDir = File.createTempFile("0123456789", "0123456789");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_27()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("", "");
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_28()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("", "", 0);
		File sourceDir = new File("");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_29()
		throws Exception {
		String targetURL = "";
		Element sitemapTree = new Element("", "", 0, 0);
		File sourceDir = new File("", "");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LagoonProcessor(String,Element,File,String,PrintWriter,PrintWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testLagoonProcessor_30()
		throws Exception {
		String targetURL = "0123456789";
		Element sitemapTree = new Element("0123456789", "0123456789");
		File sourceDir = new File("0123456789", "0123456789");
		String password = null;
		StringWriter stringWriter = new StringWriter();
		PrintWriter log = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter err = new PrintWriter(stringWriter2);

		LagoonProcessor result = new LagoonProcessor(targetURL, sitemapTree, sourceDir, password, log, err);

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
		new org.junit.runner.JUnitCore().run(LagoonProcessorTest.class);
	}
}