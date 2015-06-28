package nu.staldal.lagoon.core;

import org.junit.*;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.lagoon.producer.LSPTransformer;
import nu.staldal.lagoon.producer.XSLTransformer;
import nu.staldal.lagoon.producer.XMLFormatter;
import nu.staldal.lagoon.producer.FOPFormatter;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.BatikFormatter;
import nu.staldal.lagoon.producer.DirSource;
import nu.staldal.lagoon.producer.LSSITransformer;
import nu.staldal.lagoon.producer.FileSource;
import static org.junit.Assert.*;

/**
 * The class <code>XMLStreamConsumerTest</code> contains tests for the class <code>{@link XMLStreamConsumer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLStreamConsumerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XMLStreamConsumer fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture1()
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
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new BasicSplit();
			fixture2.setNext(new BasicSplit());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new BasicSplit();
			fixture3.setNext(new DirSource());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new BasicSplit();
			fixture4.setNext(new FileSource());
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new BatikFormatter();
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new BatikFormatter();
			fixture6.setNext(new BasicSplit());
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new BatikFormatter();
			fixture7.setNext(new DirSource());
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new BatikFormatter();
			fixture8.setNext(new FileSource());
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new FOPFormatter();
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new FOPFormatter();
			fixture10.setNext(new BasicSplit());
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new FOPFormatter();
			fixture11.setNext(new DirSource());
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new FOPFormatter();
			fixture12.setNext(new FileSource());
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new IslandSplit();
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new IslandSplit();
			fixture14.setNext(new BasicSplit());
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new IslandSplit();
			fixture15.setNext(new DirSource());
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new IslandSplit();
			fixture16.setNext(new FileSource());
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new LSPTransformer();
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new LSPTransformer();
			fixture18.setNext(new BasicSplit());
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new LSPTransformer();
			fixture19.setNext(new DirSource());
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new LSPTransformer();
			fixture20.setNext(new FileSource());
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new LSSITransformer();
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new LSSITransformer();
			fixture22.setNext(new BasicSplit());
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new LSSITransformer();
			fixture23.setNext(new DirSource());
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new LSSITransformer();
			fixture24.setNext(new FileSource());
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new XMLFormatter();
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new XMLFormatter();
			fixture26.setNext(new BasicSplit());
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new XMLFormatter();
			fixture27.setNext(new DirSource());
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new XMLFormatter();
			fixture28.setNext(new FileSource());
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new XSLTransformer();
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLStreamConsumer
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XMLStreamConsumer getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new XSLTransformer();
			fixture30.setNext(new BasicSplit());
		}
		return fixture30;
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
		XMLStreamConsumer fixture = getFixture1();

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
		XMLStreamConsumer fixture = getFixture2();

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
		XMLStreamConsumer fixture = getFixture3();

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
		XMLStreamConsumer fixture = getFixture4();

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
	public void testDoAfterBuild_fixture5_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture5();

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
	public void testDoAfterBuild_fixture6_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture6();

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
	public void testDoAfterBuild_fixture7_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture7();

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
	public void testDoAfterBuild_fixture8_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture8();

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
	public void testDoAfterBuild_fixture9_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture9();

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
	public void testDoAfterBuild_fixture10_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture10();

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
	public void testDoAfterBuild_fixture11_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture11();

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
	public void testDoAfterBuild_fixture12_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture12();

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
	public void testDoAfterBuild_fixture13_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture13();

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
	public void testDoAfterBuild_fixture14_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture14();

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
	public void testDoAfterBuild_fixture15_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture15();

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
	public void testDoAfterBuild_fixture16_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture16();

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
	public void testDoAfterBuild_fixture17_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture17();

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
	public void testDoAfterBuild_fixture18_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture18();

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
	public void testDoAfterBuild_fixture19_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture19();

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
	public void testDoAfterBuild_fixture20_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture20();

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
	public void testDoAfterBuild_fixture21_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture21();

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
	public void testDoAfterBuild_fixture22_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture22();

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
	public void testDoAfterBuild_fixture23_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture23();

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
	public void testDoAfterBuild_fixture24_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture24();

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
	public void testDoAfterBuild_fixture25_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture25();

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
	public void testDoAfterBuild_fixture26_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture26();

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
	public void testDoAfterBuild_fixture27_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture27();

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
	public void testDoAfterBuild_fixture28_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture28();

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
	public void testDoAfterBuild_fixture29_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture29();

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
	public void testDoAfterBuild_fixture30_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture30();

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
		XMLStreamConsumer fixture = getFixture1();

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
		XMLStreamConsumer fixture = getFixture2();

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
		XMLStreamConsumer fixture = getFixture3();

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
		XMLStreamConsumer fixture = getFixture4();

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
	public void testDoBeforeBuild_fixture5_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture5();

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
	public void testDoBeforeBuild_fixture6_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture6();

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
	public void testDoBeforeBuild_fixture7_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture7();

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
	public void testDoBeforeBuild_fixture8_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture8();

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
	public void testDoBeforeBuild_fixture9_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture9();

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
	public void testDoBeforeBuild_fixture10_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture10();

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
	public void testDoBeforeBuild_fixture11_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture11();

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
	public void testDoBeforeBuild_fixture12_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture12();

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
	public void testDoBeforeBuild_fixture13_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture13();

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
	public void testDoBeforeBuild_fixture14_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture14();

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
	public void testDoBeforeBuild_fixture15_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture15();

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
	public void testDoBeforeBuild_fixture16_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture16();

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
	public void testDoBeforeBuild_fixture17_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture17();

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
	public void testDoBeforeBuild_fixture18_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture18();

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
	public void testDoBeforeBuild_fixture19_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture19();

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
	public void testDoBeforeBuild_fixture20_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture20();

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
	public void testDoBeforeBuild_fixture21_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture21();

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
	public void testDoBeforeBuild_fixture22_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture22();

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
	public void testDoBeforeBuild_fixture23_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture23();

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
	public void testDoBeforeBuild_fixture24_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture24();

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
	public void testDoBeforeBuild_fixture25_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture25();

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
	public void testDoBeforeBuild_fixture26_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture26();

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
	public void testDoBeforeBuild_fixture27_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture27();

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
	public void testDoBeforeBuild_fixture28_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture28();

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
	public void testDoBeforeBuild_fixture29_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture29();

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
	public void testDoBeforeBuild_fixture30_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture30();

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
		XMLStreamConsumer fixture = getFixture1();

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
		XMLStreamConsumer fixture = getFixture2();

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
		XMLStreamConsumer fixture = getFixture3();

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
		XMLStreamConsumer fixture = getFixture4();

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
	public void testDoDestroy_fixture5_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture5();

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
	public void testDoDestroy_fixture6_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture6();

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
	public void testDoDestroy_fixture7_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture7();

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
	public void testDoDestroy_fixture8_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture8();

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
	public void testDoDestroy_fixture9_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture9();

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
	public void testDoDestroy_fixture10_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture10();

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
	public void testDoDestroy_fixture11_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture11();

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
	public void testDoDestroy_fixture12_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture12();

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
	public void testDoDestroy_fixture13_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture13();

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
	public void testDoDestroy_fixture14_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture14();

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
	public void testDoDestroy_fixture15_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture15();

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
	public void testDoDestroy_fixture16_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture16();

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
	public void testDoDestroy_fixture17_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture17();

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
	public void testDoDestroy_fixture18_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture18();

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
	public void testDoDestroy_fixture19_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture19();

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
	public void testDoDestroy_fixture20_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture20();

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
	public void testDoDestroy_fixture21_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture21();

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
	public void testDoDestroy_fixture22_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture22();

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
	public void testDoDestroy_fixture23_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture23();

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
	public void testDoDestroy_fixture24_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture24();

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
	public void testDoDestroy_fixture25_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture25();

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
	public void testDoDestroy_fixture26_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture26();

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
	public void testDoDestroy_fixture27_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture27();

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
	public void testDoDestroy_fixture28_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture28();

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
	public void testDoDestroy_fixture29_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture29();

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
	public void testDoDestroy_fixture30_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture30();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture1_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture1();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture2_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture2();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture3_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture3();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture4_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture4();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture5_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture5();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture6_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture6();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture7_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture7();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture8_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture8();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture9_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture9();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture10_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture10();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture11_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture11();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture12_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture12();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture13_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture13();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture14_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture14();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture15_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture15();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture16_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture16();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture17_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture17();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture18_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture18();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture19_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture19();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture20_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture20();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture21_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture21();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture22_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture22();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture23_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture23();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture24_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture24();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture25_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture25();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture26_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture26();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture27_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture27();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture28_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture28();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture29_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture29();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the XMLStreamProducer getNext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetNext_fixture30_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture30();

		XMLStreamProducer result = fixture.getNext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture1_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture1();
		XMLStreamProducer next = new BasicSplit();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture2_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture2();
		XMLStreamProducer next = new DirSource();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture3_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture3();
		XMLStreamProducer next = new FileSource();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture4_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture4();
		XMLStreamProducer next = new IslandSplit();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture5_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture5();
		XMLStreamProducer next = new LSPTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture6_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture6();
		XMLStreamProducer next = new LSSITransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture7_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture7();
		XMLStreamProducer next = new XMLParse();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture8_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture8();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture9_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture9();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture10_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture10();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture11_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture11();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture12_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture12();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture13_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture13();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture14_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture14();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture15_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture15();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture16_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture16();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture17_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture17();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture18_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture18();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture19_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture19();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture20_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture20();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture21_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture21();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture22_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture22();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture23_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture23();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture24_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture24();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture25_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture25();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture26_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture26();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture27_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture27();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture28_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture28();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture29_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture29();
		XMLStreamProducer next = new XSLTransformer();

		fixture.setNext(next);

		// add additional test code here
	}

	/**
	 * Run the void setNext(XMLStreamProducer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testSetNext_fixture30_1()
		throws Exception {
		XMLStreamConsumer fixture = getFixture30();
		XMLStreamProducer next = new XSLTransformer();

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
		new org.junit.runner.JUnitCore().run(XMLStreamConsumerTest.class);
	}
}