package nu.staldal.lagoon.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TemplateProcessorTest</code> contains tests for the class <code>{@link TemplateProcessor}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TemplateProcessorTest {
	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessTemplate_1()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "aa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessTemplate_2()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "aa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessTemplate_3()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "aa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessTemplate_4()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "aa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessTemplate_5()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testProcessTemplate_6()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.util.TemplateException.class)
	public void testProcessTemplate_7()
		throws Exception {
		char left = '';
		char right = ' ';
		char quot1 = '';
		char quot2 = '';
		String template = "aa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.util.TemplateException.class)
	public void testProcessTemplate_8()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testProcessTemplate_9()
		throws Exception {
		char left = '';
		char right = '';
		char quot1 = '';
		char quot2 = '';
		String template = "";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(TemplateProcessorTest.class);
	}
}