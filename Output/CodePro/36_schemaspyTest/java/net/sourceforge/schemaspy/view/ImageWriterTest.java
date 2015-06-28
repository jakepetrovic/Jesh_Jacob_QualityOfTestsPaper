package net.sourceforge.schemaspy.view;

import java.io.File;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImageWriterTest</code> contains tests for the class <code>{@link ImageWriter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ImageWriterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ImageWriter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private ImageWriter fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImageWriter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public ImageWriter getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = ImageWriter.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the ImageWriter getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		ImageWriter result = ImageWriter.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_1()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = File.createTempFile("", "");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_2()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = File.createTempFile("", "", (File) null);

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_3()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = File.createTempFile("0123456789", "0123456789");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_4()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = File.createTempFile("0123456789", "0123456789", (File) null);

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_5()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_6()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = new File("");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_7()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = new File("", "");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_8()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = new File("0123456789", "0123456789");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_9()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = new File(URI.create(""));

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_10()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = new File((File) null, "");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Run the void writeImages(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteImages_fixtureInstance_11()
		throws Exception {
		ImageWriter fixture = getFixtureInstance();
		File outputDir = new File((File) null, "0123456789");

		fixture.writeImages(outputDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at net.sourceforge.schemaspy.view.ImageWriter.writeImages(ImageWriter.java:36)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ImageWriterTest.class);
	}
}