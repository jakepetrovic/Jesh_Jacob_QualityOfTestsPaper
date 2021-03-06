package nu.staldal.lagoon.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TemplateProcessorTest</code> contains tests for the class <code>{@link TemplateProcessor}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TemplateProcessorTest {
	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_1()
		throws Exception {
		char left = ' ';
		char right = ' ';
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: evaluator is null
		//       at nu.staldal.lagoon.util.TemplateProcessor.processTemplate(TemplateProcessor.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_2()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = '';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_3()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = '';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_4()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = '';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_5()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = '';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_6()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = ' ';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_7()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = ' ';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_8()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_9()
		throws Exception {
		char left = 0;
		char right = 0;
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_10()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = '';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_11()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = '';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_12()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = '';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_13()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = '';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_14()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = ' ';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_15()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = ' ';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_16()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_17()
		throws Exception {
		char left = 0;
		char right = ' ';
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_18()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = '';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_19()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = '';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_20()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = '';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_21()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = '';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_22()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = ' ';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_23()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = ' ';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_24()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_25()
		throws Exception {
		char left = ' ';
		char right = 0;
		char quot1 = ' ';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_26()
		throws Exception {
		char left = ' ';
		char right = ' ';
		char quot1 = '';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: evaluator is null
		//       at nu.staldal.lagoon.util.TemplateProcessor.processTemplate(TemplateProcessor.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_27()
		throws Exception {
		char left = ' ';
		char right = ' ';
		char quot1 = '';
		char quot2 = '';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: evaluator is null
		//       at nu.staldal.lagoon.util.TemplateProcessor.processTemplate(TemplateProcessor.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_28()
		throws Exception {
		char left = ' ';
		char right = ' ';
		char quot1 = '';
		char quot2 = ' ';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: evaluator is null
		//       at nu.staldal.lagoon.util.TemplateProcessor.processTemplate(TemplateProcessor.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_29()
		throws Exception {
		char left = ' ';
		char right = ' ';
		char quot1 = '';
		char quot2 = ' ';
		String template = "01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: evaluator is null
		//       at nu.staldal.lagoon.util.TemplateProcessor.processTemplate(TemplateProcessor.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the String processTemplate(char,char,char,char,String,ExpressionEvaluator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testProcessTemplate_30()
		throws Exception {
		char left = ' ';
		char right = ' ';
		char quot1 = ' ';
		char quot2 = '';
		String template = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678";
		ExpressionEvaluator evaluator = null;

		String result = TemplateProcessor.processTemplate(left, right, quot1, quot2, template, evaluator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: evaluator is null
		//       at nu.staldal.lagoon.util.TemplateProcessor.processTemplate(TemplateProcessor.java:61)
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
		new org.junit.runner.JUnitCore().run(TemplateProcessorTest.class);
	}
}