package messages.round;

import java.awt.Point;
import client.ClientGameRound;
import org.junit.*;
import server.ClientInfo;
import server.ServerGameRound;
import static org.junit.Assert.*;

/**
 * The class <code>NewBombMsgTest</code> contains tests for the class <code>{@link NewBombMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class NewBombMsgTest {
	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_1()
		throws Exception {
		Point position = new Point();
		int bombID = 0;
		int planterId = 0;
		int bombDiameter = 0;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_2()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 1;
		int planterId = 1;
		int bombDiameter = 1;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_3()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 7;
		int planterId = 7;
		int bombDiameter = 7;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_4()
		throws Exception {
		Point position = new Point();
		int bombID = 1;
		int planterId = 1;
		int bombDiameter = 0;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_5()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 7;
		int planterId = 7;
		int bombDiameter = 7;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_6()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 1;
		int planterId = 1;
		int bombDiameter = 0;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_7()
		throws Exception {
		Point position = new Point();
		int bombID = 7;
		int planterId = 7;
		int bombDiameter = 1;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_8()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 1;
		int planterId = 0;
		int bombDiameter = 7;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_9()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 7;
		int planterId = 7;
		int bombDiameter = 0;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_10()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 1;
		int planterId = 0;
		int bombDiameter = 1;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_11()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 7;
		int planterId = 7;
		int bombDiameter = 0;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_12()
		throws Exception {
		Point position = new Point();
		int bombID = 1;
		int planterId = 0;
		int bombDiameter = 1;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_13()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 7;
		int planterId = 1;
		int bombDiameter = 7;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_14()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 1;
		int planterId = 0;
		int bombDiameter = 0;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_15()
		throws Exception {
		Point position = new Point();
		int bombID = 7;
		int planterId = 1;
		int bombDiameter = 1;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_16()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 0;
		int planterId = 7;
		int bombDiameter = 7;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_17()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 7;
		int planterId = 1;
		int bombDiameter = 1;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_18()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 0;
		int planterId = 7;
		int bombDiameter = 7;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_19()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 7;
		int planterId = 1;
		int bombDiameter = 0;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_20()
		throws Exception {
		Point position = new Point();
		int bombID = 0;
		int planterId = 7;
		int bombDiameter = 1;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_21()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 7;
		int planterId = 0;
		int bombDiameter = 7;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_22()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 0;
		int planterId = 7;
		int bombDiameter = 0;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_23()
		throws Exception {
		Point position = new Point();
		int bombID = 7;
		int planterId = 0;
		int bombDiameter = 7;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_24()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 0;
		int planterId = 7;
		int bombDiameter = 0;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_25()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 7;
		int planterId = 0;
		int bombDiameter = 1;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_26()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 0;
		int planterId = 1;
		int bombDiameter = 7;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_27()
		throws Exception {
		Point position = new Point(1, 1);
		int bombID = 7;
		int planterId = 0;
		int bombDiameter = 0;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_28()
		throws Exception {
		Point position = new Point();
		int bombID = 0;
		int planterId = 1;
		int bombDiameter = 1;
		boolean start = true;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_29()
		throws Exception {
		Point position = new Point(0, 0);
		int bombID = 7;
		int planterId = 0;
		int bombDiameter = 0;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.NewBombMsg
		assertNotNull(result);
	}

	/**
	 * Run the NewBombMsg(Point,int,int,int,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testNewBombMsg_30()
		throws Exception {
		Point position = new Point((Point) null);
		int bombID = 0;
		int planterId = 1;
		int bombDiameter = 1;
		boolean start = false;

		NewBombMsg result = new NewBombMsg(position, bombID, planterId, bombDiameter, start);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(NewBombMsgTest.class);
	}
}