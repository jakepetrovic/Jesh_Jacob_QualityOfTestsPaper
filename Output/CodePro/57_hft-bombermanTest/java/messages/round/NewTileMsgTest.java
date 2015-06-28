package messages.round;

import java.awt.Point;
import client.ClientGameRound;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NewTileMsgTest</code> contains tests for the class <code>{@link NewTileMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class NewTileMsgTest {
	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_1()
		throws Exception {
		int tileID = 0;
		Point position = new Point();
		String type = "";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_2()
		throws Exception {
		int tileID = 1;
		Point position = new Point(0, 0);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_3()
		throws Exception {
		int tileID = 7;
		Point position = new Point((Point) null);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_4()
		throws Exception {
		int tileID = 1;
		Point position = new Point(0, 0);
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_5()
		throws Exception {
		int tileID = 7;
		Point position = new Point((Point) null);
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_6()
		throws Exception {
		int tileID = 1;
		Point position = new Point(0, 0);
		String type = "";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_7()
		throws Exception {
		int tileID = 7;
		Point position = new Point((Point) null);
		String type = "";
		boolean bombable = false;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_8()
		throws Exception {
		int tileID = 1;
		Point position = new Point(0, 0);
		String type = "";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_9()
		throws Exception {
		int tileID = 7;
		Point position = new Point(1, 1);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_10()
		throws Exception {
		int tileID = 1;
		Point position = new Point();
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_11()
		throws Exception {
		int tileID = 7;
		Point position = new Point(1, 1);
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_12()
		throws Exception {
		int tileID = 1;
		Point position = new Point();
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_13()
		throws Exception {
		int tileID = 7;
		Point position = new Point(1, 1);
		String type = "";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_14()
		throws Exception {
		int tileID = 1;
		Point position = new Point();
		String type = "";
		boolean bombable = false;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_15()
		throws Exception {
		int tileID = 7;
		Point position = new Point(1, 1);
		String type = "";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_16()
		throws Exception {
		int tileID = 0;
		Point position = new Point((Point) null);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_17()
		throws Exception {
		int tileID = 7;
		Point position = new Point(0, 0);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_18()
		throws Exception {
		int tileID = 0;
		Point position = new Point((Point) null);
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_19()
		throws Exception {
		int tileID = 7;
		Point position = new Point(0, 0);
		String type = "";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_20()
		throws Exception {
		int tileID = 0;
		Point position = new Point((Point) null);
		String type = "";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_21()
		throws Exception {
		int tileID = 7;
		Point position = new Point(0, 0);
		String type = "";
		boolean bombable = false;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_22()
		throws Exception {
		int tileID = 0;
		Point position = new Point(1, 1);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_23()
		throws Exception {
		int tileID = 7;
		Point position = new Point();
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_24()
		throws Exception {
		int tileID = 0;
		Point position = new Point(1, 1);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_25()
		throws Exception {
		int tileID = 7;
		Point position = new Point();
		String type = "0123456789";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_26()
		throws Exception {
		int tileID = 0;
		Point position = new Point(1, 1);
		String type = "";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_27()
		throws Exception {
		int tileID = 7;
		Point position = new Point();
		String type = "";
		boolean bombable = true;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_28()
		throws Exception {
		int tileID = 0;
		Point position = new Point(1, 1);
		String type = "";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = true;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_29()
		throws Exception {
		int tileID = 7;
		Point position = new Point();
		String type = "";
		boolean bombable = false;
		boolean accessible = false;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewTileMsg(int,Point,String,boolean,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testNewTileMsg_30()
		throws Exception {
		int tileID = 0;
		Point position = new Point(0, 0);
		String type = "0123456789";
		boolean bombable = true;
		boolean accessible = true;
		boolean active = false;

		NewTileMsg result = new NewTileMsg(tileID, position, type, bombable, accessible, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewTileMsg
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NewTileMsgTest.class);
	}
}