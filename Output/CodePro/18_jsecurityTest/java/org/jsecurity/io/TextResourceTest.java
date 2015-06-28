package org.jsecurity.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TextResourceTest</code> contains tests for the class <code>{@link TextResource}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TextResourceTest {
	/**
	 * Run the void doLoad(BufferedReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoLoad_1()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		BufferedReader reader = new BufferedReader(new PipedReader());

		fixture.doLoad(reader);

		// add additional test code here
	}

	/**
	 * Run the void doLoad(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoLoad_2()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = null;
		InputStream is = new PipedInputStream();

		fixture.doLoad(is);

		// add additional test code here
	}

	/**
	 * Run the void doLoad(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoLoad_3()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		InputStream is = new PipedInputStream();

		fixture.doLoad(is);

		// add additional test code here
	}

	/**
	 * Run the void doLoad(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testDoLoad_4()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		InputStream is = new PipedInputStream();

		fixture.doLoad(is);

		// add additional test code here
	}

	/**
	 * Run the String getCharsetName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCharsetName_1()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";

		String result = fixture.getCharsetName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		Reader reader = new PipedReader();

		fixture.load(reader);

		// add additional test code here
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_2()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		Reader reader = new BufferedReader(new PipedReader());

		fixture.load(reader);

		// add additional test code here
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_3()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		Reader reader = new PipedReader();

		fixture.load(reader);

		// add additional test code here
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_4()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		Reader reader = new BufferedReader(new PipedReader());

		fixture.load(reader);

		// add additional test code here
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_5()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		Reader reader = new PipedReader();

		fixture.load(reader);

		// add additional test code here
	}

	/**
	 * Run the void load(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_6()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		Reader reader = new BufferedReader(new PipedReader());

		fixture.load(reader);

		// add additional test code here
	}

	/**
	 * Run the void load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLoad_7()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		String resourcePath = "";

		fixture.load(resourcePath);

		// add additional test code here
	}

	/**
	 * Run the void load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testLoad_8()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		String resourcePath = null;

		fixture.load(resourcePath);

		// add additional test code here
	}

	/**
	 * Run the void setCharsetName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetCharsetName_1()
		throws Exception {
		IniResource fixture = new IniResource();
		fixture.charsetName = "";
		String charsetName = "";

		fixture.setCharsetName(charsetName);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TextResourceTest.class);
	}
}