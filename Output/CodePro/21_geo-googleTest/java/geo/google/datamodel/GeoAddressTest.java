package geo.google.datamodel;

import org.junit.*;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails;
import static org.junit.Assert.*;

/**
 * The class <code>GeoAddressTest</code> contains tests for the class <code>{@link GeoAddress}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GeoAddressTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private GeoAddress fixture28;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new GeoAddress();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new GeoAddress();
			fixture2.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture2.setAddressDetails(new AddressDetails());
			fixture2.setAddressLine("");
			fixture2.setCoordinate(new GeoCoordinate());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new GeoAddress();
			fixture3.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture3.setAddressDetails(new AddressDetails());
			fixture3.setAddressLine("");
			fixture3.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new GeoAddress();
			fixture4.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture4.setAddressDetails(new AddressDetails());
			fixture4.setAddressLine("");
			fixture4.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new GeoAddress();
			fixture5.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture5.setAddressDetails(new AddressDetails());
			fixture5.setAddressLine("0123456789");
			fixture5.setCoordinate(new GeoCoordinate());
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new GeoAddress();
			fixture6.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture6.setAddressDetails(new AddressDetails());
			fixture6.setAddressLine("0123456789");
			fixture6.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new GeoAddress();
			fixture7.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture7.setAddressDetails(new AddressDetails());
			fixture7.setAddressLine("0123456789");
			fixture7.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new GeoAddress();
			fixture8.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture8.setAddressDetails(new AddressDetails());
			fixture8.setAddressLine("An��t-1.0.txt");
			fixture8.setCoordinate(new GeoCoordinate());
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new GeoAddress();
			fixture9.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture9.setAddressDetails(new AddressDetails());
			fixture9.setAddressLine("An��t-1.0.txt");
			fixture9.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new GeoAddress();
			fixture10.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
			fixture10.setAddressDetails(new AddressDetails());
			fixture10.setAddressLine("An��t-1.0.txt");
			fixture10.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new GeoAddress();
			fixture11.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture11.setAddressDetails(new AddressDetails());
			fixture11.setAddressLine("");
			fixture11.setCoordinate(new GeoCoordinate());
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new GeoAddress();
			fixture12.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture12.setAddressDetails(new AddressDetails());
			fixture12.setAddressLine("");
			fixture12.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new GeoAddress();
			fixture13.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture13.setAddressDetails(new AddressDetails());
			fixture13.setAddressLine("");
			fixture13.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new GeoAddress();
			fixture14.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture14.setAddressDetails(new AddressDetails());
			fixture14.setAddressLine("0123456789");
			fixture14.setCoordinate(new GeoCoordinate());
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new GeoAddress();
			fixture15.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture15.setAddressDetails(new AddressDetails());
			fixture15.setAddressLine("0123456789");
			fixture15.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new GeoAddress();
			fixture16.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture16.setAddressDetails(new AddressDetails());
			fixture16.setAddressLine("0123456789");
			fixture16.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new GeoAddress();
			fixture17.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture17.setAddressDetails(new AddressDetails());
			fixture17.setAddressLine("An��t-1.0.txt");
			fixture17.setCoordinate(new GeoCoordinate());
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new GeoAddress();
			fixture18.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture18.setAddressDetails(new AddressDetails());
			fixture18.setAddressLine("An��t-1.0.txt");
			fixture18.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new GeoAddress();
			fixture19.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
			fixture19.setAddressDetails(new AddressDetails());
			fixture19.setAddressLine("An��t-1.0.txt");
			fixture19.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new GeoAddress();
			fixture20.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture20.setAddressDetails(new AddressDetails());
			fixture20.setAddressLine("");
			fixture20.setCoordinate(new GeoCoordinate());
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new GeoAddress();
			fixture21.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture21.setAddressDetails(new AddressDetails());
			fixture21.setAddressLine("");
			fixture21.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new GeoAddress();
			fixture22.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture22.setAddressDetails(new AddressDetails());
			fixture22.setAddressLine("");
			fixture22.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new GeoAddress();
			fixture23.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture23.setAddressDetails(new AddressDetails());
			fixture23.setAddressLine("0123456789");
			fixture23.setCoordinate(new GeoCoordinate());
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new GeoAddress();
			fixture24.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture24.setAddressDetails(new AddressDetails());
			fixture24.setAddressLine("0123456789");
			fixture24.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new GeoAddress();
			fixture25.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture25.setAddressDetails(new AddressDetails());
			fixture25.setAddressLine("0123456789");
			fixture25.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new GeoAddress();
			fixture26.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture26.setAddressDetails(new AddressDetails());
			fixture26.setAddressLine("An��t-1.0.txt");
			fixture26.setCoordinate(new GeoCoordinate());
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new GeoAddress();
			fixture27.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture27.setAddressDetails(new AddressDetails());
			fixture27.setAddressLine("An��t-1.0.txt");
			fixture27.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GeoAddress
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public GeoAddress getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new GeoAddress();
			fixture28.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
			fixture28.setAddressDetails(new AddressDetails());
			fixture28.setAddressLine("An��t-1.0.txt");
			fixture28.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));
		}
		return fixture28;
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();
		Object o = null;

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();
		Object o = new GeoAddress();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.ADDRESS_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.COUNTRY_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("0123456789");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture1_2()
		throws Exception {
		GeoAddress fixture = getFixture1();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate(-1.0, -1.0, new GeoAltitude()));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testEquals_fixture2_2()
		throws Exception {
		GeoAddress fixture = getFixture2();
		GeoAddress o = new GeoAddress();
		o.setAccuracy(GeoAddressAccuracy.INTERSECTION_LEVEL);
		o.setAddressDetails(new AddressDetails());
		o.setAddressLine("An��t-1.0.txt");
		o.setCoordinate(new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0)));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("UNKNOWN_LOCATION", result.getName());
		assertEquals(0, result.getCode());
		assertEquals("UNKNOWN_LOCATION", result.name());
		assertEquals("UNKNOWN_LOCATION", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDRESS_LEVEL", result.getName());
		assertEquals(8, result.getCode());
		assertEquals("ADDRESS_LEVEL", result.name());
		assertEquals("ADDRESS_LEVEL", result.toString());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COUNTRY_LEVEL", result.getName());
		assertEquals(1, result.getCode());
		assertEquals("COUNTRY_LEVEL", result.name());
		assertEquals("COUNTRY_LEVEL", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the GeoAddressAccuracy getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAccuracy_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();

		GeoAddressAccuracy result = fixture.getAccuracy();

		// add additional test code here
		assertNotNull(result);
		assertEquals("INTERSECTION_LEVEL", result.getName());
		assertEquals(7, result.getCode());
		assertEquals("INTERSECTION_LEVEL", result.name());
		assertEquals("INTERSECTION_LEVEL", result.toString());
		assertEquals(7, result.ordinal());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the AddressDetails getAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressDetails_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();

		AddressDetails result = fixture.getAddressDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPostalServiceElements());
		assertEquals(null, result.getAddressLines());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getAddressType());
		assertEquals(null, result.getCurrentStatus());
		assertEquals(null, result.getValidFromDate());
		assertEquals(null, result.getValidToDate());
		assertEquals(null, result.getUsage());
		assertEquals(null, result.getAddressDetailsKey());
		assertEquals(null, result.getCode());
		assertEquals(null, result.getAccuracy());
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();

		String result = fixture.getAddressLine();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1.0, result.getLatitude(), 1.0);
		assertEquals(-1.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the GeoCoordinate getCoordinate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetCoordinate_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();

		GeoCoordinate result = fixture.getCoordinate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(844686303, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-2106020674, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1227840975, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1506142303, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1268820094, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1092167131, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1053536833, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(632383640, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1527873960, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-830281356, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1429534295, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1230641012, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1319160164, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-265094084, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1608875258, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1931954712, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1167525853, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-658015402, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-549019744, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1578091849, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1216562968, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1800639325, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(2020462937, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1716135432, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1763033880, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1183462276, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1593236271, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHashCode_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1738531232, result);
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.ADDRESS_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.COUNTRY_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.INTERSECTION_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.POST_CODE_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.REGION_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.STREET_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.SUB_REGION_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.TOWN_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.UNKNOWN_LOCATION;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture2_2()
		throws Exception {
		GeoAddress fixture = getFixture2();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.ADDRESS_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAccuracy(GeoAddressAccuracy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAccuracy_fixture3_2()
		throws Exception {
		GeoAddress fixture = getFixture3();
		GeoAddressAccuracy accuracy = GeoAddressAccuracy.COUNTRY_LEVEL;

		fixture.setAccuracy(accuracy);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressDetails_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();
		AddressDetails addressDetails = new AddressDetails();

		fixture.setAddressDetails(addressDetails);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();
		String addressLine = "";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();
		String addressLine = "0123456789";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture2_2()
		throws Exception {
		GeoAddress fixture = getFixture2();
		String addressLine = "";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setAddressLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetAddressLine_fixture3_2()
		throws Exception {
		GeoAddress fixture = getFixture3();
		String addressLine = "";

		fixture.setAddressLine(addressLine);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();
		GeoCoordinate coordinate = new GeoCoordinate();

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();
		GeoCoordinate coordinate = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();
		GeoCoordinate coordinate = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();
		GeoCoordinate coordinate = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture2_2()
		throws Exception {
		GeoAddress fixture = getFixture2();
		GeoCoordinate coordinate = new GeoCoordinate();

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the void setCoordinate(GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetCoordinate_fixture3_2()
		throws Exception {
		GeoAddress fixture = getFixture3();
		GeoCoordinate coordinate = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		fixture.setCoordinate(coordinate);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		GeoAddress fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@74c64a7c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		GeoAddress fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@6e907155[\n  _coordinate=geo.google.datamodel.GeoCoordinate@4d00bc28[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@6b410d96[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7be329dc\n  _addressLine=\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		GeoAddress fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@6689fe2d[\n  _coordinate=geo.google.datamodel.GeoCoordinate@6d8e70f2[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2299580f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@1645288\n  _addressLine=\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		GeoAddress fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@80360b7[\n  _coordinate=geo.google.datamodel.GeoCoordinate@15c2927d[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@191f57b4[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@58b6f74e\n  _addressLine=\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		GeoAddress fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@1f25d617[\n  _coordinate=geo.google.datamodel.GeoCoordinate@6d0a8ffa[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@50729e03[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@14e40038\n  _addressLine=0123456789\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture6_1()
		throws Exception {
		GeoAddress fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@4405b8e[\n  _coordinate=geo.google.datamodel.GeoCoordinate@1d3ac9d0[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@7e9785ad[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@dc961c9\n  _addressLine=0123456789\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture7_1()
		throws Exception {
		GeoAddress fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@6a92d77a[\n  _coordinate=geo.google.datamodel.GeoCoordinate@4e80c13f[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@670f375c[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@17fbade0\n  _addressLine=0123456789\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture8_1()
		throws Exception {
		GeoAddress fixture = getFixture8();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@75bb096d[\n  _coordinate=geo.google.datamodel.GeoCoordinate@4a680f7d[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@75d0fdb4[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@6bc070d9\n  _addressLine=An��t-1.0.txt\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture9_1()
		throws Exception {
		GeoAddress fixture = getFixture9();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@7d4dcbbe[\n  _coordinate=geo.google.datamodel.GeoCoordinate@7e7b6736[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@57b54b19[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@3f55834b\n  _addressLine=An��t-1.0.txt\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture10_1()
		throws Exception {
		GeoAddress fixture = getFixture10();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@78464825[\n  _coordinate=geo.google.datamodel.GeoCoordinate@4e2ab2d3[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@554262bc[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7960505e\n  _addressLine=An��t-1.0.txt\n  _accuracy=ADDRESS_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture11_1()
		throws Exception {
		GeoAddress fixture = getFixture11();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@346c2374[\n  _coordinate=geo.google.datamodel.GeoCoordinate@278baf8f[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@43b2e991[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@17045150\n  _addressLine=\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture12_1()
		throws Exception {
		GeoAddress fixture = getFixture12();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@2163bc4b[\n  _coordinate=geo.google.datamodel.GeoCoordinate@1adef10d[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@22a39a43[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@22e4b679\n  _addressLine=\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture13_1()
		throws Exception {
		GeoAddress fixture = getFixture13();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@48642f2a[\n  _coordinate=geo.google.datamodel.GeoCoordinate@29549387[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@6fa19943[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@5a5536f6\n  _addressLine=\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture14_1()
		throws Exception {
		GeoAddress fixture = getFixture14();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@36325085[\n  _coordinate=geo.google.datamodel.GeoCoordinate@2144678f[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@11eaee59[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@56c61e3f\n  _addressLine=0123456789\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture15_1()
		throws Exception {
		GeoAddress fixture = getFixture15();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@5770be46[\n  _coordinate=geo.google.datamodel.GeoCoordinate@2adc1283[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@56436c70[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@6484594e\n  _addressLine=0123456789\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture16_1()
		throws Exception {
		GeoAddress fixture = getFixture16();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@31408526[\n  _coordinate=geo.google.datamodel.GeoCoordinate@2e59b0d[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@302673f7[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@2c8775d3\n  _addressLine=0123456789\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture17_1()
		throws Exception {
		GeoAddress fixture = getFixture17();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@50752f57[\n  _coordinate=geo.google.datamodel.GeoCoordinate@3d772205[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@585a95c9[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@231fec70\n  _addressLine=An��t-1.0.txt\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture18_1()
		throws Exception {
		GeoAddress fixture = getFixture18();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@76ddbc89[\n  _coordinate=geo.google.datamodel.GeoCoordinate@57850356[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@5d9e2ffd[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@3c60bb0f\n  _addressLine=An��t-1.0.txt\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture19_1()
		throws Exception {
		GeoAddress fixture = getFixture19();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@17eca407[\n  _coordinate=geo.google.datamodel.GeoCoordinate@3104d3d6[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@33ef9fbe[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@38e08d95\n  _addressLine=An��t-1.0.txt\n  _accuracy=COUNTRY_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture20_1()
		throws Exception {
		GeoAddress fixture = getFixture20();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@1d824e95[\n  _coordinate=geo.google.datamodel.GeoCoordinate@55f52755[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@51e96989[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@330fcb62\n  _addressLine=\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture21_1()
		throws Exception {
		GeoAddress fixture = getFixture21();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@50961a99[\n  _coordinate=geo.google.datamodel.GeoCoordinate@2eac5c24[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@35d5576c[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@495e8f10\n  _addressLine=\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture22_1()
		throws Exception {
		GeoAddress fixture = getFixture22();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@1f74ebd2[\n  _coordinate=geo.google.datamodel.GeoCoordinate@35263820[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@602ed822[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@236fd183\n  _addressLine=\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture23_1()
		throws Exception {
		GeoAddress fixture = getFixture23();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@9e733c7[\n  _coordinate=geo.google.datamodel.GeoCoordinate@29f852e5[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@6e0a4de9[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@6681346f\n  _addressLine=0123456789\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture24_1()
		throws Exception {
		GeoAddress fixture = getFixture24();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@17c93844[\n  _coordinate=geo.google.datamodel.GeoCoordinate@1b8d048f[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@4726566a[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@25f36da4\n  _addressLine=0123456789\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture25_1()
		throws Exception {
		GeoAddress fixture = getFixture25();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@35eb2785[\n  _coordinate=geo.google.datamodel.GeoCoordinate@616fa86a[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@6999f91f[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7bb29862\n  _addressLine=0123456789\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture26_1()
		throws Exception {
		GeoAddress fixture = getFixture26();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@7bd902da[\n  _coordinate=geo.google.datamodel.GeoCoordinate@644a75bb[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@54777b6d[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@70485c6d\n  _addressLine=An��t-1.0.txt\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture27_1()
		throws Exception {
		GeoAddress fixture = getFixture27();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@1231f8cb[\n  _coordinate=geo.google.datamodel.GeoCoordinate@ec4e0c2[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@1f7fe821[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@660deaf\n  _addressLine=An��t-1.0.txt\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testToString_fixture28_1()
		throws Exception {
		GeoAddress fixture = getFixture28();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geo.google.datamodel.GeoAddress@ac61179[\n  _coordinate=geo.google.datamodel.GeoCoordinate@51a52475[_latitude=0.0,_longitude=0.0,_altitude=geo.google.datamodel.GeoAltitude@30fca733[_altitude=-1.0,_mode=CLAMP_TO_GROUND]]\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@1b451e65\n  _addressLine=An��t-1.0.txt\n  _accuracy=INTERSECTION_LEVEL\n]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GeoAddressTest.class);
	}
}