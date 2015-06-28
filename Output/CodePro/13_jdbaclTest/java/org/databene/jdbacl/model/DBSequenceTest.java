package org.databene.jdbacl.model;

import java.math.BigInteger;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBSequenceTest</code> contains tests for the class <code>{@link DBSequence}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBSequenceTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBSequence fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBSequence("", "", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBSequence("", "", "");
			fixture2.setCache(new Long(-1L));
			fixture2.setCycle(Boolean.FALSE);
			fixture2.setIncrement(new BigInteger("-987654321"));
			fixture2.setLastNumber(new BigInteger("-987654321"));
			fixture2.setMaxValue(new BigInteger("-987654321"));
			fixture2.setMinValue(new BigInteger("-987654321"));
			fixture2.setOrder(Boolean.FALSE);
			fixture2.setStart(new BigInteger("-987654321"));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBSequence("", "", "");
			fixture3.setCache(new Long(-1L));
			fixture3.setCycle(Boolean.FALSE);
			fixture3.setIncrement(new BigInteger("-987654321"));
			fixture3.setLastNumber(new BigInteger("1234567890"));
			fixture3.setMaxValue(new BigInteger("1234567890"));
			fixture3.setMinValue(new BigInteger("1234567890"));
			fixture3.setOrder(Boolean.TRUE);
			fixture3.setStart(new BigInteger("1234567890"));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DBSequence("", "", "");
			fixture4.setCache(new Long(-1L));
			fixture4.setCycle(Boolean.TRUE);
			fixture4.setIncrement(new BigInteger("-987654321"));
			fixture4.setLastNumber(new BigInteger("-987654321"));
			fixture4.setMaxValue(new BigInteger("-987654321"));
			fixture4.setMinValue(new BigInteger("-987654321"));
			fixture4.setOrder(Boolean.TRUE);
			fixture4.setStart(new BigInteger("1234567890"));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DBSequence("", "", "");
			fixture5.setCache(new Long(-1L));
			fixture5.setCycle(Boolean.TRUE);
			fixture5.setIncrement(new BigInteger("-987654321"));
			fixture5.setLastNumber(new BigInteger("-987654321"));
			fixture5.setMaxValue(new BigInteger("-987654321"));
			fixture5.setMinValue(new BigInteger("1234567890"));
			fixture5.setOrder(Boolean.TRUE);
			fixture5.setStart(new BigInteger("1234567890"));
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DBSequence("", "", "");
			fixture6.setCache(new Long(-1L));
			fixture6.setCycle(Boolean.TRUE);
			fixture6.setIncrement(new BigInteger("-987654321"));
			fixture6.setLastNumber(new BigInteger("-987654321"));
			fixture6.setMaxValue(new BigInteger("1234567890"));
			fixture6.setMinValue(new BigInteger("-987654321"));
			fixture6.setOrder(Boolean.TRUE);
			fixture6.setStart(new BigInteger("1234567890"));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DBSequence("", "", "");
			fixture7.setCache(new Long(-1L));
			fixture7.setCycle(Boolean.TRUE);
			fixture7.setIncrement(new BigInteger("-987654321"));
			fixture7.setLastNumber(new BigInteger("-987654321"));
			fixture7.setMaxValue(new BigInteger("1234567890"));
			fixture7.setMinValue(new BigInteger("1234567890"));
			fixture7.setOrder(Boolean.TRUE);
			fixture7.setStart(new BigInteger("1234567890"));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DBSequence("", "", "");
			fixture8.setCache(new Long(-1L));
			fixture8.setCycle(Boolean.TRUE);
			fixture8.setIncrement(new BigInteger("-987654321"));
			fixture8.setLastNumber(new BigInteger("1234567890"));
			fixture8.setMaxValue(new BigInteger("-987654321"));
			fixture8.setMinValue(new BigInteger("-987654321"));
			fixture8.setOrder(Boolean.TRUE);
			fixture8.setStart(new BigInteger("1234567890"));
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DBSequence("", "", "");
			fixture9.setCache(new Long(-1L));
			fixture9.setCycle(Boolean.TRUE);
			fixture9.setIncrement(new BigInteger("-987654321"));
			fixture9.setLastNumber(new BigInteger("1234567890"));
			fixture9.setMaxValue(new BigInteger("-987654321"));
			fixture9.setMinValue(new BigInteger("1234567890"));
			fixture9.setOrder(Boolean.TRUE);
			fixture9.setStart(new BigInteger("1234567890"));
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DBSequence("", "", "");
			fixture10.setCache(new Long(-1L));
			fixture10.setCycle(Boolean.TRUE);
			fixture10.setIncrement(new BigInteger("-987654321"));
			fixture10.setLastNumber(new BigInteger("1234567890"));
			fixture10.setMaxValue(new BigInteger("1234567890"));
			fixture10.setMinValue(new BigInteger("-987654321"));
			fixture10.setOrder(Boolean.TRUE);
			fixture10.setStart(new BigInteger("1234567890"));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DBSequence("", "", "");
			fixture11.setCache(new Long(-1L));
			fixture11.setCycle(Boolean.TRUE);
			fixture11.setIncrement(new BigInteger("-987654321"));
			fixture11.setLastNumber(new BigInteger("1234567890"));
			fixture11.setMaxValue(new BigInteger("1234567890"));
			fixture11.setMinValue(new BigInteger("1234567890"));
			fixture11.setOrder(Boolean.TRUE);
			fixture11.setStart(new BigInteger("1234567890"));
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DBSequence("", "", "");
			fixture12.setCache(new Long(0L));
			fixture12.setCycle(Boolean.FALSE);
			fixture12.setIncrement(new BigInteger("1234567890"));
			fixture12.setLastNumber(new BigInteger("1234567890"));
			fixture12.setMaxValue(new BigInteger("-987654321"));
			fixture12.setMinValue(new BigInteger("1234567890"));
			fixture12.setOrder(Boolean.TRUE);
			fixture12.setStart(new BigInteger("1234567890"));
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new DBSequence("", "", "");
			fixture13.setCache(new Long(0L));
			fixture13.setCycle(Boolean.FALSE);
			fixture13.setIncrement(new BigInteger("1234567890"));
			fixture13.setLastNumber(new BigInteger("1234567890"));
			fixture13.setMaxValue(new BigInteger("1234567890"));
			fixture13.setMinValue(new BigInteger("1234567890"));
			fixture13.setOrder(Boolean.TRUE);
			fixture13.setStart(new BigInteger("1234567890"));
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new DBSequence("", "", "");
			fixture14.setCache(new Long(0L));
			fixture14.setCycle(Boolean.TRUE);
			fixture14.setIncrement(new BigInteger("1234567890"));
			fixture14.setLastNumber(new BigInteger("-987654321"));
			fixture14.setMaxValue(new BigInteger("-987654321"));
			fixture14.setMinValue(new BigInteger("-987654321"));
			fixture14.setOrder(Boolean.TRUE);
			fixture14.setStart(new BigInteger("1234567890"));
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new DBSequence("", "", "");
			fixture15.setCache(new Long(0L));
			fixture15.setCycle(Boolean.TRUE);
			fixture15.setIncrement(new BigInteger("1234567890"));
			fixture15.setLastNumber(new BigInteger("-987654321"));
			fixture15.setMaxValue(new BigInteger("-987654321"));
			fixture15.setMinValue(new BigInteger("1234567890"));
			fixture15.setOrder(Boolean.TRUE);
			fixture15.setStart(new BigInteger("1234567890"));
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new DBSequence("", "", "");
			fixture16.setCache(new Long(0L));
			fixture16.setCycle(Boolean.TRUE);
			fixture16.setIncrement(new BigInteger("1234567890"));
			fixture16.setLastNumber(new BigInteger("-987654321"));
			fixture16.setMaxValue(new BigInteger("1234567890"));
			fixture16.setMinValue(new BigInteger("-987654321"));
			fixture16.setOrder(Boolean.TRUE);
			fixture16.setStart(new BigInteger("1234567890"));
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new DBSequence("", "", "");
			fixture17.setCache(new Long(0L));
			fixture17.setCycle(Boolean.TRUE);
			fixture17.setIncrement(new BigInteger("1234567890"));
			fixture17.setLastNumber(new BigInteger("-987654321"));
			fixture17.setMaxValue(new BigInteger("1234567890"));
			fixture17.setMinValue(new BigInteger("1234567890"));
			fixture17.setOrder(Boolean.TRUE);
			fixture17.setStart(new BigInteger("1234567890"));
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new DBSequence("", "", "");
			fixture18.setCache(new Long(0L));
			fixture18.setCycle(Boolean.TRUE);
			fixture18.setIncrement(new BigInteger("1234567890"));
			fixture18.setLastNumber(new BigInteger("1234567890"));
			fixture18.setMaxValue(new BigInteger("-987654321"));
			fixture18.setMinValue(new BigInteger("-987654321"));
			fixture18.setOrder(Boolean.TRUE);
			fixture18.setStart(new BigInteger("1234567890"));
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new DBSequence("", "", "");
			fixture19.setCache(new Long(0L));
			fixture19.setCycle(Boolean.TRUE);
			fixture19.setIncrement(new BigInteger("1234567890"));
			fixture19.setLastNumber(new BigInteger("1234567890"));
			fixture19.setMaxValue(new BigInteger("-987654321"));
			fixture19.setMinValue(new BigInteger("1234567890"));
			fixture19.setOrder(Boolean.TRUE);
			fixture19.setStart(new BigInteger("1234567890"));
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new DBSequence("", "", "");
			fixture20.setCache(new Long(0L));
			fixture20.setCycle(Boolean.TRUE);
			fixture20.setIncrement(new BigInteger("1234567890"));
			fixture20.setLastNumber(new BigInteger("1234567890"));
			fixture20.setMaxValue(new BigInteger("1234567890"));
			fixture20.setMinValue(new BigInteger("-987654321"));
			fixture20.setOrder(Boolean.TRUE);
			fixture20.setStart(new BigInteger("1234567890"));
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new DBSequence("", "", "");
			fixture21.setCache(new Long(0L));
			fixture21.setCycle(Boolean.TRUE);
			fixture21.setIncrement(new BigInteger("1234567890"));
			fixture21.setLastNumber(new BigInteger("1234567890"));
			fixture21.setMaxValue(new BigInteger("1234567890"));
			fixture21.setMinValue(new BigInteger("1234567890"));
			fixture21.setOrder(Boolean.TRUE);
			fixture21.setStart(new BigInteger("1234567890"));
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new DBSequence("", "", "");
			fixture22.setCache(new Long(1L));
			fixture22.setCycle(Boolean.FALSE);
			fixture22.setIncrement(new BigInteger("-987654321"));
			fixture22.setLastNumber(new BigInteger("1234567890"));
			fixture22.setMaxValue(new BigInteger("1234567890"));
			fixture22.setMinValue(new BigInteger("1234567890"));
			fixture22.setOrder(Boolean.TRUE);
			fixture22.setStart(new BigInteger("1234567890"));
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new DBSequence("", "", "");
			fixture23.setCache(new Long(1L));
			fixture23.setCycle(Boolean.TRUE);
			fixture23.setIncrement(new BigInteger("-987654321"));
			fixture23.setLastNumber(new BigInteger("-987654321"));
			fixture23.setMaxValue(new BigInteger("-987654321"));
			fixture23.setMinValue(new BigInteger("-987654321"));
			fixture23.setOrder(Boolean.TRUE);
			fixture23.setStart(new BigInteger("1234567890"));
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new DBSequence("", "", "");
			fixture24.setCache(new Long(1L));
			fixture24.setCycle(Boolean.TRUE);
			fixture24.setIncrement(new BigInteger("-987654321"));
			fixture24.setLastNumber(new BigInteger("-987654321"));
			fixture24.setMaxValue(new BigInteger("-987654321"));
			fixture24.setMinValue(new BigInteger("1234567890"));
			fixture24.setOrder(Boolean.TRUE);
			fixture24.setStart(new BigInteger("1234567890"));
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new DBSequence("", "", "");
			fixture25.setCache(new Long(1L));
			fixture25.setCycle(Boolean.TRUE);
			fixture25.setIncrement(new BigInteger("-987654321"));
			fixture25.setLastNumber(new BigInteger("-987654321"));
			fixture25.setMaxValue(new BigInteger("1234567890"));
			fixture25.setMinValue(new BigInteger("-987654321"));
			fixture25.setOrder(Boolean.TRUE);
			fixture25.setStart(new BigInteger("1234567890"));
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new DBSequence("", "", "");
			fixture26.setCache(new Long(1L));
			fixture26.setCycle(Boolean.TRUE);
			fixture26.setIncrement(new BigInteger("-987654321"));
			fixture26.setLastNumber(new BigInteger("-987654321"));
			fixture26.setMaxValue(new BigInteger("1234567890"));
			fixture26.setMinValue(new BigInteger("1234567890"));
			fixture26.setOrder(Boolean.TRUE);
			fixture26.setStart(new BigInteger("1234567890"));
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new DBSequence("", "", "");
			fixture27.setCache(new Long(1L));
			fixture27.setCycle(Boolean.TRUE);
			fixture27.setIncrement(new BigInteger("-987654321"));
			fixture27.setLastNumber(new BigInteger("1234567890"));
			fixture27.setMaxValue(new BigInteger("-987654321"));
			fixture27.setMinValue(new BigInteger("-987654321"));
			fixture27.setOrder(Boolean.TRUE);
			fixture27.setStart(new BigInteger("1234567890"));
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new DBSequence("", "", "");
			fixture28.setCache(new Long(1L));
			fixture28.setCycle(Boolean.TRUE);
			fixture28.setIncrement(new BigInteger("-987654321"));
			fixture28.setLastNumber(new BigInteger("1234567890"));
			fixture28.setMaxValue(new BigInteger("-987654321"));
			fixture28.setMinValue(new BigInteger("1234567890"));
			fixture28.setOrder(Boolean.TRUE);
			fixture28.setStart(new BigInteger("1234567890"));
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new DBSequence("", "", "");
			fixture29.setCache(new Long(1L));
			fixture29.setCycle(Boolean.TRUE);
			fixture29.setIncrement(new BigInteger("-987654321"));
			fixture29.setLastNumber(new BigInteger("1234567890"));
			fixture29.setMaxValue(new BigInteger("1234567890"));
			fixture29.setMinValue(new BigInteger("-987654321"));
			fixture29.setOrder(Boolean.TRUE);
			fixture29.setStart(new BigInteger("1234567890"));
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSequence
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBSequence getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new DBSequence("", "", "");
			fixture30.setCache(new Long(1L));
			fixture30.setCycle(Boolean.TRUE);
			fixture30.setIncrement(new BigInteger("-987654321"));
			fixture30.setLastNumber(new BigInteger("1234567890"));
			fixture30.setMaxValue(new BigInteger("1234567890"));
			fixture30.setMinValue(new BigInteger("1234567890"));
			fixture30.setOrder(Boolean.TRUE);
			fixture30.setStart(new BigInteger("1234567890"));
		}
		return fixture30;
	}

	/**
	 * Run the DBSequence(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_1()
		throws Exception {
		String name = "";
		DBSchema owner = new DBSchema("");

		DBSequence result = new DBSequence(name, owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_2()
		throws Exception {
		String name = "0123456789";
		DBSchema owner = new DBSchema("", new DBCatalog(""));

		DBSequence result = new DBSequence(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence 0123456789", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_3()
		throws Exception {
		String name = "";
		DBSchema owner = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		DBSequence result = new DBSequence(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("0123456789", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence ", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_4()
		throws Exception {
		String name = "";
		DBSchema owner = new DBSchema("", new DBCatalog(""));

		DBSequence result = new DBSequence(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence ", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_5()
		throws Exception {
		String name = "0123456789";
		DBSchema owner = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		DBSequence result = new DBSequence(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("0123456789", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence 0123456789", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,DBSchema) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_6()
		throws Exception {
		String name = "0123456789";
		DBSchema owner = new DBSchema("");

		DBSequence result = new DBSequence(name, owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_7()
		throws Exception {
		String name = "";
		String catalogName = "";
		String schemaName = "";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence ", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_8()
		throws Exception {
		String name = "0123456789";
		String catalogName = "0123456789";
		String schemaName = "0123456789";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("0123456789", result.getSchemaName());
		assertEquals("0123456789", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence 0123456789", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_9()
		throws Exception {
		String name = "0123456789";
		String catalogName = "0123456789";
		String schemaName = "";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("", result.getSchemaName());
		assertEquals("0123456789", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence 0123456789", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_10()
		throws Exception {
		String name = "0123456789";
		String catalogName = "";
		String schemaName = "0123456789";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("0123456789", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence 0123456789", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_11()
		throws Exception {
		String name = "0123456789";
		String catalogName = "";
		String schemaName = "";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence 0123456789", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_12()
		throws Exception {
		String name = "";
		String catalogName = "0123456789";
		String schemaName = "0123456789";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("0123456789", result.getSchemaName());
		assertEquals("0123456789", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence ", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_13()
		throws Exception {
		String name = "";
		String catalogName = "0123456789";
		String schemaName = "";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("", result.getSchemaName());
		assertEquals("0123456789", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence ", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSequence(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBSequence_14()
		throws Exception {
		String name = "";
		String catalogName = "";
		String schemaName = "0123456789";

		DBSequence result = new DBSequence(name, catalogName, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
		assertEquals("0123456789", result.getSchemaName());
		assertEquals("", result.getCatalogName());
		assertEquals(null, result.getMinValueIfNotDefault());
		assertEquals(null, result.getMaxValueIfNotDefault());
		assertEquals(null, result.getIncrementIfNotDefault());
		assertEquals(null, result.getStartIfNotDefault());
		assertEquals(null, result.isCycle());
		assertEquals("drop sequence ", result.dropDDL());
		assertEquals(null, result.getMinValue());
		assertEquals(null, result.isOrder());
		assertEquals(null, result.getMaxValue());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("sequence", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the String dropDDL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDropDDL_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		String result = fixture.dropDDL();

		// add additional test code here
		assertEquals("drop sequence ", result);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		Long result = fixture.getCache();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("-1", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(-1, result.intValue());
		assertEquals(-1L, result.longValue());
		assertEquals(-1.0f, result.floatValue(), 1.0f);
		assertEquals(-1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Long getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCache_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		Long result = fixture.getCache();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getCatalogName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogName_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		String result = fixture.getCatalogName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(1, result.bitCount());
		assertEquals("1", result.toString());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrement_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getIncrement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getIncrementIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIncrementIfNotDefault_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getIncrementIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.bitLength());
		assertEquals(-1, result.getLowestSetBit());
		assertEquals(0, result.bitCount());
		assertEquals("0", result.toString());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
		assertEquals(0, result.signum());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getLastNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetLastNumber_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getLastNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValue_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getMaxValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMaxValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMaxValueIfNotDefault_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getMaxValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValue_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getMinValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getMinValueIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetMinValueIfNotDefault_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getMinValueIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchemaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemaName_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		String result = fixture.getSchemaName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(1, result.bitCount());
		assertEquals("1", result.toString());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStart_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(30, result.bitLength());
		assertEquals(0, result.getLowestSetBit());
		assertEquals(16, result.bitCount());
		assertEquals("-987654321", result.toString());
		assertEquals(-987654321, result.intValue());
		assertEquals(-987654321L, result.longValue());
		assertEquals(-9.8765434E8f, result.floatValue(), 1.0f);
		assertEquals(-9.87654321E8, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals((byte) 79, result.byteValue());
		assertEquals((short) -26801, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the BigInteger getStartIfNotDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetStartIfNotDefault_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		BigInteger result = fixture.getStartIfNotDefault();

		// add additional test code here
		assertNotNull(result);
		assertEquals(31, result.bitLength());
		assertEquals(1, result.getLowestSetBit());
		assertEquals(12, result.bitCount());
		assertEquals("1234567890", result.toString());
		assertEquals(1234567890, result.intValue());
		assertEquals(1234567890L, result.longValue());
		assertEquals(1.23456794E9f, result.floatValue(), 1.0f);
		assertEquals(1.23456789E9, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals((byte) -46, result.byteValue());
		assertEquals((short) 722, result.shortValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsCycle_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		Boolean result = fixture.isCycle();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
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
		DBSequence fixture = getFixture1();
		DBObject other = new DBCatalog("");

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture2();
		DBObject other = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture3();
		DBObject other = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture4();
		DBObject other = new DBCatalog();

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture5();
		DBObject other = new DBPackage("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture6();
		DBObject other = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture7();
		DBObject other = new DBProcedure("", new DBPackage("", new DBSchema("")));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture8();
		DBObject other = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture9();
		DBObject other = new DBSchema("");

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture10();
		DBObject other = new DBSchema("", new DBCatalog(""));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture11();
		DBObject other = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture12();
		DBObject other = new DBSequence("", "", "");

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture13();
		DBObject other = new DBSequence("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture14();
		DBObject other = new DBSequence("0123456789", "0123456789", "0123456789");

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture15();
		DBObject other = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture16();
		DBObject other = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture17();
		DBObject other = new DBTrigger("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture18();
		DBObject other = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture19();
		DBObject other = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture20();
		DBObject other = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture21();
		DBObject other = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture22();
		DBObject other = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture23();
		DBObject other = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture24();
		DBObject other = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture25();
		DBObject other = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture26();
		DBObject other = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture27();
		DBObject other = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture28();
		DBObject other = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture29();
		DBObject other = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		boolean result = fixture.isIdentical(other);

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
		DBSequence fixture = getFixture30();
		DBObject other = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertTrue(result);
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean isOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsOrder_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();

		Boolean result = fixture.isOrder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		Long cache = new Long(-1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		Long cache = new Long(0L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCache(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCache_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		Long cache = new Long(1L);

		fixture.setCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		Boolean cycle = Boolean.FALSE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setCycle(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCycle_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		Boolean cycle = Boolean.TRUE;

		fixture.setCycle(cycle);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		BigInteger increment = new BigInteger("-987654321");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetIncrement_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		BigInteger increment = new BigInteger("1234567890");

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		BigInteger lastNumber = new BigInteger("-987654321");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setLastNumber(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetLastNumber_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		BigInteger lastNumber = new BigInteger("1234567890");

		fixture.setLastNumber(lastNumber);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		BigInteger maxValue = new BigInteger("-987654321");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMaxValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMaxValue_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		BigInteger maxValue = new BigInteger("1234567890");

		fixture.setMaxValue(maxValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		BigInteger minValue = new BigInteger("-987654321");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinValue(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetMinValue_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		BigInteger minValue = new BigInteger("1234567890");

		fixture.setMinValue(minValue);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		Boolean order = Boolean.FALSE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

		// add additional test code here
	}

	/**
	 * Run the void setOrder(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOrder_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		Boolean order = Boolean.TRUE;

		fixture.setOrder(order);

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
		DBSequence fixture = getFixture1();
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
		DBSequence fixture = getFixture2();
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
		DBSequence fixture = getFixture3();
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
		DBSequence fixture = getFixture4();
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
		DBSequence fixture = getFixture5();
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
		DBSequence fixture = getFixture6();
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
		DBSequence fixture = getFixture7();
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
		DBSequence fixture = getFixture8();
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
		DBSequence fixture = getFixture9();
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
		DBSequence fixture = getFixture10();
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
		DBSequence fixture = getFixture11();
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
		DBSequence fixture = getFixture12();
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
		DBSequence fixture = getFixture13();
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
		DBSequence fixture = getFixture14();
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
		DBSequence fixture = getFixture15();
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
		DBSequence fixture = getFixture16();
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
		DBSequence fixture = getFixture17();
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
		DBSequence fixture = getFixture18();
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
		DBSequence fixture = getFixture19();
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
		DBSequence fixture = getFixture20();
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
		DBSequence fixture = getFixture21();
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
		DBSequence fixture = getFixture22();
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
		DBSequence fixture = getFixture23();
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
		DBSequence fixture = getFixture24();
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
		DBSequence fixture = getFixture25();
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
		DBSequence fixture = getFixture26();
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
		DBSequence fixture = getFixture27();
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
		DBSequence fixture = getFixture28();
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
		DBSequence fixture = getFixture29();
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
		DBSequence fixture = getFixture30();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture1_1()
		throws Exception {
		DBSequence fixture = getFixture1();
		BigInteger start = new BigInteger("-987654321");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture2_1()
		throws Exception {
		DBSequence fixture = getFixture2();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture3_1()
		throws Exception {
		DBSequence fixture = getFixture3();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture4_1()
		throws Exception {
		DBSequence fixture = getFixture4();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture5_1()
		throws Exception {
		DBSequence fixture = getFixture5();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture6_1()
		throws Exception {
		DBSequence fixture = getFixture6();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture7_1()
		throws Exception {
		DBSequence fixture = getFixture7();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture8_1()
		throws Exception {
		DBSequence fixture = getFixture8();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture9_1()
		throws Exception {
		DBSequence fixture = getFixture9();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture10_1()
		throws Exception {
		DBSequence fixture = getFixture10();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture11_1()
		throws Exception {
		DBSequence fixture = getFixture11();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture12_1()
		throws Exception {
		DBSequence fixture = getFixture12();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture13_1()
		throws Exception {
		DBSequence fixture = getFixture13();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture14_1()
		throws Exception {
		DBSequence fixture = getFixture14();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture15_1()
		throws Exception {
		DBSequence fixture = getFixture15();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture16_1()
		throws Exception {
		DBSequence fixture = getFixture16();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture17_1()
		throws Exception {
		DBSequence fixture = getFixture17();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture18_1()
		throws Exception {
		DBSequence fixture = getFixture18();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture19_1()
		throws Exception {
		DBSequence fixture = getFixture19();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture20_1()
		throws Exception {
		DBSequence fixture = getFixture20();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture21_1()
		throws Exception {
		DBSequence fixture = getFixture21();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture22_1()
		throws Exception {
		DBSequence fixture = getFixture22();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture23_1()
		throws Exception {
		DBSequence fixture = getFixture23();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture24_1()
		throws Exception {
		DBSequence fixture = getFixture24();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture25_1()
		throws Exception {
		DBSequence fixture = getFixture25();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture26_1()
		throws Exception {
		DBSequence fixture = getFixture26();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture27_1()
		throws Exception {
		DBSequence fixture = getFixture27();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture28_1()
		throws Exception {
		DBSequence fixture = getFixture28();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture29_1()
		throws Exception {
		DBSequence fixture = getFixture29();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the void setStart(BigInteger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetStart_fixture30_1()
		throws Exception {
		DBSequence fixture = getFixture30();
		BigInteger start = new BigInteger("1234567890");

		fixture.setStart(start);

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
		new org.junit.runner.JUnitCore().run(DBSequenceTest.class);
	}
}