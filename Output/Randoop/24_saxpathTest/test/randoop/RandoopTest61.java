package randoop;

import junit.framework.*;

public class RandoopTest61 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test1");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n");
    var0.startCommentNodeStep(10);
    var0.endRelativeLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) number(0.0)\n(8) startEqualityExpr()\n(9) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test2");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.endRelationalExpr(1);
    var0.endEqualityExpr(10);
    var0.startOrExpr();
    var0.endNameStep();
    var0.startXPath();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 0: hi!", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");
    var0.endOrExpr(true);
    var0.startAbsoluteLocationPath();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test3");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startPathExpr();
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endRelationalExpr(1)\n(9) endMultiplicativeExpr(0)\n(10) endFunction()\n(11) startCommentNodeStep(-1)\n(12) endNameStep()\n(13) endFunction()\n(14) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startNameStep(10, \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endCommentNodeStep()\n(7) endRelationalExpr(0)\n(8) startPredicate()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test5");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n", 100, "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test6");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startCommentNodeStep(100);
    var0.endPredicate();
    var0.endPathExpr();
    var0.endCommentNodeStep();

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test7");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test8");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test9");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endEqualityExpr(0);
    var0.endFilterExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test10");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    org.saxpath.helpers.DefaultXPathHandler var13 = new org.saxpath.helpers.DefaultXPathHandler();
    var13.number(10.0d);
    var13.endPathExpr();
    var13.startOrExpr();
    var13.startEqualityExpr();
    var13.endRelationalExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var13);
    org.saxpath.XPathHandler var22 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n");
    org.saxpath.conformance.ConformanceXPathHandler var25 = new org.saxpath.conformance.ConformanceXPathHandler();
    var25.startAbsoluteLocationPath();
    var25.endAndExpr(true);
    boolean var30 = var25.equals((java.lang.Object)'a');
    java.lang.String var31 = var25.toString();
    var25.startXPath();
    var25.endAllNodeStep();
    var25.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var25.endAbsoluteLocationPath();
    var25.endCommentNodeStep();
    var25.number(10);
    var25.endPathExpr();
    var25.endProcessingInstructionNodeStep();
    var25.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var25);
    org.saxpath.conformance.ConformanceXPathHandler var45 = new org.saxpath.conformance.ConformanceXPathHandler();
    var45.startAbsoluteLocationPath();
    var45.endEqualityExpr((-1));
    var45.endFilterExpr();
    var45.startUnionExpr();
    var45.endOrExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    com.werken.saxpath.XPathReader var54 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var55 = new org.saxpath.conformance.ConformanceXPathHandler();
    var55.startAbsoluteLocationPath();
    var55.endUnaryExpr(10);
    var55.number(1);
    var55.startAllNodeStep((-1));
    var55.startOrExpr();
    var54.setXPathHandler((org.saxpath.XPathHandler)var55);
    var55.endAndExpr(true);
    var55.startAndExpr();
    java.lang.String var68 = var55.toString();
    var55.startAndExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var55);
    org.saxpath.XPathHandler var71 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var72 = new org.saxpath.helpers.DefaultXPathHandler();
    var72.number(10.0d);
    var72.endNameStep();
    var72.endAbsoluteLocationPath();
    var72.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var72.startUnionExpr();
    var72.startEqualityExpr();
    var72.startAdditiveExpr();
    var72.startXPath();
    var72.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"+ "'", var68.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test11");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) endAdditiveExpr(10)\n", "(0) endAllNodeStep()\n(1) endXPath()\n(2) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(3) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(4) endAndExpr(false)\n");

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test12");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.endUnaryExpr(100);
    var0.endTextNodeStep();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startAndExpr();
    var0.startAndExpr();
    var0.endXPath();
    var0.startEqualityExpr();
    var0.startAllNodeStep(0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("org.saxpath.SAXPathParseException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test14");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endAndExpr(true);
    var9.startUnionExpr();
    boolean var14 = var0.equals((java.lang.Object)var9);
    var9.endAdditiveExpr(0);
    var9.startRelativeLocationPath();
    var9.startAbsoluteLocationPath();
    var9.startCommentNodeStep(1);
    var9.startUnaryExpr();
    var9.number(100.0d);
    var9.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test15");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^", 1, "org.saxpath.SAXPathParseException: ");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.saxpath.SAXPathParseException: \n(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^\n ^"+ "'", var5.equals("org.saxpath.SAXPathParseException: \n(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^\n ^"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test16");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.endUnaryExpr(100);
    var0.number(10.0d);
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) startFilterExpr()\n(7) literal(\"child\")\n(8) startUnaryExpr()\n(9) endAdditiveExpr(100)\n");

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test17");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    java.lang.String var4 = var0.toString();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n"+ "'", var4.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test18");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(1, " ^");
    var0.startFilterExpr();
    var0.endRelationalExpr(100);
    var0.startEqualityExpr();
    var0.endXPath();
    var0.endFunction();
    var0.startRelativeLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startNameStep(0, \" ^\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startEqualityExpr()\n(8) startPredicate()\n(9) startNameStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endAdditiveExpr(10)\n(11) endRelationalExpr(0)\n(12) endUnionExpr(false)\n(13) startEqualityExpr()\n(14) endTextNodeStep()\n(15) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:org.saxpath.SAXPathException:  ^\")\n(5) endCommentNodeStep()\n(6) endAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test19");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startTextNodeStep(100);
    var0.startUnionExpr();
    var0.startAndExpr();
    var0.startAbsoluteLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endEqualityExpr((-1));
    var9.endTextNodeStep();
    var9.endCommentNodeStep();
    var9.endRelativeLocationPath();
    var9.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var9.startFilterExpr();
    var9.literal("child");
    var9.startUnaryExpr();
    boolean var24 = var0.equals((java.lang.Object)var9);
    var9.endPathExpr();
    var9.endFilterExpr();
    var9.startRelationalExpr();
    var9.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test20");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test21");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.startUnionExpr();
    var0.endAndExpr(true);
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.number(10);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test22");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(true);
    var0.number((-1.0d));
    var0.variableReference("          ^", "org.saxpath.SAXPathParseException: ");
    var0.startAndExpr();
    var0.variableReference("\n ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    var0.endAdditiveExpr(0);
    var0.endAndExpr(false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test23");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startPathExpr();
    var0.startXPath();
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.endAndExpr(true);
    var0.endMultiplicativeExpr(10);
    var0.startUnionExpr();
    var0.number(1);
    var0.variableReference("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endAndExpr(true)\n(9) endPredicate()\n");

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test24");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.endFunction();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) endAndExpr(true)\n(3) startNameStep(1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n\")\n(4) startXPath()\n(5) startTextNodeStep(10)\n(6) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAbsoluteLocationPath()\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n\")\n");
    var0.startXPath();
    var0.endMultiplicativeExpr(1);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test25");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) endFilterExpr()\n");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test26");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startCommentNodeStep((-1));
    var0.startPathExpr();

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test27");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.startRelationalExpr();
    var0.endCommentNodeStep();
    var0.endUnionExpr(true);
    var0.endMultiplicativeExpr(100);
    var0.startAdditiveExpr();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test28");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    var0.number(100.0d);
    var0.startPathExpr();
    var0.endAdditiveExpr(0);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAbsoluteLocationPath()\n(10) endMultiplicativeExpr(10)\n(11) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.endProcessingInstructionNodeStep();

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test29");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.endAndExpr(true);
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test30");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startXPath();
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.endOrExpr(false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test31");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.getXPath();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test32");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var5 = new org.saxpath.conformance.ConformanceXPathHandler();
    var5.startAbsoluteLocationPath();
    var5.endUnaryExpr(10);
    var5.number(1);
    var5.startAllNodeStep((-1));
    var5.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endAndExpr(true);
    var14.startUnionExpr();
    boolean var19 = var5.equals((java.lang.Object)var14);
    var14.endAdditiveExpr(0);
    var14.startRelativeLocationPath();
    var14.endXPath();
    var14.startCommentNodeStep((-1));
    var14.endTextNodeStep();
    boolean var27 = var0.equals((java.lang.Object)var14);
    var14.startFilterExpr();
    var14.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var14.endAndExpr(true);
    var14.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var14.endRelativeLocationPath();
    var14.endOrExpr(false);
    var14.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test33");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    org.saxpath.XPathHandler var13 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.startNameStep((-1), "hi!", "hi!");
    var14.startFilterExpr();
    var14.endUnaryExpr(10);
    var14.endAllNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var14);
    org.saxpath.helpers.DefaultXPathHandler var24 = new org.saxpath.helpers.DefaultXPathHandler();
    var24.number(10.0d);
    var24.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var24.startAdditiveExpr();
    var24.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var24.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var24.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var24.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathException:  ^");
    var24.endAbsoluteLocationPath();
    var24.startAndExpr();
    var24.startXPath();
    var24.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    var24.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var24);
    var24.startFunction("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startXPath()\n");
    var24.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test34");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var0.endXPath();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n");
    var0.endOrExpr(false);
    var0.endTextNodeStep();
    org.saxpath.helpers.DefaultXPathHandler var23 = new org.saxpath.helpers.DefaultXPathHandler();
    var23.number(10.0d);
    var23.endPathExpr();
    var23.startOrExpr();
    var23.endUnionExpr(true);
    var23.endFunction();
    var23.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    boolean var33 = var0.equals((java.lang.Object)var23);
    var23.endFilterExpr();
    var23.endTextNodeStep();
    var23.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test35");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.endFilterExpr();
    var0.startCommentNodeStep(0);
    var0.startEqualityExpr();
    var0.startAndExpr();
    var0.startTextNodeStep(1);
    var0.literal("org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test36");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr(0);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test37");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.XPathHandler var10 = var0.getXPathHandler();
    org.saxpath.XPathHandler var11 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test38");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.endUnionExpr(true);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test39");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.endAllNodeStep();
    var11.endXPath();
    var11.number(1.0d);
    var11.startTextNodeStep(1);
    var11.endOrExpr(true);
    var11.startRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    var11.startRelationalExpr();
    var11.startFunction("com.werken.saxpath.XPathSyntaxException: 100:  ^", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var11.startAdditiveExpr();
    var11.endTextNodeStep();

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test40");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startEqualityExpr();
    var1.startUnaryExpr();
    var1.startCommentNodeStep(1);
    var1.endAllNodeStep();
    var1.endRelationalExpr(0);
    var1.endRelativeLocationPath();
    var1.endAllNodeStep();
    var1.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: \n ^\n ^");
    var1.startRelativeLocationPath();
    var1.endOrExpr(true);
    var1.number(100.0d);
    java.lang.String var31 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endAllNodeStep()\n(10) endRelationalExpr(0)\n(11) endRelativeLocationPath()\n(12) endAllNodeStep()\n(13) startNameStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\", \"org.saxpath.SAXPathException: \n ^\n ^\")\n(14) startRelativeLocationPath()\n(15) endOrExpr(true)\n(16) number(100.0)\n"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endAllNodeStep()\n(10) endRelationalExpr(0)\n(11) endRelativeLocationPath()\n(12) endAllNodeStep()\n(13) startNameStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\", \"org.saxpath.SAXPathException: \n ^\n ^\")\n(14) startRelativeLocationPath()\n(15) endOrExpr(true)\n(16) number(100.0)\n"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test41");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    org.saxpath.SAXPathParseException var8 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 100:  ^");
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var13 = var12.getPositionMarker();
    java.lang.String var14 = var12.getPositionMarker();
    java.lang.Throwable[] var15 = var12.getSuppressed();
    java.lang.String var16 = var12.getMultilineMessage();
    var8.addSuppressed((java.lang.Throwable)var12);
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var19 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "\n ^\n ^"+ "'", var16.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test42");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.endTextNodeStep();
    var0.endAdditiveExpr(0);
    java.lang.String var12 = var0.toString();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test43");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(100);
    var0.endTextNodeStep();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test44");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startPathExpr();
    var0.endRelativeLocationPath();
    var0.startXPath();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test45");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endPredicate();
    var0.endAdditiveExpr(1);
    var0.startNameStep(100, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.endAdditiveExpr(0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test46");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test47");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endAdditiveExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endCommentNodeStep();
    boolean var15 = var0.equals((java.lang.Object)"(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n");
    var0.endAbsoluteLocationPath();
    var0.startFunction("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n");
    var0.endXPath();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test48");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.endUnionExpr(false);
    var0.startNameStep((-1), "                                                                                                    ^", "\n ^\n ^");
    var0.endAllNodeStep();
    var0.startUnionExpr();
    var0.startAllNodeStep(0);
    var0.startRelativeLocationPath();
    var0.endNameStep();

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test49");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.endFunction();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endAndExpr(true);
    boolean var17 = var12.equals((java.lang.Object)'a');
    var12.startAbsoluteLocationPath();
    var12.startRelativeLocationPath();
    var12.endRelationalExpr(10);
    var12.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var12.startCommentNodeStep((-1));
    boolean var27 = var0.equals((java.lang.Object)var12);
    var0.endFunction();
    var0.startAllNodeStep(1);
    var0.endUnaryExpr(1);
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test50");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    int var10 = var3.getPosition();
    org.saxpath.SAXPathException var11 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var12 = var3.getPositionMarker();
    int var13 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test51");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.number(100.0d);
    var0.startOrExpr();
    var0.endOrExpr(false);
    var0.endUnionExpr(false);
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    var0.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) startAdditiveExpr()\n(7) startMultiplicativeExpr()\n(8) endRelativeLocationPath()\n(9) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test52");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startPathExpr();
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.endCommentNodeStep();

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test53");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.endUnaryExpr(10);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.endAdditiveExpr((-1));
    var0.endMultiplicativeExpr(100);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test54");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endFunction();
    var0.endXPath();
    var0.endTextNodeStep();
    var0.startFilterExpr();

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test55");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "                                                                                                    ^");
    var0.startNameStep((-1), "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAndExpr(true);
    var0.endAndExpr(true);
    var0.startFilterExpr();

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test56");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(100);
    var0.endUnionExpr(false);
    var0.startOrExpr();
    var0.endPredicate();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test57");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endPredicate();
    var0.endFunction();
    var0.endRelationalExpr(0);
    var0.literal("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.startAbsoluteLocationPath();
    var0.endAdditiveExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test58");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.startTextNodeStep(10);
    var0.startAbsoluteLocationPath();
    org.saxpath.XPathSyntaxException var18 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    int var19 = var18.getPosition();
    java.lang.String var20 = var18.getMultilineMessage();
    java.lang.String var21 = var18.getMultilineMessage();
    java.lang.String var22 = var18.getXPath();
    boolean var23 = var0.equals((java.lang.Object)var18);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "\n ^\n ^"+ "'", var20.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "\n ^\n ^"+ "'", var21.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + " ^"+ "'", var22.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test59");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.endUnaryExpr(0);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.number(10.0d);
    var14.endRelativeLocationPath();
    var14.startRelativeLocationPath();
    var14.endFilterExpr();
    var14.endAdditiveExpr(100);
    var14.endRelationalExpr((-1));
    var14.endProcessingInstructionNodeStep();
    var14.endAndExpr(true);
    boolean var27 = var0.equals((java.lang.Object)var14);
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test60");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startPathExpr()\n(6) startOrExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test62");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.endAdditiveExpr((-1));
    var0.endOrExpr(true);
    var0.endRelationalExpr(100);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test63");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endAndExpr(true);
    var0.startUnionExpr();
    var0.endPredicate();
    var0.endFunction();
    var0.startXPath();
    var0.endMultiplicativeExpr(0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test64");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.startPredicate();
    var0.endMultiplicativeExpr(10);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test65");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(0);
    var0.endRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.number(0.0d);
    var0.number(100.0d);
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test66");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startXPath();
    var7.startXPath();
    var7.startAdditiveExpr();
    var7.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endUnionExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) endNameStep()\n(8) endMultiplicativeExpr(1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test67");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) startProcessingInstructionNodeStep(0, \"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) endRelativeLocationPath()\n(7) endFunction()\n(8) endTextNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n\n          ^");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test68");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startAndExpr();
    var0.startPathExpr();
    var0.startUnionExpr();

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test69");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endUnaryExpr(10);
    var13.startMultiplicativeExpr();
    var13.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var13);
    org.saxpath.XPathHandler var20 = var0.getXPathHandler();
    org.saxpath.XPathHandler var21 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var22 = new org.saxpath.conformance.ConformanceXPathHandler();
    var22.startAbsoluteLocationPath();
    var22.endTextNodeStep();
    var22.endAdditiveExpr(1);
    java.lang.String var27 = var22.toString();
    var22.startRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endAndExpr(true);
    boolean var34 = var29.equals((java.lang.Object)'a');
    var29.startAllNodeStep(100);
    var29.endOrExpr(false);
    var29.number(10);
    boolean var41 = var22.equals((java.lang.Object)var29);
    var29.startMultiplicativeExpr();
    var29.startPathExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    var29.startFilterExpr();
    var29.endAdditiveExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test70");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startCommentNodeStep(10);
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endNameStep();
    var0.number(1.0d);
    var0.endNameStep();

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test71");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startXPath();
    var0.startFilterExpr();
    var0.startAllNodeStep(1);
    var0.startAdditiveExpr();
    var0.startPathExpr();

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test72");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test73");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.endUnaryExpr(0);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");
    var0.endUnaryExpr((-1));
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startFunction(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(4) endPathExpr()\n(5) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: :com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endFunction()\n(7) endEqualityExpr(1)\n(8) endFunction()\n(9) startTextNodeStep(1)\n(10) endRelativeLocationPath()\n(11) endUnionExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) startOrExpr()\n(5) endAbsoluteLocationPath()\n(6) startMultiplicativeExpr()\n(7) endXPath()\n(8) startPredicate()\n");

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test74");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.number(10);
    var0.endPathExpr();
    var0.startTextNodeStep(10);
    var0.endPredicate();
    var0.startOrExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n");
    var0.endPredicate();
    org.saxpath.conformance.ConformanceXPathHandler var24 = new org.saxpath.conformance.ConformanceXPathHandler();
    var24.startAbsoluteLocationPath();
    var24.endTextNodeStep();
    var24.endAdditiveExpr(1);
    java.lang.String var29 = var24.toString();
    var24.startMultiplicativeExpr();
    var24.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var24.variableReference("hi!", " ^");
    var24.endNameStep();
    var24.endRelativeLocationPath();
    var24.endRelationalExpr(100);
    boolean var41 = var0.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test75");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.endFunction();
    java.lang.String var12 = var0.toString();
    var0.endRelativeLocationPath();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test76");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(100);
    var0.endAdditiveExpr(10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test77");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var5 = var3.getPositionMarker();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test78");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endOrExpr(false);
    var0.endEqualityExpr(100);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startXPath()\n(4) endAllNodeStep()\n(5) endRelationalExpr(1)\n(6) endAllNodeStep()\n");
    var0.startUnaryExpr();
    var0.startUnionExpr();

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test79");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endFunction();
    var0.endPredicate();
    var0.endAndExpr(false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test80");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test81");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startRelativeLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startOrExpr();
    var0.endMultiplicativeExpr(0);
    var0.endRelationalExpr(0);
    var0.endMultiplicativeExpr(100);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test82");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.endEqualityExpr(10);
    var0.startTextNodeStep((-1));
    var0.endPathExpr();
    var0.startRelationalExpr();
    var0.startRelationalExpr();
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.startCommentNodeStep(0);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test83");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var8 = new org.saxpath.helpers.DefaultXPathHandler();
    var8.number(10.0d);
    var8.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.startUnionExpr();
    var8.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    org.saxpath.XPathHandler var17 = var0.getXPathHandler();
    var0.parse("org.saxpath.SAXPathException:  ^");
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endTextNodeStep();
    var20.endAdditiveExpr(1);
    java.lang.String var25 = var20.toString();
    var20.startRelativeLocationPath();
    var20.startUnaryExpr();
    var20.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "\n ^\n ^");
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.helpers.DefaultXPathHandler var32 = new org.saxpath.helpers.DefaultXPathHandler();
    var32.number(10.0d);
    var32.endRelativeLocationPath();
    var32.startRelativeLocationPath();
    var32.endFilterExpr();
    var32.endXPath();
    var32.startUnionExpr();
    var32.endMultiplicativeExpr(100);
    var32.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    org.saxpath.conformance.ConformanceXPathHandler var46 = new org.saxpath.conformance.ConformanceXPathHandler();
    var46.startAbsoluteLocationPath();
    var46.endAndExpr(true);
    boolean var51 = var46.equals((java.lang.Object)'a');
    java.lang.String var52 = var46.toString();
    var46.startXPath();
    var46.endAllNodeStep();
    var46.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var46.endAbsoluteLocationPath();
    var46.endCommentNodeStep();
    var46.number(10);
    var46.endPathExpr();
    var46.endProcessingInstructionNodeStep();
    var46.startAdditiveExpr();
    var46.startUnaryExpr();
    var46.startAdditiveExpr();
    var46.number(1.0d);
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var46.endAbsoluteLocationPath();
    var46.variableReference("(0) startRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) startAllNodeStep(-1)\n(7) startEqualityExpr()\n(8) startUnionExpr()\n(9) literal(\"          ^\")\n");
    var46.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var52.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test84");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.startXPath();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test85");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test86");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.number(10);
    var0.endFilterExpr();
    var0.startXPath();
    var0.endEqualityExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test87");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.endUnionExpr(false);
    var0.endRelationalExpr(100);
    var0.endEqualityExpr(10);
    var0.startOrExpr();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test88");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endAndExpr(true);
    var9.startUnionExpr();
    boolean var14 = var0.equals((java.lang.Object)var9);
    var9.endAdditiveExpr(0);
    var9.startRelativeLocationPath();
    var9.startPredicate();
    var9.startCommentNodeStep(100);
    var9.startCommentNodeStep(0);
    var9.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test89");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endEqualityExpr(10);
    var0.startFunction("child", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.endUnaryExpr(1);
    var0.endFunction();
    java.lang.String var15 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startOrExpr();
    var0.startCommentNodeStep(10);
    var0.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test90");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    int var10 = var3.getPosition();
    org.saxpath.SAXPathException var11 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    int var12 = var3.getPosition();
    java.lang.String var13 = var3.getMultilineMessage();
    java.lang.String var14 = var3.toString();
    org.saxpath.XPathSyntaxException var18 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var19 = var18.getPosition();
    int var20 = var18.getPosition();
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException((java.lang.Throwable)var18);
    org.saxpath.XPathSyntaxException var25 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var26 = var25.getMultilineMessage();
    int var27 = var25.getPosition();
    java.lang.String var28 = var25.getXPath();
    var18.addSuppressed((java.lang.Throwable)var25);
    java.lang.String var30 = var18.toString();
    java.lang.String var31 = var18.getXPath();
    var3.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var33 = var18.toString();
    java.lang.String var34 = var18.toString();
    java.lang.String var35 = var18.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "\n ^\n ^"+ "'", var26.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var33.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var34.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var35.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test91");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startPathExpr();
    var0.startXPath();
    var0.endNameStep();

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test92");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startTextNodeStep(1);
    var0.startUnaryExpr();

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test93");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startNameStep(1, "^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endAndExpr(true);
    var0.endRelationalExpr(10);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test94");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(true);
    var0.endRelationalExpr(1);
    var0.endTextNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) endRelativeLocationPath()\n(9) endNameStep()\n(10) endAllNodeStep()\n(11) endXPath()\n(12) endEqualityExpr(1)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var0.endUnaryExpr(100);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test95");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endMultiplicativeExpr(0);
    var0.startAdditiveExpr();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    var0.startAllNodeStep(0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test96");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startAdditiveExpr();
    var7.endAbsoluteLocationPath();
    var7.endAndExpr(false);
    var7.startRelativeLocationPath();
    var7.startMultiplicativeExpr();
    var7.endProcessingInstructionNodeStep();
    var7.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test97");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var8 = new org.saxpath.helpers.DefaultXPathHandler();
    var8.number(10.0d);
    var8.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.startUnionExpr();
    var8.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    org.saxpath.XPathHandler var17 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endPathExpr();
    var18.endUnionExpr(false);
    var18.startPathExpr();
    var18.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var29 = new org.saxpath.helpers.DefaultXPathHandler();
    var29.number(10.0d);
    var29.endRelativeLocationPath();
    var29.startRelativeLocationPath();
    var29.endFilterExpr();
    var29.endXPath();
    var29.number(1);
    var29.startAbsoluteLocationPath();
    var29.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    var29.startPredicate();
    var29.startTextNodeStep(0);
    var29.startTextNodeStep(100);
    var29.startFilterExpr();
    var29.number(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test98");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.startMultiplicativeExpr();
    var0.startFunction("org.saxpath.SAXPathException: \n ^\n ^", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n          ^");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) endRelativeLocationPath()\n(5) endPathExpr()\n(6) startRelationalExpr()\n(7) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n(7) startPredicate()\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n\")\n(8) endTextNodeStep()\n");

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test99");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endRelationalExpr(1);
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endXPath();
    var0.endOrExpr(false);
    var0.startCommentNodeStep((-1));
    var0.endTextNodeStep();

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test100");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.endCommentNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endAndExpr(true);
    var13.endPathExpr();
    var13.endTextNodeStep();
    var13.startUnaryExpr();
    var13.endUnionExpr(true);
    var13.startProcessingInstructionNodeStep(100, "hi!");
    boolean var25 = var0.equals((java.lang.Object)var13);
    var13.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var13.startXPath();
    var13.endAbsoluteLocationPath();
    var13.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test101");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(10);
    var0.number(10.0d);
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endPathExpr();

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test102");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAdditiveExpr(1);
    var0.startMultiplicativeExpr();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^");

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test103");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: ^");
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    var0.endAllNodeStep();
    var0.startRelativeLocationPath();
    var0.startUnionExpr();
    var0.startPredicate();

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test104");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var0.parse("org.saxpath.SAXPathException:  ^");
    org.saxpath.XPathHandler var16 = var0.getXPathHandler();
    var0.parse("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    org.saxpath.XPathHandler var19 = var0.getXPathHandler();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test105");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.startPathExpr();
    var0.endCommentNodeStep();
    var0.startFunction("child", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startXPath()\n(4) endXPath()\n");
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test106");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var8 = new org.saxpath.helpers.DefaultXPathHandler();
    var8.number(10.0d);
    var8.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.startUnionExpr();
    var8.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var8.endAllNodeStep();
    var8.endAndExpr(true);
    var8.endXPath();
    var8.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test107");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endEqualityExpr(1);
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var0.endFunction();
    var0.startTextNodeStep(100);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test108");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.number(10.0d);
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.endEqualityExpr(100);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test109");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startFunction(\":(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\")\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startFunction(\":(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\")\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n"+ "'", var2.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startFunction(\":(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\")\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test110");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getPositionMarker();
    int var8 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\n ^\n ^"+ "'", var5.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\n ^\n ^"+ "'", var6.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test111");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endNameStep();
    var0.endAllNodeStep();
    var0.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test112");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n");
    var0.endRelationalExpr(10);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test113");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.endFunction();
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endEqualityExpr(0);
    var0.endEqualityExpr(10);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test114");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startOrExpr();
    var0.endAdditiveExpr((-1));
    var0.endUnionExpr(true);
    var0.endTextNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.endFunction();
    var0.endFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n");
    var0.startPredicate();
    var0.startRelativeLocationPath();

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test115");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var0.startXPath();
    var0.endFunction();
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startTextNodeStep((-1));
    var0.startRelationalExpr();

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test116");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    int var10 = var3.getPosition();
    org.saxpath.SAXPathException var11 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    int var12 = var3.getPosition();
    java.lang.String var13 = var3.getMultilineMessage();
    java.lang.String var14 = var3.toString();
    org.saxpath.XPathSyntaxException var18 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var19 = var18.getPosition();
    int var20 = var18.getPosition();
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException((java.lang.Throwable)var18);
    org.saxpath.XPathSyntaxException var25 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var26 = var25.getMultilineMessage();
    int var27 = var25.getPosition();
    java.lang.String var28 = var25.getXPath();
    var18.addSuppressed((java.lang.Throwable)var25);
    java.lang.String var30 = var18.toString();
    java.lang.String var31 = var18.getXPath();
    var3.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var33 = var18.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "\n ^\n ^"+ "'", var26.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "                                                                                                    ^"+ "'", var33.equals("                                                                                                    ^"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test117");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endFunction();
    var0.startEqualityExpr();
    var0.startRelationalExpr();

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startAndExpr()\n(6) startOrExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test119");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.endNameStep();

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test120");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.endFilterExpr();
    com.werken.saxpath.XPathReader var12 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endUnaryExpr(10);
    var13.number(1);
    var13.startAllNodeStep((-1));
    var13.startOrExpr();
    var12.setXPathHandler((org.saxpath.XPathHandler)var13);
    org.saxpath.conformance.ConformanceXPathHandler var23 = new org.saxpath.conformance.ConformanceXPathHandler();
    var23.startAbsoluteLocationPath();
    var23.endAndExpr(true);
    boolean var28 = var23.equals((java.lang.Object)'a');
    var23.startAbsoluteLocationPath();
    var23.endMultiplicativeExpr((-1));
    var23.endEqualityExpr((-1));
    var23.startAbsoluteLocationPath();
    var23.startTextNodeStep(10);
    var23.startAndExpr();
    var23.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var39 = new org.saxpath.conformance.ConformanceXPathHandler();
    var39.startAbsoluteLocationPath();
    var39.endAndExpr(true);
    boolean var44 = var39.equals((java.lang.Object)'a');
    java.lang.String var45 = var39.toString();
    var39.startXPath();
    var39.endAllNodeStep();
    var39.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var39.number(100.0d);
    var39.endMultiplicativeExpr((-1));
    var39.endPathExpr();
    var39.startNameStep((-1), "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    boolean var60 = var23.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var12.setXPathHandler((org.saxpath.XPathHandler)var23);
    boolean var62 = var0.equals((java.lang.Object)var23);
    org.saxpath.XPathSyntaxException var66 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", 10, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    java.lang.Throwable[] var67 = var66.getSuppressed();
    java.lang.String var68 = var66.getMultilineMessage();
    boolean var69 = var0.equals((java.lang.Object)var66);
    java.lang.String var70 = var66.toString();
    java.lang.String var71 = var66.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var45.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n\n          ^"+ "'", var68.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var70.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var71.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test121");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startMultiplicativeExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test122");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.startAllNodeStep(0);
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.startRelationalExpr();

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test123");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endFunction();
    var0.endUnionExpr(true);
    var0.startAllNodeStep(10);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", " ^");
    var0.endFilterExpr();
    var0.endMultiplicativeExpr(100);
    var0.endProcessingInstructionNodeStep();

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test124");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startXPath();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endAbsoluteLocationPath();

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test125");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endEqualityExpr((-1));
    var1.endTextNodeStep();
    var1.startAllNodeStep(0);
    var1.startFilterExpr();
    var1.endOrExpr(true);
    var1.endRelationalExpr(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endEqualityExpr((-1));
    var14.endTextNodeStep();
    var14.endTextNodeStep();
    var14.startTextNodeStep(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var14);
    var14.endTextNodeStep();
    var14.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) endRelativeLocationPath()\n(7) endFunction()\n(8) endTextNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endAllNodeStep()\n(10) endRelationalExpr(0)\n(11) endRelativeLocationPath()\n(12) endAllNodeStep()\n(13) startNameStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\", \"org.saxpath.SAXPathException: \n ^\n ^\")\n(14) startRelativeLocationPath()\n");
    var14.endNameStep();

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test126");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startXPath();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.number(100);
    var0.startTextNodeStep((-1));
    var0.startPredicate();
    var0.startPredicate();

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test127");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endXPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n");
    var0.number(0);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test128");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, " ^");
    int var4 = var3.getPosition();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException(" ^");
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    var3.addSuppressed((java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var16.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test129");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startAndExpr();
    var1.endFilterExpr();
    var1.endProcessingInstructionNodeStep();
    var1.number((-1));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test130");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    java.lang.String var12 = var11.getXPath();
    var7.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var14 = var11.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathException:  ^"+ "'", var12.equals("org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test131");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAllNodeStep();
    var0.startCommentNodeStep((-1));
    var0.startUnionExpr();

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test132");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.startOrExpr();
    var0.endMultiplicativeExpr(100);
    var0.endFilterExpr();
    var0.endPathExpr();

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test133");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endNameStep()\n(8) endNameStep()\n(9) endOrExpr(true)\n(10) endNameStep()\n", 0, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n\n^");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test134");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.endRelationalExpr(1);
    var0.endEqualityExpr(10);
    var0.startOrExpr();
    var0.endNameStep();
    var0.startXPath();
    var0.endEqualityExpr((-1));
    var0.endAdditiveExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test135");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) endUnionExpr(false)\n(5) endRelativeLocationPath()\n(6) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\")\n(7) endXPath()\n(8) startAndExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test136");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endAdditiveExpr(1);
    var0.endNameStep();
    var0.startAdditiveExpr();
    var0.startAbsoluteLocationPath();
    var0.startTextNodeStep(0);
    var0.endProcessingInstructionNodeStep();
    var0.startAdditiveExpr();

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test137");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endOrExpr(false);
    var0.endMultiplicativeExpr(10);
    var0.startCommentNodeStep((-1));
    var0.endEqualityExpr(1);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: -1: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endXPath()\n");
    var0.startXPath();

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test138");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(true);
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var0.number(0);
    var0.startPredicate();

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test139");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var0.parse("org.saxpath.SAXPathException:  ^");
    org.saxpath.XPathHandler var16 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var17 = new org.saxpath.helpers.DefaultXPathHandler();
    var17.endRelativeLocationPath();
    var17.endFilterExpr();
    var17.endUnionExpr(false);
    var17.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "\n ^\n ^");
    var17.endAbsoluteLocationPath();
    var17.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var17);
    org.saxpath.conformance.ConformanceXPathHandler var28 = new org.saxpath.conformance.ConformanceXPathHandler();
    var28.startAbsoluteLocationPath();
    var28.endAndExpr(true);
    boolean var33 = var28.equals((java.lang.Object)'a');
    java.lang.String var34 = var28.toString();
    var28.startXPath();
    var28.startPathExpr();
    var28.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var28.startXPath();
    var28.endAndExpr(true);
    java.lang.String var44 = var28.toString();
    var28.endPredicate();
    var28.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    org.saxpath.conformance.ConformanceXPathHandler var49 = new org.saxpath.conformance.ConformanceXPathHandler();
    var49.startAbsoluteLocationPath();
    var49.endUnaryExpr(10);
    var49.number(1);
    boolean var56 = var49.equals((java.lang.Object)10L);
    var49.startCommentNodeStep(100);
    var49.startUnionExpr();
    boolean var60 = var28.equals((java.lang.Object)var49);
    var49.endProcessingInstructionNodeStep();
    var49.startMultiplicativeExpr();
    var49.endAdditiveExpr(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var49);
    org.saxpath.conformance.ConformanceXPathHandler var66 = new org.saxpath.conformance.ConformanceXPathHandler();
    var66.startAbsoluteLocationPath();
    var66.endTextNodeStep();
    var66.endAdditiveExpr(1);
    java.lang.String var71 = var66.toString();
    var66.startMultiplicativeExpr();
    var66.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var66.endAdditiveExpr(10);
    var66.startRelativeLocationPath();
    var66.endFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var66);
    java.lang.String var81 = var66.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var34.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var44.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var71.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n(6) startRelativeLocationPath()\n(7) endFilterExpr()\n"+ "'", var81.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n(6) startRelativeLocationPath()\n(7) endFilterExpr()\n"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test140");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.endAdditiveExpr(100);
    var0.endFunction();
    var0.endRelationalExpr(0);
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test141");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startEqualityExpr();
    var1.startUnaryExpr();
    var1.startCommentNodeStep(1);
    var1.endUnionExpr(true);
    var1.endRelativeLocationPath();
    var1.endNameStep();
    var1.endXPath();
    var1.endMultiplicativeExpr((-1));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test142");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.helpers.DefaultXPathHandler var10 = new org.saxpath.helpers.DefaultXPathHandler();
    var10.number(10.0d);
    var10.endNameStep();
    var10.number(0);
    var10.startProcessingInstructionNodeStep((-1), " ^");
    var10.endRelativeLocationPath();
    var10.endProcessingInstructionNodeStep();
    var10.endAllNodeStep();
    var10.startUnaryExpr();
    var10.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var0.parse("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    org.saxpath.XPathHandler var29 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startFunction(\":(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\")\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    org.saxpath.XPathHandler var32 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test143");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    java.lang.String var5 = var0.toString();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test144");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    org.saxpath.helpers.DefaultXPathHandler var6 = new org.saxpath.helpers.DefaultXPathHandler();
    var6.number(10.0d);
    var6.endPathExpr();
    var6.endPredicate();
    var6.endAndExpr(true);
    boolean var13 = var0.equals((java.lang.Object)var6);
    var0.endUnaryExpr((-1));
    var0.startPredicate();
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\n ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test145");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test146");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.endEqualityExpr(1);
    var0.endOrExpr(true);
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "hi!");
    var0.endPredicate();
    var0.startFilterExpr();
    var0.endFunction();
    var0.endTextNodeStep();
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test147");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(1);
    var0.startTextNodeStep(1);
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endTextNodeStep();
    var11.endAdditiveExpr(1);
    java.lang.String var16 = var11.toString();
    var11.startMultiplicativeExpr();
    var11.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var11.startAllNodeStep((-1));
    var11.endPathExpr();
    var11.endPredicate();
    var11.endPathExpr();
    boolean var26 = var0.equals((java.lang.Object)var11);
    var0.startEqualityExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test148");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAdditiveExpr()\n(11) endAdditiveExpr(1)\n");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    org.saxpath.XPathSyntaxException var6 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var7 = var6.getPositionMarker();
    int var8 = var6.getPosition();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    java.lang.String var10 = var6.getMultilineMessage();
    java.lang.String var11 = var6.toString();
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var13 = var6.getXPath();
    org.saxpath.XPathSyntaxException var17 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var18 = var17.toString();
    java.lang.Throwable[] var19 = var17.getSuppressed();
    org.saxpath.SAXPathParseException var21 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var17.addSuppressed((java.lang.Throwable)var21);
    java.lang.String var23 = var17.toString();
    int var24 = var17.getPosition();
    var6.addSuppressed((java.lang.Throwable)var17);
    java.lang.String var26 = var6.toString();
    java.lang.String var27 = var6.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test149");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startAllNodeStep(100);
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.endAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(true);
    var0.startPredicate();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test150");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.startOrExpr();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test151");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startEqualityExpr();
    var1.startUnaryExpr();
    var1.startUnionExpr();
    var1.endEqualityExpr(0);
    var1.endRelativeLocationPath();
    var1.endOrExpr(false);
    var1.endRelationalExpr(1);
    var1.startPredicate();

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test152");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    java.lang.String var9 = var0.toString();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(10);
    var0.startRelativeLocationPath();
    var0.startAllNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test153");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    java.lang.String var11 = var0.toString();
    var0.endAndExpr(true);
    var0.startEqualityExpr();
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.number(10.0d);
    var15.endPathExpr();
    var15.endUnionExpr(false);
    var15.startPathExpr();
    var15.startOrExpr();
    var15.startCommentNodeStep(0);
    var15.startMultiplicativeExpr();
    var15.endXPath();
    var15.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var15.startPredicate();
    boolean var32 = var0.equals((java.lang.Object)var15);
    var15.endCommentNodeStep();
    var15.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test154");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.getMultilineMessage();
    int var13 = var3.getPosition();
    java.lang.String var14 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var18 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var19 = var18.getPositionMarker();
    int var20 = var18.getPosition();
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException((java.lang.Throwable)var18);
    java.lang.String var22 = var18.getMultilineMessage();
    java.lang.String var23 = var18.toString();
    java.lang.String var24 = var18.toString();
    var3.addSuppressed((java.lang.Throwable)var18);
    java.lang.Throwable[] var26 = var3.getSuppressed();
    java.lang.String var27 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var12.equals("org.saxpath.SAXPathParseException: \nhi!\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "^"+ "'", var14.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + " ^"+ "'", var19.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "^"+ "'", var27.equals("^"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test155");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.XPathHandler var13 = var0.getXPathHandler();
    org.saxpath.XPathHandler var14 = var0.getXPathHandler();
    var0.parse("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    org.saxpath.conformance.ConformanceXPathHandler var17 = new org.saxpath.conformance.ConformanceXPathHandler();
    var17.startAbsoluteLocationPath();
    var17.endAndExpr(true);
    boolean var22 = var17.equals((java.lang.Object)'a');
    java.lang.String var23 = var17.toString();
    var17.startXPath();
    var17.startPathExpr();
    var17.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.setXPathHandler((org.saxpath.XPathHandler)var17);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    com.werken.saxpath.XPathReader var33 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var34 = new org.saxpath.conformance.ConformanceXPathHandler();
    var34.startAbsoluteLocationPath();
    var34.endUnaryExpr(10);
    var34.number(1);
    var34.startAllNodeStep((-1));
    var34.startOrExpr();
    var33.setXPathHandler((org.saxpath.XPathHandler)var34);
    var34.endUnaryExpr(1);
    var34.startEqualityExpr();
    var34.endPredicate();
    var0.setXPathHandler((org.saxpath.XPathHandler)var34);
    org.saxpath.XPathHandler var49 = var0.getXPathHandler();
    org.saxpath.XPathHandler var50 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var51 = new org.saxpath.helpers.DefaultXPathHandler();
    var51.number(10.0d);
    var51.endRelativeLocationPath();
    var51.startRelativeLocationPath();
    var51.endFilterExpr();
    var51.endAdditiveExpr(100);
    var51.endRelativeLocationPath();
    var51.endUnaryExpr(1);
    var51.endProcessingInstructionNodeStep();
    var51.endAbsoluteLocationPath();
    var51.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var51);
    var51.endFunction();
    var51.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n\n^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test156");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endFunction();
    var0.startAndExpr();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.endFunction();
    var0.endTextNodeStep();
    var0.number(0.0d);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test157");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var0.parse("org.saxpath.SAXPathException:  ^");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.endPathExpr();
    var20.endUnionExpr(false);
    var20.endEqualityExpr(1);
    var20.endXPath();
    var20.endPathExpr();
    var20.startMultiplicativeExpr();
    var20.endFilterExpr();
    var20.endNameStep();
    var20.startRelationalExpr();
    var20.endOrExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.XPathHandler var37 = var0.getXPathHandler();
    org.saxpath.XPathHandler var38 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var39 = new org.saxpath.helpers.DefaultXPathHandler();
    var39.number(10.0d);
    var39.endPathExpr();
    var39.endPredicate();
    var39.endAndExpr(true);
    var39.endPathExpr();
    var39.endFunction();
    var0.setXPathHandler((org.saxpath.XPathHandler)var39);
    var39.number(0.0d);
    var39.startRelativeLocationPath();
    var39.startTextNodeStep(0);
    var39.startTextNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test158");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startEqualityExpr();
    var0.startAndExpr();
    var0.startRelativeLocationPath();
    var0.startPathExpr();
    var0.startPathExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test159");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    org.saxpath.helpers.DefaultXPathHandler var6 = new org.saxpath.helpers.DefaultXPathHandler();
    var6.number(10.0d);
    var6.endPathExpr();
    var6.endPredicate();
    var6.endAndExpr(true);
    boolean var13 = var0.equals((java.lang.Object)var6);
    var0.number(0.0d);
    var0.endCommentNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startUnaryExpr();
    org.saxpath.helpers.DefaultXPathHandler var22 = new org.saxpath.helpers.DefaultXPathHandler();
    var22.number(10.0d);
    var22.endNameStep();
    var22.endAbsoluteLocationPath();
    var22.startNameStep(10, "child", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var22.endAdditiveExpr(1);
    var22.startCommentNodeStep((-1));
    var22.endPredicate();
    var22.startEqualityExpr();
    var22.startAdditiveExpr();
    boolean var38 = var0.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test160");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startRelativeLocationPath();
    var7.endProcessingInstructionNodeStep();
    var7.startEqualityExpr();
    var7.endTextNodeStep();
    var7.endRelationalExpr(0);
    var7.endAndExpr(false);
    var7.startOrExpr();
    var7.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test161");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getMultilineMessage();
    int var12 = var7.getPosition();
    java.lang.String var13 = var7.getXPath();
    java.lang.String var14 = var7.getPositionMarker();
    java.lang.Throwable[] var15 = var7.getSuppressed();
    java.lang.String var16 = var7.getXPath();
    java.lang.Throwable[] var17 = var7.getSuppressed();
    java.lang.String var18 = var7.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test162");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endAndExpr(true);
    var9.startUnionExpr();
    boolean var14 = var0.equals((java.lang.Object)var9);
    var0.endUnaryExpr(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endUnionExpr(false);
    var0.endCommentNodeStep();
    var0.endAdditiveExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test163");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endPredicate()\n(8) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\")\n(9) number(0.0)\n(10) endAndExpr(true)\n(11) endOrExpr(false)\n(12) endAllNodeStep()\n(13) startAndExpr()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n");

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test164");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.endEqualityExpr(10);
    var0.startTextNodeStep((-1));
    var0.endPathExpr();
    var0.endUnionExpr(true);
    var0.startPredicate();
    var0.endAbsoluteLocationPath();
    var0.number(10);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test165");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startXPath();
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.startRelationalExpr();
    var0.startTextNodeStep(1);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test166");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.startOrExpr();

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test167");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test168");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.number(10.0d);
    var0.startPredicate();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endFunction();

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test169");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endEqualityExpr((-1));
    var15.endTextNodeStep();
    var15.endAdditiveExpr(1);
    var15.endOrExpr(false);
    var15.literal("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var15.startFilterExpr();
    var15.endXPath();
    boolean var28 = var0.equals((java.lang.Object)var15);
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startFunction(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(4) endPathExpr()\n(5) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: :com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endFunction()\n(7) endEqualityExpr(1)\n(8) endFunction()\n(9) startTextNodeStep(1)\n(10) endRelativeLocationPath()\n(11) endUnionExpr(false)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test170");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startAllNodeStep(1);
    var0.startAllNodeStep(1);
    var0.startAllNodeStep(1);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n");

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test171");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "^"+ "'", var9.equals("^"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test172");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.endAdditiveExpr((-1));
    var0.endAllNodeStep();
    var0.startTextNodeStep(1);
    var0.startEqualityExpr();
    var0.endPathExpr();

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test173");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startEqualityExpr();
    var1.startUnaryExpr();
    var1.startCommentNodeStep(1);
    var1.endMultiplicativeExpr(100);
    var1.startAbsoluteLocationPath();
    var1.startAndExpr();
    var1.startRelationalExpr();
    var1.endPathExpr();
    var1.endUnionExpr(false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test174");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    var0.endUnionExpr(false);
    var0.number(0.0d);
    var0.startAdditiveExpr();
    var0.startOrExpr();

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test175");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endEqualityExpr((-1));
    var0.startRelationalExpr();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(-1)\n(6) startRelationalExpr()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(-1)\n(6) startRelationalExpr()\n"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test176");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startUnionExpr();
    var0.endPredicate();
    var0.endUnionExpr(false);
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endUnaryExpr(10);
    var14.number(1);
    var14.startAllNodeStep((-1));
    var14.startAllNodeStep(0);
    var14.endNameStep();
    var14.startAllNodeStep((-1));
    var14.endAdditiveExpr((-1));
    var14.endRelativeLocationPath();
    var14.endNameStep();
    var14.endAllNodeStep();
    boolean var32 = var0.equals((java.lang.Object)var14);
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test177");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.endUnionExpr(false);
    var0.endRelationalExpr(100);
    var0.endEqualityExpr(10);
    var0.endAbsoluteLocationPath();
    var0.number((-1.0d));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test178");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n", (-1), "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var8 = var7.getPositionMarker();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    java.lang.String var10 = var7.getPositionMarker();
    java.lang.String var11 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var17 = var16.getPosition();
    java.lang.String var18 = var16.getXPath();
    var7.addSuppressed((java.lang.Throwable)var16);
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: -1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n");
    org.saxpath.XPathSyntaxException var25 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var26 = var25.toString();
    java.lang.String var27 = var25.getMultilineMessage();
    int var28 = var25.getPosition();
    java.lang.String var29 = var25.getPositionMarker();
    org.saxpath.XPathSyntaxException var33 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var34 = var33.getPositionMarker();
    java.lang.String var35 = var33.toString();
    org.saxpath.SAXPathException var36 = new org.saxpath.SAXPathException((java.lang.Throwable)var33);
    java.lang.String var37 = var33.getMultilineMessage();
    java.lang.String var38 = var33.getMultilineMessage();
    java.lang.String var39 = var33.toString();
    java.lang.String var40 = var33.getPositionMarker();
    java.lang.String var41 = var33.getPositionMarker();
    org.saxpath.XPathSyntaxException var45 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var46 = var45.getXPath();
    java.lang.String var47 = var45.getPositionMarker();
    int var48 = var45.getPosition();
    java.lang.Throwable[] var49 = var45.getSuppressed();
    int var50 = var45.getPosition();
    var33.addSuppressed((java.lang.Throwable)var45);
    java.lang.String var52 = var33.toString();
    var25.addSuppressed((java.lang.Throwable)var33);
    var21.addSuppressed((java.lang.Throwable)var25);
    var16.addSuppressed((java.lang.Throwable)var21);
    org.saxpath.SAXPathException var56 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "^"+ "'", var29.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + " ^"+ "'", var34.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var35.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var37.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var38.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var39.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + " ^"+ "'", var40.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + " ^"+ "'", var41.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + " ^"+ "'", var47.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var52.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test179");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.startCommentNodeStep(1);
    var0.endNameStep();
    var0.endFilterExpr();

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test180");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test181");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.endEqualityExpr(10);
    var0.startTextNodeStep((-1));
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startFunction(\":(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\")\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test182");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep((-1));
    var0.startUnionExpr();
    var0.startTextNodeStep((-1));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test183");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);
    var0.startAndExpr();
    var0.number(0);
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test184");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endMultiplicativeExpr(1);
    var0.startXPath();
    var0.startUnionExpr();
    var0.endEqualityExpr(0);
    var0.endFilterExpr();
    var0.startFilterExpr();

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test185");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.endRelationalExpr(10);
    var0.endPathExpr();
    var0.endRelationalExpr((-1));
    var0.endMultiplicativeExpr((-1));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test186");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.endAllNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endProcessingInstructionNodeStep()\n(6) startEqualityExpr()\n(7) startXPath()\n(8) endCommentNodeStep()\n(9) endXPath()\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test187");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endOrExpr(false);
    var0.number(10.0d);
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startRelationalExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test188");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    var10.number(1);
    var10.startEqualityExpr();
    var10.endFilterExpr();
    var10.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test189");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.endNameStep();
    var0.endNameStep();
    var0.startAndExpr();
    var0.startPredicate();

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test190");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startRelationalExpr();
    var0.endMultiplicativeExpr(100);
    var0.endMultiplicativeExpr(100);
    var0.endAbsoluteLocationPath();
    java.lang.String var19 = var0.toString();
    var0.endTextNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startRelationalExpr()\n(7) endMultiplicativeExpr(100)\n(8) endMultiplicativeExpr(100)\n(9) endAbsoluteLocationPath()\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startRelationalExpr()\n(7) endMultiplicativeExpr(100)\n(8) endMultiplicativeExpr(100)\n(9) endAbsoluteLocationPath()\n"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test191");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.startNameStep((-1), "hi!", "hi!");
    var14.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var14);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    org.saxpath.conformance.ConformanceXPathHandler var23 = new org.saxpath.conformance.ConformanceXPathHandler();
    var23.startAbsoluteLocationPath();
    var23.endPathExpr();
    var23.startUnionExpr();
    var23.endRelationalExpr(10);
    var23.endPathExpr();
    var23.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var23);
    org.saxpath.helpers.DefaultXPathHandler var32 = new org.saxpath.helpers.DefaultXPathHandler();
    var32.number(10.0d);
    var32.endRelativeLocationPath();
    var32.startRelativeLocationPath();
    var32.endFilterExpr();
    var32.endAdditiveExpr(100);
    var32.startAbsoluteLocationPath();
    var32.endEqualityExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    var32.startPredicate();
    var32.startRelationalExpr();
    var32.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test192");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startAllNodeStep(100);
    var0.endPathExpr();
    var0.endNameStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.endFunction();
    var19.startUnaryExpr();
    var19.endRelationalExpr(0);
    var19.endUnionExpr(true);
    var19.endRelativeLocationPath();
    var19.startRelationalExpr();
    var19.startAndExpr();
    var19.startCommentNodeStep(100);
    boolean var31 = var0.equals((java.lang.Object)100);
    var0.endProcessingInstructionNodeStep();
    var0.startAdditiveExpr();
    var0.startAdditiveExpr();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test193");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startPredicate();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n");
    var0.endUnionExpr(true);
    var0.startMultiplicativeExpr();
    var0.startPathExpr();
    var0.startPredicate();

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test194");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.startUnaryExpr();
    var0.startPathExpr();
    var0.endEqualityExpr((-1));
    var0.endNameStep();

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test195");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.startEqualityExpr();
    var0.endTextNodeStep();
    var0.endAndExpr(false);
    var0.startAllNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endEqualityExpr((-1));
    var0.startTextNodeStep(0);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test196");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startUnionExpr();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endAndExpr(true);
    boolean var14 = var9.equals((java.lang.Object)'a');
    var9.startPathExpr();
    var9.startMultiplicativeExpr();
    var9.endAllNodeStep();
    var9.startAbsoluteLocationPath();
    var9.endNameStep();
    var9.startAdditiveExpr();
    var9.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n", "org.saxpath.SAXPathParseException: ");
    var9.endRelativeLocationPath();
    boolean var26 = var0.equals((java.lang.Object)var9);
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test197");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startEqualityExpr();
    var1.startUnaryExpr();
    var1.startUnionExpr();
    var1.endOrExpr(true);
    var1.endEqualityExpr((-1));
    var1.startAndExpr();
    var1.startOrExpr();
    var1.endTextNodeStep();

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test198");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.endOrExpr(false);
    var0.number(10);
    var0.endPathExpr();
    var0.endEqualityExpr(10);
    var0.endRelationalExpr(1);
    var0.startAndExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) startTextNodeStep(100)\n", "(0) endAllNodeStep()\n(1) endAbsoluteLocationPath()\n(2) startXPath()\n(3) endFilterExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(5) endAllNodeStep()\n(6) endUnionExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test199");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startTextNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.endAndExpr(false);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();
    var0.startXPath();
    var0.endPathExpr();
    var0.endAndExpr(false);
    var0.endFunction();

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test200");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test201");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.endNameStep();
    var0.endRelativeLocationPath();
    var0.startTextNodeStep((-1));
    var0.endPathExpr();

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test202");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.variableReference("org.saxpath.SAXPathParseException: ", "org.saxpath.SAXPathException:  ^");
    var0.endEqualityExpr(100);
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endTextNodeStep();
    var15.endAdditiveExpr(1);
    java.lang.String var20 = var15.toString();
    boolean var21 = var0.equals((java.lang.Object)var15);
    var15.endNameStep();
    var15.endNameStep();
    var15.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n\n^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test204");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.XPathHandler var13 = var0.getXPathHandler();
    org.saxpath.XPathHandler var14 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endAndExpr(true);
    boolean var20 = var15.equals((java.lang.Object)'a');
    java.lang.String var21 = var15.toString();
    var15.startXPath();
    var15.startXPath();
    var15.endAllNodeStep();
    var15.endFilterExpr();
    var15.endEqualityExpr(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var15);
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endUnaryExpr(10);
    var29.startMultiplicativeExpr();
    var29.startEqualityExpr();
    var29.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var29.endEqualityExpr(10);
    var29.endMultiplicativeExpr((-1));
    var29.endMultiplicativeExpr((-1));
    var29.endRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    org.saxpath.conformance.ConformanceXPathHandler var46 = new org.saxpath.conformance.ConformanceXPathHandler();
    var46.startAbsoluteLocationPath();
    var46.endEqualityExpr((-1));
    var46.endTextNodeStep();
    var46.endAdditiveExpr(1);
    var46.startAndExpr();
    var46.startMultiplicativeExpr();
    var46.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) endNameStep()\n");
    org.saxpath.helpers.DefaultXPathHandler var59 = new org.saxpath.helpers.DefaultXPathHandler();
    var59.number(10.0d);
    var59.endPathExpr();
    var59.endUnionExpr(false);
    var59.startPathExpr();
    var59.startOrExpr();
    var59.startMultiplicativeExpr();
    var59.endAndExpr(true);
    var59.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n", " ^");
    var59.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var59.startUnaryExpr();
    var59.endFilterExpr();
    var59.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endPredicate()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var59);
    var59.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) endOrExpr(true)\n(8) startAbsoluteLocationPath()\n");
    var59.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test205");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test206");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, " ^");
    int var4 = var3.getPosition();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var9 = var8.getMultilineMessage();
    int var10 = var8.getPosition();
    org.saxpath.SAXPathParseException var12 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var14 = var8.getXPath();
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var16 = var8.toString();
    int var17 = var8.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\n ^\n ^"+ "'", var9.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var16.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test207");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var0.parse("org.saxpath.SAXPathException:  ^");
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endTextNodeStep();
    var16.endAdditiveExpr(1);
    java.lang.String var21 = var16.toString();
    var16.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var23 = new org.saxpath.helpers.DefaultXPathHandler();
    var23.number(10.0d);
    var23.endRelativeLocationPath();
    var23.startRelativeLocationPath();
    var23.endFilterExpr();
    var23.endAdditiveExpr(100);
    boolean var31 = var16.equals((java.lang.Object)var23);
    var23.startXPath();
    var23.number(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var23);
    org.saxpath.XPathHandler var36 = var0.getXPathHandler();
    org.saxpath.XPathHandler var37 = var0.getXPathHandler();
    org.saxpath.XPathHandler var38 = var0.getXPathHandler();
    org.saxpath.XPathHandler var39 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var40 = new org.saxpath.conformance.ConformanceXPathHandler();
    var40.startAbsoluteLocationPath();
    var40.endEqualityExpr((-1));
    var40.endTextNodeStep();
    var40.endCommentNodeStep();
    var40.endRelativeLocationPath();
    boolean var48 = var40.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var40.endMultiplicativeExpr((-1));
    var40.endNameStep();
    var40.endCommentNodeStep();
    var40.endAndExpr(false);
    var40.endRelativeLocationPath();
    var40.startTextNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var40);
    var40.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test208");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.startFilterExpr();

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test209");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.startAdditiveExpr();
    var0.startMultiplicativeExpr();
    var0.endRelativeLocationPath();
    var0.startEqualityExpr();
    java.lang.String var11 = var0.toString();
    org.saxpath.helpers.DefaultXPathHandler var12 = new org.saxpath.helpers.DefaultXPathHandler();
    var12.number(10.0d);
    var12.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var12.startAdditiveExpr();
    var12.endXPath();
    var12.endRelativeLocationPath();
    var12.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var12.endCommentNodeStep();
    var12.startRelativeLocationPath();
    var12.startUnaryExpr();
    boolean var27 = var0.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) startAdditiveExpr()\n(7) startMultiplicativeExpr()\n(8) endRelativeLocationPath()\n(9) startEqualityExpr()\n"+ "'", var11.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) startAdditiveExpr()\n(7) startMultiplicativeExpr()\n(8) endRelativeLocationPath()\n(9) startEqualityExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test210");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endAndExpr(true);
    var9.startUnionExpr();
    boolean var14 = var0.equals((java.lang.Object)var9);
    var9.endAdditiveExpr(0);
    var9.startRelativeLocationPath();
    var9.number(1.0d);
    java.lang.String var20 = var9.toString();
    var9.endAndExpr(false);
    var9.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test211");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endFilterExpr()\n(7) startAdditiveExpr()\n(8) endNameStep()\n");

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test212");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.startRelationalExpr();
    var0.endFunction();
    var0.endAbsoluteLocationPath();
    var0.number(100);
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startAndExpr();

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test213");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.number((-1.0d));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test214");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", (-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    var3.addSuppressed((java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test215");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startTextNodeStep(100);
    var0.startUnionExpr();
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(10);
    java.lang.String var19 = var0.toString();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endUnionExpr(true)\n(6) endAbsoluteLocationPath()\n(7) number(-1)\n(8) endAdditiveExpr(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startTextNodeStep(100)\n(6) startUnionExpr()\n(7) startFilterExpr()\n(8) endMultiplicativeExpr(10)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startTextNodeStep(100)\n(6) startUnionExpr()\n(7) startFilterExpr()\n(8) endMultiplicativeExpr(10)\n"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test216");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.startOrExpr();
    var0.endAllNodeStep();
    var0.startTextNodeStep((-1));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test217");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endRelationalExpr(1);
    var0.endTextNodeStep();
    var0.startRelativeLocationPath();
    var0.endPredicate();
    var0.startPathExpr();
    var0.number((-1.0d));
    var0.endEqualityExpr(0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test218");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startNameStep(0, "child", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.number((-1));
    var0.endAbsoluteLocationPath();

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test219");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.endAndExpr(true);
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.endRelationalExpr((-1));
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.number(100);
    var0.endAndExpr(false);
    var0.number(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test220");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(10);
    var0.endAndExpr(true);
    var0.endNameStep();

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test221");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endFunction();
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.endAllNodeStep();
    var11.endAllNodeStep();
    java.lang.String var14 = var11.toString();
    boolean var15 = var0.equals((java.lang.Object)var11);
    var11.startRelationalExpr();
    var11.endAndExpr(false);
    var11.endXPath();
    var11.startUnionExpr();
    var11.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test222");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var0.startAllNodeStep(10);
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startFilterExpr();
    var0.startPathExpr();

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test223");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    java.lang.String var7 = var0.toString();
    var0.startPredicate();
    var0.startPredicate();
    var0.startRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n");
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test224");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endOrExpr(false);
    var1.startAllNodeStep(0);
    var1.startEqualityExpr();
    var1.endAndExpr(false);
    var1.endEqualityExpr((-1));
    var1.endTextNodeStep();

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test225");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.endAndExpr(true);
    java.lang.String var16 = var0.toString();
    var0.endFunction();
    var0.startEqualityExpr();
    var0.endFilterExpr();
    var0.endFunction();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test226");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test227");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.endAndExpr(true);
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.variableReference("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n");
    var0.number(0.0d);
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test228");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.endUnionExpr(true);
    var0.startOrExpr();
    var0.endAdditiveExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test229");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.XPathHandler var8 = var0.getXPathHandler();
    org.saxpath.XPathHandler var9 = var0.getXPathHandler();
    org.saxpath.XPathHandler var10 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test230");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAllNodeStep(10);
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.endCommentNodeStep();
    org.saxpath.helpers.DefaultXPathHandler var16 = new org.saxpath.helpers.DefaultXPathHandler();
    var16.number(10.0d);
    var16.endNameStep();
    var16.startAndExpr();
    var16.endRelativeLocationPath();
    var16.startFilterExpr();
    boolean var23 = var0.equals((java.lang.Object)var16);
    var0.endOrExpr(false);
    var0.endUnaryExpr(1);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test231");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endEqualityExpr((-1));
    var10.endTextNodeStep();
    var10.endCommentNodeStep();
    var10.variableReference("org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var10.startAllNodeStep(100);
    var10.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.helpers.DefaultXPathHandler var24 = new org.saxpath.helpers.DefaultXPathHandler();
    var24.number(10.0d);
    var24.endRelativeLocationPath();
    var24.startRelativeLocationPath();
    var24.endFilterExpr();
    var24.endXPath();
    var24.startUnionExpr();
    var24.startTextNodeStep(10);
    var24.endOrExpr(false);
    var24.startAndExpr();
    var24.endEqualityExpr(0);
    var24.endFilterExpr();
    var24.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var24);
    var24.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test232");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.endTextNodeStep();
    var0.startEqualityExpr();
    var0.endRelationalExpr(0);
    var0.endProcessingInstructionNodeStep();

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test233");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.number((-1));
    var0.startFilterExpr();

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test234");


    int var1 = org.saxpath.Axis.lookup("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) endMultiplicativeExpr(100)\n(9) endProcessingInstructionNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test235");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.endRelationalExpr((-1));
    var0.endXPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.endEqualityExpr(0);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test236");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var0.endXPath();
    var0.startUnaryExpr();
    var0.startXPath();
    var0.startAllNodeStep(10);
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test237");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep((-1));
    var0.endPathExpr();
    var0.endPredicate();
    var0.startPathExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test238");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.parse("child\norg.saxpath.SAXPathException:  ^\n^");
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endAndExpr(true);
    boolean var17 = var12.equals((java.lang.Object)'a');
    java.lang.String var18 = var12.toString();
    var12.startXPath();
    var12.startPathExpr();
    var12.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var12.startTextNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var12);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startOrExpr()\n(7) startPathExpr()\n(8) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathParseException: \")\n(9) startRelationalExpr()\n(10) startRelativeLocationPath()\n(11) startOrExpr()\n");
    org.saxpath.conformance.ConformanceXPathHandler var30 = new org.saxpath.conformance.ConformanceXPathHandler();
    var30.startAbsoluteLocationPath();
    var30.endUnaryExpr(10);
    var30.endFunction();
    var30.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var30);
    org.saxpath.conformance.ConformanceXPathHandler var38 = new org.saxpath.conformance.ConformanceXPathHandler();
    var38.startAbsoluteLocationPath();
    var38.endTextNodeStep();
    var38.endAdditiveExpr(1);
    var38.startCommentNodeStep((-1));
    var38.startCommentNodeStep(100);
    var38.endAndExpr(true);
    var38.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test239");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startFilterExpr();
    var0.startPredicate();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.endUnionExpr(true);
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.endUnionExpr(true);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test240");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startAdditiveExpr();
    var0.endOrExpr(true);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test241");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(1, " ^");
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(0);
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr(0);
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.startCommentNodeStep(100);
    var0.startRelativeLocationPath();
    var0.literal("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test242");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startRelativeLocationPath();
    var7.endProcessingInstructionNodeStep();
    var7.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var7.startMultiplicativeExpr();
    var7.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test243");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endNameStep();
    var0.endFunction();
    var0.endUnaryExpr(1);
    var0.endPathExpr();
    var0.endRelationalExpr(100);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test244");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.startXPath();
    var0.endAndExpr(true);
    var0.startEqualityExpr();
    var0.startAllNodeStep((-1));
    var0.startTextNodeStep(1);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test245");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startAdditiveExpr();
    var7.endAbsoluteLocationPath();
    var7.endAndExpr(false);
    var7.startRelativeLocationPath();
    var7.startMultiplicativeExpr();
    var7.endProcessingInstructionNodeStep();
    var7.startAndExpr();
    var7.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test246");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var8 = new org.saxpath.helpers.DefaultXPathHandler();
    var8.number(10.0d);
    var8.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.startUnionExpr();
    var8.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var8.startAllNodeStep(1);
    var8.startXPath();
    var8.startFilterExpr();
    var8.startUnaryExpr();
    var8.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test247");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(true);
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(false);
    var0.startRelativeLocationPath();
    var0.endPredicate();

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test248");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "com.werken.saxpath.XPathSyntaxException: 10: ^");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n(8) startPredicate()\n");
    var0.endAdditiveExpr(0);
    var0.startUnaryExpr();

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test249");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.endUnionExpr(false);
    var0.startNameStep((-1), "                                                                                                    ^", "\n ^\n ^");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.endRelationalExpr(0);
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.startFilterExpr();

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test250");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endAndExpr(false);
    var0.endFunction();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test251");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathException:  ^");
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endAllNodeStep();

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test252");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    java.lang.Throwable[] var11 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var17 = var3.toString();
    org.saxpath.XPathSyntaxException var21 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n", 100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    java.lang.String var22 = var21.toString();
    org.saxpath.XPathSyntaxException var26 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n");
    java.lang.String var27 = var26.getXPath();
    var21.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var29 = var26.toString();
    var3.addSuppressed((java.lang.Throwable)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"+ "'", var22.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var27.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n"+ "'", var29.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test253");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", 10, "com.werken.saxpath.XPathSyntaxException: 1: ");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var9 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var10 = var9.getXPath();
    java.lang.String var11 = var9.getPositionMarker();
    int var12 = var9.getPosition();
    java.lang.Throwable[] var13 = var9.getSuppressed();
    int var14 = var9.getPosition();
    java.lang.String var15 = var9.getXPath();
    java.lang.String var16 = var9.getPositionMarker();
    java.lang.String var17 = var9.getXPath();
    java.lang.String var18 = var9.toString();
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var20 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          ^"+ "'", var5.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test254");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startAllNodeStep(0);
    var0.endXPath();
    java.lang.String var13 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.startAbsoluteLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endTextNodeStep();
    var16.endAdditiveExpr(1);
    java.lang.String var21 = var16.toString();
    var16.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var23 = new org.saxpath.helpers.DefaultXPathHandler();
    var23.number(10.0d);
    var23.endRelativeLocationPath();
    var23.startRelativeLocationPath();
    var23.endFilterExpr();
    var23.endAdditiveExpr(100);
    boolean var31 = var16.equals((java.lang.Object)var23);
    var23.startAdditiveExpr();
    boolean var33 = var0.equals((java.lang.Object)var23);
    var0.endAllNodeStep();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startFilterExpr()\n(6) startAllNodeStep(0)\n(7) endXPath()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startFilterExpr()\n(6) startAllNodeStep(0)\n(7) endXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test255");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startProcessingInstructionNodeStep(100, "hi!");
    var0.endNameStep();

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test256");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.endFilterExpr();

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test257");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.endAllNodeStep();
    var11.endAllNodeStep();
    var11.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    boolean var21 = var16.equals((java.lang.Object)'a');
    java.lang.String var22 = var16.toString();
    var16.startXPath();
    var16.startPathExpr();
    var16.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var16.startXPath();
    var16.endAndExpr(true);
    var16.endFilterExpr();
    var16.endCommentNodeStep();
    var16.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathParseException: ");
    var16.startAllNodeStep(10);
    var16.endUnaryExpr((-1));
    var16.endMultiplicativeExpr((-1));
    var16.startAllNodeStep(10);
    var16.startAllNodeStep(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test258");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.startAllNodeStep(100);
    var0.startUnaryExpr();
    var0.startUnaryExpr();
    var0.endPathExpr();

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test259");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep((-1));
    var0.endEqualityExpr(100);
    var0.endNameStep();
    var0.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test260");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endUnaryExpr(10);
    var0.startRelationalExpr();
    java.lang.String var16 = var0.toString();
    var0.startPredicate();
    var0.number(0.0d);
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test261");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startXPath();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test262");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.endUnaryExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.number((-1));
    var0.endCommentNodeStep();
    var0.startXPath();
    var0.endPathExpr();

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test263");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr(100);
    var0.number(0.0d);
    var0.startEqualityExpr();
    var0.startPredicate();

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test264");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endAdditiveExpr(100);
    var0.startPredicate();
    var0.startOrExpr();
    var0.endOrExpr(false);
    var0.startPredicate();

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test265");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("\n ^\n ^", "org.saxpath.SAXPathException:  ^");
    var0.endPathExpr();
    var0.startRelationalExpr();
    var0.startOrExpr();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.startEqualityExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) endOrExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startRelativeLocationPath()\n(6) startEqualityExpr()\n(7) startEqualityExpr()\n(8) startAbsoluteLocationPath()\n(9) number(-1)\n");

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test266");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startUnionExpr();
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.endFunction();
    var15.startUnaryExpr();
    var15.endRelationalExpr(0);
    var15.endUnionExpr(true);
    var15.endRelativeLocationPath();
    var15.startRelationalExpr();
    var15.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var15.endXPath();
    boolean var29 = var0.equals((java.lang.Object)var15);
    var15.endPredicate();
    var15.variableReference("org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: \nhi!\n^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test267");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    org.saxpath.XPathHandler var10 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n");
    org.saxpath.XPathHandler var13 = var0.getXPathHandler();
    org.saxpath.XPathHandler var14 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test268");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.startUnionExpr();
    var0.endUnaryExpr(0);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");
    var0.startUnionExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endFunction()\n(8) startEqualityExpr()\n(9) startTextNodeStep(100)\n(10) number(10.0)\n(11) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) startEqualityExpr()\n(6) startAdditiveExpr()\n(7) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: :(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n\")\n");

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test269");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var0.endProcessingInstructionNodeStep();

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test270");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.endXPath();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.startAndExpr();
    var0.number((-1));
    var0.startRelationalExpr();
    var0.endEqualityExpr((-1));
    var0.endNameStep();

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test271");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.endRelationalExpr((-1));
    var0.endXPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test272");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: ^", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var5 = var3.getXPath();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 10: ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test273");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(1, " ^");
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(0);
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr(0);
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.startCommentNodeStep(100);
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test274");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startXPath();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startOrExpr();
    var0.endAdditiveExpr(0);
    var0.number(10);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test275");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.endFunction();
    var0.endCommentNodeStep();
    var0.endAdditiveExpr(0);
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep(100);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test276");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endUnaryExpr(10);
    var0.startRelationalExpr();
    java.lang.String var16 = var0.toString();
    var0.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n");
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.endRelationalExpr((-1));
    var0.endAdditiveExpr(100);
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test277");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.endAndExpr(true);
    var0.endEqualityExpr(100);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startXPath();
    var0.startMultiplicativeExpr();
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test278");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var0.parse("org.saxpath.SAXPathException:  ^");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    org.saxpath.helpers.DefaultXPathHandler var22 = new org.saxpath.helpers.DefaultXPathHandler();
    var22.number(10.0d);
    var22.endNameStep();
    var22.number(0);
    var22.startAllNodeStep(0);
    var22.startPathExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test279");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.endUnaryExpr(10);
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startTextNodeStep((-1));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test280");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endUnaryExpr(100);
    var0.endOrExpr(true);
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startRelationalExpr();
    var0.startOrExpr();

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test281");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.endUnaryExpr(0);
    var0.endXPath();

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test282");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.endUnionExpr(true);
    var0.startFilterExpr();
    var0.endAndExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endUnionExpr(false);
    var0.endAdditiveExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test283");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endRelativeLocationPath();
    var0.startRelationalExpr();
    var0.endOrExpr(false);
    var0.startFilterExpr();
    var0.endCommentNodeStep();

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test284");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.startUnionExpr();
    var0.endXPath();
    var0.endFunction();
    var0.endMultiplicativeExpr(100);
    var0.startOrExpr();
    var0.startRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var19 = new org.saxpath.conformance.ConformanceXPathHandler();
    var19.startAbsoluteLocationPath();
    var19.endEqualityExpr((-1));
    var19.endTextNodeStep();
    var19.endAdditiveExpr(1);
    var19.endAndExpr(true);
    var19.endNameStep();
    var19.endPathExpr();
    boolean var30 = var0.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test285");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(0);
    var0.startPathExpr();
    var0.startTextNodeStep(10);
    var0.startTextNodeStep(1);
    var0.endPredicate();
    var0.startAndExpr();

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test286");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.XPathHandler var13 = var0.getXPathHandler();
    org.saxpath.XPathHandler var14 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endAndExpr(true);
    boolean var20 = var15.equals((java.lang.Object)'a');
    java.lang.String var21 = var15.toString();
    var15.startXPath();
    var15.startXPath();
    var15.endAllNodeStep();
    var15.endFilterExpr();
    var15.endEqualityExpr(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var15);
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endUnaryExpr(10);
    var29.startMultiplicativeExpr();
    var29.startEqualityExpr();
    var29.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var29.endEqualityExpr(10);
    var29.endMultiplicativeExpr((-1));
    var29.endMultiplicativeExpr((-1));
    var29.endRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    org.saxpath.conformance.ConformanceXPathHandler var46 = new org.saxpath.conformance.ConformanceXPathHandler();
    var46.startAbsoluteLocationPath();
    var46.endEqualityExpr((-1));
    var46.endTextNodeStep();
    var46.endAdditiveExpr(1);
    var46.startAndExpr();
    var46.startMultiplicativeExpr();
    var46.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var46.startXPath();
    var46.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) startAllNodeStep(1)\n(10) endProcessingInstructionNodeStep()\n(11) startOrExpr()\n(12) startAllNodeStep(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n          ^");
    var46.startAllNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test287");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var20.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    var20.startPredicate();
    var20.endAbsoluteLocationPath();
    var20.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test288");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n(4) endPathExpr()\n", 1, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    java.lang.String var4 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test289");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(100);
    var0.startAllNodeStep((-1));
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^");
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test290");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.startNameStep((-1), "hi!", "hi!");
    var14.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var14);
    org.saxpath.XPathHandler var21 = var0.getXPathHandler();
    org.saxpath.XPathHandler var22 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var23 = new org.saxpath.conformance.ConformanceXPathHandler();
    var23.startAbsoluteLocationPath();
    var23.endAndExpr(true);
    var23.endPathExpr();
    var23.endTextNodeStep();
    var23.startUnaryExpr();
    var23.endUnionExpr(true);
    var23.startRelationalExpr();
    var23.variableReference("org.saxpath.SAXPathParseException: ", "org.saxpath.SAXPathException:  ^");
    var23.endEqualityExpr(100);
    var23.endUnaryExpr(0);
    java.lang.String var40 = var23.toString();
    var0.setXPathHandler((org.saxpath.XPathHandler)var23);
    org.saxpath.conformance.ConformanceXPathHandler var42 = new org.saxpath.conformance.ConformanceXPathHandler();
    var42.startAbsoluteLocationPath();
    var42.endEqualityExpr((-1));
    var42.endTextNodeStep();
    var42.endAdditiveExpr(1);
    var42.endOrExpr(false);
    var42.number(10.0d);
    var42.startEqualityExpr();
    var42.startFilterExpr();
    var42.startRelationalExpr();
    var42.startRelativeLocationPath();
    var42.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n"+ "'", var40.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test291");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 10: ^\ncom.werken.saxpath.XPathSyntaxException: 1: \n ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getPositionMarker();
    int var7 = var5.getPosition();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    int var12 = var11.getPosition();
    java.lang.String var13 = var11.getPositionMarker();
    java.lang.String var14 = var11.getXPath();
    java.lang.String var15 = var11.toString();
    var5.addSuppressed((java.lang.Throwable)var11);
    org.saxpath.XPathSyntaxException var20 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var21 = var20.getPositionMarker();
    org.saxpath.SAXPathException var22 = new org.saxpath.SAXPathException((java.lang.Throwable)var20);
    java.lang.String var23 = var20.toString();
    java.lang.Throwable[] var24 = var20.getSuppressed();
    java.lang.String var25 = var20.toString();
    java.lang.String var26 = var20.toString();
    var11.addSuppressed((java.lang.Throwable)var20);
    var1.addSuppressed((java.lang.Throwable)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "^"+ "'", var13.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + " ^"+ "'", var21.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test292");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.endAndExpr(true);
    var9.startUnionExpr();
    boolean var14 = var0.equals((java.lang.Object)var9);
    var0.endUnaryExpr(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endFilterExpr()\n(3) endEqualityExpr(10)\n(4) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n");
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test293");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n");
    var0.endPathExpr();
    var0.endFunction();

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test294");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.getMultilineMessage();
    org.saxpath.SAXPathParseException var11 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var3.toString();
    org.saxpath.XPathSyntaxException var17 = new org.saxpath.XPathSyntaxException("(0) startXPath()\n", 100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var3.addSuppressed((java.lang.Throwable)var17);
    java.lang.String var19 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test295");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.endAbsoluteLocationPath();

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test296");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startPredicate();

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test297");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var0.startUnionExpr();
    var0.startCommentNodeStep(1);
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test298");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.endAllNodeStep();
    var10.endAllNodeStep();
    var10.startFilterExpr();
    var10.endPathExpr();
    var10.startAdditiveExpr();
    var10.number(10.0d);
    var10.endRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    var10.startPathExpr();
    var10.number((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test299");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.endAllNodeStep();

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test300");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.XPathHandler var13 = var0.getXPathHandler();
    org.saxpath.XPathHandler var14 = var0.getXPathHandler();
    var0.parse("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var17 = new org.saxpath.helpers.DefaultXPathHandler();
    var17.number(10.0d);
    var17.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var17.endPredicate();
    var17.startAbsoluteLocationPath();
    var17.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var17);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.helpers.DefaultXPathHandler var29 = new org.saxpath.helpers.DefaultXPathHandler();
    var29.number(10.0d);
    var29.endRelativeLocationPath();
    var29.startRelativeLocationPath();
    var29.endAllNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    var29.startFilterExpr();
    var29.literal("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) endMultiplicativeExpr(100)\n(9) endNameStep()\n(10) startEqualityExpr()\n(11) endUnaryExpr(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test301");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getPositionMarker();
    int var10 = var3.getPosition();
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test302");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    var0.endOrExpr(false);
    var0.startPredicate();
    var0.startOrExpr();

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test303");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(1);
    var0.endMultiplicativeExpr(100);
    var0.startPathExpr();
    var0.endRelationalExpr((-1));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test304");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var20.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.conformance.ConformanceXPathHandler var34 = new org.saxpath.conformance.ConformanceXPathHandler();
    var34.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var34.endEqualityExpr(1);
    org.saxpath.conformance.ConformanceXPathHandler var40 = new org.saxpath.conformance.ConformanceXPathHandler();
    var40.startAbsoluteLocationPath();
    var40.endUnaryExpr(10);
    var40.number(1);
    var40.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var40.startMultiplicativeExpr();
    var40.startFilterExpr();
    boolean var51 = var34.equals((java.lang.Object)var40);
    var40.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var40);
    org.saxpath.conformance.ConformanceXPathHandler var54 = new org.saxpath.conformance.ConformanceXPathHandler();
    var54.startAbsoluteLocationPath();
    var54.endUnaryExpr(10);
    var54.number(1);
    var54.startAllNodeStep((-1));
    var54.startAllNodeStep(0);
    var54.endNameStep();
    var54.startAllNodeStep((-1));
    var54.endAdditiveExpr((-1));
    var54.startMultiplicativeExpr();
    var54.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var54);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endFunction()\n(8) endAndExpr(true)\n(9) endXPath()\n(10) endPredicate()\n(11) endEqualityExpr(10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test305");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startUnionExpr();
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.endFunction();
    var15.startUnaryExpr();
    var15.endRelationalExpr(0);
    var15.endUnionExpr(true);
    var15.endRelativeLocationPath();
    var15.startRelationalExpr();
    var15.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var15.endXPath();
    boolean var29 = var0.equals((java.lang.Object)var15);
    var15.startEqualityExpr();
    var15.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test306");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n", 10, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "          ^"+ "'", var6.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "          ^"+ "'", var7.equals("          ^"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test307");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.endPathExpr();
    var0.startAndExpr();
    var0.number(0);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test308");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startPathExpr();
    var0.endAdditiveExpr(10);
    var0.endProcessingInstructionNodeStep();
    var0.number(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test309");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var0.startRelationalExpr();
    var0.startAndExpr();

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test310");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
    var3.addSuppressed((java.lang.Throwable)var10);
    org.saxpath.SAXPathException var12 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.getXPath();
    int var18 = var16.getPosition();
    java.lang.String var19 = var16.getXPath();
    java.lang.String var20 = var16.getPositionMarker();
    var12.addSuppressed((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + " ^"+ "'", var20.equals(" ^"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test311");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var0.startUnionExpr();
    var0.startCommentNodeStep(1);
    var0.endCommentNodeStep();
    var0.startTextNodeStep(0);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.startOrExpr();
    var0.number((-1.0d));
    var0.startFilterExpr();
    var0.startAdditiveExpr();

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test312");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.endMultiplicativeExpr(10);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test313");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.startRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endAndExpr(false);
    var0.startXPath();
    var0.endAndExpr(true);
    var0.startNameStep((-1), "org.saxpath.SAXPathParseException: (0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endUnionExpr(true)\n(7) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n:child\")\n");

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test314");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\n          ^");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test315");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var5 = new org.saxpath.conformance.ConformanceXPathHandler();
    var5.startAbsoluteLocationPath();
    var5.endUnaryExpr(10);
    var5.number(1);
    var5.startAllNodeStep((-1));
    var5.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endAndExpr(true);
    var14.startUnionExpr();
    boolean var19 = var5.equals((java.lang.Object)var14);
    var14.endAdditiveExpr(0);
    var14.startRelativeLocationPath();
    var14.endXPath();
    var14.startCommentNodeStep((-1));
    var14.endTextNodeStep();
    boolean var27 = var0.equals((java.lang.Object)var14);
    var14.startFilterExpr();
    var14.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var14.endAndExpr(true);
    var14.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var14.endRelativeLocationPath();
    var14.startTextNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test316");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.startXPath();
    var0.startPathExpr();
    var0.startEqualityExpr();
    var0.endXPath();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test317");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.startOrExpr();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test318");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.number(10.0d);
    var0.number(100.0d);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test319");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endAndExpr(true);
    boolean var18 = var13.equals((java.lang.Object)'a');
    java.lang.String var19 = var13.toString();
    var13.startXPath();
    var13.startPathExpr();
    var13.endAbsoluteLocationPath();
    var13.endAdditiveExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var13);
    var13.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.startAbsoluteLocationPath();
    var27.endUnaryExpr(10);
    var27.number(1);
    var27.endPredicate();
    var27.endProcessingInstructionNodeStep();
    boolean var35 = var13.equals((java.lang.Object)var27);
    org.saxpath.conformance.ConformanceXPathHandler var36 = new org.saxpath.conformance.ConformanceXPathHandler();
    var36.startAbsoluteLocationPath();
    var36.endUnaryExpr(10);
    var36.startMultiplicativeExpr();
    var36.startAndExpr();
    boolean var42 = var27.equals((java.lang.Object)var36);
    var36.startUnaryExpr();
    var36.endPathExpr();
    java.lang.String var45 = var36.toString();
    var36.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startAdditiveExpr()\n(8) endRelationalExpr(0)\n(9) startCommentNodeStep(1)\n");
    var36.startAdditiveExpr();
    var36.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startAndExpr()\n(4) startUnaryExpr()\n(5) endPathExpr()\n"+ "'", var45.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startAndExpr()\n(4) startUnaryExpr()\n(5) endPathExpr()\n"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test320");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.startAllNodeStep(0);
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    var0.endAdditiveExpr(0);
    var0.startAllNodeStep(10);
    var0.endFilterExpr();

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test321");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var8 = new org.saxpath.helpers.DefaultXPathHandler();
    var8.number(10.0d);
    var8.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.startUnionExpr();
    var8.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    org.saxpath.conformance.ConformanceXPathHandler var17 = new org.saxpath.conformance.ConformanceXPathHandler();
    var17.startAbsoluteLocationPath();
    var17.endUnaryExpr(10);
    var17.number(1);
    boolean var24 = var17.equals((java.lang.Object)10L);
    var17.startCommentNodeStep(100);
    var17.startUnionExpr();
    var17.endTextNodeStep();
    var17.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var17);
    org.saxpath.conformance.ConformanceXPathHandler var31 = new org.saxpath.conformance.ConformanceXPathHandler();
    var31.startAbsoluteLocationPath();
    var31.endAndExpr(true);
    var31.endPathExpr();
    var31.endTextNodeStep();
    var31.startUnaryExpr();
    var31.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    var31.startXPath();
    var31.endAllNodeStep();
    var31.startPathExpr();
    var31.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    var31.startAllNodeStep(10);
    var31.endPathExpr();
    var31.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test322");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startAllNodeStep((-1));
    var0.startProcessingInstructionNodeStep(10, "hi!");
    var0.endEqualityExpr((-1));
    var0.endMultiplicativeExpr((-1));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test323");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.endTextNodeStep();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startUnaryExpr();

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test324");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endRelationalExpr(1);
    var0.startXPath();
    var0.endAndExpr(true);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test325");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endMultiplicativeExpr(0);
    var0.startUnaryExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^");
    var0.number((-1.0d));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test326");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.startNameStep((-1), "hi!", "hi!");
    var14.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var14);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    org.saxpath.conformance.ConformanceXPathHandler var23 = new org.saxpath.conformance.ConformanceXPathHandler();
    var23.startAbsoluteLocationPath();
    var23.endPathExpr();
    var23.startUnionExpr();
    var23.endRelationalExpr(10);
    var23.endPathExpr();
    var23.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var23);
    var23.endPathExpr();
    var23.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test327");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.startTextNodeStep(0);
    var0.startAndExpr();
    var0.endRelationalExpr(100);
    var0.startProcessingInstructionNodeStep(10, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n");
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startAllNodeStep((-1));
    var0.endAllNodeStep();

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test328");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.endAllNodeStep();
    var11.endAllNodeStep();
    var11.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    boolean var21 = var16.equals((java.lang.Object)'a');
    java.lang.String var22 = var16.toString();
    var16.startXPath();
    var16.startPathExpr();
    var16.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var16.startXPath();
    var16.endAndExpr(true);
    var16.endFilterExpr();
    var16.endCommentNodeStep();
    var16.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathParseException: ");
    var16.startAllNodeStep(10);
    var16.endUnaryExpr((-1));
    var16.endMultiplicativeExpr((-1));
    var16.startAllNodeStep(10);
    var16.startAllNodeStep(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var16);
    var16.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test329");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var5 = new org.saxpath.conformance.ConformanceXPathHandler();
    var5.startAbsoluteLocationPath();
    var5.endAndExpr(true);
    boolean var10 = var5.equals((java.lang.Object)'a');
    var5.startAbsoluteLocationPath();
    var5.endMultiplicativeExpr((-1));
    var5.startProcessingInstructionNodeStep(1, " ^");
    var5.startFilterExpr();
    var5.endRelationalExpr(100);
    var5.startEqualityExpr();
    var5.endXPath();
    var5.endFunction();
    boolean var23 = var0.equals((java.lang.Object)var5);
    var0.startAdditiveExpr();
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test330");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endUnaryExpr(1);
    var1.startEqualityExpr();
    var1.endAllNodeStep();
    var1.endFilterExpr();
    var1.endUnionExpr(true);
    var1.startAdditiveExpr();
    var1.endUnionExpr(false);
    var1.startAdditiveExpr();

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test331");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var8.endNameStep();
    var8.startNameStep(100, "\n ^\n ^", "com.werken.saxpath.XPathSyntaxException: 1: ");
    var8.startAdditiveExpr();
    var8.startAllNodeStep(100);
    var8.endMultiplicativeExpr(1);
    var8.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test332");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var5 = new org.saxpath.conformance.ConformanceXPathHandler();
    var5.startAbsoluteLocationPath();
    var5.endUnaryExpr(10);
    var5.number(1);
    var5.startAllNodeStep((-1));
    var5.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endAndExpr(true);
    var14.startUnionExpr();
    boolean var19 = var5.equals((java.lang.Object)var14);
    var14.endAdditiveExpr(0);
    var14.startRelativeLocationPath();
    var14.endXPath();
    var14.startCommentNodeStep((-1));
    var14.endTextNodeStep();
    boolean var27 = var0.equals((java.lang.Object)var14);
    var14.startFilterExpr();
    var14.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var14.endAndExpr(true);
    var14.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var14.startMultiplicativeExpr();
    var14.endMultiplicativeExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test333");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.endUnaryExpr(0);
    var0.endMultiplicativeExpr(100);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test334");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var20.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.conformance.ConformanceXPathHandler var34 = new org.saxpath.conformance.ConformanceXPathHandler();
    var34.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var34.endEqualityExpr(1);
    org.saxpath.conformance.ConformanceXPathHandler var40 = new org.saxpath.conformance.ConformanceXPathHandler();
    var40.startAbsoluteLocationPath();
    var40.endUnaryExpr(10);
    var40.number(1);
    var40.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var40.startMultiplicativeExpr();
    var40.startFilterExpr();
    boolean var51 = var34.equals((java.lang.Object)var40);
    var40.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var40);
    org.saxpath.XPathHandler var54 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var55 = new org.saxpath.conformance.ConformanceXPathHandler();
    var55.startAbsoluteLocationPath();
    var55.endEqualityExpr((-1));
    var55.endTextNodeStep();
    var55.endCommentNodeStep();
    var55.endRelativeLocationPath();
    boolean var63 = var55.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var55.endMultiplicativeExpr((-1));
    var55.endNameStep();
    var55.endCommentNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var68 = new org.saxpath.conformance.ConformanceXPathHandler();
    var68.startAbsoluteLocationPath();
    var68.endAndExpr(true);
    var68.endPathExpr();
    var68.endTextNodeStep();
    var68.startUnaryExpr();
    var68.endUnionExpr(true);
    var68.startProcessingInstructionNodeStep(100, "hi!");
    boolean var80 = var55.equals((java.lang.Object)var68);
    var68.endPredicate();
    var68.startPathExpr();
    var68.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var68);
    com.werken.saxpath.XPathReader var85 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var86 = new org.saxpath.conformance.ConformanceXPathHandler();
    var86.startAbsoluteLocationPath();
    var86.endTextNodeStep();
    var86.endUnionExpr(true);
    var85.setXPathHandler((org.saxpath.XPathHandler)var86);
    var86.endMultiplicativeExpr(10);
    var86.startAllNodeStep(10);
    var86.endPathExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var86);
    var86.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test335");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var20.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    org.saxpath.helpers.DefaultXPathHandler var36 = new org.saxpath.helpers.DefaultXPathHandler();
    var36.number(10.0d);
    var36.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var36.endPredicate();
    var36.endNameStep();
    var36.endTextNodeStep();
    var36.startPathExpr();
    var36.startAllNodeStep(0);
    var36.startMultiplicativeExpr();
    var36.endAdditiveExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
    org.saxpath.XPathHandler var52 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var53 = new org.saxpath.conformance.ConformanceXPathHandler();
    var53.startAbsoluteLocationPath();
    var53.endUnaryExpr(10);
    var53.startMultiplicativeExpr();
    var53.startMultiplicativeExpr();
    var53.endPredicate();
    var53.endNameStep();
    var53.endUnaryExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test336");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startUnaryExpr();
    var0.startFunction("                                                                                                    ^", "^");
    var0.startTextNodeStep(1);
    var0.startAndExpr();
    var0.endAbsoluteLocationPath();
    var0.number((-1));
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n(8) startTextNodeStep(1)\n");

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test337");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test338");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endUnaryExpr(10);
    var0.endOrExpr(true);
    var0.endRelationalExpr(100);
    var0.startAdditiveExpr();

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test339");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.startUnionExpr();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.startAbsoluteLocationPath();
    var8.endUnaryExpr(10);
    var8.number(1);
    boolean var15 = var8.equals((java.lang.Object)10L);
    var8.startCommentNodeStep(100);
    var8.startUnionExpr();
    var8.endTextNodeStep();
    var8.startFilterExpr();
    boolean var21 = var0.equals((java.lang.Object)var8);
    var8.startCommentNodeStep(10);
    org.saxpath.XPathSyntaxException var27 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", 10, "^");
    boolean var28 = var8.equals((java.lang.Object)10);
    var8.endEqualityExpr(10);
    var8.startAbsoluteLocationPath();
    var8.endMultiplicativeExpr(1);
    var8.startMultiplicativeExpr();
    var8.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test340");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.endEqualityExpr(1);
    var0.startCommentNodeStep(0);
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.number(1.0d);
    var0.startTextNodeStep(10);
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.endPathExpr();
    var20.endUnionExpr(false);
    var20.startNameStep(0, "", "");
    var20.variableReference("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n");
    var20.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var20.endAbsoluteLocationPath();
    var20.startUnionExpr();
    boolean var38 = var0.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test341");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.startXPath();
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test342");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.startOrExpr();
    var0.startAllNodeStep((-1));
    var0.endFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endFilterExpr();
    var0.endOrExpr(false);
    var0.startFilterExpr();

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test343");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.endAdditiveExpr((-1));
    var0.startCommentNodeStep(100);
    var0.startOrExpr();
    var0.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) endNameStep()\n(5) startFilterExpr()\n(6) endTextNodeStep()\n");

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test344");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.startCommentNodeStep(100);
    var0.endTextNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n");

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test345");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.endPredicate();

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test346");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(1);
    var0.endXPath();
    var0.endAbsoluteLocationPath();
    var0.startAndExpr();

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test347");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endAllNodeStep();
    var0.endUnionExpr(true);
    java.lang.String var11 = var0.toString();
    var0.startAndExpr();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) endAllNodeStep()\n(1) endAbsoluteLocationPath()\n(2) startXPath()\n(3) endFilterExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(5) endAllNodeStep()\n(6) endUnionExpr(true)\n"+ "'", var11.equals("(0) endAllNodeStep()\n(1) endAbsoluteLocationPath()\n(2) startXPath()\n(3) endFilterExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(5) endAllNodeStep()\n(6) endUnionExpr(true)\n"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test348");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startMultiplicativeExpr();
    var0.number(1.0d);
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.endRelationalExpr(1);
    var0.endFunction();
    var0.endUnionExpr(false);
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test349");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.startFilterExpr();
    var0.endUnaryExpr((-1));
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test350");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();
    var0.startAllNodeStep((-1));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n(9) endNameStep()\n(10) endAdditiveExpr(10)\n(11) startUnaryExpr()\n(12) startRelativeLocationPath()\n(13) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) startProcessingInstructionNodeStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(8) endOrExpr(true)\n(9) endFilterExpr()\n(10) startTextNodeStep(10)\n(11) endXPath()\n(12) startAndExpr()\n(13) startAbsoluteLocationPath()\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) startFilterExpr()\n(7) literal(\"child\")\n(8) startUnaryExpr()\n(9) endRelationalExpr(-1)\n(10) endAndExpr(false)\n(11) endOrExpr(false)\n", "hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test351");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endPathExpr();
    var0.startTextNodeStep(10);
    var0.endRelationalExpr(1);
    var0.startFilterExpr();
    var0.endRelationalExpr(1);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test352");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endAllNodeStep();
    var0.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endAndExpr(true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test353");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.startTextNodeStep(10);
    var0.startOrExpr();

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test354");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var0.startUnionExpr();
    var0.endRelativeLocationPath();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test355");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startProcessingInstructionNodeStep(100, "hi!");
    var0.startXPath();
    var0.endEqualityExpr((-1));
    var0.endMultiplicativeExpr((-1));
    java.lang.String var17 = var0.toString();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startXPath()\n(8) endEqualityExpr(-1)\n(9) endMultiplicativeExpr(-1)\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startXPath()\n(8) endEqualityExpr(-1)\n(9) endMultiplicativeExpr(-1)\n"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test356");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.startPathExpr();

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test357");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startAllNodeStep(0);
    var0.startPredicate();
    var0.endAbsoluteLocationPath();
    var0.number((-1));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test358");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startAbsoluteLocationPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n");
    var0.startTextNodeStep(100);
    var0.endAndExpr(false);
    var0.endFunction();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) number(100.0)\n(7) endAllNodeStep()\n");

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test359");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    java.lang.String var11 = var0.toString();
    var0.endAndExpr(true);
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.endFilterExpr();
    var0.startPredicate();
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test360");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endAdditiveExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startXPath();
    var0.endUnaryExpr(0);
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.endPredicate();

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test361");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.startFilterExpr();
    var0.endPredicate();
    var0.startPathExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.endEqualityExpr((-1));
    var0.startEqualityExpr();
    var0.endAbsoluteLocationPath();
    var0.number((-1));
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test362");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.startUnionExpr();
    var0.startAdditiveExpr();
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.endNameStep();
    var0.startPathExpr();
    var0.startAllNodeStep((-1));
    var0.startUnaryExpr();

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test363");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startRelativeLocationPath();
    var7.variableReference("org.saxpath.SAXPathException:  ^", "com.werken.saxpath.XPathSyntaxException: 1: ");
    var7.startUnionExpr();
    var7.endFunction();
    var7.endTextNodeStep();
    var7.endUnaryExpr(1);
    var7.startEqualityExpr();
    var7.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var7.endAdditiveExpr(1);
    var7.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test364");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endEqualityExpr((-1));
    var0.number(1.0d);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test365");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endFunction();
    var0.endCommentNodeStep();

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test366");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endUnaryExpr(10);
    var0.number(0.0d);
    boolean var17 = var0.equals((java.lang.Object)"^");
    var0.endXPath();
    java.lang.String var19 = var0.toString();
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) number(0.0)\n(8) endXPath()\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) number(0.0)\n(8) endXPath()\n"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test367");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.startTextNodeStep(0);
    var0.endPathExpr();
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test368");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.number(10);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test369");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.startOrExpr();
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startAllNodeStep(100);
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.endAllNodeStep();
    var0.startTextNodeStep((-1));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test370");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.number(10.0d);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n");
    var0.endRelativeLocationPath();
    var0.startEqualityExpr();

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test371");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.number(1.0d);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    var0.startOrExpr();
    var0.endFilterExpr();
    var0.endRelationalExpr((-1));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test372");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", (-1), "org.saxpath.SAXPathException: ^");
    java.lang.String var4 = var3.getXPath();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var9 = var8.getPositionMarker();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var8);
    java.lang.String var11 = var8.toString();
    int var12 = var8.getPosition();
    int var13 = var8.getPosition();
    java.lang.String var14 = var8.getXPath();
    java.lang.String var15 = var8.toString();
    java.lang.String var16 = var8.getPositionMarker();
    java.lang.String var17 = var8.getMultilineMessage();
    java.lang.String var18 = var8.toString();
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var20 = var8.toString();
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "\n ^\n ^"+ "'", var17.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var20.equals("com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test373");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(10);
    var0.number(10.0d);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endPathExpr();
    var0.endAdditiveExpr(100);
    var0.startUnionExpr();
    var0.endPredicate();
    var0.endPredicate();

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test374");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.endRelativeLocationPath();
    var0.startRelationalExpr();
    var0.startAndExpr();

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test375");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startEqualityExpr();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test376");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(0);
    var0.startPathExpr();
    var0.startTextNodeStep(10);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.startAllNodeStep((-1));
    var0.number((-1.0d));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test377");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endEqualityExpr((-1));
    var0.number(100.0d);
    var0.endAndExpr(true);
    var0.startTextNodeStep(100);
    var0.startOrExpr();
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endPredicate();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test378");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.number(1.0d);
    var0.endCommentNodeStep();
    var0.startUnionExpr();
    var0.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\n(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n^");
    var0.startAndExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) endRelativeLocationPath()\n(5) startAndExpr()\n(6) variableReference(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n\n          ^");

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test379");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.endUnionExpr(false);
    var0.startAdditiveExpr();

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test380");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.startUnionExpr();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.startAbsoluteLocationPath();
    var8.endUnaryExpr(10);
    var8.number(1);
    boolean var15 = var8.equals((java.lang.Object)10L);
    var8.startCommentNodeStep(100);
    var8.startUnionExpr();
    var8.endTextNodeStep();
    var8.startFilterExpr();
    boolean var21 = var0.equals((java.lang.Object)var8);
    var8.endAndExpr(false);
    var8.endPathExpr();
    var8.startOrExpr();
    var8.startFilterExpr();
    java.lang.String var27 = var8.toString();
    var8.startAndExpr();
    var8.endUnaryExpr(0);
    var8.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test381");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.startPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startTextNodeStep(10);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test382");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startPathExpr();
    var0.startUnionExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^", "                                                                                                    ^");
    var0.endXPath();

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test383");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endNameStep();
    var0.number(1);
    var0.endMultiplicativeExpr(100);
    var0.startRelationalExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startRelativeLocationPath()\n(6) endAllNodeStep()\n(7) startAllNodeStep(1)\n");
    var0.startCommentNodeStep(100);
    var0.startAndExpr();
    var0.endMultiplicativeExpr(0);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test384");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startXPath();
    var0.startRelativeLocationPath();
    var0.endAndExpr(true);
    var0.endAndExpr(true);
    var0.startPredicate();
    var0.endEqualityExpr((-1));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test385");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startPredicate();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n(5) endPredicate()\n(6) startRelativeLocationPath()\n(7) startMultiplicativeExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(1)\n(6) startEqualityExpr()\n(7) endPredicate()\n(8) startMultiplicativeExpr()\n");
    var0.startTextNodeStep((-1));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test386");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("org.saxpath.SAXPathException: ");
    org.saxpath.helpers.DefaultXPathHandler var13 = new org.saxpath.helpers.DefaultXPathHandler();
    var13.number(10.0d);
    var13.startCommentNodeStep(10);
    var13.endFunction();
    var13.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var13.endFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var13);
    org.saxpath.helpers.DefaultXPathHandler var25 = new org.saxpath.helpers.DefaultXPathHandler();
    var25.number(10.0d);
    var25.endRelativeLocationPath();
    var25.startRelativeLocationPath();
    var25.endFilterExpr();
    var25.endAdditiveExpr(100);
    var25.endRelationalExpr((-1));
    var25.endProcessingInstructionNodeStep();
    var25.endXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var25);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n                                                                                                    ^");
    org.saxpath.helpers.DefaultXPathHandler var40 = new org.saxpath.helpers.DefaultXPathHandler();
    var40.number(10.0d);
    var40.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var40.startAdditiveExpr();
    var40.endXPath();
    var40.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var40.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var40.endXPath();
    var40.startPredicate();
    var0.setXPathHandler((org.saxpath.XPathHandler)var40);
    org.saxpath.XPathHandler var56 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var57 = new org.saxpath.helpers.DefaultXPathHandler();
    var57.number(10.0d);
    var57.endPathExpr();
    var57.endUnionExpr(false);
    var57.endEqualityExpr(1);
    var57.endXPath();
    var57.endMultiplicativeExpr(0);
    var57.startXPath();
    var57.endPredicate();
    var57.number((-1));
    var57.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var57);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test387");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.endAndExpr(true);
    java.lang.String var16 = var0.toString();
    var0.endPredicate();
    var0.literal("hi!");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startFunction(\" ^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(3) variableReference(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:child\")\n(4) number(0.0)\n(5) endEqualityExpr(100)\n(6) endUnaryExpr(0)\n(7) endFilterExpr()\n(8) endRelativeLocationPath()\n(9) endFilterExpr()\n");
    var0.literal("org.saxpath.SAXPathParseException: (0) endAllNodeStep()\n(1) endAbsoluteLocationPath()\n(2) startXPath()\n(3) endFilterExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(5) endAllNodeStep()\n(6) endUnionExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test388");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAndExpr();
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.endUnaryExpr(0);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) endAdditiveExpr(-1)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) endCommentNodeStep()\n(7) number(10)\n(8) endPathExpr()\n(9) endProcessingInstructionNodeStep()\n(10) startAdditiveExpr()\n(11) startUnaryExpr()\n(12) startAdditiveExpr()\n(13) number(1.0)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var0.endFilterExpr();
    var0.startNameStep(0, "org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n");

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test389");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startPathExpr();
    var0.startUnionExpr();

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test390");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startOrExpr();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test391");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endXPath();

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test392");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.endFilterExpr();
    var0.startCommentNodeStep(0);
    var0.startEqualityExpr();
    var0.startAllNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.startXPath();

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test393");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.endCommentNodeStep();
    var0.endFunction();
    var0.endPathExpr();
    var0.literal("");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n", " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startEqualityExpr();

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test394");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startRelativeLocationPath();
    var0.startUnionExpr();
    var0.startPathExpr();

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test395");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("namespace", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "child\norg.saxpath.SAXPathException:  ^\n^");
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(1);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test396");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", 100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "                                                                                                    ^"+ "'", var5.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "                                                                                                    ^"+ "'", var6.equals("                                                                                                    ^"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test397");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.variableReference("org.saxpath.SAXPathParseException: ", "org.saxpath.SAXPathException:  ^");
    var0.endEqualityExpr(100);
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endTextNodeStep();
    var15.endAdditiveExpr(1);
    java.lang.String var20 = var15.toString();
    boolean var21 = var0.equals((java.lang.Object)var15);
    var0.startTextNodeStep((-1));
    var0.startPredicate();
    var0.startTextNodeStep(1);
    var0.startEqualityExpr();
    var0.endXPath();
    var0.variableReference("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n\n          ^");
    var0.startXPath();
    var0.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test398");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endRelationalExpr(0);
    var0.startFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) startMultiplicativeExpr()\n(9) startAndExpr()\n(10) startFilterExpr()\n");
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test399");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var9 = var8.getMultilineMessage();
    int var10 = var8.getPosition();
    org.saxpath.SAXPathParseException var12 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var14 = var8.getXPath();
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.Throwable[] var16 = var3.getSuppressed();
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var18 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\n ^\n ^"+ "'", var9.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "                                                                                                    ^"+ "'", var18.equals("                                                                                                    ^"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test400");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startNameStep(0, " ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startEqualityExpr();
    var0.startPredicate();
    var0.endAllNodeStep();
    var0.number((-1));
    var0.endUnionExpr(true);
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n");
    var0.startOrExpr();

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test401");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endFunction();
    var0.startTextNodeStep(1);
    var0.endFilterExpr();
    var0.startEqualityExpr();

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test402");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startFilterExpr();
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathParseException: ");
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startFunction(\" ^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(3) variableReference(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:child\")\n(4) number(0.0)\n(5) endEqualityExpr(100)\n(6) endUnaryExpr(0)\n(7) endFilterExpr()\n(8) endRelativeLocationPath()\n(9) endFilterExpr()\n");
    var0.endRelationalExpr((-1));
    var0.endFunction();

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test403");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", (-1), "hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test404");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.endPredicate();
    var0.endNameStep();

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test405");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.endCommentNodeStep();
    var0.startUnionExpr();
    var0.endAndExpr(true);
    var0.endOrExpr(false);
    var0.endAbsoluteLocationPath();
    var0.literal("");

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test406");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var20.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    org.saxpath.helpers.DefaultXPathHandler var36 = new org.saxpath.helpers.DefaultXPathHandler();
    var36.number(10.0d);
    var36.endRelativeLocationPath();
    var36.startRelativeLocationPath();
    var36.endFilterExpr();
    var36.endAdditiveExpr(100);
    var36.endRelationalExpr((-1));
    var36.endFunction();
    var36.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", " ^");
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
    var36.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test407");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startEqualityExpr();
    var1.startUnaryExpr();
    var1.startXPath();
    var1.startAndExpr();
    var1.endTextNodeStep();
    var1.startAbsoluteLocationPath();
    var1.endMultiplicativeExpr(0);
    var1.startMultiplicativeExpr();
    var1.endAndExpr(false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test408");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.conformance.ConformanceXPathHandler var7 = new org.saxpath.conformance.ConformanceXPathHandler();
    var7.endAllNodeStep();
    var7.endAllNodeStep();
    var7.startFilterExpr();
    var7.endAdditiveExpr(0);
    var7.endAdditiveExpr(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var7);
    var7.endCommentNodeStep();
    var7.endAllNodeStep();
    var7.startUnionExpr();
    var7.startFilterExpr();
    var7.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) endNameStep()\n(8) endMultiplicativeExpr(1)\n", "(0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) endAdditiveExpr(1)\n(2) startMultiplicativeExpr()\n(3) endTextNodeStep()\n(4) number(0.0)\n");

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test409");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.endPathExpr();
    var0.startAllNodeStep(1);
    var0.endTextNodeStep();
    var0.endPathExpr();

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test410");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep(100);
    var0.startOrExpr();
    var0.startXPath();
    var0.endXPath();

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test411");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(10);
    var0.startRelativeLocationPath();

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test412");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endMultiplicativeExpr(10);
    var0.endPredicate();
    var0.endCommentNodeStep();
    var0.startAllNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test413");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n", (-1), "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "^"+ "'", var4.equals("^"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test414");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();
    var0.startPredicate();
    var0.endRelationalExpr(10);
    var0.startUnionExpr();
    var0.startMultiplicativeExpr();

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test415");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: ", 1, "com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.String var4 = var3.toString();
    int var5 = var3.getPosition();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: \norg.saxpath.SAXPathParseException: \n ^"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: \norg.saxpath.SAXPathParseException: \n ^"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test416");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test417");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.endPredicate();
    java.lang.String var13 = var0.toString();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.endAllNodeStep();
    var0.startRelationalExpr();
    var0.number(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test418");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.literal("child");
    var0.startMultiplicativeExpr();
    var0.startXPath();
    var0.startPredicate();
    var0.endRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startUnionExpr()\n(6) startXPath()\n(7) startPathExpr()\n(8) endUnionExpr(true)\n(9) startXPath()\n(10) endUnaryExpr(-1)\n");

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test419");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.endUnionExpr(false);
    var0.endRelativeLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.startOrExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    var0.number(10.0d);
    var0.startAllNodeStep(0);
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n");

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test420");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startRelativeLocationPath();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: -1: child", "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test421");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.endRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.startAndExpr();
    var0.variableReference("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n");
    var0.startNameStep(100, " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^");
    var0.startAndExpr();
    var0.startPredicate();
    var0.startAndExpr();

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test422");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", (-1), "org.saxpath.SAXPathException: ^");
    java.lang.String var4 = var3.getXPath();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var9 = var8.getPositionMarker();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var8);
    java.lang.String var11 = var8.toString();
    int var12 = var8.getPosition();
    int var13 = var8.getPosition();
    java.lang.String var14 = var8.getXPath();
    java.lang.String var15 = var8.toString();
    java.lang.String var16 = var8.getPositionMarker();
    java.lang.String var17 = var8.getMultilineMessage();
    java.lang.String var18 = var8.toString();
    var3.addSuppressed((java.lang.Throwable)var8);
    int var20 = var8.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "\n ^\n ^"+ "'", var17.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test423");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var8.startRelativeLocationPath();
    var8.startOrExpr();
    var8.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test424");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.startAdditiveExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n", "org.saxpath.SAXPathParseException: ");
    var0.literal("");
    var0.endFunction();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.endPathExpr();
    var20.endUnionExpr(false);
    var20.endEqualityExpr(1);
    var20.endFilterExpr();
    var20.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n");
    var20.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var20.endPathExpr();
    var20.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) startProcessingInstructionNodeStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(8) endOrExpr(true)\n(9) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startUnaryExpr()\n(3) endFunction()\n");
    boolean var40 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startUnaryExpr()\n(3) endFunction()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test425");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.endFilterExpr();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test426");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.number(100);
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n(9) endNameStep()\n(10) endAdditiveExpr(10)\n(11) startUnaryExpr()\n(12) startRelativeLocationPath()\n(13) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(8) endEqualityExpr(0)\n(9) endProcessingInstructionNodeStep()\n(10) startMultiplicativeExpr()\n(11) startPredicate()\n(12) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startUnionExpr()\n(6) endPredicate()\n(7) endUnionExpr(false)\n(8) endTextNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\")\n");

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test427");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("");
    var3.addSuppressed((java.lang.Throwable)var9);
    int var11 = var3.getPosition();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var16 = var15.getXPath();
    int var17 = var15.getPosition();
    int var18 = var15.getPosition();
    int var19 = var15.getPosition();
    int var20 = var15.getPosition();
    org.saxpath.XPathSyntaxException var24 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var25 = var24.getPositionMarker();
    java.lang.String var26 = var24.toString();
    org.saxpath.SAXPathException var27 = new org.saxpath.SAXPathException((java.lang.Throwable)var24);
    java.lang.String var28 = var24.getMultilineMessage();
    java.lang.String var29 = var24.getMultilineMessage();
    java.lang.String var30 = var24.toString();
    org.saxpath.SAXPathException var31 = new org.saxpath.SAXPathException((java.lang.Throwable)var24);
    var15.addSuppressed((java.lang.Throwable)var24);
    var3.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var34 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + " ^"+ "'", var25.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var28.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var34.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test428");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.endNameStep();
    var0.startEqualityExpr();
    var0.startRelationalExpr();

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test429");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    var0.startTextNodeStep(100);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test430");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.startRelationalExpr();
    var0.endFunction();
    var0.startXPath();
    var0.startFilterExpr();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr(10);
    var0.startAdditiveExpr();

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test431");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getXPath();
    java.lang.Throwable[] var9 = var3.getSuppressed();
    java.lang.String var10 = var3.toString();
    org.saxpath.SAXPathException var11 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test432");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.startUnionExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startPathExpr();

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test433");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startTextNodeStep(10);
    var0.startTextNodeStep(1);
    var0.number(1);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test434");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endUnionExpr(true)\n(3) startFilterExpr()\n(4) startAdditiveExpr()\n", 10, "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n          ^");

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test435");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endRelationalExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.endAbsoluteLocationPath();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test436");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endUnaryExpr(10);
    var10.startMultiplicativeExpr();
    var10.startEqualityExpr();
    var10.startAdditiveExpr();
    var10.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var20.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.helpers.DefaultXPathHandler var34 = new org.saxpath.helpers.DefaultXPathHandler();
    var34.number(10.0d);
    var34.endRelativeLocationPath();
    var34.number(10);
    var34.endRelativeLocationPath();
    var34.number(10);
    var34.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var34);
    org.saxpath.conformance.ConformanceXPathHandler var45 = new org.saxpath.conformance.ConformanceXPathHandler();
    var45.startAbsoluteLocationPath();
    var45.endEqualityExpr((-1));
    var45.endTextNodeStep();
    var45.endAdditiveExpr(1);
    var45.endAndExpr(false);
    var45.endUnaryExpr(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    org.saxpath.helpers.DefaultXPathHandler var57 = new org.saxpath.helpers.DefaultXPathHandler();
    var57.number(10.0d);
    var57.endRelativeLocationPath();
    var57.startRelativeLocationPath();
    var57.number(0.0d);
    var57.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var57);
    org.saxpath.helpers.DefaultXPathHandler var66 = new org.saxpath.helpers.DefaultXPathHandler();
    var66.startNameStep((-1), "hi!", "hi!");
    var66.startFilterExpr();
    var66.startUnaryExpr();
    var66.endProcessingInstructionNodeStep();
    var66.endCommentNodeStep();
    var66.endCommentNodeStep();
    var66.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("org.saxpath.SAXPathParseException: \nhi!\n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test437");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startEqualityExpr();
    var0.startEqualityExpr();

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test438");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.number(10);
    var0.startAndExpr();
    var0.startFilterExpr();
    var0.endPathExpr();

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test439");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getXPath();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: child", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    java.lang.String var12 = var11.getXPath();
    java.lang.String var13 = var11.getXPath();
    java.lang.String var14 = var11.getXPath();
    var3.addSuppressed((java.lang.Throwable)var11);
    int var16 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test440");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startMultiplicativeExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) startProcessingInstructionNodeStep(0, \"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n", "^\norg.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\n ^");
    var0.endAllNodeStep();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) endRelativeLocationPath()\n(7) endFunction()\n(8) endTextNodeStep()\n");

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test441");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    org.saxpath.conformance.ConformanceXPathHandler var3 = new org.saxpath.conformance.ConformanceXPathHandler();
    var3.startAbsoluteLocationPath();
    var3.endEqualityExpr((-1));
    var3.endTextNodeStep();
    var3.startAllNodeStep(0);
    var3.endOrExpr(false);
    boolean var12 = var0.equals((java.lang.Object)var3);
    var0.startUnionExpr();
    var0.endAllNodeStep();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) endMultiplicativeExpr(1)\n(7) endOrExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) startAndExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test442");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endPredicate();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep((-1), "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test443");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endMultiplicativeExpr(10);
    var0.startRelativeLocationPath();
    var0.startRelationalExpr();
    var0.startTextNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test444");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.endRelationalExpr(0);
    var0.endPredicate();
    var0.startOrExpr();
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();
    java.lang.String var18 = var0.toString();
    var0.startEqualityExpr();
    var0.endEqualityExpr(10);
    var0.endRelationalExpr(100);
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n"));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test445");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var0.startXPath();
    var0.startXPath();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test446");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startEqualityExpr();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startRelativeLocationPath();
    var14.endOrExpr(false);
    var14.startUnaryExpr();
    var14.startMultiplicativeExpr();
    var14.endPredicate();
    boolean var21 = var0.equals((java.lang.Object)var14);
    var0.startCommentNodeStep(100);
    var0.startMultiplicativeExpr();
    var0.endTextNodeStep();
    var0.startRelativeLocationPath();
    com.werken.saxpath.XPathReader var27 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var28 = new org.saxpath.conformance.ConformanceXPathHandler();
    var28.startAbsoluteLocationPath();
    var28.endUnaryExpr(10);
    var28.number(1);
    var28.startAllNodeStep((-1));
    var28.startOrExpr();
    var27.setXPathHandler((org.saxpath.XPathHandler)var28);
    var28.endOrExpr(false);
    var28.startAllNodeStep(0);
    var28.startEqualityExpr();
    var28.endAndExpr(false);
    var28.endEqualityExpr((-1));
    boolean var47 = var0.equals((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test447");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.endUnaryExpr(100);
    var0.endTextNodeStep();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startAndExpr();
    var0.startAndExpr();
    var0.endXPath();
    var0.startEqualityExpr();
    var0.endCommentNodeStep();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test448");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.endPathExpr();
    var0.startAllNodeStep(1);
    var0.number(0.0d);
    var0.endFilterExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep(10);
    var0.startAdditiveExpr();

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test449");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startXPath();
    var0.startCommentNodeStep(0);
    var0.endRelationalExpr((-1));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test450");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endAdditiveExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startXPath();
    var0.startFilterExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^");
    var0.endAdditiveExpr(100);
    var0.startAllNodeStep(1);
    org.saxpath.conformance.ConformanceXPathHandler var22 = new org.saxpath.conformance.ConformanceXPathHandler();
    var22.startAbsoluteLocationPath();
    var22.endEqualityExpr((-1));
    var22.endTextNodeStep();
    var22.startAllNodeStep(0);
    var22.startAbsoluteLocationPath();
    var22.startRelativeLocationPath();
    var22.startEqualityExpr();
    var22.startEqualityExpr();
    var22.endProcessingInstructionNodeStep();
    boolean var34 = var0.equals((java.lang.Object)var22);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test451");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.endXPath();
    var0.endAndExpr(false);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.startMultiplicativeExpr();
    var0.startAllNodeStep(10);
    var0.startTextNodeStep(0);
    var0.endOrExpr(false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test452");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.getPositionMarker();
    java.lang.String var9 = var3.getPositionMarker();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.String var12 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test453");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(1);
    var0.startOrExpr();
    var0.startRelativeLocationPath();

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test454");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.endFunction();
    var0.endUnaryExpr(100);
    var0.endCommentNodeStep();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test455");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) startCommentNodeStep(-1)\n(7) startRelativeLocationPath()\n(8) startAdditiveExpr()\n(9) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(10) endProcessingInstructionNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startPathExpr()\n\n ^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test456");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();
    var0.startPredicate();
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(1);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test457");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(100, "hi!");
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(0);
    var0.endProcessingInstructionNodeStep();
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test458");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endAdditiveExpr(100);
    boolean var15 = var0.equals((java.lang.Object)var7);
    var7.startRelativeLocationPath();
    var7.literal("hi!");
    var7.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "org.saxpath.SAXPathException: ");
    var7.startUnaryExpr();
    var7.endFilterExpr();
    var7.startCommentNodeStep(0);
    var7.endPredicate();
    var7.startXPath();
    var7.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test459");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endFilterExpr();
    var0.startCommentNodeStep(0);
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test460");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.number(100.0d);
    var0.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endAndExpr(true);
    boolean var20 = var15.equals((java.lang.Object)'a');
    var15.startAbsoluteLocationPath();
    var15.startRelativeLocationPath();
    var15.endRelationalExpr(10);
    var15.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var15.startCommentNodeStep((-1));
    boolean var30 = var0.equals((java.lang.Object)(-1));
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endOrExpr(true);
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.endRelationalExpr((-1));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) endAbsoluteLocationPath()\n(3) endEqualityExpr(100)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\")\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n");
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test461");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endNameStep();
    var0.endPathExpr();

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test462");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var0.parse("org.saxpath.SAXPathException:  ^");
    org.saxpath.helpers.DefaultXPathHandler var16 = new org.saxpath.helpers.DefaultXPathHandler();
    var16.endXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var16);
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endNameStep();
    var19.endAbsoluteLocationPath();
    var19.startNameStep(10, "child", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var19.endAdditiveExpr(1);
    var19.startCommentNodeStep((-1));
    var19.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var19);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endRelationalExpr(100)\n(7) endCommentNodeStep()\n(8) number(-1.0)\n(9) startRelativeLocationPath()\n(10) endAdditiveExpr(1)\n");
    org.saxpath.XPathHandler var36 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test463");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    org.saxpath.XPathHandler var9 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var10 = new org.saxpath.helpers.DefaultXPathHandler();
    var10.number(10.0d);
    var10.endRelativeLocationPath();
    var10.startRelativeLocationPath();
    var10.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var10.startTextNodeStep(1);
    var10.endAbsoluteLocationPath();
    var10.endUnaryExpr(0);
    var10.startFilterExpr();
    var10.endAdditiveExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    var10.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test464");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "                                                                                                    ^"+ "'", var5.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^"+ "'", var6.equals("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test465");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.number(100);
    var0.endAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endMultiplicativeExpr(100);
    var0.startEqualityExpr();

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test466");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startOrExpr();
    var0.endMultiplicativeExpr(0);
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test467");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("\n ^\n ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getPositionMarker();
    java.lang.String var7 = var5.toString();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.String var9 = var5.getMultilineMessage();
    java.lang.String var10 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var12 = var5.getXPath();
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var17 = var16.getPosition();
    int var18 = var16.getPosition();
    java.lang.String var19 = var16.getPositionMarker();
    var5.addSuppressed((java.lang.Throwable)var16);
    org.saxpath.XPathSyntaxException var24 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var25 = var24.getPositionMarker();
    java.lang.String var26 = var24.toString();
    org.saxpath.SAXPathException var27 = new org.saxpath.SAXPathException((java.lang.Throwable)var24);
    java.lang.String var28 = var24.getMultilineMessage();
    java.lang.String var29 = var24.getMultilineMessage();
    java.lang.String var30 = var24.toString();
    org.saxpath.SAXPathException var31 = new org.saxpath.SAXPathException((java.lang.Throwable)var24);
    java.lang.String var32 = var24.getXPath();
    java.lang.String var33 = var24.getXPath();
    java.lang.String var34 = var24.toString();
    java.lang.String var35 = var24.toString();
    java.lang.Throwable[] var36 = var24.getSuppressed();
    org.saxpath.SAXPathException var37 = new org.saxpath.SAXPathException((java.lang.Throwable)var24);
    java.lang.Throwable[] var38 = var24.getSuppressed();
    java.lang.String var39 = var24.getMultilineMessage();
    var16.addSuppressed((java.lang.Throwable)var24);
    java.lang.String var41 = var24.getPositionMarker();
    int var42 = var24.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "                                                                                                    ^"+ "'", var19.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + " ^"+ "'", var25.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var28.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var34.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var35.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var39.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + " ^"+ "'", var41.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test468");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.endUnaryExpr((-1));
    var8.endOrExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var8.endNameStep();
    var8.startNameStep(100, "\n ^\n ^", "com.werken.saxpath.XPathSyntaxException: 1: ");
    var8.startNameStep(100, "", "child\norg.saxpath.SAXPathException:  ^\n^");
    var8.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test469");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.endUnionExpr(true);
    var0.startCommentNodeStep(10);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startUnionExpr()\n(6) startXPath()\n(7) startPathExpr()\n(8) endUnionExpr(true)\n(9) startXPath()\n(10) endUnaryExpr(-1)\n");
    var0.endRelationalExpr(1);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test470");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endTextNodeStep();
    var0.endFilterExpr();
    var0.startRelationalExpr();

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test471");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1.0d));
    var0.startEqualityExpr();
    var0.endAdditiveExpr(100);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAdditiveExpr(0);
    var0.startPredicate();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test472");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.endAndExpr(true);
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.startAndExpr();
    var0.endAllNodeStep();
    var0.startOrExpr();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test473");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(100, "hi!");
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(0);
    var0.endProcessingInstructionNodeStep();
    var0.startMultiplicativeExpr();
    var0.startPredicate();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startUnionExpr()\n(6) endPredicate()\n(7) endUnionExpr(false)\n(8) endTextNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    java.lang.String var27 = var0.toString();
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(8) endEqualityExpr(0)\n(9) endProcessingInstructionNodeStep()\n(10) startMultiplicativeExpr()\n(11) startPredicate()\n(12) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startUnionExpr()\n(6) endPredicate()\n(7) endUnionExpr(false)\n(8) endTextNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\")\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(8) endEqualityExpr(0)\n(9) endProcessingInstructionNodeStep()\n(10) startMultiplicativeExpr()\n(11) startPredicate()\n(12) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startUnionExpr()\n(6) endPredicate()\n(7) endUnionExpr(false)\n(8) endTextNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\")\n"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test474");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.startOrExpr();
    var1.startUnaryExpr();
    var1.literal("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test475");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.endUnaryExpr(1);
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.number(10.0d);
    var14.endNameStep();
    var14.endAbsoluteLocationPath();
    boolean var19 = var0.equals((java.lang.Object)var14);
    var14.startAndExpr();
    var14.startFunction("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n");
    var14.startAndExpr();
    var14.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test476");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.number(10);
    var0.startXPath();
    var0.endFilterExpr();

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test477");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test478");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathParseException: ");
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");
    var0.startCommentNodeStep(100);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test479");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startXPath()\n(4) endAllNodeStep()\n(5) endRelationalExpr(1)\n(6) endAllNodeStep()\n");

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test480");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getXPath();
    java.lang.String var10 = var3.toString();
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    java.lang.String var15 = var14.toString();
    var3.addSuppressed((java.lang.Throwable)var14);
    java.lang.String var17 = var14.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var17.equals("org.saxpath.SAXPathParseException: \nhi!\n^"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test481");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.endEqualityExpr(1);
    var0.startUnionExpr();
    org.saxpath.helpers.DefaultXPathHandler var10 = new org.saxpath.helpers.DefaultXPathHandler();
    var10.number(10.0d);
    var10.startCommentNodeStep(0);
    var10.startOrExpr();
    var10.startAllNodeStep(0);
    boolean var18 = var0.equals((java.lang.Object)var10);
    var10.endMultiplicativeExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test482");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    java.lang.String var7 = var0.toString();
    var0.startPredicate();
    var0.endAndExpr(false);
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endAndExpr(true);
    boolean var16 = var11.equals((java.lang.Object)'a');
    var11.startAbsoluteLocationPath();
    var11.startRelativeLocationPath();
    var11.endRelationalExpr(10);
    var11.endAdditiveExpr(100);
    var11.startAllNodeStep(100);
    var11.endUnaryExpr(10);
    var11.startTextNodeStep(100);
    boolean var29 = var0.equals((java.lang.Object)var11);
    var0.startPredicate();
    var0.endTextNodeStep();
    var0.endFunction();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test483");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startMultiplicativeExpr()\n(5) startFilterExpr()\n(6) startPredicate()\n(7) endUnaryExpr(100)\n(8) number(1)\n", 10, " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test484");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endMultiplicativeExpr(10);
    var0.startPredicate();
    var0.endEqualityExpr(100);
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.number(1.0d);
    var0.startTextNodeStep((-1));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test485");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.endAdditiveExpr(100);
    var0.endEqualityExpr(0);
    var0.startTextNodeStep(10);
    var0.endAndExpr(false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test486");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startPathExpr();
    var0.endXPath();
    var0.startXPath();

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test487");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(true);
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.startOrExpr();

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test488");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathParseException var6 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    var3.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var9 = var3.getPositionMarker();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test489");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr((-1));
    var0.endOrExpr(false);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: ", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startFunction(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(4) endPathExpr()\n(5) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: :com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: ^\n          ^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test491");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endMultiplicativeExpr(10);
    var0.endPredicate();
    var0.number((-1));
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test492");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startXPath();
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test493");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endNameStep();
    var0.endOrExpr(true);
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.startMultiplicativeExpr();

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test494");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endFunction();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    java.lang.String var14 = var0.toString();
    var0.number((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAdditiveExpr(100)\n(7) startRelativeLocationPath()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAdditiveExpr(100)\n(7) startRelativeLocationPath()\n"));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test495");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.endOrExpr(false);
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.variableReference(" ^", "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^");
    var0.startPathExpr();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^");

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test496");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: child", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test497");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.endEqualityExpr(1);
    var0.startCommentNodeStep(0);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endUnaryExpr(0);
    var0.endPredicate();
    var0.endFunction();

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test498");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.endPredicate();
    var1.startMultiplicativeExpr();
    var1.endUnionExpr(false);
    var1.endEqualityExpr(0);
    var1.startAdditiveExpr();

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test499");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startEqualityExpr();
    var0.startPredicate();
    var0.endRelationalExpr(10);
    var0.number(0);
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr(1);
    var0.startRelativeLocationPath();

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest61.test500");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.endRelationalExpr((-1));
    var0.startTextNodeStep(100);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n");
    var0.endEqualityExpr(10);
    var0.startPathExpr();

  }

}
