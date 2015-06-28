package nu.staldal.lagoon.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.*;
import nu.staldal.xtree.Element;
import static org.junit.Assert.*;

/**
 * The class <code>DeleteEntryTest</code> contains tests for the class <code>{@link DeleteEntry}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DeleteEntryTest {
	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_1()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_2()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String targetURL = "0123456789";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_3()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String targetURL = "0123456789";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_4()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String targetURL = "0123456789";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_5()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String targetURL = "0123456789";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_6()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String targetURL = "0123456789";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_7()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("0123456789", "0123456789", 1), new File(""), "0123456789", printWriter, (PrintWriter) null);
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_8()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789", 1, 1), new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_9()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", new Element("", "", 0, 0), File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_10()
		throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor((String) null, new Element("0123456789", "0123456789"), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(LagoonProcessor.java:606)
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_11()
		throws Exception {
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("", "", 0), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);
		String targetURL = "";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the DeleteEntry(LagoonProcessor,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDeleteEntry_12()
		throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter);
		String targetURL = "0123456789";

		DeleteEntry result = new DeleteEntry(processor, targetURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
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
		new org.junit.runner.JUnitCore().run(DeleteEntryTest.class);
	}
}