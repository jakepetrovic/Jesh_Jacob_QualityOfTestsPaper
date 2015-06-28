package org.databene.jdbacl.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultDatabaseTest</code> contains tests for the class <code>{@link DefaultDatabase}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultDatabaseTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DefaultDatabase fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture2.setImportDate(new Date(1591115236000L));
			fixture2.setImportedChecks(false);
			fixture2.setImportedIndexes(false);
			fixture2.setImportedSequences(false);
			fixture2.setImportedUKs(false);
			fixture2.setTableExclusionPattern("");
			fixture2.setTableInclusionPattern("");
			fixture2.setUser("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture3.setImportDate(new Date(1591115236000L));
			fixture3.setImportedChecks(false);
			fixture3.setImportedIndexes(false);
			fixture3.setImportedSequences(false);
			fixture3.setImportedUKs(false);
			fixture3.setTableExclusionPattern("An��t-1.0.txt");
			fixture3.setTableInclusionPattern("");
			fixture3.setUser("An��t-1.0.txt");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture4.setImportDate(new Date(1591115236000L));
			fixture4.setImportedChecks(false);
			fixture4.setImportedIndexes(false);
			fixture4.setImportedSequences(true);
			fixture4.setImportedUKs(false);
			fixture4.setTableExclusionPattern("");
			fixture4.setTableInclusionPattern("0123456789");
			fixture4.setUser("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture5.setImportDate(new Date(1591115236000L));
			fixture5.setImportedChecks(false);
			fixture5.setImportedIndexes(true);
			fixture5.setImportedSequences(false);
			fixture5.setImportedUKs(true);
			fixture5.setTableExclusionPattern("0123456789");
			fixture5.setTableInclusionPattern("An��t-1.0.txt");
			fixture5.setUser("An��t-1.0.txt");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture6.setImportDate(new Date(1591115236000L));
			fixture6.setImportedChecks(false);
			fixture6.setImportedIndexes(true);
			fixture6.setImportedSequences(true);
			fixture6.setImportedUKs(false);
			fixture6.setTableExclusionPattern("An��t-1.0.txt");
			fixture6.setTableInclusionPattern("An��t-1.0.txt");
			fixture6.setUser("");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture7.setImportDate(new Date(1591115236000L));
			fixture7.setImportedChecks(false);
			fixture7.setImportedIndexes(true);
			fixture7.setImportedSequences(true);
			fixture7.setImportedUKs(true);
			fixture7.setTableExclusionPattern("");
			fixture7.setTableInclusionPattern("");
			fixture7.setUser("An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture8.setImportDate(new Date(1591115236000L));
			fixture8.setImportedChecks(true);
			fixture8.setImportedIndexes(false);
			fixture8.setImportedSequences(false);
			fixture8.setImportedUKs(true);
			fixture8.setTableExclusionPattern("0123456789");
			fixture8.setTableInclusionPattern("");
			fixture8.setUser("0123456789");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture9.setImportDate(new Date(1591115236000L));
			fixture9.setImportedChecks(true);
			fixture9.setImportedIndexes(false);
			fixture9.setImportedSequences(true);
			fixture9.setImportedUKs(false);
			fixture9.setTableExclusionPattern("An��t-1.0.txt");
			fixture9.setTableInclusionPattern("0123456789");
			fixture9.setUser("0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture10.setImportDate(new Date(1591115236000L));
			fixture10.setImportedChecks(true);
			fixture10.setImportedIndexes(true);
			fixture10.setImportedSequences(false);
			fixture10.setImportedUKs(false);
			fixture10.setTableExclusionPattern("");
			fixture10.setTableInclusionPattern("An��t-1.0.txt");
			fixture10.setUser("0123456789");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture11.setImportDate(new Date(1591115236000L));
			fixture11.setImportedChecks(true);
			fixture11.setImportedIndexes(true);
			fixture11.setImportedSequences(true);
			fixture11.setImportedUKs(true);
			fixture11.setTableExclusionPattern("An��t-1.0.txt");
			fixture11.setTableInclusionPattern("");
			fixture11.setUser("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture12.setImportDate(new Date(644344036000L));
			fixture12.setImportedChecks(false);
			fixture12.setImportedIndexes(false);
			fixture12.setImportedSequences(false);
			fixture12.setImportedUKs(false);
			fixture12.setTableExclusionPattern("0123456789");
			fixture12.setTableInclusionPattern("");
			fixture12.setUser("");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture13.setImportDate(new Date(644344036000L));
			fixture13.setImportedChecks(false);
			fixture13.setImportedIndexes(false);
			fixture13.setImportedSequences(true);
			fixture13.setImportedUKs(true);
			fixture13.setTableExclusionPattern("An��t-1.0.txt");
			fixture13.setTableInclusionPattern("0123456789");
			fixture13.setUser("");
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture14.setImportDate(new Date(644344036000L));
			fixture14.setImportedChecks(false);
			fixture14.setImportedIndexes(true);
			fixture14.setImportedSequences(false);
			fixture14.setImportedUKs(true);
			fixture14.setTableExclusionPattern("");
			fixture14.setTableInclusionPattern("An��t-1.0.txt");
			fixture14.setUser("");
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture15.setImportDate(new Date(644344036000L));
			fixture15.setImportedChecks(false);
			fixture15.setImportedIndexes(true);
			fixture15.setImportedSequences(true);
			fixture15.setImportedUKs(false);
			fixture15.setTableExclusionPattern("An��t-1.0.txt");
			fixture15.setTableInclusionPattern("");
			fixture15.setUser("");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture16.setImportDate(new Date(644344036000L));
			fixture16.setImportedChecks(false);
			fixture16.setImportedIndexes(true);
			fixture16.setImportedSequences(true);
			fixture16.setImportedUKs(true);
			fixture16.setTableExclusionPattern("0123456789");
			fixture16.setTableInclusionPattern("");
			fixture16.setUser("An��t-1.0.txt");
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture17.setImportDate(new Date(644344036000L));
			fixture17.setImportedChecks(true);
			fixture17.setImportedIndexes(false);
			fixture17.setImportedSequences(false);
			fixture17.setImportedUKs(true);
			fixture17.setTableExclusionPattern("");
			fixture17.setTableInclusionPattern("0123456789");
			fixture17.setUser("0123456789");
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture18.setImportDate(new Date(644344036000L));
			fixture18.setImportedChecks(true);
			fixture18.setImportedIndexes(false);
			fixture18.setImportedSequences(true);
			fixture18.setImportedUKs(false);
			fixture18.setTableExclusionPattern("0123456789");
			fixture18.setTableInclusionPattern("An��t-1.0.txt");
			fixture18.setUser("0123456789");
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture19.setImportDate(new Date(644344036000L));
			fixture19.setImportedChecks(true);
			fixture19.setImportedIndexes(true);
			fixture19.setImportedSequences(false);
			fixture19.setImportedUKs(false);
			fixture19.setTableExclusionPattern("");
			fixture19.setTableInclusionPattern("");
			fixture19.setUser("0123456789");
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture20.setImportDate(new Date(644344036000L));
			fixture20.setImportedChecks(true);
			fixture20.setImportedIndexes(true);
			fixture20.setImportedSequences(true);
			fixture20.setImportedUKs(true);
			fixture20.setTableExclusionPattern("0123456789");
			fixture20.setTableInclusionPattern("0123456789");
			fixture20.setUser("0123456789");
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture21.setImportDate(new Date(946713599000L));
			fixture21.setImportedChecks(false);
			fixture21.setImportedIndexes(false);
			fixture21.setImportedSequences(false);
			fixture21.setImportedUKs(false);
			fixture21.setTableExclusionPattern("");
			fixture21.setTableInclusionPattern("0123456789");
			fixture21.setUser("");
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture22.setImportDate(new Date(946713599000L));
			fixture22.setImportedChecks(false);
			fixture22.setImportedIndexes(false);
			fixture22.setImportedSequences(false);
			fixture22.setImportedUKs(false);
			fixture22.setTableExclusionPattern("An��t-1.0.txt");
			fixture22.setTableInclusionPattern("0123456789");
			fixture22.setUser("An��t-1.0.txt");
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture23.setImportDate(new Date(946713599000L));
			fixture23.setImportedChecks(false);
			fixture23.setImportedIndexes(false);
			fixture23.setImportedSequences(true);
			fixture23.setImportedUKs(false);
			fixture23.setTableExclusionPattern("");
			fixture23.setTableInclusionPattern("An��t-1.0.txt");
			fixture23.setUser("An��t-1.0.txt");
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture24.setImportDate(new Date(946713599000L));
			fixture24.setImportedChecks(false);
			fixture24.setImportedIndexes(false);
			fixture24.setImportedSequences(true);
			fixture24.setImportedUKs(true);
			fixture24.setTableExclusionPattern("0123456789");
			fixture24.setTableInclusionPattern("An��t-1.0.txt");
			fixture24.setUser("");
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture25.setImportDate(new Date(946713599000L));
			fixture25.setImportedChecks(false);
			fixture25.setImportedIndexes(true);
			fixture25.setImportedSequences(false);
			fixture25.setImportedUKs(true);
			fixture25.setTableExclusionPattern("");
			fixture25.setTableInclusionPattern("");
			fixture25.setUser("");
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture26.setImportDate(new Date(946713599000L));
			fixture26.setImportedChecks(false);
			fixture26.setImportedIndexes(true);
			fixture26.setImportedSequences(false);
			fixture26.setImportedUKs(true);
			fixture26.setTableExclusionPattern("An��t-1.0.txt");
			fixture26.setTableInclusionPattern("");
			fixture26.setUser("An��t-1.0.txt");
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture27.setImportDate(new Date(946713599000L));
			fixture27.setImportedChecks(false);
			fixture27.setImportedIndexes(true);
			fixture27.setImportedSequences(true);
			fixture27.setImportedUKs(false);
			fixture27.setTableExclusionPattern("0123456789");
			fixture27.setTableInclusionPattern("0123456789");
			fixture27.setUser("");
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture28.setImportDate(new Date(946713599000L));
			fixture28.setImportedChecks(false);
			fixture28.setImportedIndexes(true);
			fixture28.setImportedSequences(true);
			fixture28.setImportedUKs(true);
			fixture28.setTableExclusionPattern("");
			fixture28.setTableInclusionPattern("0123456789");
			fixture28.setUser("An��t-1.0.txt");
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture29.setImportDate(new Date(946713599000L));
			fixture29.setImportedChecks(true);
			fixture29.setImportedIndexes(true);
			fixture29.setImportedSequences(false);
			fixture29.setImportedUKs(false);
			fixture29.setTableExclusionPattern("0123456789");
			fixture29.setTableInclusionPattern("");
			fixture29.setUser("0123456789");
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultDatabase
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DefaultDatabase getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
			fixture30.setImportDate(new Date(946713599000L));
			fixture30.setImportedChecks(true);
			fixture30.setImportedIndexes(true);
			fixture30.setImportedSequences(true);
			fixture30.setImportedUKs(true);
			fixture30.setTableExclusionPattern("An��t-1.0.txt");
			fixture30.setTableInclusionPattern("0123456789");
			fixture30.setUser("0123456789");
		}
		return fixture30;
	}

	/**
	 * Run the DefaultDatabase(String,String,VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDatabase_1()
		throws Exception {
		String name = "";
		String productName = "";
		VersionNumber productVersion = VersionNumber.valueOf("");

		DefaultDatabase result = new DefaultDatabase(name, productName, productVersion);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getDatabaseProductName());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getTableInclusionPattern());
		assertEquals(null, result.getTableExclusionPattern());
		assertEquals(false, result.isImportedSequences());
		assertEquals(false, result.isImportedChecks());
		assertEquals(false, result.isImportedUKs());
		assertEquals(null, result.getImportDate());
		assertEquals(false, result.isImportedIndexes());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DefaultDatabase(String,String,VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDatabase_2()
		throws Exception {
		String name = "0123456789";
		String productName = "0123456789";
		VersionNumber productVersion = VersionNumber.valueOf("");

		DefaultDatabase result = new DefaultDatabase(name, productName, productVersion);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getDatabaseProductName());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getTableInclusionPattern());
		assertEquals(null, result.getTableExclusionPattern());
		assertEquals(false, result.isImportedSequences());
		assertEquals(false, result.isImportedChecks());
		assertEquals(false, result.isImportedUKs());
		assertEquals(null, result.getImportDate());
		assertEquals(false, result.isImportedIndexes());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DefaultDatabase(String,String,VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDatabase_3()
		throws Exception {
		String name = "0123456789";
		String productName = "";
		VersionNumber productVersion = VersionNumber.valueOf("");

		DefaultDatabase result = new DefaultDatabase(name, productName, productVersion);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getDatabaseProductName());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getTableInclusionPattern());
		assertEquals(null, result.getTableExclusionPattern());
		assertEquals(false, result.isImportedSequences());
		assertEquals(false, result.isImportedChecks());
		assertEquals(false, result.isImportedUKs());
		assertEquals(null, result.getImportDate());
		assertEquals(false, result.isImportedIndexes());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DefaultDatabase(String,String,VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDefaultDatabase_4()
		throws Exception {
		String name = "";
		String productName = "0123456789";
		VersionNumber productVersion = VersionNumber.valueOf("");

		DefaultDatabase result = new DefaultDatabase(name, productName, productVersion);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getDatabaseProductName());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getTableInclusionPattern());
		assertEquals(null, result.getTableExclusionPattern());
		assertEquals(false, result.isImportedSequences());
		assertEquals(false, result.isImportedChecks());
		assertEquals(false, result.isImportedUKs());
		assertEquals(null, result.getImportDate());
		assertEquals(false, result.isImportedIndexes());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("");

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String catalogName = "";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		List<DBCatalog> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1591115236000L)), DateFormat.getInstance().format(result));
		assertEquals(1591115236000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(644344036000L)), DateFormat.getInstance().format(result));
		assertEquals(644344036000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(946713599000L)), DateFormat.getInstance().format(result));
		assertEquals(946713599000L, result.getTime());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_2()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_2()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_2()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture4_2()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture5_2()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture6_2()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture7_2()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture8_2()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture9_2()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture10_2()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture11_2()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture12_2()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture13_2()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture14_2()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture15_2()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture16_2()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture17_2()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture18_2()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture19_2()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture20_2()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture21_2()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture22_2()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture23_2()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture24_2()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture25_2()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture26_2()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture27_2()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture28_2()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture29_2()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture30_2()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_2()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String name = "";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_2()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture4_2()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture5_2()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture6_2()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture7_2()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture8_2()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture9_2()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture10_2()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture11_2()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture12_2()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture13_2()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture14_2()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture15_2()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture16_2()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture17_2()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture18_2()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture19_2()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture20_2()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture21_2()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture22_2()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture23_2()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture24_2()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture25_2()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture26_2()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture27_2()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture28_2()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture29_2()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture30_2()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_3()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_2()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_2()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture3_2()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture4_2()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture5_2()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture6_2()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture7_2()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture8_2()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture9_2()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture10_2()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture11_2()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture12_2()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture13_2()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture14_2()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture15_2()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture16_2()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture17_2()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture18_2()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture19_2()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture20_2()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture21_2()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture22_2()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture23_2()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture24_2()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture25_2()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture26_2()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture27_2()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture28_2()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture29_2()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture30_2()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("");

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		Date importDate = new Date(1591115236000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		Date importDate = new Date(644344036000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		Date importDate = new Date(946713599000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportDate_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		Date importDate = new Date(946713600000L);

		fixture.setImportDate(importDate);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		boolean importedChecks = false;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedChecks(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedChecks_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		boolean importedChecks = true;

		fixture.setImportedChecks(importedChecks);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		boolean importedIndexes = false;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedIndexes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedIndexes_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		boolean importedIndexes = true;

		fixture.setImportedIndexes(importedIndexes);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		boolean importedSequences = false;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedSequences_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		boolean importedSequences = true;

		fixture.setImportedSequences(importedSequences);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		boolean importedUKs = false;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setImportedUKs(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetImportedUKs_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		boolean importedUKs = true;

		fixture.setImportedUKs(importedUKs);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String tableExclusionPattern = "";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableExclusionPattern_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String tableExclusionPattern = "0123456789";

		fixture.setTableExclusionPattern(tableExclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String tableInclusionPattern = "";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusionPattern(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTableInclusionPattern_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String tableInclusionPattern = "0123456789";

		fixture.setTableInclusionPattern(tableInclusionPattern);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture1_1()
		throws Exception {
		DefaultDatabase fixture = getFixture1();
		String user = "";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture2_1()
		throws Exception {
		DefaultDatabase fixture = getFixture2();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture3_1()
		throws Exception {
		DefaultDatabase fixture = getFixture3();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture4_1()
		throws Exception {
		DefaultDatabase fixture = getFixture4();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture5_1()
		throws Exception {
		DefaultDatabase fixture = getFixture5();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture6_1()
		throws Exception {
		DefaultDatabase fixture = getFixture6();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture7_1()
		throws Exception {
		DefaultDatabase fixture = getFixture7();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture8_1()
		throws Exception {
		DefaultDatabase fixture = getFixture8();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture9_1()
		throws Exception {
		DefaultDatabase fixture = getFixture9();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture10_1()
		throws Exception {
		DefaultDatabase fixture = getFixture10();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture11_1()
		throws Exception {
		DefaultDatabase fixture = getFixture11();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture12_1()
		throws Exception {
		DefaultDatabase fixture = getFixture12();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture13_1()
		throws Exception {
		DefaultDatabase fixture = getFixture13();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture14_1()
		throws Exception {
		DefaultDatabase fixture = getFixture14();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture15_1()
		throws Exception {
		DefaultDatabase fixture = getFixture15();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture16_1()
		throws Exception {
		DefaultDatabase fixture = getFixture16();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture17_1()
		throws Exception {
		DefaultDatabase fixture = getFixture17();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture18_1()
		throws Exception {
		DefaultDatabase fixture = getFixture18();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture19_1()
		throws Exception {
		DefaultDatabase fixture = getFixture19();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture20_1()
		throws Exception {
		DefaultDatabase fixture = getFixture20();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture21_1()
		throws Exception {
		DefaultDatabase fixture = getFixture21();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture22_1()
		throws Exception {
		DefaultDatabase fixture = getFixture22();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture23_1()
		throws Exception {
		DefaultDatabase fixture = getFixture23();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture24_1()
		throws Exception {
		DefaultDatabase fixture = getFixture24();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture25_1()
		throws Exception {
		DefaultDatabase fixture = getFixture25();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture26_1()
		throws Exception {
		DefaultDatabase fixture = getFixture26();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture27_1()
		throws Exception {
		DefaultDatabase fixture = getFixture27();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture28_1()
		throws Exception {
		DefaultDatabase fixture = getFixture28();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture29_1()
		throws Exception {
		DefaultDatabase fixture = getFixture29();
		String user = "0123456789";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetUser_fixture30_1()
		throws Exception {
		DefaultDatabase fixture = getFixture30();
		String user = "0123456789";

		fixture.setUser(user);

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
		new org.junit.runner.JUnitCore().run(DefaultDatabaseTest.class);
	}
}