package client.view;

import java.awt.Graphics;
import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;
import common.GameObject;
import client.ClientBomb;

/**
 * The class <code>StatusViewTest</code> contains tests for the class <code>{@link StatusView}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class StatusViewTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public StatusViewTest(String name) {
	}

	/**
	 * Run the StatusView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testStatusView_1()
		throws Exception {
		GameObject gameObject = new ClientBomb(new Point(), (GameObject) null);
		GfxFactory gfxFactory = new GfxFactory();

		StatusView result = new StatusView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
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
		new org.junit.runner.JUnitCore().run(StatusViewTest.class);
	}
}