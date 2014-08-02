package nu.staldal.lagoon.core;

import java.io.IOException;
import org.junit.*;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.BatikFormatter;
import static org.junit.Assert.*;

/**
 * The class <code>ByteStreamConsumerTest</code> contains tests for the class <code>{@link ByteStreamConsumer}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ByteStreamConsumerTest {
	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDoAfterBuild_1()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDoAfterBuild_2()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoAfterBuild_3()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoAfterBuild_4()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDoBeforeBuild_1()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDoBeforeBuild_2()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoBeforeBuild_3()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoBeforeBuild_4()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDoDestroy_1()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testDoDestroy_2()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoDestroy_3()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoDestroy_4()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the ByteStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetNext_1()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();

		ByteStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testSetNext_1()
		throws Exception {
		ByteStreamConsumer fixture = new XMLParse();
		ByteStreamProducer next = new BatikFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ByteStreamConsumerTest.class);
	}
}