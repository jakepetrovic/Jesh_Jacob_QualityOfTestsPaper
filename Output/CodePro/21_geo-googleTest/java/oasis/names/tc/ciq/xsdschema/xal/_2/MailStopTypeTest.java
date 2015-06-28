package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MailStopTypeTest</code> contains tests for the class <code>{@link MailStopType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MailStopTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private MailStopType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private MailStopType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private MailStopType fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private MailStopType fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public MailStopType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new MailStopType();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public MailStopType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new MailStopType();
			fixture2.setMailStopName(new MailStopType.MailStopName());
			fixture2.setMailStopNumber(new MailStopType.MailStopNumber());
			fixture2.setType("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public MailStopType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new MailStopType();
			fixture3.setMailStopName(new MailStopType.MailStopName());
			fixture3.setMailStopNumber(new MailStopType.MailStopNumber());
			fixture3.setType("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailStopType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public MailStopType getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new MailStopType();
			fixture4.setMailStopName(new MailStopType.MailStopName());
			fixture4.setMailStopNumber(new MailStopType.MailStopNumber());
			fixture4.setType("An��t-1.0.txt");
		}
		return fixture4;
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
		MailStopType fixture = getFixture1();

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
		MailStopType fixture = getFixture2();

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
		MailStopType fixture = getFixture3();

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
		MailStopType fixture = getFixture4();

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
		MailStopType fixture = getFixture1();

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
		MailStopType fixture = getFixture2();

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
		MailStopType fixture = getFixture3();

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
		MailStopType fixture = getFixture4();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the MailStopType.MailStopName getMailStopName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopName_fixture1_1()
		throws Exception {
		MailStopType fixture = getFixture1();

		MailStopType.MailStopName result = fixture.getMailStopName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MailStopType.MailStopName getMailStopName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopName_fixture2_1()
		throws Exception {
		MailStopType fixture = getFixture2();

		MailStopType.MailStopName result = fixture.getMailStopName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType.MailStopName getMailStopName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopName_fixture3_1()
		throws Exception {
		MailStopType fixture = getFixture3();

		MailStopType.MailStopName result = fixture.getMailStopName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType.MailStopName getMailStopName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopName_fixture4_1()
		throws Exception {
		MailStopType fixture = getFixture4();

		MailStopType.MailStopName result = fixture.getMailStopName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType.MailStopNumber getMailStopNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopNumber_fixture1_1()
		throws Exception {
		MailStopType fixture = getFixture1();

		MailStopType.MailStopNumber result = fixture.getMailStopNumber();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MailStopType.MailStopNumber getMailStopNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopNumber_fixture2_1()
		throws Exception {
		MailStopType fixture = getFixture2();

		MailStopType.MailStopNumber result = fixture.getMailStopNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNameNumberSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType.MailStopNumber getMailStopNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopNumber_fixture3_1()
		throws Exception {
		MailStopType fixture = getFixture3();

		MailStopType.MailStopNumber result = fixture.getMailStopNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNameNumberSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType.MailStopNumber getMailStopNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStopNumber_fixture4_1()
		throws Exception {
		MailStopType fixture = getFixture4();

		MailStopType.MailStopNumber result = fixture.getMailStopNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNameNumberSeparator());
		assertEquals(null, result.getCode());
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
		MailStopType fixture = getFixture1();

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
		MailStopType fixture = getFixture2();

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
		MailStopType fixture = getFixture3();

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
		MailStopType fixture = getFixture4();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		MailStopType fixture = getFixture1();

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
		MailStopType fixture = getFixture2();

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
		MailStopType fixture = getFixture3();

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
		MailStopType fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setMailStopName(MailStopName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopName_fixture1_1()
		throws Exception {
		MailStopType fixture = getFixture1();
		MailStopType.MailStopName value = new MailStopType.MailStopName();

		fixture.setMailStopName(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopName(MailStopName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopName_fixture2_1()
		throws Exception {
		MailStopType fixture = getFixture2();
		MailStopType.MailStopName value = new MailStopType.MailStopName();

		fixture.setMailStopName(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopName(MailStopName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopName_fixture3_1()
		throws Exception {
		MailStopType fixture = getFixture3();
		MailStopType.MailStopName value = new MailStopType.MailStopName();

		fixture.setMailStopName(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopName(MailStopName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopName_fixture4_1()
		throws Exception {
		MailStopType fixture = getFixture4();
		MailStopType.MailStopName value = new MailStopType.MailStopName();

		fixture.setMailStopName(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopNumber(MailStopNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopNumber_fixture1_1()
		throws Exception {
		MailStopType fixture = getFixture1();
		MailStopType.MailStopNumber value = new MailStopType.MailStopNumber();

		fixture.setMailStopNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopNumber(MailStopNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopNumber_fixture2_1()
		throws Exception {
		MailStopType fixture = getFixture2();
		MailStopType.MailStopNumber value = new MailStopType.MailStopNumber();

		fixture.setMailStopNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopNumber(MailStopNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopNumber_fixture3_1()
		throws Exception {
		MailStopType fixture = getFixture3();
		MailStopType.MailStopNumber value = new MailStopType.MailStopNumber();

		fixture.setMailStopNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStopNumber(MailStopNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStopNumber_fixture4_1()
		throws Exception {
		MailStopType fixture = getFixture4();
		MailStopType.MailStopNumber value = new MailStopType.MailStopNumber();

		fixture.setMailStopNumber(value);

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
		MailStopType fixture = getFixture1();
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
		MailStopType fixture = getFixture2();
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
		MailStopType fixture = getFixture3();
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
		MailStopType fixture = getFixture4();
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
		MailStopType fixture = getFixture2();
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
		MailStopType fixture = getFixture3();
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
		MailStopType fixture = getFixture4();
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
		MailStopType fixture = getFixture1();
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
		new org.junit.runner.JUnitCore().run(MailStopTypeTest.class);
	}
}