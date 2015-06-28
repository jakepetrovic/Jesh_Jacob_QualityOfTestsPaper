package nu.staldal.lagoon.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import nu.staldal.lagoon.producer.XMLFormatter;
import nu.staldal.lagoon.producer.FOPFormatter;
import nu.staldal.lagoon.producer.BatikFormatter;
import java.io.StringWriter;
import nu.staldal.xtree.Element;
import nu.staldal.lagoon.producer.FileRead;
import java.io.Writer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ByteStreamProducerTest</code> contains tests for the class <code>{@link ByteStreamProducer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ByteStreamProducerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private ByteStreamProducer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private ByteStreamProducer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private ByteStreamProducer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private ByteStreamProducer fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public ByteStreamProducer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new BatikFormatter();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public ByteStreamProducer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new FOPFormatter();
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public ByteStreamProducer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new FileRead();
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamProducer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public ByteStreamProducer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new XMLFormatter();
		}
		return fixture4;
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture1_1()
		throws Exception {
		ByteStreamProducer fixture = getFixture1();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter4);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("", ""), File.createTempFile("", ""));
		Target target = new FileEntry(lagoonProcessor, sitemap, "", "", File.createTempFile("", ""), File.createTempFile("", ""));

		fixture.start(bytes, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture2_1()
		throws Exception {
		ByteStreamProducer fixture = getFixture2();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter4);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("", ""), File.createTempFile("", ""));
		Target target = new FileEntry(lagoonProcessor, sitemap, "", "", File.createTempFile("", ""), File.createTempFile("", ""));

		fixture.start(bytes, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture3_1()
		throws Exception {
		ByteStreamProducer fixture = getFixture3();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter4);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("", ""), File.createTempFile("", ""));
		Target target = new FileEntry(lagoonProcessor, sitemap, "", "", File.createTempFile("", ""), File.createTempFile("", ""));

		fixture.start(bytes, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture4_1()
		throws Exception {
		ByteStreamProducer fixture = getFixture4();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter4);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter2);
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("", ""), File.createTempFile("", ""));
		Target target = new FileEntry(lagoonProcessor, sitemap, "", "", File.createTempFile("", ""), File.createTempFile("", ""));

		fixture.start(bytes, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_2()
		throws Exception {
		ByteStreamProducer fixture = getFixture3();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "0123456789", "0123456789", File.createTempFile("", "", (File) null), File.createTempFile("", "", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_2()
		throws Exception {
		ByteStreamProducer fixture = getFixture1();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null), sitemap, "0123456789", "", File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_3()
		throws Exception {
		ByteStreamProducer fixture = getFixture3();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "An��t-1.0.txt", "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"), File.createTempFile("0123456789", "0123456789"));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_3()
		throws Exception {
		ByteStreamProducer fixture = getFixture1();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry((LagoonProcessor) null, sitemap, "An��t-1.0.txt", "0123456789", new File(""), new File(""));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_4()
		throws Exception {
		ByteStreamProducer fixture = getFixture3();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_2()
		throws Exception {
		ByteStreamProducer fixture = getFixture4();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "0123456789", "0123456789", File.createTempFile("", "", (File) null), File.createTempFile("", "", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_2()
		throws Exception {
		ByteStreamProducer fixture = getFixture2();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null), sitemap, "0123456789", "", File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_3()
		throws Exception {
		ByteStreamProducer fixture = getFixture4();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "An��t-1.0.txt", "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"), File.createTempFile("0123456789", "0123456789"));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_3()
		throws Exception {
		ByteStreamProducer fixture = getFixture2();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry((LagoonProcessor) null, sitemap, "An��t-1.0.txt", "0123456789", new File(""), new File(""));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_4()
		throws Exception {
		ByteStreamProducer fixture = getFixture4();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_4()
		throws Exception {
		ByteStreamProducer fixture = getFixture1();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "0123456789", "0123456789", File.createTempFile("", "", (File) null), File.createTempFile("", "", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_5()
		throws Exception {
		ByteStreamProducer fixture = getFixture3();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null), sitemap, "0123456789", "", File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_5()
		throws Exception {
		ByteStreamProducer fixture = getFixture1();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "An��t-1.0.txt", "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"), File.createTempFile("0123456789", "0123456789"));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture3_6()
		throws Exception {
		ByteStreamProducer fixture = getFixture3();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry((LagoonProcessor) null, sitemap, "An��t-1.0.txt", "0123456789", new File(""), new File(""));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture1_6()
		throws Exception {
		ByteStreamProducer fixture = getFixture1();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_4()
		throws Exception {
		ByteStreamProducer fixture = getFixture2();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "0123456789", "0123456789", File.createTempFile("", "", (File) null), File.createTempFile("", "", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_5()
		throws Exception {
		ByteStreamProducer fixture = getFixture4();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		Target target = new FileEntry(new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null), sitemap, "0123456789", "", File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_5()
		throws Exception {
		ByteStreamProducer fixture = getFixture2();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry(lagoonProcessor2, sitemap, "An��t-1.0.txt", "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"), File.createTempFile("0123456789", "0123456789"));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture4_6()
		throws Exception {
		ByteStreamProducer fixture = getFixture4();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		Target target = new FileEntry((LagoonProcessor) null, sitemap, "An��t-1.0.txt", "0123456789", new File(""), new File(""));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_fixture2_6()
		throws Exception {
		ByteStreamProducer fixture = getFixture2();
		OutputStream bytes = new ByteArrayOutputStream();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		Target target = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ByteStreamProducerTest.class);
	}
}