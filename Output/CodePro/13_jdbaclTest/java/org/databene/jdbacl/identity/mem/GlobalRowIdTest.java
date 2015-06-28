package org.databene.jdbacl.identity.mem;

import org.databene.commons.bean.ObjectOrArray;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GlobalRowIdTest</code> contains tests for the class <code>{@link GlobalRowId}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GlobalRowIdTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GlobalRowId
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private GlobalRowId fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GlobalRowId
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private GlobalRowId fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GlobalRowId
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private GlobalRowId fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GlobalRowId
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public GlobalRowId getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new GlobalRowId("", "", new Object());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GlobalRowId
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public GlobalRowId getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new GlobalRowId("0123456789", "0123456789", (Object) null);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GlobalRowId
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public GlobalRowId getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new GlobalRowId("An��t-1.0.txt", "An��t-1.0.txt", (Object) null);
		}
		return fixture3;
	}

	/**
	 * Run the GlobalRowId(String,String,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGlobalRowId_1()
		throws Exception {
		String schemaId = "";
		String tableName = "";
		Object pk = new ObjectOrArray(new Object());

		GlobalRowId result = new GlobalRowId(schemaId, tableName, pk);

		// add additional test code here
		assertNotNull(result);
		assertEquals(".#java.lang.Object@7b4ee0c4", result.toString());
	}

	/**
	 * Run the GlobalRowId(String,String,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGlobalRowId_2()
		throws Exception {
		String schemaId = "0123456789";
		String tableName = "0123456789";
		Object pk = new ObjectOrArray(new Object());

		GlobalRowId result = new GlobalRowId(schemaId, tableName, pk);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789.0123456789#java.lang.Object@283e3d44", result.toString());
	}

	/**
	 * Run the GlobalRowId(String,String,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGlobalRowId_3()
		throws Exception {
		String schemaId = "0123456789";
		String tableName = "";
		Object pk = new ObjectOrArray(new Object());

		GlobalRowId result = new GlobalRowId(schemaId, tableName, pk);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789.#java.lang.Object@789c3742", result.toString());
	}

	/**
	 * Run the GlobalRowId(String,String,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGlobalRowId_4()
		throws Exception {
		String schemaId = "";
		String tableName = "0123456789";
		Object pk = new ObjectOrArray(new Object());

		GlobalRowId result = new GlobalRowId(schemaId, tableName, pk);

		// add additional test code here
		assertNotNull(result);
		assertEquals(".0123456789#java.lang.Object@509e5cc0", result.toString());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture1_1()
		throws Exception {
		GlobalRowId fixture = getFixture1();
		Object obj = "1";

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture2_1()
		throws Exception {
		GlobalRowId fixture = getFixture2();
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture3_1()
		throws Exception {
		GlobalRowId fixture = getFixture3();
		Object obj = new GlobalRowId("", "", new Object());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture1_2()
		throws Exception {
		GlobalRowId fixture = getFixture1();
		Object obj = new GlobalRowId("0123456789", "0123456789", (Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture2_2()
		throws Exception {
		GlobalRowId fixture = getFixture2();
		Object obj = new GlobalRowId("An��t-1.0.txt", "An��t-1.0.txt", (Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture1_3()
		throws Exception {
		GlobalRowId fixture = getFixture1();
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture2_3()
		throws Exception {
		GlobalRowId fixture = getFixture2();
		Object obj = new GlobalRowId("", "", new Object());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture3_2()
		throws Exception {
		GlobalRowId fixture = getFixture3();
		Object obj = new GlobalRowId("0123456789", "0123456789", (Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture1_4()
		throws Exception {
		GlobalRowId fixture = getFixture1();
		Object obj = new GlobalRowId("An��t-1.0.txt", "An��t-1.0.txt", (Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture3_3()
		throws Exception {
		GlobalRowId fixture = getFixture3();
		Object obj = "1";

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture1_5()
		throws Exception {
		GlobalRowId fixture = getFixture1();
		Object obj = new GlobalRowId("", "", new Object());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture2_4()
		throws Exception {
		GlobalRowId fixture = getFixture2();
		Object obj = new GlobalRowId("0123456789", "0123456789", (Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.equals(ObjectOrArray.java:58)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.equals(GlobalRowId.java:61)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture3_4()
		throws Exception {
		GlobalRowId fixture = getFixture3();
		Object obj = new GlobalRowId("An��t-1.0.txt", "An��t-1.0.txt", (Object) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.equals(ObjectOrArray.java:58)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.equals(GlobalRowId.java:61)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture2_5()
		throws Exception {
		GlobalRowId fixture = getFixture2();
		Object obj = "1";

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture3_5()
		throws Exception {
		GlobalRowId fixture = getFixture3();
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture1_1()
		throws Exception {
		GlobalRowId fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1379604867, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture2_1()
		throws Exception {
		GlobalRowId fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at org.databene.commons.bean.HashCodeBuilder.componentHashCode(HashCodeBuilder.java:47)
		//       at org.databene.commons.bean.HashCodeBuilder.hashCode(HashCodeBuilder.java:37)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.hashCode(GlobalRowId.java:49)
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture3_1()
		throws Exception {
		GlobalRowId fixture = getFixture3();

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at org.databene.commons.bean.HashCodeBuilder.componentHashCode(HashCodeBuilder.java:47)
		//       at org.databene.commons.bean.HashCodeBuilder.hashCode(HashCodeBuilder.java:37)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.hashCode(GlobalRowId.java:49)
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		GlobalRowId fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals(".#java.lang.Object@3fde3d5a", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		GlobalRowId fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.toString(ObjectOrArray.java:66)
		//       at java.lang.String.valueOf(String.java:2849)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.renderPK(GlobalRowId.java:73)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.toString(GlobalRowId.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		GlobalRowId fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.toString(ObjectOrArray.java:66)
		//       at java.lang.String.valueOf(String.java:2849)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.renderPK(GlobalRowId.java:73)
		//       at org.databene.jdbacl.identity.mem.GlobalRowId.toString(GlobalRowId.java:66)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GlobalRowIdTest.class);
	}
}