package org.databene.jdbacl.identity;

import java.sql.Connection;
import java.util.Properties;
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
import org.databene.commons.iterator.TableRowIterator;
import org.databene.jdbacl.model.DBRow;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
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
 * The class <code>IdentityModelTest</code> contains tests for the class <code>{@link IdentityModel}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class IdentityModelTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private IdentityModel fixture16;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new NaturalPkIdentity("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new NaturalPkIdentity("");
			fixture2.addIrrelevantColumn("");
			fixture2.addIrrelevantColumn("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new NaturalPkIdentity("");
			fixture3.addIrrelevantColumn("");
			fixture3.addIrrelevantColumn("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new NaturalPkIdentity("");
			fixture4.addIrrelevantColumn("");
			fixture4.addIrrelevantColumn("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new NkPkQueryIdentity("", "");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new NkPkQueryIdentity("", "");
			fixture6.addIrrelevantColumn("");
			fixture6.addIrrelevantColumn("");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new NkPkQueryIdentity("", "");
			fixture7.addIrrelevantColumn("");
			fixture7.addIrrelevantColumn("0123456789");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new NkPkQueryIdentity("", "");
			fixture8.addIrrelevantColumn("");
			fixture8.addIrrelevantColumn("An��t-1.0.txt");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new NkPkQueryIdentity("0123456789", "0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new NkPkQueryIdentity("0123456789", "0123456789");
			fixture10.addIrrelevantColumn("");
			fixture10.addIrrelevantColumn("");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new NkPkQueryIdentity("0123456789", "0123456789");
			fixture11.addIrrelevantColumn("");
			fixture11.addIrrelevantColumn("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new NkPkQueryIdentity("0123456789", "0123456789");
			fixture12.addIrrelevantColumn("");
			fixture12.addIrrelevantColumn("An��t-1.0.txt");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new NoIdentity("");
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new NoIdentity("");
			fixture14.addIrrelevantColumn("");
			fixture14.addIrrelevantColumn("");
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new NoIdentity("");
			fixture15.addIrrelevantColumn("");
			fixture15.addIrrelevantColumn("0123456789");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IdentityModel
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public IdentityModel getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new NoIdentity("");
			fixture16.addIrrelevantColumn("");
			fixture16.addIrrelevantColumn("An��t-1.0.txt");
		}
		return fixture16;
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String unimportantColumn = "0123456789";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture2_2()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture3_2()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture5_2()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture6_2()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture7_2()
		throws Exception {
		IdentityModel fixture = getFixture7();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture8_2()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture9_2()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture10_2()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture12_2()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
	}

	/**
	 * Run the void addIrrelevantColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddIrrelevantColumn_fixture15_2()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String unimportantColumn = "";

		fixture.addIrrelevantColumn(unimportantColumn);

		// add additional test code here
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
		IdentityModel fixture = getFixture1();
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
		IdentityModel fixture = getFixture2();
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
		IdentityModel fixture = getFixture3();
		Object obj = new NaturalPkIdentity("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		IdentityModel obj = new NaturalPkIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		IdentityModel obj = new NaturalPkIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("0123456789");

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
	public void testEquals_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		IdentityModel obj = new NaturalPkIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("An��t-1.0.txt");

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
	public void testEquals_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
		Object obj = new NkPkQueryIdentity("", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		IdentityModel obj = new NkPkQueryIdentity("", "");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		IdentityModel obj = new NkPkQueryIdentity("", "");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("0123456789");

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
	public void testEquals_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		IdentityModel obj = new NkPkQueryIdentity("", "");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("An��t-1.0.txt");

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
	public void testEquals_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		Object obj = new NkPkQueryIdentity("0123456789", "0123456789");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		IdentityModel obj = new NkPkQueryIdentity("0123456789", "0123456789");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		IdentityModel obj = new NkPkQueryIdentity("0123456789", "0123456789");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("0123456789");

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
	public void testEquals_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		IdentityModel obj = new NkPkQueryIdentity("0123456789", "0123456789");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("An��t-1.0.txt");

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
	public void testEquals_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		Object obj = new NoIdentity("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testEquals_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		IdentityModel obj = new NoIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
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
		IdentityModel fixture = getFixture1();
		IdentityModel obj = new NoIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("0123456789");

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
		IdentityModel fixture = getFixture2();
		IdentityModel obj = new NoIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("An��t-1.0.txt");

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
	public void testEquals_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
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
	public void testEquals_fixture5_2()
		throws Exception {
		IdentityModel fixture = getFixture5();
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
	public void testEquals_fixture6_2()
		throws Exception {
		IdentityModel fixture = getFixture6();
		Object obj = new NaturalPkIdentity("");

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
	public void testEquals_fixture7_2()
		throws Exception {
		IdentityModel fixture = getFixture7();
		IdentityModel obj = new NaturalPkIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

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
	public void testEquals_fixture8_2()
		throws Exception {
		IdentityModel fixture = getFixture8();
		IdentityModel obj = new NaturalPkIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("0123456789");

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
	public void testEquals_fixture9_2()
		throws Exception {
		IdentityModel fixture = getFixture9();
		IdentityModel obj = new NaturalPkIdentity("");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("An��t-1.0.txt");

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
	public void testEquals_fixture10_2()
		throws Exception {
		IdentityModel fixture = getFixture10();
		Object obj = new NkPkQueryIdentity("", "");

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
	public void testEquals_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
		IdentityModel obj = new NkPkQueryIdentity("", "");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

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
	public void testEquals_fixture12_2()
		throws Exception {
		IdentityModel fixture = getFixture12();
		IdentityModel obj = new NkPkQueryIdentity("", "");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("0123456789");

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
	public void testEquals_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
		IdentityModel obj = new NkPkQueryIdentity("", "");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("An��t-1.0.txt");

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
	public void testEquals_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		Object obj = new NkPkQueryIdentity("0123456789", "0123456789");

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
	public void testEquals_fixture15_2()
		throws Exception {
		IdentityModel fixture = getFixture15();
		IdentityModel obj = new NkPkQueryIdentity("0123456789", "0123456789");
		obj.addIrrelevantColumn("");
		obj.addIrrelevantColumn("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@19c9589d", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@4b425160", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@70049b13", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@6016598d", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@3dd5dc8b", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@3ea05672", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@34101107", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@59aec28d", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@3430a88", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@109d90ef", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@71251831", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@433ee145", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@35c21c35", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@180ccb4", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@774c1b11", result);
	}

	/**
	 * Run the String extractNK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractNK_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		Object[] nkPkTuple = new Object[] {new Object(), null};

		String result = fixture.extractNK(nkPkTuple);

		// add additional test code here
		assertEquals("java.lang.Object@577d7602", result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		Object[] nkPkTuple = new Object[] {null, null, new Object()};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table 0123456789 does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table 0123456789 does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table 0123456789 does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table 0123456789 does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		Object[] nkPkTuple = new Object[] {};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedOperationException: Table  does not have a primary key
		//       at org.databene.jdbacl.identity.IdentityModel.extractPK(IdentityModel.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture2_2()
		throws Exception {
		IdentityModel fixture = getFixture2();
		Object[] nkPkTuple = new Object[] {null, null, new Object()};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture3_2()
		throws Exception {
		IdentityModel fixture = getFixture3();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture5_2()
		throws Exception {
		IdentityModel fixture = getFixture5();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture6_2()
		throws Exception {
		IdentityModel fixture = getFixture6();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture7_2()
		throws Exception {
		IdentityModel fixture = getFixture7();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture8_2()
		throws Exception {
		IdentityModel fixture = getFixture8();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture9_2()
		throws Exception {
		IdentityModel fixture = getFixture9();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture10_2()
		throws Exception {
		IdentityModel fixture = getFixture10();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture12_2()
		throws Exception {
		IdentityModel fixture = getFixture12();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object extractPK(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testExtractPK_fixture15_2()
		throws Exception {
		IdentityModel fixture = getFixture15();
		Object[] nkPkTuple = new Object[] {null, null};

		Object result = fixture.extractPK(nkPkTuple);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTableName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTableName_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();

		String result = fixture.getTableName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "0123456789";
		Object ownerId = null;
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "0123456789";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture1_2()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture3_2()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "0123456789";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = new Object();
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture9_2()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "0123456789";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String ownedTableName = "0123456789";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture15_2()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture16_2()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture1_3()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture2_2()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture3_3()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture5_2()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleMissingOwner(String,DBRow,String,Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleMissingOwner_fixture7_2()
		throws Exception {
		IdentityModel fixture = getFixture7();
		String ownedTableName = "";
		DBRow ownedEntity = new DBRow(new DefaultDBTable(""));
		String ownerTableName = "";
		Object ownerId = null;
		String sourceDbId = "";

		fixture.handleMissingOwner(ownedTableName, ownedEntity, ownerTableName, ownerId, sourceDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String naturalKey = "0123456789";
		String tableName = "0123456789";
		String sourceDbId = "0123456789";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String naturalKey = "0123456789";
		String tableName = "0123456789";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String naturalKey = "0123456789";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture1_2()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture2_2()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "0123456789";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture6_2()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String naturalKey = "0123456789";
		String tableName = "0123456789";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture8_2()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String naturalKey = "0123456789";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture10_2()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture12_2()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture15_2()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture16_2()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture1_3()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture2_3()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture3_2()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNKNotFound(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNKNotFound_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String naturalKey = "";
		String tableName = "";
		String sourceDbId = "0123456789";
		String targetDbId = "";

		fixture.handleNKNotFound(naturalKey, tableName, sourceDbId, targetDbId);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String message = "";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
		String message = "0123456789";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture1_2()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String message = "";
		Object pk = null;
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
		String message = "";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture5_2()
		throws Exception {
		IdentityModel fixture = getFixture5();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture6_2()
		throws Exception {
		IdentityModel fixture = getFixture6();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture7_2()
		throws Exception {
		IdentityModel fixture = getFixture7();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture8_2()
		throws Exception {
		IdentityModel fixture = getFixture8();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture9_2()
		throws Exception {
		IdentityModel fixture = getFixture9();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture10_2()
		throws Exception {
		IdentityModel fixture = getFixture10();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture12_2()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture15_2()
		throws Exception {
		IdentityModel fixture = getFixture15();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
	}

	/**
	 * Run the void handleNonEquivalence(String,Object,DBRow) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHandleNonEquivalence_fixture16_2()
		throws Exception {
		IdentityModel fixture = getFixture16();
		String message = "0123456789";
		Object pk = new Object();
		DBRow entity = new DBRow(new DefaultDBTable(""));

		fixture.handleNonEquivalence(message, pk, entity);

		// add additional test code here
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
		IdentityModel fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
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
		IdentityModel fixture = getFixture3();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHashCode_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();

		int result = fixture.hashCode();

		// add additional test code here
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
	public void testHashCode_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture2_1()
		throws Exception {
		IdentityModel fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture1_2()
		throws Exception {
		IdentityModel fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture3_1()
		throws Exception {
		IdentityModel fixture = getFixture3();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture4_2()
		throws Exception {
		IdentityModel fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture7_2()
		throws Exception {
		IdentityModel fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture10_2()
		throws Exception {
		IdentityModel fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();
		String query = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture14_2()
		throws Exception {
		IdentityModel fixture = getFixture14();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();
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
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture1_3()
		throws Exception {
		IdentityModel fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture2_2()
		throws Exception {
		IdentityModel fixture = getFixture2();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture4_3()
		throws Exception {
		IdentityModel fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture5_2()
		throws Exception {
		IdentityModel fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture7_3()
		throws Exception {
		IdentityModel fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture8_2()
		throws Exception {
		IdentityModel fixture = getFixture8();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture10_3()
		throws Exception {
		IdentityModel fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture11_2()
		throws Exception {
		IdentityModel fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuery_fixture13_2()
		throws Exception {
		IdentityModel fixture = getFixture13();
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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		IdentityModel fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NaturalPkIdentity()", result);
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
		IdentityModel fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NaturalPkIdentity()", result);
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
		IdentityModel fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NaturalPkIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		IdentityModel fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NaturalPkIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		IdentityModel fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture6_1()
		throws Exception {
		IdentityModel fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture7_1()
		throws Exception {
		IdentityModel fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture8_1()
		throws Exception {
		IdentityModel fixture = getFixture8();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture9_1()
		throws Exception {
		IdentityModel fixture = getFixture9();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity(0123456789)", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture10_1()
		throws Exception {
		IdentityModel fixture = getFixture10();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity(0123456789)", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture11_1()
		throws Exception {
		IdentityModel fixture = getFixture11();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity(0123456789)", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture12_1()
		throws Exception {
		IdentityModel fixture = getFixture12();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NkPkQueryIdentity(0123456789)", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture13_1()
		throws Exception {
		IdentityModel fixture = getFixture13();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NoIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture14_1()
		throws Exception {
		IdentityModel fixture = getFixture14();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NoIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture15_1()
		throws Exception {
		IdentityModel fixture = getFixture15();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NoIdentity()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture16_1()
		throws Exception {
		IdentityModel fixture = getFixture16();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("NoIdentity()", result);
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
		new org.junit.runner.JUnitCore().run(IdentityModelTest.class);
	}
}