package net.sourceforge.schemaspy.ui;

import org.junit.*;
import net.sourceforge.schemaspy.util.DbSpecificConfig;
import static org.junit.Assert.*;

/**
 * The class <code>DbConfigTableModelTest</code> contains tests for the class <code>{@link DbConfigTableModel}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DbConfigTableModelTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DbConfigTableModel
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private DbConfigTableModel fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DbConfigTableModel
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private DbConfigTableModel fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbConfigTableModel
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public DbConfigTableModel getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DbConfigTableModel();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbConfigTableModel
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public DbConfigTableModel getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DbConfigTableModel();
			fixture2.setDbSpecificConfig(new DbSpecificConfig(""));
			fixture2.setDbSpecificConfig(new DbSpecificConfig(""));
		}
		return fixture2;
	}

	/**
	 * Run the DbConfigTableModel() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDbConfigTableModel_1()
		throws Exception {

		DbConfigTableModel result = new DbConfigTableModel();

		// add additional test code here
		assertNotNull(result);
		assertEquals(5, result.getRowCount());
		assertEquals(2, result.getColumnCount());
	}

	/**
	 * Run the Class<Object> getClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetClass_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 0;

		Class<Object> result = (Class<Object>) fixture.getClass(row);

		// add additional test code here
		assertNotNull(result);
		assertEquals("class java.io.File", result.toString());
		assertEquals(1, result.getModifiers());
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isArray());
		assertEquals(false, result.isPrimitive());
		assertEquals(null, result.getComponentType());
		assertEquals("java.io.File", result.getName());
		assertEquals(false, result.isAnnotation());
		assertEquals(false, result.isSynthetic());
		assertEquals(null, result.getClassLoader());
		assertEquals(null, result.getSigners());
		assertEquals(null, result.getEnclosingMethod());
		assertEquals(null, result.getEnclosingConstructor());
		assertEquals(null, result.getDeclaringClass());
		assertEquals(null, result.getEnclosingClass());
		assertEquals("File", result.getSimpleName());
		assertEquals("java.io.File", result.getCanonicalName());
		assertEquals(false, result.isAnonymousClass());
		assertEquals(false, result.isLocalClass());
		assertEquals(false, result.isMemberClass());
		assertEquals(false, result.desiredAssertionStatus());
		assertEquals(false, result.isEnum());
		assertEquals(null, result.getEnumConstants());
	}

	/**
	 * Run the Class<Object> getClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetClass_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 1;

		Class<Object> result = (Class<Object>) fixture.getClass(row);

		// add additional test code here
		assertNotNull(result);
		assertEquals("class java.lang.String", result.toString());
		assertEquals(17, result.getModifiers());
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isArray());
		assertEquals(false, result.isPrimitive());
		assertEquals(null, result.getComponentType());
		assertEquals("java.lang.String", result.getName());
		assertEquals("", result.newInstance());
		assertEquals(false, result.isAnnotation());
		assertEquals(false, result.isSynthetic());
		assertEquals(null, result.getClassLoader());
		assertEquals(null, result.getSigners());
		assertEquals(null, result.getEnclosingMethod());
		assertEquals(null, result.getEnclosingConstructor());
		assertEquals(null, result.getDeclaringClass());
		assertEquals(null, result.getEnclosingClass());
		assertEquals("String", result.getSimpleName());
		assertEquals("java.lang.String", result.getCanonicalName());
		assertEquals(false, result.isAnonymousClass());
		assertEquals(false, result.isLocalClass());
		assertEquals(false, result.isMemberClass());
		assertEquals(false, result.desiredAssertionStatus());
		assertEquals(false, result.isEnum());
		assertEquals(null, result.getEnumConstants());
	}

	/**
	 * Run the Class<Object> getClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetClass_fixture1_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 7;

		Class<Object> result = (Class<Object>) fixture.getClass(row);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getClass(DbConfigTableModel.java:195)
		assertNotNull(result);
	}

	/**
	 * Run the Class<Object> getClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetClass_fixture1_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 1;

		Class<Object> result = (Class<Object>) fixture.getClass(row);

		// add additional test code here
		assertNotNull(result);
		assertEquals("class java.lang.String", result.toString());
		assertEquals(17, result.getModifiers());
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isArray());
		assertEquals(false, result.isPrimitive());
		assertEquals(null, result.getComponentType());
		assertEquals("java.lang.String", result.getName());
		assertEquals("", result.newInstance());
		assertEquals(false, result.isAnnotation());
		assertEquals(false, result.isSynthetic());
		assertEquals(null, result.getClassLoader());
		assertEquals(null, result.getSigners());
		assertEquals(null, result.getEnclosingMethod());
		assertEquals(null, result.getEnclosingConstructor());
		assertEquals(null, result.getDeclaringClass());
		assertEquals(null, result.getEnclosingClass());
		assertEquals("String", result.getSimpleName());
		assertEquals("java.lang.String", result.getCanonicalName());
		assertEquals(false, result.isAnonymousClass());
		assertEquals(false, result.isLocalClass());
		assertEquals(false, result.isMemberClass());
		assertEquals(false, result.desiredAssertionStatus());
		assertEquals(false, result.isEnum());
		assertEquals(null, result.getEnumConstants());
	}

	/**
	 * Run the Class<Object> getClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetClass_fixture2_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 7;

		Class<Object> result = (Class<Object>) fixture.getClass(row);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getClass(DbConfigTableModel.java:195)
		assertNotNull(result);
	}

	/**
	 * Run the Class<Object> getClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetClass_fixture2_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 0;

		Class<Object> result = (Class<Object>) fixture.getClass(row);

		// add additional test code here
		assertNotNull(result);
		assertEquals("class java.io.File", result.toString());
		assertEquals(1, result.getModifiers());
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isArray());
		assertEquals(false, result.isPrimitive());
		assertEquals(null, result.getComponentType());
		assertEquals("java.io.File", result.getName());
		assertEquals(false, result.isAnnotation());
		assertEquals(false, result.isSynthetic());
		assertEquals(null, result.getClassLoader());
		assertEquals(null, result.getSigners());
		assertEquals(null, result.getEnclosingMethod());
		assertEquals(null, result.getEnclosingConstructor());
		assertEquals(null, result.getDeclaringClass());
		assertEquals(null, result.getEnclosingClass());
		assertEquals("File", result.getSimpleName());
		assertEquals("java.io.File", result.getCanonicalName());
		assertEquals(false, result.isAnonymousClass());
		assertEquals(false, result.isLocalClass());
		assertEquals(false, result.isMemberClass());
		assertEquals(false, result.desiredAssertionStatus());
		assertEquals(false, result.isEnum());
		assertEquals(null, result.getEnumConstants());
	}

	/**
	 * Run the int getColumnCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetColumnCount_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();

		int result = fixture.getColumnCount();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getColumnCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetColumnCount_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();

		int result = fixture.getColumnCount();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the String getColumnName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetColumnName_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int column = 0;

		String result = fixture.getColumnName(column);

		// add additional test code here
		assertEquals("Option", result);
	}

	/**
	 * Run the String getColumnName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetColumnName_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int column = 1;

		String result = fixture.getColumnName(column);

		// add additional test code here
		assertEquals("Value", result);
	}

	/**
	 * Run the String getColumnName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetColumnName_fixture2_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int column = 0;

		String result = fixture.getColumnName(column);

		// add additional test code here
		assertEquals("Option", result);
	}

	/**
	 * Run the String getColumnName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetColumnName_fixture1_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int column = 1;

		String result = fixture.getColumnName(column);

		// add additional test code here
		assertEquals("Value", result);
	}

	/**
	 * Run the String getDescription(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 0;

		String result = fixture.getDescription(row);

		// add additional test code here
		assertEquals("Directory to generate HTML output to", result);
	}

	/**
	 * Run the String getDescription(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 1;

		String result = fixture.getDescription(row);

		// add additional test code here
		assertEquals("Schema to evaluate", result);
	}

	/**
	 * Run the String getDescription(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture1_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 7;

		String result = fixture.getDescription(row);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescription(DbConfigTableModel.java:204)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture1_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 1;

		String result = fixture.getDescription(row);

		// add additional test code here
		assertEquals("Schema to evaluate", result);
	}

	/**
	 * Run the String getDescription(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture2_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 7;

		String result = fixture.getDescription(row);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescription(DbConfigTableModel.java:204)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture2_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 0;

		String result = fixture.getDescription(row);

		// add additional test code here
		assertEquals("Directory to generate HTML output to", result);
	}

	/**
	 * Run the int getRowCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRowCount_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();

		int result = fixture.getRowCount();

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the int getRowCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRowCount_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();

		int result = fixture.getRowCount();

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 0;
		int column = 0;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 1;
		int column = 1;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture1_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 7;
		int column = 1;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture1_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 1;
		int column = 0;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture2_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 7;
		int column = 0;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture2_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 0;
		int column = 1;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture1_4()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 1;
		int column = 1;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture1_5()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 0;
		int column = 1;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture2_4()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 7;
		int column = 1;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture2_5()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 1;
		int column = 0;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture1_6()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 7;
		int column = 0;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		assertNotNull(result);
	}

	/**
	 * Run the Object getValueAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetValueAt_fixture2_6()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 0;
		int column = 0;

		Object result = fixture.getValueAt(row, column);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 0;
		int col = 0;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 1;
		int col = 1;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture1_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 7;
		int col = 1;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.isCellEditable(DbConfigTableModel.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture1_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 1;
		int col = 0;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture2_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 7;
		int col = 0;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture2_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 0;
		int col = 1;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture1_4()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 1;
		int col = 1;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture1_5()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 0;
		int col = 1;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture2_4()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 7;
		int col = 1;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.isCellEditable(DbConfigTableModel.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture2_5()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 1;
		int col = 0;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture1_6()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		int row = 7;
		int col = 0;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCellEditable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsCellEditable_fixture2_6()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		int row = 0;
		int col = 0;

		boolean result = fixture.isCellEditable(row, col);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setDbSpecificConfig(DbSpecificConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetDbSpecificConfig_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		DbSpecificConfig dbConfig = new DbSpecificConfig("");

		fixture.setDbSpecificConfig(dbConfig);

		// add additional test code here
	}

	/**
	 * Run the void setDbSpecificConfig(DbSpecificConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetDbSpecificConfig_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		DbSpecificConfig dbConfig = new DbSpecificConfig("");

		fixture.setDbSpecificConfig(dbConfig);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 0;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: java.lang.IllegalArgumentException: argument type mismatch
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:183)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_1()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 1;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 7;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 1;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_2()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 7;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_3()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 0;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_4()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 7;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_5()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 0;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: java.lang.IllegalArgumentException: argument type mismatch
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:183)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_4()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 1;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_5()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 0;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_6()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 1;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_6()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 7;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_7()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 1;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_8()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 7;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_9()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 0;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: java.lang.IllegalArgumentException: argument type mismatch
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:183)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_7()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 7;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_8()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 0;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_9()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 1;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_10()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 0;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: java.lang.IllegalArgumentException: argument type mismatch
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:183)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_10()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 1;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_11()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 7;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_12()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 1;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_11()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 7;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_12()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 0;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_13()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 7;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_14()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = "1";
		int row = 0;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: java.lang.IllegalArgumentException: argument type mismatch
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:183)
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_13()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 1;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_14()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = null;
		int row = 0;
		int col = 0;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture1_15()
		throws Exception {
		DbConfigTableModel fixture = getFixture1();
		Object value = "1";
		int row = 1;
		int col = 1;

		fixture.setValueAt(value, row, col);

		// add additional test code here
	}

	/**
	 * Run the void setValueAt(Object,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetValueAt_fixture2_15()
		throws Exception {
		DbConfigTableModel fixture = getFixture2();
		Object value = null;
		int row = 7;
		int col = 7;

		fixture.setValueAt(value, row, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(DbConfigTableModel.java:145)
		//       at net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(DbConfigTableModel.java:168)
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
		new org.junit.runner.JUnitCore().run(DbConfigTableModelTest.class);
	}
}