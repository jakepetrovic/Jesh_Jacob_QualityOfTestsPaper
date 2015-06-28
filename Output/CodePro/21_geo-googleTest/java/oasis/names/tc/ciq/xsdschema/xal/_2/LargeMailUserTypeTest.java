package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LargeMailUserTypeTest</code> contains tests for the class <code>{@link LargeMailUserType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LargeMailUserTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private LargeMailUserType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private LargeMailUserType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private LargeMailUserType fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private LargeMailUserType fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public LargeMailUserType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new LargeMailUserType();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public LargeMailUserType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new LargeMailUserType();
			fixture2.setDepartment(new Department());
			fixture2.setLargeMailUserIdentifier(new LargeMailUserType.LargeMailUserIdentifier());
			fixture2.setPostBox(new PostBox());
			fixture2.setPostalCode(new PostalCode());
			fixture2.setThoroughfare(new Thoroughfare());
			fixture2.setType("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public LargeMailUserType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new LargeMailUserType();
			fixture3.setDepartment(new Department());
			fixture3.setLargeMailUserIdentifier(new LargeMailUserType.LargeMailUserIdentifier());
			fixture3.setPostBox(new PostBox());
			fixture3.setPostalCode(new PostalCode());
			fixture3.setThoroughfare(new Thoroughfare());
			fixture3.setType("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LargeMailUserType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public LargeMailUserType getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new LargeMailUserType();
			fixture4.setDepartment(new Department());
			fixture4.setLargeMailUserIdentifier(new LargeMailUserType.LargeMailUserIdentifier());
			fixture4.setPostBox(new PostBox());
			fixture4.setPostalCode(new PostalCode());
			fixture4.setThoroughfare(new Thoroughfare());
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
		LargeMailUserType fixture = getFixture1();

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
		LargeMailUserType fixture = getFixture2();

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
		LargeMailUserType fixture = getFixture3();

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
		LargeMailUserType fixture = getFixture4();

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
		LargeMailUserType fixture = getFixture1();

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
		LargeMailUserType fixture = getFixture2();

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
		LargeMailUserType fixture = getFixture3();

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
		LargeMailUserType fixture = getFixture4();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BuildingNameType> getBuildingName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetBuildingName_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

		List<BuildingNameType> result = fixture.getBuildingName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BuildingNameType> getBuildingName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetBuildingName_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();

		List<BuildingNameType> result = fixture.getBuildingName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BuildingNameType> getBuildingName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetBuildingName_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();

		List<BuildingNameType> result = fixture.getBuildingName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BuildingNameType> getBuildingName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetBuildingName_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();

		List<BuildingNameType> result = fixture.getBuildingName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Department getDepartment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDepartment_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

		Department result = fixture.getDepartment();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Department getDepartment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDepartment_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();

		Department result = fixture.getDepartment();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the Department getDepartment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDepartment_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();

		Department result = fixture.getDepartment();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the Department getDepartment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetDepartment_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();

		Department result = fixture.getDepartment();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the LargeMailUserType.LargeMailUserIdentifier getLargeMailUserIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserIdentifier_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

		LargeMailUserType.LargeMailUserIdentifier result = fixture.getLargeMailUserIdentifier();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LargeMailUserType.LargeMailUserIdentifier getLargeMailUserIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserIdentifier_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();

		LargeMailUserType.LargeMailUserIdentifier result = fixture.getLargeMailUserIdentifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the LargeMailUserType.LargeMailUserIdentifier getLargeMailUserIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserIdentifier_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();

		LargeMailUserType.LargeMailUserIdentifier result = fixture.getLargeMailUserIdentifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the LargeMailUserType.LargeMailUserIdentifier getLargeMailUserIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserIdentifier_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();

		LargeMailUserType.LargeMailUserIdentifier result = fixture.getLargeMailUserIdentifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the List<LargeMailUserType.LargeMailUserName> getLargeMailUserName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserName_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

		List<LargeMailUserType.LargeMailUserName> result = fixture.getLargeMailUserName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<LargeMailUserType.LargeMailUserName> getLargeMailUserName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserName_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();

		List<LargeMailUserType.LargeMailUserName> result = fixture.getLargeMailUserName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<LargeMailUserType.LargeMailUserName> getLargeMailUserName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserName_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();

		List<LargeMailUserType.LargeMailUserName> result = fixture.getLargeMailUserName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<LargeMailUserType.LargeMailUserName> getLargeMailUserName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetLargeMailUserName_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();

		List<LargeMailUserType.LargeMailUserName> result = fixture.getLargeMailUserName();

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
	public void testGetOtherAttributes_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

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
		LargeMailUserType fixture = getFixture2();

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
		LargeMailUserType fixture = getFixture3();

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
		LargeMailUserType fixture = getFixture4();

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
		LargeMailUserType fixture = getFixture1();

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
		LargeMailUserType fixture = getFixture2();

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
		LargeMailUserType fixture = getFixture3();

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
		LargeMailUserType fixture = getFixture4();

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
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalCode_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

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
		LargeMailUserType fixture = getFixture2();

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
		LargeMailUserType fixture = getFixture3();

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
		LargeMailUserType fixture = getFixture4();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the Thoroughfare getThoroughfare() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetThoroughfare_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();

		Thoroughfare result = fixture.getThoroughfare();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Thoroughfare getThoroughfare() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetThoroughfare_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();

		Thoroughfare result = fixture.getThoroughfare();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getThoroughfarePreDirection());
		assertEquals(null, result.getThoroughfareLeadingType());
		assertEquals(null, result.getThoroughfareTrailingType());
		assertEquals(null, result.getThoroughfarePostDirection());
		assertEquals(null, result.getDependentThoroughfare());
		assertEquals(null, result.getDependentThoroughfares());
		assertEquals(null, result.getDependentThoroughfaresIndicator());
		assertEquals(null, result.getDependentThoroughfaresConnector());
		assertEquals(null, result.getDependentThoroughfaresType());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getPremise());
		assertEquals(null, result.getDependentLocality());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the Thoroughfare getThoroughfare() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetThoroughfare_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();

		Thoroughfare result = fixture.getThoroughfare();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getThoroughfarePreDirection());
		assertEquals(null, result.getThoroughfareLeadingType());
		assertEquals(null, result.getThoroughfareTrailingType());
		assertEquals(null, result.getThoroughfarePostDirection());
		assertEquals(null, result.getDependentThoroughfare());
		assertEquals(null, result.getDependentThoroughfares());
		assertEquals(null, result.getDependentThoroughfaresIndicator());
		assertEquals(null, result.getDependentThoroughfaresConnector());
		assertEquals(null, result.getDependentThoroughfaresType());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getPremise());
		assertEquals(null, result.getDependentLocality());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the Thoroughfare getThoroughfare() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetThoroughfare_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();

		Thoroughfare result = fixture.getThoroughfare();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getThoroughfarePreDirection());
		assertEquals(null, result.getThoroughfareLeadingType());
		assertEquals(null, result.getThoroughfareTrailingType());
		assertEquals(null, result.getThoroughfarePostDirection());
		assertEquals(null, result.getDependentThoroughfare());
		assertEquals(null, result.getDependentThoroughfares());
		assertEquals(null, result.getDependentThoroughfaresIndicator());
		assertEquals(null, result.getDependentThoroughfaresConnector());
		assertEquals(null, result.getDependentThoroughfaresType());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getPremise());
		assertEquals(null, result.getDependentLocality());
		assertEquals(null, result.getFirm());
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
		LargeMailUserType fixture = getFixture1();

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
		LargeMailUserType fixture = getFixture2();

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
		LargeMailUserType fixture = getFixture3();

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
		LargeMailUserType fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setDepartment(Department) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetDepartment_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();
		Department value = new Department();

		fixture.setDepartment(value);

		// add additional test code here
	}

	/**
	 * Run the void setDepartment(Department) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetDepartment_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();
		Department value = new Department();

		fixture.setDepartment(value);

		// add additional test code here
	}

	/**
	 * Run the void setDepartment(Department) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetDepartment_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();
		Department value = new Department();

		fixture.setDepartment(value);

		// add additional test code here
	}

	/**
	 * Run the void setDepartment(Department) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetDepartment_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();
		Department value = new Department();

		fixture.setDepartment(value);

		// add additional test code here
	}

	/**
	 * Run the void setLargeMailUserIdentifier(LargeMailUserIdentifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetLargeMailUserIdentifier_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();
		LargeMailUserType.LargeMailUserIdentifier value = new LargeMailUserType.LargeMailUserIdentifier();

		fixture.setLargeMailUserIdentifier(value);

		// add additional test code here
	}

	/**
	 * Run the void setLargeMailUserIdentifier(LargeMailUserIdentifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetLargeMailUserIdentifier_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();
		LargeMailUserType.LargeMailUserIdentifier value = new LargeMailUserType.LargeMailUserIdentifier();

		fixture.setLargeMailUserIdentifier(value);

		// add additional test code here
	}

	/**
	 * Run the void setLargeMailUserIdentifier(LargeMailUserIdentifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetLargeMailUserIdentifier_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();
		LargeMailUserType.LargeMailUserIdentifier value = new LargeMailUserType.LargeMailUserIdentifier();

		fixture.setLargeMailUserIdentifier(value);

		// add additional test code here
	}

	/**
	 * Run the void setLargeMailUserIdentifier(LargeMailUserIdentifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetLargeMailUserIdentifier_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();
		LargeMailUserType.LargeMailUserIdentifier value = new LargeMailUserType.LargeMailUserIdentifier();

		fixture.setLargeMailUserIdentifier(value);

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
		LargeMailUserType fixture = getFixture1();
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
		LargeMailUserType fixture = getFixture2();
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
		LargeMailUserType fixture = getFixture3();
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
		LargeMailUserType fixture = getFixture4();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

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
		LargeMailUserType fixture = getFixture1();
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
		LargeMailUserType fixture = getFixture2();
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
		LargeMailUserType fixture = getFixture3();
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
		LargeMailUserType fixture = getFixture4();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setThoroughfare(Thoroughfare) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetThoroughfare_fixture1_1()
		throws Exception {
		LargeMailUserType fixture = getFixture1();
		Thoroughfare value = new Thoroughfare();

		fixture.setThoroughfare(value);

		// add additional test code here
	}

	/**
	 * Run the void setThoroughfare(Thoroughfare) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetThoroughfare_fixture2_1()
		throws Exception {
		LargeMailUserType fixture = getFixture2();
		Thoroughfare value = new Thoroughfare();

		fixture.setThoroughfare(value);

		// add additional test code here
	}

	/**
	 * Run the void setThoroughfare(Thoroughfare) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetThoroughfare_fixture3_1()
		throws Exception {
		LargeMailUserType fixture = getFixture3();
		Thoroughfare value = new Thoroughfare();

		fixture.setThoroughfare(value);

		// add additional test code here
	}

	/**
	 * Run the void setThoroughfare(Thoroughfare) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetThoroughfare_fixture4_1()
		throws Exception {
		LargeMailUserType fixture = getFixture4();
		Thoroughfare value = new Thoroughfare();

		fixture.setThoroughfare(value);

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
		LargeMailUserType fixture = getFixture1();
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
		LargeMailUserType fixture = getFixture2();
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
		LargeMailUserType fixture = getFixture3();
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
		LargeMailUserType fixture = getFixture4();
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
		LargeMailUserType fixture = getFixture2();
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
		LargeMailUserType fixture = getFixture3();
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
		LargeMailUserType fixture = getFixture4();
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
		LargeMailUserType fixture = getFixture1();
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
		new org.junit.runner.JUnitCore().run(LargeMailUserTypeTest.class);
	}
}