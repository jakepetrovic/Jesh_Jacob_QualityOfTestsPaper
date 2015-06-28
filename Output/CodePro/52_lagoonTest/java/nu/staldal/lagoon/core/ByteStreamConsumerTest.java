package nu.staldal.lagoon.core;

import org.junit.*;
import nu.staldal.lagoon.producer.FileRead;
import nu.staldal.lagoon.producer.XMLFormatter;
import nu.staldal.lagoon.producer.FOPFormatter;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.BatikFormatter;
import static org.junit.Assert.*;

/**
 * The class <code>ByteStreamConsumerTest</code> contains tests for the class <code>{@link ByteStreamConsumer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ByteStreamConsumerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ByteStreamConsumer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ByteStreamConsumer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ByteStreamConsumer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ByteStreamConsumer fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ByteStreamConsumer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new XMLParse();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ByteStreamConsumer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new XMLParse();
			fixture2.setNext(new BatikFormatter());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ByteStreamConsumer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new XMLParse();
			fixture3.setNext(new FOPFormatter());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ByteStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ByteStreamConsumer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new XMLParse();
			fixture4.setNext(new FileRead());
		}
		return fixture4;
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoAfterBuild_fixture1_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoAfterBuild_fixture2_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoAfterBuild_fixture3_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoAfterBuild_fixture4_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture1_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture2_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture3_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture4_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoDestroy_fixture1_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoDestroy_fixture2_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoDestroy_fixture3_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDoDestroy_fixture4_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the ByteStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture1_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();

		ByteStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ByteStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture2_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();

		ByteStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ByteStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture3_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();

		ByteStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ByteStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture4_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();

		ByteStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture1_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();
		ByteStreamProducer next = new BatikFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture2_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();
		ByteStreamProducer next = new FOPFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture3_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();
		ByteStreamProducer next = new FileRead();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture4_1()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();
		ByteStreamProducer next = new XMLFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture2_2()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();
		ByteStreamProducer next = new BatikFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture3_2()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();
		ByteStreamProducer next = new FOPFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture4_2()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();
		ByteStreamProducer next = new FileRead();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture1_2()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();
		ByteStreamProducer next = new XMLFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture3_3()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();
		ByteStreamProducer next = new BatikFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture4_3()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();
		ByteStreamProducer next = new FOPFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture1_3()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();
		ByteStreamProducer next = new FileRead();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture2_3()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();
		ByteStreamProducer next = new XMLFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture4_4()
		throws Exception {
		ByteStreamConsumer fixture = getFixture4();
		ByteStreamProducer next = new BatikFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture1_4()
		throws Exception {
		ByteStreamConsumer fixture = getFixture1();
		ByteStreamProducer next = new FOPFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture2_4()
		throws Exception {
		ByteStreamConsumer fixture = getFixture2();
		ByteStreamProducer next = new FileRead();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(ByteStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture3_4()
		throws Exception {
		ByteStreamConsumer fixture = getFixture3();
		ByteStreamProducer next = new XMLFormatter();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ByteStreamConsumerTest.class);
	}
}