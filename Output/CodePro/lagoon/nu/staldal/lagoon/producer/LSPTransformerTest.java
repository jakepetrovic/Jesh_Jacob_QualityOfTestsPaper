package nu.staldal.lagoon.producer;

import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>LSPTransformerTest</code> contains tests for the class <code>{@link LSPTransformer}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LSPTransformerTest {
	/**
	 * Run the LSPTransformer() constructor test.
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testLSPTransformer_1()
		throws Exception {
		LSPTransformer result = new LSPTransformer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testHasBeenUpdated_1()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_4()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_5()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_6()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_7()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_2()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_3()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_4()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_5()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_6()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStart_7()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStart_8()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStart_9()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStart_10()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_11()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testStart_12()
		throws Exception {
		LSPTransformer fixture = new LSPTransformer();
		ContentHandler ch = new DefaultHandler();
		Target target = null;

		fixture.start(ch, target);

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
		new org.junit.runner.JUnitCore().run(LSPTransformerTest.class);
	}
}