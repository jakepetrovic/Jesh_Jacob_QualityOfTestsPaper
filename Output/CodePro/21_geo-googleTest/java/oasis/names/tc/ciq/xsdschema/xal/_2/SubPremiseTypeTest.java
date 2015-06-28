package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SubPremiseTypeTest</code> contains tests for the class <code>{@link SubPremiseType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SubPremiseTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private SubPremiseType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private SubPremiseType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private SubPremiseType fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private SubPremiseType fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public SubPremiseType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SubPremiseType();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public SubPremiseType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SubPremiseType();
			fixture2.setFirm(new FirmType());
			fixture2.setMailStop(new MailStopType());
			fixture2.setPostalCode(new PostalCode());
			fixture2.setSubPremise(new SubPremiseType());
			fixture2.setSubPremiseLocation(new SubPremiseType.SubPremiseLocation());
			fixture2.setType("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public SubPremiseType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new SubPremiseType();
			fixture3.setFirm(new FirmType());
			fixture3.setMailStop(new MailStopType());
			fixture3.setPostalCode(new PostalCode());
			fixture3.setSubPremise(new SubPremiseType());
			fixture3.setSubPremiseLocation(new SubPremiseType.SubPremiseLocation());
			fixture3.setType("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubPremiseType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public SubPremiseType getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new SubPremiseType();
			fixture4.setFirm(new FirmType());
			fixture4.setMailStop(new MailStopType());
			fixture4.setPostalCode(new PostalCode());
			fixture4.setSubPremise(new SubPremiseType());
			fixture4.setSubPremiseLocation(new SubPremiseType.SubPremiseLocation());
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
		SubPremiseType fixture = getFixture1();

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
		SubPremiseType fixture = getFixture2();

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
		SubPremiseType fixture = getFixture3();

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
		SubPremiseType fixture = getFixture4();

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
		SubPremiseType fixture = getFixture1();

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
		SubPremiseType fixture = getFixture2();

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
		SubPremiseType fixture = getFixture3();

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
		SubPremiseType fixture = getFixture4();

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
		SubPremiseType fixture = getFixture1();

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
		SubPremiseType fixture = getFixture2();

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
		SubPremiseType fixture = getFixture3();

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
		SubPremiseType fixture = getFixture4();

		List<BuildingNameType> result = fixture.getBuildingName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FirmType getFirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetFirm_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		FirmType result = fixture.getFirm();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FirmType getFirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetFirm_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		FirmType result = fixture.getFirm();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the FirmType getFirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetFirm_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		FirmType result = fixture.getFirm();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the FirmType getFirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetFirm_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		FirmType result = fixture.getFirm();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the MailStopType getMailStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStop_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		MailStopType result = fixture.getMailStop();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MailStopType getMailStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStop_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		MailStopType result = fixture.getMailStop();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStopName());
		assertEquals(null, result.getMailStopNumber());
	}

	/**
	 * Run the MailStopType getMailStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStop_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		MailStopType result = fixture.getMailStop();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStopName());
		assertEquals(null, result.getMailStopNumber());
	}

	/**
	 * Run the MailStopType getMailStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetMailStop_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		MailStopType result = fixture.getMailStop();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStopName());
		assertEquals(null, result.getMailStopNumber());
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
		SubPremiseType fixture = getFixture1();

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
		SubPremiseType fixture = getFixture2();

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
		SubPremiseType fixture = getFixture3();

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
		SubPremiseType fixture = getFixture4();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		SubPremiseType fixture = getFixture1();

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
		SubPremiseType fixture = getFixture2();

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
		SubPremiseType fixture = getFixture3();

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
		SubPremiseType fixture = getFixture4();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the SubPremiseType getSubPremise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremise_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		SubPremiseType result = fixture.getSubPremise();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SubPremiseType getSubPremise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremise_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		SubPremiseType result = fixture.getSubPremise();

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
	 * Run the SubPremiseType getSubPremise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremise_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		SubPremiseType result = fixture.getSubPremise();

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
	 * Run the SubPremiseType getSubPremise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremise_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		SubPremiseType result = fixture.getSubPremise();

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
	 * Run the SubPremiseType.SubPremiseLocation getSubPremiseLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseLocation_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		SubPremiseType.SubPremiseLocation result = fixture.getSubPremiseLocation();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SubPremiseType.SubPremiseLocation getSubPremiseLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseLocation_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		SubPremiseType.SubPremiseLocation result = fixture.getSubPremiseLocation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the SubPremiseType.SubPremiseLocation getSubPremiseLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseLocation_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		SubPremiseType.SubPremiseLocation result = fixture.getSubPremiseLocation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the SubPremiseType.SubPremiseLocation getSubPremiseLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseLocation_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		SubPremiseType.SubPremiseLocation result = fixture.getSubPremiseLocation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseName> getSubPremiseName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseName_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		List<SubPremiseType.SubPremiseName> result = fixture.getSubPremiseName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseName> getSubPremiseName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseName_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		List<SubPremiseType.SubPremiseName> result = fixture.getSubPremiseName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseName> getSubPremiseName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseName_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		List<SubPremiseType.SubPremiseName> result = fixture.getSubPremiseName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseName> getSubPremiseName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseName_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		List<SubPremiseType.SubPremiseName> result = fixture.getSubPremiseName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumber> getSubPremiseNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumber_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		List<SubPremiseType.SubPremiseNumber> result = fixture.getSubPremiseNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumber> getSubPremiseNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumber_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		List<SubPremiseType.SubPremiseNumber> result = fixture.getSubPremiseNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumber> getSubPremiseNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumber_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		List<SubPremiseType.SubPremiseNumber> result = fixture.getSubPremiseNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumber> getSubPremiseNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumber_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		List<SubPremiseType.SubPremiseNumber> result = fixture.getSubPremiseNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberPrefix> getSubPremiseNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberPrefix_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		List<SubPremiseType.SubPremiseNumberPrefix> result = fixture.getSubPremiseNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberPrefix> getSubPremiseNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberPrefix_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		List<SubPremiseType.SubPremiseNumberPrefix> result = fixture.getSubPremiseNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberPrefix> getSubPremiseNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberPrefix_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		List<SubPremiseType.SubPremiseNumberPrefix> result = fixture.getSubPremiseNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberPrefix> getSubPremiseNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberPrefix_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		List<SubPremiseType.SubPremiseNumberPrefix> result = fixture.getSubPremiseNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberSuffix> getSubPremiseNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberSuffix_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();

		List<SubPremiseType.SubPremiseNumberSuffix> result = fixture.getSubPremiseNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberSuffix> getSubPremiseNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberSuffix_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();

		List<SubPremiseType.SubPremiseNumberSuffix> result = fixture.getSubPremiseNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberSuffix> getSubPremiseNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberSuffix_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();

		List<SubPremiseType.SubPremiseNumberSuffix> result = fixture.getSubPremiseNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SubPremiseType.SubPremiseNumberSuffix> getSubPremiseNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetSubPremiseNumberSuffix_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();

		List<SubPremiseType.SubPremiseNumberSuffix> result = fixture.getSubPremiseNumberSuffix();

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
		SubPremiseType fixture = getFixture1();

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
		SubPremiseType fixture = getFixture2();

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
		SubPremiseType fixture = getFixture3();

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
		SubPremiseType fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetFirm_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetFirm_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetFirm_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetFirm_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStop(MailStopType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStop_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();
		MailStopType value = new MailStopType();

		fixture.setMailStop(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStop(MailStopType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStop_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();
		MailStopType value = new MailStopType();

		fixture.setMailStop(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStop(MailStopType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStop_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();
		MailStopType value = new MailStopType();

		fixture.setMailStop(value);

		// add additional test code here
	}

	/**
	 * Run the void setMailStop(MailStopType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetMailStop_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();
		MailStopType value = new MailStopType();

		fixture.setMailStop(value);

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
		SubPremiseType fixture = getFixture1();
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
		SubPremiseType fixture = getFixture2();
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
		SubPremiseType fixture = getFixture3();
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
		SubPremiseType fixture = getFixture4();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremise(SubPremiseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremise_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();
		SubPremiseType value = new SubPremiseType();

		fixture.setSubPremise(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremise(SubPremiseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremise_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();
		SubPremiseType value = new SubPremiseType();

		fixture.setSubPremise(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremise(SubPremiseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremise_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();
		SubPremiseType value = new SubPremiseType();

		fixture.setSubPremise(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremise(SubPremiseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremise_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();
		SubPremiseType value = new SubPremiseType();

		fixture.setSubPremise(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremiseLocation(SubPremiseLocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremiseLocation_fixture1_1()
		throws Exception {
		SubPremiseType fixture = getFixture1();
		SubPremiseType.SubPremiseLocation value = new SubPremiseType.SubPremiseLocation();

		fixture.setSubPremiseLocation(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremiseLocation(SubPremiseLocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremiseLocation_fixture2_1()
		throws Exception {
		SubPremiseType fixture = getFixture2();
		SubPremiseType.SubPremiseLocation value = new SubPremiseType.SubPremiseLocation();

		fixture.setSubPremiseLocation(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremiseLocation(SubPremiseLocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremiseLocation_fixture3_1()
		throws Exception {
		SubPremiseType fixture = getFixture3();
		SubPremiseType.SubPremiseLocation value = new SubPremiseType.SubPremiseLocation();

		fixture.setSubPremiseLocation(value);

		// add additional test code here
	}

	/**
	 * Run the void setSubPremiseLocation(SubPremiseLocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetSubPremiseLocation_fixture4_1()
		throws Exception {
		SubPremiseType fixture = getFixture4();
		SubPremiseType.SubPremiseLocation value = new SubPremiseType.SubPremiseLocation();

		fixture.setSubPremiseLocation(value);

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
		SubPremiseType fixture = getFixture1();
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
		SubPremiseType fixture = getFixture2();
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
		SubPremiseType fixture = getFixture3();
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
		SubPremiseType fixture = getFixture4();
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
		SubPremiseType fixture = getFixture2();
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
		SubPremiseType fixture = getFixture3();
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
		SubPremiseType fixture = getFixture4();
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
		SubPremiseType fixture = getFixture1();
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
		new org.junit.runner.JUnitCore().run(SubPremiseTypeTest.class);
	}
}