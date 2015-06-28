package com.google.earth.kml._2;

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
	 * Run the JAXBElement<KmlType> createKml(KmlType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateKml_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();
		KmlType value = new KmlType();

		JAXBElement<KmlType> result = fixture2.createKml(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNil());
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the KmlType createKmlType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateKmlType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		KmlType result = fixture2.createKmlType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getResponse());
	}

	/**
	 * Run the PlacemarkType createPlacemarkType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePlacemarkType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PlacemarkType result = fixture2.createPlacemarkType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getId());
		assertEquals(null, result.getAddressDetails());
		assertEquals(null, result.getPoint());
	}

	/**
	 * Run the JAXBElement<PointType> createPoint(PointType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePoint_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();
		PointType value = new PointType();

		JAXBElement<PointType> result = fixture2.createPoint(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNil());
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the PointType createPointType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreatePointType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		PointType result = fixture2.createPointType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.isExtrude());
		assertEquals(null, result.isTessellate());
		assertEquals(null, result.getAltitudeMode());
		assertEquals(null, result.getCoordinates());
	}

	/**
	 * Run the JAXBElement<ResponseType> createResponse(ResponseType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateResponse_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();
		ResponseType value = new ResponseType();

		JAXBElement<ResponseType> result = fixture2.createResponse(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNil());
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the ResponseType createResponseType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateResponseType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		ResponseType result = fixture2.createResponseType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getStatus());
	}

	/**
	 * Run the StatusType createStatusType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testCreateStatusType_fixture_1()
		throws Exception {
		ObjectFactory fixture2 = getFixture();

		StatusType result = fixture2.createStatusType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getRequest());
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