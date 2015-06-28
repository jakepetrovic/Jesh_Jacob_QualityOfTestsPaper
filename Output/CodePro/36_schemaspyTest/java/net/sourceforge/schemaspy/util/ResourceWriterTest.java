package net.sourceforge.schemaspy.util;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResourceWriterTest</code> contains tests for the class <code>{@link ResourceWriter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:18 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ResourceWriterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ResourceWriter
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private ResourceWriter fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ResourceWriter
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private ResourceWriter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResourceWriter
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public ResourceWriter getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = ResourceWriter.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResourceWriter
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public ResourceWriter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ResourceWriter();
		}
		return fixture;
	}

	/**
	 * Run the ResourceWriter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testResourceWriter_1()
		throws Exception {

		ResourceWriter result = new ResourceWriter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResourceWriter getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		ResourceWriter result = ResourceWriter.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_1()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = File.createTempFile("", "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_1()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = File.createTempFile("", "", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_2()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = File.createTempFile("0123456789", "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:52)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_2()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:52)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_3()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = new File("");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_4()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = new File("", "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_3()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = new File("0123456789", "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at java.io.File.mkdirs(File.java:1337)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_4()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = new File(URI.create(""));

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_5()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = new File((File) null, "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_6()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = new File((File) null, "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_7()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = File.createTempFile("", "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_5()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = File.createTempFile("", "", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_6()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = File.createTempFile("0123456789", "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:52)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_8()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:52)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_7()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = new File("");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_8()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = new File("", "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_9()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = new File("0123456789", "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at java.io.File.mkdirs(File.java:1337)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_10()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = new File(URI.create(""));

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_9()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = new File((File) null, "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_10()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = new File((File) null, "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_11()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = File.createTempFile("", "", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_11()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = File.createTempFile("0123456789", "0123456789", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:52)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_12()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "";
		File writeTo = new File("");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_12()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = new File("", "");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixture_13()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "";
		File writeTo = new File("0123456789", "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1305)
		//       at java.io.File.mkdirs(File.java:1337)
		//       at net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:45)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteResource_fixtureInstance_13()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = new File(URI.create(""));

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteResource_fixtureInstance_14()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = File.createTempFile("0123456789", "0123456789", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteResource_fixture_14()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = File.createTempFile("0123456789", "0123456789", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteResource_fixture_15()
		throws Exception {
		ResourceWriter fixture2 = getFixture();
		String resourceName = "0123456789";
		File writeTo = File.createTempFile("0123456789", "0123456789");

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
	}

	/**
	 * Run the void writeResource(String,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteResource_fixtureInstance_15()
		throws Exception {
		ResourceWriter fixture2 = getFixtureInstance();
		String resourceName = "0123456789";
		File writeTo = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		fixture2.writeResource(resourceName, writeTo);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
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
	 * @generatedBy CodePro at 6/7/15 4:18 PM
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
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResourceWriterTest.class);
	}
}