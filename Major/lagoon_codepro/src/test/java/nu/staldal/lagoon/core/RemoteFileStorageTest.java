package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import org.junit.*;
import nu.staldal.xtree.Element;
import nu.staldal.lagoon.filestorage.FTPFileStorage;
import static org.junit.Assert.*;

/**
 * The class <code>RemoteFileStorageTest</code> contains tests for the class <code>{@link RemoteFileStorage}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:55 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class RemoteFileStorageTest {
	/**
	 * Run the void closeDateFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testCloseDateFile_1()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();

		fixture.closeDateFile();

		// add additional test code here
	}

	/**
	 * Run the void closeDateFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testCloseDateFile_2()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();

		fixture.closeDateFile();

		// add additional test code here
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testFileLastModified_1()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		String pathname = "";

		long result = fixture.fileLastModified(pathname);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long fileLastModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testFileLastModified_2()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		String pathname = "";

		long result = fixture.fileLastModified(pathname);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the void fileModified(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testFileModified_1()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		String pathname = "";

		fixture.fileModified(pathname);

		// add additional test code here
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOpenDateFile_1()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));

		fixture.openDateFile(context);

		// add additional test code here
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOpenDateFile_2()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));

		fixture.openDateFile(context);

		// add additional test code here
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOpenDateFile_3()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));

		fixture.openDateFile(context);

		// add additional test code here
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testOpenDateFile_4()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));

		fixture.openDateFile(context);

		// add additional test code here
	}

	/**
	 * Run the void openDateFile(LagoonContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testOpenDateFile_5()
		throws Exception {
		RemoteFileStorage fixture = new FTPFileStorage();
		LagoonContext context = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));

		fixture.openDateFile(context);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RemoteFileStorageTest.class);
	}
}