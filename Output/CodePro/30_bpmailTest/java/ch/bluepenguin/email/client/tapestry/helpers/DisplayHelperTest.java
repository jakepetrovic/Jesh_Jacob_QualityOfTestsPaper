package ch.bluepenguin.email.client.tapestry.helpers;

import java.util.Date;
import java.util.Locale;
import junit.framework.*;

/**
 * The class <code>DisplayHelperTest</code> contains tests for the class <code>{@link DisplayHelper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DisplayHelperTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DisplayHelper fixture10;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DisplayHelper();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DisplayHelper();
			fixture2.setMyLocale(Locale.CANADA);
			fixture2.setSeparator("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DisplayHelper();
			fixture3.setMyLocale(Locale.CANADA);
			fixture3.setSeparator("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DisplayHelper();
			fixture4.setMyLocale(Locale.CANADA);
			fixture4.setSeparator("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DisplayHelper();
			fixture5.setMyLocale(Locale.CANADA_FRENCH);
			fixture5.setSeparator("");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DisplayHelper();
			fixture6.setMyLocale(Locale.CANADA_FRENCH);
			fixture6.setSeparator("0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DisplayHelper();
			fixture7.setMyLocale(Locale.CANADA_FRENCH);
			fixture7.setSeparator("An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DisplayHelper();
			fixture8.setMyLocale(Locale.CHINA);
			fixture8.setSeparator("");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DisplayHelper();
			fixture9.setMyLocale(Locale.CHINA);
			fixture9.setSeparator("0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DisplayHelper
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DisplayHelper getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DisplayHelper();
			fixture10.setMyLocale(Locale.CHINA);
			fixture10.setSeparator("An��t-1.0.txt");
		}
		return fixture10;
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture1_1()
		throws Exception {
		DisplayHelper fixture = getFixture1();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("en_US", result.toString());
		assertEquals("en", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("US", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("en-US", result.toLanguageTag());
		assertEquals("eng", result.getISO3Language());
		assertEquals("USA", result.getISO3Country());
		assertEquals("English", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("United States", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("English (United States)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture2_1()
		throws Exception {
		DisplayHelper fixture = getFixture2();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("en_CA", result.toString());
		assertEquals("en", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CA", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("en-CA", result.toLanguageTag());
		assertEquals("eng", result.getISO3Language());
		assertEquals("CAN", result.getISO3Country());
		assertEquals("English", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("Canada", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("English (Canada)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture3_1()
		throws Exception {
		DisplayHelper fixture = getFixture3();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("en_CA", result.toString());
		assertEquals("en", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CA", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("en-CA", result.toLanguageTag());
		assertEquals("eng", result.getISO3Language());
		assertEquals("CAN", result.getISO3Country());
		assertEquals("English", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("Canada", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("English (Canada)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture4_1()
		throws Exception {
		DisplayHelper fixture = getFixture4();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("en_CA", result.toString());
		assertEquals("en", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CA", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("en-CA", result.toLanguageTag());
		assertEquals("eng", result.getISO3Language());
		assertEquals("CAN", result.getISO3Country());
		assertEquals("English", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("Canada", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("English (Canada)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture5_1()
		throws Exception {
		DisplayHelper fixture = getFixture5();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("fr_CA", result.toString());
		assertEquals("fr", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CA", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("fr-CA", result.toLanguageTag());
		assertEquals("fra", result.getISO3Language());
		assertEquals("CAN", result.getISO3Country());
		assertEquals("French", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("Canada", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("French (Canada)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture6_1()
		throws Exception {
		DisplayHelper fixture = getFixture6();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("fr_CA", result.toString());
		assertEquals("fr", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CA", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("fr-CA", result.toLanguageTag());
		assertEquals("fra", result.getISO3Language());
		assertEquals("CAN", result.getISO3Country());
		assertEquals("French", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("Canada", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("French (Canada)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture7_1()
		throws Exception {
		DisplayHelper fixture = getFixture7();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("fr_CA", result.toString());
		assertEquals("fr", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CA", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("fr-CA", result.toLanguageTag());
		assertEquals("fra", result.getISO3Language());
		assertEquals("CAN", result.getISO3Country());
		assertEquals("French", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("Canada", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("French (Canada)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture8_1()
		throws Exception {
		DisplayHelper fixture = getFixture8();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("zh_CN", result.toString());
		assertEquals("zh", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CN", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("zh-CN", result.toLanguageTag());
		assertEquals("zho", result.getISO3Language());
		assertEquals("CHN", result.getISO3Country());
		assertEquals("Chinese", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("China", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("Chinese (China)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture9_1()
		throws Exception {
		DisplayHelper fixture = getFixture9();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("zh_CN", result.toString());
		assertEquals("zh", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CN", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("zh-CN", result.toLanguageTag());
		assertEquals("zho", result.getISO3Language());
		assertEquals("CHN", result.getISO3Country());
		assertEquals("Chinese", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("China", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("Chinese (China)", result.getDisplayName());
	}

	/**
	 * Run the Locale getMyLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMyLocale_fixture10_1()
		throws Exception {
		DisplayHelper fixture = getFixture10();

		Locale result = fixture.getMyLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("zh_CN", result.toString());
		assertEquals("zh", result.getLanguage());
		assertEquals("", result.getScript());
		assertEquals("CN", result.getCountry());
		assertEquals("", result.getVariant());
		assertEquals("zh-CN", result.toLanguageTag());
		assertEquals("zho", result.getISO3Language());
		assertEquals("CHN", result.getISO3Country());
		assertEquals("Chinese", result.getDisplayLanguage());
		assertEquals("", result.getDisplayScript());
		assertEquals("China", result.getDisplayCountry());
		assertEquals("", result.getDisplayVariant());
		assertEquals("Chinese (China)", result.getDisplayName());
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture1_1()
		throws Exception {
		DisplayHelper fixture = getFixture1();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals(",", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture2_1()
		throws Exception {
		DisplayHelper fixture = getFixture2();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture3_1()
		throws Exception {
		DisplayHelper fixture = getFixture3();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture4_1()
		throws Exception {
		DisplayHelper fixture = getFixture4();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture5_1()
		throws Exception {
		DisplayHelper fixture = getFixture5();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture6_1()
		throws Exception {
		DisplayHelper fixture = getFixture6();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture7_1()
		throws Exception {
		DisplayHelper fixture = getFixture7();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture8_1()
		throws Exception {
		DisplayHelper fixture = getFixture8();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture9_1()
		throws Exception {
		DisplayHelper fixture = getFixture9();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetSeparator_fixture10_1()
		throws Exception {
		DisplayHelper fixture = getFixture10();

		String result = fixture.getSeparator();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture1_1()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		Date date = new Date(1591115236000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("6/2/20", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture2_1()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("02/06/90", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture3_1()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("01/01/00", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture4_1()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("01/01/00", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture5_1()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-01-01", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture6_1()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-01-01", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture7_1()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-01-01", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture8_1()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-1-1", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture9_1()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-1-1", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture10_1()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-1-1", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture2_2()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		Date date = new Date(1591115236000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("02/06/20", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture3_2()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("02/06/90", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture4_2()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("01/01/00", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture5_2()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-01-01", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture6_2()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-01-01", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture7_2()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-01-01", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture8_2()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-1-1", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture9_2()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-1-1", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture10_2()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("00-1-1", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture1_2()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("1/1/00", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture3_3()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		Date date = new Date(1591115236000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("02/06/20", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture4_3()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("02/06/90", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture5_3()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("90-06-02", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture6_3()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("90-06-02", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture7_3()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("90-06-02", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture8_3()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("90-6-2", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture9_3()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("90-6-2", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture10_3()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		Date date = new Date(644344036000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("90-6-2", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture1_3()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		Date date = new Date(946713599000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("1/1/00", result);
	}

	/**
	 * Run the String returnFormattedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnFormattedDate_fixture2_3()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		Date date = new Date(946713600000L);

		String result = fixture.returnFormattedDate(date);

		// add additional test code here
		assertEquals("01/01/00", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture1_1()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals(",0123456789,An��t-1.0.txt,null", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture2_1()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture3_1()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture4_1()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture5_1()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture6_1()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture7_1()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture8_1()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture9_1()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture10_1()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture2_2()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789An��t-1.0.txtnull", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture3_2()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture4_2()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture5_2()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture6_2()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture7_2()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture8_2()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture9_2()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture10_2()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture1_2()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture3_3()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("012345678901234567890123456789An��t-1.0.txt0123456789null", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture4_3()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("An��t-1.0.txt0123456789An��t-1.0.txtAn��t-1.0.txtAn��t-1.0.txtnull", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture5_3()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789An��t-1.0.txtnull", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture6_3()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("012345678901234567890123456789An��t-1.0.txt0123456789null", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture7_3()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("An��t-1.0.txt0123456789An��t-1.0.txtAn��t-1.0.txtAn��t-1.0.txtnull", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture8_3()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789An��t-1.0.txtnull", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture9_3()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("012345678901234567890123456789An��t-1.0.txt0123456789null", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture10_3()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		String[] list = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("An��t-1.0.txt0123456789An��t-1.0.txtAn��t-1.0.txtAn��t-1.0.txtnull", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture1_3()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		String[] list = new String[] {""};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String returnStringList(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testReturnStringList_fixture2_3()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		String[] list = new String[] {"0123456789"};

		String result = fixture.returnStringList(list);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture1_1()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		Locale myLocale = Locale.CANADA;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture2_1()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		Locale myLocale = Locale.CANADA_FRENCH;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture3_1()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		Locale myLocale = Locale.CHINA;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture4_1()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		Locale myLocale = Locale.CHINESE;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture5_1()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		Locale myLocale = Locale.ENGLISH;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture6_1()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		Locale myLocale = Locale.FRANCE;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture7_1()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		Locale myLocale = Locale.FRENCH;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture8_1()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		Locale myLocale = Locale.GERMAN;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture9_1()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		Locale myLocale = Locale.GERMANY;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture10_1()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		Locale myLocale = Locale.ITALIAN;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture1_2()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		Locale myLocale = Locale.ITALY;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture2_2()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		Locale myLocale = Locale.JAPAN;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture3_2()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		Locale myLocale = Locale.JAPANESE;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture4_2()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		Locale myLocale = Locale.KOREA;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture5_2()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		Locale myLocale = Locale.KOREAN;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture6_2()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		Locale myLocale = Locale.PRC;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture7_2()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		Locale myLocale = Locale.ROOT;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture8_2()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		Locale myLocale = Locale.SIMPLIFIED_CHINESE;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture9_2()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		Locale myLocale = Locale.TAIWAN;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture10_2()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		Locale myLocale = Locale.TRADITIONAL_CHINESE;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture1_3()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		Locale myLocale = Locale.UK;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture2_3()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		Locale myLocale = Locale.US;

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture3_3()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		Locale myLocale = Locale.forLanguageTag("");

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture4_3()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		Locale myLocale = Locale.getDefault();

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture5_3()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		Locale myLocale = Locale.getDefault(java.util.Locale.Category.DISPLAY);

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture6_3()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		Locale myLocale = new Locale("");

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture7_3()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		Locale myLocale = new Locale("", "");

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture8_3()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		Locale myLocale = new Locale("", "", "");

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture9_3()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		Locale myLocale = new Locale("0123456789", "0123456789");

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setMyLocale(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetMyLocale_fixture10_3()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		Locale myLocale = new Locale("0123456789", "0123456789", "0123456789");

		fixture.setMyLocale(myLocale);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture1_1()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture2_1()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture3_1()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture4_1()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture5_1()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture6_1()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture7_1()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture8_1()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture9_1()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture10_1()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture2_2()
		throws Exception {
		DisplayHelper fixture = getFixture2();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture3_2()
		throws Exception {
		DisplayHelper fixture = getFixture3();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture4_2()
		throws Exception {
		DisplayHelper fixture = getFixture4();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture5_2()
		throws Exception {
		DisplayHelper fixture = getFixture5();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture6_2()
		throws Exception {
		DisplayHelper fixture = getFixture6();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture7_2()
		throws Exception {
		DisplayHelper fixture = getFixture7();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture8_2()
		throws Exception {
		DisplayHelper fixture = getFixture8();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture9_2()
		throws Exception {
		DisplayHelper fixture = getFixture9();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture10_2()
		throws Exception {
		DisplayHelper fixture = getFixture10();
		String separator = "";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Run the void setSeparator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetSeparator_fixture1_2()
		throws Exception {
		DisplayHelper fixture = getFixture1();
		String separator = "0123456789";

		fixture.setSeparator(separator);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}