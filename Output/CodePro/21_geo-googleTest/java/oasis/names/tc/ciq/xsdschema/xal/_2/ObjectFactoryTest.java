package oasis.names.tc.ciq.xsdschema.xal._2;

import javax.xml.bind.JAXBElement;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ObjectFactoryTest</code> contains tests for the class <code>{@link ObjectFactory}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ObjectFactoryTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ObjectFactory
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private ObjectFactory fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ObjectFactory
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public ObjectFactory getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ObjectFactory();
		}
		return fixture;
	}

	/**
	 * Run the ObjectFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testObjectFactory_1()
		throws Exception {

		ObjectFactory result = new ObjectFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AddressDetails createAddressDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetails_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails result = fixture2.createAddressDetails();

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
	 * Run the JAXBElement<AddressDetails> createAddressDetails(AddressDetails) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetails_fixture_2()
		throws Exception {
		ObjectFactory fixture2 = getFixture();
		AddressDetails value = new AddressDetails();

		JAXBElement<AddressDetails> result = fixture2.createAddressDetails(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNil());
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the AddressDetails.Address createAddressDetailsAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsAddress_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.Address result = fixture2.createAddressDetailsAddress();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.Country createAddressDetailsCountry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsCountry_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.Country result = fixture2.createAddressDetailsCountry();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getAdministrativeArea());
		assertEquals(null, result.getThoroughfare());
	}

	/**
	 * Run the AddressDetails.Country.CountryNameCode createAddressDetailsCountryCountryNameCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsCountryCountryNameCode_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.Country.CountryNameCode result = fixture2.createAddressDetailsCountryCountryNameCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getScheme());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements createAddressDetailsPostalServiceElements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElements_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements result = fixture2.createAddressDetailsPostalServiceElements();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getAddressLatitudeDirection());
		assertEquals(null, result.getAddressLongitudeDirection());
		assertEquals(null, result.getEndorsementLineCode());
		assertEquals(null, result.getKeyLineCode());
		assertEquals(null, result.getBarcode());
		assertEquals(null, result.getSortingCode());
		assertEquals(null, result.getAddressLatitude());
		assertEquals(null, result.getAddressLongitude());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.AddressIdentifier createAddressDetailsPostalServiceElementsAddressIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsAddressIdentifier_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.AddressIdentifier result = fixture2.createAddressDetailsPostalServiceElementsAddressIdentifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifierType());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.AddressLatitude createAddressDetailsPostalServiceElementsAddressLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsAddressLatitude_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.AddressLatitude result = fixture2.createAddressDetailsPostalServiceElementsAddressLatitude();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.AddressLatitudeDirection createAddressDetailsPostalServiceElementsAddressLatitudeDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsAddressLatitudeDirection_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.AddressLatitudeDirection result = fixture2.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.AddressLongitude createAddressDetailsPostalServiceElementsAddressLongitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsAddressLongitude_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.AddressLongitude result = fixture2.createAddressDetailsPostalServiceElementsAddressLongitude();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.AddressLongitudeDirection createAddressDetailsPostalServiceElementsAddressLongitudeDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsAddressLongitudeDirection_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.AddressLongitudeDirection result = fixture2.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.Barcode createAddressDetailsPostalServiceElementsBarcode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsBarcode_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.Barcode result = fixture2.createAddressDetailsPostalServiceElementsBarcode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.EndorsementLineCode createAddressDetailsPostalServiceElementsEndorsementLineCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsEndorsementLineCode_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.EndorsementLineCode result = fixture2.createAddressDetailsPostalServiceElementsEndorsementLineCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.KeyLineCode createAddressDetailsPostalServiceElementsKeyLineCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsKeyLineCode_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.KeyLineCode result = fixture2.createAddressDetailsPostalServiceElementsKeyLineCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.SortingCode createAddressDetailsPostalServiceElementsSortingCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsSortingCode_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.SortingCode result = fixture2.createAddressDetailsPostalServiceElementsSortingCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressDetails.PostalServiceElements.SupplementaryPostalServiceData createAddressDetailsPostalServiceElementsSupplementaryPostalServiceData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressDetailsPostalServiceElementsSupplementaryPostalServiceData_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressDetails.PostalServiceElements.SupplementaryPostalServiceData result = fixture2.createAddressDetailsPostalServiceElementsSupplementaryPostalServiceData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressLine createAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressLine_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressLine result = fixture2.createAddressLine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AddressLinesType createAddressLinesType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAddressLinesType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AddressLinesType result = fixture2.createAddressLinesType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AdministrativeArea createAdministrativeArea() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAdministrativeArea_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AdministrativeArea result = fixture2.createAdministrativeArea();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getType());
		assertEquals(null, result.getSubAdministrativeArea());
		assertEquals(null, result.getPostOffice());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getUsageType());
		assertEquals(null, result.getIndicator());
	}

	/**
	 * Run the AdministrativeArea.AdministrativeAreaName createAdministrativeAreaAdministrativeAreaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAdministrativeAreaAdministrativeAreaName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AdministrativeArea.AdministrativeAreaName result = fixture2.createAdministrativeAreaAdministrativeAreaName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the AdministrativeArea.SubAdministrativeArea createAdministrativeAreaSubAdministrativeArea() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAdministrativeAreaSubAdministrativeArea_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AdministrativeArea.SubAdministrativeArea result = fixture2.createAdministrativeAreaSubAdministrativeArea();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocality());
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostOffice());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getUsageType());
		assertEquals(null, result.getIndicator());
	}

	/**
	 * Run the AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName createAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName result = fixture2.createAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the BuildingNameType createBuildingNameType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateBuildingNameType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		BuildingNameType result = fixture2.createBuildingNameType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getTypeOccurrence());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the CountryName createCountryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateCountryName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		CountryName result = fixture2.createCountryName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Department createDepartment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateDepartment_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Department result = fixture2.createDepartment();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the Department.DepartmentName createDepartmentDepartmentName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateDepartmentDepartmentName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Department.DepartmentName result = fixture2.createDepartmentDepartmentName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the DependentLocalityType createDependentLocalityType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateDependentLocalityType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		DependentLocalityType result = fixture2.createDependentLocalityType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getDependentLocalityNumber());
		assertEquals(null, result.getConnector());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getPostOffice());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getUsageType());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getPostBox());
		assertEquals(null, result.getLargeMailUser());
		assertEquals(null, result.getPostalRoute());
		assertEquals(null, result.getPremise());
		assertEquals(null, result.getDependentLocality());
	}

	/**
	 * Run the DependentLocalityType.DependentLocalityName createDependentLocalityTypeDependentLocalityName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateDependentLocalityTypeDependentLocalityName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		DependentLocalityType.DependentLocalityName result = fixture2.createDependentLocalityTypeDependentLocalityName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the DependentLocalityType.DependentLocalityNumber createDependentLocalityTypeDependentLocalityNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateDependentLocalityTypeDependentLocalityNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		DependentLocalityType.DependentLocalityNumber result = fixture2.createDependentLocalityTypeDependentLocalityNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNameNumberOccurrence());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the FirmType createFirmType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateFirmType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		FirmType result = fixture2.createFirmType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the FirmType.FirmName createFirmTypeFirmName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateFirmTypeFirmName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		FirmType.FirmName result = fixture2.createFirmTypeFirmName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the LargeMailUserType createLargeMailUserType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateLargeMailUserType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		LargeMailUserType result = fixture2.createLargeMailUserType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getLargeMailUserIdentifier());
		assertEquals(null, result.getDepartment());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the LargeMailUserType.LargeMailUserIdentifier createLargeMailUserTypeLargeMailUserIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateLargeMailUserTypeLargeMailUserIdentifier_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		LargeMailUserType.LargeMailUserIdentifier result = fixture2.createLargeMailUserTypeLargeMailUserIdentifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the LargeMailUserType.LargeMailUserName createLargeMailUserTypeLargeMailUserName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateLargeMailUserTypeLargeMailUserName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		LargeMailUserType.LargeMailUserName result = fixture2.createLargeMailUserTypeLargeMailUserName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Locality createLocality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateLocality_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Locality result = fixture2.createLocality();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getThoroughfare());
		assertEquals(null, result.getPostOffice());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getUsageType());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getPostBox());
		assertEquals(null, result.getLargeMailUser());
		assertEquals(null, result.getPostalRoute());
		assertEquals(null, result.getPremise());
		assertEquals(null, result.getDependentLocality());
	}

	/**
	 * Run the Locality.LocalityName createLocalityLocalityName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateLocalityLocalityName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Locality.LocalityName result = fixture2.createLocalityLocalityName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType createMailStopType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateMailStopType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		MailStopType result = fixture2.createMailStopType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStopName());
		assertEquals(null, result.getMailStopNumber());
	}

	/**
	 * Run the MailStopType.MailStopName createMailStopTypeMailStopName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateMailStopTypeMailStopName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		MailStopType.MailStopName result = fixture2.createMailStopTypeMailStopName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the MailStopType.MailStopNumber createMailStopTypeMailStopNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateMailStopTypeMailStopNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		MailStopType.MailStopNumber result = fixture2.createMailStopTypeMailStopNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNameNumberSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox createPostBox() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostBox_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostBox result = fixture2.createPostBox();

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
	 * Run the PostBox.PostBoxNumber createPostBoxPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostBoxPostBoxNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostBox.PostBoxNumber result = fixture2.createPostBoxPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension createPostBoxPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostBoxPostBoxNumberExtension_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostBox.PostBoxNumberExtension result = fixture2.createPostBoxPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix createPostBoxPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostBoxPostBoxNumberPrefix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostBox.PostBoxNumberPrefix result = fixture2.createPostBoxPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix createPostBoxPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostBoxPostBoxNumberSuffix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostBox.PostBoxNumberSuffix result = fixture2.createPostBoxPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice createPostOffice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostOffice_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostOffice result = fixture2.createPostOffice();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostOfficeNumber());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getPostBox());
		assertEquals(null, result.getPostalRoute());
	}

	/**
	 * Run the PostOffice.PostOfficeName createPostOfficePostOfficeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostOfficePostOfficeName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostOffice.PostOfficeName result = fixture2.createPostOfficePostOfficeName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostOffice.PostOfficeNumber createPostOfficePostOfficeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostOfficePostOfficeNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostOffice.PostOfficeNumber result = fixture2.createPostOfficePostOfficeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalCode createPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalCode_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalCode result = fixture2.createPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the PostalCode.PostTown createPostalCodePostTown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalCodePostTown_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalCode.PostTown result = fixture2.createPostalCodePostTown();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTownSuffix());
	}

	/**
	 * Run the PostalCode.PostTown.PostTownName createPostalCodePostTownPostTownName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalCodePostTownPostTownName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalCode.PostTown.PostTownName result = fixture2.createPostalCodePostTownPostTownName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalCode.PostTown.PostTownSuffix createPostalCodePostTownPostTownSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalCodePostTownPostTownSuffix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalCode.PostTown.PostTownSuffix result = fixture2.createPostalCodePostTownPostTownSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalCode.PostalCodeNumber createPostalCodePostalCodeNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalCodePostalCodeNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalCode.PostalCodeNumber result = fixture2.createPostalCodePostalCodeNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalCode.PostalCodeNumberExtension createPostalCodePostalCodeNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalCodePostalCodeNumberExtension_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalCode.PostalCodeNumberExtension result = fixture2.createPostalCodePostalCodeNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalRouteType createPostalRouteType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalRouteType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalRouteType result = fixture2.createPostalRouteType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostalRouteNumber());
		assertEquals(null, result.getPostBox());
	}

	/**
	 * Run the PostalRouteType.PostalRouteName createPostalRouteTypePostalRouteName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalRouteTypePostalRouteName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalRouteType.PostalRouteName result = fixture2.createPostalRouteTypePostalRouteName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalRouteType.PostalRouteNumber createPostalRouteTypePostalRouteNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePostalRouteTypePostalRouteNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PostalRouteType.PostalRouteNumber result = fixture2.createPostalRouteTypePostalRouteNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Premise createPremise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremise_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Premise result = fixture2.createPremise();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPremiseDependencyType());
		assertEquals(null, result.getPremiseThoroughfareConnector());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPremiseLocation());
		assertEquals(null, result.getPremiseNumberRange());
		assertEquals(null, result.getPremiseDependency());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getPremise());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the PremiseNumber createPremiseNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremiseNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PremiseNumber result = fixture2.createPremiseNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberTypeOccurrence());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getNumberType());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PremiseNumberPrefix createPremiseNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremiseNumberPrefix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PremiseNumberPrefix result = fixture2.createPremiseNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getType());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PremiseNumberSuffix createPremiseNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremiseNumberSuffix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PremiseNumberSuffix result = fixture2.createPremiseNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Premise.PremiseLocation createPremisePremiseLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremisePremiseLocation_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Premise.PremiseLocation result = fixture2.createPremisePremiseLocation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Premise.PremiseName createPremisePremiseName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremisePremiseName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Premise.PremiseName result = fixture2.createPremisePremiseName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getTypeOccurrence());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Premise.PremiseNumberRange createPremisePremiseNumberRange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremisePremiseNumberRange_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Premise.PremiseNumberRange result = fixture2.createPremisePremiseNumberRange();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getSeparator());
		assertEquals(null, result.getPremiseNumberRangeFrom());
		assertEquals(null, result.getPremiseNumberRangeTo());
		assertEquals(null, result.getNumberRangeOccurence());
		assertEquals(null, result.getRangeType());
		assertEquals(null, result.getIndicatorOccurence());
		assertEquals(null, result.getIndicator());
	}

	/**
	 * Run the Premise.PremiseNumberRange.PremiseNumberRangeFrom createPremisePremiseNumberRangePremiseNumberRangeFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremisePremiseNumberRangePremiseNumberRangeFrom_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Premise.PremiseNumberRange.PremiseNumberRangeFrom result = fixture2.createPremisePremiseNumberRangePremiseNumberRangeFrom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Premise.PremiseNumberRange.PremiseNumberRangeTo createPremisePremiseNumberRangePremiseNumberRangeTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePremisePremiseNumberRangePremiseNumberRangeTo_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Premise.PremiseNumberRange.PremiseNumberRangeTo result = fixture2.createPremisePremiseNumberRangePremiseNumberRangeTo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SubPremiseType createSubPremiseType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateSubPremiseType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		SubPremiseType result = fixture2.createSubPremiseType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getSubPremiseLocation());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getSubPremise());
		assertEquals(null, result.getPostalCode());
		assertEquals(null, result.getFirm());
	}

	/**
	 * Run the SubPremiseType.SubPremiseLocation createSubPremiseTypeSubPremiseLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateSubPremiseTypeSubPremiseLocation_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		SubPremiseType.SubPremiseLocation result = fixture2.createSubPremiseTypeSubPremiseLocation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the SubPremiseType.SubPremiseName createSubPremiseTypeSubPremiseName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateSubPremiseTypeSubPremiseName_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		SubPremiseType.SubPremiseName result = fixture2.createSubPremiseTypeSubPremiseName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getTypeOccurrence());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the SubPremiseType.SubPremiseNumber createSubPremiseTypeSubPremiseNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateSubPremiseTypeSubPremiseNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		SubPremiseType.SubPremiseNumber result = fixture2.createSubPremiseTypeSubPremiseNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getPremiseNumberSeparator());
		assertEquals(null, result.getNumberTypeOccurrence());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the SubPremiseType.SubPremiseNumberPrefix createSubPremiseTypeSubPremiseNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateSubPremiseTypeSubPremiseNumberPrefix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		SubPremiseType.SubPremiseNumberPrefix result = fixture2.createSubPremiseTypeSubPremiseNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the SubPremiseType.SubPremiseNumberSuffix createSubPremiseTypeSubPremiseNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateSubPremiseTypeSubPremiseNumberSuffix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		SubPremiseType.SubPremiseNumberSuffix result = fixture2.createSubPremiseTypeSubPremiseNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Thoroughfare createThoroughfare() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfare_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Thoroughfare result = fixture2.createThoroughfare();

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
	 * Run the Thoroughfare.DependentThoroughfare createThoroughfareDependentThoroughfare() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareDependentThoroughfare_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Thoroughfare.DependentThoroughfare result = fixture2.createThoroughfareDependentThoroughfare();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getThoroughfarePreDirection());
		assertEquals(null, result.getThoroughfareLeadingType());
		assertEquals(null, result.getThoroughfareTrailingType());
		assertEquals(null, result.getThoroughfarePostDirection());
	}

	/**
	 * Run the ThoroughfareLeadingTypeType createThoroughfareLeadingTypeType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareLeadingTypeType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfareLeadingTypeType result = fixture2.createThoroughfareLeadingTypeType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfareNameType createThoroughfareNameType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareNameType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfareNameType result = fixture2.createThoroughfareNameType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfareNumber createThoroughfareNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareNumber_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfareNumber result = fixture2.createThoroughfareNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getNumberType());
		assertEquals(null, result.getNumberOccurrence());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfareNumberPrefix createThoroughfareNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareNumberPrefix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfareNumberPrefix result = fixture2.createThoroughfareNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfareNumberSuffix createThoroughfareNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareNumberSuffix_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfareNumberSuffix result = fixture2.createThoroughfareNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfarePostDirectionType createThoroughfarePostDirectionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfarePostDirectionType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfarePostDirectionType result = fixture2.createThoroughfarePostDirectionType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfarePreDirectionType createThoroughfarePreDirectionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfarePreDirectionType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfarePreDirectionType result = fixture2.createThoroughfarePreDirectionType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Thoroughfare.ThoroughfareNumberRange createThoroughfareThoroughfareNumberRange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareThoroughfareNumberRange_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Thoroughfare.ThoroughfareNumberRange result = fixture2.createThoroughfareThoroughfareNumberRange();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getSeparator());
		assertEquals(null, result.getNumberRangeOccurrence());
		assertEquals(null, result.getThoroughfareNumberFrom());
		assertEquals(null, result.getThoroughfareNumberTo());
		assertEquals(null, result.getIndicatorOccurrence());
		assertEquals(null, result.getRangeType());
		assertEquals(null, result.getIndicator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom createThoroughfareThoroughfareNumberRangeThoroughfareNumberFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareThoroughfareNumberRangeThoroughfareNumberFrom_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom result = fixture2.createThoroughfareThoroughfareNumberRangeThoroughfareNumberFrom();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareThoroughfareNumberRangeThoroughfareNumberTo_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo result = fixture2.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the ThoroughfareTrailingTypeType createThoroughfareTrailingTypeType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateThoroughfareTrailingTypeType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ThoroughfareTrailingTypeType result = fixture2.createThoroughfareTrailingTypeType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the XAL createXAL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateXAL_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		XAL result = fixture2.createXAL();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getVersion());
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
		new org.junit.runner.JUnitCore().run(ObjectFactoryTest.class);
	}
}