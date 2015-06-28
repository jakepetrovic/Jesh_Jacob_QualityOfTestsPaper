package net.sourceforge.schemaspy.util;

import java.io.File;
import java.net.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DotTest</code> contains tests for the class <code>{@link Dot}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DotTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Dot
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private Dot fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Dot
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public Dot getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = Dot.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the boolean exists() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testExists_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		boolean result = fixture.exists();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("", "");
		File diagramFile = File.createTempFile("", "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_2()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("", "", (File) null);
		File diagramFile = File.createTempFile("", "", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_3()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("0123456789", "0123456789");
		File diagramFile = File.createTempFile("0123456789", "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_4()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("0123456789", "0123456789", (File) null);
		File diagramFile = File.createTempFile("0123456789", "0123456789", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_5()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		File diagramFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_6()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("");
		File diagramFile = new File("");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_7()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("", "");
		File diagramFile = new File("", "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_8()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("0123456789", "0123456789");
		File diagramFile = new File("0123456789", "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_9()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File(URI.create(""));
		File diagramFile = new File(URI.create(""));

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_10()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File((File) null, "");
		File diagramFile = new File((File) null, "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_11()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File((File) null, "0123456789");
		File diagramFile = new File((File) null, "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_12()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("", "", (File) null);
		File diagramFile = File.createTempFile("", "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_13()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("0123456789", "0123456789");
		File diagramFile = File.createTempFile("", "", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_14()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("0123456789", "0123456789", (File) null);
		File diagramFile = File.createTempFile("0123456789", "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_15()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		File diagramFile = File.createTempFile("0123456789", "0123456789", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_16()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("");
		File diagramFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_17()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("", "");
		File diagramFile = new File("");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_18()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("0123456789", "0123456789");
		File diagramFile = new File("", "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_19()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File(URI.create(""));
		File diagramFile = new File("0123456789", "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_20()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File((File) null, "");
		File diagramFile = new File(URI.create(""));

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_21()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File((File) null, "0123456789");
		File diagramFile = new File((File) null, "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_22()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("", "");
		File diagramFile = new File((File) null, "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_23()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("0123456789", "0123456789");
		File diagramFile = File.createTempFile("", "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_24()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("0123456789", "0123456789", (File) null);
		File diagramFile = File.createTempFile("", "", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_25()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		File diagramFile = File.createTempFile("0123456789", "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_26()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("");
		File diagramFile = File.createTempFile("0123456789", "0123456789", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_27()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("", "");
		File diagramFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_28()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File("0123456789", "0123456789");
		File diagramFile = new File("");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_29()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File(URI.create(""));
		File diagramFile = new File("", "");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the String generateDiagram(File,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGenerateDiagram_fixtureInstance_30()
		throws Exception {
		Dot fixture = getFixtureInstance();
		File dotFile = new File((File) null, "");
		File diagramFile = new File("0123456789", "0123456789");

		String result = fixture.generateDiagram(dotFile, diagramFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1030)
		//       at net.sourceforge.schemaspy.util.Dot.generateDiagram(Dot.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String getFormat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetFormat_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		String result = fixture.getFormat();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the Dot getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		Dot result = Dot.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals("png", result.getFormat());
		assertEquals(false, result.isValid());
		assertEquals(false, result.exists());
		assertEquals(false, result.supportsCenteredEastWestEdges());
		assertEquals(false, result.requiresGdRenderer());
		assertEquals("dot version 2.2.1 or versions greater than 2.4", result.getSupportedVersions());
		assertEquals("", result.getRenderer());
		assertEquals(false, result.isHighQuality());
	}

	/**
	 * Run the String getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRenderer_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		String result = fixture.getRenderer();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSupportedVersions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetSupportedVersions_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		String result = fixture.getSupportedVersions();

		// add additional test code here
		assertEquals("dot version 2.2.1 or versions greater than 2.4", result);
	}

	/**
	 * Run the Version getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetVersion_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		Version result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
	}

	/**
	 * Run the boolean isHighQuality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsHighQuality_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		boolean result = fixture.isHighQuality();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsValid_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		boolean result = fixture.isValid();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean requiresGdRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRequiresGdRenderer_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		boolean result = fixture.requiresGdRenderer();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setFormat(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetFormat_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();
		String format = "";

		fixture.setFormat(format);

		// add additional test code here
	}

	/**
	 * Run the void setFormat(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetFormat_fixtureInstance_2()
		throws Exception {
		Dot fixture = getFixtureInstance();
		String format = "0123456789";

		fixture.setFormat(format);

		// add additional test code here
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetHighQuality_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();
		boolean highQuality = false;

		fixture.setHighQuality(highQuality);

		// add additional test code here
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetHighQuality_fixtureInstance_2()
		throws Exception {
		Dot fixture = getFixtureInstance();
		boolean highQuality = true;

		fixture.setHighQuality(highQuality);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetRenderer_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();
		String renderer = null;

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the boolean supportsCenteredEastWestEdges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSupportsCenteredEastWestEdges_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();

		boolean result = fixture.supportsCenteredEastWestEdges();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean supportsRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSupportsRenderer_fixtureInstance_1()
		throws Exception {
		Dot fixture = getFixtureInstance();
		String renderer = "";

		boolean result = fixture.supportsRenderer(renderer);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean supportsRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSupportsRenderer_fixtureInstance_2()
		throws Exception {
		Dot fixture = getFixtureInstance();
		String renderer = "0123456789";

		boolean result = fixture.supportsRenderer(renderer);

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(DotTest.class);
	}
}