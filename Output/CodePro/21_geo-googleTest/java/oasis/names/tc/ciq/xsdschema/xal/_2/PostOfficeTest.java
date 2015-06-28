package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PostOfficeTest</code> contains tests for the class <code>{@link PostOffice}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PostOfficeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostOffice fixture10;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PostOffice();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PostOffice();
			fixture2.setIndicator("");
			fixture2.setPostBox(new PostBox());
			fixture2.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture2.setPostalCode(new PostalCode());
			fixture2.setPostalRoute(new PostalRouteType());
			fixture2.setType("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PostOffice();
			fixture3.setIndicator("");
			fixture3.setPostBox(new PostBox());
			fixture3.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture3.setPostalCode(new PostalCode());
			fixture3.setPostalRoute(new PostalRouteType());
			fixture3.setType("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new PostOffice();
			fixture4.setIndicator("");
			fixture4.setPostBox(new PostBox());
			fixture4.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture4.setPostalCode(new PostalCode());
			fixture4.setPostalRoute(new PostalRouteType());
			fixture4.setType("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new PostOffice();
			fixture5.setIndicator("0123456789");
			fixture5.setPostBox(new PostBox());
			fixture5.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture5.setPostalCode(new PostalCode());
			fixture5.setPostalRoute(new PostalRouteType());
			fixture5.setType("");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new PostOffice();
			fixture6.setIndicator("0123456789");
			fixture6.setPostBox(new PostBox());
			fixture6.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture6.setPostalCode(new PostalCode());
			fixture6.setPostalRoute(new PostalRouteType());
			fixture6.setType("0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new PostOffice();
			fixture7.setIndicator("0123456789");
			fixture7.setPostBox(new PostBox());
			fixture7.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture7.setPostalCode(new PostalCode());
			fixture7.setPostalRoute(new PostalRouteType());
			fixture7.setType("An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new PostOffice();
			fixture8.setIndicator("An��t-1.0.txt");
			fixture8.setPostBox(new PostBox());
			fixture8.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture8.setPostalCode(new PostalCode());
			fixture8.setPostalRoute(new PostalRouteType());
			fixture8.setType("");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new PostOffice();
			fixture9.setIndicator("An��t-1.0.txt");
			fixture9.setPostBox(new PostBox());
			fixture9.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture9.setPostalCode(new PostalCode());
			fixture9.setPostalRoute(new PostalRouteType());
			fixture9.setType("0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostOffice
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostOffice getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new PostOffice();
			fixture10.setIndicator("An��t-1.0.txt");
			fixture10.setPostBox(new PostBox());
			fixture10.setPostOfficeNumber(new PostOffice.PostOfficeNumber());
			fixture10.setPostalCode(new PostalCode());
			fixture10.setPostalRoute(new PostalRouteType());
			fixture10.setType("An��t-1.0.txt");
		}
		return fixture10;
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAddressLine_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		List<AddressLine> result = fixture.getAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getAny() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetAny_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetIndicator_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PostBox getPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostBox_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		PostBox result = fixture.getPostBox();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostBoxNumberPrefix());
		assertEquals(null, result.getPostBoxNumberSuffix());
		assertEquals(null, result.getPostBoxNumberExtension());
		assertEquals(null, result.getPostBoxNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostOffice.PostOfficeName> getPostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeName_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		List<PostOffice.PostOfficeName> result = fixture.getPostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber getPostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostOfficeNumber_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		PostOffice.PostOfficeNumber result = fixture.getPostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType getPostalRoute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRoute_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		PostalRouteType result = fixture.getPostalRoute();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();

		String result = fixture.getType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetType_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture2_2()
		throws Exception {
		PostOffice fixture = getFixture2();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture3_2()
		throws Exception {
		PostOffice fixture = getFixture3();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture4_2()
		throws Exception {
		PostOffice fixture = getFixture4();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture5_2()
		throws Exception {
		PostOffice fixture = getFixture5();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture6_2()
		throws Exception {
		PostOffice fixture = getFixture6();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture7_2()
		throws Exception {
		PostOffice fixture = getFixture7();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture8_2()
		throws Exception {
		PostOffice fixture = getFixture8();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture9_2()
		throws Exception {
		PostOffice fixture = getFixture9();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture10_2()
		throws Exception {
		PostOffice fixture = getFixture10();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetIndicator_fixture1_2()
		throws Exception {
		PostOffice fixture = getFixture1();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBox(PostBox) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostBox_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostOfficeNumber(PostOfficeNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostOfficeNumber_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();
		PostOffice.PostOfficeNumber value = new PostOffice.PostOfficeNumber();

		fixture.setPostOfficeNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalCode_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRoute(PostalRouteType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRoute_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();
		PostalRouteType value = new PostalRouteType();

		fixture.setPostalRoute(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture1_1()
		throws Exception {
		PostOffice fixture = getFixture1();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture2_1()
		throws Exception {
		PostOffice fixture = getFixture2();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture3_1()
		throws Exception {
		PostOffice fixture = getFixture3();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture4_1()
		throws Exception {
		PostOffice fixture = getFixture4();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture5_1()
		throws Exception {
		PostOffice fixture = getFixture5();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture6_1()
		throws Exception {
		PostOffice fixture = getFixture6();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture7_1()
		throws Exception {
		PostOffice fixture = getFixture7();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture8_1()
		throws Exception {
		PostOffice fixture = getFixture8();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture9_1()
		throws Exception {
		PostOffice fixture = getFixture9();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture10_1()
		throws Exception {
		PostOffice fixture = getFixture10();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture2_2()
		throws Exception {
		PostOffice fixture = getFixture2();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture3_2()
		throws Exception {
		PostOffice fixture = getFixture3();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture4_2()
		throws Exception {
		PostOffice fixture = getFixture4();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture5_2()
		throws Exception {
		PostOffice fixture = getFixture5();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture6_2()
		throws Exception {
		PostOffice fixture = getFixture6();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture7_2()
		throws Exception {
		PostOffice fixture = getFixture7();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture8_2()
		throws Exception {
		PostOffice fixture = getFixture8();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture9_2()
		throws Exception {
		PostOffice fixture = getFixture9();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture10_2()
		throws Exception {
		PostOffice fixture = getFixture10();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetType_fixture1_2()
		throws Exception {
		PostOffice fixture = getFixture1();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(PostOfficeTest.class);
	}
}