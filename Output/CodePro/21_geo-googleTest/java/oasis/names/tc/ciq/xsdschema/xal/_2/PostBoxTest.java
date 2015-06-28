package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PostBoxTest</code> contains tests for the class <code>{@link PostBox}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:06 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PostBoxTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	private PostBox fixture10;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PostBox();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PostBox();
			fixture2.setFirm(new FirmType());
			fixture2.setIndicator("");
			fixture2.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture2.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture2.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture2.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture2.setPostalCode(new PostalCode());
			fixture2.setType("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PostBox();
			fixture3.setFirm(new FirmType());
			fixture3.setIndicator("");
			fixture3.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture3.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture3.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture3.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture3.setPostalCode(new PostalCode());
			fixture3.setType("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new PostBox();
			fixture4.setFirm(new FirmType());
			fixture4.setIndicator("");
			fixture4.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture4.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture4.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture4.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture4.setPostalCode(new PostalCode());
			fixture4.setType("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new PostBox();
			fixture5.setFirm(new FirmType());
			fixture5.setIndicator("0123456789");
			fixture5.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture5.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture5.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture5.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture5.setPostalCode(new PostalCode());
			fixture5.setType("");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new PostBox();
			fixture6.setFirm(new FirmType());
			fixture6.setIndicator("0123456789");
			fixture6.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture6.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture6.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture6.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture6.setPostalCode(new PostalCode());
			fixture6.setType("0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new PostBox();
			fixture7.setFirm(new FirmType());
			fixture7.setIndicator("0123456789");
			fixture7.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture7.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture7.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture7.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture7.setPostalCode(new PostalCode());
			fixture7.setType("An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new PostBox();
			fixture8.setFirm(new FirmType());
			fixture8.setIndicator("An��t-1.0.txt");
			fixture8.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture8.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture8.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture8.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture8.setPostalCode(new PostalCode());
			fixture8.setType("");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new PostBox();
			fixture9.setFirm(new FirmType());
			fixture9.setIndicator("An��t-1.0.txt");
			fixture9.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture9.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture9.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture9.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture9.setPostalCode(new PostalCode());
			fixture9.setType("0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostBox
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public PostBox getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new PostBox();
			fixture10.setFirm(new FirmType());
			fixture10.setIndicator("An��t-1.0.txt");
			fixture10.setPostBoxNumber(new PostBox.PostBoxNumber());
			fixture10.setPostBoxNumberExtension(new PostBox.PostBoxNumberExtension());
			fixture10.setPostBoxNumberPrefix(new PostBox.PostBoxNumberPrefix());
			fixture10.setPostBoxNumberSuffix(new PostBox.PostBoxNumberSuffix());
			fixture10.setPostalCode(new PostalCode());
			fixture10.setType("An��t-1.0.txt");
		}
		return fixture10;
	}

	/**
	 * Run the List<AddressLine> getAddressLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAddressLine_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetAny_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		List<Object> result = fixture.getAny();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FirmType getFirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		FirmType result = fixture.getFirm();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FirmType getFirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetFirm_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		FirmType result = fixture.getFirm();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getMailStop());
		assertEquals(null, result.getPostalCode());
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getIndicator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetIndicator_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		String result = fixture.getIndicator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the Map<QName, String> getOtherAttributes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetOtherAttributes_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		Map<QName, String> result = fixture.getOtherAttributes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumber getPostBoxNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumber_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		PostBox.PostBoxNumber result = fixture.getPostBoxNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberExtension getPostBoxNumberExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberExtension_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		PostBox.PostBoxNumberExtension result = fixture.getPostBoxNumberExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberExtensionSeparator());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberPrefix getPostBoxNumberPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberPrefix_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		PostBox.PostBoxNumberPrefix result = fixture.getPostBoxNumberPrefix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberPrefixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostBox.PostBoxNumberSuffix getPostBoxNumberSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostBoxNumberSuffix_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		PostBox.PostBoxNumberSuffix result = fixture.getPostBoxNumberSuffix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getNumberSuffixSeparator());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostalCode getPostalCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetPostalCode_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		PostalCode result = fixture.getPostalCode();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getPostTown());
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();

		String result = fixture.getType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testGetType_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setFirm(FirmType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetFirm_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		FirmType value = new FirmType();

		fixture.setFirm(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture2_2()
		throws Exception {
		PostBox fixture = getFixture2();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture3_2()
		throws Exception {
		PostBox fixture = getFixture3();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture4_2()
		throws Exception {
		PostBox fixture = getFixture4();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture5_2()
		throws Exception {
		PostBox fixture = getFixture5();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture6_2()
		throws Exception {
		PostBox fixture = getFixture6();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture7_2()
		throws Exception {
		PostBox fixture = getFixture7();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture8_2()
		throws Exception {
		PostBox fixture = getFixture8();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture9_2()
		throws Exception {
		PostBox fixture = getFixture9();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture10_2()
		throws Exception {
		PostBox fixture = getFixture10();
		String value = "";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setIndicator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetIndicator_fixture1_2()
		throws Exception {
		PostBox fixture = getFixture1();
		String value = "0123456789";

		fixture.setIndicator(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumber(PostBoxNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumber_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		PostBox.PostBoxNumber value = new PostBox.PostBoxNumber();

		fixture.setPostBoxNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberExtension(PostBoxNumberExtension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberExtension_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		PostBox.PostBoxNumberExtension value = new PostBox.PostBoxNumberExtension();

		fixture.setPostBoxNumberExtension(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberPrefix(PostBoxNumberPrefix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberPrefix_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		PostBox.PostBoxNumberPrefix value = new PostBox.PostBoxNumberPrefix();

		fixture.setPostBoxNumberPrefix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostBoxNumberSuffix(PostBoxNumberSuffix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostBoxNumberSuffix_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		PostBox.PostBoxNumberSuffix value = new PostBox.PostBoxNumberSuffix();

		fixture.setPostBoxNumberSuffix(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalCode(PostalCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetPostalCode_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		PostalCode value = new PostalCode();

		fixture.setPostalCode(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture1_1()
		throws Exception {
		PostBox fixture = getFixture1();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture2_1()
		throws Exception {
		PostBox fixture = getFixture2();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture3_1()
		throws Exception {
		PostBox fixture = getFixture3();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture4_1()
		throws Exception {
		PostBox fixture = getFixture4();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture5_1()
		throws Exception {
		PostBox fixture = getFixture5();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture6_1()
		throws Exception {
		PostBox fixture = getFixture6();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture7_1()
		throws Exception {
		PostBox fixture = getFixture7();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture8_1()
		throws Exception {
		PostBox fixture = getFixture8();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture9_1()
		throws Exception {
		PostBox fixture = getFixture9();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture10_1()
		throws Exception {
		PostBox fixture = getFixture10();
		String value = "0123456789";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture2_2()
		throws Exception {
		PostBox fixture = getFixture2();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture3_2()
		throws Exception {
		PostBox fixture = getFixture3();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture4_2()
		throws Exception {
		PostBox fixture = getFixture4();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture5_2()
		throws Exception {
		PostBox fixture = getFixture5();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture6_2()
		throws Exception {
		PostBox fixture = getFixture6();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture7_2()
		throws Exception {
		PostBox fixture = getFixture7();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture8_2()
		throws Exception {
		PostBox fixture = getFixture8();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture9_2()
		throws Exception {
		PostBox fixture = getFixture9();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture10_2()
		throws Exception {
		PostBox fixture = getFixture10();
		String value = "";

		fixture.setType(value);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	@Test
	public void testSetType_fixture1_2()
		throws Exception {
		PostBox fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
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
	 * @generatedBy CodePro at 6/7/15 3:06 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PostBoxTest.class);
	}
}