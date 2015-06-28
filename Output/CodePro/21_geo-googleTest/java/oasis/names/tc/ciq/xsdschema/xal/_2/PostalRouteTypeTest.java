package oasis.names.tc.ciq.xsdschema.xal._2;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PostalRouteTypeTest</code> contains tests for the class <code>{@link PostalRouteType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PostalRouteTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostalRouteType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostalRouteType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostalRouteType fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private PostalRouteType fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostalRouteType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PostalRouteType();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostalRouteType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PostalRouteType();
			fixture2.setPostBox(new PostBox());
			fixture2.setPostalRouteNumber(new PostalRouteType.PostalRouteNumber());
			fixture2.setType("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostalRouteType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PostalRouteType();
			fixture3.setPostBox(new PostBox());
			fixture3.setPostalRouteNumber(new PostalRouteType.PostalRouteNumber());
			fixture3.setType("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PostalRouteType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public PostalRouteType getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new PostalRouteType();
			fixture4.setPostBox(new PostBox());
			fixture4.setPostalRouteNumber(new PostalRouteType.PostalRouteNumber());
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
		PostalRouteType fixture = getFixture1();

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
		PostalRouteType fixture = getFixture2();

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
		PostalRouteType fixture = getFixture3();

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
		PostalRouteType fixture = getFixture4();

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
		PostalRouteType fixture = getFixture1();

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
		PostalRouteType fixture = getFixture2();

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
		PostalRouteType fixture = getFixture3();

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
		PostalRouteType fixture = getFixture4();

		List<Object> result = fixture.getAny();

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
		PostalRouteType fixture = getFixture1();

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
		PostalRouteType fixture = getFixture2();

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
		PostalRouteType fixture = getFixture3();

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
		PostalRouteType fixture = getFixture4();

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
		PostalRouteType fixture = getFixture1();

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
		PostalRouteType fixture = getFixture2();

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
		PostalRouteType fixture = getFixture3();

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
		PostalRouteType fixture = getFixture4();

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
	 * Run the List<PostalRouteType.PostalRouteName> getPostalRouteName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteName_fixture1_1()
		throws Exception {
		PostalRouteType fixture = getFixture1();

		List<PostalRouteType.PostalRouteName> result = fixture.getPostalRouteName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostalRouteType.PostalRouteName> getPostalRouteName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteName_fixture2_1()
		throws Exception {
		PostalRouteType fixture = getFixture2();

		List<PostalRouteType.PostalRouteName> result = fixture.getPostalRouteName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostalRouteType.PostalRouteName> getPostalRouteName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteName_fixture3_1()
		throws Exception {
		PostalRouteType fixture = getFixture3();

		List<PostalRouteType.PostalRouteName> result = fixture.getPostalRouteName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PostalRouteType.PostalRouteName> getPostalRouteName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteName_fixture4_1()
		throws Exception {
		PostalRouteType fixture = getFixture4();

		List<PostalRouteType.PostalRouteName> result = fixture.getPostalRouteName();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the PostalRouteType.PostalRouteNumber getPostalRouteNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteNumber_fixture1_1()
		throws Exception {
		PostalRouteType fixture = getFixture1();

		PostalRouteType.PostalRouteNumber result = fixture.getPostalRouteNumber();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the PostalRouteType.PostalRouteNumber getPostalRouteNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteNumber_fixture2_1()
		throws Exception {
		PostalRouteType fixture = getFixture2();

		PostalRouteType.PostalRouteNumber result = fixture.getPostalRouteNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalRouteType.PostalRouteNumber getPostalRouteNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteNumber_fixture3_1()
		throws Exception {
		PostalRouteType fixture = getFixture3();

		PostalRouteType.PostalRouteNumber result = fixture.getPostalRouteNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
	}

	/**
	 * Run the PostalRouteType.PostalRouteNumber getPostalRouteNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testGetPostalRouteNumber_fixture4_1()
		throws Exception {
		PostalRouteType fixture = getFixture4();

		PostalRouteType.PostalRouteNumber result = fixture.getPostalRouteNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getCode());
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
		PostalRouteType fixture = getFixture1();

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
		PostalRouteType fixture = getFixture2();

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
		PostalRouteType fixture = getFixture3();

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
		PostalRouteType fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
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
		PostalRouteType fixture = getFixture1();
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
		PostalRouteType fixture = getFixture2();
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
		PostalRouteType fixture = getFixture3();
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
		PostalRouteType fixture = getFixture4();
		PostBox value = new PostBox();

		fixture.setPostBox(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRouteNumber(PostalRouteNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRouteNumber_fixture1_1()
		throws Exception {
		PostalRouteType fixture = getFixture1();
		PostalRouteType.PostalRouteNumber value = new PostalRouteType.PostalRouteNumber();

		fixture.setPostalRouteNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRouteNumber(PostalRouteNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRouteNumber_fixture2_1()
		throws Exception {
		PostalRouteType fixture = getFixture2();
		PostalRouteType.PostalRouteNumber value = new PostalRouteType.PostalRouteNumber();

		fixture.setPostalRouteNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRouteNumber(PostalRouteNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRouteNumber_fixture3_1()
		throws Exception {
		PostalRouteType fixture = getFixture3();
		PostalRouteType.PostalRouteNumber value = new PostalRouteType.PostalRouteNumber();

		fixture.setPostalRouteNumber(value);

		// add additional test code here
	}

	/**
	 * Run the void setPostalRouteNumber(PostalRouteNumber) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testSetPostalRouteNumber_fixture4_1()
		throws Exception {
		PostalRouteType fixture = getFixture4();
		PostalRouteType.PostalRouteNumber value = new PostalRouteType.PostalRouteNumber();

		fixture.setPostalRouteNumber(value);

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
		PostalRouteType fixture = getFixture1();
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
		PostalRouteType fixture = getFixture2();
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
		PostalRouteType fixture = getFixture3();
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
		PostalRouteType fixture = getFixture4();
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
		PostalRouteType fixture = getFixture2();
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
		PostalRouteType fixture = getFixture3();
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
		PostalRouteType fixture = getFixture4();
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
		PostalRouteType fixture = getFixture1();
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
		new org.junit.runner.JUnitCore().run(PostalRouteTypeTest.class);
	}
}