package geo.google.datamodel;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GeoUtilsTest</code> contains tests for the class <code>{@link GeoUtils}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GeoUtilsTest {
	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_1()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_2()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_3()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_4()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_5()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_6()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(157.24181586752943, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_7()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(157.24181586752943, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_8()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(314.4836317350861, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_9()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(157.24181586752943, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_10()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(314.4836317350861, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_11()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(157.24181586752943, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_12()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(314.4836317350861, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_13()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(314.4836317350861, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_14()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_15()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(157.24181586752943, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInKm_16()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(157.24181586752943, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_1()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_2()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_3()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_4()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_5()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_6()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(97.70553459517009, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_7()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(97.70553459517009, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_8()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(195.4110691903571, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_9()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(97.70553459517009, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_10()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(195.4110691903571, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_11()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(97.70553459517009, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_12()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(195.4110691903571, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_13()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(195.4110691903571, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_14()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_15()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(97.70553459517009, result, 0.1);
	}

	/**
	 * Run the double distanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testDistanceBetweenInMiles_16()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.distanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(97.70553459517009, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_1()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_2()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_3()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_4()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_5()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_6()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(138.00376466320162, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_7()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(138.00376466320162, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_8()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(252.77861095787915, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_9()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(138.00376466320162, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_10()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(252.77861095787915, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_11()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(138.00376466320162, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_12()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(252.77861095787915, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_13()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(252.77861095787915, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_14()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_15()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(138.00376466320162, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInKm(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInKm_16()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInKm(c1, c2);

		// add additional test code here
		assertEquals(138.00376466320162, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_1()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_2()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_3()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_4()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_5()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_6()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(85.75156378201405, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_7()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(85.75156378201405, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_8()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(157.06934686299456, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_9()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(85.75156378201405, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_10()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(157.06934686299456, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_11()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(85.75156378201405, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_12()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(157.06934686299456, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_13()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));
		GeoCoordinate c2 = new GeoCoordinate();

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(157.06934686299456, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_14()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate();
		GeoCoordinate c2 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_15()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(-1.0, -1.0, new GeoAltitude());
		GeoCoordinate c2 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(85.75156378201405, result, 0.1);
	}

	/**
	 * Run the double haversineDistanceBetweenInMiles(GeoCoordinate,GeoCoordinate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testHaversineDistanceBetweenInMiles_16()
		throws Exception {
		GeoCoordinate c1 = new GeoCoordinate(0.0, 0.0, new GeoAltitude(-1.0));
		GeoCoordinate c2 = new GeoCoordinate(1.0, 1.0, new GeoAltitude(-1.0, GeoAltitude.GeoAltitudeMode.ABSOLUTE));

		double result = GeoUtils.haversineDistanceBetweenInMiles(c1, c2);

		// add additional test code here
		assertEquals(85.75156378201405, result, 0.1);
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
		new org.junit.runner.JUnitCore().run(GeoUtilsTest.class);
	}
}