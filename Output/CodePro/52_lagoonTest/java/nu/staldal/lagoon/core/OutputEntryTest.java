package nu.staldal.lagoon.core;

import java.io.File;
import nu.staldal.lagoon.producer.LSSITransformer;
import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.lagoon.producer.LSPTransformer;
import nu.staldal.lagoon.producer.FileRead;
import nu.staldal.lagoon.producer.XMLFormatter;
import nu.staldal.lagoon.producer.FOPFormatter;
import nu.staldal.lagoon.producer.BatikFormatter;
import java.io.Writer;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.DirSource;
import nu.staldal.lagoon.producer.FileSource;
import org.junit.*;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.xtree.Element;
import nu.staldal.lagoon.producer.XSLTransformer;
import static org.junit.Assert.*;

/**
 * The class <code>OutputEntryTest</code> contains tests for the class <code>{@link OutputEntry}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class OutputEntryTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see OutputEntry
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private OutputEntry fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see OutputEntry
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public OutputEntry getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new OutputEntry();
		}
		return fixture;
	}

	/**
	 * Run the OutputEntry() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testOutputEntry_1()
		throws Exception {

		OutputEntry result = new OutputEntry();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSourceManager());
	}

	/**
	 * Run the ByteStreamProducer getByteProducer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetByteProducer_fixture_1()
		throws Exception {
		OutputEntry fixture2 = getFixture();

		ByteStreamProducer result = fixture2.getByteProducer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SourceManager getSourceManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetSourceManager_fixture_1()
		throws Exception {
		OutputEntry fixture2 = getFixture();

		SourceManager result = fixture2.getSourceManager();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_1()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new BasicSplit();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_2()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new BatikFormatter();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_3()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new FOPFormatter();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_4()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new IslandSplit();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_5()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new LSPTransformer();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_6()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new LSSITransformer();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_7()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new XMLFormatter();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setBottomProducer(XMLStreamConsumer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetBottomProducer_fixture_8()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamConsumer prod = new XSLTransformer();

		fixture2.setBottomProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setMyProducer(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetMyProducer_fixture_1()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		ByteStreamProducer prod = new BatikFormatter();

		fixture2.setMyProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setMyProducer(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetMyProducer_fixture_2()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		ByteStreamProducer prod = new FOPFormatter();

		fixture2.setMyProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setMyProducer(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetMyProducer_fixture_3()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		ByteStreamProducer prod = new FileRead();

		fixture2.setMyProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setMyProducer(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetMyProducer_fixture_4()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		ByteStreamProducer prod = new XMLFormatter();

		fixture2.setMyProducer(prod);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_1()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new BasicSplit();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_2()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new DirSource();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_3()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new FileSource();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_4()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new IslandSplit();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_5()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new LSPTransformer();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_6()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new LSSITransformer();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_7()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new XMLParse();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture_8()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		XMLStreamProducer next = new XSLTransformer();

		fixture2.setNext(next);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.core.OutputEntry.setNext(OutputEntry.java:94)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_1()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter4);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter4, printWriter2);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("", ""), File.createTempFile("", ""));
		SourceManager sm = new FileEntry(lagoonProcessor, sitemap, "", "", File.createTempFile("", ""), File.createTempFile("", ""));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_2()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter3 = new StringWriter();
		PrintWriter printWriter3 = new PrintWriter(stringWriter3);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter3, printWriter);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		StringWriter stringWriter4 = new StringWriter();
		PrintWriter printWriter4 = new PrintWriter(stringWriter4);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter2, printWriter4);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("", ""), File.createTempFile("", ""));
		SourceManager sm = new PartEntry(lagoonProcessor, sitemap, "", File.createTempFile("", ""));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_3()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		SourceManager sm = new FileEntry(lagoonProcessor2, sitemap, "0123456789", "0123456789", File.createTempFile("", "", (File) null), File.createTempFile("", "", (File) null));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_4()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter2, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		SourceManager sm = new PartEntry(lagoonProcessor, sitemap, "0123456789", File.createTempFile("", "", (File) null));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_5()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null));
		SourceManager sm = new FileEntry(new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null), sitemap, "0123456789", "", File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_6()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor2, (Element) null, File.createTempFile("0123456789", "0123456789"));
		SourceManager sm = new FileEntry(lagoonProcessor, sitemap, "An��t-1.0.txt", "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"), File.createTempFile("0123456789", "0123456789"));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_7()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		LagoonProcessor lagoonProcessor2 = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter2, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		SourceManager sm = new PartEntry(lagoonProcessor2, sitemap, "An��t-1.0.txt", File.createTempFile("0123456789", "0123456789"));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_8()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);
		Sitemap sitemap = new Sitemap(lagoonProcessor, (Element) null, File.createTempFile("0123456789", "0123456789"));
		SourceManager sm = new FileEntry((LagoonProcessor) null, sitemap, "An��t-1.0.txt", "0123456789", new File(""), new File(""));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_9()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		SourceManager sm = new FileEntry(lagoonProcessor, (Sitemap) null, (String) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null), File.createTempFile("0123456789", "0123456789", (File) null));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetSourceManager_fixture_10()
		throws Exception {
		OutputEntry fixture2 = getFixture();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor lagoonProcessor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);
		SourceManager sm = new PartEntry(lagoonProcessor, (Sitemap) null, (String) null, File.createTempFile("0123456789", "0123456789", (File) null));

		fixture2.setSourceManager(sm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
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
		new org.junit.runner.JUnitCore().run(OutputEntryTest.class);
	}
}