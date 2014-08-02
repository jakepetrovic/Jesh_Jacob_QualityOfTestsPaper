package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import nu.staldal.xtree.Element;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>EntryWithSourceTest</code> contains tests for the class <code>{@link EntryWithSource}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:57 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class EntryWithSourceTest {
	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_2()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_3()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_4()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_5()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_6()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_7()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testFileHasBeenUpdated_8()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileHasBeenUpdated_9()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileHasBeenUpdated_10()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testFileHasBeenUpdated_11()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean fileHasBeenUpdated(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testFileHasBeenUpdated_12()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		long when = 1L;

		boolean result = fixture.fileHasBeenUpdated(url, when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the File getFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFile_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "file:";

		File result = fixture.getFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the File getFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFile_2()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		File result = fixture.getFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the File getFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFile_3()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		File result = fixture.getFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the File getFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetFile_4()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		File result = fixture.getFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsJAXPSource_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsJAXPSource_2()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsJAXPSource_3()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsJAXPSource_4()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetFileAsJAXPSource_5()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetFileAsJAXPSource_6()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the javax.xml.transform.Source getFileAsJAXPSource(String,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetFileAsJAXPSource_7()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		javax.xml.transform.Source result = fixture.getFileAsJAXPSource(url, target);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_2()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_3()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_4()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_5()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_6()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_7()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_8()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_9()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_10()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_11()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_12()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileAsSAX_13()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetFileAsSAX_14()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetFileAsSAX_15()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the void getFileAsSAX(String,ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetFileAsSAX_16()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "part:";
		ContentHandler ch = new DefaultHandler();
		Target target = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		fixture.getFileAsSAX(url, ch, target);

		// add additional test code here
	}

	/**
	 * Run the String getFileURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetFileURL_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		String result = fixture.getFileURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFileURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetFileURL_2()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		String result = fixture.getFileURL(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testGetSourceManager_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		SourceManager result = fixture.getSourceManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSourceURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSourceURL_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));

		String result = fixture.getSourceURL();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testOpenFile_1()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "res:";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testOpenFile_2()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test
	public void testOpenFile_3()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testOpenFile_4()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testOpenFile_5()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOpenFile_6()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOpenFile_7()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream openFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testOpenFile_8()
		throws Exception {
		EntryWithSource fixture = new FileEntry(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Sitemap(new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter())), new Element("", ""), new File("")), "", "", new File(""), new File(""));
		String url = "";

		InputStream result = fixture.openFile(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:57 PM
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
	 * @generatedBy CodePro at 4/23/14 7:57 PM
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
	 * @generatedBy CodePro at 4/23/14 7:57 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EntryWithSourceTest.class);
	}
}