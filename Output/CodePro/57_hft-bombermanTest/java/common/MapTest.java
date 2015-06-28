package common;

import java.awt.Point;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MapTest</code> contains tests for the class <code>{@link Map}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MapTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public MapTest(String name) {
	}

	/**
	 * Run the Map(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testMap_1()
		throws Exception {
		String xmlFile = "";

		Map result = new Map(xmlFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the Map(String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testMap_2()
		throws Exception {
		String xmlFile = "";
		boolean settiles = false;
		boolean setpowerups = false;
		boolean setstartpoints = false;

		Map result = new Map(xmlFile, settiles, setpowerups, setstartpoints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:66)
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MapTest.class);
	}
}