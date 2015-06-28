package nu.staldal.lagoon.core;

import org.junit.*;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lagoon.producer.XSLTransformer;
import nu.staldal.lagoon.producer.LSPTransformer;
import nu.staldal.lagoon.producer.FileRead;
import nu.staldal.lagoon.producer.XMLFormatter;
import nu.staldal.lagoon.producer.FOPFormatter;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.BatikFormatter;
import nu.staldal.lagoon.producer.DirSource;
import nu.staldal.lagoon.producer.LSSITransformer;
import nu.staldal.lagoon.producer.FileSource;
import static org.junit.Assert.*;

/**
 * The class <code>ProducerInterfaceTest</code> contains tests for the class <code>{@link ProducerInterface}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ProducerInterfaceTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private ProducerInterface fixture12;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new BasicSplit();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new BatikFormatter();
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DirSource();
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new FOPFormatter();
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new FileRead();
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new FileSource();
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new IslandSplit();
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new LSPTransformer();
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new LSSITransformer();
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new XMLFormatter();
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new XMLParse();
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ProducerInterface
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public ProducerInterface getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new XSLTransformer();
		}
		return fixture12;
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture1_1()
		throws Exception {
		ProducerInterface fixture = getFixture1();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture2_1()
		throws Exception {
		ProducerInterface fixture = getFixture2();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture3_1()
		throws Exception {
		ProducerInterface fixture = getFixture3();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture4_1()
		throws Exception {
		ProducerInterface fixture = getFixture4();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture5_1()
		throws Exception {
		ProducerInterface fixture = getFixture5();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture6_1()
		throws Exception {
		ProducerInterface fixture = getFixture6();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture7_1()
		throws Exception {
		ProducerInterface fixture = getFixture7();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture8_1()
		throws Exception {
		ProducerInterface fixture = getFixture8();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture9_1()
		throws Exception {
		ProducerInterface fixture = getFixture9();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture10_1()
		throws Exception {
		ProducerInterface fixture = getFixture10();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture11_1()
		throws Exception {
		ProducerInterface fixture = getFixture11();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testDestroy_fixture12_1()
		throws Exception {
		ProducerInterface fixture = getFixture12();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture1_1()
		throws Exception {
		ProducerInterface fixture = getFixture1();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BasicSplit.hasBeenUpdated(BasicSplit.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture2_1()
		throws Exception {
		ProducerInterface fixture = getFixture2();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BatikFormatter.hasBeenUpdated(BatikFormatter.java:163)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture3_1()
		throws Exception {
		ProducerInterface fixture = getFixture3();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.DirSource.hasBeenUpdated(DirSource.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture4_1()
		throws Exception {
		ProducerInterface fixture = getFixture4();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.hasBeenUpdated(FOPFormatter.java:105)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture5_1()
		throws Exception {
		ProducerInterface fixture = getFixture5();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.hasBeenUpdated(FileRead.java:75)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture6_1()
		throws Exception {
		ProducerInterface fixture = getFixture6();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileSource.hasBeenUpdated(FileSource.java:69)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture7_1()
		throws Exception {
		ProducerInterface fixture = getFixture7();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(IslandSplit.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture8_1()
		throws Exception {
		ProducerInterface fixture = getFixture8();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture9_1()
		throws Exception {
		ProducerInterface fixture = getFixture9();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.LSSITransformer.hasBeenUpdated(LSSITransformer.java:84)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture10_1()
		throws Exception {
		ProducerInterface fixture = getFixture10();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLFormatter.hasBeenUpdated(XMLFormatter.java:195)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture11_1()
		throws Exception {
		ProducerInterface fixture = getFixture11();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLParse.hasBeenUpdated(XMLParse.java:181)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture12_1()
		throws Exception {
		ProducerInterface fixture = getFixture12();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture2_2()
		throws Exception {
		ProducerInterface fixture = getFixture2();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BatikFormatter.hasBeenUpdated(BatikFormatter.java:163)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture3_2()
		throws Exception {
		ProducerInterface fixture = getFixture3();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.DirSource.hasBeenUpdated(DirSource.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture4_2()
		throws Exception {
		ProducerInterface fixture = getFixture4();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.hasBeenUpdated(FOPFormatter.java:105)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture5_2()
		throws Exception {
		ProducerInterface fixture = getFixture5();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.hasBeenUpdated(FileRead.java:75)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture6_2()
		throws Exception {
		ProducerInterface fixture = getFixture6();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileSource.hasBeenUpdated(FileSource.java:69)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture7_2()
		throws Exception {
		ProducerInterface fixture = getFixture7();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(IslandSplit.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture8_2()
		throws Exception {
		ProducerInterface fixture = getFixture8();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture9_2()
		throws Exception {
		ProducerInterface fixture = getFixture9();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.LSSITransformer.hasBeenUpdated(LSSITransformer.java:84)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture10_2()
		throws Exception {
		ProducerInterface fixture = getFixture10();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLFormatter.hasBeenUpdated(XMLFormatter.java:195)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture11_2()
		throws Exception {
		ProducerInterface fixture = getFixture11();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLParse.hasBeenUpdated(XMLParse.java:181)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture12_2()
		throws Exception {
		ProducerInterface fixture = getFixture12();
		long lastBuild = 0L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture1_2()
		throws Exception {
		ProducerInterface fixture = getFixture1();
		long lastBuild = 1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BasicSplit.hasBeenUpdated(BasicSplit.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture3_3()
		throws Exception {
		ProducerInterface fixture = getFixture3();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.DirSource.hasBeenUpdated(DirSource.java:137)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture4_3()
		throws Exception {
		ProducerInterface fixture = getFixture4();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.hasBeenUpdated(FOPFormatter.java:105)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture5_3()
		throws Exception {
		ProducerInterface fixture = getFixture5();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.hasBeenUpdated(FileRead.java:75)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture6_3()
		throws Exception {
		ProducerInterface fixture = getFixture6();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileSource.hasBeenUpdated(FileSource.java:69)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture7_3()
		throws Exception {
		ProducerInterface fixture = getFixture7();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(IslandSplit.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture8_3()
		throws Exception {
		ProducerInterface fixture = getFixture8();
		long lastBuild = -1L;

		boolean result = fixture.hasBeenUpdated(lastBuild);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture3_1()
		throws Exception {
		ProducerInterface fixture = getFixture3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		//       at nu.staldal.lagoon.producer.DirSource.init(DirSource.java:65)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture4_1()
		throws Exception {
		ProducerInterface fixture = getFixture4();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at nu.staldal.lagoon.producer.FOPFormatter.init(FOPFormatter.java:61)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture5_1()
		throws Exception {
		ProducerInterface fixture = getFixture5();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture6_1()
		throws Exception {
		ProducerInterface fixture = getFixture6();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture7_1()
		throws Exception {
		ProducerInterface fixture = getFixture7();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture8_1()
		throws Exception {
		ProducerInterface fixture = getFixture8();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/bcel/Constants
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:800)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:449)
		//       at java.net.URLClassLoader.access$100(URLClassLoader.java:71)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:358)
		//       at nu.staldal.lsp.compiler.LSPCompiler.<init>(LSPCompiler.java:111)
		//       at nu.staldal.lagoon.producer.LSPTransformer.init(LSPTransformer.java:66)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture9_1()
		throws Exception {
		ProducerInterface fixture = getFixture9();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture10_1()
		throws Exception {
		ProducerInterface fixture = getFixture10();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture11_1()
		throws Exception {
		ProducerInterface fixture = getFixture11();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_fixture1_1()
		throws Exception {
		ProducerInterface fixture = getFixture1();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_fixture2_1()
		throws Exception {
		ProducerInterface fixture = getFixture2();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_fixture12_1()
		throws Exception {
		ProducerInterface fixture = getFixture12();

		fixture.init();

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
		new org.junit.runner.JUnitCore().run(ProducerInterfaceTest.class);
	}
}