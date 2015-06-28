package client.controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import org.junit.*;
import static org.junit.Assert.*;
import common.Player;

/**
 * The class <code>LocalControlTest</code> contains tests for the class <code>{@link LocalControl}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LocalControlTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public LocalControlTest(String name) {
	}

	/**
	 * Run the LocalControl(Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testLocalControl_1()
		throws Exception {
		Player player = new Player(new Point());

		LocalControl result = new LocalControl(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Player
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LocalControlTest.class);
	}
}