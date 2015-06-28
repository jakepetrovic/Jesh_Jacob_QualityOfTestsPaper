package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBTriggerTest</code> contains tests for the class <code>{@link DBTrigger}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBTriggerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTrigger fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBTrigger("", new DBSchema(""));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBTrigger("", new DBSchema(""));
			fixture2.setActionType("");
			fixture2.setBaseObjectType("");
			fixture2.setColumnName("");
			fixture2.setDescription("");
			fixture2.setReferencingNames("");
			fixture2.setStatus("");
			fixture2.setTableName("");
			fixture2.setTableOwner("");
			fixture2.setTriggerBody("");
			fixture2.setTriggerType("");
			fixture2.setTriggeringEvent("");
			fixture2.setWhenClause("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBTrigger("", new DBSchema(""));
			fixture3.setActionType("0123456789");
			fixture3.setBaseObjectType("0123456789");
			fixture3.setColumnName("");
			fixture3.setDescription("");
			fixture3.setReferencingNames("0123456789");
			fixture3.setStatus("");
			fixture3.setTableName("");
			fixture3.setTableOwner("0123456789");
			fixture3.setTriggerBody("0123456789");
			fixture3.setTriggerType("0123456789");
			fixture3.setTriggeringEvent("0123456789");
			fixture3.setWhenClause("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DBTrigger("", new DBSchema(""));
			fixture4.setActionType("0123456789");
			fixture4.setBaseObjectType("0123456789");
			fixture4.setColumnName("");
			fixture4.setDescription("");
			fixture4.setReferencingNames("0123456789");
			fixture4.setStatus("");
			fixture4.setTableName("0123456789");
			fixture4.setTableOwner("0123456789");
			fixture4.setTriggerBody("0123456789");
			fixture4.setTriggerType("0123456789");
			fixture4.setTriggeringEvent("0123456789");
			fixture4.setWhenClause("0123456789");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DBTrigger("", new DBSchema(""));
			fixture5.setActionType("0123456789");
			fixture5.setBaseObjectType("0123456789");
			fixture5.setColumnName("");
			fixture5.setDescription("");
			fixture5.setReferencingNames("0123456789");
			fixture5.setStatus("0123456789");
			fixture5.setTableName("");
			fixture5.setTableOwner("0123456789");
			fixture5.setTriggerBody("");
			fixture5.setTriggerType("0123456789");
			fixture5.setTriggeringEvent("0123456789");
			fixture5.setWhenClause("0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DBTrigger("", new DBSchema(""));
			fixture6.setActionType("0123456789");
			fixture6.setBaseObjectType("0123456789");
			fixture6.setColumnName("");
			fixture6.setDescription("");
			fixture6.setReferencingNames("0123456789");
			fixture6.setStatus("0123456789");
			fixture6.setTableName("");
			fixture6.setTableOwner("0123456789");
			fixture6.setTriggerBody("0123456789");
			fixture6.setTriggerType("0123456789");
			fixture6.setTriggeringEvent("0123456789");
			fixture6.setWhenClause("0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DBTrigger("", new DBSchema(""));
			fixture7.setActionType("0123456789");
			fixture7.setBaseObjectType("0123456789");
			fixture7.setColumnName("");
			fixture7.setDescription("");
			fixture7.setReferencingNames("0123456789");
			fixture7.setStatus("0123456789");
			fixture7.setTableName("0123456789");
			fixture7.setTableOwner("0123456789");
			fixture7.setTriggerBody("");
			fixture7.setTriggerType("0123456789");
			fixture7.setTriggeringEvent("0123456789");
			fixture7.setWhenClause("0123456789");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DBTrigger("", new DBSchema(""));
			fixture8.setActionType("0123456789");
			fixture8.setBaseObjectType("0123456789");
			fixture8.setColumnName("");
			fixture8.setDescription("");
			fixture8.setReferencingNames("0123456789");
			fixture8.setStatus("0123456789");
			fixture8.setTableName("0123456789");
			fixture8.setTableOwner("0123456789");
			fixture8.setTriggerBody("0123456789");
			fixture8.setTriggerType("0123456789");
			fixture8.setTriggeringEvent("0123456789");
			fixture8.setWhenClause("0123456789");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DBTrigger("", new DBSchema(""));
			fixture9.setActionType("0123456789");
			fixture9.setBaseObjectType("0123456789");
			fixture9.setColumnName("");
			fixture9.setDescription("0123456789");
			fixture9.setReferencingNames("0123456789");
			fixture9.setStatus("");
			fixture9.setTableName("");
			fixture9.setTableOwner("0123456789");
			fixture9.setTriggerBody("0123456789");
			fixture9.setTriggerType("0123456789");
			fixture9.setTriggeringEvent("0123456789");
			fixture9.setWhenClause("0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DBTrigger("", new DBSchema(""));
			fixture10.setActionType("0123456789");
			fixture10.setBaseObjectType("0123456789");
			fixture10.setColumnName("");
			fixture10.setDescription("0123456789");
			fixture10.setReferencingNames("0123456789");
			fixture10.setStatus("");
			fixture10.setTableName("0123456789");
			fixture10.setTableOwner("0123456789");
			fixture10.setTriggerBody("0123456789");
			fixture10.setTriggerType("0123456789");
			fixture10.setTriggeringEvent("0123456789");
			fixture10.setWhenClause("0123456789");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DBTrigger("", new DBSchema(""));
			fixture11.setActionType("0123456789");
			fixture11.setBaseObjectType("0123456789");
			fixture11.setColumnName("");
			fixture11.setDescription("0123456789");
			fixture11.setReferencingNames("0123456789");
			fixture11.setStatus("0123456789");
			fixture11.setTableName("");
			fixture11.setTableOwner("0123456789");
			fixture11.setTriggerBody("");
			fixture11.setTriggerType("0123456789");
			fixture11.setTriggeringEvent("0123456789");
			fixture11.setWhenClause("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DBTrigger("", new DBSchema(""));
			fixture12.setActionType("0123456789");
			fixture12.setBaseObjectType("0123456789");
			fixture12.setColumnName("");
			fixture12.setDescription("0123456789");
			fixture12.setReferencingNames("0123456789");
			fixture12.setStatus("0123456789");
			fixture12.setTableName("");
			fixture12.setTableOwner("0123456789");
			fixture12.setTriggerBody("0123456789");
			fixture12.setTriggerType("0123456789");
			fixture12.setTriggeringEvent("0123456789");
			fixture12.setWhenClause("0123456789");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new DBTrigger("", new DBSchema(""));
			fixture13.setActionType("0123456789");
			fixture13.setBaseObjectType("0123456789");
			fixture13.setColumnName("");
			fixture13.setDescription("0123456789");
			fixture13.setReferencingNames("0123456789");
			fixture13.setStatus("0123456789");
			fixture13.setTableName("0123456789");
			fixture13.setTableOwner("0123456789");
			fixture13.setTriggerBody("");
			fixture13.setTriggerType("0123456789");
			fixture13.setTriggeringEvent("0123456789");
			fixture13.setWhenClause("0123456789");
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new DBTrigger("", new DBSchema(""));
			fixture14.setActionType("0123456789");
			fixture14.setBaseObjectType("0123456789");
			fixture14.setColumnName("");
			fixture14.setDescription("0123456789");
			fixture14.setReferencingNames("0123456789");
			fixture14.setStatus("0123456789");
			fixture14.setTableName("0123456789");
			fixture14.setTableOwner("0123456789");
			fixture14.setTriggerBody("0123456789");
			fixture14.setTriggerType("0123456789");
			fixture14.setTriggeringEvent("0123456789");
			fixture14.setWhenClause("0123456789");
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new DBTrigger("", new DBSchema(""));
			fixture15.setActionType("0123456789");
			fixture15.setBaseObjectType("0123456789");
			fixture15.setColumnName("0123456789");
			fixture15.setDescription("");
			fixture15.setReferencingNames("0123456789");
			fixture15.setStatus("");
			fixture15.setTableName("");
			fixture15.setTableOwner("0123456789");
			fixture15.setTriggerBody("");
			fixture15.setTriggerType("0123456789");
			fixture15.setTriggeringEvent("0123456789");
			fixture15.setWhenClause("0123456789");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new DBTrigger("", new DBSchema(""));
			fixture16.setActionType("0123456789");
			fixture16.setBaseObjectType("0123456789");
			fixture16.setColumnName("0123456789");
			fixture16.setDescription("");
			fixture16.setReferencingNames("0123456789");
			fixture16.setStatus("");
			fixture16.setTableName("");
			fixture16.setTableOwner("0123456789");
			fixture16.setTriggerBody("0123456789");
			fixture16.setTriggerType("0123456789");
			fixture16.setTriggeringEvent("0123456789");
			fixture16.setWhenClause("0123456789");
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new DBTrigger("", new DBSchema(""));
			fixture17.setActionType("0123456789");
			fixture17.setBaseObjectType("0123456789");
			fixture17.setColumnName("0123456789");
			fixture17.setDescription("");
			fixture17.setReferencingNames("0123456789");
			fixture17.setStatus("");
			fixture17.setTableName("0123456789");
			fixture17.setTableOwner("0123456789");
			fixture17.setTriggerBody("");
			fixture17.setTriggerType("0123456789");
			fixture17.setTriggeringEvent("0123456789");
			fixture17.setWhenClause("0123456789");
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new DBTrigger("", new DBSchema(""));
			fixture18.setActionType("0123456789");
			fixture18.setBaseObjectType("0123456789");
			fixture18.setColumnName("0123456789");
			fixture18.setDescription("");
			fixture18.setReferencingNames("0123456789");
			fixture18.setStatus("");
			fixture18.setTableName("0123456789");
			fixture18.setTableOwner("0123456789");
			fixture18.setTriggerBody("0123456789");
			fixture18.setTriggerType("0123456789");
			fixture18.setTriggeringEvent("0123456789");
			fixture18.setWhenClause("0123456789");
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new DBTrigger("", new DBSchema(""));
			fixture19.setActionType("0123456789");
			fixture19.setBaseObjectType("0123456789");
			fixture19.setColumnName("0123456789");
			fixture19.setDescription("");
			fixture19.setReferencingNames("0123456789");
			fixture19.setStatus("0123456789");
			fixture19.setTableName("");
			fixture19.setTableOwner("0123456789");
			fixture19.setTriggerBody("");
			fixture19.setTriggerType("0123456789");
			fixture19.setTriggeringEvent("0123456789");
			fixture19.setWhenClause("0123456789");
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new DBTrigger("", new DBSchema(""));
			fixture20.setActionType("0123456789");
			fixture20.setBaseObjectType("0123456789");
			fixture20.setColumnName("0123456789");
			fixture20.setDescription("");
			fixture20.setReferencingNames("0123456789");
			fixture20.setStatus("0123456789");
			fixture20.setTableName("");
			fixture20.setTableOwner("0123456789");
			fixture20.setTriggerBody("0123456789");
			fixture20.setTriggerType("0123456789");
			fixture20.setTriggeringEvent("0123456789");
			fixture20.setWhenClause("0123456789");
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new DBTrigger("", new DBSchema(""));
			fixture21.setActionType("0123456789");
			fixture21.setBaseObjectType("0123456789");
			fixture21.setColumnName("0123456789");
			fixture21.setDescription("");
			fixture21.setReferencingNames("0123456789");
			fixture21.setStatus("0123456789");
			fixture21.setTableName("0123456789");
			fixture21.setTableOwner("0123456789");
			fixture21.setTriggerBody("");
			fixture21.setTriggerType("0123456789");
			fixture21.setTriggeringEvent("0123456789");
			fixture21.setWhenClause("0123456789");
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new DBTrigger("", new DBSchema(""));
			fixture22.setActionType("0123456789");
			fixture22.setBaseObjectType("0123456789");
			fixture22.setColumnName("0123456789");
			fixture22.setDescription("");
			fixture22.setReferencingNames("0123456789");
			fixture22.setStatus("0123456789");
			fixture22.setTableName("0123456789");
			fixture22.setTableOwner("0123456789");
			fixture22.setTriggerBody("0123456789");
			fixture22.setTriggerType("0123456789");
			fixture22.setTriggeringEvent("0123456789");
			fixture22.setWhenClause("0123456789");
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new DBTrigger("", new DBSchema(""));
			fixture23.setActionType("0123456789");
			fixture23.setBaseObjectType("0123456789");
			fixture23.setColumnName("0123456789");
			fixture23.setDescription("0123456789");
			fixture23.setReferencingNames("0123456789");
			fixture23.setStatus("");
			fixture23.setTableName("");
			fixture23.setTableOwner("0123456789");
			fixture23.setTriggerBody("");
			fixture23.setTriggerType("0123456789");
			fixture23.setTriggeringEvent("0123456789");
			fixture23.setWhenClause("0123456789");
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new DBTrigger("", new DBSchema(""));
			fixture24.setActionType("0123456789");
			fixture24.setBaseObjectType("0123456789");
			fixture24.setColumnName("0123456789");
			fixture24.setDescription("0123456789");
			fixture24.setReferencingNames("0123456789");
			fixture24.setStatus("");
			fixture24.setTableName("");
			fixture24.setTableOwner("0123456789");
			fixture24.setTriggerBody("0123456789");
			fixture24.setTriggerType("0123456789");
			fixture24.setTriggeringEvent("0123456789");
			fixture24.setWhenClause("0123456789");
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new DBTrigger("", new DBSchema(""));
			fixture25.setActionType("0123456789");
			fixture25.setBaseObjectType("0123456789");
			fixture25.setColumnName("0123456789");
			fixture25.setDescription("0123456789");
			fixture25.setReferencingNames("0123456789");
			fixture25.setStatus("");
			fixture25.setTableName("0123456789");
			fixture25.setTableOwner("0123456789");
			fixture25.setTriggerBody("");
			fixture25.setTriggerType("0123456789");
			fixture25.setTriggeringEvent("0123456789");
			fixture25.setWhenClause("0123456789");
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new DBTrigger("", new DBSchema(""));
			fixture26.setActionType("0123456789");
			fixture26.setBaseObjectType("0123456789");
			fixture26.setColumnName("0123456789");
			fixture26.setDescription("0123456789");
			fixture26.setReferencingNames("0123456789");
			fixture26.setStatus("");
			fixture26.setTableName("0123456789");
			fixture26.setTableOwner("0123456789");
			fixture26.setTriggerBody("0123456789");
			fixture26.setTriggerType("0123456789");
			fixture26.setTriggeringEvent("0123456789");
			fixture26.setWhenClause("0123456789");
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new DBTrigger("", new DBSchema(""));
			fixture27.setActionType("0123456789");
			fixture27.setBaseObjectType("0123456789");
			fixture27.setColumnName("0123456789");
			fixture27.setDescription("0123456789");
			fixture27.setReferencingNames("0123456789");
			fixture27.setStatus("0123456789");
			fixture27.setTableName("");
			fixture27.setTableOwner("0123456789");
			fixture27.setTriggerBody("");
			fixture27.setTriggerType("0123456789");
			fixture27.setTriggeringEvent("0123456789");
			fixture27.setWhenClause("0123456789");
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new DBTrigger("", new DBSchema(""));
			fixture28.setActionType("0123456789");
			fixture28.setBaseObjectType("0123456789");
			fixture28.setColumnName("0123456789");
			fixture28.setDescription("0123456789");
			fixture28.setReferencingNames("0123456789");
			fixture28.setStatus("0123456789");
			fixture28.setTableName("");
			fixture28.setTableOwner("0123456789");
			fixture28.setTriggerBody("0123456789");
			fixture28.setTriggerType("0123456789");
			fixture28.setTriggeringEvent("0123456789");
			fixture28.setWhenClause("0123456789");
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new DBTrigger("", new DBSchema(""));
			fixture29.setActionType("0123456789");
			fixture29.setBaseObjectType("0123456789");
			fixture29.setColumnName("0123456789");
			fixture29.setDescription("0123456789");
			fixture29.setReferencingNames("0123456789");
			fixture29.setStatus("0123456789");
			fixture29.setTableName("0123456789");
			fixture29.setTableOwner("0123456789");
			fixture29.setTriggerBody("");
			fixture29.setTriggerType("0123456789");
			fixture29.setTriggeringEvent("0123456789");
			fixture29.setWhenClause("0123456789");
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTrigger
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTrigger getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new DBTrigger("", new DBSchema(""));
			fixture30.setActionType("0123456789");
			fixture30.setBaseObjectType("0123456789");
			fixture30.setColumnName("0123456789");
			fixture30.setDescription("0123456789");
			fixture30.setReferencingNames("0123456789");
			fixture30.setStatus("0123456789");
			fixture30.setTableName("0123456789");
			fixture30.setTableOwner("0123456789");
			fixture30.setTriggerBody("0123456789");
			fixture30.setTriggerType("0123456789");
			fixture30.setTriggeringEvent("0123456789");
			fixture30.setWhenClause("0123456789");
		}
		return fixture30;
	}

	/**
	 * Run the DBTrigger(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBTrigger_1()
		throws Exception {
		String name = "";
		DBSchema owner = new DBSchema("");

		DBTrigger result = new DBTrigger(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getColumnName());
		assertEquals(null, result.getTableName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getActionType());
		assertEquals(null, result.getTableOwner());
		assertEquals(null, result.getTriggerBody());
		assertEquals(null, result.getTriggeringEvent());
		assertEquals(null, result.getReferencingNames());
		assertEquals(null, result.getWhenClause());
		assertEquals(null, result.getBaseObjectType());
		assertEquals(null, result.getTriggerType());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("trigger", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBTrigger(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBTrigger_2()
		throws Exception {
		String name = "0123456789";
		DBSchema owner = new DBSchema("", new DBCatalog(""));

		DBTrigger result = new DBTrigger(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getColumnName());
		assertEquals(null, result.getTableName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getActionType());
		assertEquals(null, result.getTableOwner());
		assertEquals(null, result.getTriggerBody());
		assertEquals(null, result.getTriggeringEvent());
		assertEquals(null, result.getReferencingNames());
		assertEquals(null, result.getWhenClause());
		assertEquals(null, result.getBaseObjectType());
		assertEquals(null, result.getTriggerType());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("trigger", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBTrigger(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBTrigger_3()
		throws Exception {
		String name = "";
		DBSchema owner = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		DBTrigger result = new DBTrigger(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getColumnName());
		assertEquals(null, result.getTableName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getActionType());
		assertEquals(null, result.getTableOwner());
		assertEquals(null, result.getTriggerBody());
		assertEquals(null, result.getTriggeringEvent());
		assertEquals(null, result.getReferencingNames());
		assertEquals(null, result.getWhenClause());
		assertEquals(null, result.getBaseObjectType());
		assertEquals(null, result.getTriggerType());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("trigger", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBTrigger(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBTrigger_4()
		throws Exception {
		String name = "";
		DBSchema owner = new DBSchema("", new DBCatalog(""));

		DBTrigger result = new DBTrigger(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getColumnName());
		assertEquals(null, result.getTableName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getActionType());
		assertEquals(null, result.getTableOwner());
		assertEquals(null, result.getTriggerBody());
		assertEquals(null, result.getTriggeringEvent());
		assertEquals(null, result.getReferencingNames());
		assertEquals(null, result.getWhenClause());
		assertEquals(null, result.getBaseObjectType());
		assertEquals(null, result.getTriggerType());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("trigger", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBTrigger(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBTrigger_5()
		throws Exception {
		String name = "0123456789";
		DBSchema owner = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		DBTrigger result = new DBTrigger(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getColumnName());
		assertEquals(null, result.getTableName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getActionType());
		assertEquals(null, result.getTableOwner());
		assertEquals(null, result.getTriggerBody());
		assertEquals(null, result.getTriggeringEvent());
		assertEquals(null, result.getReferencingNames());
		assertEquals(null, result.getWhenClause());
		assertEquals(null, result.getBaseObjectType());
		assertEquals(null, result.getTriggerType());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("trigger", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBTrigger(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBTrigger_6()
		throws Exception {
		String name = "0123456789";
		DBSchema owner = new DBSchema("");

		DBTrigger result = new DBTrigger(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getColumnName());
		assertEquals(null, result.getTableName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getActionType());
		assertEquals(null, result.getTableOwner());
		assertEquals(null, result.getTriggerBody());
		assertEquals(null, result.getTriggeringEvent());
		assertEquals(null, result.getReferencingNames());
		assertEquals(null, result.getWhenClause());
		assertEquals(null, result.getBaseObjectType());
		assertEquals(null, result.getTriggerType());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("trigger", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getActionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetActionType_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getActionType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getBaseObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetBaseObjectType_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getBaseObjectType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getColumnName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnName_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getColumnName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDescription_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getReferencingNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferencingNames_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getReferencingNames();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStatus_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableName_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableOwner_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getTableOwner();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerBody_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getTriggerBody();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggerType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggerType_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getTriggerType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTriggeringEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggeringEvent_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getTriggeringEvent();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getWhenClause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetWhenClause_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();

		String result = fixture.getWhenClause();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		DBObject object = new DBCatalog("");

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		DBObject object = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		DBObject object = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		DBObject object = new DBCatalog();

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		DBObject object = new DBPackage("", new DBSchema(""));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		DBObject object = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		DBObject object = new DBProcedure("", new DBPackage("", new DBSchema("")));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		DBObject object = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		DBObject object = new DBSchema("");

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		DBObject object = new DBSchema("", new DBCatalog(""));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		DBObject object = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		DBObject object = new DBSequence("", "", "");

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		DBObject object = new DBSequence("", new DBSchema(""));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		DBObject object = new DBSequence("0123456789", "0123456789", "0123456789");

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		DBObject object = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		DBObject object = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		DBObject object = new DBTrigger("", new DBSchema(""));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		DBObject object = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		DBObject object = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		DBObject object = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		DBObject object = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		DBObject object = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		DBObject object = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		DBObject object = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		DBObject object = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		DBObject object = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		DBObject object = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		DBObject object = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		DBObject object = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		DBObject object = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		boolean result = fixture.isIdentical(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertTrue(result);
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String actionType = "";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setActionType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetActionType_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String actionType = "0123456789";

		fixture.setActionType(actionType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String baseObjectType = "";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setBaseObjectType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetBaseObjectType_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String baseObjectType = "0123456789";

		fixture.setBaseObjectType(baseObjectType);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String columnName = "";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setColumnName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetColumnName_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String columnName = "0123456789";

		fixture.setColumnName(columnName);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDescription_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String description = "0123456789";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String referencingNames = "";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setReferencingNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetReferencingNames_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String referencingNames = "0123456789";

		fixture.setReferencingNames(referencingNames);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String status = "";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStatus_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String status = "0123456789";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String tableName = "";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableName_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String tableName = "0123456789";

		fixture.setTableName(tableName);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String tableOwner = "";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTableOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableOwner_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String tableOwner = "0123456789";

		fixture.setTableOwner(tableOwner);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String triggerBody = "";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerBody_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String triggerBody = "0123456789";

		fixture.setTriggerBody(triggerBody);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String triggerType = "";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggerType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggerType_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String triggerType = "0123456789";

		fixture.setTriggerType(triggerType);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String triggeringEvent = "";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setTriggeringEvent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTriggeringEvent_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String triggeringEvent = "0123456789";

		fixture.setTriggeringEvent(triggeringEvent);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture1_1()
		throws Exception {
		DBTrigger fixture = getFixture1();
		String whenClause = "";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture2_1()
		throws Exception {
		DBTrigger fixture = getFixture2();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture3_1()
		throws Exception {
		DBTrigger fixture = getFixture3();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture4_1()
		throws Exception {
		DBTrigger fixture = getFixture4();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture5_1()
		throws Exception {
		DBTrigger fixture = getFixture5();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture6_1()
		throws Exception {
		DBTrigger fixture = getFixture6();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture7_1()
		throws Exception {
		DBTrigger fixture = getFixture7();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture8_1()
		throws Exception {
		DBTrigger fixture = getFixture8();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture9_1()
		throws Exception {
		DBTrigger fixture = getFixture9();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture10_1()
		throws Exception {
		DBTrigger fixture = getFixture10();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture11_1()
		throws Exception {
		DBTrigger fixture = getFixture11();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture12_1()
		throws Exception {
		DBTrigger fixture = getFixture12();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture13_1()
		throws Exception {
		DBTrigger fixture = getFixture13();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture14_1()
		throws Exception {
		DBTrigger fixture = getFixture14();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture15_1()
		throws Exception {
		DBTrigger fixture = getFixture15();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture16_1()
		throws Exception {
		DBTrigger fixture = getFixture16();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture17_1()
		throws Exception {
		DBTrigger fixture = getFixture17();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture18_1()
		throws Exception {
		DBTrigger fixture = getFixture18();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture19_1()
		throws Exception {
		DBTrigger fixture = getFixture19();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture20_1()
		throws Exception {
		DBTrigger fixture = getFixture20();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture21_1()
		throws Exception {
		DBTrigger fixture = getFixture21();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture22_1()
		throws Exception {
		DBTrigger fixture = getFixture22();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture23_1()
		throws Exception {
		DBTrigger fixture = getFixture23();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture24_1()
		throws Exception {
		DBTrigger fixture = getFixture24();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture25_1()
		throws Exception {
		DBTrigger fixture = getFixture25();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture26_1()
		throws Exception {
		DBTrigger fixture = getFixture26();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture27_1()
		throws Exception {
		DBTrigger fixture = getFixture27();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture28_1()
		throws Exception {
		DBTrigger fixture = getFixture28();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture29_1()
		throws Exception {
		DBTrigger fixture = getFixture29();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

		// add additional test code here
	}

	/**
	 * Run the void setWhenClause(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetWhenClause_fixture30_1()
		throws Exception {
		DBTrigger fixture = getFixture30();
		String whenClause = "0123456789";

		fixture.setWhenClause(whenClause);

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
		new org.junit.runner.JUnitCore().run(DBTriggerTest.class);
	}
}