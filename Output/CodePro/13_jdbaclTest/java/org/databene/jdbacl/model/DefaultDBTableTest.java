package org.databene.jdbacl.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.apache.derby.impl.jdbc.EmbedConnection;
import org.apache.derby.impl.jdbc.EmbedConnection30;
import org.apache.derby.impl.jdbc.EmbedConnection40;
import org.apache.derby.jdbc.Driver169;
import org.apache.derby.jdbc.Driver30;
import org.apache.derby.jdbc.Driver40;
import org.apache.derby.jdbc.InternalDriver;
import org.databene.commons.HeavyweightIterator;
import org.databene.commons.iterator.TableRowIterator;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBConnection;
import org.h2.engine.Session;
import org.h2.engine.SessionInterface;
import org.h2.engine.SessionRemote;
import org.h2.jdbc.JdbcConnection;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultDBTableTest</code> contains tests for the class <code>{@link DefaultDBTable}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultDBTableTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDBTable fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDBTable("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDBTable("");
			fixture2.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture2.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture2.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDBTable("");
			fixture3.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture3.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture3.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDBTable("");
			fixture4.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture4.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture4.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DefaultDBTable("");
			fixture5.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture5.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture5.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DefaultDBTable("");
			fixture6.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture6.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture6.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DefaultDBTable("");
			fixture7.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture7.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture7.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DefaultDBTable("");
			fixture8.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture8.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture8.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DefaultDBTable("");
			fixture9.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture9.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture9.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DefaultDBTable("");
			fixture10.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture10.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture10.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DefaultDBTable("", new DBSchema(""));
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DefaultDBTable("", new DBSchema(""));
			fixture12.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture12.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture12.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new DefaultDBTable("", new DBSchema(""));
			fixture13.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture13.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture13.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new DefaultDBTable("", new DBSchema(""));
			fixture14.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture14.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture14.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new DefaultDBTable("", new DBSchema(""));
			fixture15.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture15.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture15.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new DefaultDBTable("", new DBSchema(""));
			fixture16.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture16.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture16.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new DefaultDBTable("", new DBSchema(""));
			fixture17.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture17.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture17.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new DefaultDBTable("", new DBSchema(""));
			fixture18.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture18.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture18.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new DefaultDBTable("", new DBSchema(""));
			fixture19.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture19.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture19.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new DefaultDBTable("", new DBSchema(""));
			fixture20.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture20.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture20.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture22.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture22.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture22.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture23.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture23.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture23.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture24.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture24.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture24.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture25.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture25.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture25.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture26.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture26.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture26.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture27.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture27.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
			fixture27.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture28.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture28.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture28.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture29.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture29.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture29.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDBTable getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
			fixture30.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
			fixture30.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
			fixture30.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));
		}
		return fixture30;
	}

	/**
	 * Run the DefaultDBTable() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDBTable_1()
		throws Exception {

		DefaultDBTable result = new DefaultDBTable();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(0, result.countProviders());
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
	}

	/**
	 * Run the DefaultDBTable(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDBTable_2()
		throws Exception {
		String name = "";

		DefaultDBTable result = new DefaultDBTable(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(0, result.countProviders());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
	}

	/**
	 * Run the DefaultDBTable(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDBTable_3()
		throws Exception {
		String name = "0123456789";

		DefaultDBTable result = new DefaultDBTable(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(0, result.countProviders());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
	}

	/**
	 * Run the DefaultDBTable(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDBTable_4()
		throws Exception {
		String name = "1";

		DefaultDBTable result = new DefaultDBTable(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(0, result.countProviders());
		assertEquals("1", result.toString());
		assertEquals("1", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
	}

	/**
	 * Run the DefaultDBTable(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDBTable_5()
		throws Exception {
		String name = "";
		DBSchema schema = null;

		DefaultDBTable result = new DefaultDBTable(name, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(0, result.countProviders());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
	}

	/**
	 * Run the DefaultDBTable(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDBTable_6()
		throws Exception {
		String name = "0123456789";
		DBSchema schema = null;

		DefaultDBTable result = new DefaultDBTable(name, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(0, result.countProviders());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addForeignKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.addForeignKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.addForeignKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.addForeignKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBTable referrer = new DefaultDBTable("");

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBTable referrer = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBTable referrer = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBTable referrer = new DefaultDBTable();

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBTable referrer = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addReferrer(referrer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBTable referrer = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBTable referrer = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(referrer);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBUniqueConstraint uk = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBUniqueConstraint uk = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBUniqueConstraint uk = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBUniqueConstraint uk = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBUniqueConstraint uk = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBUniqueConstraint uk = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBUniqueConstraint uk = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBUniqueConstraint uk = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testAllRows_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		int result = fixture.countProviders();

		// add additional test code here
		assertEquals(2, result);
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
		DefaultDBTable fixture = getFixture1();
		Object other = "1";

		boolean result = fixture.equals(other);

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
		DefaultDBTable fixture = getFixture2();
		Object other = null;

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		Object other = new DefaultDBTable("");

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DefaultDBTable other = new DefaultDBTable("");
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		Object other = new DefaultDBTable("", new DBSchema(""));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DefaultDBTable other = new DefaultDBTable("", new DBSchema(""));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		Object other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"}));

		boolean result = fixture.equals(other);

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
	public void testEquals_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DefaultDBTable other = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		other.addForeignKey(new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}));
		other.addForeignKey(new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""}));
		other.setPrimaryKey(new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null}));

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_2()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_2()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_2()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture4_2()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture5_2()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture6_2()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture7_2()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture8_2()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture9_2()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture10_2()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture11_2()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture12_2()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture13_2()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture14_2()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture15_2()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture16_2()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture17_2()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture18_2()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture19_2()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture20_2()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture21_2()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture22_2()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture23_2()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture24_2()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture25_2()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture26_2()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture27_2()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture28_2()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture29_2()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture30_2()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String[] columnNames = new String[] {};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (, 0123456789, An��t-1.0.txt, )
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns ()
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("0123456789", result[0]);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		int index = 0;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		int index = 1;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.getProvider(DefaultDBTable.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:385)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:385)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		Connection connection = new FBConnection((FBManagedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		Connection connection = new JdbcConnection("", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		Connection connection = new JdbcConnection(new Session(), "", "");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:386)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getDoc());
		assertEquals("schema", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture1_2()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture2_2()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String[] columnNames = new String[] {""};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture3_2()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture4_2()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture5_2()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture6_2()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture7_2()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture8_2()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture9_2()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture10_2()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture11_2()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture12_2()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture13_2()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture14_2()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture15_2()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture16_2()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture17_2()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture18_2()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture19_2()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture20_2()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture21_2()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture22_2()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture23_2()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture24_2()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture25_2()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture26_2()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture27_2()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture28_2()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture29_2()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture30_2()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String[] columnNames = new String[] {"0123456789"};

		DBUniqueConstraint result = fixture.getUniqueConstraint(columnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("unique constraint", result.getObjectType());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
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
		DefaultDBTable fixture = getFixture1();

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
		DefaultDBTable fixture = getFixture2();

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
	public void testHashCode_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();

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
	public void testHashCode_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();

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
	public void testHashCode_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();

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
	public void testHashCode_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();

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
	public void testHashCode_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();

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
	public void testHashCode_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();

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
	public void testHashCode_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();

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
	public void testHashCode_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();

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
	public void testHashCode_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();

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
	public void testHashCode_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();

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
	public void testHashCode_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();

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
	public void testHashCode_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();

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
	public void testHashCode_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();

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
	public void testHashCode_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();

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
	public void testHashCode_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();

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
	public void testHashCode_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();

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
	public void testHashCode_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();

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
	public void testHashCode_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();

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
	public void testHashCode_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:329)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String query = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String query = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String query = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String query = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String query = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String query = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String query = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String query = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String query = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String query = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String query = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String query = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:329)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_2()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_2()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture4_2()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_2()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture7_2()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture8_2()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String query = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:301)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		Object pk = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		Object pk = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		Object pk = new Object();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		Object pk = null;
		Connection connection = new JdbcConnection("", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		Object pk = new Object();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		Object pk = null;
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		Object pk = new Object();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		Object pk = null;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		Object pk = new Object();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		Object pk = new Object();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.SQLUtil.renderWhereClause(SQLUtil.java:212)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:305)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_2()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:301)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_2()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture4_2()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture5_2()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture7_2()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture8_2()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		Object pk = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:304)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryByPK_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		Object pk = null;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		Connection connection = new FBConnection((FBManagedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		Connection connection = new JdbcConnection("", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		Connection connection = new JdbcConnection(new Session(), "", "");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String whereClause = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String whereClause = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String whereClause = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String whereClause = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String whereClause = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_2()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_2()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture4_2()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture5_2()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture7_2()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture8_2()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryRows_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at org.databene.jdbacl.SQLUtil.renderWhereClause(SQLUtil.java:212)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:315)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_2()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String[] columns = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at org.databene.jdbacl.SQLUtil.renderWhereClause(SQLUtil.java:212)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:315)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_2()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture4_2()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_2()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture7_2()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture9_2()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture11_2()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture12_2()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String[] columns = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:62)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryRowsByCellValues_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String[] columns = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.queryRowsByCellValues(columns, values, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeForeignKeyConstraint(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveForeignKeyConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBForeignKeyConstraint constraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.removeForeignKeyConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveIndex_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBIndex index = null;

		fixture.removeIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.removeIndex(DefaultDBTable.java:196)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveUniqueConstraint_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.removeUniqueConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		int index = 0;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		int index = 1;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 2
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at org.databene.commons.OrderedMap.elementAt(OrderedMap.java:163)
		//       at org.databene.commons.OrderedSet.get(OrderedSet.java:137)
		//       at org.databene.jdbacl.model.DefaultDBTable.requiresProvider(DefaultDBTable.java:344)
		assertTrue(result);
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		String doc = "";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBPrimaryKeyConstraint constraint = null;

		fixture.setPrimaryKey(constraint);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture1_1()
		throws Exception {
		DefaultDBTable fixture = getFixture1();
		DBSchema schema = new DBSchema("");

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture2_1()
		throws Exception {
		DefaultDBTable fixture = getFixture2();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture3_1()
		throws Exception {
		DefaultDBTable fixture = getFixture3();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture4_1()
		throws Exception {
		DefaultDBTable fixture = getFixture4();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture5_1()
		throws Exception {
		DefaultDBTable fixture = getFixture5();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture6_1()
		throws Exception {
		DefaultDBTable fixture = getFixture6();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture7_1()
		throws Exception {
		DefaultDBTable fixture = getFixture7();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture8_1()
		throws Exception {
		DefaultDBTable fixture = getFixture8();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture9_1()
		throws Exception {
		DefaultDBTable fixture = getFixture9();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture10_1()
		throws Exception {
		DefaultDBTable fixture = getFixture10();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture11_1()
		throws Exception {
		DefaultDBTable fixture = getFixture11();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture12_1()
		throws Exception {
		DefaultDBTable fixture = getFixture12();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture13_1()
		throws Exception {
		DefaultDBTable fixture = getFixture13();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture14_1()
		throws Exception {
		DefaultDBTable fixture = getFixture14();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture15_1()
		throws Exception {
		DefaultDBTable fixture = getFixture15();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture16_1()
		throws Exception {
		DefaultDBTable fixture = getFixture16();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture17_1()
		throws Exception {
		DefaultDBTable fixture = getFixture17();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture18_1()
		throws Exception {
		DefaultDBTable fixture = getFixture18();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture19_1()
		throws Exception {
		DefaultDBTable fixture = getFixture19();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture20_1()
		throws Exception {
		DefaultDBTable fixture = getFixture20();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture21_1()
		throws Exception {
		DefaultDBTable fixture = getFixture21();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture22_1()
		throws Exception {
		DefaultDBTable fixture = getFixture22();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture23_1()
		throws Exception {
		DefaultDBTable fixture = getFixture23();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture24_1()
		throws Exception {
		DefaultDBTable fixture = getFixture24();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture25_1()
		throws Exception {
		DefaultDBTable fixture = getFixture25();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture26_1()
		throws Exception {
		DefaultDBTable fixture = getFixture26();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture27_1()
		throws Exception {
		DefaultDBTable fixture = getFixture27();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture28_1()
		throws Exception {
		DefaultDBTable fixture = getFixture28();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture29_1()
		throws Exception {
		DefaultDBTable fixture = getFixture29();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSchema_fixture30_1()
		throws Exception {
		DefaultDBTable fixture = getFixture30();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		fixture.setSchema(schema);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DefaultDBTableTest.class);
	}
}