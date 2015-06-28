package net.sf.lavalamp.device;

import java.util.List;
import net.sf.lavalamp.Pause;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BlinkTest</code> contains tests for the class <code>{@link Blink}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BlinkTest {
	/**
	 * Run the Blink() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testBlink_1()
		throws Exception {
		Blink result = new Blink();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void perform(List<String>,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testPerform_1()
		throws Exception {
		Blink fixture = new Blink();
		fixture.setPause(new Pause());
		List<String> events = new Vector();
		Device device = new DummyDevice();

		fixture.perform(events, device);

		// add additional test code here
	}

	/**
	 * Run the void perform(List<String>,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testPerform_2()
		throws Exception {
		Blink fixture = new Blink();
		fixture.setPause(new Pause());
		List<String> events = new Vector();
		Device device = new DummyDevice();

		fixture.perform(events, device);

		// add additional test code here
	}

	/**
	 * Run the void perform(List<String>,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testPerform_3()
		throws Exception {
		Blink fixture = new Blink();
		fixture.setPause(new Pause());
		List<String> events = new Vector();
		Device device = new DummyDevice();

		fixture.perform(events, device);

		// add additional test code here
	}

	/**
	 * Run the void perform(List<String>,Device) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testPerform_4()
		throws Exception {
		Blink fixture = new Blink();
		fixture.setPause(new Pause());
		List<String> events = new Vector();
		Device device = new DummyDevice();

		fixture.perform(events, device);

		// add additional test code here
	}

	/**
	 * Run the void setPause(Pause) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetPause_1()
		throws Exception {
		Blink fixture = new Blink();
		fixture.setPause(new Pause());
		Pause pause = new Pause();

		fixture.setPause(pause);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BlinkTest.class);
	}
}