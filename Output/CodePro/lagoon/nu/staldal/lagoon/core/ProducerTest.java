package nu.staldal.lagoon.core;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import nu.staldal.xtree.Element;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import nu.staldal.lagoon.producer.XMLParse;
import java.io.Writer;
import java.util.Enumeration;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProducerTest</code> contains tests for the class <code>{@link Producer}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:55 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ProducerTest {
	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAddParam_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String name = "";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAfterBuild_1()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testBeforeBuild_1()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testDoAfterBuild_1()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoAfterBuild_2()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testDoBeforeBuild_1()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoBeforeBuild_2()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testDoDestroy_1()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoDestroy_2()
		throws Exception {
		Producer fixture = new XMLParse();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetContext_1()
		throws Exception {
		Producer fixture = new XMLParse();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetEntryName_1()
		throws Exception {
		Producer fixture = new XMLParse();

		String result = fixture.getEntryName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetObjectFromRepository_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetObjectFromRepository_2()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetParam_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetParamNames_1()
		throws Exception {
		Producer fixture = new XMLParse();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetPosition_1()
		throws Exception {
		Producer fixture = new XMLParse();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testGetSourceMan_1()
		throws Exception {
		Producer fixture = new XMLParse();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testGetSourceMan_2()
		throws Exception {
		Producer fixture = new XMLParse();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testGetSourceMan_3()
		throws Exception {
		Producer fixture = new XMLParse();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testPutObjectIntoRepository_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testPutObjectIntoRepository_2()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testPutObjectIntoRepository_3()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testReadFileFromRepository_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetEntryName_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetPosition_1()
		throws Exception {
		Producer fixture = new XMLParse();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetProcessor_1()
		throws Exception {
		Producer fixture = new XMLParse();
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), new File(""), "", new PrintWriter(new CharArrayWriter()), new PrintWriter(new CharArrayWriter()));

		fixture.setProcessor(processor);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testSetSourceManager_1()
		throws Exception {
		Producer fixture = new XMLParse();
		SourceManagerProvider sourceMan = new OutputEntry();

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStoreFileInRepository_1()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStoreFileInRepository_2()
		throws Exception {
		Producer fixture = new XMLParse();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(ProducerTest.class);
	}
}