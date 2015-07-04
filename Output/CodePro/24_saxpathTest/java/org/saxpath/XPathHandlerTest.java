package org.saxpath;

import org.junit.*;
import static org.junit.Assert.*;
import org.saxpath.conformance.ConformanceXPathHandler;
import org.saxpath.helpers.DefaultXPathHandler;

/**
 * The class <code>XPathHandlerTest</code> contains tests for the class <code>{@link XPathHandler}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XPathHandlerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathHandler
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathHandler fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathHandler
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathHandler fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathHandler
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathHandler getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ConformanceXPathHandler();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathHandler
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathHandler getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultXPathHandler();
		}
		return fixture2;
	}

	/**
	 * Run the void endAbsoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAbsoluteLocationPath_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endAbsoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void endAbsoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEndAbsoluteLocationPath_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endAbsoluteLocationPath();

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
	public void testEndAdditiveExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int additiveOperator = 0;

		fixture.endAdditiveExpr(additiveOperator);

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
	public void testEndAdditiveExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int additiveOperator = 1;

		fixture.endAdditiveExpr(additiveOperator);

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
	public void testEndAdditiveExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int additiveOperator = 7;

		fixture.endAdditiveExpr(additiveOperator);

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
	public void testEndAdditiveExpr_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int additiveOperator = 1;

		fixture.endAdditiveExpr(additiveOperator);

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
	public void testEndAdditiveExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int additiveOperator = 7;

		fixture.endAdditiveExpr(additiveOperator);

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
	public void testEndAdditiveExpr_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int additiveOperator = 0;

		fixture.endAdditiveExpr(additiveOperator);

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
	public void testEndAllNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endAllNodeStep();

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
	public void testEndAllNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endAllNodeStep();

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
	public void testEndAndExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		boolean create = false;

		fixture.endAndExpr(create);

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
	public void testEndAndExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		boolean create = true;

		fixture.endAndExpr(create);

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
	public void testEndAndExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		boolean create = false;

		fixture.endAndExpr(create);

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
	public void testEndAndExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		boolean create = true;

		fixture.endAndExpr(create);

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
	public void testEndCommentNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endCommentNodeStep();

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
	public void testEndCommentNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endCommentNodeStep();

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
	public void testEndEqualityExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int equalityOperator = 0;

		fixture.endEqualityExpr(equalityOperator);

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
	public void testEndEqualityExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int equalityOperator = 1;

		fixture.endEqualityExpr(equalityOperator);

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
	public void testEndEqualityExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int equalityOperator = 7;

		fixture.endEqualityExpr(equalityOperator);

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
	public void testEndEqualityExpr_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int equalityOperator = 1;

		fixture.endEqualityExpr(equalityOperator);

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
	public void testEndEqualityExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int equalityOperator = 7;

		fixture.endEqualityExpr(equalityOperator);

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
	public void testEndEqualityExpr_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int equalityOperator = 0;

		fixture.endEqualityExpr(equalityOperator);

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
	public void testEndFilterExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endFilterExpr();

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
	public void testEndFilterExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endFilterExpr();

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
	public void testEndFunction_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endFunction();

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
	public void testEndFunction_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endFunction();

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
	public void testEndMultiplicativeExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int multiplicativeOperator = 0;

		fixture.endMultiplicativeExpr(multiplicativeOperator);

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
	public void testEndMultiplicativeExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int multiplicativeOperator = 1;

		fixture.endMultiplicativeExpr(multiplicativeOperator);

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
	public void testEndMultiplicativeExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int multiplicativeOperator = 7;

		fixture.endMultiplicativeExpr(multiplicativeOperator);

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
	public void testEndMultiplicativeExpr_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int multiplicativeOperator = 1;

		fixture.endMultiplicativeExpr(multiplicativeOperator);

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
	public void testEndMultiplicativeExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int multiplicativeOperator = 7;

		fixture.endMultiplicativeExpr(multiplicativeOperator);

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
	public void testEndMultiplicativeExpr_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int multiplicativeOperator = 0;

		fixture.endMultiplicativeExpr(multiplicativeOperator);

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
	public void testEndNameStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endNameStep();

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
	public void testEndNameStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endNameStep();

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
	public void testEndOrExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		boolean create = false;

		fixture.endOrExpr(create);

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
	public void testEndOrExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		boolean create = true;

		fixture.endOrExpr(create);

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
	public void testEndOrExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		boolean create = false;

		fixture.endOrExpr(create);

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
	public void testEndOrExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		boolean create = true;

		fixture.endOrExpr(create);

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
	public void testEndPathExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endPathExpr();

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
	public void testEndPathExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endPathExpr();

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
	public void testEndPredicate_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endPredicate();

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
	public void testEndPredicate_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endPredicate();

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
	public void testEndProcessingInstructionNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endProcessingInstructionNodeStep();

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
	public void testEndProcessingInstructionNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endProcessingInstructionNodeStep();

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
	public void testEndRelationalExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int relationalOperator = 0;

		fixture.endRelationalExpr(relationalOperator);

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
	public void testEndRelationalExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int relationalOperator = 1;

		fixture.endRelationalExpr(relationalOperator);

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
	public void testEndRelationalExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int relationalOperator = 7;

		fixture.endRelationalExpr(relationalOperator);

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
	public void testEndRelationalExpr_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int relationalOperator = 1;

		fixture.endRelationalExpr(relationalOperator);

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
	public void testEndRelationalExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int relationalOperator = 7;

		fixture.endRelationalExpr(relationalOperator);

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
	public void testEndRelationalExpr_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int relationalOperator = 0;

		fixture.endRelationalExpr(relationalOperator);

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
	public void testEndRelativeLocationPath_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endRelativeLocationPath();

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
	public void testEndRelativeLocationPath_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endRelativeLocationPath();

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
	public void testEndTextNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endTextNodeStep();

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
	public void testEndTextNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endTextNodeStep();

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
	public void testEndUnaryExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int unaryOperator = 0;

		fixture.endUnaryExpr(unaryOperator);

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
	public void testEndUnaryExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int unaryOperator = 1;

		fixture.endUnaryExpr(unaryOperator);

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
	public void testEndUnaryExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int unaryOperator = 7;

		fixture.endUnaryExpr(unaryOperator);

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
	public void testEndUnaryExpr_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int unaryOperator = 1;

		fixture.endUnaryExpr(unaryOperator);

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
	public void testEndUnaryExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int unaryOperator = 7;

		fixture.endUnaryExpr(unaryOperator);

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
	public void testEndUnaryExpr_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int unaryOperator = 0;

		fixture.endUnaryExpr(unaryOperator);

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
	public void testEndUnionExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		boolean create = false;

		fixture.endUnionExpr(create);

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
	public void testEndUnionExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		boolean create = true;

		fixture.endUnionExpr(create);

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
	public void testEndUnionExpr_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		boolean create = false;

		fixture.endUnionExpr(create);

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
	public void testEndUnionExpr_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		boolean create = true;

		fixture.endUnionExpr(create);

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
	public void testEndXPath_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.endXPath();

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
	public void testEndXPath_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.endXPath();

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
	public void testLiteral_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String literal = "";

		fixture.literal(literal);

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
	public void testLiteral_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String literal = "0123456789";

		fixture.literal(literal);

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
	public void testLiteral_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String literal = "";

		fixture.literal(literal);

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
	public void testLiteral_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String literal = "0123456789";

		fixture.literal(literal);

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
	public void testNumber_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		double number = -1.0;

		fixture.number(number);

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
	public void testNumber_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		double number = 0.0;

		fixture.number(number);

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
	public void testNumber_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		double number = 1.0;

		fixture.number(number);

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
	public void testNumber_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		double number = 0.0;

		fixture.number(number);

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
	public void testNumber_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		double number = 1.0;

		fixture.number(number);

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
	public void testNumber_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		double number = -1.0;

		fixture.number(number);

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
	public void testNumber_fixture1_4()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int number = 0;

		fixture.number(number);

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
	public void testNumber_fixture2_4()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int number = 1;

		fixture.number(number);

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
	public void testNumber_fixture1_5()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int number = 7;

		fixture.number(number);

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
	public void testNumber_fixture1_6()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int number = 1;

		fixture.number(number);

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
	public void testNumber_fixture2_5()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int number = 7;

		fixture.number(number);

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
	public void testNumber_fixture2_6()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int number = 0;

		fixture.number(number);

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
	public void testStartAbsoluteLocationPath_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startAbsoluteLocationPath();

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
	public void testStartAbsoluteLocationPath_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startAbsoluteLocationPath();

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
	public void testStartAdditiveExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startAdditiveExpr();

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
	public void testStartAdditiveExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startAdditiveExpr();

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
	public void testStartAllNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;

		fixture.startAllNodeStep(axis);

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
	public void testStartAllNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;

		fixture.startAllNodeStep(axis);

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
	public void testStartAllNodeStep_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;

		fixture.startAllNodeStep(axis);

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
	public void testStartAllNodeStep_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;

		fixture.startAllNodeStep(axis);

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
	public void testStartAllNodeStep_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;

		fixture.startAllNodeStep(axis);

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
	public void testStartAllNodeStep_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;

		fixture.startAllNodeStep(axis);

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
	public void testStartAndExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startAndExpr();

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
	public void testStartAndExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startAndExpr();

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
	public void testStartCommentNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;

		fixture.startCommentNodeStep(axis);

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
	public void testStartCommentNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;

		fixture.startCommentNodeStep(axis);

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
	public void testStartCommentNodeStep_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;

		fixture.startCommentNodeStep(axis);

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
	public void testStartCommentNodeStep_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;

		fixture.startCommentNodeStep(axis);

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
	public void testStartCommentNodeStep_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;

		fixture.startCommentNodeStep(axis);

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
	public void testStartCommentNodeStep_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;

		fixture.startCommentNodeStep(axis);

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
	public void testStartEqualityExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startEqualityExpr();

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
	public void testStartEqualityExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startEqualityExpr();

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
	public void testStartFilterExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startFilterExpr();

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
	public void testStartFilterExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startFilterExpr();

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
	public void testStartFunction_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "";
		String functionName = "";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "0123456789";
		String functionName = "0123456789";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "0123456789";
		String functionName = "";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "";
		String functionName = "0123456789";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture2_4()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "";
		String functionName = "";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "0123456789";
		String functionName = "0123456789";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "0123456789";
		String functionName = "";

		fixture.startFunction(prefix, functionName);

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
	public void testStartFunction_fixture1_4()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "";
		String functionName = "0123456789";

		fixture.startFunction(prefix, functionName);

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
	public void testStartMultiplicativeExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startMultiplicativeExpr();

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
	public void testStartMultiplicativeExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startMultiplicativeExpr();

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
	public void testStartNameStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;
		String prefix = "";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;
		String prefix = "";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;
		String prefix = "";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;
		String prefix = "0123456789";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;
		String prefix = "";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_4()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_4()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;
		String prefix = "0123456789";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_5()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;
		String prefix = "";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_5()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_6()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;
		String prefix = "";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_7()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;
		String prefix = "";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_6()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;
		String prefix = "0123456789";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_7()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;
		String prefix = "";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_8()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;
		String prefix = "";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_9()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;
		String prefix = "";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_8()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_9()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_10()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;
		String prefix = "0123456789";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_10()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;
		String prefix = "0123456789";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_11()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;
		String prefix = "0123456789";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture2_12()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;
		String prefix = "0123456789";
		String localName = "";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_11()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;
		String prefix = "";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartNameStep_fixture1_12()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;
		String prefix = "";
		String localName = "0123456789";

		fixture.startNameStep(axis, prefix, localName);

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
	public void testStartOrExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startOrExpr();

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
	public void testStartOrExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startOrExpr();

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
	public void testStartPathExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startPathExpr();

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
	public void testStartPathExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startPathExpr();

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
	public void testStartPredicate_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startPredicate();

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
	public void testStartPredicate_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startPredicate();

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
	public void testStartProcessingInstructionNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;
		String name = "";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;
		String name = "0123456789";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;
		String name = "0123456789";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;
		String name = "";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;
		String name = "";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;
		String name = "0123456789";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture1_4()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;
		String name = "0123456789";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture1_5()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;
		String name = "0123456789";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture2_4()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;
		String name = "0123456789";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture2_5()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;
		String name = "";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture1_6()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;
		String name = "";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartProcessingInstructionNodeStep_fixture2_6()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;
		String name = "";

		fixture.startProcessingInstructionNodeStep(axis, name);

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
	public void testStartRelationalExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startRelationalExpr();

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
	public void testStartRelationalExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startRelationalExpr();

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
	public void testStartRelativeLocationPath_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startRelativeLocationPath();

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
	public void testStartRelativeLocationPath_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startRelativeLocationPath();

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
	public void testStartTextNodeStep_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 0;

		fixture.startTextNodeStep(axis);

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
	public void testStartTextNodeStep_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 1;

		fixture.startTextNodeStep(axis);

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
	public void testStartTextNodeStep_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 7;

		fixture.startTextNodeStep(axis);

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
	public void testStartTextNodeStep_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		int axis = 1;

		fixture.startTextNodeStep(axis);

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
	public void testStartTextNodeStep_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 7;

		fixture.startTextNodeStep(axis);

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
	public void testStartTextNodeStep_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		int axis = 0;

		fixture.startTextNodeStep(axis);

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
	public void testStartUnaryExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startUnaryExpr();

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
	public void testStartUnaryExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startUnaryExpr();

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
	public void testStartUnionExpr_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startUnionExpr();

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
	public void testStartUnionExpr_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startUnionExpr();

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
	public void testStartXPath_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();

		fixture.startXPath();

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
	public void testStartXPath_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();

		fixture.startXPath();

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
	public void testVariableReference_fixture1_1()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "";
		String variableName = "";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture2_1()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "0123456789";
		String variableName = "0123456789";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture2_2()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "0123456789";
		String variableName = "";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture2_3()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "";
		String variableName = "0123456789";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture2_4()
		throws Exception {
		XPathHandler fixture = getFixture2();
		String prefix = "";
		String variableName = "";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture1_2()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "0123456789";
		String variableName = "0123456789";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture1_3()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "0123456789";
		String variableName = "";

		fixture.variableReference(prefix, variableName);

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
	public void testVariableReference_fixture1_4()
		throws Exception {
		XPathHandler fixture = getFixture1();
		String prefix = "";
		String variableName = "0123456789";

		fixture.variableReference(prefix, variableName);

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
		new org.junit.runner.JUnitCore().run(XPathHandlerTest.class);
	}
}