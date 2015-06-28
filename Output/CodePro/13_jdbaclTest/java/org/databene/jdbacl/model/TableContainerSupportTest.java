package org.databene.jdbacl.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TableContainerSupportTest</code> contains tests for the class <code>{@link TableContainerSupport}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:02 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableContainerSupportTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TableContainerSupport
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	private TableContainerSupport fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableContainerSupport
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	public TableContainerSupport getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new TableContainerSupport();
		}
		return fixture;
	}

	/**
	 * Run the TableContainerSupport() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testTableContainerSupport_1()
		throws Exception {

		TableContainerSupport result = new TableContainerSupport();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSequence_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", "", "");

		fixture2.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSequence_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", new DBSchema(""));

		fixture2.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSequence_fixture_3()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture2.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSequence_fixture_4()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		fixture2.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSequence_fixture_5()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture2.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSubContainer(TableContainer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSubContainer_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		TableContainer subContainer = new TableContainer("");

		fixture2.addSubContainer(subContainer);

		// add additional test code here
	}

	/**
	 * Run the void addSubContainer(TableContainer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSubContainer_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		TableContainer subContainer = new TableContainer("", (CompositeDBObject<? extends DBObject>) null);

		fixture2.addSubContainer(subContainer);

		// add additional test code here
	}

	/**
	 * Run the void addSubContainer(TableContainer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddSubContainer_fixture_3()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		TableContainer subContainer = new TableContainer("0123456789", (CompositeDBObject<? extends DBObject>) null);

		fixture2.addSubContainer(subContainer);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable("");

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_3()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_4()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable();

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_5()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture2.addTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_6()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_7()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testAddTable_fixture_8()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture2.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the List<ContainerComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetComponents_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();

		List<ContainerComponent> result = fixture2.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;

		List<DBSequence> result = fixture2.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;

		List<DBSequence> result = fixture2.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_3()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_4()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_5()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_6()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_7()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_8()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_9()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_10()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_11()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_12()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_13()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_14()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_15()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_16()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_17()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_18()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_19()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_20()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_21()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		List<DBSequence> result = new ArrayList<DBSequence>();

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_22()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		List<DBSequence> result = new LinkedList<DBSequence>();

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_23()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		List<DBSequence> result = new Vector<DBSequence>();

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_24()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_25()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_26()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_27()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_28()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_29()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_30()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_31()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSequences_fixture_32()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture2.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the Collection<TableContainer> getSubContainers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetSubContainers_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();

		Collection<TableContainer> result = fixture2.getSubContainers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTable_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		String tableName = "";

		DBTable result = fixture2.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTable_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		String tableName = "0123456789";

		DBTable result = fixture2.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();

		List<DBTable> result = fixture2.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;

		List<DBTable> result = fixture2.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_3()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;

		List<DBTable> result = fixture2.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_4()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable(""));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_5()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable(""));
		result.add(new DefaultDBTable("", new DBSchema("")));
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DefaultDBTable());
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_6()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable("", new DBSchema("")));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_7()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_8()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable());

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_9()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_10()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_11()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_12()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_13()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable(""));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_14()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable(""));
		result.add(new DefaultDBTable("", new DBSchema("")));
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DefaultDBTable());
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_15()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable("", new DBSchema("")));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_16()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_17()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable());

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_18()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_19()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_20()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_21()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_22()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable(""));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_23()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable(""));
		result.add(new DefaultDBTable("", new DBSchema("")));
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DefaultDBTable());
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_24()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable("", new DBSchema("")));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_25()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_26()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable());

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_27()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_28()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_29()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_30()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_31()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		List<DBTable> result = new ArrayList<DBTable>();

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_32()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = false;
		List<DBTable> result = new LinkedList<DBTable>();

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testGetTables_fixture_33()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		boolean recursive = true;
		List<DBTable> result = new Vector<DBTable>();

		List<DBTable> result2 = fixture2.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_1()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable("");

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_2()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_3()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_4()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new DefaultDBTable();

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_5()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture2.removeTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_6()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_7()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testRemoveTable_fixture_8()
		throws Exception {
		TableContainerSupport fixture2 = getFixture();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture2.removeTable(table);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
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
	 * @generatedBy CodePro at 6/7/15 8:02 PM
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
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TableContainerSupportTest.class);
	}
}