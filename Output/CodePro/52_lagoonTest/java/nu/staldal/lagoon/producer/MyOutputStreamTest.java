package nu.staldal.lagoon.producer;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MyOutputStreamTest</code> contains tests for the class <code>{@link MyOutputStream}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:39 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MyOutputStreamTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MyOutputStream
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	private MyOutputStream fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MyOutputStream
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	public MyOutputStream getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new MyOutputStream(new MyInputStream());
		}
		return fixture;
	}

	/**
	 * Run the MyOutputStream(MyInputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testMyOutputStream_1()
		throws Exception {
		MyInputStream sink = new MyInputStream();

		MyOutputStream result = new MyOutputStream(sink);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testClose_fixture_1()
		throws Exception {
		MyOutputStream fixture2 = getFixture();

		fixture2.close();

		// add additional test code here
	}

	/**
	 * Run the void write(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testWrite_fixture_1()
		throws Exception {
		MyOutputStream fixture2 = getFixture();
		int b = 0;

		fixture2.write(b);

		// add additional test code here
	}

	/**
	 * Run the void write(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testWrite_fixture_2()
		throws Exception {
		MyOutputStream fixture2 = getFixture();
		int b = 1;

		fixture2.write(b);

		// add additional test code here
	}

	/**
	 * Run the void write(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testWrite_fixture_3()
		throws Exception {
		MyOutputStream fixture2 = getFixture();
		int b = 7;

		fixture2.write(b);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
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
	 * @generatedBy CodePro at 6/28/15 2:39 PM
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
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MyOutputStreamTest.class);
	}
}