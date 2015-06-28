package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBTreeModelTest</code> contains tests for the class <code>{@link DBTreeModel}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBTreeModelTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTreeModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBTreeModel fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTreeModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBTreeModel getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DBTreeModel((CompositeDBObject<DBObject>) null);
		}
		return fixture;
	}

	/**
	 * Run the DBTreeModel(CompositeDBObject<?>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBTreeModel_1()
		throws Exception {
		CompositeDBObject<DBObject> root = null;

		DBTreeModel result = new DBTreeModel(root);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRoot());
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_1()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("");
		int index = 0;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_2()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));
		int index = 1;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_3()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_4()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog();
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_5()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBPackage("", new DBSchema(""));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_6()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_7()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBProcedure("", new DBPackage("", new DBSchema("")));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBProcedure cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_8()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBProcedure cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_9()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("");
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_10()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("", new DBCatalog(""));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_11()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_12()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("", "", "");
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_13()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("", new DBSchema(""));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_14()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("0123456789", "0123456789", "0123456789");
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_15()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_16()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_17()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBTrigger("", new DBSchema(""));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_18()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_19()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_20()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_21()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_22()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_23()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_24()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_25()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_26()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChild(DBTreeModel.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_27()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_28()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_29()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getChild(DBObject,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChild_fixture_30()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));
		int index = 7;

		DBObject result = fixture2.getChild(parent, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_1()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("");

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_2()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_3()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_4()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog();

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_5()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBPackage("", new DBSchema(""));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_6()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_7()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBProcedure("", new DBPackage("", new DBSchema("")));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBProcedure cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_8()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBProcedure cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_9()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("");

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_10()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("", new DBCatalog(""));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_11()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_12()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("", "", "");

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_13()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("", new DBSchema(""));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_14()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("0123456789", "0123456789", "0123456789");

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_15()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_16()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_17()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBTrigger("", new DBSchema(""));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_18()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_19()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_20()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_21()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_22()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_23()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_24()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_25()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_26()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getChildCount(DBTreeModel.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_27()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_28()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_29()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertEquals(0, result);
	}

	/**
	 * Run the int getChildCount(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetChildCount_fixture_30()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		int result = fixture2.getChildCount(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_1()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("");
		DBObject child = new DBCatalog("");

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_2()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));
		DBObject child = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_3()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		DBObject child = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_4()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBCatalog();
		DBObject child = new DBCatalog();

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_5()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBPackage("", new DBSchema(""));
		DBObject child = new DBPackage("", new DBSchema(""));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_6()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));
		DBObject child = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_7()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBProcedure("", new DBPackage("", new DBSchema("")));
		DBObject child = new DBProcedure("", new DBPackage("", new DBSchema("")));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBProcedure cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_8()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));
		DBObject child = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBProcedure cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_9()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("");
		DBObject child = new DBSchema("");

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_10()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("", new DBCatalog(""));
		DBObject child = new DBSchema("", new DBCatalog(""));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_11()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBObject child = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_12()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("", "", "");
		DBObject child = new DBSequence("", "", "");

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_13()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("", new DBSchema(""));
		DBObject child = new DBSequence("", new DBSchema(""));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_14()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("0123456789", "0123456789", "0123456789");
		DBObject child = new DBSequence("0123456789", "0123456789", "0123456789");

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_15()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));
		DBObject child = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_16()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		DBObject child = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBSequence cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_17()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBTrigger("", new DBSchema(""));
		DBObject child = new DBTrigger("", new DBSchema(""));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_18()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));
		DBObject child = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_19()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));
		DBObject child = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_20()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));
		DBObject child = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_21()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));
		DBObject child = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_22()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));
		DBObject child = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_23()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);
		DBObject child = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_24()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));
		DBObject child = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_25()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));
		DBObject child = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_26()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);
		DBObject child = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.databene.jdbacl.model.DefaultDBColumn cannot be cast to org.databene.jdbacl.model.CompositeDBObject
		//       at org.databene.jdbacl.model.DBTreeModel.getIndexOfChild(DBTreeModel.java:62)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_27()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));
		DBObject child = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_28()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));
		DBObject child = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_29()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));
		DBObject child = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndexOfChild(DBObject,DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetIndexOfChild_fixture_30()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject parent = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));
		DBObject child = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		int result = fixture2.getIndexOfChild(parent, child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertEquals(0, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_1()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBCatalog("");

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_2()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_3()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("0123456789", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_4()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBCatalog();

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_5()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBPackage("", new DBSchema(""));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_6()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_7()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBProcedure("", new DBPackage("", new DBSchema("")));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_8()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("0123456789", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_9()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSchema("");

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_10()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSchema("", new DBCatalog(""));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_11()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("catalog", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_12()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSequence("", "", "");

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_13()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSequence("", new DBSchema(""));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_14()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSequence("0123456789", "0123456789", "0123456789");

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_15()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_16()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_17()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBTrigger("", new DBSchema(""));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_18()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_19()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_20()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_21()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_22()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_23()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_24()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_25()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_26()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("0123456789", result.getName());
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_27()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_28()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_29()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getParent(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetParent_fixture_30()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject child = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		DBObject result = fixture2.getParent(child);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBObject getRoot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetRoot_fixture_1()
		throws Exception {
		DBTreeModel fixture2 = getFixture();

		DBObject result = fixture2.getRoot();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_1()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBCatalog("");

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_2()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_3()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_4()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBCatalog();

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_5()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBPackage("", new DBSchema(""));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_6()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_7()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBProcedure("", new DBPackage("", new DBSchema("")));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_8()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_9()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSchema("");

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_10()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSchema("", new DBCatalog(""));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_11()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_12()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSequence("", "", "");

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_13()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSequence("", new DBSchema(""));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_14()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSequence("0123456789", "0123456789", "0123456789");

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_15()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_16()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_17()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBTrigger("", new DBSchema(""));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_18()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_19()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_20()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_21()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_22()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_23()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_24()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_25()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_26()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_27()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_28()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_29()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean isLeaf(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsLeaf_fixture_30()
		throws Exception {
		DBTreeModel fixture2 = getFixture();
		DBObject node = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		boolean result = fixture2.isLeaf(node);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(DBTreeModelTest.class);
	}
}