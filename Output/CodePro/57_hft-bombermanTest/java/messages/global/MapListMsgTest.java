package messages.global;

import java.util.ArrayList;
import client.BomberClient;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MapListMsgTest</code> contains tests for the class <code>{@link MapListMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MapListMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MapListMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private MapListMsg fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MapListMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public MapListMsg getFixture()
		throws Exception {
		if (fixture == null) {
			ArrayList<MapInfo> list = new ArrayList<MapInfo>();
			list.add(new MapInfo("", "", 0));
			fixture = new MapListMsg(list);
		}
		return fixture;
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_1()
		throws Exception {
		ArrayList<MapInfo> maps = new ArrayList<MapInfo>();
		maps.add(new MapInfo("", "", 0));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_2()
		throws Exception {
		ArrayList<MapInfo> maps = new ArrayList<MapInfo>();
		maps.add(new MapInfo("", "", 0));
		maps.add(new MapInfo("0123456789", "0123456789", 1));
		maps.add(new MapInfo("An��t-1.0.txt", "An��t-1.0.txt", 7));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_3()
		throws Exception {
		ArrayList<MapInfo> maps = new ArrayList<MapInfo>();
		maps.add(new MapInfo("0123456789", "0123456789", 1));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_4()
		throws Exception {
		ArrayList<MapInfo> maps = new ArrayList<MapInfo>();
		maps.add(new MapInfo("An��t-1.0.txt", "An��t-1.0.txt", 7));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_5()
		throws Exception {
		LinkedList<MapInfo> maps = new LinkedList<MapInfo>();
		maps.add(new MapInfo("", "", 0));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_6()
		throws Exception {
		LinkedList<MapInfo> maps = new LinkedList<MapInfo>();
		maps.add(new MapInfo("", "", 0));
		maps.add(new MapInfo("0123456789", "0123456789", 1));
		maps.add(new MapInfo("An��t-1.0.txt", "An��t-1.0.txt", 7));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_7()
		throws Exception {
		LinkedList<MapInfo> maps = new LinkedList<MapInfo>();
		maps.add(new MapInfo("0123456789", "0123456789", 1));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_8()
		throws Exception {
		LinkedList<MapInfo> maps = new LinkedList<MapInfo>();
		maps.add(new MapInfo("An��t-1.0.txt", "An��t-1.0.txt", 7));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_9()
		throws Exception {
		Vector<MapInfo> maps = new Vector<MapInfo>();
		maps.add(new MapInfo("", "", 0));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_10()
		throws Exception {
		Vector<MapInfo> maps = new Vector<MapInfo>();
		maps.add(new MapInfo("", "", 0));
		maps.add(new MapInfo("0123456789", "0123456789", 1));
		maps.add(new MapInfo("An��t-1.0.txt", "An��t-1.0.txt", 7));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_11()
		throws Exception {
		Vector<MapInfo> maps = new Vector<MapInfo>();
		maps.add(new MapInfo("0123456789", "0123456789", 1));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_12()
		throws Exception {
		Vector<MapInfo> maps = new Vector<MapInfo>();
		maps.add(new MapInfo("An��t-1.0.txt", "An��t-1.0.txt", 7));

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_13()
		throws Exception {
		List<MapInfo> maps = new ArrayList<MapInfo>();

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_14()
		throws Exception {
		List<MapInfo> maps = new LinkedList<MapInfo>();

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MapListMsg(List<MapInfo>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMapListMsg_15()
		throws Exception {
		List<MapInfo> maps = new Vector<MapInfo>();

		MapListMsg result = new MapListMsg(maps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(BomberClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		MapListMsg fixture2 = getFixture();
		BomberClient bomberClient = BomberClient.getInstance();

		fixture2.execute(bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.BomberClient.<clinit>(BomberClient.java:36)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		MapListMsg fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("messages.global.MapListMsg@3a415a21: 1 maps", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MapListMsgTest.class);
	}
}