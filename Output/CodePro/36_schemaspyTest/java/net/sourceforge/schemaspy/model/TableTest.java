package net.sourceforge.schemaspy.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import net.sourceforge.schemaspy.model.xml.TableMeta;
import java.util.Map;
import java.util.Set;
import org.junit.*;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import static org.junit.Assert.*;

/**
 * The class <code>TableTest</code> contains tests for the class <code>{@link Table}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:25 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableTest {
	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_1()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_2()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = null;
		String schema = null;
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_3()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = null;
		String schema = null;
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_4()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = null;
		String schema = "1";
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_5()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_6()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_7()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_8()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_9()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = null;
		String schema = null;
		String name = "0123456789";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_10()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = null;
		String schema = "1";
		String name = "0123456789";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_11()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_12()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_13()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_14()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_15()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = null;
		String schema = null;
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_16()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = null;
		String schema = "1";
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_17()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_18()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_19()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_20()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_21()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_22()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = null;
		String schema = null;
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_23()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "1";
		String schema = null;
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_24()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "1";
		String schema = null;
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_25()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "1";
		String schema = null;
		String name = "";
		String comments = "";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_26()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "1";
		String schema = "1";
		String name = "0123456789";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_27()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "1";
		String schema = "1";
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_28()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = null;
		String schema = null;
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_29()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "1";
		String schema = null;
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Table(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testTable_30()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "1";
		String schema = null;
		String name = "";
		String comments = "0123456789";

		Table result = new Table(db, catalog, schema, name, comments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_1()
		throws Exception {
		String db = "";
		String catalog = "1";
		String schema = "1";
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_2()
		throws Exception {
		String db = "0123456789";
		String catalog = null;
		String schema = null;
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_3()
		throws Exception {
		String db = "0123456789";
		String catalog = null;
		String schema = null;
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_4()
		throws Exception {
		String db = "0123456789";
		String catalog = null;
		String schema = "1";
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_5()
		throws Exception {
		String db = "0123456789";
		String catalog = null;
		String schema = "1";
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_6()
		throws Exception {
		String db = "0123456789";
		String catalog = "1";
		String schema = null;
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_7()
		throws Exception {
		String db = "0123456789";
		String catalog = "1";
		String schema = null;
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_8()
		throws Exception {
		String db = "0123456789";
		String catalog = "1";
		String schema = "1";
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_9()
		throws Exception {
		String db = "0123456789";
		String catalog = "1";
		String schema = "1";
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_10()
		throws Exception {
		String db = "";
		String catalog = null;
		String schema = null;
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_11()
		throws Exception {
		String db = "";
		String catalog = null;
		String schema = null;
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_12()
		throws Exception {
		String db = "";
		String catalog = null;
		String schema = "1";
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_13()
		throws Exception {
		String db = "";
		String catalog = null;
		String schema = "1";
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_14()
		throws Exception {
		String db = "";
		String catalog = "1";
		String schema = null;
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_15()
		throws Exception {
		String db = "";
		String catalog = "1";
		String schema = null;
		String table = "";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFullName(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	@Test
	public void testGetFullName_16()
		throws Exception {
		String db = "";
		String catalog = "1";
		String schema = "1";
		String table = "0123456789";

		String result = Table.getFullName(db, catalog, schema, table);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:25 PM
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
	 * @generatedBy CodePro at 6/7/15 4:25 PM
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
	 * @generatedBy CodePro at 6/7/15 4:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TableTest.class);
	}
}