package net.sourceforge.schemaspy.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DbSpecificOptionTest</code> contains tests for the class <code>{@link DbSpecificOption}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:20 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DbSpecificOptionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DbSpecificOption fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DbSpecificOption("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DbSpecificOption("", "");
			fixture2.setValue(new Object());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DbSpecificOption("", "", "");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DbSpecificOption("0123456789", "0123456789");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DbSpecificOption("0123456789", "0123456789");
			fixture5.setValue(new Object());
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DbSpecificOption("0123456789", "0123456789", "0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificOption
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DbSpecificOption getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DbSpecificOption("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_1()
		throws Exception {
		String name = "";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: 'null' description: ''", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_2()
		throws Exception {
		String name = "0123456789";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: 'null' description: '0123456789'", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_3()
		throws Exception {
		String name = "1";
		String description = "1";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '1' value: 'null' description: '1'", result.toString());
		assertEquals("1", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("1", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_4()
		throws Exception {
		String name = "0123456789";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: 'null' description: ''", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_5()
		throws Exception {
		String name = "1";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '1' value: 'null' description: '0123456789'", result.toString());
		assertEquals("1", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_6()
		throws Exception {
		String name = "";
		String description = "1";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: 'null' description: '1'", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("1", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_7()
		throws Exception {
		String name = "1";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '1' value: 'null' description: ''", result.toString());
		assertEquals("1", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_8()
		throws Exception {
		String name = "";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: 'null' description: '0123456789'", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_9()
		throws Exception {
		String name = "0123456789";
		String description = "1";

		DbSpecificOption result = new DbSpecificOption(name, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: 'null' description: '1'", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getValue());
		assertEquals("1", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_10()
		throws Exception {
		String name = "";
		String value = "";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: '' description: ''", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_11()
		throws Exception {
		String name = "0123456789";
		String value = "0123456789";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: '0123456789' description: '0123456789'", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_12()
		throws Exception {
		String name = "0123456789";
		String value = "0123456789";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: '0123456789' description: ''", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_13()
		throws Exception {
		String name = "0123456789";
		String value = "";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: '' description: '0123456789'", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("", result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_14()
		throws Exception {
		String name = "0123456789";
		String value = "";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '0123456789' value: '' description: ''", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("", result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_15()
		throws Exception {
		String name = "";
		String value = "0123456789";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: '0123456789' description: '0123456789'", result.toString());
		assertEquals("", result.getName());
		assertEquals("0123456789", result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_16()
		throws Exception {
		String name = "";
		String value = "0123456789";
		String description = "";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: '0123456789' description: ''", result.toString());
		assertEquals("", result.getName());
		assertEquals("0123456789", result.getValue());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the DbSpecificOption(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testDbSpecificOption_17()
		throws Exception {
		String name = "";
		String value = "";
		String description = "0123456789";

		DbSpecificOption result = new DbSpecificOption(name, value, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals("DbSpecificOption name: '' value: '' description: '0123456789'", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getValue());
		assertEquals("0123456789", result.getDescription());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture1_1()
		throws Exception {
		DbSpecificOption fixture = getFixture1();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture2_1()
		throws Exception {
		DbSpecificOption fixture = getFixture2();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture3_1()
		throws Exception {
		DbSpecificOption fixture = getFixture3();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture4_1()
		throws Exception {
		DbSpecificOption fixture = getFixture4();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture5_1()
		throws Exception {
		DbSpecificOption fixture = getFixture5();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture6_1()
		throws Exception {
		DbSpecificOption fixture = getFixture6();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDescription_fixture7_1()
		throws Exception {
		DbSpecificOption fixture = getFixture7();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		DbSpecificOption fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		DbSpecificOption fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		DbSpecificOption fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture4_1()
		throws Exception {
		DbSpecificOption fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture5_1()
		throws Exception {
		DbSpecificOption fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture6_1()
		throws Exception {
		DbSpecificOption fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetName_fixture7_1()
		throws Exception {
		DbSpecificOption fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture1_1()
		throws Exception {
		DbSpecificOption fixture = getFixture1();

		Object result = fixture.getValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture2_1()
		throws Exception {
		DbSpecificOption fixture = getFixture2();

		Object result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture3_1()
		throws Exception {
		DbSpecificOption fixture = getFixture3();

		Object result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture4_1()
		throws Exception {
		DbSpecificOption fixture = getFixture4();

		Object result = fixture.getValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture5_1()
		throws Exception {
		DbSpecificOption fixture = getFixture5();

		Object result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture6_1()
		throws Exception {
		DbSpecificOption fixture = getFixture6();

		Object result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetValue_fixture7_1()
		throws Exception {
		DbSpecificOption fixture = getFixture7();

		Object result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture1_1()
		throws Exception {
		DbSpecificOption fixture = getFixture1();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture2_1()
		throws Exception {
		DbSpecificOption fixture = getFixture2();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture3_1()
		throws Exception {
		DbSpecificOption fixture = getFixture3();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture4_1()
		throws Exception {
		DbSpecificOption fixture = getFixture4();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture5_1()
		throws Exception {
		DbSpecificOption fixture = getFixture5();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture6_1()
		throws Exception {
		DbSpecificOption fixture = getFixture6();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture7_1()
		throws Exception {
		DbSpecificOption fixture = getFixture7();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture2_2()
		throws Exception {
		DbSpecificOption fixture = getFixture2();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture3_2()
		throws Exception {
		DbSpecificOption fixture = getFixture3();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture4_2()
		throws Exception {
		DbSpecificOption fixture = getFixture4();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture5_2()
		throws Exception {
		DbSpecificOption fixture = getFixture5();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture6_2()
		throws Exception {
		DbSpecificOption fixture = getFixture6();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture7_2()
		throws Exception {
		DbSpecificOption fixture = getFixture7();
		Object value = new Object();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testSetValue_fixture1_2()
		throws Exception {
		DbSpecificOption fixture = getFixture1();
		Object value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		DbSpecificOption fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: '' value: 'null' description: ''", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		DbSpecificOption fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: '' value: 'java.lang.Object@78e05d8c' description: ''", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		DbSpecificOption fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: '' value: '' description: ''", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		DbSpecificOption fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: '0123456789' value: 'null' description: '0123456789'", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		DbSpecificOption fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: '0123456789' value: 'java.lang.Object@79e59511' description: '0123456789'", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture6_1()
		throws Exception {
		DbSpecificOption fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: '0123456789' value: '0123456789' description: '0123456789'", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testToString_fixture7_1()
		throws Exception {
		DbSpecificOption fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("DbSpecificOption name: 'An��t-1.0.txt' value: 'An��t-1.0.txt' description: 'An��t-1.0.txt'", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DbSpecificOptionTest.class);
	}
}