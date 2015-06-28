package nu.staldal.lagoon.core;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import nu.staldal.lagoon.producer.LSSITransformer;
import java.io.PrintWriter;
import java.io.StringWriter;
import nu.staldal.lagoon.producer.LSPTransformer;
import nu.staldal.lagoon.producer.FileRead;
import nu.staldal.lagoon.producer.XMLFormatter;
import nu.staldal.lagoon.producer.FOPFormatter;
import nu.staldal.lagoon.producer.BatikFormatter;
import java.io.Writer;
import nu.staldal.lagoon.producer.XMLParse;
import nu.staldal.lagoon.producer.DirSource;
import nu.staldal.lagoon.producer.FileSource;
import java.util.Enumeration;
import nu.staldal.lagoon.producer.BasicSplit;
import nu.staldal.lagoon.producer.IslandSplit;
import nu.staldal.xtree.Element;
import nu.staldal.lagoon.producer.XSLTransformer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProducerTest</code> contains tests for the class <code>{@link Producer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ProducerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private Producer fixture12;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture1()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture2()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture3()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture4()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture5()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture6()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture7()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture8()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture9()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture10()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture11()
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
	 * @see Producer
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public Producer getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new XSLTransformer();
		}
		return fixture12;
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String name = "";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String name = "";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture1_3()
		throws Exception {
		Producer fixture = getFixture1();
		String name = "0123456789";
		String value = "";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String name = "";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture4_3()
		throws Exception {
		Producer fixture = getFixture4();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture5_3()
		throws Exception {
		Producer fixture = getFixture5();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture6_3()
		throws Exception {
		Producer fixture = getFixture6();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture7_3()
		throws Exception {
		Producer fixture = getFixture7();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture8_3()
		throws Exception {
		Producer fixture = getFixture8();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void addParam(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAddParam_fixture9_3()
		throws Exception {
		Producer fixture = getFixture9();
		String name = "0123456789";
		String value = "0123456789";

		fixture.addParam(name, value);

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAfterBuild_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void beforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testBeforeBuild_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		fixture.beforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDestroy_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doAfterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoAfterBuild_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		fixture.doAfterBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doBeforeBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoBeforeBuild_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		fixture.doBeforeBuild();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the void doDestroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testDoDestroy_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		fixture.doDestroy();

		// add additional test code here
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the LagoonContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetContext_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		LagoonContext result = fixture.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEntryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetEntryName_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		String result = fixture.getEntryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the Object getObjectFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetObjectFromRepository_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "0123456789";

		Object result = fixture.getObjectFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.getObjectFromRepository(Producer.java:277)
		assertNotNull(result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String name = "";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParam_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String name = "0123456789";

		String result = fixture.getParam(name);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the Enumeration getParamNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetParamNames_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		Enumeration result = fixture.getParamNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasMoreElements());
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetPosition_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the SourceManager getSourceMan() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testGetSourceMan_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();

		SourceManager result = fixture.getSourceMan();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture1_3()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "0123456789";
		Object obj = new Object();

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture4_3()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture5_3()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture6_3()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture7_3()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture8_3()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the boolean putObjectIntoRepository(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPutObjectIntoRepository_fixture9_3()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "0123456789";
		Object obj = null;

		boolean result = fixture.putObjectIntoRepository(key, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.putObjectIntoRepository(Producer.java:295)
		assertTrue(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream readFileFromRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testReadFileFromRepository_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "0123456789";

		InputStream result = fixture.readFileFromRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.readFileFromRepository(Producer.java:244)
		assertNotNull(result);
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String entryName = "";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setEntryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetEntryName_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String entryName = "0123456789";

		fixture.setEntryName(entryName);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		int pos = 1;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		int pos = 7;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture3_3()
		throws Exception {
		Producer fixture = getFixture3();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture4_3()
		throws Exception {
		Producer fixture = getFixture4();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture5_3()
		throws Exception {
		Producer fixture = getFixture5();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture6_3()
		throws Exception {
		Producer fixture = getFixture6();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture7_3()
		throws Exception {
		Producer fixture = getFixture7();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetPosition_fixture8_3()
		throws Exception {
		Producer fixture = getFixture8();
		int pos = 0;

		fixture.setPosition(pos);

		// add additional test code here
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, new File("", ""), "An��t-1.0.txt", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), File.createTempFile("", "", (File) null), "0123456789", (PrintWriter) null, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture3_3()
		throws Exception {
		Producer fixture = getFixture3();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("", ""), "", printWriter, printWriter2);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture4_3()
		throws Exception {
		Producer fixture = getFixture4();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("", new Element("", ""), File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null), "", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture5_3()
		throws Exception {
		Producer fixture = getFixture5();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("0123456789", new Element("0123456789", "0123456789"), new File(""), "0123456789", printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL 0123456789
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture6_3()
		throws Exception {
		Producer fixture = getFixture6();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture7_3()
		throws Exception {
		Producer fixture = getFixture7();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setProcessor(LagoonProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetProcessor_fixture8_3()
		throws Exception {
		Producer fixture = getFixture8();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		LagoonProcessor processor = new LagoonProcessor("An��t-1.0.txt", (Element) null, File.createTempFile("0123456789", "0123456789"), (String) null, printWriter, (PrintWriter) null);

		fixture.setProcessor(processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.staldal.lagoon.core.LagoonException: Cannot find FileStorage for URL An��t-1.0.txt
		//       at nu.staldal.lagoon.core.LagoonProcessor.<init>(LagoonProcessor.java:113)
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the void setSourceManager(SourceManagerProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testSetSourceManager_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		SourceManagerProvider sourceMan = null;

		fixture.setSourceManager(sourceMan);

		// add additional test code here
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture1_1()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture2_1()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture3_1()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture4_1()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture5_1()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture6_1()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture7_1()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture8_1()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture9_1()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture10_1()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture11_1()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture12_1()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture2_2()
		throws Exception {
		Producer fixture = getFixture2();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture3_2()
		throws Exception {
		Producer fixture = getFixture3();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture4_2()
		throws Exception {
		Producer fixture = getFixture4();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture5_2()
		throws Exception {
		Producer fixture = getFixture5();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture6_2()
		throws Exception {
		Producer fixture = getFixture6();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture7_2()
		throws Exception {
		Producer fixture = getFixture7();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture8_2()
		throws Exception {
		Producer fixture = getFixture8();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture9_2()
		throws Exception {
		Producer fixture = getFixture9();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture10_2()
		throws Exception {
		Producer fixture = getFixture10();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture11_2()
		throws Exception {
		Producer fixture = getFixture11();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture12_2()
		throws Exception {
		Producer fixture = getFixture12();
		String key = "";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream storeFileInRepository(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStoreFileInRepository_fixture1_2()
		throws Exception {
		Producer fixture = getFixture1();
		String key = "0123456789";

		OutputStream result = fixture.storeFileInRepository(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.util.Utils.encodePath(Utils.java:62)
		//       at nu.staldal.lagoon.core.Producer.storeFileInRepository(Producer.java:261)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProducerTest.class);
	}
}