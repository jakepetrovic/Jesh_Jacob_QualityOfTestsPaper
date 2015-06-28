package org.databene.jdbacl.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBDataTypeTest</code> contains tests for the class <code>{@link DBDataType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBDataTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBDataType
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBDataType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBDataType
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBDataType fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBDataType
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBDataType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = DBDataType.getInstance(0, "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBDataType
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBDataType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = DBDataType.getInstance(1, "0123456789");
		}
		return fixture2;
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();
		Object o = "1";

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();
		Object o = null;

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_2()
		throws Exception {
		DBDataType fixture = getFixture1();
		Object o = DBDataType.getInstance(0, "");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_2()
		throws Exception {
		DBDataType fixture = getFixture2();
		Object o = DBDataType.getInstance(1, "0123456789");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_3()
		throws Exception {
		DBDataType fixture = getFixture2();
		Object o = "1";

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_3()
		throws Exception {
		DBDataType fixture = getFixture1();
		Object o = null;

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_4()
		throws Exception {
		DBDataType fixture = getFixture2();
		Object o = DBDataType.getInstance(0, "");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_4()
		throws Exception {
		DBDataType fixture = getFixture1();
		Object o = DBDataType.getInstance(1, "0123456789");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the DBDataType getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {
		String name = "";

		DBDataType result = DBDataType.getInstance(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBDataType getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {
		String name = "0123456789";

		DBDataType result = DBDataType.getInstance(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBDataType getInstance(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_3()
		throws Exception {
		int jdbcType = 0;
		String name = "";

		DBDataType result = DBDataType.getInstance(jdbcType, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(0, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getInstance(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_4()
		throws Exception {
		int jdbcType = 1;
		String name = "0123456789";

		DBDataType result = DBDataType.getInstance(jdbcType, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(1, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getInstance(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_5()
		throws Exception {
		int jdbcType = 7;
		String name = "0123456789";

		DBDataType result = DBDataType.getInstance(jdbcType, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(7, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getInstance(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_6()
		throws Exception {
		int jdbcType = 1;
		String name = "";

		DBDataType result = DBDataType.getInstance(jdbcType, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(1, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getInstance(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_7()
		throws Exception {
		int jdbcType = 7;
		String name = "";

		DBDataType result = DBDataType.getInstance(jdbcType, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(7, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getInstance(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetInstance_8()
		throws Exception {
		int jdbcType = 0;
		String name = "0123456789";

		DBDataType result = DBDataType.getInstance(jdbcType, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(0, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the int getJdbcType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetJdbcType_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		int result = fixture.getJdbcType();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getJdbcType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetJdbcType_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		int result = fixture.getJdbcType();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the boolean isAlpha() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsAlpha_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		boolean result = fixture.isAlpha();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAlpha() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsAlpha_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		boolean result = fixture.isAlpha();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLOB() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsLOB_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		boolean result = fixture.isLOB();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLOB() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsLOB_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		boolean result = fixture.isLOB();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNumber_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		boolean result = fixture.isNumber();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNumber_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		boolean result = fixture.isNumber();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTemporal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsTemporal_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		boolean result = fixture.isTemporal();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTemporal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsTemporal_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		boolean result = fixture.isTemporal();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int jdbcTypeFor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJdbcTypeFor_1()
		throws Exception {
		String name = "";

		int result = DBDataType.jdbcTypeFor(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		assertEquals(0, result);
	}

	/**
	 * Run the int jdbcTypeFor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJdbcTypeFor_2()
		throws Exception {
		String name = "0123456789";

		int result = DBDataType.jdbcTypeFor(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		DBDataType fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		DBDataType fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DBDataTypeTest.class);
	}
}