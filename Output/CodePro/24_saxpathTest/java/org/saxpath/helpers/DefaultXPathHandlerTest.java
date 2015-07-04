package org.saxpath.helpers;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultXPathHandlerTest</code> contains tests for the class <code>{@link DefaultXPathHandler}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultXPathHandlerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultXPathHandler
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private DefaultXPathHandler fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultXPathHandler
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public DefaultXPathHandler getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DefaultXPathHandler();
		}
		return fixture;
	}

	/**
	 * Run the DefaultXPathHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testDefaultXPathHandler_1()
		throws Exception {

		DefaultXPathHandler result = new DefaultXPathHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void endAbsoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAbsoluteLocationPath_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endAbsoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void endAdditiveExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAdditiveExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 0;

		fixture2.endAdditiveExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endAdditiveExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAdditiveExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 1;

		fixture2.endAdditiveExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endAdditiveExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAdditiveExpr_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 7;

		fixture2.endAdditiveExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endAllNodeStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAllNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endAllNodeStep();

		// add additional test code here
	}

	/**
	 * Run the void endAndExpr(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAndExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		boolean create = false;

		fixture2.endAndExpr(create);

		// add additional test code here
	}

	/**
	 * Run the void endAndExpr(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAndExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		boolean create = true;

		fixture2.endAndExpr(create);

		// add additional test code here
	}

	/**
	 * Run the void endCommentNodeStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndCommentNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endCommentNodeStep();

		// add additional test code here
	}

	/**
	 * Run the void endEqualityExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndEqualityExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 0;

		fixture2.endEqualityExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endEqualityExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndEqualityExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 1;

		fixture2.endEqualityExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endEqualityExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndEqualityExpr_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 7;

		fixture2.endEqualityExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endFilterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndFilterExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endFilterExpr();

		// add additional test code here
	}

	/**
	 * Run the void endFunction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndFunction_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endFunction();

		// add additional test code here
	}

	/**
	 * Run the void endMultiplicativeExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndMultiplicativeExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 0;

		fixture2.endMultiplicativeExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endMultiplicativeExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndMultiplicativeExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 1;

		fixture2.endMultiplicativeExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endMultiplicativeExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndMultiplicativeExpr_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 7;

		fixture2.endMultiplicativeExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endNameStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndNameStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endNameStep();

		// add additional test code here
	}

	/**
	 * Run the void endOrExpr(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndOrExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		boolean create = false;

		fixture2.endOrExpr(create);

		// add additional test code here
	}

	/**
	 * Run the void endOrExpr(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndOrExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		boolean create = true;

		fixture2.endOrExpr(create);

		// add additional test code here
	}

	/**
	 * Run the void endPathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndPathExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endPathExpr();

		// add additional test code here
	}

	/**
	 * Run the void endPredicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndPredicate_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endPredicate();

		// add additional test code here
	}

	/**
	 * Run the void endProcessingInstructionNodeStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndProcessingInstructionNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endProcessingInstructionNodeStep();

		// add additional test code here
	}

	/**
	 * Run the void endRelationalExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndRelationalExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 0;

		fixture2.endRelationalExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endRelationalExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndRelationalExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 1;

		fixture2.endRelationalExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endRelationalExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndRelationalExpr_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 7;

		fixture2.endRelationalExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endRelativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndRelativeLocationPath_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endRelativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void endTextNodeStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndTextNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endTextNodeStep();

		// add additional test code here
	}

	/**
	 * Run the void endUnaryExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndUnaryExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 0;

		fixture2.endUnaryExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endUnaryExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndUnaryExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 1;

		fixture2.endUnaryExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endUnaryExpr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndUnaryExpr_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int operator = 7;

		fixture2.endUnaryExpr(operator);

		// add additional test code here
	}

	/**
	 * Run the void endUnionExpr(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndUnionExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		boolean create = false;

		fixture2.endUnionExpr(create);

		// add additional test code here
	}

	/**
	 * Run the void endUnionExpr(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndUnionExpr_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		boolean create = true;

		fixture2.endUnionExpr(create);

		// add additional test code here
	}

	/**
	 * Run the void endXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndXPath_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.endXPath();

		// add additional test code here
	}

	/**
	 * Run the void literal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLiteral_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String literal = "";

		fixture2.literal(literal);

		// add additional test code here
	}

	/**
	 * Run the void literal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLiteral_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String literal = "0123456789";

		fixture2.literal(literal);

		// add additional test code here
	}

	/**
	 * Run the void number(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumber_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		double number = -1.0;

		fixture2.number(number);

		// add additional test code here
	}

	/**
	 * Run the void number(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumber_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		double number = 0.0;

		fixture2.number(number);

		// add additional test code here
	}

	/**
	 * Run the void number(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumber_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		double number = 1.0;

		fixture2.number(number);

		// add additional test code here
	}

	/**
	 * Run the void number(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumber_fixture_4()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int number = 0;

		fixture2.number(number);

		// add additional test code here
	}

	/**
	 * Run the void number(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumber_fixture_5()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int number = 1;

		fixture2.number(number);

		// add additional test code here
	}

	/**
	 * Run the void number(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumber_fixture_6()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int number = 7;

		fixture2.number(number);

		// add additional test code here
	}

	/**
	 * Run the void startAbsoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartAbsoluteLocationPath_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startAbsoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void startAdditiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartAdditiveExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startAdditiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void startAllNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartAllNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;

		fixture2.startAllNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startAllNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartAllNodeStep_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;

		fixture2.startAllNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startAllNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartAllNodeStep_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;

		fixture2.startAllNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startAndExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartAndExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startAndExpr();

		// add additional test code here
	}

	/**
	 * Run the void startCommentNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartCommentNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;

		fixture2.startCommentNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startCommentNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartCommentNodeStep_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;

		fixture2.startCommentNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startCommentNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartCommentNodeStep_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;

		fixture2.startCommentNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startEqualityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartEqualityExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startEqualityExpr();

		// add additional test code here
	}

	/**
	 * Run the void startFilterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartFilterExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startFilterExpr();

		// add additional test code here
	}

	/**
	 * Run the void startFunction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartFunction_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "";
		String functionName = "";

		fixture2.startFunction(prefix, functionName);

		// add additional test code here
	}

	/**
	 * Run the void startFunction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartFunction_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "0123456789";
		String functionName = "0123456789";

		fixture2.startFunction(prefix, functionName);

		// add additional test code here
	}

	/**
	 * Run the void startFunction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartFunction_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "0123456789";
		String functionName = "";

		fixture2.startFunction(prefix, functionName);

		// add additional test code here
	}

	/**
	 * Run the void startFunction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartFunction_fixture_4()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "";
		String functionName = "0123456789";

		fixture2.startFunction(prefix, functionName);

		// add additional test code here
	}

	/**
	 * Run the void startMultiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartMultiplicativeExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startMultiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;
		String prefix = "";
		String localName = "";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;
		String prefix = "";
		String localName = "0123456789";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_4()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;
		String prefix = "";
		String localName = "";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_5()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;
		String prefix = "0123456789";
		String localName = "";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_6()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;
		String prefix = "";
		String localName = "0123456789";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_7()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_8()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;
		String prefix = "0123456789";
		String localName = "";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_9()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;
		String prefix = "";
		String localName = "";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_10()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_11()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;
		String prefix = "";
		String localName = "0123456789";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startNameStep(int,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartNameStep_fixture_12()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;
		String prefix = "0123456789";
		String localName = "";

		fixture2.startNameStep(axis, prefix, localName);

		// add additional test code here
	}

	/**
	 * Run the void startOrExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartOrExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startOrExpr();

		// add additional test code here
	}

	/**
	 * Run the void startPathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartPathExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startPathExpr();

		// add additional test code here
	}

	/**
	 * Run the void startPredicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartPredicate_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startPredicate();

		// add additional test code here
	}

	/**
	 * Run the void startProcessingInstructionNodeStep(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartProcessingInstructionNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;
		String name = "";

		fixture2.startProcessingInstructionNodeStep(axis, name);

		// add additional test code here
	}

	/**
	 * Run the void startProcessingInstructionNodeStep(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartProcessingInstructionNodeStep_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;
		String name = "0123456789";

		fixture2.startProcessingInstructionNodeStep(axis, name);

		// add additional test code here
	}

	/**
	 * Run the void startProcessingInstructionNodeStep(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartProcessingInstructionNodeStep_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;
		String name = "0123456789";

		fixture2.startProcessingInstructionNodeStep(axis, name);

		// add additional test code here
	}

	/**
	 * Run the void startProcessingInstructionNodeStep(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartProcessingInstructionNodeStep_fixture_4()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;
		String name = "";

		fixture2.startProcessingInstructionNodeStep(axis, name);

		// add additional test code here
	}

	/**
	 * Run the void startProcessingInstructionNodeStep(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartProcessingInstructionNodeStep_fixture_5()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;
		String name = "";

		fixture2.startProcessingInstructionNodeStep(axis, name);

		// add additional test code here
	}

	/**
	 * Run the void startProcessingInstructionNodeStep(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartProcessingInstructionNodeStep_fixture_6()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;
		String name = "0123456789";

		fixture2.startProcessingInstructionNodeStep(axis, name);

		// add additional test code here
	}

	/**
	 * Run the void startRelationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartRelationalExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startRelationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void startRelativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartRelativeLocationPath_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startRelativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void startTextNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartTextNodeStep_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 0;

		fixture2.startTextNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startTextNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartTextNodeStep_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 1;

		fixture2.startTextNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startTextNodeStep(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartTextNodeStep_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		int axis = 7;

		fixture2.startTextNodeStep(axis);

		// add additional test code here
	}

	/**
	 * Run the void startUnaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartUnaryExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startUnaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void startUnionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartUnionExpr_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startUnionExpr();

		// add additional test code here
	}

	/**
	 * Run the void startXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStartXPath_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();

		fixture2.startXPath();

		// add additional test code here
	}

	/**
	 * Run the void variableReference(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testVariableReference_fixture_1()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "";
		String variableName = "";

		fixture2.variableReference(prefix, variableName);

		// add additional test code here
	}

	/**
	 * Run the void variableReference(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testVariableReference_fixture_2()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "0123456789";
		String variableName = "0123456789";

		fixture2.variableReference(prefix, variableName);

		// add additional test code here
	}

	/**
	 * Run the void variableReference(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testVariableReference_fixture_3()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "0123456789";
		String variableName = "";

		fixture2.variableReference(prefix, variableName);

		// add additional test code here
	}

	/**
	 * Run the void variableReference(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testVariableReference_fixture_4()
		throws Exception {
		DefaultXPathHandler fixture2 = getFixture();
		String prefix = "";
		String variableName = "0123456789";

		fixture2.variableReference(prefix, variableName);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultXPathHandlerTest.class);
	}
}