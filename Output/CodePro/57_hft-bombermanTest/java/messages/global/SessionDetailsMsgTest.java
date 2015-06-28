package messages.global;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import server.BomberServer;
import javax.swing.ImageIcon;
import server.ClientInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SessionDetailsMsgTest</code> contains tests for the class <code>{@link SessionDetailsMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SessionDetailsMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionDetailsMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	private SessionDetailsMsg fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public SessionDetailsMsgTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionDetailsMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public SessionDetailsMsg getFixture()
		throws Exception {
		if (fixture == null) {
			ArrayList<String> list = new ArrayList<String>();
			list.add("");
			list.add("0123456789");
			fixture = new SessionDetailsMsg("0123456789", list, new ImageIcon("", ""), 1, 1, 1);
		}
		return fixture;
	}

	/**
	 * Run the SessionDetailsMsg(String,List<String>,ImageIcon,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testSessionDetailsMsg_1()
		throws Exception {
		String gameName = "";
		ArrayList<String> maps = new ArrayList<String>();
		maps.add("");
		ImageIcon mapPreview = new ImageIcon("");
		int nrOfPlayers = 0;
		int totalNrOfPlayers = 0;
		int rounds = 0;

		SessionDetailsMsg result = new SessionDetailsMsg(gameName, maps, mapPreview, nrOfPlayers, totalNrOfPlayers, rounds);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(0, result.getTotalRounds());
		assertEquals(0, result.getTotalNrOfPlayers());
		assertEquals(0, result.getNrOfPlayers());
		assertEquals("", result.getGameName());
	}

	/**
	 * Run the void execute(BomberServer,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();
		BomberServer bomberSrv = BomberServer.getInstance();
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(bomberSrv, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.BomberServer.<clinit>(BomberServer.java:36)
	}

	/**
	 * Run the String getGameName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetGameName_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		String result = fixture2.getGameName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the List<String> getMaps() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetMaps_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		List<String> result = fixture2.getMaps();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the int getNrOfPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetNrOfPlayers_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		int result = fixture2.getNrOfPlayers();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ImageIcon getPreview() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetPreview_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		ImageIcon result = fixture2.getPreview();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getImageLoadStatus());
		assertEquals(-1, result.getIconWidth());
		assertEquals(-1, result.getIconHeight());
		assertEquals(null, result.getImageObserver());
		assertEquals("", result.toString());
		assertEquals("", result.getDescription());
	}

	/**
	 * Run the int getTotalNrOfPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetTotalNrOfPlayers_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		int result = fixture2.getTotalNrOfPlayers();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTotalRounds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetTotalRounds_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		int result = fixture2.getTotalRounds();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setPreview(ImageIcon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testSetPreview_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();
		ImageIcon preview = null;

		fixture2.setPreview(preview);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		SessionDetailsMsg fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SessionDetailsMsgTest.class);
	}
}