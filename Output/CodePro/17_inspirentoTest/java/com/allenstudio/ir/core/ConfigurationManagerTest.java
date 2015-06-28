package com.allenstudio.ir.core;

import java.util.Hashtable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConfigurationManagerTest</code> contains tests for the class <code>{@link ConfigurationManager}</code>.
 *
 * @generatedBy CodePro at 4/8/14 12:31 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ConfigurationManagerTest {
	/**
	 * Run the ConfigurationManager getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		ConfigurationManager result = ConfigurationManager.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConfigurationManager getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		ConfigurationManager result = ConfigurationManager.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetProperty_1()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();
		String key = "";

		String result = fixture.getProperty(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetProperty_2()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();
		String key = "";

		String result = fixture.getProperty(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void readIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testReadIn_1()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.readIn();

		// add additional test code here
	}

	/**
	 * Run the void readIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testReadIn_2()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.readIn();

		// add additional test code here
	}

	/**
	 * Run the void readIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testReadIn_3()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.readIn();

		// add additional test code here
	}

	/**
	 * Run the void readIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testReadIn_4()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.readIn();

		// add additional test code here
	}

	/**
	 * Run the Object setProperty(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testSetProperty_1()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();
		String key = "";
		String value = "";

		Object result = fixture.setProperty(key, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void writeBack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testWriteBack_1()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.writeBack();

		// add additional test code here
	}

	/**
	 * Run the void writeBack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testWriteBack_2()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.writeBack();

		// add additional test code here
	}

	/**
	 * Run the void writeBack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testWriteBack_3()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.writeBack();

		// add additional test code here
	}

	/**
	 * Run the void writeBack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testWriteBack_4()
		throws Exception {
		ConfigurationManager fixture = ConfigurationManager.getInstance();
		fixture.put((Object) null, (Object) null);
		fixture.clear();

		fixture.writeBack();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
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
	 * @generatedBy CodePro at 4/8/14 12:31 PM
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
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConfigurationManagerTest.class);
	}
}