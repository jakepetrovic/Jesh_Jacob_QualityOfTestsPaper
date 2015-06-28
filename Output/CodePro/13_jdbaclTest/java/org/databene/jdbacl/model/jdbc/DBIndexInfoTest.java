package org.databene.jdbacl.model.jdbc;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBIndexInfoTest</code> contains tests for the class <code>{@link DBIndexInfo}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBIndexInfoTest {
	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_1()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) -1;
		String catalogName = "";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 0;
		int pages = 0;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_2()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 1;
		int pages = 1;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_3()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 7;
		int pages = 7;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_4()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 1;
		int pages = 1;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_5()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 7;
		int pages = 7;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_6()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 1;
		int pages = 0;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_7()
		throws Exception {
		String name = "";
		String tableName = "0123456789";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 7;
		int pages = 1;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_8()
		throws Exception {
		String name = "";
		String tableName = "0123456789";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 1;
		int pages = 0;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_9()
		throws Exception {
		String name = "";
		String tableName = "0123456789";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 7;
		int pages = 1;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_10()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 0;
		int pages = 7;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_11()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 7;
		int pages = 0;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_12()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 0;
		int pages = 7;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_13()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 7;
		int pages = 0;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_14()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 0;
		int pages = 1;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_15()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 1;
		int pages = 7;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_16()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = true;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 0;
		int pages = 1;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_17()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 1;
		int pages = 7;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_18()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 0;
		int pages = 0;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_19()
		throws Exception {
		String name = "";
		String tableName = "0123456789";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 1;
		int pages = 1;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_20()
		throws Exception {
		String name = "";
		String tableName = "0123456789";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 0;
		int pages = 0;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_21()
		throws Exception {
		String name = "";
		String tableName = "0123456789";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 1;
		int pages = 1;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_22()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 7;
		int pages = 7;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_23()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = 1;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 1;
		int pages = 0;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_24()
		throws Exception {
		String name = "";
		String tableName = "";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 7;
		int pages = 7;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_25()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 1;
		int pages = 0;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_26()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 7;
		int pages = 1;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_27()
		throws Exception {
		String name = "0123456789";
		String tableName = "0123456789";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "0123456789";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 0;
		int pages = 7;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_28()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) 1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 7;
		int pages = 1;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_29()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) 0;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.TRUE;
		int cardinality = 0;
		int pages = 7;
		String filterCondition = "";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndexInfo(String,String,short,String,boolean,short,String,Boolean,int,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBIndexInfo_30()
		throws Exception {
		String name = "0123456789";
		String tableName = "";
		short type = (short) -1;
		String catalogName = "0123456789";
		boolean unique = false;
		short ordinalPosition = (short) 0;
		String columnName = "";
		Boolean ascending = Boolean.FALSE;
		int cardinality = 7;
		int pages = 0;
		String filterCondition = "0123456789";

		DBIndexInfo result = new DBIndexInfo(name, tableName, type, catalogName, unique, ordinalPosition, columnName, ascending, cardinality, pages, filterCondition);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: ordinalPosition is expected to be 1, found: 0
		//       at org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(DBIndexInfo.java:63)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DBIndexInfoTest.class);
	}
}